package main.tab.tab1;

import main.lib.Image;

public final class Class84 {
    public byte[] Field1;
    public Class140[] Field2;
    public Image Field3;
    public Class706[] Field4;
    public short Field5;

    public final void Field1(Class86 var1) {
        try {
            byte[] var2 = new byte[var1.Field2().readShort()];
            var1.Field2().read(var2);
            this.Field3 = Class804.Field2(var2);
            byte var7 = var1.Field2().readByte();
            this.Field2 = new Class140[var7];

            for (int var3 = 0; var3 < var7; ++var3) {
                this.Field2[var3] = new Class140();
                this.Field2[var3].Field3 = var1.Field2().readByte();
                this.Field2[var3].Field4 = var1.Field2().readByte();
                this.Field2[var3].Field5 = var1.Field2().readByte();
                this.Field2[var3].Field1 = var1.Field2().readByte();
                this.Field2[var3].Field2 = var1.Field2().readByte();
            }

            byte var9 = var1.Field2().readByte();
            this.Field4 = new Class706[var9];

            for (int var8 = 0; var8 < var9; ++var8) {
                this.Field4[var8] = new Class706();
                byte var4 = var1.Field2().readByte();
                this.Field4[var8].Field1 = new byte[var4];
                this.Field4[var8].Field2 = new byte[var4];
                this.Field4[var8].Field3 = new byte[var4];

                for (int var5 = 0; var5 < var4; ++var5) {
                    this.Field4[var8].Field1[var5] = var1.Field2().readByte();
                    this.Field4[var8].Field2[var5] = var1.Field2().readByte();
                    this.Field4[var8].Field3[var5] = var1.Field2().readByte();
                }
            }

            var7 = var1.Field2().readByte();
            this.Field1 = new byte[var7];

            for (int var10 = 0; var10 < var7; ++var10) {
                this.Field1[var10] = var1.Field2().readByte();
            }

        } catch (Exception var6) {
            var6.printStackTrace();
        }
    }
}
