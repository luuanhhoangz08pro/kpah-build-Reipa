package main.tab.tab2;

import main.lib.Image;
import main.tab.tab2.screen.MainTab;

import java.util.Vector;

public final class Class133 extends Class382 {
    private static Class133 Field1;

    public Class133() {
        super();
    }

    public static Class133 Field1() {
        if (Class133.Field1 == null) {
            Class133.Field1 = new Class133();
        }
        return Class133.Field1;
    }

    public final void Field1(final Class85 class85) {
        try {
            final byte byte93;
            final String utf18;
            switch (class85.Field1) {
                case -74:
                    Class106.Field19.Field29(class85);
                    return;
                case -73:
                    Class62.Field27(class85);
                    return;
                case 62:
                    Class62.Field25(class85);
                    return;
                case -68:
                    Class106.Field19.Field24(class85);
                    return;
                case -69:
                    Class106.Field19.Field23(class85);
                    return;
                case -70:
                    Class106.Field19.Field22(class85);
                    return;
                case -71:
                    Class106.Field19.Field28(class85);
                    return;
                case -66:
                    Class62.Field20(class85);
                    return;
                case -67:
                    Class62.Field21(class85);
                    return;
                case -64:
                    Class106.Field19.Field19(class85);
                    return;
                case 104:
                    try {
                        Class62.Field4((int) class85.Field2().readByte());
                        class85.Field2().readByte();
                    } catch (final Exception ex) {
                        new StringBuffer("LOI CHO NAY NE ").append(ex.toString()).toString();
                    }
                    return;
                case 103:
                    Class106.Field19.Field14(class85);
                    return;
                case 102:
                    Class62.Field1(class85, 0, "BẠN BÈ");
                    return;
                case 101:
                    Class106.Field19.Field13(class85);
                    return;
                case 95:
                    Class106.Field19.Field3(class85.Field2().readShort(), class85.Field2().readShort(), class85.Field2().readByte());
                    return;
                case 94:
                    Class106.Field19.Field11(class85);
                    return;
                case 92:
                    Class106.Field19.Field12(class85);
                    return;
                case 91:
                    return;
                case 72:
                    Class106.Field1("Đã sửa xong.");
                    return;
                case 89:
                    Class106.Field19.Field10(class85);
                    return;
                case 90:
                    Class106.Field19.Field9(class85);
                    return;
                case 82:
                    Class106.Field23 = null;
                    if (((Class357) Class106.Field19.Field15).Field146 <= 0) {
                        ((Class357) Class106.Field19.Field15).Field146 = class85.Field2().readByte();
                        ((Class357) Class106.Field19.Field15).Field162 = ((Class357) Class106.Field19.Field15).Field146;
                        ((Class357) Class106.Field19.Field15).Field143 = System.currentTimeMillis();
                    }
                    return;
                case 81:
                    Class106.Field1("Đã mua được vé");
                    return;
                case 80:
                    Class811.Field7 = new Class2[class85.Field2().readByte()];
                    for (int i = 0; i < Class811.Field7.length; ++i) {
                        Class811.Field7[i] = new Class2();
                        final byte byte1 = class85.Field2().readByte();
                        Class811.Field7[i].Field1 = new int[byte1];
                        for (int j = 0; j < Class811.Field7[i].Field1.length; ++j) {
                            Class811.Field7[i].Field1[j] = class85.Field2().readByte();
                        }
                        Class811.Field7[i].Field2 = new int[byte1];
                        for (int k = 0; k < Class811.Field7[i].Field2.length; ++k) {
                            Class811.Field7[i].Field2[k] = class85.Field2().readShort();
                        }
                        Class811.Field7[i].Field3 = new int[byte1];
                        for (int l = 0; l < Class811.Field7[i].Field3.length; ++l) {
                            Class811.Field7[i].Field3[l] = class85.Field2().readShort();
                        }
                        Class811.Field7[i].Field4 = new int[byte1];
                        for (int n = 0; n < Class811.Field7[i].Field4.length; ++n) {
                            Class811.Field7[i].Field4[n] = class85.Field2().readShort();
                        }
                    }
                    return;
                case 77:
                    Class62.Field5(class85.Field2().readUTF());
                    return;
                case -35:
                    Class62.Field5(class85.Field2().readUTF());
                    return;
                case -36:
                    if (class85.Field2().readByte() == 0) {
                        Class106.Field19.Field13(class85.Field2().readShort());
                        return;
                    }
                    Class62.Field5(class85.Field2().readUTF());
                    return;
                case 85:
                    Class106.Field1("Đã mua, món đồ đang ở trong hành trang.");
                    return;
                case 86: {
                    final byte byte2;
                    if ((byte2 = class85.Field2().readByte()) == 1) {
                        ((Class357) Class106.Field19.Field15).Field144 = System.currentTimeMillis();
                        class85.Field2().readByte();
                        Class357.Field145 = 1440;
                        Class357.Field147 = class85.Field2().readUTF();
                        return;
                    }
                    if (byte2 == 0) {
                        ((Class357) Class106.Field19.Field15).Field144 = 0L;
                        Class357.Field145 = 0;
                        Class357.Field147 = "";
                        return;
                    }
                    if (byte2 == 2) {
                        class85.Field2().readByte();
                        ((Class357) Class106.Field19.Field15).Field144 = System.currentTimeMillis();
                        Class357.Field145 = class85.Field2().readInt();
                        Class357.Field147 = class85.Field2().readUTF();
                    }
                    return;
                }
                case 73:
                    Class62.Field8(class85);
                    return;
                case 76:
                    Class62.Field7(class85);
                    return;
                case 71: {
                    class85.Field2().readByte();
                    final short short1 = class85.Field2().readShort();
                    byte byte3 = 0;
                    try {
                        byte3 = class85.Field2().readByte();
                    } catch (final Exception ex2) {
                    }
                    Class106.Field19.Field2(short1, byte3);
                    return;
                }
                case -34: {
                    final short short2 = class85.Field2().readShort();
                    byte byte4 = 0;
                    try {
                        byte4 = class85.Field2().readByte();
                    } catch (final Exception ex3) {
                    }
                    Class106.Field19.Field3(short2, byte4);
                    return;
                }
                case 68:
                    Class106.Field19.Field5(class85.Field2().readShort());
                    Class106.Field7();
                    return;
                case 69:
                    Class106.Field19.Field6(class85.Field2().readShort());
                    Class106.Field7();
                    return;
                case 66: {
                    final byte byte5;
                    if ((byte5 = class85.Field2().readByte()) == 0) {
                        Class106.Field19.Field10(class85.Field2().readShort());
                        return;
                    }
                    if (byte5 == -2) {
                        Class106.Field1("Người bạn mời đang trao đổi với người khác");
                        return;
                    }
                    if (byte5 == 1) {
                        Class106.Field19.Field11(class85.Field2().readShort());
                        return;
                    }
                    if (byte5 == -1) {
                        Class106.Field19.Field12(class85.Field2().readShort());
                        return;
                    }
                    if (byte5 == 2) {
                        Class106.Field19.Field1(class85.Field2().readShort(), class85, class85.Field2().readByte());
                        return;
                    }
                    if (byte5 == 3) {
                        Class106.Field19.Field20();
                        return;
                    }
                    if (byte5 == 4) {
                        Class106.Field19.Field19();
                        return;
                    }
                    if (byte5 == 5) {
                        Class106.Field19.Field18();
                    }
                    return;
                }
                case 67:
                    Class106.Field19.Field1((int) class85.Field2().readShort(), (int) class85.Field2().readByte(), class85.Field2().readShort());
                    return;
                case 60:
                    Class106.Field19.Field6(class85);
                    return;
                case 65:
                    Class106.Field19.Field1(class85.Field2().readShort(), (int) class85.Field2().readByte(), (int) class85.Field2().readByte());
                    return;
                case 2: {
                    final String utf;
                    if ((utf = class85.Field2().readUTF()).startsWith("2")) {
                        final String[] array2;
                        final short[] array = new short[(array2 = new String[class85.Field2().readByte()]).length];
                        final String[] array3 = new String[array2.length];
                        for (int n2 = 0; n2 < array2.length; ++n2) {
                            array2[n2] = class85.Field2().readUTF();
                            array[n2] = class85.Field2().readShort();
                            array3[n2] = class85.Field2().readUTF();
                        }
                        Class106.Field19.Field1(utf.substring(1), array2, array, array3);
                        return;
                    }
                    if (utf.startsWith("3")) {
                        final String utf2 = class85.Field2().readUTF();
                        final String utf3 = class85.Field2().readUTF();
                        MainTab.Field4 = utf2;
                        MainTab.Field5 = utf3;
                        Class837.Field1("provider", utf2);
                        Class837.Field1("agent", utf3);
                        return;
                    }
                    Class106.Field19.Field3(utf);
                    return;
                }
                case 1: {
                    if ((Class357.Field158 = class85.Field2().readByte()) < 3) {
                        Class357.Field158 = 3;
                    }
                    Class62.Field92 = class85.Field2().readShort();
                    Class582.Field42 = new Class647[Class357.Field51 = (short) class85.Field2().readUnsignedByte()];
                    ((Class357) Class106.Field19.Field15).Field123 = new long[Class357.Field51];
                    for (short n3 = 0; n3 < Class357.Field51; ++n3) {
                        Class582.Field42[n3] = new Class647();
                        Class582.Field42[n3].Field5 = (short) class85.Field2().readUnsignedByte();
                        Class582.Field42[n3].Field7 = class85.Field2().readUTF();
                        Class582.Field42[n3].Field8 = class85.Field2().readUTF();
                        Class582.Field42[n3].Field3 = class85.Field2().readShort();
                        Class582.Field42[n3].Field4 = n3;
                        Class582.Field42[n3].Field6 = class85.Field2().readBoolean();
                    }
                    for (int n4 = 0; n4 < Class357.Field124.length; ++n4) {
                        Class357.Field124[n4] = class85.Field2().readByte();
                    }
                    Class62.Field22.removeAllElements();
                    for (int n5 = 0; n5 < 5; ++n5) {
                        final byte byte6 = class85.Field2().readByte();
                        final Vector<Class189> vector = new Vector<Class189>();
                        for (byte b = 0; b < byte6; ++b) {
                            final Class189 class86;
                            (class86 = new Class189()).Field3 = class85.Field2().readByte();
                            class86.Field1 = class85.Field2().readUTF();
                            class86.Field2 = class85.Field2().readUTF();
                            class86.Field4 = class85.Field2().readInt();
                            vector.addElement(class86);
                        }
                        Class62.Field22.addElement(vector);
                    }
                    if (class85.Field2().available() > 0) {
                        Class62.Field47 = class85.Field2().readShort();
                        for (int unsignedByte = class85.Field2().readUnsignedByte(), n6 = 0; n6 < unsignedByte; ++n6) {
                            Class464.Field5().Field59.addElement(new StringBuffer(String.valueOf(class85.Field2().readUnsignedByte())).toString());
                        }
                        for (int n7 = 0; n7 < 5; ++n7) {
                            for (int n8 = 0; n8 < 5; ++n8) {
                                Class357.Field177[n7][n8] = class85.Field2().readByte();
                                Class357.Field178[n7][n8] = class85.Field2().readByte();
                                Class357.Field179[n7][n8] = class85.Field2().readByte();
                                Class357.Field180[n7][n8] = class85.Field2().readByte();
                            }
                        }
                    }
                    Class62.Field50 = class85.Field2().readByte();
                    Class62.Field51 = class85.Field2().readByte();
                    Class62.Field52 = class85.Field2().readByte();
                    Class62.Field53 = class85.Field2().readByte();
                    final byte byte7;
                    Class811.Field55 = new String[byte7 = class85.Field2().readByte()];
                    Class811.Field56 = new byte[byte7];
                    for (byte b2 = 0; b2 < byte7; ++b2) {
                        Class811.Field55[b2] = class85.Field2().readUTF();
                        Class811.Field56[b2] = class85.Field2().readByte();
                    }
                    final String utf4 = class85.Field2().readUTF();
                    if (!Class799.Field4.equals(utf4)) {
                        Class837.Field1("numbersupport", Class799.Field4 = utf4);
                    }
                    final byte byte8 = class85.Field2().readByte();
                    Class62.Field101[0] = new byte[byte8];
                    Class62.Field101[1] = new byte[byte8];
                    Class62.Field102[1] = new int[byte8];
                    Class62.Field102[0] = new int[byte8];
                    for (byte b3 = 0; b3 < byte8; ++b3) {
                        Class62.Field101[0][b3] = class85.Field2().readByte();
                        Class62.Field102[0][b3] = class85.Field2().readInt();
                        Class62.Field101[1][b3] = class85.Field2().readByte();
                        Class62.Field102[1][b3] = class85.Field2().readInt();
                    }
                    final byte byte9;
                    Class115.Field1 = new String[byte9 = class85.Field2().readByte()];
                    Class115.Field2 = new byte[byte9];
                    for (byte b4 = 0; b4 < byte9; ++b4) {
                        Class115.Field2[b4] = class85.Field2().readByte();
                        Class115.Field1[b4] = class85.Field2().readUTF();
                    }
                    MainTab.Field6 = class85.Field2().readUTF();
                    final byte byte10 = class85.Field2().readByte();
                    new StringBuffer(String.valueOf(byte10)).append("tong so tile").toString();
                    for (byte b5 = 0; b5 < byte10; ++b5) {
                        final short short3;
                        final byte[] array4 = new byte[short3 = class85.Field2().readShort()];
                        for (short n9 = 0; n9 < short3; ++n9) {
                            array4[n9] = class85.Field2().readByte();
                        }
                        Class837.Field1(Class106.Field39[b5], array4);
                    }
                    class85.Field2().readByte();
                    try {
                        Class99.Field1.clear();
                        for (byte byte11 = class85.Field2().readByte(), b6 = 0; b6 < byte11; ++b6) {
                            final byte[] array5 = new byte[class85.Field2().readShort()];
                            class85.Field2().read(array5);
                            Class99.Field1((int) b6, array5);
                        }
                    } catch (final Exception ex4) {
                    }
                    return;
                }
                case 3: {
                    final Class582 field15 = Class106.Field19.Field15;
                    try {
                        ((Class678) field15).Field189 = class85.Field2().readShort();
                        ((Class357) field15).Field65 = class85.Field2().readUTF();
                        ((Class357) field15).Field77 = (short) Class21.Field7.Field1(((Class357) field15).Field65);
                        final Class114 class87 = (Class114) field15;
                        final Class114 class88 = (Class114) field15;
                        final int int1 = class85.Field2().readInt();
                        class88.Field2 = int1;
                        class87.Field4 = int1;
                        ((Class114) field15).Field5 = class85.Field2().readInt();
                        ((Class357) field15).Field130 = class85.Field2().readInt();
                        ((Class357) field15).Field129 = class85.Field2().readInt();
                        ((Class357) field15).Field88 = class85.Field2().readByte();
                        ((Class357) field15).Field93 = class85.Field2().readByte();
                        ((Class114) field15).Field19 = class85.Field2().readInt();
                        ((Class114) field15).Field20 = class85.Field2().readInt();
                        ((Class114) field15).Field21 = class85.Field2().readInt();
                        ((Class114) field15).Field13 = class85.Field2().readShort();
                        ((Class114) field15).Field14 = class85.Field2().readShort();
                        ((Class114) field15).Field15 = class85.Field2().readShort();
                        ((Class114) field15).Field24 = class85.Field2().readByte();
                        ((Class114) field15).Field22 = class85.Field2().readByte();
                        ((Class357) field15).Field96 = class85.Field2().readShort();
                        ((Class357) field15).Field80 = class85.Field2().readShort();
                        ((Class357) field15).Field82 = class85.Field2().readShort();
                        ((Class357) field15).Field81 = class85.Field2().readShort();
                        ((Class357) field15).Field83 = class85.Field2().readShort();
                        ((Class357) field15).Field84 = class85.Field2().readShort();
                        ((Class357) field15).Field78 = class85.Field2().readShort();
                        ((Class357) field15).Field79 = class85.Field2().readShort();
                        field15.Field183 = class85.Field2().readInt();
                        ((Class357) field15).Field154 = class85.Field2().readShort();
                        Class357.Field97 = new byte[class85.Field2().readByte()];
                        for (int n10 = 0; n10 < Class357.Field97.length; ++n10) {
                            Class357.Field97[n10] = class85.Field2().readByte();
                        }
                        ((Class678) field15).Field199 = class85.Field2().readShort();
                        if (((Class678) field15).Field199 > 0) {
                            ((Class678) field15).Field207 = true;
                        }
                        ((Class357) field15).Field68 = class85.Field2().readByte();
                        final byte byte12;
                        if ((byte12 = class85.Field2().readByte()) >= 0) {
                            ((Class357) field15).Field167 = (byte) (byte12 - 1);
                        }
                        ((Class357) field15).Field168 = class85.Field2().readByte();
                        ((Class357) field15).Field166 = class85.Field2().readByte();
                        ((Class114) field15).Field17 = class85.Field2().readByte();
                        ((Class678) field15).Field190 = class85.Field2().readShort();
                        if (((Class678) field15).Field190 != -1) {
                            ((Class357) Class106.Field19.Field15).Field57 = class85.Field2().readByte();
                        }
                        if (((Class357) Class106.Field19.Field15).Field57 == 0) {
                            Class357.Field56 = class85.Field2().readBoolean();
                        }
                        ((Class357) field15).Field140 = class85.Field2().readBoolean();
                        field15.Field35 = class85.Field2().readByte();
                        ((Class678) field15).Field201 = class85.Field2().readByte();
                        ((Class678) field15).Field202 = class85.Field2().readByte();
                        ((Class357) field15).Field156 = class85.Field2().readShort();
                        ((Class357) field15).Field155 = class85.Field2().readInt();
                        ((Class357) field15).Field157 = class85.Field2().readShort();
                        field15.Field184 = class85.Field2().readInt();
                        field15.Field185 = class85.Field2().readUTF();
                        ((Class357) field15).Field62 = class85.Field2().readBoolean();
                        int short4;
                        int byte13;
                        try {
                            short4 = class85.Field2().readShort();
                            byte13 = class85.Field2().readByte();
                        } catch (final Exception ex5) {
                            short4 = -1;
                            byte13 = -1;
                        }
                        ((Class357) Class106.Field19.Field15).Field2(short4, byte13);
                        int short5;
                        int byte14;
                        int short6;
                        try {
                            short5 = class85.Field2().readShort();
                            byte14 = class85.Field2().readByte();
                            short6 = class85.Field2().readShort();
                        } catch (final Exception ex6) {
                            short5 = -1;
                            byte14 = -1;
                            short6 = -1;
                        }
                        ((Class357) Class106.Field19.Field15).Field1(short5, byte14, short6);
                        short short7;
                        short short8;
                        short short9;
                        try {
                            short7 = class85.Field2().readShort();
                            short8 = class85.Field2().readShort();
                            short9 = class85.Field2().readShort();
                        } catch (final Exception ex7) {
                            short7 = -1;
                            short8 = -1;
                            short9 = -1;
                        }
                        ((Class357) Class106.Field19.Field15).Field1(short7, short8, short9);
                        try {
                            final byte byte15;
                            final short[] array6 = new short[byte15 = class85.Field2().readByte()];
                            final byte[] array7 = new byte[byte15];
                            for (byte b7 = 0; b7 < byte15; ++b7) {
                                array6[b7] = class85.Field2().readShort();
                                array7[b7] = class85.Field2().readByte();
                            }
                            ((Class357) Class106.Field19.Field15).Field1(array6, array7);
                            final String utf5;
                            if (!(utf5 = class85.Field2().readUTF()).equals("")) {
                                Class464.Field9 = Class809.Field1(utf5, "@");
                            } else {
                                Class464.Field9 = null;
                            }
                        } catch (final Exception ex8) {
                        }
                        short short10;
                        try {
                            short10 = class85.Field2().readShort();
                        } catch (final Exception ex9) {
                            short10 = -1;
                        }
                        ((Class357) Class106.Field19.Field15).Field107 = short10;
                    } catch (final Exception ex10) {
                    }
                    byte byte16;
                    short short11;
                    byte byte17;
                    byte byte18;
                    try {
                        byte16 = class85.Field2().readByte();
                        short11 = class85.Field2().readShort();
                        byte17 = class85.Field2().readByte();
                        byte18 = class85.Field2().readByte();
                    } catch (final Exception ex11) {
                        byte16 = -1;
                        short11 = -1;
                        byte17 = 0;
                        byte18 = 0;
                    }
                    ((Class357) Class106.Field19.Field15).Field110 = byte16;
                    ((Class357) Class106.Field19.Field15).Field115 = short11;
                    ((Class357) Class106.Field19.Field15).Field111 = byte17;
                    ((Class357) Class106.Field19.Field15).Field112 = byte18;
                    byte byte19;
                    short short12;
                    byte byte20;
                    try {
                        byte19 = class85.Field2().readByte();
                        short12 = class85.Field2().readShort();
                        byte20 = class85.Field2().readByte();
                    } catch (final Exception ex12) {
                        byte19 = -1;
                        short12 = -1;
                        byte20 = 0;
                    }
                    ((Class357) Class106.Field19.Field15).Field114 = byte19;
                    ((Class357) Class106.Field19.Field15).Field116 = short12;
                    ((Class357) Class106.Field19.Field15).Field113 = byte20;
                    Class106.Field19.Field10();
                    return;
                }
                case 5: {
                    if (!Class106.Field19.Field17) {
                        return;
                    }
                    final short short13 = class85.Field2().readShort();
                    final Class357 class89;
                    if ((class89 = (Class357) Class106.Field19.Field2(short13)) != null) {
                        ((Class678) class89).Field189 = short13;
                        if (((Class114) class89).Field25 != -1) {
                            ((Class114) class89).Field12 = 0;
                        }
                        class89.Field65 = class85.Field2().readUTF();
                        ((Class678) class89).Field193 = class85.Field2().readShort();
                        ((Class678) class89).Field194 = class85.Field2().readShort();
                        ((Class114) class89).Field4 = class85.Field2().readInt();
                        ((Class114) class89).Field5 = class85.Field2().readInt();
                        class89.Field130 = class85.Field2().readInt();
                        class89.Field129 = class85.Field2().readInt();
                        class89.Field88 = class85.Field2().readByte();
                        class89.Field93 = class85.Field2().readByte();
                        class85.Field2().read(class89.Field133, 0, class89.Field133.length);
                        for (int n11 = 0; n11 < class89.Field133.length; ++n11) {
                            class89.Field135[n11] = class85.Field2().readShort();
                        }
                        ((Class678) class89).Field199 = class85.Field2().readShort();
                        ((Class678) class89).Field200 = class85.Field2().readByte();
                        ((Class114) class89).Field20 = class85.Field2().readShort();
                        ((Class114) class89).Field21 = class85.Field2().readShort();
                        ((Class114) class89).Field22 = class85.Field2().readByte();
                        ((Class114) class89).Field24 = class85.Field2().readByte();
                        final byte byte21;
                        if ((byte21 = class85.Field2().readByte()) >= 0) {
                            class89.Field167 = (byte) (byte21 - 1);
                        }
                        class89.Field168 = class85.Field2().readByte();
                        class89.Field166 = class85.Field2().readByte();
                        ((Class114) class89).Field17 = class85.Field2().readByte();
                        ((Class678) class89).Field190 = class85.Field2().readShort();
                        ((Class114) class89).Field25 = class85.Field2().readByte();
                        if (((Class678) class89).Field190 != -1) {
                            class89.Field57 = class85.Field2().readByte();
                        }
                        class89.Field94 = class85.Field2().readByte();
                        for (int n12 = 0; n12 < class89.Field153.length; ++n12) {
                            class89.Field153[n12] = class85.Field2().readShort();
                        }
                        class89.Field140 = class85.Field2().readBoolean();
                        class89.Field35();
                        Class62.Field1(class89);
                        if (class85.Field2().readBoolean()) {
                            Class106.Field19.Field28.Field21((int) ((Class678) class89).Field189);
                        }
                        ((Class678) class89).Field201 = class85.Field2().readByte();
                        ((Class678) class89).Field202 = class85.Field2().readByte();
                        class89.Field62 = class85.Field2().readBoolean();
                        int short14;
                        int byte22;
                        try {
                            short14 = class85.Field2().readShort();
                            byte22 = class85.Field2().readByte();
                        } catch (final Exception ex13) {
                            short14 = -1;
                            byte22 = -1;
                        }
                        class89.Field2(short14, byte22);
                        int short15;
                        int byte23;
                        int short16;
                        try {
                            short15 = class85.Field2().readShort();
                            byte23 = class85.Field2().readByte();
                            short16 = class85.Field2().readShort();
                        } catch (final Exception ex14) {
                            short15 = -1;
                            byte23 = -1;
                            short16 = -1;
                        }
                        class89.Field1(short15, byte23, short16);
                        short short17;
                        short short18;
                        short short19;
                        try {
                            short17 = class85.Field2().readShort();
                            short18 = class85.Field2().readShort();
                            short19 = class85.Field2().readShort();
                        } catch (final Exception ex15) {
                            short17 = -1;
                            short18 = -1;
                            short19 = -1;
                        }
                        class89.Field1(short17, short18, short19);
                        try {
                            final byte byte24;
                            final short[] array8 = new short[byte24 = class85.Field2().readByte()];
                            final byte[] array9 = new byte[byte24];
                            for (byte b8 = 0; b8 < byte24; ++b8) {
                                array8[b8] = class85.Field2().readShort();
                                array9[b8] = class85.Field2().readByte();
                            }
                            class89.Field1(array8, array9);
                        } catch (final Exception ex16) {
                        }
                        short short20;
                        try {
                            short20 = class85.Field2().readShort();
                        } catch (final Exception ex17) {
                            short20 = -1;
                        }
                        class89.Field107 = short20;
                        byte byte25;
                        short short21;
                        byte byte26;
                        byte byte27;
                        try {
                            byte25 = class85.Field2().readByte();
                            short21 = class85.Field2().readShort();
                            byte26 = class85.Field2().readByte();
                            byte27 = class85.Field2().readByte();
                        } catch (final Exception ex18) {
                            byte25 = -1;
                            short21 = -1;
                            byte26 = 0;
                            byte27 = 0;
                        }
                        class89.Field110 = byte25;
                        class89.Field115 = short21;
                        class89.Field111 = byte26;
                        class89.Field112 = byte27;
                        byte byte28;
                        short short22;
                        byte byte29;
                        try {
                            byte28 = class85.Field2().readByte();
                            short22 = class85.Field2().readShort();
                            byte29 = class85.Field2().readByte();
                        } catch (final Exception ex19) {
                            byte28 = -1;
                            short22 = -1;
                            byte29 = 0;
                        }
                        class89.Field114 = byte28;
                        class89.Field116 = short22;
                        class89.Field113 = byte29;
                    }
                    return;
                }
                case 12: {
                    final short short23 = class85.Field2().readShort();
                    final short short24 = class85.Field2().readShort();
                    final short short25 = class85.Field2().readShort();
                    byte byte30 = -1;
                    try {
                        byte30 = class85.Field2().readByte();
                    } catch (final Exception ex20) {
                        ex20.printStackTrace();
                    }
                    final short short26 = class85.Field2().readShort();
                    final String utf6 = class85.Field2().readUTF();
                    byte[] array10 = null;
                    try {
                        if (class85.Field2().readBoolean()) {
                            int read;
                            int n13;
                            for (read = 0, n13 = 0, array10 = new byte[class85.Field2().available()]; read != -1; read = class85.Field2().read(array10, 0, array10.length - n13), n13 += read) {
                                if (n13 >= array10.length) {
                                    break;
                                }
                            }
                        }
                    } catch (final Exception ex21) {
                    }
                    Class106.Field19.Field1(short23, short24, short25, short26, utf6, array10);
                    Class455.Field11 = byte30;
                    return;
                }
                case 4:
                    while (class85.Field2().available() > 0) {
                        final byte byte31 = class85.Field2().readByte();
                        final short n14 = (short) class85.Field2().readUnsignedByte();
                        final short short27 = class85.Field2().readShort();
                        final short short28 = class85.Field2().readShort();
                        final short short29 = class85.Field2().readShort();
                        final byte byte32 = class85.Field2().readByte();
                        byte byte33 = 0;
                        int int2 = -1;
                        try {
                            int2 = class85.Field2().readInt();
                        } catch (final Exception ex22) {
                        }
                        try {
                            if (byte31 == 1) {
                                byte33 = class85.Field2().readByte();
                            }
                        } catch (final Exception ex23) {
                        }
                        byte byte34 = -1;
                        try {
                            byte34 = class85.Field2().readByte();
                        } catch (final Exception ex24) {
                        }
                        boolean boolean1 = true;
                        try {
                            boolean1 = class85.Field2().readBoolean();
                        } catch (final Exception ex25) {
                        }
                        Class106.Field19.Field1(byte31, n14, short27, short28, short29, byte32, int2, byte33, byte34, boolean1);
                    }
                    return;
                case 8:
                    while (class85.Field2().available() > 0) {
                        Class106.Field19.Field4(class85.Field2().readShort());
                    }
                    return;
                case 7: {
                    final Class184 class90;
                    (class90 = new Class184()).Field1 = class85.Field2().readShort();
                    class90.Field8 = (short) class85.Field2().readUnsignedByte();
                    class90.Field2 = class85.Field2().readShort();
                    class90.Field3 = class85.Field2().readShort();
                    class90.Field5 = class85.Field2().readInt();
                    class90.Field4 = class85.Field2().readByte();
                    class90.Field9 = class85.Field2().readByte();
                    class90.Field6 = class85.Field2().readInt();
                    class90.Field7 = class85.Field2().readInt();
                    Class106.Field19.Field1(class90);
                    return;
                }
                case 6:
                    Class106.Field19.Field1(class85.Field2().readShort(), class85.Field2().readShort(), class85.Field2().readByte(), class85.Field2().readInt(), class85.Field2().readInt(), class85.Field2().readByte(), class85.Field2().readByte(), class85.Field2().readByte(), class85.Field2().readByte());
                    return;
                case 9:
                    Class106.Field19.Field2(class85.Field2().readShort(), class85.Field2().readShort(), class85.Field2().readByte(), class85.Field2().readInt(), class85.Field2().readInt(), class85.Field2().readByte(), class85.Field2().readByte(), class85.Field2().readByte(), class85.Field2().readByte());
                    return;
                case 106:
                    Class106.Field19.Field1(class85);
                    return;
                case 10:
                    Class106.Field19.Field1(class85.Field2().readShort(), class85.Field2().readShort(), class85.Field2().readInt(), class85.Field2().readInt());
                    return;
                case 83:
                    Class106.Field19.Field2(class85);
                    return;
                case 17:
                    try {
                        final Class14 class91;
                        (class91 = new Class14()).Field1 = class85.Field2().readShort();
                        class91.Field2 = class85.Field2().readShort();
                        class91.Field3 = class85.Field2().readByte();
                        class91.Field5 = class85.Field2().readInt();
                        class91.Field6 = class85.Field2().readByte();
                        class91.Field4 = new Class234[class85.Field2().readByte()];
                        for (int n15 = 0; n15 < class91.Field4.length; ++n15) {
                            class91.Field4[n15] = new Class234();
                            class91.Field4[n15].Field1 = class85.Field2().readByte();
                            final String string = String.valueOf(class91.Field4[n15].Field1) + "_";
                            class91.Field4[n15].Field2 = class85.Field2().readShort();
                            final String string2 = String.valueOf(string) + class91.Field4[n15].Field2 + "_";
                            class91.Field4[n15].Field3 = class85.Field2().readShort();
                            final String string3 = String.valueOf(string2) + class91.Field4[n15].Field3 + "_";
                            class91.Field4[n15].Field4 = class85.Field2().readShort();
                            final String string4 = String.valueOf(string3) + class91.Field4[n15].Field4 + "_";
                            class91.Field4[n15].Field5 = class85.Field2().readShort();
                            new StringBuffer(String.valueOf(string4)).append(class91.Field4[n15].Field5).append("_").toString();
                        }
                        if (class85.Field2().available() > 0) {
                            class91.Field7 = class85.Field2().readByte();
                        }
                        if (class85.Field2().available() > 0) {
                            class85.Field2().readByte();
                        }
                        if (class85.Field2().available() > 0) {
                            class91.Field8 = class85.Field2().readByte();
                        }
                        Class106.Field19.Field1(class91);
                    } catch (final Exception ex26) {
                        new StringBuffer("LOI TRONG HAM NHAN DATA ").append(ex26.toString()).toString();
                    }
                    return;
                case 64: {
                    final Class234[] array11 = new Class234[class85.Field2().readByte()];
                    for (int n16 = 0; n16 < array11.length; ++n16) {
                        array11[n16] = new Class234();
                        array11[n16].Field1 = class85.Field2().readByte();
                        array11[n16].Field2 = class85.Field2().readByte();
                        array11[n16].Field3 = class85.Field2().readShort();
                        array11[n16].Field4 = class85.Field2().readShort();
                        array11[n16].Field5 = class85.Field2().readShort();
                    }
                    return;
                }
                case 11:
                    Class106.Field19.Field11();
                    return;
                case 13: {
                    final byte byte35 = class85.Field2().readByte();
                    if (byte35 == -1) {
                        Class106.Field1(class85.Field2().readUTF());
                        return;
                    }
                    final Class582[] array12 = new Class582[byte35];
                    for (byte b9 = 0; b9 < byte35; ++b9) {
                        array12[b9] = new Class582();
                        ((Class357) array12[b9]).Field55 = class85.Field2().readInt();
                        ((Class357) array12[b9]).Field65 = class85.Field2().readUTF();
                        ((Class357) array12[b9]).Field88 = class85.Field2().readByte();
                        for (byte byte36 = class85.Field2().readByte(), b10 = 0; b10 < byte36; ++b10) {
                            final byte byte37 = class85.Field2().readByte();
                            final byte byte38 = class85.Field2().readByte();
                            if (byte37 == 0) {
                                ((Class357) array12[b9]).Field85 = byte38;
                            } else if (byte37 == 1) {
                                ((Class357) array12[b9]).Field86 = byte38;
                            } else if (byte37 == 2) {
                                ((Class357) array12[b9]).Field87 = byte38;
                            } else if (byte37 == 3 || byte37 == 4 || byte37 == 5 || byte37 == 6 || byte37 == 7) {
                                ((Class357) array12[b9]).Field118 = byte37;
                                ((Class357) array12[b9]).Field117 = byte38;
                            } else if (byte37 == 19) {
                                ((Class357) array12[b9]).Field89 = byte38;
                            }
                        }
                        array12[b9].Field45 = class85.Field2().readShort();
                        ((Class357) array12[b9]).Field54 = class85.Field2().readByte();
                        ((Class678) array12[b9]).Field201 = class85.Field2().readByte();
                        array12[b9].Field50 = class85.Field2().readShort();
                        if (class85.Field2().readByte() != -1) {
                            final short short30;
                            final byte[] array13 = new byte[short30 = class85.Field2().readShort()];
                            for (short n17 = 0; n17 < short30; ++n17) {
                                array13[n17] = class85.Field2().readByte();
                            }
                            final short short31;
                            final byte[] array14 = new byte[short31 = class85.Field2().readShort()];
                            for (short n18 = 0; n18 < short31; ++n18) {
                                array14[n18] = class85.Field2().readByte();
                            }
                            ((Class357) array12[b9]).Field102 = Class811.Field1(array13, array14);
                            ((Class357) array12[b9]).Field104 = class85.Field2().readByte();
                            ((Class357) array12[b9]).Field105 = class85.Field2().readByte();
                        }
                    }
                    for (byte b11 = 0; b11 < byte35; ++b11) {
                        int int3;
                        try {
                            int3 = class85.Field2().readInt();
                        } catch (final Exception ex27) {
                            int3 = -1;
                        }
                        if (int3 != -1 && ((Class357) array12[b11]).Field55 == int3) {
                            short short32;
                            byte byte39;
                            byte byte40;
                            short short33;
                            byte byte41;
                            byte byte42;
                            short short34;
                            short byte43;
                            byte byte44;
                            try {
                                short32 = class85.Field2().readShort();
                                byte39 = class85.Field2().readByte();
                                byte40 = class85.Field2().readByte();
                                short33 = class85.Field2().readShort();
                                byte41 = class85.Field2().readByte();
                                byte42 = class85.Field2().readByte();
                                short34 = class85.Field2().readShort();
                                byte43 = class85.Field2().readByte();
                                byte44 = class85.Field2().readByte();
                            } catch (final Exception ex28) {
                                short32 = -1;
                                byte39 = -1;
                                byte40 = -1;
                                short33 = -1;
                                byte41 = -1;
                                byte42 = -1;
                                short34 = -1;
                                byte43 = -1;
                                byte44 = -1;
                            }
                            ((Class357) array12[b11]).Field116 = short32;
                            ((Class357) array12[b11]).Field114 = byte39;
                            ((Class357) array12[b11]).Field113 = byte40;
                            ((Class357) array12[b11]).Field115 = short33;
                            ((Class357) array12[b11]).Field110 = byte41;
                            ((Class357) array12[b11]).Field112 = byte42;
                            ((Class357) array12[b11]).Field109 = short34;
                            ((Class357) array12[b11]).Field108 = byte43;
                            ((Class357) array12[b11]).Field111 = byte44;
                        }
                    }
                    Class185.Field5().Field1(array12);
                    ((Class671) Class185.Field5()).Field1();
                    return;
                }
                case 15: {
                    if (class85.Field2().readByte() == 0) {
                        final Vector vector2 = new Vector();
                        final short short35 = class85.Field2().readShort();
                        for (byte byte45 = class85.Field2().readByte(), b12 = 0; b12 < byte45; ++b12) {
                            final Class534 class92 = new Class534();
                            final Class534 class94;
                            final Class534 class93 = class94 = class92;
                            final byte byte46 = class85.Field2().readByte();
                            class94.Field30 = byte46;
                            class92.Field13 = byte46;
                            class93.Field9 = class85.Field2().readShort();
                            class93.Field18 = class85.Field2().readShort();
                            class93.Field19 = class85.Field2().readByte();
                            class93.Field25 = class85.Field2().readByte();
                            class93.Field22 = class85.Field2().readShort();
                            class93.Field21 = class85.Field2().readShort();
                            class93.Field37 = class85.Field2().readByte();
                            class93.Field38 = class85.Field2().readByte();
                            class93.Field14 = class85.Field2().readByte();
                            class93.Field15 = class85.Field2().readByte();
                            class93.Field16 = class85.Field2().readByte();
                            class93.Field17 = class85.Field2().readByte();
                            class93.Field29 = class85.Field2().readByte();
                            class93.Field4 = class85.Field2().readUTF();
                            class93.Field34.removeAllElements();
                            class93.Field24 = System.currentTimeMillis();
                            class93.Field23 = class85.Field2().readUnsignedShort();
                            for (byte byte47 = class85.Field2().readByte(), b13 = 0; b13 < byte47; ++b13) {
                                class93.Field34.addElement(new Class826((short) class85.Field2().readUnsignedByte(), class85.Field2().readShort()));
                            }
                            class93.Field32 = true;
                            vector2.addElement(class93);
                        }
                        final byte byte48 = class85.Field2().readByte();
                        final short[] array15 = {-1, -1, -1, -1, -1};
                        for (int n19 = 0; n19 < array15.length; ++n19) {
                            array15[n19] = class85.Field2().readShort();
                        }
                        final byte byte49 = class85.Field2().readByte();
                        byte byte50 = 0;
                        String utf7 = "";
                        if (byte49 != -1) {
                            utf7 = class85.Field2().readUTF();
                            byte50 = class85.Field2().readByte();
                        }
                        final byte byte51 = class85.Field2().readByte();
                        Object o = null;
                        if (byte51 != -1) {
                            ((Class145) (o = new Class145())).Field43 = class85.Field2().readByte();
                            ((Class145) o).Field44 = class85.Field2().readByte();
                            ((Class145) o).Field38 = class85.Field2().readByte();
                            ((Class145) o).Field50 = class85.Field2().readUTF();
                            ((Class145) o).Field47 = class85.Field2().readInt();
                            ((Class145) o).Field49 = System.currentTimeMillis();
                            final Class145 class95 = (Class145) o;
                            final Class145 class96 = (Class145) o;
                            final byte b14 = 0;
                            class96.Field46 = b14;
                            class95.Field45 = b14;
                            ((Class678) o).Field188 = 12;
                        }
                        Class106.Field19.Field1(short35, vector2, byte48, byte49, utf7, (Class145) o, array15, byte50);
                        return;
                    }
                    final Vector vector3 = new Vector();
                    final short short36 = class85.Field2().readShort();
                    final byte byte52;
                    if ((byte52 = class85.Field2().readByte()) > -1) {
                        for (byte b15 = 0; b15 < byte52; ++b15) {
                            final Class534 class97 = new Class534();
                            final Class534 class99;
                            final Class534 class98 = class99 = class97;
                            final byte byte53 = class85.Field2().readByte();
                            class99.Field30 = byte53;
                            class97.Field13 = byte53;
                            class98.Field9 = class85.Field2().readShort();
                            class98.Field18 = class85.Field2().readShort();
                            class98.Field19 = class85.Field2().readByte();
                            class98.Field25 = class85.Field2().readByte();
                            class98.Field22 = class85.Field2().readShort();
                            class98.Field21 = class85.Field2().readShort();
                            class98.Field37 = class85.Field2().readByte();
                            class98.Field38 = class85.Field2().readByte();
                            class98.Field14 = class85.Field2().readByte();
                            class98.Field15 = class85.Field2().readByte();
                            class98.Field16 = class85.Field2().readByte();
                            class98.Field17 = class85.Field2().readByte();
                            class98.Field29 = class85.Field2().readByte();
                            class98.Field4 = class85.Field2().readUTF();
                            class98.Field34.removeAllElements();
                            for (byte byte54 = class85.Field2().readByte(), b16 = 0; b16 < byte54; ++b16) {
                                class98.Field34.addElement(new Class826((short) class85.Field2().readUnsignedByte(), class85.Field2().readShort()));
                            }
                            class98.Field32 = true;
                            vector3.addElement(class98);
                        }
                        final byte byte55 = class85.Field2().readByte();
                        Image field16 = null;
                        int width = 0;
                        int n20 = 0;
                        byte b17 = 1;
                        final byte[] array16 = new byte[class85.Field2().available()];
                        while (class85.Field2().available() > 0) {
                            class85.Field2().read(array16, 0, array16.length);
                        }
                        if (array16.length > 0) {
                            field16 = Class811.Field2(array16);
                            b17 = (byte) ((byte55 == 3) ? 3 : 6);
                            if (field16 != null) {
                                width = field16.getWidth();
                                n20 = field16.getHeight() / byte55;
                            }
                        }
                        Class464.Field5().Field10 = 0;
                        Class106.Field19.Field1(short36, vector3, field16, byte55, width, n20, b17);
                    }
                    return;
                }
                case 16: {
                    final byte byte56 = class85.Field2().readByte();
                    final int[] array17 = new int[Class357.Field51];
                    long long1 = 0L;
                    try {
                        if (byte56 == 0) {
                            long1 = class85.Field2().readLong();
                            array17[0] = 0;
                            for (int unsignedByte2 = class85.Field2().readUnsignedByte(), n21 = 0; n21 < unsignedByte2; ++n21) {
                                final int unsignedByte3 = class85.Field2().readUnsignedByte();
                                array17[unsignedByte3] = (Class582.Field42[unsignedByte3].Field1 = class85.Field2().readInt());
                            }
                        }
                        final Vector<Class534> vector4 = new Vector<Class534>();
                        if (byte56 == 1) {
                            for (short short37 = class85.Field2().readShort(), n22 = 0; n22 < short37; ++n22) {
                                final Class534 class100;
                                (class100 = new Class534()).Field13 = class85.Field2().readByte();
                                class100.Field9 = class85.Field2().readShort();
                                class100.Field18 = class85.Field2().readShort();
                                class100.Field19 = class85.Field2().readByte();
                                class100.Field25 = class85.Field2().readByte();
                                class100.Field22 = class85.Field2().readShort();
                                class100.Field21 = class85.Field2().readShort();
                                class100.Field30 = class85.Field2().readByte();
                                class100.Field35 = class85.Field2().readByte();
                                class100.Field36 = class85.Field2().readByte();
                                class100.Field37 = class85.Field2().readByte();
                                class100.Field14 = class85.Field2().readByte();
                                class100.Field15 = class85.Field2().readByte();
                                class100.Field16 = class85.Field2().readByte();
                                class100.Field17 = class85.Field2().readByte();
                                class100.Field29 = class85.Field2().readByte();
                                class100.Field4 = class85.Field2().readUTF();
                                class100.Field34.removeAllElements();
                                class100.Field24 = System.currentTimeMillis();
                                class100.Field23 = class85.Field2().readUnsignedShort();
                                for (byte byte57 = class85.Field2().readByte(), b18 = 0; b18 < byte57; ++b18) {
                                    class100.Field34.addElement(new Class826((short) class85.Field2().readUnsignedByte(), class85.Field2().readShort()));
                                }
                                class100.Field8 = class85.Field2().readByte();
                                class100.Field32 = true;
                                vector4.addElement(class100);
                            }
                        }
                        ((Class357) Class106.Field19.Field15).Field100 = class85.Field2().readInt();
                        final Vector vector5 = new Vector();
                        if (byte56 == 2) {
                            for (byte byte58 = class85.Field2().readByte(), b19 = 0; b19 < byte58; ++b19) {
                                final Class42 class101;
                                (class101 = new Class42()).Field5 = class85.Field2().readShort();
                                class85.Field2().readByte();
                                class101.Field8 = class85.Field2().readByte();
                                class101.Field3 = class85.Field2().readByte();
                                class101.Field2 = class85.Field2().readUTF();
                                class101.Field1 = class85.Field2().readUTF();
                                class101.Field4 = class85.Field2().readByte();
                                vector5.addElement(class101);
                            }
                            for (byte byte59 = class85.Field2().readByte(), b20 = 0; b20 < byte59; ++b20) {
                                final Class42 class102;
                                (class102 = new Class42()).Field5 = class85.Field2().readShort();
                                class85.Field2().readByte();
                                class102.Field8 = class85.Field2().readByte();
                                class102.Field2 = class85.Field2().readUTF();
                                class85.Field2().readByte();
                                class102.Field1 = class85.Field2().readUTF();
                                class102.Field7 = class85.Field2().readInt();
                                class102.Field6 = System.currentTimeMillis();
                                class102.Field4 = class85.Field2().readByte();
                                vector5.addElement(class102);
                            }
                        }
                        if (byte56 == 3) {
                            Class582.Field43 = new short[class85.Field2().readByte()];
                            for (int n23 = 0; n23 < Class582.Field43.length; ++n23) {
                                Class582.Field43[n23] = class85.Field2().readShort();
                            }
                        }
                        ((Class357) Class106.Field19.Field15).Field101 = class85.Field2().readInt();
                        Class106.Field19.Field1(long1, array17, (Vector) vector4, vector5, (int) byte56);
                    } catch (final Exception ex29) {
                        new StringBuffer("LOI CHARINVENTORY ").append(byte56).append(ex29.toString()).toString();
                    }
                    return;
                }
                case 18: {
                    final short short38 = class85.Field2().readShort();
                    final Class534 class103 = new Class534();
                    final Class534 class105;
                    final Class534 class104 = class105 = class103;
                    final byte byte60 = class85.Field2().readByte();
                    class105.Field13 = byte60;
                    class103.Field30 = byte60;
                    class104.Field11 = class85.Field2().readShort();
                    class104.Field9 = class85.Field2().readShort();
                    class104.Field18 = class85.Field2().readShort();
                    class104.Field19 = class85.Field2().readByte();
                    class104.Field25 = class85.Field2().readByte();
                    class104.Field21 = class85.Field2().readShort();
                    class104.Field22 = class85.Field2().readShort();
                    Class106.Field19.Field1(short38, class104);
                    return;
                }
                case 19:
                    Class106.Field19.Field1(class85.Field2().readShort(), class85.Field2().readShort(), (short) class85.Field2().readUnsignedByte(), class85.Field2().readShort());
                    return;
                case -65:
                    try {
                        Class106.Field19.Field2(class85.Field2().readShort(), class85.Field2().readShort(), class85.Field2().readByte());
                    } catch (final Exception ex30) {
                    }
                    return;
                case -41:
                    Class106.Field19.Field1(class85.Field2().readShort(), class85.Field2().readShort(), class85.Field2().readByte());
                    return;
                case 21: {
                    final Class534 class106;
                    (class106 = new Class534()).Field9 = class85.Field2().readShort();
                    class106.Field21 = class85.Field2().readShort();
                    class106.Field30 = class85.Field2().readByte();
                    class106.Field23 = class85.Field2().readUnsignedShort();
                    class106.Field34.removeAllElements();
                    for (byte byte61 = class85.Field2().readByte(), b21 = 0; b21 < byte61; ++b21) {
                        class106.Field34.addElement(new Class826((short) class85.Field2().readUnsignedByte(), class85.Field2().readShort()));
                    }
                    class106.Field19 = class85.Field2().readByte();
                    try {
                        class106.Field29 = class85.Field2().readByte();
                    } catch (final Exception ex31) {
                    }
                    Class106.Field19.Field1(class106);
                    return;
                }
                case 22: {
                    final short short39 = class85.Field2().readShort();
                    final byte byte62 = class85.Field2().readByte();
                    final short short40 = class85.Field2().readShort();
                    final int int4 = class85.Field2().readInt();
                    int byte63 = 0;
                    try {
                        byte63 = class85.Field2().readByte();
                    } catch (final Exception ex32) {
                    }
                    Class106.Field19.Field1(short39, byte62, short40, int4, byte63);
                    return;
                }
                case 23: {
                    final byte byte64;
                    if ((byte64 = class85.Field2().readByte()) == 0) {
                        final byte byte65;
                        final byte[] array18 = new byte[byte65 = class85.Field2().readByte()];
                        for (byte b22 = 0; b22 < byte65; ++b22) {
                            array18[b22] = class85.Field2().readByte();
                        }
                        Class106.Field19.Field1(array18);
                    }
                    if (byte64 == 1) {
                        final byte byte66 = class85.Field2().readByte();
                        Class464.Field5().Field23 = byte66;
                        final Vector<Class534> vector6 = new Vector<Class534>();
                        for (short short41 = class85.Field2().readShort(), n24 = 0; n24 < short41; ++n24) {
                            final Class534 class107;
                            (class107 = new Class534()).Field32 = true;
                            class107.Field27 = true;
                            final short short42 = class85.Field2().readShort();
                            if (byte66 == -1) {
                                class107.Field13 = (byte) Field1(short42);
                            } else {
                                class107.Field13 = byte66;
                            }
                            class107.Field18 = short42;
                            class107.Field30 = (byte) ((byte66 == -1) ? Field1(short42) : byte66);
                            final Class805 field17 = Class811.Field2((int) short42);
                            class107.Field25 = field17.Field6;
                            class107.Field21 = field17.Field7;
                            vector6.addElement(class107);
                        }
                        try {
                            Class534.Field39 = 2;
                            Class534.Field39 = class85.Field2().readByte();
                        } catch (final Exception ex33) {
                        }
                        Class106.Field19.Field2((Vector) vector6);
                    }
                    try {
                        if (byte64 == 2) {
                            final Vector<Class534> vector7 = new Vector<Class534>();
                            for (byte byte67 = class85.Field2().readByte(), b23 = 0; b23 < byte67; ++b23) {
                                final Class534 class108 = new Class534();
                                final byte byte68 = class85.Field2().readByte();
                                class108.Field9 = class85.Field2().readShort();
                                short short43;
                                if ((short43 = class85.Field2().readShort()) < 0) {
                                    short43 += 256;
                                }
                                class108.Field13 = byte68;
                                class108.Field18 = short43;
                                class108.Field19 = class85.Field2().readByte();
                                class108.Field25 = class85.Field2().readByte();
                                class108.Field22 = class85.Field2().readShort();
                                class108.Field21 = class85.Field2().readShort();
                                class108.Field30 = byte68;
                                vector7.addElement(class108);
                            }
                            Class106.Field19.Field1((Vector) vector7);
                        }
                    } catch (final Exception ex34) {
                        ex34.printStackTrace();
                    }
                    if (byte64 == 3) {
                        Class106.Field19.Field16();
                    }
                    if (byte64 == 4) {
                        final byte byte69;
                        final byte[] array19 = new byte[(byte69 = class85.Field2().readByte()) + 2];
                        for (byte b24 = 0; b24 < byte69; ++b24) {
                            array19[b24] = class85.Field2().readByte();
                        }
                        array19[byte69] = class85.Field2().readByte();
                        array19[byte69 + 1] = class85.Field2().readByte();
                        Class106.Field19.Field2(array19);
                    }
                    return;
                }
                case 25: {
                    final int unsignedByte4 = class85.Field2().readUnsignedByte();
                    Class805.Field16.clear();
                    for (int n25 = 0; n25 < unsignedByte4; ++n25) {
                        Class805.Field16.put(new StringBuffer(String.valueOf(n25)).toString(), new Class331((short) class85.Field2().readUnsignedByte(), class85.Field2().readUTF(), class85.Field2().readByte(), class85.Field2().readByte()));
                    }
                    for (byte byte70 = class85.Field2().readByte(), b25 = 0; b25 < byte70; ++b25) {
                        Class811.Field48[b25] = new Class121(class85.Field2().readShort(), class85.Field2().readShort());
                    }
                    for (int n26 = 0; n26 < 5; ++n26) {
                        Class811.Field44[n26] = class85.Field2().readByte();
                    }
                    final short short44;
                    final Class805[] array20 = new Class805[(short44 = class85.Field2().readShort()) + 1];
                    for (short n27 = 0; n27 < short44; ++n27) {
                        final short short45 = class85.Field2().readShort();
                        try {
                            array20[short45] = new Class805();
                            array20[short45].Field13 = short45;
                            array20[short45].Field1 = class85.Field2().readUTF();
                            array20[short45].Field3 = class85.Field2().readByte();
                            array20[short45].Field4 = class85.Field2().readByte();
                            class85.Field2().readByte();
                            array20[short45].Field5 = class85.Field2().readByte();
                            array20[short45].Field6 = class85.Field2().readByte();
                            array20[short45].Field7 = class85.Field2().readShort();
                            for (int n28 = 0; n28 < 10; ++n28) {
                                array20[short45].Field11[n28] = class85.Field2().readShort();
                            }
                            array20[short45].Field10 = class85.Field2().readInt();
                            array20[short45].Field12 = class85.Field2().readByte();
                            array20[short45].Field15 = class85.Field2().readByte();
                            array20[short45].Field8 = class85.Field2().readShort();
                            array20[short45].Field9 = class85.Field2().readShort();
                        } catch (final Exception ex35) {
                            ex35.printStackTrace();
                        }
                    }
                    Class811.Field4.addElement(array20);
                    final short short46 = class85.Field2().readShort();
                    Class811.Field5.removeAllElements();
                    for (short n29 = 0; n29 < short46; ++n29) {
                        final Class750 class109;
                        (class109 = new Class750()).Field15 = class85.Field2().readShort();
                        class109.Field12 = class85.Field2().readByte();
                        class109.Field18 = class85.Field2().readInt();
                        class109.Field10 = class85.Field2().readUTF();
                        final String substring = class109.Field10.substring(class109.Field10.length() - 1);
                        class109.Field11 = class85.Field2().readUTF();
                        class109.Field8 = class85.Field2().readByte();
                        try {
                            final int int5;
                            if ((int5 = Integer.parseInt(substring)) >= 4 && class109.Field8 != 4) {
                                class109.Field19 = (byte) (int5 - 4);
                            }
                        } catch (final Exception ex36) {
                        }
                        class109.Field17 = class85.Field2().readBoolean();
                        class109.Field9 = class85.Field2().readByte();
                        class109.Field16 = class85.Field2().readByte();
                        Class811.Field5.addElement(class109);
                    }
                    final int unsignedByte5 = class85.Field2().readUnsignedByte();
                    Class811.Field6.removeAllElements();
                    for (int n30 = 0; n30 < unsignedByte5; ++n30) {
                        final Class750 class110;
                        (class110 = new Class750()).Field15 = (short) class85.Field2().readUnsignedByte();
                        class110.Field12 = (short) class85.Field2().readUnsignedByte();
                        class110.Field18 = class85.Field2().readInt();
                        class110.Field10 = class85.Field2().readUTF();
                        class110.Field11 = class85.Field2().readUTF();
                        class110.Field16 = class85.Field2().readByte();
                        class110.Field7 = class85.Field2().readByte();
                        class110.Field17 = class85.Field2().readBoolean();
                        class110.Field13 = class85.Field2().readShort();
                        Class811.Field6.addElement(class110);
                    }
                    return;
                }
                case 26: {
                    Class811.Field46 = new Class50[class85.Field2().readUnsignedByte()];
                    final byte[] array21 = new byte[class85.Field2().readShort()];
                    class85.Field2().read(array21);
                    Class811.Field1(array21);
                    try {
                        final short n31;
                        final byte[][] array22 = new byte[n31 = (short) class85.Field2().readUnsignedByte()][];
                        for (short n32 = 0; n32 < n31; ++n32) {
                            array22[n32] = new byte[class85.Field2().readShort()];
                            class85.Field2().read(array22[n32]);
                        }
                        Class48.Field1(array22);
                    } catch (final Exception ex37) {
                        ex37.printStackTrace();
                    }
                    try {
                        for (short n33 = (short) class85.Field2().readUnsignedByte(), n34 = 0; n34 < n33; ++n34) {
                            final short short47 = class85.Field2().readShort();
                            final byte[] array23 = new byte[class85.Field2().readShort()];
                            class85.Field2().read(array23);
                            Class124.Field1.put(new StringBuffer().append(short47).toString(), new Class135(array23, (int) short47));
                        }
                    } catch (final Exception ex38) {
                    }
                    try {
                        for (int unsignedByte6 = class85.Field2().readUnsignedByte(), n35 = 0; n35 < unsignedByte6; ++n35) {
                            final short short48 = class85.Field2().readShort();
                            final byte[] array24 = new byte[class85.Field2().readShort()];
                            class85.Field2().read(array24);
                            Class269.Field6.put(new StringBuffer(String.valueOf(short48)).toString(), new Class347((int) short48, array24));
                        }
                    } catch (final Exception ex39) {
                    }
                    try {
                        final byte byte71;
                        Class357.Field172 = new byte[byte71 = class85.Field2().readByte()][];
                        Class357.Field173 = new byte[byte71][];
                        for (byte b26 = 0; b26 < byte71; ++b26) {
                            Class357.Field172[b26] = new byte[4];
                            Class357.Field173[b26] = new byte[4];
                            for (int n36 = 0; n36 < 4; ++n36) {
                                Class357.Field172[b26][n36] = class85.Field2().readByte();
                            }
                            for (int n37 = 0; n37 < 4; ++n37) {
                                Class357.Field173[b26][n37] = class85.Field2().readByte();
                            }
                        }
                    } catch (final Exception ex40) {
                        Class357.Field172 = new byte[][]{{0, 0, 7, -7}};
                        Class357.Field173 = new byte[][]{{-20, -15, -15, -15}};
                    }
                    try {
                        for (int n38 = 0; n38 < 2; ++n38) {
                            final byte byte72 = class85.Field2().readByte();
                            Class357.Field174[n38] = new byte[byte72];
                            for (byte b27 = 0; b27 < byte72; ++b27) {
                                Class357.Field174[n38][b27] = class85.Field2().readByte();
                            }
                        }
                    } catch (final Exception ex41) {
                        Class357.Field174 = new byte[][]{new byte[1], new byte[1]};
                    }
                    try {
                        for (int n39 = 0; n39 < 2; ++n39) {
                            final byte byte73 = class85.Field2().readByte();
                            Class357.Field175[n39] = new byte[byte73];
                            for (byte b28 = 0; b28 < byte73; ++b28) {
                                Class357.Field175[n39][b28] = class85.Field2().readByte();
                            }
                        }
                    } catch (final Exception ex42) {
                        Class357.Field175 = new byte[][]{new byte[1], new byte[1]};
                    }
                    try {
                        for (int n40 = 0; n40 < 2; ++n40) {
                            final byte byte74 = class85.Field2().readByte();
                            Class357.Field176[n40] = new byte[byte74];
                            for (byte b29 = 0; b29 < byte74; ++b29) {
                                Class357.Field176[n40][b29] = class85.Field2().readByte();
                            }
                        }
                    } catch (final Exception ex43) {
                        Class357.Field176 = new byte[][]{new byte[1], new byte[1]};
                    }
                    return;
                }
                case 100:
                    Class62.Field26(class85);
                    return;
                case 58: {
                    final byte byte75;
                    final int[] array25 = new int[byte75 = class85.Field2().readByte()];
                    for (byte b30 = 0; b30 < byte75; ++b30) {
                        array25[b30] = class85.Field2().readShort();
                    }
                    return;
                }
                case 24:
                    Class106.Field7();
                    return;
                case 27:
                    Class106.Field19.Field1(class85.Field2().readShort(), class85.Field2().readUTF());
                    return;
                case 28:
                    Class106.Field19.Field7(class85.Field2().readShort());
                    return;
                case 78:
                    Class106.Field19.Field8(class85.Field2().readShort());
                    return;
                case 61: {
                    final short short49 = class85.Field2().readShort();
                    final short short50 = class85.Field2().readShort();
                    final Class234 class111;
                    (class111 = new Class234()).Field1 = class85.Field2().readByte();
                    class111.Field2 = class85.Field2().readByte();
                    class111.Field3 = class85.Field2().readShort();
                    class111.Field4 = class85.Field2().readShort();
                    class111.Field5 = class85.Field2().readShort();
                    Class106.Field19.Field1(short49, short50, class111);
                    return;
                }
                case 30: {
                    final short short51 = class85.Field2().readShort();
                    final short short52 = class85.Field2().readShort();
                    final int int6 = class85.Field2().readInt();
                    Class106.Field19.Field1(short51, short52, int6);
                    Class677.Field1(int6);
                    return;
                }
                case 32: {
                    final short short53 = class85.Field2().readShort();
                    final byte byte76;
                    final Class797[] array26 = new Class797[byte76 = class85.Field2().readByte()];
                    for (byte b31 = 0; b31 < byte76; ++b31) {
                        array26[b31] = new Class797();
                        array26[b31].Field2 = class85.Field2().readUTF();
                        array26[b31].Field1 = class85.Field2().readInt();
                    }
                    if (short53 == ((Class678) Class106.Field19.Field15).Field189) {
                        ((Class114) Class106.Field19.Field15).Field22 = class85.Field2().readByte();
                        ((Class357) Class106.Field19.Field15).Field96 = class85.Field2().readShort();
                    }
                    Class106.Field19.Field1(short53, array26);
                    return;
                }
                case 33:
                    Class106.Field19.Field1(class85.Field2().readShort(), class85.Field2().readByte(), class85.Field2().readInt(), class85.Field2().readInt());
                    return;
                case 35:
                    Class599.Field6 = new short[1][15][11];
                    for (int n41 = 0; n41 < 15; ++n41) {
                        for (int n42 = 0; n42 < 11; ++n42) {
                            Class599.Field6[0][n41][n42] = class85.Field2().readShort();
                        }
                    }
                    Class599.Field8 = new int[1][15][11];
                    for (int n43 = 0; n43 < 15; ++n43) {
                        for (int n44 = 0; n44 < 11; ++n44) {
                            Class599.Field8[0][n43][n44] = class85.Field2().readShort() * 100;
                        }
                    }
                    Class599.Field10 = new short[1][15];
                    for (int n45 = 0; n45 < 15; ++n45) {
                        Class599.Field10[0][n45] = class85.Field2().readShort();
                    }
                    Class599.Field9 = new short[1][15][11];
                    for (int n46 = 0; n46 < 15; ++n46) {
                        for (int n47 = 0; n47 < 11; ++n47) {
                            Class599.Field9[0][n46][n47] = (short) class85.Field2().readUnsignedByte();
                        }
                    }
                    Class599.Field7 = new short[15][11];
                    for (int n48 = 0; n48 < 15; ++n48) {
                        for (int n49 = 0; n49 < 11; ++n49) {
                            Class599.Field7[n48][n49] = class85.Field2().readShort();
                        }
                    }
                    Class599.Field2 = new byte[15][11];
                    for (int n50 = 0; n50 < 15; ++n50) {
                        for (int n51 = 0; n51 < 11; ++n51) {
                            Class599.Field2[n50][n51] = class85.Field2().readByte();
                        }
                    }
                    Class599.Field5 = new byte[5][];
                    for (int n52 = 0; n52 < 5; ++n52) {
                        Class599.Field5[n52] = new byte[class85.Field2().readByte()];
                        for (int n53 = 0; n53 < Class599.Field5[n52].length; ++n53) {
                            Class599.Field5[n52][n53] = class85.Field2().readByte();
                        }
                    }
                    return;
                case 14:
                    Class106.Field1("Xin chọn tên nhân vật khác");
                    return;
                case 34:
                    Class106.Field7();
                    return;
                case 36:
                    Class106.Field7();
                    return;
                case 48:
                    Class106.Field19.Field9(class85.Field2().readShort());
                    return;
                case 49:
                    Class106.Field19.Field3(class85);
                    return;
                case 50:
                    Class106.Field19.Field4(class85);
                    return;
                case 38:
                    Class62.Field27.addElement(class85.Field2().readUTF());
                    return;
                case 37: {
                    final String utf8 = class85.Field2().readUTF();
                    final String utf9;
                    if ((utf9 = class85.Field2().readUTF()).equals("")) {
                        Class106.Field1(utf8);
                        return;
                    }
                    Class106.Field19.Field84 = true;
                    final Class221 class112 = new Class221(this, utf9);
                    Class106.Field24.Field1 = false;
                    Class106.Field24.Field1(utf8, new Class86("OK", (Class256) class112), new Class86("", (Class256) class112), new Class86("Đóng", (Class256) new Class223(this)));
                    Class106.Field23 = (Class275) Class106.Field24;
                    return;
                }
                case 39: {
                    final String utf10 = class85.Field2().readUTF();
                    new StringBuffer("UNAME ").append(utf10).toString();
                    final boolean boolean2 = class85.Field2().readBoolean();
                    System.out.println("UNAME1 " + boolean2);
                    final String utf11 = class85.Field2().readUTF();
                    final String utf12 = class85.Field2().readUTF();
                    System.out.println(String.valueOf(utf12) + " NOI DUNG");
                    if (!boolean2) {
                        Class106.Field1("Xin chọn nick khác");
                        return;
                    }
                    MainTab.Field1(String.valueOf(utf11) + utf10, "sms://" + utf12, (Class256) new Class213(this, utf10), (Class256) new Class217(this));
                    return;
                }
                case 20:
                    Class106.Field19.Field1(class85.Field2().readShort(), class85.Field2().readByte());
                    return;
                case 51:
                    Class106.Field19.Field5(class85);
                    return;
                case 52:
                    Class62.Field17();
                    return;
                case 54:
                    return;
                case 56:
                    return;
                case 59:
                    Class106.Field19.Field4(class85.Field2().readUTF());
                    return;
                case 57:
                    return;
                case -5:
                    for (byte byte77 = class85.Field2().readByte(), b32 = 0; b32 < byte77; ++b32) {
                        final String utf13 = class85.Field2().readUTF();
                        Class104.Field5().Field1(String.valueOf(utf13) + ": " + class85.Field2().readUTF(), utf13);
                    }
                    return;
                case -53:
                    Class62.Field1(class85, 6, class85.Field2().readUTF().toUpperCase());
                    return;
                case -7:
                    Class62.Field1(class85, 1, class85.Field2().readUTF().toUpperCase());
                    return;
                case -8: {
                    final byte byte78 = class85.Field2().readByte();
                    final byte byte79 = class85.Field2().readByte();
                    final byte[] array27 = new byte[class85.Field2().readShort()];
                    class85.Field2().read(array27);
                    switch (byte78) {
                        case 1:
                            Class379.Field1(array27);
                            return;
                        case 2: {
                            class85.Field2().read(new byte[class85.Field2().readShort()]);
                            final byte byte80;
                            final byte[][] array28 = new byte[byte80 = class85.Field2().readByte()][];
                            final byte[][][] array29 = new byte[byte80][][];
                            for (byte b33 = 0; b33 < byte80; ++b33) {
                                array28[b33] = new byte[class85.Field2().readShort()];
                                class85.Field2().read(array28[b33]);
                                final byte byte81 = class85.Field2().readByte();
                                array29[b33] = new byte[byte81][];
                                for (byte b34 = 0; b34 < byte81; ++b34) {
                                    array29[b33][b34] = new byte[class85.Field2().readShort()];
                                    class85.Field2().read(array29[b33][b34]);
                                }
                            }
                            Class379.Field1(byte79, array27, array28, array29);
                            return;
                        }
                        case 3:
                            Class379.Field1(byte79, array27);
                            return;
                        case 4:
                            Image.createImage(array27, 0, array27.length);
                            return;
                        default:
                            return;
                    }
                }
                case -9: {
                    final short short54;
                    final short[] array30 = new short[short54 = class85.Field2().readShort()];
                    for (short n54 = 0; n54 < short54; ++n54) {
                        array30[n54] = class85.Field2().readShort();
                    }
                    final String utf14;
                    if ((utf14 = class85.Field2().readUTF()).equals("")) {
                        Class106.Field19.Field1(array30);
                        return;
                    }
                    Class106.Field2(utf14, (Class256) new Class207(this, array30));
                    return;
                }
                case -10: {
                    final short short55 = class85.Field2().readShort();
                    final String utf15 = class85.Field2().readUTF();
                    ((Class678) Class106.Field19.Field15).Field190 = short55;
                    ((Class357) Class106.Field19.Field15).Field57 = 0;
                    Class752.Field5().Field6();
                    Class106.Field1(utf15);
                    return;
                }
                case -11: {
                    if (class85.Field2().readByte() == 0) {
                        final short short56 = class85.Field2().readShort();
                        Class106.Field1(class85.Field2().readUTF(), (Class256) new Class210(this, short56), (Class256) new Class203(this, short56));
                        return;
                    }
                    final String utf16 = class85.Field2().readUTF();
                    if (class85.Field2().readBoolean()) {
                        final short short57 = class85.Field2().readShort();
                        final short short58 = class85.Field2().readShort();
                        if (short57 == ((Class678) Class106.Field19.Field15).Field189) {
                            ((Class678) Class106.Field19.Field15).Field190 = short57;
                            Class752.Field5().Field6();
                        } else {
                            ((Class678) Class106.Field19.Field2(short57)).Field190 = short58;
                        }
                    }
                    Class106.Field1(utf16);
                    return;
                }
                case -12: {
                    final Class830 class113;
                    (class113 = new Class830()).Field1 = class85.Field2().readShort();
                    class113.Field2 = class85.Field2().readUTF();
                    class113.Field3 = class85.Field2().readUTF();
                    class113.Field7 = class85.Field2().readByte();
                    class113.Field8 = class85.Field2().readShort();
                    class113.Field9 = class85.Field2().readLong();
                    class113.Field12 = class85.Field2().readLong();
                    class113.Field10 = class85.Field2().readLong();
                    class113.Field4 = class85.Field2().readUTF();
                    class113.Field5 = class85.Field2().readUTF();
                    class113.Field11 = class85.Field2().readBoolean();
                    class113.Field13 = class85.Field2().readByte();
                    if (class113.Field11) {
                        class113.Field6 = class85.Field2().readUTF();
                    }
                    Class62.Field1(class113);
                    return;
                }
                case -13:
                    ((Class678) Class106.Field19.Field15).Field190 = -1;
                    Class106.Field1("Bạn bị mời khỏi bang hội.");
                    return;
                case -17: {
                    final Vector vector8 = new Vector();
                    for (short short59 = class85.Field2().readShort(), n55 = 0; n55 < short59; ++n55) {
                        final Class375 class114;
                        (class114 = new Class375()).Field2 = class85.Field2().readInt();
                        class114.Field1 = class85.Field2().readUTF();
                        class114.Field3 = class85.Field2().readUTF();
                        vector8.addElement(class114);
                    }
                    Class496.Field5().Field1(vector8, 2, "THÔNG BÁO");
                    Class496.Field5().Field1();
                    Class106.Field7();
                    return;
                }
                case -18:
                    Class104.Field5().Field1(class85.Field2().readUTF(), "Bang hội");
                    return;
                case -19: {
                    final byte byte82 = class85.Field2().readByte();
                    final String utf17 = class85.Field2().readUTF();
                    final Vector vector9 = new Vector();
                    if (byte82 == 5) {
                        for (short short60 = class85.Field2().readShort(), n56 = 0; n56 < short60; ++n56) {
                            final Class830 class115;
                            (class115 = new Class830()).Field1 = class85.Field2().readShort();
                            class115.Field2 = class85.Field2().readUTF();
                            class115.Field3 = class85.Field2().readUTF();
                            class115.Field7 = class85.Field2().readByte();
                            class115.Field8 = class85.Field2().readShort();
                            class115.Field9 = class85.Field2().readLong();
                            class115.Field13 = class85.Field2().readByte();
                            vector9.addElement(class115);
                        }
                        Class496.Field5().Field1(vector9, (int) byte82, "TOP BANG HỘI");
                        Class496.Field5().Field1();
                        Class106.Field7();
                        return;
                    }
                    if (byte82 == 7 || byte82 == 8) {
                        Class62.Field1(class85, (int) byte82, utf17);
                        return;
                    }
                    if (byte82 == 4) {
                        Class62.Field1(class85, (int) byte82, "TOP CAO THỦ");
                        return;
                    }
                    Class62.Field1(class85, (int) byte82, "TOP ĐẠI GIA");
                    return;
                }
                case -20: {
                    final int int7 = class85.Field2().readInt();
                    Class106.Field1("Bạn nhận được " + int7 + "xu từ bang hội.", (Class256) new Class205(this, int7));
                    return;
                }
                case -22: {
                    final Class357 class116 = new Class357();
                    if (class85.Field2().readByte() == 0) {
                        class116.Field65 = class85.Field2().readUTF();
                        class116.Field88 = class85.Field2().readByte();
                        ((Class114) class116).Field12 = 0;
                        ((Class114) class116).Field22 = class85.Field2().readByte();
                        class116.Field76 = 0;
                        final byte byte83 = class85.Field2().readByte();
                        final Vector vector10 = new Vector();
                        for (byte b35 = 0; b35 < byte83; ++b35) {
                            final Class534 class117 = new Class534();
                            final Class357 class118 = class116;
                            final Class534 class119 = class117;
                            final Class534 class120 = class117;
                            final byte byte84 = class85.Field2().readByte();
                            class120.Field13 = byte84;
                            class119.Field30 = byte84;
                            class118.Field93 = byte84;
                            class117.Field18 = class85.Field2().readShort();
                            class117.Field25 = class85.Field2().readByte();
                            class117.Field19 = class85.Field2().readByte();
                            class117.Field9 = class85.Field2().readShort();
                            class117.Field37 = class85.Field2().readByte();
                            class117.Field31 = new short[5];
                            for (int n57 = 0; n57 < 5; ++n57) {
                                class117.Field31[n57] = class85.Field2().readShort();
                            }
                            class117.Field14 = class85.Field2().readByte();
                            class117.Field15 = class85.Field2().readByte();
                            class117.Field16 = class85.Field2().readByte();
                            class117.Field17 = class85.Field2().readByte();
                            class117.Field29 = class85.Field2().readByte();
                            class117.Field4 = class85.Field2().readUTF();
                            for (int n58 = 0; n58 < class117.Field1.length; ++n58) {
                                class117.Field1[n58] = class85.Field2().readByte();
                            }
                            for (int n59 = 0; n59 < class117.Field3.length; ++n59) {
                                class117.Field3[n59] = class85.Field2().readByte();
                            }
                            for (int n60 = 0; n60 < class117.Field2.length; ++n60) {
                                class117.Field2[n60] = class85.Field2().readByte();
                            }
                            vector10.addElement(class117);
                            final Class805 field18;
                            if ((field18 = Class811.Field2((int) class117.Field18)).Field3 >= 3 && field18.Field3 < 8) {
                                Class261.Field1().Field1(2, (int) field18.Field3, (int) field18.Field4, Class811.Field2((int) class117.Field18).Field15);
                                Class106.Field8();
                            }
                        }
                        ((Class678) class116).Field190 = class85.Field2().readShort();
                        class116.Field94 = class85.Field2().readByte();
                        for (int n61 = 0; n61 < class116.Field153.length; ++n61) {
                            class116.Field153[n61] = class85.Field2().readShort();
                        }
                        class116.Field63 = class85.Field2().readByte();
                        if (class116.Field63 != -1) {
                            class116.Field66 = class85.Field2().readUTF();
                        }
                        class116.Field1(vector10);
                        if (Class106.Field19.Field16 != null) {
                            ((Class678) class116).Field189 = Class106.Field19.Field16.Field189;
                        }
                        Class62.Field2(class116);
                        return;
                    }
                    final Vector vector11 = new Vector();
                    final byte byte85;
                    if ((byte85 = class85.Field2().readByte()) > -1) {
                        for (byte b36 = 0; b36 < byte85; ++b36) {
                            final Class534 class121 = new Class534();
                            final Class534 class123;
                            final Class534 class122 = class123 = class121;
                            final byte byte86 = class85.Field2().readByte();
                            class123.Field30 = byte86;
                            class121.Field13 = byte86;
                            class122.Field9 = class85.Field2().readShort();
                            class122.Field18 = class85.Field2().readShort();
                            class122.Field19 = class85.Field2().readByte();
                            class122.Field25 = class85.Field2().readByte();
                            class122.Field22 = class85.Field2().readShort();
                            class122.Field21 = class85.Field2().readShort();
                            class122.Field37 = class85.Field2().readByte();
                            class122.Field31 = new short[5];
                            for (int n62 = 0; n62 < 5; ++n62) {
                                class122.Field31[n62] = class85.Field2().readShort();
                            }
                            class122.Field14 = class85.Field2().readByte();
                            class122.Field15 = class85.Field2().readByte();
                            class122.Field16 = class85.Field2().readByte();
                            class122.Field17 = class85.Field2().readByte();
                            class122.Field29 = class85.Field2().readByte();
                            class122.Field4 = class85.Field2().readUTF();
                            for (int n63 = 0; n63 < class122.Field1.length; ++n63) {
                                class122.Field1[n63] = class85.Field2().readByte();
                            }
                            for (int n64 = 0; n64 < class122.Field3.length; ++n64) {
                                class122.Field3[n64] = class85.Field2().readByte();
                            }
                            for (int n65 = 0; n65 < class122.Field2.length; ++n65) {
                                class122.Field2[n65] = class85.Field2().readByte();
                            }
                            vector11.addElement(class122);
                        }
                        Image field19 = null;
                        final byte byte87 = class85.Field2().readByte();
                        int width2 = 0;
                        int n66 = 0;
                        byte b37 = 0;
                        final byte[] array31 = new byte[class85.Field2().available()];
                        while (class85.Field2().available() > 0) {
                            class85.Field2().read(array31, 0, array31.length);
                        }
                        if (array31.length > 0) {
                            field19 = Class811.Field2(array31);
                            b37 = (byte) ((byte87 == 3) ? 3 : 6);
                            if (field19 != null) {
                                width2 = field19.getWidth();
                                n66 = field19.getHeight() / byte87;
                            }
                        }
                        Class106.Field19.Field1(Class106.Field19.Field29, vector11, field19, byte87, width2, n66, b37);
                        return;
                    }
                    Class106.Field1("Chưa có thông tin linh thú");
                    return;
                }
                case 105: {
                    final byte byte88 = class85.Field2().readByte();
                    final byte byte89;
                    Class811.Field54 = new short[byte89 = class85.Field2().readByte()][][];
                    Class811.Field53 = new String[byte89][][];
                    for (byte b38 = 0; b38 < byte89; ++b38) {
                        final byte byte90 = class85.Field2().readByte();
                        Class811.Field54[b38] = new short[byte90][];
                        Class811.Field53[b38] = new String[byte90][];
                        for (byte b39 = 0; b39 < byte90; ++b39) {
                            Class811.Field54[b38][b39] = new short[byte88 * 3];
                            Class811.Field53[b38][b39] = new String[byte88];
                            for (int n67 = 0; n67 < byte88 * 3; ++n67) {
                                Class811.Field54[b38][b39][n67] = class85.Field2().readShort();
                                if (n67 % 3 == 0) {
                                    Class811.Field53[b38][b39][n67 / 3] = class85.Field2().readUTF();
                                }
                            }
                        }
                    }
                    final byte byte91;
                    Class62.Field86 = new short[byte91 = class85.Field2().readByte()][];
                    Class62.Field85 = new short[byte91];
                    for (byte b40 = 0; b40 < byte91; ++b40) {
                        Class62.Field86[b40] = new short[byte88];
                        for (byte b41 = 0; b41 < byte88; ++b41) {
                            Class62.Field86[b40][b41] = class85.Field2().readShort();
                        }
                        Class62.Field85[b40] = class85.Field2().readShort();
                    }
                    final int byte92;
                    Class811.Field51 = new short[byte92 = class85.Field2().readByte()][byte88 * 3];
                    Class811.Field52 = new String[byte92][byte88];
                    for (int n68 = 0; n68 < byte92; ++n68) {
                        for (int n69 = 0; n69 < byte88 * 3; ++n69) {
                            Class811.Field51[n68][n69] = class85.Field2().readShort();
                            if (n69 % 3 == 0) {
                                Class811.Field52[n68][n69 / 3] = class85.Field2().readUTF();
                            }
                        }
                    }
                    return;
                }
                case -24:
                    Label_15530:
                    {
                        byte93 = class85.Field2().readByte();
                        utf18 = class85.Field2().readUTF();
                        if (byte93 == 0) {
                            Class188.Field5().Field1(utf18);
                            break Label_15530;
                        }
                        if (byte93 != 1) {
                            break Label_15530;
                        }
                        return;
                    }
                case -26:
                    Class106.Field19.Field7(class85.Field2().readUTF());
                    return;
                case -27: {
                    final byte byte94 = class85.Field2().readByte();
                    final byte byte95;
                    if ((byte95 = class85.Field2().readByte()) != -1) {
                        final short short61;
                        final byte[] array32 = new byte[short61 = class85.Field2().readShort()];
                        for (short n70 = 0; n70 < short61; ++n70) {
                            array32[n70] = class85.Field2().readByte();
                        }
                        final short short62;
                        final byte[] array33 = new byte[short62 = class85.Field2().readShort()];
                        for (short n71 = 0; n71 < short62; ++n71) {
                            array33[n71] = class85.Field2().readByte();
                        }
                        final Image field20 = Class811.Field1(array32, array33);
                        final byte byte96 = class85.Field2().readByte();
                        final byte byte97 = class85.Field2().readByte();
                        if (byte94 == 0) {
                            ((Class357) Class59.Field5().Field6).Field102 = field20;
                            ((Class357) Class59.Field5().Field6).Field104 = byte96;
                            ((Class357) Class59.Field5().Field6).Field105 = byte97;
                        } else if (byte94 == 1) {
                            ((Class357) Class106.Field19.Field15).Field119 = byte95;
                            ((Class357) Class106.Field19.Field15).Field102 = field20;
                            ((Class357) Class106.Field19.Field15).Field104 = byte96;
                            ((Class357) Class106.Field19.Field15).Field105 = byte97;
                        } else if (byte94 == 2) {
                            if (Class464.Field6() == 1) {
                                Class464.Field39.Field102 = field20;
                                Class464.Field39.Field104 = byte96;
                                Class464.Field39.Field105 = byte97;
                            } else {
                                Class464.Field5().Field60 = field20;
                            }
                        }
                    }
                    Class106.Field7();
                    return;
                }
                case -28: {
                    final byte[] array34 = new byte[class85.Field2().readShort()];
                    class85.Field2().read(array34);
                    Class106.Field19.Field3(array34);
                    return;
                }
                case -29:
                    return;
                case -30: {
                    final short short63 = class85.Field2().readShort();
                    final byte byte98 = class85.Field2().readByte();
                    final byte byte99;
                    final String[] array35 = new String[byte99 = class85.Field2().readByte()];
                    for (byte b42 = 0; b42 < byte99; ++b42) {
                        array35[b42] = class85.Field2().readUTF();
                    }
                    Class106.Field19.Field1((int) short63, byte98, array35);
                    return;
                }
                case -31:
                    Class106.Field19.Field1((int) class85.Field2().readShort(), class85.Field2().readByte(), class85.Field2().readUTF(), (int) class85.Field2().readByte());
                    return;
                case -32: {
                    final short short64 = class85.Field2().readShort();
                    final byte byte100 = class85.Field2().readByte();
                    final String utf19;
                    Class106.Field1(utf19 = class85.Field2().readUTF(), (Class256) new Class202(this, (int) short64, byte100, utf19), (Class256) new Class360(this, (int) short64, byte100, utf19));
                    return;
                }
                case -33: {
                    final int n72 = class85.Field2().readByte() << 4;
                    final int n73 = class85.Field2().readByte() << 4;
                    final short short65 = class85.Field2().readShort();
                    Class106.Field19.Field23 = new Class384(n72, n73);
                    Class106.Field19.Field23.Field6 = short65;
                    if (Class106.Field19.Field23.Field6 == Class106.Field19.Field83) {
                        ((Vector<Class226>) Class73.Field1).addElement(new Class226(n72, n73, short65, (byte) 0, true));
                        ((Vector<Class226>) Class73.Field2).addElement(new Class226(n72, n73, short65, (byte) 1, true));
                    }
                    return;
                }
                case -37: {
                    final byte byte101;
                    if ((byte101 = class85.Field2().readByte()) == 0) {
                        String s = "`" + class85.Field2().readUTF();
                        final byte byte102;
                        if ((byte102 = class85.Field2().readByte()) == 0) {
                            Class464.Field31 = class85.Field2().readByte();
                            Class464.Field37 = class85.Field2().readShort();
                            Class464.Field36 = class85.Field2().readShort();
                            s = String.valueOf(s) + "\nHoàn thành: " + Class464.Field36 + "/" + Class464.Field37 + "Con";
                        } else if (byte102 == 1) {
                            Class62.Field36 = class85.Field2().readByte();
                            Class464.Field37 = class85.Field2().readShort();
                            Class464.Field36 = class85.Field2().readShort();
                            s = String.valueOf(s) + "\nĐã lấy: " + Class464.Field36 + "/" + Class464.Field37;
                        } else if (byte102 == 2) {
                            (Class62.Field37 = new Class384()).Field6 = class85.Field2().readByte();
                            for (int n74 = 0; n74 < Class106.Field19.Field10.size(); ++n74) {
                                final Class678 class124;
                                if ((class124 = (Class678) Class106.Field19.Field10.elementAt(n74)) instanceof Class260 && ((Class260) class124).Field1 == Class62.Field37.Field6) {
                                    Class62.Field37.Field1 = class124.Field193;
                                    Class62.Field37.Field2 = class124.Field194;
                                    break;
                                }
                            }
                        }
                        Class811.Field2 = class85.Field2().readUTF();
                        Class464.Field5().Field1(s);
                        return;
                    }
                    if (byte101 == 1) {
                        Class106.Field19.Field6(class85.Field2().readUTF());
                        return;
                    }
                    if (byte101 == 2) {
                        final String utf20 = class85.Field2().readUTF();
                        Class811.Field2 = class85.Field2().readUTF();
                        Class798.Field5().Field1("NHIỆM VỤ", utf20);
                        Class798.Field5().Field1();
                        Class106.Field7();
                    }
                    return;
                }
                case -38: {
                    Class62.Field20 = class85.Field2().readBoolean();
                    final byte byte103;
                    Class62.Field54 = new int[byte103 = class85.Field2().readByte()];
                    Class62.Field58 = new String[byte103];
                    Class62.Field55 = new int[byte103];
                    Class62.Field56 = new short[byte103];
                    Class62.Field59 = new String[byte103];
                    for (byte b43 = 0; b43 < byte103; ++b43) {
                        Class62.Field54[b43] = class85.Field2().readShort();
                        final short short66 = class85.Field2().readShort();
                        Class62.Field58[b43] = class85.Field2().readUTF();
                        Class62.Field55[b43] = (int) (System.currentTimeMillis() / 1000L);
                        final Class357 class125 = (Class357) Class106.Field19.Field2(short66);
                        Class62.Field56[b43] = short66;
                        if (class125 != null) {
                            class125.Field169 = null;
                        }
                        if (class125 != null && Class62.Field54[b43] > 0) {
                            class125.Field169 = (Class177) new Class226((int) ((Class678) class125).Field193, ((Class678) class125).Field194 - 5, (short) 1, (byte) 1, false);
                        }
                        Class62.Field59[b43] = class85.Field2().readUTF().toLowerCase();
                    }
                    return;
                }
                case -39:
                    Class62.Field1(class85.Field2().readByte(), (int) class85.Field2().readShort(), class85.Field2().readInt());
                    return;
                case -42: {
                    final short short67 = class85.Field2().readShort();
                    final byte b44;
                    final byte[] array36 = new byte[b44 = (byte) (class85.Field2().available() / 2)];
                    final byte[] array37 = new byte[b44];
                    int n75 = 0;
                    while (class85.Field2().available() > 0) {
                        array36[n75] = class85.Field2().readByte();
                        array37[n75] = class85.Field2().readByte();
                        ++n75;
                    }
                    Class106.Field19.Field1(short67, array36, array37);
                    return;
                }
                case -43: {
                    final byte byte104;
                    if ((byte104 = class85.Field2().readByte()) > 0) {
                        final Image[] array38 = new Image[byte104];
                        for (byte b45 = 0; b45 < byte104; ++b45) {
                            try {
                                final byte[] array39 = new byte[class85.Field2().readInt()];
                                class85.Field2().read(array39, 0, array39.length);
                                array38[b45] = Image.createImage(array39, 0, array39.length);
                            } catch (final Exception ex44) {
                            }
                        }
                        for (byte byte105 = class85.Field2().readByte(), b46 = 0; b46 < byte105; ++b46) {
                            final Class348 class126 = new Class348();
                            final byte byte106 = class85.Field2().readByte();
                            final byte byte107 = class85.Field2().readByte();
                            final byte byte108 = class85.Field2().readByte();
                            class126.Field2 = class85.Field2().readByte();
                            class126.Field3 = class85.Field2().readByte();
                            class126.Field4 = class85.Field2().readByte();
                            class126.Field1((short) (byte107 << 4), (short) (byte108 << 4));
                            class126.Field1 = array38[byte106];
                            ((Class678) class126).Field195 = (short) (class126.Field1.getHeight() / class126.Field4);
                            Class106.Field19.Field1(class126);
                        }
                    }
                    return;
                }
                case -46:
                    if (class85.Field2().readByte() == 0) {
                        class85.Field2().readUTF();
                        class85.Field2().readByte();
                        return;
                    }
                    class85.Field2().readByte();
                    class85.Field2().readByte();
                    class85.Field2().read(new byte[class85.Field2().available()]);
                    return;
                case -47: {
                    final short short68 = class85.Field2().readShort();
                    class85.Field2().readBoolean();
                    final byte[] array40 = new byte[class85.Field2().readShort()];
                    class85.Field2().read(array40);
                    if (Class811.Field46[short68] != null) {
                        Class811.Field46[short68].Field1(array40);
                    }
                    return;
                }
                case -48: {
                    final byte byte109;
                    if ((byte109 = class85.Field2().readByte()) == -1) {
                        final byte byte110 = class85.Field2().readByte();
                        final byte byte111 = class85.Field2().readByte();
                        final byte[] array41 = new byte[class85.Field2().available()];
                        for (int n76 = 0; n76 < array41.length; ++n76) {
                            array41[n76] = class85.Field2().readByte();
                        }
                        Class62.Field1(array41, byte110, byte111);
                        return;
                    }
                    final byte[] array42 = new byte[class85.Field2().readShort()];
                    class85.Field2().read(array42);
                    final Class686 field21;
                    if ((field21 = Class811.Field8((int) byte109)) != null) {
                        field21.Field1(array42, (int) byte109);
                    }
                    return;
                }
                case -49: {
                    final byte byte112 = class85.Field2().readByte();
                    final byte byte113 = class85.Field2().readByte();
                    if (byte112 == 0) {
                        if (Class69.Field1((short) byte113) == null) {
                            Class261.Field1().Field9((short) byte113);
                        }
                        final Class69 class127;
                        (class127 = new Class69()).Field1 = byte113;
                        class127.Field9 = class85.Field2().readByte();
                        final Class69 class128 = class127;
                        final Class69 class129 = class127;
                        final byte byte114 = class85.Field2().readByte();
                        class129.Field7 = byte114;
                        class128.Field3 = byte114;
                        class127.Field2 = class85.Field2().readShort();
                        class127.Field10 = class85.Field2().readByte();
                        if (class127.Field10 == 1) {
                            class127.Field4 = class85.Field2().readShort();
                        } else if (class127.Field10 == 2) {
                            final byte byte115 = class85.Field2().readByte();
                            class127.Field11 = new short[byte115];
                            class127.Field12 = new short[byte115];
                            for (byte b47 = 0; b47 < byte115; ++b47) {
                                class127.Field11[b47] = class85.Field2().readShort();
                                class127.Field12[b47] = class85.Field2().readShort();
                            }
                        }
                        if (class127.Field9 == 0) {
                            class127.Field8 = class85.Field2().readShort();
                        } else {
                            class127.Field5 = class85.Field2().readShort();
                            class127.Field6 = class85.Field2().readShort();
                        }
                        Class62.Field1(class127);
                        return;
                    }
                    final Class83 class130;
                    (class130 = new Class83()).Field5 = byte113;
                    class130.Field1(class85);
                    Class69.Field13.addElement(class130);
                    return;
                }
                case -50:
                    Class106.Field19.Field1(class85.Field2().readUTF(), class85.Field2().readShort(), class85.Field2().readShort(), class85.Field2().readShort(), class85.Field2().readShort(), class85.Field2().readShort(), class85.Field2().readShort(), class85.Field2().readByte(), class85.Field2().readByte());
                    return;
                case -51: {
                    final short short69 = class85.Field2().readShort();
                    final byte[] array43 = new byte[class85.Field2().available()];
                    class85.Field2().read(array43);
                    final Class176 class131;
                    (class131 = (Class176) Class379.Field3.get(new StringBuffer().append(short69).toString())).Field3 = false;
                    class131.Field1 = Image.createImage(array43, 0, array43.length);
                    return;
                }
                case -52: {
                    final String utf21 = class85.Field2().readUTF();
                    final short short70 = class85.Field2().readShort();
                    final byte byte116 = class85.Field2().readByte();
                    final Vector vector12 = new Vector();
                    for (byte b48 = 0; b48 < byte116; ++b48) {
                        final Class381 class132;
                        (class132 = new Class381()).Field1 = class85.Field2().readUTF();
                        class132.Field2 = class85.Field2().readShort();
                        class132.Field3 = class85.Field2().readByte();
                        vector12.addElement(class132);
                    }
                    final byte byte117 = class85.Field2().readByte();
                    int byte118 = 0;
                    try {
                        byte118 = class85.Field2().readByte();
                    } catch (final Exception ex45) {
                    }
                    Class106.Field19.Field1(utf21, short70, vector12, (int) byte117, byte118);
                    return;
                }
                case -55:
                    Class106.Field19.Field15(class85);
                    return;
                case -56: {
                    final byte byte119;
                    final Class32[] array44 = new Class32[byte119 = class85.Field2().readByte()];
                    for (byte b49 = 0; b49 < byte119; ++b49) {
                        array44[b49] = new Class32();
                        array44[b49].Field1 = class85.Field2().readShort();
                        array44[b49].Field4 = class85.Field2().readByte();
                        array44[b49].Field3 = class85.Field2().readUTF();
                        array44[b49].Field5 = class85.Field2().readByte();
                    }
                    final byte byte120;
                    final Class32[] array45 = new Class32[byte120 = class85.Field2().readByte()];
                    for (byte b50 = 0; b50 < byte120; ++b50) {
                        array45[b50] = new Class32();
                        array45[b50].Field1 = class85.Field2().readShort();
                        array45[b50].Field4 = class85.Field2().readByte();
                        array45[b50].Field3 = class85.Field2().readUTF();
                        array45[b50].Field5 = class85.Field2().readByte();
                    }
                    Class106.Field19.Field1(array44, array45);
                    return;
                }
                case -57: {
                    if (class85.Field2().readByte() != 0) {
                        final byte byte121 = class85.Field2().readByte();
                        final short short71;
                        final byte[] array46 = new byte[short71 = class85.Field2().readShort()];
                        class85.Field2().read(array46, 0, short71);
                        Class732.Field6[byte121] = class85.Field2().readByte();
                        Class732.Field4[byte121] = Class811.Field2(array46);
                        Class732.Field5[byte121] = Class732.Field4[byte121].getWidth();
                        Class732.Field1[byte121] = new byte[4][class85.Field2().readByte()];
                        for (int n77 = 0; n77 < Class732.Field1[byte121][0].length; ++n77) {
                            Class732.Field1[byte121][0][n77] = class85.Field2().readByte();
                            Class732.Field1[byte121][1][n77] = class85.Field2().readByte();
                            Class732.Field1[byte121][2][n77] = class85.Field2().readByte();
                            Class732.Field1[byte121][3][n77] = class85.Field2().readByte();
                        }
                        Class732.Field2[byte121] = new byte[4][class85.Field2().readByte()];
                        for (int n78 = 0; n78 < Class732.Field2[byte121][0].length; ++n78) {
                            Class732.Field2[byte121][0][n78] = class85.Field2().readByte();
                            Class732.Field2[byte121][1][n78] = class85.Field2().readByte();
                            Class732.Field2[byte121][2][n78] = class85.Field2().readByte();
                            Class732.Field2[byte121][3][n78] = class85.Field2().readByte();
                        }
                        Class732.Field3[byte121] = new byte[4][class85.Field2().readByte()];
                        for (int n79 = 0; n79 < Class732.Field3[byte121][0].length; ++n79) {
                            Class732.Field3[byte121][0][n79] = class85.Field2().readByte();
                            Class732.Field3[byte121][1][n79] = class85.Field2().readByte();
                            Class732.Field3[byte121][2][n79] = class85.Field2().readByte();
                            Class732.Field3[byte121][3][n79] = class85.Field2().readByte();
                        }
                        Class732.Field7[byte121] = class85.Field2().readByte();
                        Class732.Field8[byte121] = class85.Field2().readByte();
                        return;
                    }
                    final boolean boolean3 = class85.Field2().readBoolean();
                    final short short72 = class85.Field2().readShort();
                    final byte byte122 = class85.Field2().readByte();
                    if (((Class678) Class106.Field19.Field15).Field189 == short72) {
                        ((Class357) Class106.Field19.Field15).Field150 = boolean3;
                        if (boolean3) {
                            ((Class357) Class106.Field19.Field15).Field151 = new Class732();
                            ((Class357) Class106.Field19.Field15).Field151.Field9 = byte122;
                            ((Class357) Class106.Field19.Field15).Field149 = (Class177) new Class226((int) ((Class678) Class106.Field19.Field15).Field193, ((Class678) Class106.Field19.Field15).Field194 - 5, (short) 1, (byte) 1, false);
                            ((Class357) Class106.Field19.Field15).Field165 = System.currentTimeMillis() / 1000L + 5L;
                        } else if (((Class357) Class106.Field19.Field15).Field151 != null) {
                            ((Class357) Class106.Field19.Field15).Field151 = null;
                        }
                    } else {
                        final Class357 class133;
                        if ((class133 = (Class357) Class106.Field19.Field2(short72)) != null) {
                            class133.Field150 = boolean3;
                            if (boolean3) {
                                class133.Field151 = new Class732();
                                class133.Field151.Field9 = byte122;
                                class133.Field149 = (Class177) new Class226((int) ((Class678) class133).Field193, ((Class678) class133).Field194 - 5, (short) 1, (byte) 1, false);
                                class133.Field165 = System.currentTimeMillis() / 1000L + 5L;
                            } else if (class133.Field151 != null) {
                                class133.Field151 = null;
                            }
                        }
                    }
                    if (Class732.Field4[byte122] == null) {
                        Class106.Field19.Field28.Field13((int) byte122, (int) short72);
                    }
                    return;
                }
                case -59:
                    for (byte byte123 = class85.Field2().readByte(), b51 = 0; b51 < byte123; ++b51) {
                        final byte byte124 = class85.Field2().readByte();
                        final byte byte125 = class85.Field2().readByte();
                        final String utf22 = class85.Field2().readUTF();
                        Class106.Field19.Field1((int) byte124, (int) byte125, class85.Field2().readByte() << 4, class85.Field2().readByte() << 4, utf22, utf22, (int) class85.Field2().readByte(), class85.Field2().readInt(), class85.Field2().readBoolean(), class85.Field2().readByte(), class85.Field2().readByte());
                    }
                    Class106.Field19.Field87 = (short) Field1(Class106.Field19.Field10, (byte) 0, 5000);
                    Class106.Field19.Field88 = (short) Field1(Class106.Field19.Field10, (byte) 1, 5000);
                    Class106.Field19.Field89 = (short) Field1(Class106.Field19.Field10, (byte) 2, -1);
                    Class106.Field19.Field90 = (short) Field1(Class106.Field19.Field10, (byte) 3, -1);
                    return;
                case -60:
                    Class62.Field1(class85.Field2().readUTF());
                    return;
                case -62: {
                    final byte byte126;
                    if ((byte126 = class85.Field2().readByte()) == 0) {
                        Class152.Field5().Field1();
                        Class152.Field5().Field1(class85);
                        return;
                    }
                    if (byte126 == 1) {
                        final byte byte127 = class85.Field2().readByte();
                        final String utf23 = class85.Field2().readUTF();
                        final byte byte128;
                        final String[] array47 = new String[byte128 = class85.Field2().readByte()];
                        for (byte b52 = 0; b52 < byte128; ++b52) {
                            array47[b52] = class85.Field2().readUTF();
                        }
                        Class152.Field5().Field1(byte127, utf23, array47);
                        return;
                    }
                    if (byte126 == 2) {
                        Class106.Field1("Bạn đã hết lượt chơi");
                        Class152.Field5().Field6();
                        Class106.Field19.Field1();
                    }
                    return;
                }
                case -63:
                    Class459.Field5().Field1(class85);
                    Class459.Field5().Field1();
                    return;
                case -61: {
                    final byte byte129 = class85.Field2().readByte();
                    final byte byte130 = class85.Field2().readByte();
                    final byte byte131 = class85.Field2().readByte();
                    final short short73 = class85.Field2().readShort();
                    final byte byte132 = class85.Field2().readByte();
                    byte byte133 = 0;
                    try {
                        byte133 = class85.Field2().readByte();
                    } catch (final Exception ex46) {
                    }
                    Class106.Field19.Field1((short) 1000, byte129, byte130, short73, byte131, byte132, byte133);
                    return;
                }
                case 87:
                    Class106.Field19.Field16(class85);
                    return;
                case -75:
                    Class106.Field19.Field18(class85);
                    return;
                case -76:
                    Class62.Field17(class85);
                    break;
            }
        } catch (final Exception ex47) {
            ex47.printStackTrace();
            new StringBuffer(String.valueOf(class85.Field1)).append(" tai cmd nay").toString();
            new StringBuffer(String.valueOf(class85.Field1)).append(" tai cmd nay").toString();
        }
    }

    private static int Field1(final Vector vector, final byte b, int n) {
        for (int i = 0; i < vector.size(); ++i) {
            final Class678 class678;
            if ((class678 = (Class678) vector.elementAt(i)).Field188 == 10) {
                final Class685 class679 = (Class685) class678;
                switch (b) {
                    case 0:
                        if (n > ((Class678) class679).Field193) {
                            n = ((Class678) class679).Field193;
                            break;
                        }
                        break;
                    case 1:
                        if (n > ((Class678) class679).Field194) {
                            n = ((Class678) class679).Field194;
                            break;
                        }
                        break;
                    case 2:
                        if (n < ((Class678) class679).Field193) {
                            n = ((Class678) class679).Field193;
                            break;
                        }
                        break;
                    case 3:
                        if (n < ((Class678) class679).Field194) {
                            n = ((Class678) class679).Field194;
                            break;
                        }
                        break;
                }
            }
        }
        return n;
    }

    private static int Field1(final int n) {
        if (n >= 79 && n <= 113) {
            return (n - 79) / 7;
        }
        if (n >= 174 && n <= 213) {
            return (n - 174) / 8;
        }
        if (n >= 214 && n <= 263) {
            return (n - 214) / 10;
        }
        return 0;
    }
}
