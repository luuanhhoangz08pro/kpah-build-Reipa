package main.tab.tab2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import main.lib.Graphics;
import main.lib.Image;
import main.lib.TextureService;

public final class Class52 extends Class177 {
    private Class114 Field15;
    private int Field16;
    public int Field1;
    private int Field17;
    private Image Field18;
    private int[] Field19;
    private short Field20;
    private Class829 Field21;

    public Class52(short var1, int var2, Class114 var3) {
        this.Field15 = var3;
        super.Field8 = var1;
        this.Field1 = var2;
        this.Field16 = (int) (System.currentTimeMillis() / 1000L);
        switch (var1) {
            case 0:
                if (var3.Field189 == Class106.Field19.Field15.Field189) {
                    Class106.Field19.Field19 = false;
                    return;
                }

                var3.Field26.removeElement(this);
                return;
            case 1:
                this.Field17 = (int) (System.currentTimeMillis() / 1000L) - 1;
                this.Field21 = new Class829(var3.Field193, var3.Field194 - 17, 22);
                return;
            case 2:
                this.Field19 = new int[]{7053112, 7517233, 16317187, 8386060, 16453379};
                return;
            case 3:
            case 4:
                Object var9 = null;
                int[] var10;
                if (var1 == 3) {
                    var10 = new int[]{-1, -2950406, -4849665, -5778950, -7354371, -9718017, -9786901, -10969884, -11889954, -12811056};
                } else {
                    var10 = new int[]{-1381912, -3092533, -4408651, -5330011, -6185321, -6711666, -7961734, -8817301, -10330540, -11317177};
                }
                Gdx.app.postRunnable(() -> {
                    try {
                        SpriteBatch batch = new SpriteBatch();
                        Graphics g = new Graphics(batch);
                        Texture texture = TextureService.instance.spriteBatchToTexture(batch, () -> {
                            g.setColor(-65315);
                            g.fillRect(0, 0, 50, 105);
                            g.translate(-var3.Field193 + 25, -var3.Field194 + 105 - 5);
                            var3.Field1(g);
                        }, 50, 150);

                        this.Field18 = Class811.Field1(new Image(texture));
                        int[] var8 = new int[5250];
                        this.Field18.getRGB(var8, 0, 50, 0, 0, 50, 105);
                        int var4 = 1864135;

                        for (int var5 = 0; var5 < var8.length; ++var5) {
                            if (var8[var5] != 16777215) {
                                int var6 = var8[var5] / var4;
                                var8[var5] = var10[Class809.Field4(var6)];
                            }
                        }

                        this.Field18 = Image.createRGBImage(var8, 50, 105, true);
                    } catch (Exception e) {

                    }
                });
                var3.Field27 = false;
                return;
            case 5:
                this.Field20 = var3.Field17;
                var3.Field17 = (short) (var3.Field17 / 2);
            default:
        }
    }

    public final void Field1() {
        if (super.Field8 == 1) {
            this.Field21.Field1();
            this.Field21.Field1(this.Field15.Field193, this.Field15.Field194 - 17);
            if (System.currentTimeMillis() / 1000L - (long) this.Field17 > 1L) {
                this.Field17 = (int) (System.currentTimeMillis() / 1000L);
                Class114 var10000 = this.Field15;
                var10000.Field4 -= 1000;
                Class106.Field19.Field1("-1000", 4, this.Field15.Field193, this.Field15.Field194 - 40, 0, -1);
                if (this.Field15.Field4 < 0) {
                    this.Field15.Field4 = 0;
                }
            }
        }

        if (System.currentTimeMillis() / 1000L - (long) this.Field16 > (long) this.Field1) {
            switch (super.Field8) {
                case 0:
                    Class106.Field19.Field19 = false;
                case 1:
                case 2:
                default:
                    break;
                case 3:
                case 4:
                    this.Field15.Field27 = false;
                    break;
                case 5:
                    this.Field15.Field17 = this.Field20;
            }

            this.Field15.Field26.removeElement(this);
        }

    }

    public final void Field1(Graphics var1) {
        switch (super.Field8) {
            case 1:
                this.Field21.Field1(var1);
                return;
            case 2:
                for (int var2 = 0; var2 < 12; ++var2) {
                    int var3 = 8 * Class809.Field2(var2 * 30) >> 10;
                    int var4 = -(8 * Class809.Field1(var2 * 30)) >> 10;
                    var1.setColor(this.Field19[Class811.Field13(5)]);
                    var1.fillRect(this.Field15.Field193 + var3, this.Field15.Field194 - this.Field15.Field195 + 4 + var4, 1, 5);
                }

                return;
            case 3:
            case 4:
                var1.drawImage(this.Field18, this.Field15.Field193, this.Field15.Field194 + 5, 33);
            default:
        }
    }
}
