package main.tab.tab1;

import java.util.Vector;

import main.lib.Graphics;

public abstract class Class672 {
    public boolean Field187;
    public byte Field188;
    public short Field189 = 32001;
    public short Field190 = -1;
    public short Field191 = -1;
    public short Field192 = -1;
    public short Field193;
    public short Field194;
    public short Field195;
    public short Field196;
    public short Field197;
    public short Field198;
    public short Field199;
    public byte Field200 = -1;
    public byte Field201 = -1;
    public byte Field202 = -1;
    public byte Field203;
    public byte Field204;
    public boolean Field205;
    public boolean Field206;
    public boolean Field207;
    public long Field208;
    public Class580 Field209;
    public String Field210;
    public boolean Field211 = false;
    public int Field212 = -1;
    public Vector Field213 = new Vector();
    public short Field214;
    public long Field215;
    public short Field216 = 0;
    public boolean Field217;
    public boolean Field218 = true;

    public Class672() {
        System.currentTimeMillis();
    }

    public abstract void Field1(Graphics var1);

    public void Field31() {
    }

    public abstract void Field1(short var1, short var2);

    public void Field2() {
        if (this.Field209 != null) {
            this.Field209.Field1(this.Field193, this.Field194 - this.Field195 - 10);
            Class580 var1;
            if ((var1 = this.Field209).Field1 > 0) {
                --var1.Field1;
            }

            if (var1.Field1 == 0) {
                this.Field209 = null;
            }
        }

    }

    public boolean b_() {
        return false;
    }

    public final void Field1(Class821 var1) {
        for (int var2 = 0; var2 < this.Field213.size(); ++var2) {
            if (((Class821) this.Field213.elementAt(var2)).Field8 == var1.Field8) {
                this.Field213.removeElementAt(var2);
                break;
            }
        }

        this.Field213.addElement(var1);
    }

    public void Field1(short var1) {
    }

    public void a_(Graphics var1, int var2, int var3) {
        var1.translate(-this.Field193 + var2, -this.Field194 + 20);
        this.Field1(var1);
    }

    public void a_(Graphics var1) {
        if (this.Field209 != null) {
            var1 = var1;
            Class580 var8 = this.Field209;
            int var10001 = var8.Field2 - var8.Field5 / 2;
            int var10002 = var8.Field3 - var8.Field4 - 4;
            boolean var2 = true;
            int var7 = 16777215;
            int var6 = var8.Field4;
            int var5 = var8.Field5;
            int var4 = var10002;
            int var3 = var10001;
            var1.drawRegion(Class580.Field8, 0, 0, 8, 8, 0, var3, var4, 0);
            var1.drawRegion(Class580.Field8, 0, 8, 8, 8, 0, var3 + var5 - 8, var4, 0);
            var1.drawRegion(Class580.Field8, 0, 24, 8, 8, 0, var3, var4 + var6 - 8, 0);
            var1.drawRegion(Class580.Field8, 0, 16, 8, 8, 0, var3 + var5 - 8, var4 + var6 - 8, 0);
            var1.setColor(var7);
            var1.fillRect(var3 + 8, var4, var5 - 16, 8);
            var1.fillRect(var3 + 8, var4 + var6 - 8, var5 - 16, 7);
            var1.fillRect(var3, var4 + 8, var5, var6 - 16);
            var1.setColor(1);
            var1.fillRect(var3 + 8, var4, var5 - 16, 1);
            var1.fillRect(var3 + 8, var4 + var6 - 1, var5 - 16, 1);
            var1.fillRect(var3, var4 + 8, 1, var6 - 16);
            var1.fillRect(var3 + var5 - 1, var4 + 8, 1, var6 - 16);
            if (var8.Field6 == 1) {
                var1.drawImage(Class580.Field9, var8.Field2, var8.Field3 - 5, 17);
            }

            int var9 = var8.Field3 - var8.Field4;

            for (var3 = 0; var3 < var8.Field7.length; ++var3) {
                Class21.Field4.Field1(var1, var8.Field7[var3], var8.Field2, var9, 2);
                var9 += 14;
            }
        }

    }

    public int c_() {
        return this.Field194;
    }

    public String a_() {
        return "Actor C=" + this.Field188 + " ID=" + this.Field189;
    }

    public boolean Field45() {
        return false;
    }

    public void Field19() {
    }

    public boolean d_() {
        return false;
    }

    public boolean Field22() {
        return false;
    }

    public boolean Field23() {
        return false;
    }

    public boolean Field42() {
        return false;
    }

    public boolean Field3() {
        return false;
    }

    public int e_() {
        return 0;
    }

    public int f_() {
        return 32000;
    }

    public boolean Field41() {
        return false;
    }

    public void Field11(int var1) {
    }

    public void Field12(int var1) {
    }

    public void Field13(int var1) {
    }

    public void Field1(int var1) {
    }

    public int Field39() {
        return 0;
    }

    public int Field40() {
        return 0;
    }

    public void Field9(int var1) {
    }

    public short Field16() {
        return 0;
    }

    public byte Field15() {
        return 0;
    }

    public short Field17() {
        return 0;
    }

    public boolean g_() {
        return false;
    }

    public void Field1(int var1, int var2, int var3, long var4) {
    }

    public void Field1(Vector var1, byte var2, short var3, int[] var4, int[] var5) {
    }

    public void Field3(int var1) {
    }

    public void Field1(int var1, int var2, int var3, long var4, boolean var6, boolean var7, boolean var8, int var9, byte var10, byte var11) {
    }

    public short Field43() {
        return 0;
    }
}
