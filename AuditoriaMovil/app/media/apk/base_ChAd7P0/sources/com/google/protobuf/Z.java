package com.google.protobuf;

import java.io.Serializable;
import org.apache.tika.utils.StringUtils;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum INT uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class Z {
    private static final /* synthetic */ Z[] $VALUES;
    public static final Z BOOLEAN;
    public static final Z BYTE_STRING;
    public static final Z DOUBLE;
    public static final Z ENUM;
    public static final Z FLOAT;
    public static final Z INT;
    public static final Z LONG;
    public static final Z MESSAGE;
    public static final Z STRING;
    public static final Z VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        Z z7 = new Z("VOID", 0, Void.class, Void.class, null);
        VOID = z7;
        Class cls = Integer.TYPE;
        Z z8 = new Z("INT", 1, cls, Integer.class, 0);
        INT = z8;
        Z z9 = new Z("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = z9;
        Z z10 = new Z("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = z10;
        Z z11 = new Z("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = z11;
        Z z12 = new Z("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = z12;
        Z z13 = new Z("STRING", 6, String.class, String.class, StringUtils.EMPTY);
        STRING = z13;
        Z z14 = new Z("BYTE_STRING", 7, AbstractC0852m.class, AbstractC0852m.class, AbstractC0852m.f10085b);
        BYTE_STRING = z14;
        Z z15 = new Z("ENUM", 8, cls, Integer.class, null);
        ENUM = z15;
        Z z16 = new Z("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = z16;
        $VALUES = new Z[]{z7, z8, z9, z10, z11, z12, z13, z14, z15, z16};
    }

    public Z(String str, int i7, Class cls, Class cls2, Serializable serializable) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = serializable;
    }

    public static Z valueOf(String str) {
        return (Z) Enum.valueOf(Z.class, str);
    }

    public static Z[] values() {
        return (Z[]) $VALUES.clone();
    }

    public final Class a() {
        return this.boxedType;
    }
}
