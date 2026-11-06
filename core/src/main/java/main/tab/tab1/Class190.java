package main.tab.tab1;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import main.lib.Graphics;

public final class Class190 extends Class13 {
    public boolean Field5;
    private boolean Field10 = false;
    private boolean Field11 = true;
    private static int Field12 = 2;
    private static final int[] Field13 = new int[]{18, 14, 11, 9, 6, 4, 2};
    private static int Field14 = 0;
    private static String[] Field15 = new String[]{" 0", ".,@?!_1\"/$-():*+<=>;%&~#%^&*{}[];'/1", "abc2áàảãạâấầẩẫậăắằẳẵặ2", "def3đéèẻẽẹêếềểễệ3", "ghi4íìỉĩị4", "jkl5", "mno6óòỏõọôốồổỗộơớờởỡợ6", "pqrs7", "tuv8úùủũụưứừửữự8", "wxyz9ýỳỷỹỵ9", "*", "#"};
    private static String[] Field16 = new String[]{"0", "1", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9", "0", "0"};
    private static String[] Field17 = new String[]{" 0", "er1", "ty2", "ui3", "df4", "gh5", "jk6", "cv7", "bn8", "m9", "0", "0", "qw!", "as?", "zx", "op.", "l,"};
    private String Field18 = "";
    private String Field19 = "";
    private String Field20 = "";
    private int Field21 = 0;
    private int Field22 = 0;
    private int Field23 = 500;
    private int Field24 = 0;
    private static int Field25 = -1984;
    private int Field26 = 0;
    private int Field27 = 0;
    private int Field28 = 10;
    private int Field29 = 0;
    public static boolean Field6;
    private static int Field30;
    public static int Field7 = 0;
    public static final String[] Field8 = new String[]{"abc", "Abc", "ABC", "123"};
    private static int Field31 = 11;
    public Class87 Field9;
    private Class665 Field32;
    private boolean Field33;
    private static int[][] Field34 = new int[][]{{32, 48}, {49, 69}, {50, 84}, {51, 85}, {52, 68}, {53, 71}, {54, 74}, {55, 67}, {56, 66}, {57, 77}, {42, 128}, {35, 137}, {33, 113}, {63, 97}, {64, 121, 122}, {46, 111}, {44, 108}};

    private void Field6() {
        Field14 = Class21.Field10[0].Field2() + 1;
        this.Field9 = new Class87("Xóa", new Class146(this));
        if (this.Field32 != null) {
            this.Field32.Field105 = this.Field9;
        }

    }

    public Class190(Class665 var1) {
        this.Field18 = "";
        this.Field32 = var1;
        this.Field6();
    }

    public Class190() {
        this.Field18 = "";
        this.Field6();
    }

    public Class190(int var1, int var2, int var3, int var4) {
        this.Field18 = "";
        this.Field6();
        super.Field1 = var1;
        super.Field2 = var2;
        super.Field3 = var3;
        super.Field4 = var4;
    }

    public final void Field1() {
        if (this.Field21 > 0 && this.Field18.length() > 0) {
            this.Field18 = this.Field18.substring(0, this.Field21 - 1) + this.Field18.substring(this.Field21, this.Field18.length());
            --this.Field21;
            this.Field2();
            this.Field7();
        }

    }

    public final void Field2() {
        if (this.Field29 == 2) {
            this.Field20 = this.Field19;
        } else {
            this.Field20 = this.Field18;
        }

        if (this.Field24 < 0 && Class21.Field5.Field1(this.Field20) + this.Field24 < super.Field3 - 4 - 13) {
            this.Field24 = super.Field3 - 10 - Class21.Field5.Field1(this.Field20);
        }

        if (this.Field24 + Class21.Field5.Field1(this.Field20.substring(0, this.Field21)) <= 0) {
            this.Field24 = -Class21.Field5.Field1(this.Field20.substring(0, this.Field21));
            this.Field24 += 40;
        } else if (this.Field24 + Class21.Field5.Field1(this.Field20.substring(0, this.Field21)) >= super.Field3 - 12) {
            this.Field24 = super.Field3 - 10 - Class21.Field5.Field1(this.Field20.substring(0, this.Field21)) - 8;
        }

        if (this.Field24 > 0) {
            this.Field24 = 0;
        }

    }

    private void Field4(int var1) {
        String[] var2;
        if (Class105.Field27) {
            var2 = Field17;
        } else if (this.Field29 != 2 && this.Field29 != 3) {
            var2 = Field15;
        } else {
            var2 = Field16;
        }

        if (Class105.Field27) {
            var1 = var1;
            int var3 = 0;

            int var10000;
            label78:
            while (true) {
                if (var3 >= Field34.length) {
                    var10000 = -1;
                    break;
                }

                for (int var4 = 0; var4 < Field34[var3].length; ++var4) {
                    if (Field34[var3][var4] == var1) {
                        var10000 = var3 + 48;
                        break label78;
                    }
                }

                ++var3;
            }

            var1 = var10000;
            if (var10000 == -1) {
                return;
            }
        }

        String var5;
        char var6;
        if (var1 == Field25) {
            this.Field27 = (this.Field27 + 1) % var2[var1 - 48].length();
            var6 = var2[var1 - 48].charAt(this.Field27);
            if (Field7 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (Field7 == 1) {
                var6 = Character.toUpperCase(var6);
            } else if (Field7 == 2) {
                var6 = Character.toUpperCase(var6);
            } else {
                var6 = var2[var1 - 48].charAt(var2[var1 - 48].length() - 1);
            }

            var5 = this.Field18.substring(0, this.Field21 - 1) + var6;
            if (this.Field21 < this.Field18.length()) {
                var5 = var5 + this.Field18.substring(this.Field21, this.Field18.length());
            }

            this.Field18 = var5;
            this.Field26 = Field13[Field12];
            this.Field7();
        } else if (this.Field18.length() < this.Field23) {
            if (Field7 == 1 && Field25 != -1984) {
                Field7 = 0;
            }

            this.Field27 = 0;
            var6 = var2[var1 - 48].charAt(this.Field27);
            if (Field7 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (Field7 == 1) {
                var6 = Character.toUpperCase(var6);
            } else if (Field7 == 2) {
                var6 = Character.toUpperCase(var6);
            } else {
                var6 = var2[var1 - 48].charAt(var2[var1 - 48].length() - 1);
            }

            var5 = this.Field18.substring(0, this.Field21) + var6;
            if (this.Field21 < this.Field18.length()) {
                var5 = var5 + this.Field18.substring(this.Field21, this.Field18.length());
            }

            this.Field18 = var5;
            this.Field26 = Field13[Field12];
            ++this.Field21;
            this.Field7();
            this.Field2();
        }

        Field25 = var1;
    }

    private void Field5(int var1) {
        if (this.Field29 != 2 && this.Field29 != 3 || var1 >= 48 && var1 <= 57 || var1 >= 65 && var1 <= 90 || var1 >= 97 && var1 <= 122) {
            if (this.Field18.length() < this.Field23) {
                String var2 = this.Field18.substring(0, this.Field21) + (char) var1;
                if (this.Field21 < this.Field18.length()) {
                    var2 = var2 + this.Field18.substring(this.Field21, this.Field18.length());
                }

                this.Field18 = var2;
                ++this.Field21;
                this.Field7();
                this.Field2();
            }

        }
    }

    public static void Field3() {
        if (++Field7 > 3) {
            Field7 = 0;
        }

        Field25 = Field31;
        System.currentTimeMillis();
    }

    public final boolean Field1(int var1) {
        if (!this.Field5) {
            return true;
        } else {
            if (Class105.Field27) {
                if (var1 == 8 || var1 == 127) {
                    this.Field1();
                }
            } else if (var1 == 8 || var1 == -8 || var1 == 204) {
                this.Field1();
                return true;
            }

            if (!Class105.Field27 && var1 >= 65 && var1 <= 122) {
                Field6 = true;
                Field30 = 0;
            }

            if (var1 >= 65 && var1 <= 122) {
                Field6 = true;
                Field30 = 0;
            }

            if (Field6 && !Class105.Field27) {
                if (var1 == 45) {
                    if (var1 == Field25 && this.Field26 < Field13[Field12]) {
                        this.Field18 = this.Field18.substring(0, this.Field21 - 1) + '_';
                        this.Field20 = this.Field18;
                        this.Field7();
                        this.Field2();
                        Field25 = -1984;
                        return false;
                    }

                    Field25 = 45;
                }

                if (var1 >= 32) {
                    this.Field5(var1);
                    return true;
                }
            }

            if (var1 == Field31) {
                if (++Field7 > 3) {
                    Field7 = 0;
                }

                this.Field26 = 1;
                Field25 = var1;
                return true;
            } else {
                if (var1 == 42) {
                    var1 = 58;
                }

                if (var1 == 35) {
                    var1 = 59;
                }

                if (Class105.Field27 && var1 >= 48) {
                    if (Field6) {
                        this.Field5(var1);
                        this.Field26 = 1;
                    } else if (this.Field29 != 0 && this.Field29 != 2 && this.Field29 != 3) {
                        if (this.Field29 == 1) {
                            this.Field5(var1);
                            this.Field26 = 1;
                        }
                    } else {
                        this.Field4(var1);
                    }
                } else {
                    if (var1 >= 48 && var1 <= 59) {
                        if (this.Field29 != 0 && this.Field29 != 2 && this.Field29 != 3) {
                            if (this.Field29 == 1) {
                                this.Field5(var1);
                                this.Field26 = 1;
                            }
                        } else {
                            this.Field4(var1);
                        }

                        return true;
                    }

                    this.Field27 = 0;
                    Field25 = -1984;
                    if (var1 == -3) {
                        if (this.Field21 > 0) {
                            --this.Field21;
                            this.Field2();
                            this.Field28 = 10;
                            return true;
                        }
                    } else if (var1 == -4) {
                        if (this.Field21 < this.Field18.length()) {
                            ++this.Field21;
                            this.Field2();
                            this.Field28 = 10;
                            return true;
                        }
                    } else {
                        if (var1 == -8) {
                            this.Field1();
                            return true;
                        }

                        Field25 = var1;
                    }
                }

                return false;
            }
        }
    }

    public final void Field1(Graphics var1) {
        boolean var2 = this.Field5;
        if (this.Field29 == 2) {
            this.Field20 = this.Field19;
        } else {
            this.Field20 = this.Field18;
        }

        if (var2) {
            if (this.Field11) {
                var1.setColor(16767892);
                var1.fillRect(super.Field1 + 1, super.Field2 + 1, super.Field3 - 1, super.Field4 - 1);
                var1.setColor(7950336);
            }
        } else {
            var1.setColor(11768142);
            var1.fillRect(super.Field1 + 1, super.Field2 + 1, super.Field3 - 1, super.Field4 - 1);
            var1.setColor(5979911);
        }

        var1.drawRect(super.Field1 + 1, super.Field2 + 1, super.Field3 - 2, super.Field4 - 2);
        var1.setClip(super.Field1 + 3, super.Field2 + 1, super.Field3 - 8, super.Field4 - 4);
        var1.setColor(0);
        Class21.Field5.Field1(var1, this.Field20, 4 + this.Field24 + super.Field1, super.Field2 + (super.Field4 - Class21.Field5.Field2()) / 2, 0);
        if (this.Field5 && this.Field26 == 0 && (this.Field28 > 0 || this.Field22 / 5 % 2 == 0)) {
            var1.setColor(0);
            var1.fillRect(5 + this.Field24 + super.Field1 + Class21.Field5.Field1(this.Field20.substring(0, this.Field21)) - 1, super.Field2 + (super.Field4 - Field14) / 2 + 1, 1, Field14);
        }

    }

    private void Field7() {
        if (this.Field29 == 2) {
            this.Field19 = "";

            for (int var1 = 0; var1 < this.Field18.length(); ++var1) {
                this.Field19 = this.Field19 + "*";
            }

            if (this.Field26 > 0 && this.Field21 > 0) {
                this.Field19 = this.Field19.substring(0, this.Field21 - 1) + this.Field18.charAt(this.Field21 - 1) + this.Field19.substring(this.Field21, this.Field19.length());
            }
        }

    }

    public final void Field4() {
        ++this.Field22;
        if (this.Field26 > 0) {
            --this.Field26;
            if (this.Field26 == 0) {
                this.Field27 = 0;
                if (Field7 == 1 && Field25 != Field31) {
                    Field7 = 0;
                }

                Field25 = -1984;
                this.Field7();
            }
        }

        if (this.Field28 > 0) {
            --this.Field28;
        }

        if (Class105.Field7 && (Class105.Field23 == null || Class105.Field23 == Class105.Field25) && !Class105.Field21.Field1 && Class105.Field1(0, 0, Class105.Field13, Class105.Field14)) {
            if (Class105.Field1(super.Field1, super.Field2, super.Field3, super.Field4)) {
                if (!this.Field5) {
                    this.Field5 = true;
                    return;
                }

                Class105.Field7 = false;
                if (!Class105.Field33) {
                    this.Field33 = true;
                    Class105.Field33 = true;
                    Class105.Field1.sizeChanged(0, 0);
                }

                Gdx.app.postRunnable(() -> {
                    if (Gdx.app.getType() != Application.ApplicationType.Desktop) {
                        Gdx.input.getTextInput(new Input.TextInputListener() {
                            @Override
                            public void input(String textInput) {
                                if (!textInput.isEmpty()) {
                                    Field1(textInput);
                                }
                            }

                            @Override
                            public void canceled() {

                            }
                        }, "", "", "");
                    }
                });
                return;
            }

            if (this.Field33) {
                Class105.Field7 = false;
                Class105.Field33 = false;
                Class105.Field1.sizeChanged(0, 0);
                this.Field33 = false;
            }

            this.Field5 = false;
        }

    }

    public final String Field5() {
        return this.Field18;
    }

    public final void Field1(String var1) {
        if (var1 != null) {
            Field25 = -1984;
            this.Field26 = 0;
            this.Field27 = 0;
            this.Field18 = var1;
            this.Field20 = var1;
            this.Field7();
            this.Field21 = var1.length();
            this.Field2();
        }
    }

    public final void Field2(int var1) {
        this.Field23 = var1;
    }

    public final void Field3(int var1) {
        this.Field29 = var1;
    }
}
