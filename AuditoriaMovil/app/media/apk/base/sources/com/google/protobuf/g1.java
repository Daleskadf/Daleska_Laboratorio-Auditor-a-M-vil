package com.google.protobuf;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum INT64 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class g1 {
    private static final /* synthetic */ g1[] $VALUES;
    public static final g1 BOOL;
    public static final g1 BYTES;
    public static final g1 DOUBLE;
    public static final g1 ENUM;
    public static final g1 FIXED32;
    public static final g1 FIXED64;
    public static final g1 FLOAT;
    public static final g1 GROUP;
    public static final g1 INT32;
    public static final g1 INT64;
    public static final g1 MESSAGE;
    public static final g1 SFIXED32;
    public static final g1 SFIXED64;
    public static final g1 SINT32;
    public static final g1 SINT64;
    public static final g1 STRING;
    public static final g1 UINT32;
    public static final g1 UINT64;
    private final h1 javaType;
    private final int wireType;

    static {
        g1 g1Var = new g1("DOUBLE", 0, h1.DOUBLE, 1);
        DOUBLE = g1Var;
        g1 g1Var2 = new g1("FLOAT", 1, h1.FLOAT, 5);
        FLOAT = g1Var2;
        h1 h1Var = h1.LONG;
        g1 g1Var3 = new g1("INT64", 2, h1Var, 0);
        INT64 = g1Var3;
        g1 g1Var4 = new g1("UINT64", 3, h1Var, 0);
        UINT64 = g1Var4;
        h1 h1Var2 = h1.INT;
        g1 g1Var5 = new g1("INT32", 4, h1Var2, 0);
        INT32 = g1Var5;
        g1 g1Var6 = new g1("FIXED64", 5, h1Var, 1);
        FIXED64 = g1Var6;
        g1 g1Var7 = new g1("FIXED32", 6, h1Var2, 5);
        FIXED32 = g1Var7;
        g1 g1Var8 = new g1("BOOL", 7, h1.BOOLEAN, 0);
        BOOL = g1Var8;
        g1 g1Var9 = new g1("STRING", 8, h1.STRING, 2);
        STRING = g1Var9;
        h1 h1Var3 = h1.MESSAGE;
        g1 g1Var10 = new g1("GROUP", 9, h1Var3, 3);
        GROUP = g1Var10;
        g1 g1Var11 = new g1("MESSAGE", 10, h1Var3, 2);
        MESSAGE = g1Var11;
        g1 g1Var12 = new g1("BYTES", 11, h1.BYTE_STRING, 2);
        BYTES = g1Var12;
        g1 g1Var13 = new g1("UINT32", 12, h1Var2, 0);
        UINT32 = g1Var13;
        g1 g1Var14 = new g1("ENUM", 13, h1.ENUM, 0);
        ENUM = g1Var14;
        g1 g1Var15 = new g1("SFIXED32", 14, h1Var2, 5);
        SFIXED32 = g1Var15;
        g1 g1Var16 = new g1("SFIXED64", 15, h1Var, 1);
        SFIXED64 = g1Var16;
        g1 g1Var17 = new g1("SINT32", 16, h1Var2, 0);
        SINT32 = g1Var17;
        g1 g1Var18 = new g1("SINT64", 17, h1Var, 0);
        SINT64 = g1Var18;
        $VALUES = new g1[]{g1Var, g1Var2, g1Var3, g1Var4, g1Var5, g1Var6, g1Var7, g1Var8, g1Var9, g1Var10, g1Var11, g1Var12, g1Var13, g1Var14, g1Var15, g1Var16, g1Var17, g1Var18};
    }

    public g1(String str, int i7, h1 h1Var, int i8) {
        this.javaType = h1Var;
        this.wireType = i8;
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) $VALUES.clone();
    }

    public final h1 a() {
        return this.javaType;
    }

    public final int b() {
        return this.wireType;
    }
}
