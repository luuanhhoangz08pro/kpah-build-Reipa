package main.tab.tab2;

import main.lib.Graphics;

public final class Class795 extends Class678 {
    private int Field1 = 0;
    private int Field2;

    public Class795(short var1, short var2) {
        super.Field188 = 126;
        super.Field193 = var1;
        super.Field194 = var2;
        this.Field2 = 0;
    }

    public final void Field1(Graphics var1) {
        if (super.Field193 < Class62.Field8 ? false : (super.Field193 > Class62.Field8 + Class106.Field13 ? false : (super.Field194 < Class62.Field9 ? false : super.Field194 <= Class62.Field9 + Class106.Field14 + 30))) {
            var1.drawRegion(Class811.Field19, 0, this.Field1 * 24, 24, 24, 0, super.Field193 - 12, super.Field194 - 24, 0);
        }
    }

    public final void Field1(short var1, short var2) {
        super.Field193 = var1;
        super.Field194 = var2;
    }

    public final void Field2() {
        ++this.Field2;
        if (this.Field2 > 8) {
            this.Field2 = 0;
            super.Field187 = true;
        }

        this.Field1 = this.Field2 >> 1;
    }
}
