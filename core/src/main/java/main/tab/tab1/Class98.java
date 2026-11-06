package main.tab.tab1;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Hashtable;
import java.util.Vector;

import main.lib.Graphics;

public final class Class98 extends Class359 {
    public static Hashtable Field1 = new Hashtable();
    private byte Field32 = 0;
    private Vector Field33 = new Vector();
    private byte Field34 = 0;
    private byte Field35 = 0;
    private short Field36 = 0;
    private short Field37 = 0;

    public Class98() {
        super.Field188 = 0;
        super.Field17 = 3;
        super.Field195 = 55;
        super.Field196 = 40;
        super.Field4 = 1;
        super.Field170 = 15;
        super.Field2 = 1;
        super.Field12 = (short) Class111.Field30.nextInt(4);
        super.Field211 = false;
    }

    public static void Field1(int var0, byte[] var1) {
        try {
            try {
                Vector var2 = new Vector();
                if ((Vector) Field1.get("" + var0) == null) {
                    DataInputStream var7 = new DataInputStream(new ByteArrayInputStream(var1));

                    for (int var3 = 0; var3 < 1; ++var3) {
                        byte[] var4 = new byte[(short) var7.available()];
                        var7.read(var4, 0, var4.length);
                        var2.addElement(new Class823(var4));
                    }

                    Field1.put("" + var0, var2);
                    var7.close();
                    return;
                }
            } catch (Exception var5) {
                var5.printStackTrace();
                return;
            }
        } catch (Exception var6) {
        }

    }

    public final void Field1(int var1) {
        this.Field32 = (byte) var1;

        try {
            this.Field33 = (Vector) Field1.get("" + var1);
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    public final void Field1(short var1, short var2) {
        this.Field2(var1, var2);
    }

    public final void Field2(short var1, short var2) {
        this.Field36 = var1;
        this.Field37 = var2;
        if (super.Field193 == var1 && super.Field194 == var2) {
            if (super.Field204 == 3) {
                return;
            }

            if (super.Field204 != 1) {
                super.Field204 = 0;
                return;
            }
        } else {
            super.Field204 = 2;
        }

    }

    public final void Field1(Graphics var1) {
        if (!super.Field211) {
            if (this.Field33.size() != 0) {
                try {
                    Class823 var2;
                    if ((var2 = (Class823) this.Field33.elementAt(0)) != null) {
                        byte var3 = super.Field204;
                        Class172 var4 = Class381.Field1((short) (this.Field32 + 12000));
                        var1.drawImage(Class804.Field10, super.Field193 + (this.Field35 == 2 ? -10 : 10), super.Field194 - 10, 3);
                        if (var4 != null && var4.Field1 != null) {
                            var2.Field1(var1, var2.Field1(super.Field23, var3, this.Field34), super.Field193 + super.Field10, super.Field194 + super.Field11, this.Field35, var4.Field1);
                        }
                    }

                } catch (Exception var5) {
                    var5.printStackTrace();
                }
            }
        }
    }

    public final void a_(Graphics var1, int var2, int var3) {
    }

    public final void Field1(Class111 var1, Class787 var2, byte var3, byte var4) {
        super.Field204 = 3;
        super.Field23 = 0;
    }

    public final void Field2() {
        Class823 var1 = null;
        if (this.Field33.size() > 0) {
            var1 = (Class823) this.Field33.elementAt(0);
            byte var2 = super.Field204;
            if (super.Field204 == 3 && super.Field23 >= var1.Field1(var2, this.Field34).Field1.length - 1) {
                var2 = 0;
                super.Field204 = 0;
            }

            super.Field23 = (byte) ((super.Field23 + 1) % var1.Field1(var2, this.Field34).Field1.length);
        }

        switch (super.Field204) {
            case 0:
                return;
            case 1:
                if (super.Field4 > 0 && super.Field2 > 0) {
                    super.Field204 = 0;
                }
                break;
            case 2:
                short var9 = this.Field37;
                short var8 = this.Field36;
                super.Field17 = 4;
                boolean var3 = false;
                boolean var4 = false;
                int var5 = Math.abs(super.Field193 - var8);
                int var6 = Math.abs(super.Field194 - var9);
                if (var5 <= super.Field17) {
                    super.Field193 = (short) var8;
                    var3 = true;
                }

                if (var6 < super.Field17) {
                    super.Field194 = (short) var9;
                    var4 = true;
                }

                if (var3 && var4) {
                    super.Field204 = 0;
                } else if (super.Field193 < var8) {
                    super.Field193 += super.Field17;
                    super.Field12 = 3;
                } else if (super.Field193 > var8) {
                    super.Field193 -= super.Field17;
                    super.Field12 = 2;
                } else if (super.Field194 > var9) {
                    super.Field194 -= super.Field17;
                    super.Field12 = 1;
                } else if (super.Field194 < var9) {
                    super.Field12 = 0;
                    super.Field194 += super.Field17;
                }

                Class98 var7;
                (var7 = this).Field34 = (byte) (var7.Field194 > var9 ? 1 : 0);
                var7.Field35 = (byte) (var7.Field193 - var8 > 0 ? 0 : 2);
                if (var7.Field33.size() <= 0) {
                    return;
                }

                var7.Field35 = 0;
                if (var7.Field12 == 3) {
                    var7.Field35 = 2;
                } else {
                    if (var7.Field12 == 2) {
                        return;
                    }

                    if (var7.Field12 != 0) {
                        if (var7.Field12 == 1) {
                            var7.Field34 = 1;
                        }

                        return;
                    }

                    var7.Field34 = 0;
                }
                break;
            case 3:
                return;
            case 4:
            case 5:
        }

    }
}
