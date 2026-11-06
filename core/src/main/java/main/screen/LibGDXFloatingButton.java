package main.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;

public class LibGDXFloatingButton {
    private float x, y;
    private final float buttonSize = 45;
    private boolean menuOpen;

    private final Array<Rectangle> menuItemBounds;

    private final int ICON_SIZE = 33;

    private Texture buttonTexture;
    private Texture playTexture;
    private Texture pauseTexture;
    private Texture settingsTexture;

    private final SpriteBatch batch;
    private final BitmapFont font;
    private final OrthographicCamera screenCamera;
    private final ShapeRenderer shapeRenderer;

    private final Rectangle settingsPanel;
    private final Rectangle closeButton;
    private final Rectangle autoCheckbox;
    private final OrthographicCamera mainCamera;

    private final Color backgroundColorLight = new Color(0.9f, 0.9f, 0.9f, 0.5f);
    private final Color backgroundColorDark = new Color(0.8f, 0.8f, 0.8f, 0.7f);
    private boolean isDragging = false;
    private boolean hasMoved = false;
    private Vector3 screenCoords = new Vector3();
    private final int NUM_MENU_ITEMS = 2;

    /**
     * Constructs a floating button
     *
     * @param x          Initial x position (screen space)
     * @param y          Initial y position (screen space)
     * @param mainCamera Camera từ MainTab
     */
    public LibGDXFloatingButton(float x, float y, OrthographicCamera mainCamera) {
        this.x = x;
        this.y = y;
        this.mainCamera = mainCamera;
        this.menuOpen = false;

        menuItemBounds = new Array<>();
        batch = new SpriteBatch();
        font = new BitmapFont(true);
        shapeRenderer = new ShapeRenderer(); // Khởi tạo ShapeRenderer

        // Tạo camera riêng cho screen space
        screenCamera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        screenCamera.position.set(screenCamera.viewportWidth / 2, screenCamera.viewportHeight / 2, 0);
        screenCamera.update();

        // Initialize settings panel
        float panelWidth = 300;
        float panelHeight = 200;
        settingsPanel = new Rectangle(
            Gdx.graphics.getWidth() / 2f - panelWidth / 2,
            Gdx.graphics.getHeight() / 2f - panelHeight / 2,
            panelWidth, panelHeight);

        // Close button in settings panel
        closeButton = new Rectangle(
            settingsPanel.x + settingsPanel.width - 80,
            settingsPanel.y + 20,
            60, 30);

        // Auto checkbox in settings panel
        autoCheckbox = new Rectangle(
            settingsPanel.x + 40,
            settingsPanel.y + 80,
            20, 20);

        // Load textures
        loadTextures();
    }

