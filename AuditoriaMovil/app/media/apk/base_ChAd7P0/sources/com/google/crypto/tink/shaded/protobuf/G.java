package com.google.crypto.tink.shaded.protobuf;

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
public final class G {
    private static final /* synthetic */ G[] $VALUES;
    public static final G BOOLEAN;
    public static final G BYTE_STRING;
    public static final G DOUBLE;
    public static final G ENUM;
    public static final G FLOAT;
    public static final G INT;
    public static final G LONG;
    public static final G MESSAGE;
    public static final G STRING;
    public static final G VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        G g3 = new G("VOID", 0, Void.class, Void.class, null);
        VOID = g3;
        Class cls = Integer.TYPE;
        G g4 = new G("INT", 1, cls, Integer.class, 0);
        INT = g4;
        G g8 = new G("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = g8;
        G g9 = new G("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = g9;
        G g10 = new G("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = g10;
        G g11 = new G("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = g11;
        G g12 = new G("STRING", 6, String.class, String.class, StringUtils.EMPTY);
        STRING = g12;
        G g13 = new G("BYTE_STRING", 7, AbstractC0781h.class, AbstractC0781h.class, AbstractC0781h.f9648b);
        BYTE_STRING = g13;
        G g14 = new G("ENUM", 8, cls, Integer.class, null);
        ENUM = g14;
        G g15 = new G("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = g15;
        $VALUES = new G[]{g3, g4, g8, g9, g10, g11, g12, g13, g14, g15};
    }

    public G(String str, int i7, Class cls, Class cls2, Serializable serializable) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = serializable;
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) $VALUES.clone();
    }

    public final Class a() {
        return this.boxedType;
    }
}
