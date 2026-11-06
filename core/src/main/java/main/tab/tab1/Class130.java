package main.tab.tab1;

import main.lib.Image;
import main.tab.tab1.screen.MainTab;

import java.util.Vector;

public final class Class130 extends Class384 {
    private static Class130 Field1;

    public Class130() {
        super();
    }

    public static Class130 Field1() {
        if (Class130.Field1 == null) {
            Class130.Field1 = new Class130();
        }
        return Class130.Field1;
    }

    public final void Field1(final Class86 class86) {
        try {
            final byte byte93;
            final String utf18;
            switch (class86.Field1) {
                case -74:
                    Class105.Field19.Field29(class86);
                    return;
                case -73:
                    Class63.Field27(class86);
                    return;
                case 62:
                    Class63.Field25(class86);
                    return;
                case -68:
                    Class105.Field19.Field24(class86);
                    return;
                case -69:
                    Class105.Field19.Field23(class86);
                    return;
                case -70:
                    Class105.Field19.Field22(class86);
                    return;
                case -71:
                    Class105.Field19.Field28(class86);
                    return;
                case -66:
                    Class63.Field20(class86);
                    return;
                case -67:
                    Class63.Field21(class86);
                    return;
                case -64:
                    Class105.Field19.Field19(class86);
                    return;
                case 104:
                    try {
                        Class63.Field4((int) class86.Field2().readByte());
                        class86.Field2().readByte();
                    } catch (final Exception ex) {
                        new StringBuffer("LOI CHO NAY NE ").append(ex.toString()).toString();
                    }
                    return;
                case 103:
                    Class105.Field19.Field14(class86);
                    return;
                case 102:
                    Class63.Field1(class86, 0, "BẠN BÈ");
                    return;
                case 101:
                    Class105.Field19.Field13(class86);
                    return;
                case 95:
                    Class105.Field19.Field3(class86.Field2().readShort(), class86.Field2().readShort(), class86.Field2().readByte());
                    return;
                case 94:
                    Class105.Field19.Field11(class86);
                    return;
                case 92:
                    Class105.Field19.Field12(class86);
                    return;
                case 91:
                    return;
                case 72:
                    Class105.Field1("Đã sửa xong.");
                    return;
                case 89:
                    Class105.Field19.Field10(class86);
                    return;
                case 90:
                    Class105.Field19.Field9(class86);
                    return;
                case 82:
                    Class105.Field23 = null;
                    if (((Class359) Class105.Field19.Field15).Field146 <= 0) {
                        ((Class359) Class105.Field19.Field15).Field146 = class86.Field2().readByte();
                        ((Class359) Class105.Field19.Field15).Field162 = ((Class359) Class105.Field19.Field15).Field146;
                        ((Class359) Class105.Field19.Field15).Field143 = System.currentTimeMillis();
                    }
                    return;
                case 81:
                    Class105.Field1("Đã mua được vé");
                    return;
                case 80:
                    Class804.Field7 = new Class2[class86.Field2().readByte()];
                    for (int i = 0; i < Class804.Field7.length; ++i) {
                        Class804.Field7[i] = new Class2();
                        final byte byte1 = class86.Field2().readByte();
                        Class804.Field7[i].Field1 = new int[byte1];
                        for (int j = 0; j < Class804.Field7[i].Field1.length; ++j) {
                            Class804.Field7[i].Field1[j] = class86.Field2().readByte();
                        }
                        Class804.Field7[i].Field2 = new int[byte1];
                        for (int k = 0; k < Class804.Field7[i].Field2.length; ++k) {
                            Class804.Field7[i].Field2[k] = class86.Field2().readShort();
                        }
                        Class804.Field7[i].Field3 = new int[byte1];
                        for (int l = 0; l < Class804.Field7[i].Field3.length; ++l) {
                            Class804.Field7[i].Field3[l] = class86.Field2().readShort();
                        }
                        Class804.Field7[i].Field4 = new int[byte1];
                        for (int n = 0; n < Class804.Field7[i].Field4.length; ++n) {
                            Class804.Field7[i].Field4[n] = class86.Field2().readShort();
                        }
                    }
                    return;
                case 77:
                    Class63.Field5(class86.Field2().readUTF());
                    return;
                case -35:
                    Class63.Field5(class86.Field2().readUTF());
                    return;
                case -36:
                    if (class86.Field2().readByte() == 0) {
                        Class105.Field19.Field13(class86.Field2().readShort());
                        return;
                    }
                    Class63.Field5(class86.Field2().readUTF());
                    return;
                case 85:
                    Class105.Field1("Đã mua, món đồ đang ở trong hành trang.");
                    return;
                case 86: {
                    final byte byte2;
                    if ((byte2 = class86.Field2().readByte()) == 1) {
                        ((Class359) Class105.Field19.Field15).Field144 = System.currentTimeMillis();
                        class86.Field2().readByte();
                        Class359.Field145 = 1440;
                        Class359.Field147 = class86.Field2().readUTF();
                        return;
                    }
                    if (byte2 == 0) {
                        ((Class359) Class105.Field19.Field15).Field144 = 0L;
                        Class359.Field145 = 0;
                        Class359.Field147 = "";
                        return;
                    }
                    if (byte2 == 2) {
                        class86.Field2().readByte();
                        ((Class359) Class105.Field19.Field15).Field144 = System.currentTimeMillis();
                        Class359.Field145 = class86.Field2().readInt();
                        Class359.Field147 = class86.Field2().readUTF();
                    }
                    return;
                }
                case 73:
                    Class63.Field8(class86);
                    return;
                case 76:
                    Class63.Field7(class86);
                    return;
                case 71: {
                    class86.Field2().readByte();
                    final short short1 = class86.Field2().readShort();
                    byte byte3 = 0;
                    try {
                        byte3 = class86.Field2().readByte();
                    } catch (final Exception ex2) {
                    }
                    Class105.Field19.Field2(short1, byte3);
                    return;
                }
                case -34: {
                    final short short2 = class86.Field2().readShort();
                    byte byte4 = 0;
                    try {
                        byte4 = class86.Field2().readByte();
                    } catch (final Exception ex3) {
                    }
                    Class105.Field19.Field3(short2, byte4);
                    return;
                }
                case 68:
                    Class105.Field19.Field5(class86.Field2().readShort());
                    Class105.Field7();
                    return;
                case 69:
                    Class105.Field19.Field6(class86.Field2().readShort());
                    Class105.Field7();
                    return;
                case 66: {
                    final byte byte5;
                    if ((byte5 = class86.Field2().readByte()) == 0) {
                        Class105.Field19.Field10(class86.Field2().readShort());
                        return;
                    }
                    if (byte5 == -2) {
                        Class105.Field1("Người bạn mời đang trao đổi với người khác");
                        return;
                    }
                    if (byte5 == 1) {
                        Class105.Field19.Field11(class86.Field2().readShort());
                        return;
                    }
                    if (byte5 == -1) {
                        Class105.Field19.Field12(class86.Field2().readShort());
                        return;
                    }
                    if (byte5 == 2) {
                        Class105.Field19.Field1(class86.Field2().readShort(), class86, class86.Field2().readByte());
                        return;
                    }
                    if (byte5 == 3) {
                        Class105.Field19.Field20();
                        return;
                    }
                    if (byte5 == 4) {
                        Class105.Field19.Field19();
                        return;
                    }
                    if (byte5 == 5) {
                        Class105.Field19.Field18();
                    }
                    return;
                }
                case 67:
                    Class105.Field19.Field1((int) class86.Field2().readShort(), (int) class86.Field2().readByte(), class86.Field2().readShort());
                    return;
                case 60:
                    Class105.Field19.Field6(class86);
                    return;
                case 65:
                    Class105.Field19.Field1(class86.Field2().readShort(), (int) class86.Field2().readByte(), (int) class86.Field2().readByte());
                    return;
                case 2: {
                    final String utf;
                    if ((utf = class86.Field2().readUTF()).startsWith("2")) {
                        final String[] array2;
                        final short[] array = new short[(array2 = new String[class86.Field2().readByte()]).length];
                        final String[] array3 = new String[array2.length];
                        for (int n2 = 0; n2 < array2.length; ++n2) {
                            array2[n2] = class86.Field2().readUTF();
                            array[n2] = class86.Field2().readShort();
                            array3[n2] = class86.Field2().readUTF();
                        }
                        Class105.Field19.Field1(utf.substring(1), array2, array, array3);
                        return;
                    }
                    if (utf.startsWith("3")) {
                        final String utf2 = class86.Field2().readUTF();
                        final String utf3 = class86.Field2().readUTF();
                        MainTab.Field4 = utf2;
                        MainTab.Field5 = utf3;
                        Class826.Field1("provider", utf2);
                        Class826.Field1("agent", utf3);
                        return;
                    }
                    Class105.Field19.Field3(utf);
                    return;
                }
                case 1: {
                    if ((Class359.Field158 = class86.Field2().readByte()) < 3) {
                        Class359.Field158 = 3;
                    }
                    Class63.Field92 = class86.Field2().readShort();
                    Class585.Field42 = new Class641[Class359.Field51 = (short) class86.Field2().readUnsignedByte()];
                    ((Class359) Class105.Field19.Field15).Field123 = new long[Class359.Field51];
                    for (short n3 = 0; n3 < Class359.Field51; ++n3) {
                        Class585.Field42[n3] = new Class641();
                        Class585.Field42[n3].Field5 = (short) class86.Field2().readUnsignedByte();
                        Class585.Field42[n3].Field7 = class86.Field2().readUTF();
                        Class585.Field42[n3].Field8 = class86.Field2().readUTF();
                        Class585.Field42[n3].Field3 = class86.Field2().readShort();
                        Class585.Field42[n3].Field4 = n3;
                        Class585.Field42[n3].Field6 = class86.Field2().readBoolean();
                    }
                    for (int n4 = 0; n4 < Class359.Field124.length; ++n4) {
                        Class359.Field124[n4] = class86.Field2().readByte();
                    }
                    Class63.Field22.removeAllElements();
                    for (int n5 = 0; n5 < 5; ++n5) {
                        final byte byte6 = class86.Field2().readByte();
                        final Vector<Class185> vector = new Vector<Class185>();
                        for (byte b = 0; b < byte6; ++b) {
                            final Class185 class87;
                            (class87 = new Class185()).Field3 = class86.Field2().readByte();
                            class87.Field1 = class86.Field2().readUTF();
                            class87.Field2 = class86.Field2().readUTF();
                            class87.Field4 = class86.Field2().readInt();
                            vector.addElement(class87);
                        }
                        Class63.Field22.addElement(vector);
                    }
                    if (class86.Field2().available() > 0) {
                        Class63.Field47 = class86.Field2().readShort();
                        for (int unsignedByte = class86.Field2().readUnsignedByte(), n6 = 0; n6 < unsignedByte; ++n6) {
                            Class467.Field5().Field59.addElement(new StringBuffer(String.valueOf(class86.Field2().readUnsignedByte())).toString());
                        }
                        for (int n7 = 0; n7 < 5; ++n7) {
                            for (int n8 = 0; n8 < 5; ++n8) {
                                Class359.Field177[n7][n8] = class86.Field2().readByte();
                                Class359.Field178[n7][n8] = class86.Field2().readByte();
                                Class359.Field179[n7][n8] = class86.Field2().readByte();
                                Class359.Field180[n7][n8] = class86.Field2().readByte();
                            }
                        }
                    }
                    Class63.Field50 = class86.Field2().readByte();
                    Class63.Field51 = class86.Field2().readByte();
                    Class63.Field52 = class86.Field2().readByte();
                    Class63.Field53 = class86.Field2().readByte();
                    final byte byte7;
                    Class804.Field55 = new String[byte7 = class86.Field2().readByte()];
                    Class804.Field56 = new byte[byte7];
                    for (byte b2 = 0; b2 < byte7; ++b2) {
                        Class804.Field55[b2] = class86.Field2().readUTF();
                        Class804.Field56[b2] = class86.Field2().readByte();
                    }
                    final String utf4 = class86.Field2().readUTF();
                    if (!Class792.Field4.equals(utf4)) {
                        Class826.Field1("numbersupport", Class792.Field4 = utf4);
                    }
                    final byte byte8 = class86.Field2().readByte();
                    Class63.Field101[0] = new byte[byte8];
                    Class63.Field101[1] = new byte[byte8];
                    Class63.Field102[1] = new int[byte8];
                    Class63.Field102[0] = new int[byte8];
                    for (byte b3 = 0; b3 < byte8; ++b3) {
                        Class63.Field101[0][b3] = class86.Field2().readByte();
                        Class63.Field102[0][b3] = class86.Field2().readInt();
                        Class63.Field101[1][b3] = class86.Field2().readByte();
                        Class63.Field102[1][b3] = class86.Field2().readInt();
                    }
                    final byte byte9;
                    Class112.Field1 = new String[byte9 = class86.Field2().readByte()];
                    Class112.Field2 = new byte[byte9];
                    for (byte b4 = 0; b4 < byte9; ++b4) {
                        Class112.Field2[b4] = class86.Field2().readByte();
                        Class112.Field1[b4] = class86.Field2().readUTF();
                    }
                    MainTab.Field6 = class86.Field2().readUTF();
                    final byte byte10 = class86.Field2().readByte();
                    new StringBuffer(String.valueOf(byte10)).append("tong so tile").toString();
                    for (byte b5 = 0; b5 < byte10; ++b5) {
                        final short short3;
                        final byte[] array4 = new byte[short3 = class86.Field2().readShort()];
                        for (short n9 = 0; n9 < short3; ++n9) {
                            array4[n9] = class86.Field2().readByte();
                        }
                        Class826.Field1(Class105.Field39[b5], array4);
                    }
                    class86.Field2().readByte();
                    try {
                        Class98.Field1.clear();
                        for (byte byte11 = class86.Field2().readByte(), b6 = 0; b6 < byte11; ++b6) {
                            final byte[] array5 = new byte[class86.Field2().readShort()];
                            class86.Field2().read(array5);
                            Class98.Field1((int) b6, array5);
                        }
                    } catch (final Exception ex4) {
                    }
                    return;
                }
                case 3: {
                    final Class585 field15 = Class105.Field19.Field15;
                    try {
                        ((Class672) field15).Field189 = class86.Field2().readShort();
                        ((Class359) field15).Field65 = class86.Field2().readUTF();
                        ((Class359) field15).Field77 = (short) Class21.Field7.Field1(((Class359) field15).Field65);
                        final Class111 class88 = (Class111) field15;
                        final Class111 class89 = (Class111) field15;
                        final int int1 = class86.Field2().readInt();
                        class89.Field2 = int1;
                        class88.Field4 = int1;
                        ((Class111) field15).Field5 = class86.Field2().readInt();
                        ((Class359) field15).Field130 = class86.Field2().readInt();
                        ((Class359) field15).Field129 = class86.Field2().readInt();
                        ((Class359) field15).Field88 = class86.Field2().readByte();
                        ((Class359) field15).Field93 = class86.Field2().readByte();
                        ((Class111) field15).Field19 = class86.Field2().readInt();
                        ((Class111) field15).Field20 = class86.Field2().readInt();
                        ((Class111) field15).Field21 = class86.Field2().readInt();
                        ((Class111) field15).Field13 = class86.Field2().readShort();
                        ((Class111) field15).Field14 = class86.Field2().readShort();
                        ((Class111) field15).Field15 = class86.Field2().readShort();
                        ((Class111) field15).Field24 = class86.Field2().readByte();
                        ((Class111) field15).Field22 = class86.Field2().readByte();
                        ((Class359) field15).Field96 = class86.Field2().readShort();
                        ((Class359) field15).Field80 = class86.Field2().readShort();
                        ((Class359) field15).Field82 = class86.Field2().readShort();
                        ((Class359) field15).Field81 = class86.Field2().readShort();
                        ((Class359) field15).Field83 = class86.Field2().readShort();
                        ((Class359) field15).Field84 = class86.Field2().readShort();
                        ((Class359) field15).Field78 = class86.Field2().readShort();
                        ((Class359) field15).Field79 = class86.Field2().readShort();
                        field15.Field183 = class86.Field2().readInt();
                        ((Class359) field15).Field154 = class86.Field2().readShort();
                        Class359.Field97 = new byte[class86.Field2().readByte()];
                        for (int n10 = 0; n10 < Class359.Field97.length; ++n10) {
                            Class359.Field97[n10] = class86.Field2().readByte();
                        }
                        ((Class672) field15).Field199 = class86.Field2().readShort();
                        if (((Class672) field15).Field199 > 0) {
                            ((Class672) field15).Field207 = true;
                        }
                        ((Class359) field15).Field68 = class86.Field2().readByte();
                        final byte byte12;
                        if ((byte12 = class86.Field2().readByte()) >= 0) {
                            ((Class359) field15).Field167 = (byte) (byte12 - 1);
                        }
                        ((Class359) field15).Field168 = class86.Field2().readByte();
                        ((Class359) field15).Field166 = class86.Field2().readByte();
                        ((Class111) field15).Field17 = class86.Field2().readByte();
                        ((Class672) field15).Field190 = class86.Field2().readShort();
                        if (((Class672) field15).Field190 != -1) {
                            ((Class359) Class105.Field19.Field15).Field57 = class86.Field2().readByte();
                        }
                        if (((Class359) Class105.Field19.Field15).Field57 == 0) {
                            Class359.Field56 = class86.Field2().readBoolean();
                        }
                        ((Class359) field15).Field140 = class86.Field2().readBoolean();
                        field15.Field35 = class86.Field2().readByte();
                        ((Class672) field15).Field201 = class86.Field2().readByte();
                        ((Class672) field15).Field202 = class86.Field2().readByte();
                        ((Class359) field15).Field156 = class86.Field2().readShort();
                        ((Class359) field15).Field155 = class86.Field2().readInt();
                        ((Class359) field15).Field157 = class86.Field2().readShort();
                        field15.Field184 = class86.Field2().readInt();
                        field15.Field185 = class86.Field2().readUTF();
                        ((Class359) field15).Field62 = class86.Field2().readBoolean();
                        int short4;
                        int byte13;
                        try {
                            short4 = class86.Field2().readShort();
                            byte13 = class86.Field2().readByte();
                        } catch (final Exception ex5) {
                            short4 = -1;
                            byte13 = -1;
                        }
                        ((Class359) Class105.Field19.Field15).Field2(short4, byte13);
                        int short5;
                        int byte14;
                        int short6;
                        try {
                            short5 = class86.Field2().readShort();
                            byte14 = class86.Field2().readByte();
                            short6 = class86.Field2().readShort();
                        } catch (final Exception ex6) {
                            short5 = -1;
                            byte14 = -1;
                            short6 = -1;
                        }
                        ((Class359) Class105.Field19.Field15).Field1(short5, byte14, short6);
                        short short7;
                        short short8;
                        short short9;
                        try {
                            short7 = class86.Field2().readShort();
                            short8 = class86.Field2().readShort();
                            short9 = class86.Field2().readShort();
                        } catch (final Exception ex7) {
                            short7 = -1;
                            short8 = -1;
                            short9 = -1;
                        }
                        ((Class359) Class105.Field19.Field15).Field1(short7, short8, short9);
                        try {
                            final byte byte15;
                            final short[] array6 = new short[byte15 = class86.Field2().readByte()];
                            final byte[] array7 = new byte[byte15];
                            for (byte b7 = 0; b7 < byte15; ++b7) {
                                array6[b7] = class86.Field2().readShort();
                                array7[b7] = class86.Field2().readByte();
                            }
                            ((Class359) Class105.Field19.Field15).Field1(array6, array7);
                            final String utf5;
                            if (!(utf5 = class86.Field2().readUTF()).equals("")) {
                                Class467.Field9 = Class802.Field1(utf5, "@");
                            } else {
                                Class467.Field9 = null;
                            }
                        } catch (final Exception ex8) {
                        }
                        short short10;
                        try {
                            short10 = class86.Field2().readShort();
                        } catch (final Exception ex9) {
                            short10 = -1;
                        }
                        ((Class359) Class105.Field19.Field15).Field107 = short10;
                    } catch (final Exception ex10) {
                    }
                    byte byte16;
                    short short11;
                    byte byte17;
                    byte byte18;
                    try {
                        byte16 = class86.Field2().readByte();
                        short11 = class86.Field2().readShort();
                        byte17 = class86.Field2().readByte();
                        byte18 = class86.Field2().readByte();
                    } catch (final Exception ex11) {
                        byte16 = -1;
                        short11 = -1;
                        byte17 = 0;
                        byte18 = 0;
                    }
                    ((Class359) Class105.Field19.Field15).Field110 = byte16;
                    ((Class359) Class105.Field19.Field15).Field115 = short11;
                    ((Class359) Class105.Field19.Field15).Field111 = byte17;
                    ((Class359) Class105.Field19.Field15).Field112 = byte18;
                    byte byte19;
                    short short12;
                    byte byte20;
                    try {
                        byte19 = class86.Field2().readByte();
                        short12 = class86.Field2().readShort();
                        byte20 = class86.Field2().readByte();
                    } catch (final Exception ex12) {
                        byte19 = -1;
                        short12 = -1;
                        byte20 = 0;
                    }
                    ((Class359) Class105.Field19.Field15).Field114 = byte19;
                    ((Class359) Class105.Field19.Field15).Field116 = short12;
                    ((Class359) Class105.Field19.Field15).Field113 = byte20;
                    Class105.Field19.Field10();
                    return;
                }
                case 5: {
                    if (!Class105.Field19.Field17) {
                        return;
                    }
                    final short short13 = class86.Field2().readShort();
                    final Class359 class90;
                    if ((class90 = (Class359) Class105.Field19.Field2(short13)) != null) {
                        ((Class672) class90).Field189 = short13;
                        if (((Class111) class90).Field25 != -1) {
                            ((Class111) class90).Field12 = 0;
                        }
                        class90.Field65 = class86.Field2().readUTF();
                        ((Class672) class90).Field193 = class86.Field2().readShort();
                        ((Class672) class90).Field194 = class86.Field2().readShort();
                        ((Class111) class90).Field4 = class86.Field2().readInt();
                        ((Class111) class90).Field5 = class86.Field2().readInt();
                        class90.Field130 = class86.Field2().readInt();
                        class90.Field129 = class86.Field2().readInt();
                        class90.Field88 = class86.Field2().readByte();
                        class90.Field93 = class86.Field2().readByte();
                        class86.Field2().read(class90.Field133, 0, class90.Field133.length);
                        for (int n11 = 0; n11 < class90.Field133.length; ++n11) {
                            class90.Field135[n11] = class86.Field2().readShort();
                        }
                        ((Class672) class90).Field199 = class86.Field2().readShort();
                        ((Class672) class90).Field200 = class86.Field2().readByte();
                        ((Class111) class90).Field20 = class86.Field2().readShort();
                        ((Class111) class90).Field21 = class86.Field2().readShort();
                        ((Class111) class90).Field22 = class86.Field2().readByte();
                        ((Class111) class90).Field24 = class86.Field2().readByte();
                        final byte byte21;
                        if ((byte21 = class86.Field2().readByte()) >= 0) {
                            class90.Field167 = (byte) (byte21 - 1);
                        }
                        class90.Field168 = class86.Field2().readByte();
                        class90.Field166 = class86.Field2().readByte();
                        ((Class111) class90).Field17 = class86.Field2().readByte();
                        ((Class672) class90).Field190 = class86.Field2().readShort();
                        ((Class111) class90).Field25 = class86.Field2().readByte();
                        if (((Class672) class90).Field190 != -1) {
                            class90.Field57 = class86.Field2().readByte();
                        }
                        class90.Field94 = class86.Field2().readByte();
                        for (int n12 = 0; n12 < class90.Field153.length; ++n12) {
                            class90.Field153[n12] = class86.Field2().readShort();
                        }
                        class90.Field140 = class86.Field2().readBoolean();
                        class90.Field35();
                        Class63.Field1(class90);
                        if (class86.Field2().readBoolean()) {
                            Class105.Field19.Field28.Field21((int) ((Class672) class90).Field189);
                        }
                        ((Class672) class90).Field201 = class86.Field2().readByte();
                        ((Class672) class90).Field202 = class86.Field2().readByte();
                        class90.Field62 = class86.Field2().readBoolean();
                        int short14;
                        int byte22;
                        try {
                            short14 = class86.Field2().readShort();
                            byte22 = class86.Field2().readByte();
                        } catch (final Exception ex13) {
                            short14 = -1;
                            byte22 = -1;
                        }
                        class90.Field2(short14, byte22);
                        int short15;
                        int byte23;
                        int short16;
                        try {
                            short15 = class86.Field2().readShort();
                            byte23 = class86.Field2().readByte();
                            short16 = class86.Field2().readShort();
                        } catch (final Exception ex14) {
                            short15 = -1;
                            byte23 = -1;
                            short16 = -1;
                        }
                        class90.Field1(short15, byte23, short16);
                        short short17;
                        short short18;
                        short short19;
                        try {
                            short17 = class86.Field2().readShort();
                            short18 = class86.Field2().readShort();
                            short19 = class86.Field2().readShort();
                        } catch (final Exception ex15) {
                            short17 = -1;
                            short18 = -1;
                            short19 = -1;
                        }
                        class90.Field1(short17, short18, short19);
                        try {
                            final byte byte24;
                            final short[] array8 = new short[byte24 = class86.Field2().readByte()];
                            final byte[] array9 = new byte[byte24];
                            for (byte b8 = 0; b8 < byte24; ++b8) {
                                array8[b8] = class86.Field2().readShort();
                                array9[b8] = class86.Field2().readByte();
                            }
                            class90.Field1(array8, array9);
                        } catch (final Exception ex16) {
                        }
                        short short20;
                        try {
                            short20 = class86.Field2().readShort();
                        } catch (final Exception ex17) {
                            short20 = -1;
                        }
                        class90.Field107 = short20;
                        byte byte25;
                        short short21;
                        byte byte26;
                        byte byte27;
                        try {
                            byte25 = class86.Field2().readByte();
                            short21 = class86.Field2().readShort();
                            byte26 = class86.Field2().readByte();
                            byte27 = class86.Field2().readByte();
                        } catch (final Exception ex18) {
                            byte25 = -1;
                            short21 = -1;
                            byte26 = 0;
                            byte27 = 0;
                        }
                        class90.Field110 = byte25;
                        class90.Field115 = short21;
                        class90.Field111 = byte26;
                        class90.Field112 = byte27;
                        byte byte28;
                        short short22;
                        byte byte29;
                        try {
                            byte28 = class86.Field2().readByte();
                            short22 = class86.Field2().readShort();
                            byte29 = class86.Field2().readByte();
                        } catch (final Exception ex19) {
                            byte28 = -1;
                            short22 = -1;
                            byte29 = 0;
                        }
                        class90.Field114 = byte28;
                        class90.Field116 = short22;
                        class90.Field113 = byte29;
                    }
                    return;
                }
                case 12: {
                    final short short23 = class86.Field2().readShort();
                    final short short24 = class86.Field2().readShort();
                    final short short25 = class86.Field2().readShort();
                    byte byte30 = -1;
                    try {
                        byte30 = class86.Field2().readByte();
                    } catch (final Exception ex20) {
                        ex20.printStackTrace();
                    }
                    final short short26 = class86.Field2().readShort();
                    final String utf6 = class86.Field2().readUTF();
                    byte[] array10 = null;
                    try {
                        if (class86.Field2().readBoolean()) {
                            int read;
                            int n13;
                            for (read = 0, n13 = 0, array10 = new byte[class86.Field2().available()]; read != -1; read = class86.Field2().read(array10, 0, array10.length - n13), n13 += read) {
                                if (n13 >= array10.length) {
                                    break;
                                }
                            }
                        }
                    } catch (final Exception ex21) {
                    }
                    Class105.Field19.Field1(short23, short24, short25, short26, utf6, array10);
                    Class458.Field11 = byte30;
                    return;
                }
                case 4:
                    while (class86.Field2().available() > 0) {
                        final byte byte31 = class86.Field2().readByte();
                        final short n14 = (short) class86.Field2().readUnsignedByte();
                        final short short27 = class86.Field2().readShort();
                        final short short28 = class86.Field2().readShort();
                        final short short29 = class86.Field2().readShort();
                        final byte byte32 = class86.Field2().readByte();
                        byte byte33 = 0;
                        int int2 = -1;
                        try {
                            int2 = class86.Field2().readInt();
                        } catch (final Exception ex22) {
                        }
                        try {
                            if (byte31 == 1) {
                                byte33 = class86.Field2().readByte();
                            }
                        } catch (final Exception ex23) {
                        }
                        byte byte34 = -1;
                        try {
                            byte34 = class86.Field2().readByte();
                        } catch (final Exception ex24) {
                        }
                        boolean boolean1 = true;
                        try {
                            boolean1 = class86.Field2().readBoolean();
                        } catch (final Exception ex25) {
                        }
                        Class105.Field19.Field1(byte31, n14, short27, short28, short29, byte32, int2, byte33, byte34, boolean1);
                    }
                    return;
                case 8:
                    while (class86.Field2().available() > 0) {
                        Class105.Field19.Field4(class86.Field2().readShort());
                    }
                    return;
                case 7: {
                    final Class180 class91;
                    (class91 = new Class180()).Field1 = class86.Field2().readShort();
                    class91.Field8 = (short) class86.Field2().readUnsignedByte();
                    class91.Field2 = class86.Field2().readShort();
                    class91.Field3 = class86.Field2().readShort();
                    class91.Field5 = class86.Field2().readInt();
                    class91.Field4 = class86.Field2().readByte();
                    class91.Field9 = class86.Field2().readByte();
                    class91.Field6 = class86.Field2().readInt();
                    class91.Field7 = class86.Field2().readInt();
                    Class105.Field19.Field1(class91);
                    return;
                }
                case 6:
                    Class105.Field19.Field1(class86.Field2().readShort(), class86.Field2().readShort(), class86.Field2().readByte(), class86.Field2().readInt(), class86.Field2().readInt(), class86.Field2().readByte(), class86.Field2().readByte(), class86.Field2().readByte(), class86.Field2().readByte());
                    return;
                case 9:
                    Class105.Field19.Field2(class86.Field2().readShort(), class86.Field2().readShort(), class86.Field2().readByte(), class86.Field2().readInt(), class86.Field2().readInt(), class86.Field2().readByte(), class86.Field2().readByte(), class86.Field2().readByte(), class86.Field2().readByte());
                    return;
                case 106:
                    Class105.Field19.Field1(class86);
                    return;
                case 10:
                    Class105.Field19.Field1(class86.Field2().readShort(), class86.Field2().readShort(), class86.Field2().readInt(), class86.Field2().readInt());
                    return;
                case 83:
                    Class105.Field19.Field2(class86);
                    return;
                case 17:
                    try {
                        final Class14 class92;
                        (class92 = new Class14()).Field1 = class86.Field2().readShort();
                        class92.Field2 = class86.Field2().readShort();
                        class92.Field3 = class86.Field2().readByte();
                        class92.Field5 = class86.Field2().readInt();
                        class92.Field6 = class86.Field2().readByte();
                        class92.Field4 = new Class235[class86.Field2().readByte()];
                        for (int n15 = 0; n15 < class92.Field4.length; ++n15) {
                            class92.Field4[n15] = new Class235();
                            class92.Field4[n15].Field1 = class86.Field2().readByte();
                            final String string = String.valueOf(class92.Field4[n15].Field1) + "_";
                            class92.Field4[n15].Field2 = class86.Field2().readShort();
                            final String string2 = String.valueOf(string) + class92.Field4[n15].Field2 + "_";
                            class92.Field4[n15].Field3 = class86.Field2().readShort();
                            final String string3 = String.valueOf(string2) + class92.Field4[n15].Field3 + "_";
                            class92.Field4[n15].Field4 = class86.Field2().readShort();
                            final String string4 = String.valueOf(string3) + class92.Field4[n15].Field4 + "_";
                            class92.Field4[n15].Field5 = class86.Field2().readShort();
                            new StringBuffer(String.valueOf(string4)).append(class92.Field4[n15].Field5).append("_").toString();
                        }
                        if (class86.Field2().available() > 0) {
                            class92.Field7 = class86.Field2().readByte();
                        }
                        if (class86.Field2().available() > 0) {
                            class86.Field2().readByte();
                        }
                        if (class86.Field2().available() > 0) {
                            class92.Field8 = class86.Field2().readByte();
                        }
                        Class105.Field19.Field1(class92);
                    } catch (final Exception ex26) {
                        new StringBuffer("LOI TRONG HAM NHAN DATA ").append(ex26.toString()).toString();
                    }
                    return;
                case 64: {
                    final Class235[] array11 = new Class235[class86.Field2().readByte()];
                    for (int n16 = 0; n16 < array11.length; ++n16) {
                        array11[n16] = new Class235();
                        array11[n16].Field1 = class86.Field2().readByte();
                        array11[n16].Field2 = class86.Field2().readByte();
                        array11[n16].Field3 = class86.Field2().readShort();
                        array11[n16].Field4 = class86.Field2().readShort();
                        array11[n16].Field5 = class86.Field2().readShort();
                    }
                    return;
                }
                case 11:
                    Class105.Field19.Field11();
                    return;
                case 13: {
                    final byte byte35 = class86.Field2().readByte();
                    if (byte35 == -1) {
                        Class105.Field1(class86.Field2().readUTF());
                        return;
                    }
                    final Class585[] array12 = new Class585[byte35];
                    for (byte b9 = 0; b9 < byte35; ++b9) {
                        array12[b9] = new Class585();
                        ((Class359) array12[b9]).Field55 = class86.Field2().readInt();
                        ((Class359) array12[b9]).Field65 = class86.Field2().readUTF();
                        ((Class359) array12[b9]).Field88 = class86.Field2().readByte();
                        for (byte byte36 = class86.Field2().readByte(), b10 = 0; b10 < byte36; ++b10) {
                            final byte byte37 = class86.Field2().readByte();
                            final byte byte38 = class86.Field2().readByte();
                            if (byte37 == 0) {
                                ((Class359) array12[b9]).Field85 = byte38;
                            } else if (byte37 == 1) {
                                ((Class359) array12[b9]).Field86 = byte38;
                            } else if (byte37 == 2) {
                                ((Class359) array12[b9]).Field87 = byte38;
                            } else if (byte37 == 3 || byte37 == 4 || byte37 == 5 || byte37 == 6 || byte37 == 7) {
                                ((Class359) array12[b9]).Field118 = byte37;
                                ((Class359) array12[b9]).Field117 = byte38;
                            } else if (byte37 == 19) {
                                ((Class359) array12[b9]).Field89 = byte38;
                            }
                        }
                        array12[b9].Field45 = class86.Field2().readShort();
                        ((Class359) array12[b9]).Field54 = class86.Field2().readByte();
                        ((Class672) array12[b9]).Field201 = class86.Field2().readByte();
                        array12[b9].Field50 = class86.Field2().readShort();
                        if (class86.Field2().readByte() != -1) {
                            final short short30;
                            final byte[] array13 = new byte[short30 = class86.Field2().readShort()];
                            for (short n17 = 0; n17 < short30; ++n17) {
                                array13[n17] = class86.Field2().readByte();
                            }
                            final short short31;
                            final byte[] array14 = new byte[short31 = class86.Field2().readShort()];
                            for (short n18 = 0; n18 < short31; ++n18) {
                                array14[n18] = class86.Field2().readByte();
                            }
                            ((Class359) array12[b9]).Field102 = Class804.Field1(array13, array14);
                            ((Class359) array12[b9]).Field104 = class86.Field2().readByte();
                            ((Class359) array12[b9]).Field105 = class86.Field2().readByte();
                        }
                    }
                    for (byte b11 = 0; b11 < byte35; ++b11) {
                        int int3;
                        try {
                            int3 = class86.Field2().readInt();
                        } catch (final Exception ex27) {
                            int3 = -1;
                        }
                        if (int3 != -1 && ((Class359) array12[b11]).Field55 == int3) {
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
                                short32 = class86.Field2().readShort();
                                byte39 = class86.Field2().readByte();
                                byte40 = class86.Field2().readByte();
                                short33 = class86.Field2().readShort();
                                byte41 = class86.Field2().readByte();
                                byte42 = class86.Field2().readByte();
                                short34 = class86.Field2().readShort();
                                byte43 = class86.Field2().readByte();
                                byte44 = class86.Field2().readByte();
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
                            ((Class359) array12[b11]).Field116 = short32;
                            ((Class359) array12[b11]).Field114 = byte39;
                            ((Class359) array12[b11]).Field113 = byte40;
                            ((Class359) array12[b11]).Field115 = short33;
                            ((Class359) array12[b11]).Field110 = byte41;
                            ((Class359) array12[b11]).Field112 = byte42;
                            ((Class359) array12[b11]).Field109 = short34;
                            ((Class359) array12[b11]).Field108 = byte43;
                            ((Class359) array12[b11]).Field111 = byte44;
                        }
                    }
                    Class181.Field5().Field1(array12);
                    ((Class665) Class181.Field5()).Field1();
                    return;
                }
                case 15: {
                    if (class86.Field2().readByte() == 0) {
                        final Vector vector2 = new Vector();
                        final short short35 = class86.Field2().readShort();
                        for (byte byte45 = class86.Field2().readByte(), b12 = 0; b12 < byte45; ++b12) {
                            final Class537 class93 = new Class537();
                            final Class537 class95;
                            final Class537 class94 = class95 = class93;
                            final byte byte46 = class86.Field2().readByte();
                            class95.Field30 = byte46;
                            class93.Field13 = byte46;
                            class94.Field9 = class86.Field2().readShort();
                            class94.Field18 = class86.Field2().readShort();
                            class94.Field19 = class86.Field2().readByte();
                            class94.Field25 = class86.Field2().readByte();
                            class94.Field22 = class86.Field2().readShort();
                            class94.Field21 = class86.Field2().readShort();
                            class94.Field37 = class86.Field2().readByte();
                            class94.Field38 = class86.Field2().readByte();
                            class94.Field14 = class86.Field2().readByte();
                            class94.Field15 = class86.Field2().readByte();
                            class94.Field16 = class86.Field2().readByte();
                            class94.Field17 = class86.Field2().readByte();
                            class94.Field29 = class86.Field2().readByte();
                            class94.Field4 = class86.Field2().readUTF();
                            class94.Field34.removeAllElements();
                            class94.Field24 = System.currentTimeMillis();
                            class94.Field23 = class86.Field2().readUnsignedShort();
                            for (byte byte47 = class86.Field2().readByte(), b13 = 0; b13 < byte47; ++b13) {
                                class94.Field34.addElement(new Class818((short) class86.Field2().readUnsignedByte(), class86.Field2().readShort()));
                            }
                            class94.Field32 = true;
                            vector2.addElement(class94);
                        }
                        final byte byte48 = class86.Field2().readByte();
                        final short[] array15 = {-1, -1, -1, -1, -1};
                        for (int n19 = 0; n19 < array15.length; ++n19) {
                            array15[n19] = class86.Field2().readShort();
                        }
                        final byte byte49 = class86.Field2().readByte();
                        byte byte50 = 0;
                        String utf7 = "";
                        if (byte49 != -1) {
                            utf7 = class86.Field2().readUTF();
                            byte50 = class86.Field2().readByte();
                        }
                        final byte byte51 = class86.Field2().readByte();
                        Object o = null;
                        if (byte51 != -1) {
                            ((Class142) (o = new Class142())).Field43 = class86.Field2().readByte();
                            ((Class142) o).Field44 = class86.Field2().readByte();
                            ((Class142) o).Field38 = class86.Field2().readByte();
                            ((Class142) o).Field50 = class86.Field2().readUTF();
                            ((Class142) o).Field47 = class86.Field2().readInt();
                            ((Class142) o).Field49 = System.currentTimeMillis();
                            final Class142 class96 = (Class142) o;
                            final Class142 class97 = (Class142) o;
                            final byte b14 = 0;
                            class97.Field46 = b14;
                            class96.Field45 = b14;
                            ((Class672) o).Field188 = 12;
                        }
                        Class105.Field19.Field1(short35, vector2, byte48, byte49, utf7, (Class142) o, array15, byte50);
                        return;
                    }
                    final Vector vector3 = new Vector();
                    final short short36 = class86.Field2().readShort();
                    final byte byte52;
                    if ((byte52 = class86.Field2().readByte()) > -1) {
                        for (byte b15 = 0; b15 < byte52; ++b15) {
                            final Class537 class98 = new Class537();
                            final Class537 class100;
                            final Class537 class99 = class100 = class98;
                            final byte byte53 = class86.Field2().readByte();
                            class100.Field30 = byte53;
                            class98.Field13 = byte53;
                            class99.Field9 = class86.Field2().readShort();
                            class99.Field18 = class86.Field2().readShort();
                            class99.Field19 = class86.Field2().readByte();
                            class99.Field25 = class86.Field2().readByte();
                            class99.Field22 = class86.Field2().readShort();
                            class99.Field21 = class86.Field2().readShort();
                            class99.Field37 = class86.Field2().readByte();
                            class99.Field38 = class86.Field2().readByte();
                            class99.Field14 = class86.Field2().readByte();
                            class99.Field15 = class86.Field2().readByte();
                            class99.Field16 = class86.Field2().readByte();
                            class99.Field17 = class86.Field2().readByte();
                            class99.Field29 = class86.Field2().readByte();
                            class99.Field4 = class86.Field2().readUTF();
                            class99.Field34.removeAllElements();
                            for (byte byte54 = class86.Field2().readByte(), b16 = 0; b16 < byte54; ++b16) {
                                class99.Field34.addElement(new Class818((short) class86.Field2().readUnsignedByte(), class86.Field2().readShort()));
                            }
                            class99.Field32 = true;
                            vector3.addElement(class99);
                        }
                        final byte byte55 = class86.Field2().readByte();
                        Image field16 = null;
                        int width = 0;
                        int n20 = 0;
                        byte b17 = 1;
                        final byte[] array16 = new byte[class86.Field2().available()];
                        while (class86.Field2().available() > 0) {
                            class86.Field2().read(array16, 0, array16.length);
                        }
                        if (array16.length > 0) {
                            field16 = Class804.Field2(array16);
                            b17 = (byte) ((byte55 == 3) ? 3 : 6);
                            if (field16 != null) {
                                width = field16.getWidth();
                                n20 = field16.getHeight() / byte55;
                            }
                        }
                        Class467.Field5().Field10 = 0;
                        Class105.Field19.Field1(short36, vector3, field16, byte55, width, n20, b17);
                    }
                    return;
                }
                case 16: {
                    final byte byte56 = class86.Field2().readByte();
                    final int[] array17 = new int[Class359.Field51];
                    long long1 = 0L;
                    try {
                        if (byte56 == 0) {
                            long1 = class86.Field2().readLong();
                            array17[0] = 0;
                            for (int unsignedByte2 = class86.Field2().readUnsignedByte(), n21 = 0; n21 < unsignedByte2; ++n21) {
                                final int unsignedByte3 = class86.Field2().readUnsignedByte();
                                array17[unsignedByte3] = (Class585.Field42[unsignedByte3].Field1 = class86.Field2().readInt());
                            }
                        }
                        final Vector<Class537> vector4 = new Vector<Class537>();
                        if (byte56 == 1) {
                            for (short short37 = class86.Field2().readShort(), n22 = 0; n22 < short37; ++n22) {
                                final Class537 class101;
                                (class101 = new Class537()).Field13 = class86.Field2().readByte();
                                class101.Field9 = class86.Field2().readShort();
                                class101.Field18 = class86.Field2().readShort();
                                class101.Field19 = class86.Field2().readByte();
                                class101.Field25 = class86.Field2().readByte();
                                class101.Field22 = class86.Field2().readShort();
                                class101.Field21 = class86.Field2().readShort();
                                class101.Field30 = class86.Field2().readByte();
                                class101.Field35 = class86.Field2().readByte();
                                class101.Field36 = class86.Field2().readByte();
                                class101.Field37 = class86.Field2().readByte();
                                class101.Field14 = class86.Field2().readByte();
                                class101.Field15 = class86.Field2().readByte();
                                class101.Field16 = class86.Field2().readByte();
                                class101.Field17 = class86.Field2().readByte();
                                class101.Field29 = class86.Field2().readByte();
                                class101.Field4 = class86.Field2().readUTF();
                                class101.Field34.removeAllElements();
                                class101.Field24 = System.currentTimeMillis();
                                class101.Field23 = class86.Field2().readUnsignedShort();
                                for (byte byte57 = class86.Field2().readByte(), b18 = 0; b18 < byte57; ++b18) {
                                    class101.Field34.addElement(new Class818((short) class86.Field2().readUnsignedByte(), class86.Field2().readShort()));
                                }
                                class101.Field8 = class86.Field2().readByte();
                                class101.Field32 = true;
                                vector4.addElement(class101);
                            }
                        }
                        ((Class359) Class105.Field19.Field15).Field100 = class86.Field2().readInt();
                        final Vector vector5 = new Vector();
                        if (byte56 == 2) {
                            for (byte byte58 = class86.Field2().readByte(), b19 = 0; b19 < byte58; ++b19) {
                                final Class42 class102;
                                (class102 = new Class42()).Field5 = class86.Field2().readShort();
                                class86.Field2().readByte();
                                class102.Field8 = class86.Field2().readByte();
                                class102.Field3 = class86.Field2().readByte();
                                class102.Field2 = class86.Field2().readUTF();
                                class102.Field1 = class86.Field2().readUTF();
                                class102.Field4 = class86.Field2().readByte();
                                vector5.addElement(class102);
                            }
                            for (byte byte59 = class86.Field2().readByte(), b20 = 0; b20 < byte59; ++b20) {
                                final Class42 class103;
                                (class103 = new Class42()).Field5 = class86.Field2().readShort();
                                class86.Field2().readByte();
                                class103.Field8 = class86.Field2().readByte();
                                class103.Field2 = class86.Field2().readUTF();
                                class86.Field2().readByte();
                                class103.Field1 = class86.Field2().readUTF();
                                class103.Field7 = class86.Field2().readInt();
                                class103.Field6 = System.currentTimeMillis();
                                class103.Field4 = class86.Field2().readByte();
                                vector5.addElement(class103);
                            }
                        }
                        if (byte56 == 3) {
                            Class585.Field43 = new short[class86.Field2().readByte()];
                            for (int n23 = 0; n23 < Class585.Field43.length; ++n23) {
                                Class585.Field43[n23] = class86.Field2().readShort();
                            }
                        }
                        ((Class359) Class105.Field19.Field15).Field101 = class86.Field2().readInt();
                        Class105.Field19.Field1(long1, array17, (Vector) vector4, vector5, (int) byte56);
                    } catch (final Exception ex29) {
                        new StringBuffer("LOI CHARINVENTORY ").append(byte56).append(ex29.toString()).toString();
                    }
                    return;
                }
                case 18: {
                    final short short38 = class86.Field2().readShort();
                    final Class537 class104 = new Class537();
                    final Class537 class106;
                    final Class537 class105 = class106 = class104;
                    final byte byte60 = class86.Field2().readByte();
                    class106.Field13 = byte60;
                    class104.Field30 = byte60;
                    class105.Field11 = class86.Field2().readShort();
                    class105.Field9 = class86.Field2().readShort();
                    class105.Field18 = class86.Field2().readShort();
                    class105.Field19 = class86.Field2().readByte();
                    class105.Field25 = class86.Field2().readByte();
                    class105.Field21 = class86.Field2().readShort();
                    class105.Field22 = class86.Field2().readShort();
                    Class105.Field19.Field1(short38, class105);
                    return;
                }
                case 19:
                    Class105.Field19.Field1(class86.Field2().readShort(), class86.Field2().readShort(), (short) class86.Field2().readUnsignedByte(), class86.Field2().readShort());
                    return;
                case -65:
                    try {
                        Class105.Field19.Field2(class86.Field2().readShort(), class86.Field2().readShort(), class86.Field2().readByte());
                    } catch (final Exception ex30) {
                    }
                    return;
                case -41:
                    Class105.Field19.Field1(class86.Field2().readShort(), class86.Field2().readShort(), class86.Field2().readByte());
                    return;
                case 21: {
                    final Class537 class107;
                    (class107 = new Class537()).Field9 = class86.Field2().readShort();
                    class107.Field21 = class86.Field2().readShort();
                    class107.Field30 = class86.Field2().readByte();
                    class107.Field23 = class86.Field2().readUnsignedShort();
                    class107.Field34.removeAllElements();
                    for (byte byte61 = class86.Field2().readByte(), b21 = 0; b21 < byte61; ++b21) {
                        class107.Field34.addElement(new Class818((short) class86.Field2().readUnsignedByte(), class86.Field2().readShort()));
                    }
                    class107.Field19 = class86.Field2().readByte();
                    try {
                        class107.Field29 = class86.Field2().readByte();
                    } catch (final Exception ex31) {
                    }
                    Class105.Field19.Field1(class107);
                    return;
                }
                case 22: {
                    final short short39 = class86.Field2().readShort();
                    final byte byte62 = class86.Field2().readByte();
                    final short short40 = class86.Field2().readShort();
                    final int int4 = class86.Field2().readInt();
                    int byte63 = 0;
                    try {
                        byte63 = class86.Field2().readByte();
                    } catch (final Exception ex32) {
                    }
                    Class105.Field19.Field1(short39, byte62, short40, int4, byte63);
                    return;
                }
                case 23: {
                    final byte byte64;
                    if ((byte64 = class86.Field2().readByte()) == 0) {
                        final byte byte65;
                        final byte[] array18 = new byte[byte65 = class86.Field2().readByte()];
                        for (byte b22 = 0; b22 < byte65; ++b22) {
                            array18[b22] = class86.Field2().readByte();
                        }
                        Class105.Field19.Field1(array18);
                    }
                    if (byte64 == 1) {
                        final byte byte66 = class86.Field2().readByte();
                        Class467.Field5().Field23 = byte66;
                        final Vector<Class537> vector6 = new Vector<Class537>();
                        for (short short41 = class86.Field2().readShort(), n24 = 0; n24 < short41; ++n24) {
                            final Class537 class108;
                            (class108 = new Class537()).Field32 = true;
                            class108.Field27 = true;
                            final short short42 = class86.Field2().readShort();
                            if (byte66 == -1) {
                                class108.Field13 = (byte) Field1(short42);
                            } else {
                                class108.Field13 = byte66;
                            }
                            class108.Field18 = short42;
                            class108.Field30 = (byte) ((byte66 == -1) ? Field1(short42) : byte66);
                            final Class798 field17 = Class804.Field2((int) short42);
                            class108.Field25 = field17.Field6;
                            class108.Field21 = field17.Field7;
                            vector6.addElement(class108);
                        }
                        try {
                            Class537.Field39 = 2;
                            Class537.Field39 = class86.Field2().readByte();
                        } catch (final Exception ex33) {
                        }
                        Class105.Field19.Field2((Vector) vector6);
                    }
                    try {
                        if (byte64 == 2) {
                            final Vector<Class537> vector7 = new Vector<Class537>();
                            for (byte byte67 = class86.Field2().readByte(), b23 = 0; b23 < byte67; ++b23) {
                                final Class537 class109 = new Class537();
                                final byte byte68 = class86.Field2().readByte();
                                class109.Field9 = class86.Field2().readShort();
                                short short43;
                                if ((short43 = class86.Field2().readShort()) < 0) {
                                    short43 += 256;
                                }
                                class109.Field13 = byte68;
                                class109.Field18 = short43;
                                class109.Field19 = class86.Field2().readByte();
                                class109.Field25 = class86.Field2().readByte();
                                class109.Field22 = class86.Field2().readShort();
                                class109.Field21 = class86.Field2().readShort();
                                class109.Field30 = byte68;
                                vector7.addElement(class109);
                            }
                            Class105.Field19.Field1((Vector) vector7);
                        }
                    } catch (final Exception ex34) {
                        ex34.printStackTrace();
                    }
                    if (byte64 == 3) {
                        Class105.Field19.Field16();
                    }
                    if (byte64 == 4) {
                        final byte byte69;
                        final byte[] array19 = new byte[(byte69 = class86.Field2().readByte()) + 2];
                        for (byte b24 = 0; b24 < byte69; ++b24) {
                            array19[b24] = class86.Field2().readByte();
                        }
                        array19[byte69] = class86.Field2().readByte();
                        array19[byte69 + 1] = class86.Field2().readByte();
                        Class105.Field19.Field2(array19);
                    }
                    return;
                }
                case 25: {
                    final int unsignedByte4 = class86.Field2().readUnsignedByte();
                    Class798.Field16.clear();
                    for (int n25 = 0; n25 < unsignedByte4; ++n25) {
                        Class798.Field16.put(new StringBuffer(String.valueOf(n25)).toString(), new Class333((short) class86.Field2().readUnsignedByte(), class86.Field2().readUTF(), class86.Field2().readByte(), class86.Field2().readByte()));
                    }
                    for (byte byte70 = class86.Field2().readByte(), b25 = 0; b25 < byte70; ++b25) {
                        Class804.Field48[b25] = new Class118(class86.Field2().readShort(), class86.Field2().readShort());
                    }
                    for (int n26 = 0; n26 < 5; ++n26) {
                        Class804.Field44[n26] = class86.Field2().readByte();
                    }
                    final short short44;
                    final Class798[] array20 = new Class798[(short44 = class86.Field2().readShort()) + 1];
                    for (short n27 = 0; n27 < short44; ++n27) {
                        final short short45 = class86.Field2().readShort();
                        try {
                            array20[short45] = new Class798();
                            array20[short45].Field13 = short45;
                            array20[short45].Field1 = class86.Field2().readUTF();
                            array20[short45].Field3 = class86.Field2().readByte();
                            array20[short45].Field4 = class86.Field2().readByte();
                            class86.Field2().readByte();
                            array20[short45].Field5 = class86.Field2().readByte();
                            array20[short45].Field6 = class86.Field2().readByte();
                            array20[short45].Field7 = class86.Field2().readShort();
                            for (int n28 = 0; n28 < 10; ++n28) {
                                array20[short45].Field11[n28] = class86.Field2().readShort();
                            }
                            array20[short45].Field10 = class86.Field2().readInt();
                            array20[short45].Field12 = class86.Field2().readByte();
                            array20[short45].Field15 = class86.Field2().readByte();
                            array20[short45].Field8 = class86.Field2().readShort();
                            array20[short45].Field9 = class86.Field2().readShort();
                        } catch (final Exception ex35) {
                            ex35.printStackTrace();
                        }
                    }
                    Class804.Field4.addElement(array20);
                    final short short46 = class86.Field2().readShort();
                    Class804.Field5.removeAllElements();
                    for (short n29 = 0; n29 < short46; ++n29) {
                        final Class743 class110;
                        (class110 = new Class743()).Field15 = class86.Field2().readShort();
                        class110.Field12 = class86.Field2().readByte();
                        class110.Field18 = class86.Field2().readInt();
                        class110.Field10 = class86.Field2().readUTF();
                        final String substring = class110.Field10.substring(class110.Field10.length() - 1);
                        class110.Field11 = class86.Field2().readUTF();
                        class110.Field8 = class86.Field2().readByte();
                        try {
                            final int int5;
                            if ((int5 = Integer.parseInt(substring)) >= 4 && class110.Field8 != 4) {
                                class110.Field19 = (byte) (int5 - 4);
                            }
                        } catch (final Exception ex36) {
                        }
                        class110.Field17 = class86.Field2().readBoolean();
                        class110.Field9 = class86.Field2().readByte();
                        class110.Field16 = class86.Field2().readByte();
                        Class804.Field5.addElement(class110);
                    }
                    final int unsignedByte5 = class86.Field2().readUnsignedByte();
                    Class804.Field6.removeAllElements();
                    for (int n30 = 0; n30 < unsignedByte5; ++n30) {
                        final Class743 class111;
                        (class111 = new Class743()).Field15 = (short) class86.Field2().readUnsignedByte();
                        class111.Field12 = (short) class86.Field2().readUnsignedByte();
                        class111.Field18 = class86.Field2().readInt();
                        class111.Field10 = class86.Field2().readUTF();
                        class111.Field11 = class86.Field2().readUTF();
                        class111.Field16 = class86.Field2().readByte();
                        class111.Field7 = class86.Field2().readByte();
                        class111.Field17 = class86.Field2().readBoolean();
                        class111.Field13 = class86.Field2().readShort();
                        Class804.Field6.addElement(class111);
                    }
                    return;
                }
                case 26: {
                    Class804.Field46 = new Class50[class86.Field2().readUnsignedByte()];
                    final byte[] array21 = new byte[class86.Field2().readShort()];
                    class86.Field2().read(array21);
                    Class804.Field1(array21);
                    try {
                        final short n31;
                        final byte[][] array22 = new byte[n31 = (short) class86.Field2().readUnsignedByte()][];
                        for (short n32 = 0; n32 < n31; ++n32) {
                            array22[n32] = new byte[class86.Field2().readShort()];
                            class86.Field2().read(array22[n32]);
                        }
                        Class48.Field1(array22);
                    } catch (final Exception ex37) {
                        ex37.printStackTrace();
                    }
                    try {
                        for (short n33 = (short) class86.Field2().readUnsignedByte(), n34 = 0; n34 < n33; ++n34) {
                            final short short47 = class86.Field2().readShort();
                            final byte[] array23 = new byte[class86.Field2().readShort()];
                            class86.Field2().read(array23);
                            Class121.Field1.put(new StringBuffer().append(short47).toString(), new Class132(array23, (int) short47));
                        }
                    } catch (final Exception ex38) {
                    }
                    try {
                        for (int unsignedByte6 = class86.Field2().readUnsignedByte(), n35 = 0; n35 < unsignedByte6; ++n35) {
                            final short short48 = class86.Field2().readShort();
                            final byte[] array24 = new byte[class86.Field2().readShort()];
                            class86.Field2().read(array24);
                            Class271.Field6.put(new StringBuffer(String.valueOf(short48)).toString(), new Class349((int) short48, array24));
                        }
                    } catch (final Exception ex39) {
                    }
                    try {
                        final byte byte71;
                        Class359.Field172 = new byte[byte71 = class86.Field2().readByte()][];
                        Class359.Field173 = new byte[byte71][];
                        for (byte b26 = 0; b26 < byte71; ++b26) {
                            Class359.Field172[b26] = new byte[4];
                            Class359.Field173[b26] = new byte[4];
                            for (int n36 = 0; n36 < 4; ++n36) {
                                Class359.Field172[b26][n36] = class86.Field2().readByte();
                            }
                            for (int n37 = 0; n37 < 4; ++n37) {
                                Class359.Field173[b26][n37] = class86.Field2().readByte();
                            }
                        }
                    } catch (final Exception ex40) {
                        Class359.Field172 = new byte[][]{{0, 0, 7, -7}};
                        Class359.Field173 = new byte[][]{{-20, -15, -15, -15}};
                    }
                    try {
                        for (int n38 = 0; n38 < 2; ++n38) {
                            final byte byte72 = class86.Field2().readByte();
                            Class359.Field174[n38] = new byte[byte72];
                            for (byte b27 = 0; b27 < byte72; ++b27) {
                                Class359.Field174[n38][b27] = class86.Field2().readByte();
                            }
                        }
                    } catch (final Exception ex41) {
                        Class359.Field174 = new byte[][]{new byte[1], new byte[1]};
                    }
                    try {
                        for (int n39 = 0; n39 < 2; ++n39) {
                            final byte byte73 = class86.Field2().readByte();
                            Class359.Field175[n39] = new byte[byte73];
                            for (byte b28 = 0; b28 < byte73; ++b28) {
                                Class359.Field175[n39][b28] = class86.Field2().readByte();
                            }
                        }
                    } catch (final Exception ex42) {
                        Class359.Field175 = new byte[][]{new byte[1], new byte[1]};
                    }
                    try {
                        for (int n40 = 0; n40 < 2; ++n40) {
                            final byte byte74 = class86.Field2().readByte();
                            Class359.Field176[n40] = new byte[byte74];
                            for (byte b29 = 0; b29 < byte74; ++b29) {
                                Class359.Field176[n40][b29] = class86.Field2().readByte();
                            }
                        }
                    } catch (final Exception ex43) {
                        Class359.Field176 = new byte[][]{new byte[1], new byte[1]};
                    }
                    return;
                }
                case 100:
                    Class63.Field26(class86);
                    return;
                case 58: {
                    final byte byte75;
                    final int[] array25 = new int[byte75 = class86.Field2().readByte()];
                    for (byte b30 = 0; b30 < byte75; ++b30) {
                        array25[b30] = class86.Field2().readShort();
                    }
                    return;
                }
                case 24:
                    Class105.Field7();
                    return;
                case 27:
                    Class105.Field19.Field1(class86.Field2().readShort(), class86.Field2().readUTF());
                    return;
                case 28:
                    Class105.Field19.Field7(class86.Field2().readShort());
                    return;
                case 78:
                    Class105.Field19.Field8(class86.Field2().readShort());
                    return;
                case 61: {
                    final short short49 = class86.Field2().readShort();
                    final short short50 = class86.Field2().readShort();
                    final Class235 class112;
                    (class112 = new Class235()).Field1 = class86.Field2().readByte();
                    class112.Field2 = class86.Field2().readByte();
                    class112.Field3 = class86.Field2().readShort();
                    class112.Field4 = class86.Field2().readShort();
                    class112.Field5 = class86.Field2().readShort();
                    Class105.Field19.Field1(short49, short50, class112);
                    return;
                }
                case 30:
                    Class105.Field19.Field1(class86.Field2().readShort(), class86.Field2().readShort(), class86.Field2().readInt());
                    return;
                case 32: {
                    final short short51 = class86.Field2().readShort();
                    final byte byte76;
                    final Class790[] array26 = new Class790[byte76 = class86.Field2().readByte()];
                    for (byte b31 = 0; b31 < byte76; ++b31) {
                        array26[b31] = new Class790();
                        array26[b31].Field2 = class86.Field2().readUTF();
                        array26[b31].Field1 = class86.Field2().readInt();
                    }
                    if (short51 == ((Class672) Class105.Field19.Field15).Field189) {
                        ((Class111) Class105.Field19.Field15).Field22 = class86.Field2().readByte();
                        ((Class359) Class105.Field19.Field15).Field96 = class86.Field2().readShort();
                    }
                    Class105.Field19.Field1(short51, array26);
                    return;
                }
                case 33:
                    Class105.Field19.Field1(class86.Field2().readShort(), class86.Field2().readByte(), class86.Field2().readInt(), class86.Field2().readInt());
                    return;
                case 35:
                    Class602.Field6 = new short[1][15][11];
                    for (int n41 = 0; n41 < 15; ++n41) {
                        for (int n42 = 0; n42 < 11; ++n42) {
                            Class602.Field6[0][n41][n42] = class86.Field2().readShort();
                        }
                    }
                    Class602.Field8 = new int[1][15][11];
                    for (int n43 = 0; n43 < 15; ++n43) {
                        for (int n44 = 0; n44 < 11; ++n44) {
                            Class602.Field8[0][n43][n44] = class86.Field2().readShort() * 100;
                        }
                    }
                    Class602.Field10 = new short[1][15];
                    for (int n45 = 0; n45 < 15; ++n45) {
                        Class602.Field10[0][n45] = class86.Field2().readShort();
                    }
                    Class602.Field9 = new short[1][15][11];
                    for (int n46 = 0; n46 < 15; ++n46) {
                        for (int n47 = 0; n47 < 11; ++n47) {
                            Class602.Field9[0][n46][n47] = (short) class86.Field2().readUnsignedByte();
                        }
                    }
                    Class602.Field7 = new short[15][11];
                    for (int n48 = 0; n48 < 15; ++n48) {
                        for (int n49 = 0; n49 < 11; ++n49) {
                            Class602.Field7[n48][n49] = class86.Field2().readShort();
                        }
                    }
                    Class602.Field2 = new byte[15][11];
                    for (int n50 = 0; n50 < 15; ++n50) {
                        for (int n51 = 0; n51 < 11; ++n51) {
                            Class602.Field2[n50][n51] = class86.Field2().readByte();
                        }
                    }
                    Class602.Field5 = new byte[5][];
                    for (int n52 = 0; n52 < 5; ++n52) {
                        Class602.Field5[n52] = new byte[class86.Field2().readByte()];
                        for (int n53 = 0; n53 < Class602.Field5[n52].length; ++n53) {
                            Class602.Field5[n52][n53] = class86.Field2().readByte();
                        }
                    }
                    return;
                case 14:
                    Class105.Field1("Xin chọn tên nhân vật khác");
                    return;
                case 34:
                    Class105.Field7();
                    return;
                case 36:
                    Class105.Field7();
                    return;
                case 48:
                    Class105.Field19.Field9(class86.Field2().readShort());
                    return;
                case 49:
                    Class105.Field19.Field3(class86);
                    return;
                case 50:
                    Class105.Field19.Field4(class86);
                    return;
                case 38:
                    Class63.Field27.addElement(class86.Field2().readUTF());
                    return;
                case 37: {
                    final String utf8 = class86.Field2().readUTF();
                    final String utf9;
                    if ((utf9 = class86.Field2().readUTF()).equals("")) {
                        Class105.Field1(utf8);
                        return;
                    }
                    Class105.Field19.Field84 = true;
                    final Class222 class113 = new Class222(this, utf9);
                    Class105.Field24.Field1 = false;
                    Class105.Field24.Field1(utf8, new Class87("OK", (Class258) class113), new Class87("", (Class258) class113), new Class87("Đóng", (Class258) new Class224(this)));
                    Class105.Field23 = (Class277) Class105.Field24;
                    return;
                }
                case 39: {
                    final String utf10 = class86.Field2().readUTF();
                    new StringBuffer("UNAME ").append(utf10).toString();
                    final boolean boolean2 = class86.Field2().readBoolean();
                    System.out.println("UNAME1 " + boolean2);
                    final String utf11 = class86.Field2().readUTF();
                    final String utf12 = class86.Field2().readUTF();
                    System.out.println(String.valueOf(utf12) + " NOI DUNG");
                    if (!boolean2) {
                        Class105.Field1("Xin chọn nick khác");
                        return;
                    }
                    MainTab.Field1(String.valueOf(utf11) + utf10, "sms://" + utf12, (Class258) new Class210(this, utf10), (Class258) new Class215(this));
                    return;
                }
                case 20:
                    Class105.Field19.Field1(class86.Field2().readShort(), class86.Field2().readByte());
                    return;
                case 51:
                    Class105.Field19.Field5(class86);
                    return;
                case 52:
                    Class63.Field17();
                    return;
                case 54:
                    return;
                case 56:
                    return;
                case 59:
                    Class105.Field19.Field4(class86.Field2().readUTF());
                    return;
                case 57:
                    return;
                case -5:
                    for (byte byte77 = class86.Field2().readByte(), b32 = 0; b32 < byte77; ++b32) {
                        final String utf13 = class86.Field2().readUTF();
                        Class103.Field5().Field1(String.valueOf(utf13) + ": " + class86.Field2().readUTF(), utf13);
                    }
                    return;
                case -53:
                    Class63.Field1(class86, 6, class86.Field2().readUTF().toUpperCase());
                    return;
                case -7:
                    Class63.Field1(class86, 1, class86.Field2().readUTF().toUpperCase());
                    return;
                case -8: {
                    final byte byte78 = class86.Field2().readByte();
                    final byte byte79 = class86.Field2().readByte();
                    final byte[] array27 = new byte[class86.Field2().readShort()];
                    class86.Field2().read(array27);
                    switch (byte78) {
                        case 1:
                            Class381.Field1(array27);
                            return;
                        case 2: {
                            class86.Field2().read(new byte[class86.Field2().readShort()]);
                            final byte byte80;
                            final byte[][] array28 = new byte[byte80 = class86.Field2().readByte()][];
                            final byte[][][] array29 = new byte[byte80][][];
                            for (byte b33 = 0; b33 < byte80; ++b33) {
                                array28[b33] = new byte[class86.Field2().readShort()];
                                class86.Field2().read(array28[b33]);
                                final byte byte81 = class86.Field2().readByte();
                                array29[b33] = new byte[byte81][];
                                for (byte b34 = 0; b34 < byte81; ++b34) {
                                    array29[b33][b34] = new byte[class86.Field2().readShort()];
                                    class86.Field2().read(array29[b33][b34]);
                                }
                            }
                            Class381.Field1(byte79, array27, array28, array29);
                            return;
                        }
                        case 3:
                            Class381.Field1(byte79, array27);
                            return;
                        case 4:
                            Image.createImage(array27, 0, array27.length);
                            return;
                        default:
                            return;
                    }
                }
                case -9: {
                    final short short52;
                    final short[] array30 = new short[short52 = class86.Field2().readShort()];
                    for (short n54 = 0; n54 < short52; ++n54) {
                        array30[n54] = class86.Field2().readShort();
                    }
                    final String utf14;
                    if ((utf14 = class86.Field2().readUTF()).equals("")) {
                        Class105.Field19.Field1(array30);
                        return;
                    }
                    Class105.Field2(utf14, (Class258) new Class204(this, array30));
                    return;
                }
                case -10: {
                    final short short53 = class86.Field2().readShort();
                    final String utf15 = class86.Field2().readUTF();
                    ((Class672) Class105.Field19.Field15).Field190 = short53;
                    ((Class359) Class105.Field19.Field15).Field57 = 0;
                    Class745.Field5().Field6();
                    Class105.Field1(utf15);
                    return;
                }
                case -11: {
                    if (class86.Field2().readByte() == 0) {
                        final short short54 = class86.Field2().readShort();
                        Class105.Field1(class86.Field2().readUTF(), (Class258) new Class207(this, short54), (Class258) new Class200(this, short54));
                        return;
                    }
                    final String utf16 = class86.Field2().readUTF();
                    if (class86.Field2().readBoolean()) {
                        final short short55 = class86.Field2().readShort();
                        final short short56 = class86.Field2().readShort();
                        if (short55 == ((Class672) Class105.Field19.Field15).Field189) {
                            ((Class672) Class105.Field19.Field15).Field190 = short55;
                            Class745.Field5().Field6();
                        } else {
                            ((Class672) Class105.Field19.Field2(short55)).Field190 = short56;
                        }
                    }
                    Class105.Field1(utf16);
                    return;
                }
                case -12: {
                    final Class822 class114;
                    (class114 = new Class822()).Field1 = class86.Field2().readShort();
                    class114.Field2 = class86.Field2().readUTF();
                    class114.Field3 = class86.Field2().readUTF();
                    class114.Field7 = class86.Field2().readByte();
                    class114.Field8 = class86.Field2().readShort();
                    class114.Field9 = class86.Field2().readLong();
                    class114.Field12 = class86.Field2().readLong();
                    class114.Field10 = class86.Field2().readLong();
                    class114.Field4 = class86.Field2().readUTF();
                    class114.Field5 = class86.Field2().readUTF();
                    class114.Field11 = class86.Field2().readBoolean();
                    class114.Field13 = class86.Field2().readByte();
                    if (class114.Field11) {
                        class114.Field6 = class86.Field2().readUTF();
                    }
                    Class63.Field1(class114);
                    return;
                }
                case -13:
                    ((Class672) Class105.Field19.Field15).Field190 = -1;
                    Class105.Field1("Bạn bị mời khỏi bang hội.");
                    return;
                case -17: {
                    final Vector vector8 = new Vector();
                    for (short short57 = class86.Field2().readShort(), n55 = 0; n55 < short57; ++n55) {
                        final Class377 class115;
                        (class115 = new Class377()).Field2 = class86.Field2().readInt();
                        class115.Field1 = class86.Field2().readUTF();
                        class115.Field3 = class86.Field2().readUTF();
                        vector8.addElement(class115);
                    }
                    Class499.Field5().Field1(vector8, 2, "THÔNG BÁO");
                    Class499.Field5().Field1();
                    Class105.Field7();
                    return;
                }
                case -18:
                    Class103.Field5().Field1(class86.Field2().readUTF(), "Bang hội");
                    return;
                case -19: {
                    final byte byte82 = class86.Field2().readByte();
                    final String utf17 = class86.Field2().readUTF();
                    final Vector vector9 = new Vector();
                    if (byte82 == 5) {
                        for (short short58 = class86.Field2().readShort(), n56 = 0; n56 < short58; ++n56) {
                            final Class822 class116;
                            (class116 = new Class822()).Field1 = class86.Field2().readShort();
                            class116.Field2 = class86.Field2().readUTF();
                            class116.Field3 = class86.Field2().readUTF();
                            class116.Field7 = class86.Field2().readByte();
                            class116.Field8 = class86.Field2().readShort();
                            class116.Field9 = class86.Field2().readLong();
                            class116.Field13 = class86.Field2().readByte();
                            vector9.addElement(class116);
                        }
                        Class499.Field5().Field1(vector9, (int) byte82, "TOP BANG HỘI");
                        Class499.Field5().Field1();
                        Class105.Field7();
                        return;
                    }
                    if (byte82 == 7 || byte82 == 8) {
                        Class63.Field1(class86, (int) byte82, utf17);
                        return;
                    }
                    if (byte82 == 4) {
                        Class63.Field1(class86, (int) byte82, "TOP CAO THỦ");
                        return;
                    }
                    Class63.Field1(class86, (int) byte82, "TOP ĐẠI GIA");
                    return;
                }
                case -20: {
                    final int int6 = class86.Field2().readInt();
                    Class105.Field1("Bạn nhận được " + int6 + "xu từ bang hội.", (Class258) new Class202(this, int6));
                    return;
                }
                case -22: {
                    final Class359 class117 = new Class359();
                    if (class86.Field2().readByte() == 0) {
                        class117.Field65 = class86.Field2().readUTF();
                        class117.Field88 = class86.Field2().readByte();
                        ((Class111) class117).Field12 = 0;
                        ((Class111) class117).Field22 = class86.Field2().readByte();
                        class117.Field76 = 0;
                        final byte byte83 = class86.Field2().readByte();
                        final Vector vector10 = new Vector();
                        for (byte b35 = 0; b35 < byte83; ++b35) {
                            final Class537 class118 = new Class537();
                            final Class359 class119 = class117;
                            final Class537 class120 = class118;
                            final Class537 class121 = class118;
                            final byte byte84 = class86.Field2().readByte();
                            class121.Field13 = byte84;
                            class120.Field30 = byte84;
                            class119.Field93 = byte84;
                            class118.Field18 = class86.Field2().readShort();
                            class118.Field25 = class86.Field2().readByte();
                            class118.Field19 = class86.Field2().readByte();
                            class118.Field9 = class86.Field2().readShort();
                            class118.Field37 = class86.Field2().readByte();
                            class118.Field31 = new short[5];
                            for (int n57 = 0; n57 < 5; ++n57) {
                                class118.Field31[n57] = class86.Field2().readShort();
                            }
                            class118.Field14 = class86.Field2().readByte();
                            class118.Field15 = class86.Field2().readByte();
                            class118.Field16 = class86.Field2().readByte();
                            class118.Field17 = class86.Field2().readByte();
                            class118.Field29 = class86.Field2().readByte();
                            class118.Field4 = class86.Field2().readUTF();
                            for (int n58 = 0; n58 < class118.Field1.length; ++n58) {
                                class118.Field1[n58] = class86.Field2().readByte();
                            }
                            for (int n59 = 0; n59 < class118.Field3.length; ++n59) {
                                class118.Field3[n59] = class86.Field2().readByte();
                            }
                            for (int n60 = 0; n60 < class118.Field2.length; ++n60) {
                                class118.Field2[n60] = class86.Field2().readByte();
                            }
                            vector10.addElement(class118);
                            final Class798 field18;
                            if ((field18 = Class804.Field2((int) class118.Field18)).Field3 >= 3 && field18.Field3 < 8) {
                                Class263.Field1().Field1(2, (int) field18.Field3, (int) field18.Field4, Class804.Field2((int) class118.Field18).Field15);
                                Class105.Field8();
                            }
                        }
                        ((Class672) class117).Field190 = class86.Field2().readShort();
                        class117.Field94 = class86.Field2().readByte();
                        for (int n61 = 0; n61 < class117.Field153.length; ++n61) {
                            class117.Field153[n61] = class86.Field2().readShort();
                        }
                        class117.Field63 = class86.Field2().readByte();
                        if (class117.Field63 != -1) {
                            class117.Field66 = class86.Field2().readUTF();
                        }
                        class117.Field1(vector10);
                        if (Class105.Field19.Field16 != null) {
                            ((Class672) class117).Field189 = Class105.Field19.Field16.Field189;
                        }
                        Class63.Field2(class117);
                        return;
                    }
                    final Vector vector11 = new Vector();
                    final byte byte85;
                    if ((byte85 = class86.Field2().readByte()) > -1) {
                        for (byte b36 = 0; b36 < byte85; ++b36) {
                            final Class537 class122 = new Class537();
                            final Class537 class124;
                            final Class537 class123 = class124 = class122;
                            final byte byte86 = class86.Field2().readByte();
                            class124.Field30 = byte86;
                            class122.Field13 = byte86;
                            class123.Field9 = class86.Field2().readShort();
                            class123.Field18 = class86.Field2().readShort();
                            class123.Field19 = class86.Field2().readByte();
                            class123.Field25 = class86.Field2().readByte();
                            class123.Field22 = class86.Field2().readShort();
                            class123.Field21 = class86.Field2().readShort();
                            class123.Field37 = class86.Field2().readByte();
                            class123.Field31 = new short[5];
                            for (int n62 = 0; n62 < 5; ++n62) {
                                class123.Field31[n62] = class86.Field2().readShort();
                            }
                            class123.Field14 = class86.Field2().readByte();
                            class123.Field15 = class86.Field2().readByte();
                            class123.Field16 = class86.Field2().readByte();
                            class123.Field17 = class86.Field2().readByte();
                            class123.Field29 = class86.Field2().readByte();
                            class123.Field4 = class86.Field2().readUTF();
                            for (int n63 = 0; n63 < class123.Field1.length; ++n63) {
                                class123.Field1[n63] = class86.Field2().readByte();
                            }
                            for (int n64 = 0; n64 < class123.Field3.length; ++n64) {
                                class123.Field3[n64] = class86.Field2().readByte();
                            }
                            for (int n65 = 0; n65 < class123.Field2.length; ++n65) {
                                class123.Field2[n65] = class86.Field2().readByte();
                            }
                            vector11.addElement(class123);
                        }
                        Image field19 = null;
                        final byte byte87 = class86.Field2().readByte();
                        int width2 = 0;
                        int n66 = 0;
                        byte b37 = 0;
                        final byte[] array31 = new byte[class86.Field2().available()];
                        while (class86.Field2().available() > 0) {
                            class86.Field2().read(array31, 0, array31.length);
                        }
                        if (array31.length > 0) {
                            field19 = Class804.Field2(array31);
                            b37 = (byte) ((byte87 == 3) ? 3 : 6);
                            if (field19 != null) {
                                width2 = field19.getWidth();
                                n66 = field19.getHeight() / byte87;
                            }
                        }
                        Class105.Field19.Field1(Class105.Field19.Field29, vector11, field19, byte87, width2, n66, b37);
                        return;
                    }
                    Class105.Field1("Chưa có thông tin linh thú");
                    return;
                }
                case 105: {
                    final byte byte88 = class86.Field2().readByte();
                    final byte byte89;
                    Class804.Field54 = new short[byte89 = class86.Field2().readByte()][][];
                    Class804.Field53 = new String[byte89][][];
                    for (byte b38 = 0; b38 < byte89; ++b38) {
                        final byte byte90 = class86.Field2().readByte();
                        Class804.Field54[b38] = new short[byte90][];
                        Class804.Field53[b38] = new String[byte90][];
                        for (byte b39 = 0; b39 < byte90; ++b39) {
                            Class804.Field54[b38][b39] = new short[byte88 * 3];
                            Class804.Field53[b38][b39] = new String[byte88];
                            for (int n67 = 0; n67 < byte88 * 3; ++n67) {
                                Class804.Field54[b38][b39][n67] = class86.Field2().readShort();
                                if (n67 % 3 == 0) {
                                    Class804.Field53[b38][b39][n67 / 3] = class86.Field2().readUTF();
                                }
                            }
                        }
                    }
                    final byte byte91;
                    Class63.Field86 = new short[byte91 = class86.Field2().readByte()][];
                    Class63.Field85 = new short[byte91];
                    for (byte b40 = 0; b40 < byte91; ++b40) {
                        Class63.Field86[b40] = new short[byte88];
                        for (byte b41 = 0; b41 < byte88; ++b41) {
                            Class63.Field86[b40][b41] = class86.Field2().readShort();
                        }
                        Class63.Field85[b40] = class86.Field2().readShort();
                    }
                    final int byte92;
                    Class804.Field51 = new short[byte92 = class86.Field2().readByte()][byte88 * 3];
                    Class804.Field52 = new String[byte92][byte88];
                    for (int n68 = 0; n68 < byte92; ++n68) {
                        for (int n69 = 0; n69 < byte88 * 3; ++n69) {
                            Class804.Field51[n68][n69] = class86.Field2().readShort();
                            if (n69 % 3 == 0) {
                                Class804.Field52[n68][n69 / 3] = class86.Field2().readUTF();
                            }
                        }
                    }
                    return;
                }
                case -24:
                    Label_15526:
                    {
                        byte93 = class86.Field2().readByte();
                        utf18 = class86.Field2().readUTF();
                        if (byte93 == 0) {
                            Class184.Field5().Field1(utf18);
                            break Label_15526;
                        }
                        if (byte93 != 1) {
                            break Label_15526;
                        }
                        return;
                    }
                case -26:
                    Class105.Field19.Field7(class86.Field2().readUTF());
                    return;
                case -27: {
                    final byte byte94 = class86.Field2().readByte();
                    final byte byte95;
                    if ((byte95 = class86.Field2().readByte()) != -1) {
                        final short short59;
                        final byte[] array32 = new byte[short59 = class86.Field2().readShort()];
                        for (short n70 = 0; n70 < short59; ++n70) {
                            array32[n70] = class86.Field2().readByte();
                        }
                        final short short60;
                        final byte[] array33 = new byte[short60 = class86.Field2().readShort()];
                        for (short n71 = 0; n71 < short60; ++n71) {
                            array33[n71] = class86.Field2().readByte();
                        }
                        final Image field20 = Class804.Field1(array32, array33);
                        final byte byte96 = class86.Field2().readByte();
                        final byte byte97 = class86.Field2().readByte();
                        if (byte94 == 0) {
                            ((Class359) Class60.Field5().Field6).Field102 = field20;
                            ((Class359) Class60.Field5().Field6).Field104 = byte96;
                            ((Class359) Class60.Field5().Field6).Field105 = byte97;
                        } else if (byte94 == 1) {
                            ((Class359) Class105.Field19.Field15).Field119 = byte95;
                            ((Class359) Class105.Field19.Field15).Field102 = field20;
                            ((Class359) Class105.Field19.Field15).Field104 = byte96;
                            ((Class359) Class105.Field19.Field15).Field105 = byte97;
                        } else if (byte94 == 2) {
                            if (Class467.Field6() == 1) {
                                Class467.Field39.Field102 = field20;
                                Class467.Field39.Field104 = byte96;
                                Class467.Field39.Field105 = byte97;
                            } else {
                                Class467.Field5().Field60 = field20;
                            }
                        }
                    }
                    Class105.Field7();
                    return;
                }
                case -28: {
                    final byte[] array34 = new byte[class86.Field2().readShort()];
                    class86.Field2().read(array34);
                    Class105.Field19.Field3(array34);
                    return;
                }
                case -29:
                    return;
                case -30: {
                    final short short61 = class86.Field2().readShort();
                    final byte byte98 = class86.Field2().readByte();
                    final byte byte99;
                    final String[] array35 = new String[byte99 = class86.Field2().readByte()];
                    for (byte b42 = 0; b42 < byte99; ++b42) {
                        array35[b42] = class86.Field2().readUTF();
                    }
                    Class105.Field19.Field1((int) short61, byte98, array35);
                    return;
                }
                case -31:
                    Class105.Field19.Field1((int) class86.Field2().readShort(), class86.Field2().readByte(), class86.Field2().readUTF(), (int) class86.Field2().readByte());
                    return;
                case -32: {
                    final short short62 = class86.Field2().readShort();
                    final byte byte100 = class86.Field2().readByte();
                    final String utf19;
                    Class105.Field1(utf19 = class86.Field2().readUTF(), (Class258) new Class199(this, (int) short62, byte100, utf19), (Class258) new Class362(this, (int) short62, byte100, utf19));
                    return;
                }
                case -33: {
                    final int n72 = class86.Field2().readByte() << 4;
                    final int n73 = class86.Field2().readByte() << 4;
                    final short short63 = class86.Field2().readShort();
                    Class105.Field19.Field23 = new Class386(n72, n73);
                    Class105.Field19.Field23.Field6 = short63;
                    if (Class105.Field19.Field23.Field6 == Class105.Field19.Field83) {
                        ((Vector<Class227>) Class74.Field1).addElement(new Class227(n72, n73, short63, (byte) 0, true));
                        ((Vector<Class227>) Class74.Field2).addElement(new Class227(n72, n73, short63, (byte) 1, true));
                    }
                    return;
                }
                case -37: {
                    final byte byte101;
                    if ((byte101 = class86.Field2().readByte()) == 0) {
                        String s = "`" + class86.Field2().readUTF();
                        final byte byte102;
                        if ((byte102 = class86.Field2().readByte()) == 0) {
                            Class467.Field31 = class86.Field2().readByte();
                            Class467.Field37 = class86.Field2().readShort();
                            Class467.Field36 = class86.Field2().readShort();
                            s = String.valueOf(s) + "\nHoàn thành: " + Class467.Field36 + "/" + Class467.Field37 + "Con";
                        } else if (byte102 == 1) {
                            Class63.Field36 = class86.Field2().readByte();
                            Class467.Field37 = class86.Field2().readShort();
                            Class467.Field36 = class86.Field2().readShort();
                            s = String.valueOf(s) + "\nĐã lấy: " + Class467.Field36 + "/" + Class467.Field37;
                        } else if (byte102 == 2) {
                            (Class63.Field37 = new Class386()).Field6 = class86.Field2().readByte();
                            for (int n74 = 0; n74 < Class105.Field19.Field10.size(); ++n74) {
                                final Class672 class125;
                                if ((class125 = (Class672) Class105.Field19.Field10.elementAt(n74)) instanceof Class262 && ((Class262) class125).Field1 == Class63.Field37.Field6) {
                                    Class63.Field37.Field1 = class125.Field193;
                                    Class63.Field37.Field2 = class125.Field194;
                                    break;
                                }
                            }
                        }
                        Class804.Field2 = class86.Field2().readUTF();
                        Class467.Field5().Field1(s);
                        return;
                    }
                    if (byte101 == 1) {
                        Class105.Field19.Field6(class86.Field2().readUTF());
                        return;
                    }
                    if (byte101 == 2) {
                        final String utf20 = class86.Field2().readUTF();
                        Class804.Field2 = class86.Field2().readUTF();
                        Class791.Field5().Field1("NHIỆM VỤ", utf20);
                        Class791.Field5().Field1();
                        Class105.Field7();
                    }
                    return;
                }
                case -38: {
                    Class63.Field20 = class86.Field2().readBoolean();
                    final byte byte103;
                    Class63.Field54 = new int[byte103 = class86.Field2().readByte()];
                    Class63.Field58 = new String[byte103];
                    Class63.Field55 = new int[byte103];
                    Class63.Field56 = new short[byte103];
                    Class63.Field59 = new String[byte103];
                    for (byte b43 = 0; b43 < byte103; ++b43) {
                        Class63.Field54[b43] = class86.Field2().readShort();
                        final short short64 = class86.Field2().readShort();
                        Class63.Field58[b43] = class86.Field2().readUTF();
                        Class63.Field55[b43] = (int) (System.currentTimeMillis() / 1000L);
                        final Class359 class126 = (Class359) Class105.Field19.Field2(short64);
                        Class63.Field56[b43] = short64;
                        if (class126 != null) {
                            class126.Field169 = null;
                        }
                        if (class126 != null && Class63.Field54[b43] > 0) {
                            class126.Field169 = (Class173) new Class227((int) ((Class672) class126).Field193, ((Class672) class126).Field194 - 5, (short) 1, (byte) 1, false);
                        }
                        Class63.Field59[b43] = class86.Field2().readUTF().toLowerCase();
                    }
                    return;
                }
                case -39:
                    Class63.Field1(class86.Field2().readByte(), (int) class86.Field2().readShort(), class86.Field2().readInt());
                    return;
                case -42: {
                    final short short65 = class86.Field2().readShort();
                    final byte b44;
                    final byte[] array36 = new byte[b44 = (byte) (class86.Field2().available() / 2)];
                    final byte[] array37 = new byte[b44];
                    int n75 = 0;
                    while (class86.Field2().available() > 0) {
                        array36[n75] = class86.Field2().readByte();
                        array37[n75] = class86.Field2().readByte();
                        ++n75;
                    }
                    Class105.Field19.Field1(short65, array36, array37);
                    return;
                }
                case -43: {
                    final byte byte104;
                    if ((byte104 = class86.Field2().readByte()) > 0) {
                        final Image[] array38 = new Image[byte104];
                        for (byte b45 = 0; b45 < byte104; ++b45) {
                            try {
                                final byte[] array39 = new byte[class86.Field2().readInt()];
                                class86.Field2().read(array39, 0, array39.length);
                                array38[b45] = Image.createImage(array39, 0, array39.length);
                            } catch (final Exception ex44) {
                            }
                        }
                        for (byte byte105 = class86.Field2().readByte(), b46 = 0; b46 < byte105; ++b46) {
                            final Class350 class127 = new Class350();
                            final byte byte106 = class86.Field2().readByte();
                            final byte byte107 = class86.Field2().readByte();
                            final byte byte108 = class86.Field2().readByte();
                            class127.Field2 = class86.Field2().readByte();
                            class127.Field3 = class86.Field2().readByte();
                            class127.Field4 = class86.Field2().readByte();
                            class127.Field1((short) (byte107 << 4), (short) (byte108 << 4));
                            class127.Field1 = array38[byte106];
                            ((Class672) class127).Field195 = (short) (class127.Field1.getHeight() / class127.Field4);
                            Class105.Field19.Field1(class127);
                        }
                    }
                    return;
                }
                case -46:
                    if (class86.Field2().readByte() == 0) {
                        class86.Field2().readUTF();
                        class86.Field2().readByte();
                        return;
                    }
                    class86.Field2().readByte();
                    class86.Field2().readByte();
                    class86.Field2().read(new byte[class86.Field2().available()]);
                    return;
                case -47: {
                    final short short66 = class86.Field2().readShort();
                    class86.Field2().readBoolean();
                    final byte[] array40 = new byte[class86.Field2().readShort()];
                    class86.Field2().read(array40);
                    if (Class804.Field46[short66] != null) {
                        Class804.Field46[short66].Field1(array40);
                    }
                    return;
                }
                case -48: {
                    final byte byte109;
                    if ((byte109 = class86.Field2().readByte()) == -1) {
                        final byte byte110 = class86.Field2().readByte();
                        final byte byte111 = class86.Field2().readByte();
                        final byte[] array41 = new byte[class86.Field2().available()];
                        for (int n76 = 0; n76 < array41.length; ++n76) {
                            array41[n76] = class86.Field2().readByte();
                        }
                        Class63.Field1(array41, byte110, byte111);
                        return;
                    }
                    final byte[] array42 = new byte[class86.Field2().readShort()];
                    class86.Field2().read(array42);
                    final Class680 field21;
                    if ((field21 = Class804.Field8((int) byte109)) != null) {
                        field21.Field1(array42, (int) byte109);
                    }
                    return;
                }
                case -49: {
                    final byte byte112 = class86.Field2().readByte();
                    final byte byte113 = class86.Field2().readByte();
                    if (byte112 == 0) {
                        if (Class70.Field1((short) byte113) == null) {
                            Class263.Field1().Field9((short) byte113);
                        }
                        final Class70 class128;
                        (class128 = new Class70()).Field1 = byte113;
                        class128.Field9 = class86.Field2().readByte();
                        final Class70 class129 = class128;
                        final Class70 class130 = class128;
                        final byte byte114 = class86.Field2().readByte();
                        class130.Field7 = byte114;
                        class129.Field3 = byte114;
                        class128.Field2 = class86.Field2().readShort();
                        class128.Field10 = class86.Field2().readByte();
                        if (class128.Field10 == 1) {
                            class128.Field4 = class86.Field2().readShort();
                        } else if (class128.Field10 == 2) {
                            final byte byte115 = class86.Field2().readByte();
                            class128.Field11 = new short[byte115];
                            class128.Field12 = new short[byte115];
                            for (byte b47 = 0; b47 < byte115; ++b47) {
                                class128.Field11[b47] = class86.Field2().readShort();
                                class128.Field12[b47] = class86.Field2().readShort();
                            }
                        }
                        if (class128.Field9 == 0) {
                            class128.Field8 = class86.Field2().readShort();
                        } else {
                            class128.Field5 = class86.Field2().readShort();
                            class128.Field6 = class86.Field2().readShort();
                        }
                        Class63.Field1(class128);
                        return;
                    }
                    final Class84 class131;
                    (class131 = new Class84()).Field5 = byte113;
                    class131.Field1(class86);
                    Class70.Field13.addElement(class131);
                    return;
                }
                case -50:
                    Class105.Field19.Field1(class86.Field2().readUTF(), class86.Field2().readShort(), class86.Field2().readShort(), class86.Field2().readShort(), class86.Field2().readShort(), class86.Field2().readShort(), class86.Field2().readShort(), class86.Field2().readByte(), class86.Field2().readByte());
                    return;
                case -51: {
                    final short short67 = class86.Field2().readShort();
                    final byte[] array43 = new byte[class86.Field2().available()];
                    class86.Field2().read(array43);
                    final Class172 class132;
                    (class132 = (Class172) Class381.Field3.get(new StringBuffer().append(short67).toString())).Field3 = false;
                    class132.Field1 = Image.createImage(array43, 0, array43.length);
                    return;
                }
                case -52: {
                    final String utf21 = class86.Field2().readUTF();
                    final short short68 = class86.Field2().readShort();
                    final byte byte116 = class86.Field2().readByte();
                    final Vector vector12 = new Vector();
                    for (byte b48 = 0; b48 < byte116; ++b48) {
                        final Class383 class133;
                        (class133 = new Class383()).Field1 = class86.Field2().readUTF();
                        class133.Field2 = class86.Field2().readShort();
                        class133.Field3 = class86.Field2().readByte();
                        vector12.addElement(class133);
                    }
                    final byte byte117 = class86.Field2().readByte();
                    int byte118 = 0;
                    try {
                        byte118 = class86.Field2().readByte();
                    } catch (final Exception ex45) {
                    }
                    Class105.Field19.Field1(utf21, short68, vector12, (int) byte117, byte118);
                    return;
                }
                case -55:
                    Class105.Field19.Field15(class86);
                    return;
                case -56: {
                    final byte byte119;
                    final Class32[] array44 = new Class32[byte119 = class86.Field2().readByte()];
                    for (byte b49 = 0; b49 < byte119; ++b49) {
                        array44[b49] = new Class32();
                        array44[b49].Field1 = class86.Field2().readShort();
                        array44[b49].Field4 = class86.Field2().readByte();
                        array44[b49].Field3 = class86.Field2().readUTF();
                        array44[b49].Field5 = class86.Field2().readByte();
                    }
                    final byte byte120;
                    final Class32[] array45 = new Class32[byte120 = class86.Field2().readByte()];
                    for (byte b50 = 0; b50 < byte120; ++b50) {
                        array45[b50] = new Class32();
                        array45[b50].Field1 = class86.Field2().readShort();
                        array45[b50].Field4 = class86.Field2().readByte();
                        array45[b50].Field3 = class86.Field2().readUTF();
                        array45[b50].Field5 = class86.Field2().readByte();
                    }
                    Class105.Field19.Field1(array44, array45);
                    return;
                }
                case -57: {
                    if (class86.Field2().readByte() != 0) {
                        final byte byte121 = class86.Field2().readByte();
                        final short short69;
                        final byte[] array46 = new byte[short69 = class86.Field2().readShort()];
                        class86.Field2().read(array46, 0, short69);
                        Class726.Field6[byte121] = class86.Field2().readByte();
                        Class726.Field4[byte121] = Class804.Field2(array46);
                        Class726.Field5[byte121] = Class726.Field4[byte121].getWidth();
                        Class726.Field1[byte121] = new byte[4][class86.Field2().readByte()];
                        for (int n77 = 0; n77 < Class726.Field1[byte121][0].length; ++n77) {
                            Class726.Field1[byte121][0][n77] = class86.Field2().readByte();
                            Class726.Field1[byte121][1][n77] = class86.Field2().readByte();
                            Class726.Field1[byte121][2][n77] = class86.Field2().readByte();
                            Class726.Field1[byte121][3][n77] = class86.Field2().readByte();
                        }
                        Class726.Field2[byte121] = new byte[4][class86.Field2().readByte()];
                        for (int n78 = 0; n78 < Class726.Field2[byte121][0].length; ++n78) {
                            Class726.Field2[byte121][0][n78] = class86.Field2().readByte();
                            Class726.Field2[byte121][1][n78] = class86.Field2().readByte();
                            Class726.Field2[byte121][2][n78] = class86.Field2().readByte();
                            Class726.Field2[byte121][3][n78] = class86.Field2().readByte();
                        }
                        Class726.Field3[byte121] = new byte[4][class86.Field2().readByte()];
                        for (int n79 = 0; n79 < Class726.Field3[byte121][0].length; ++n79) {
                            Class726.Field3[byte121][0][n79] = class86.Field2().readByte();
                            Class726.Field3[byte121][1][n79] = class86.Field2().readByte();
                            Class726.Field3[byte121][2][n79] = class86.Field2().readByte();
                            Class726.Field3[byte121][3][n79] = class86.Field2().readByte();
                        }
                        Class726.Field7[byte121] = class86.Field2().readByte();
                        Class726.Field8[byte121] = class86.Field2().readByte();
                        return;
                    }
                    final boolean boolean3 = class86.Field2().readBoolean();
                    final short short70 = class86.Field2().readShort();
                    final byte byte122 = class86.Field2().readByte();
                    if (((Class672) Class105.Field19.Field15).Field189 == short70) {
                        ((Class359) Class105.Field19.Field15).Field150 = boolean3;
                        if (boolean3) {
                            ((Class359) Class105.Field19.Field15).Field151 = new Class726();
                            ((Class359) Class105.Field19.Field15).Field151.Field9 = byte122;
                            ((Class359) Class105.Field19.Field15).Field149 = (Class173) new Class227((int) ((Class672) Class105.Field19.Field15).Field193, ((Class672) Class105.Field19.Field15).Field194 - 5, (short) 1, (byte) 1, false);
                            ((Class359) Class105.Field19.Field15).Field165 = System.currentTimeMillis() / 1000L + 5L;
                        } else if (((Class359) Class105.Field19.Field15).Field151 != null) {
                            ((Class359) Class105.Field19.Field15).Field151 = null;
                        }
                    } else {
                        final Class359 class134;
                        if ((class134 = (Class359) Class105.Field19.Field2(short70)) != null) {
                            class134.Field150 = boolean3;
                            if (boolean3) {
                                class134.Field151 = new Class726();
                                class134.Field151.Field9 = byte122;
                                class134.Field149 = (Class173) new Class227((int) ((Class672) class134).Field193, ((Class672) class134).Field194 - 5, (short) 1, (byte) 1, false);
                                class134.Field165 = System.currentTimeMillis() / 1000L + 5L;
                            } else if (class134.Field151 != null) {
                                class134.Field151 = null;
                            }
                        }
                    }
                    if (Class726.Field4[byte122] == null) {
                        Class105.Field19.Field28.Field13((int) byte122, (int) short70);
                    }
                    return;
                }
                case -59:
                    for (byte byte123 = class86.Field2().readByte(), b51 = 0; b51 < byte123; ++b51) {
                        final byte byte124 = class86.Field2().readByte();
                        final byte byte125 = class86.Field2().readByte();
                        final String utf22 = class86.Field2().readUTF();
                        Class105.Field19.Field1((int) byte124, (int) byte125, class86.Field2().readByte() << 4, class86.Field2().readByte() << 4, utf22, utf22, (int) class86.Field2().readByte(), class86.Field2().readInt(), class86.Field2().readBoolean(), class86.Field2().readByte(), class86.Field2().readByte());
                    }
                    Class105.Field19.Field87 = (short) Field1(Class105.Field19.Field10, (byte) 0, 5000);
                    Class105.Field19.Field88 = (short) Field1(Class105.Field19.Field10, (byte) 1, 5000);
                    Class105.Field19.Field89 = (short) Field1(Class105.Field19.Field10, (byte) 2, -1);
                    Class105.Field19.Field90 = (short) Field1(Class105.Field19.Field10, (byte) 3, -1);
                    return;
                case -60:
                    Class63.Field1(class86.Field2().readUTF());
                    return;
                case -62: {
                    final byte byte126;
                    if ((byte126 = class86.Field2().readByte()) == 0) {
                        Class149.Field5().Field1();
                        Class149.Field5().Field1(class86);
                        return;
                    }
                    if (byte126 == 1) {
                        final byte byte127 = class86.Field2().readByte();
                        final String utf23 = class86.Field2().readUTF();
                        final byte byte128;
                        final String[] array47 = new String[byte128 = class86.Field2().readByte()];
                        for (byte b52 = 0; b52 < byte128; ++b52) {
                            array47[b52] = class86.Field2().readUTF();
                        }
                        Class149.Field5().Field1(byte127, utf23, array47);
                        return;
                    }
                    if (byte126 == 2) {
                        Class105.Field1("Bạn đã hết lượt chơi");
                        Class149.Field5().Field6();
                        Class105.Field19.Field1();
                    }
                    return;
                }
                case -63:
                    Class462.Field5().Field1(class86);
                    Class462.Field5().Field1();
                    return;
                case -61: {
                    final byte byte129 = class86.Field2().readByte();
                    final byte byte130 = class86.Field2().readByte();
                    final byte byte131 = class86.Field2().readByte();
                    final short short71 = class86.Field2().readShort();
                    final byte byte132 = class86.Field2().readByte();
                    byte byte133 = 0;
                    try {
                        byte133 = class86.Field2().readByte();
                    } catch (final Exception ex46) {
                    }
                    Class105.Field19.Field1((short) 1000, byte129, byte130, short71, byte131, byte132, byte133);
                    return;
                }
                case 87:
                    Class105.Field19.Field16(class86);
                    return;
                case -75:
                    Class105.Field19.Field18(class86);
                    return;
                case -76:
                    Class63.Field17(class86);
                    break;
            }
        } catch (final Exception ex47) {
            ex47.printStackTrace();
            new StringBuffer(String.valueOf(class86.Field1)).append(" tai cmd nay").toString();
            new StringBuffer(String.valueOf(class86.Field1)).append(" tai cmd nay").toString();
        }
    }

    private static int Field1(final Vector vector, final byte b, int n) {
        for (int i = 0; i < vector.size(); ++i) {
            final Class672 class672;
            if ((class672 = (Class672) vector.elementAt(i)).Field188 == 10) {
                final Class679 class673 = (Class679) class672;
                switch (b) {
                    case 0:
                        if (n > ((Class672) class673).Field193) {
                            n = ((Class672) class673).Field193;
                            break;
                        }
                        break;
                    case 1:
                        if (n > ((Class672) class673).Field194) {
                            n = ((Class672) class673).Field194;
                            break;
                        }
                        break;
                    case 2:
                        if (n < ((Class672) class673).Field193) {
                            n = ((Class672) class673).Field193;
                            break;
                        }
                        break;
                    case 3:
                        if (n < ((Class672) class673).Field194) {
                            n = ((Class672) class673).Field194;
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