    /**
     * Loads all textures required for the button
     */
    private void loadTextures() {
        try {
            // Load button texture
            buttonTexture = new Texture(Gdx.files.internal("button_a.png"));

            // Load icon textures - kích thước 32x32
            playTexture = new Texture(Gdx.files.internal("play_icon.png"));
            pauseTexture = new Texture(Gdx.files.internal("pause_icon.png"));
            settingsTexture = new Texture(Gdx.files.internal("settings_icon.png"));
        } catch (Exception e) {
            System.out.println("Error loading textures: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Renders the button and its menu/settings in screen space
     */
    public void render() {
        // Lưu lại blend state hiện tại
        boolean blendEnabled = Gdx.gl.glIsEnabled(GL20.GL_BLEND);

        // Bật blend để vẽ hình trong suốt
        if (!blendEnabled) {
            Gdx.gl.glEnable(GL20.GL_BLEND);
            Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        }

        // Thiết lập ShapeRenderer với camera screen space để vẽ nền màu xám
        shapeRenderer.setProjectionMatrix(screenCamera.combined);

        // Vẽ nền màu xám cho nút và menu
        drawBackground();

        // Thiết lập batch với camera screen space
        batch.setProjectionMatrix(screenCamera.combined);
        batch.begin();

        // Vẽ nút
        drawButton();

        // Vẽ menu nếu đang mở
        if (menuOpen) {
            drawMenu();
        }

        batch.end();

        // Khôi phục blend state
        if (!blendEnabled) {
            Gdx.gl.glDisable(GL20.GL_BLEND);
        }
    }

    /**
     * Vẽ nền màu xám cho nút và menu
     */
    private void drawBackground() {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);

        // Vẽ nền cho nút chính (hình tròn)
        shapeRenderer.setColor(backgroundColorLight);
        shapeRenderer.circle(x, y, buttonSize / 2 + 5); // Thêm 5px cho hiệu ứng glow

        // Vẽ nền cho menu dropdown nếu đang mở
        if (menuOpen) {
            float menuItemSize = buttonSize * 0.8f;
            float menuItemSpacing = 10; // Khoảng cách giữa các nút
            float numberOfItems = NUM_MENU_ITEMS; // Số lượng nút trong menu

            // Tính toán kích thước của nền menu (chỉ dọc xuống)
            float menuWidth = menuItemSize + 20; // Rộng hơn các nút 20px
            float menuHeight = numberOfItems * menuItemSize + (numberOfItems - 1) * menuItemSpacing + 20; // Cao hơn 20px
            float menuX = x - menuWidth / 2;
            float menuY = y - buttonSize / 2 - menuHeight;

            // Vẽ nền cho toàn bộ menu dropdown (hình chữ nhật với góc bo tròn)
            shapeRenderer.setColor(backgroundColorDark);
            // Vẽ hình chữ nhật bo tròn (mô phỏng bằng cách vẽ hình chữ nhật và hình tròn ở 4 góc)
            float cornerRadius = 10f;

            // Vẽ hình chữ nhật chính
            shapeRenderer.rect(menuX + cornerRadius, menuY, menuWidth - 2 * cornerRadius, menuHeight);
            shapeRenderer.rect(menuX, menuY + cornerRadius, menuWidth, menuHeight - 2 * cornerRadius);

            // Vẽ 4 góc bo tròn
            shapeRenderer.circle(menuX + cornerRadius, menuY + cornerRadius, cornerRadius);
            shapeRenderer.circle(menuX + menuWidth - cornerRadius, menuY + cornerRadius, cornerRadius);
            shapeRenderer.circle(menuX + cornerRadius, menuY + menuHeight - cornerRadius, cornerRadius);
            shapeRenderer.circle(menuX + menuWidth - cornerRadius, menuY + menuHeight - cornerRadius, cornerRadius);
        }

        shapeRenderer.end();
    }

    /**
     * Draws the main button
     */
    private void drawButton() {
        if (buttonTexture != null) {
            // Vẽ nút bằng texture
            batch.draw(buttonTexture, x - buttonSize / 2, y - buttonSize / 2, buttonSize, buttonSize);
        }
    }

    /**
     * Draws the dropdown menu (vertical downward)
     */
    private void drawMenu() {
        // Reset menu item bounds
        menuItemBounds.clear();

        float menuItemSize = buttonSize * 0.8f;
        float menuItemSpacing = 10;

        // Bắt đầu từ dưới nút chính và chỉ đi xuống
        float startY = y - buttonSize / 2 - menuItemSize / 2 - 10;

        // Tạo bounds và vẽ các menu items theo chiều dọc xuống
        for (int i = 0; i < NUM_MENU_ITEMS; i++) {
            float itemY = startY - i * (menuItemSize + menuItemSpacing);

            // Tạo bounds cho menu item
            Rectangle itemBounds = new Rectangle(x - menuItemSize / 2, itemY - menuItemSize / 2, menuItemSize, menuItemSize);
            menuItemBounds.add(itemBounds);

            // Xác định texture cần vẽ dựa vào index
            Texture iconTexture = null;

            if (i == 0) { // Play/Pause item
                iconTexture = !ScreenManager.instance.gameScreen.screen.isEnableAutoClick() ? playTexture : pauseTexture;
            } else if (i == 1) { // Settings item
                iconTexture = settingsTexture;
            }

            if (iconTexture != null) {
                // Căn giữa icon trong menu item
                float iconX = x - ICON_SIZE / 2f;
                float iconY = itemY - ICON_SIZE / 2f;
                batch.draw(iconTexture, iconX, iconY, ICON_SIZE, ICON_SIZE);
            }
        }
    }

    /**
     * Chuyển đổi tọa độ thế giới (world space) sang tọa độ màn hình (screen space)
     */
    private Vector3 worldToScreenCoords(float worldX, float worldY) {
        screenCoords.set(worldX, worldY, 0);
        mainCamera.project(screenCoords);
        return screenCoords;
    }

    /**
     * Handles touch down events - chỉ tác động khi menu items theo chiều dọc xuống
     *
     * @param worldX Touch X coordinate in world space
     * @param worldY Touch Y coordinate in world space
     * @return true if the touch was handled
     */
    public boolean touchDown(float worldX, float worldY) {
        worldToScreenCoords(worldX, worldY);
        float touchX = screenCoords.x;
        float touchY = screenCoords.y;

        // Kiểm tra có touch vào nút chính không
        float distance = (float) Math.sqrt(Math.pow(touchX - x, 2) + Math.pow(touchY - y, 2));
        if (distance <= buttonSize / 2) {
            isDragging = true;
            hasMoved = false;
            menuOpen = false;
            return true;
        }

        // Xử lý touch vào menu items nếu menu đang mở
        if (menuOpen) {
            // Kiểm tra touch vào item nào trong menu dropdown
            for (int i = 0; i < menuItemBounds.size; i++) {
                Rectangle itemBounds = menuItemBounds.get(i);
                if (itemBounds.contains(touchX, touchY)) {
                    handleMenuItemTouch(i);
                    return true;
                }
            }

            // Nếu touch ra ngoài menu, đóng menu lại
            menuOpen = false;
            return true;
        }

        return false;
    }

    /**
     * Handles touch dragged events
     *
     * @param worldX Touch X coordinate in world space
     * @param worldY Touch Y coordinate in world space
     * @return true if the touch was handled
     */
    public boolean touchDragged(float worldX, float worldY) {
        worldToScreenCoords(worldX, worldY);
        float touchX = screenCoords.x;
        float touchY = screenCoords.y;

        if (isDragging) {
            if (menuOpen) menuOpen = false;

            // Check if the button actually moved
            if (Math.abs(touchX - x) > 1 || Math.abs(touchY - y) > 1) {
                hasMoved = true;
            }

            x = touchX;
            y = touchY;
            return true;
        }

        return false;
    }

    /**
     * Handles touch up events
     *
     * @param worldX Touch X coordinate in world space
     * @param worldY Touch Y coordinate in world space
     * @return true if the touch was handled
     */
    public boolean touchUp(float worldX, float worldY) {
        worldToScreenCoords(worldX, worldY);
        float touchX = screenCoords.x;
        float touchY = screenCoords.y;

        if (isDragging) {
            // Only toggle menu if the button wasn't moved
            if (!hasMoved) {
                menuOpen = !menuOpen;
            }
            isDragging = false;
            return true;
        }

        return false;
    }

    /**
     * Handles menu item touches
     *
     * @param index The index of menu item that was touched
     */
    private void handleMenuItemTouch(int index) {
        switch (index) {
            case 0: // Auto toggle
                ScreenManager.instance.gameScreen.screen.toggleAutoClick();
                break;
            case 1: // Settings
                ScreenManager.instance.gameScreen.screen.showAutoClick();
                break;
        }
        menuOpen = false;
    }

    /**
     * Updates on window resize
     *
     * @param width  Screen width
     * @param height Screen height
     */
    public void resize(int width, int height) {
        // Cập nhật camera cho screen space
        screenCamera.setToOrtho(false, width, height);
        screenCamera.update();

        // Re-center settings panel
        float panelWidth = settingsPanel.width;
        float panelHeight = settingsPanel.height;
        settingsPanel.setPosition(
            width / 2f - panelWidth / 2,
            height / 2f - panelHeight / 2);

        // Update close button position
        closeButton.setPosition(
            settingsPanel.x + settingsPanel.width - 80,
            settingsPanel.y + 20);

        // Update auto checkbox position
        autoCheckbox.setPosition(
            settingsPanel.x + 40,
            settingsPanel.y + 80);
    }

    /**
     * Disposes all resources
     */
    public void dispose() {
        // Dispose LibGDX resources
        if (batch != null) {
            batch.dispose();
        }

        if (font != null) {
            font.dispose();
        }

        if (shapeRenderer != null) {
            shapeRenderer.dispose();
        }

        // Dispose textures
        if (buttonTexture != null) {
            buttonTexture.dispose();
        }

        if (playTexture != null) {
            playTexture.dispose();
        }

        if (pauseTexture != null) {
            pauseTexture.dispose();
        }

        if (settingsTexture != null) {
            settingsTexture.dispose();
        }
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
