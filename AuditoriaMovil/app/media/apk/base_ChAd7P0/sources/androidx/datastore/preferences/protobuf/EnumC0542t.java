package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Type;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum DOUBLE uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: androidx.datastore.preferences.protobuf.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0542t {
    private static final /* synthetic */ EnumC0542t[] $VALUES;
    public static final EnumC0542t BOOL;
    public static final EnumC0542t BOOL_LIST;
    public static final EnumC0542t BOOL_LIST_PACKED;
    public static final EnumC0542t BYTES;
    public static final EnumC0542t BYTES_LIST;
    public static final EnumC0542t DOUBLE;
    public static final EnumC0542t DOUBLE_LIST;
    public static final EnumC0542t DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC0542t ENUM;
    public static final EnumC0542t ENUM_LIST;
    public static final EnumC0542t ENUM_LIST_PACKED;
    public static final EnumC0542t FIXED32;
    public static final EnumC0542t FIXED32_LIST;
    public static final EnumC0542t FIXED32_LIST_PACKED;
    public static final EnumC0542t FIXED64;
    public static final EnumC0542t FIXED64_LIST;
    public static final EnumC0542t FIXED64_LIST_PACKED;
    public static final EnumC0542t FLOAT;
    public static final EnumC0542t FLOAT_LIST;
    public static final EnumC0542t FLOAT_LIST_PACKED;
    public static final EnumC0542t GROUP;
    public static final EnumC0542t GROUP_LIST;
    public static final EnumC0542t INT32;
    public static final EnumC0542t INT32_LIST;
    public static final EnumC0542t INT32_LIST_PACKED;
    public static final EnumC0542t INT64;
    public static final EnumC0542t INT64_LIST;
    public static final EnumC0542t INT64_LIST_PACKED;
    public static final EnumC0542t MAP;
    public static final EnumC0542t MESSAGE;
    public static final EnumC0542t MESSAGE_LIST;
    public static final EnumC0542t SFIXED32;
    public static final EnumC0542t SFIXED32_LIST;
    public static final EnumC0542t SFIXED32_LIST_PACKED;
    public static final EnumC0542t SFIXED64;
    public static final EnumC0542t SFIXED64_LIST;
    public static final EnumC0542t SFIXED64_LIST_PACKED;
    public static final EnumC0542t SINT32;
    public static final EnumC0542t SINT32_LIST;
    public static final EnumC0542t SINT32_LIST_PACKED;
    public static final EnumC0542t SINT64;
    public static final EnumC0542t SINT64_LIST;
    public static final EnumC0542t SINT64_LIST_PACKED;
    public static final EnumC0542t STRING;
    public static final EnumC0542t STRING_LIST;
    public static final EnumC0542t UINT32;
    public static final EnumC0542t UINT32_LIST;
    public static final EnumC0542t UINT32_LIST_PACKED;
    public static final EnumC0542t UINT64;
    public static final EnumC0542t UINT64_LIST;
    public static final EnumC0542t UINT64_LIST_PACKED;
    private static final EnumC0542t[] VALUES;
    private final EnumC0541s collection;
    private final Class<?> elementType;
    private final int id;
    private final D javaType;
    private final boolean primitiveScalar;

    static {
        EnumC0541s enumC0541s = EnumC0541s.SCALAR;
        D d7 = D.DOUBLE;
        EnumC0542t enumC0542t = new EnumC0542t("DOUBLE", 0, 0, enumC0541s, d7);
        DOUBLE = enumC0542t;
        D d8 = D.FLOAT;
        EnumC0542t enumC0542t2 = new EnumC0542t("FLOAT", 1, 1, enumC0541s, d8);
        FLOAT = enumC0542t2;
        D d9 = D.LONG;
        EnumC0542t enumC0542t3 = new EnumC0542t("INT64", 2, 2, enumC0541s, d9);
        INT64 = enumC0542t3;
        EnumC0542t enumC0542t4 = new EnumC0542t("UINT64", 3, 3, enumC0541s, d9);
        UINT64 = enumC0542t4;
        D d10 = D.INT;
        EnumC0542t enumC0542t5 = new EnumC0542t("INT32", 4, 4, enumC0541s, d10);
        INT32 = enumC0542t5;
        EnumC0542t enumC0542t6 = new EnumC0542t("FIXED64", 5, 5, enumC0541s, d9);
        FIXED64 = enumC0542t6;
        EnumC0542t enumC0542t7 = new EnumC0542t("FIXED32", 6, 6, enumC0541s, d10);
        FIXED32 = enumC0542t7;
        D d11 = D.BOOLEAN;
        EnumC0542t enumC0542t8 = new EnumC0542t("BOOL", 7, 7, enumC0541s, d11);
        BOOL = enumC0542t8;
        D d12 = D.STRING;
        EnumC0542t enumC0542t9 = new EnumC0542t("STRING", 8, 8, enumC0541s, d12);
        STRING = enumC0542t9;
        D d13 = D.MESSAGE;
        EnumC0542t enumC0542t10 = new EnumC0542t("MESSAGE", 9, 9, enumC0541s, d13);
        MESSAGE = enumC0542t10;
        D d14 = D.BYTE_STRING;
        EnumC0542t enumC0542t11 = new EnumC0542t("BYTES", 10, 10, enumC0541s, d14);
        BYTES = enumC0542t11;
        EnumC0542t enumC0542t12 = new EnumC0542t("UINT32", 11, 11, enumC0541s, d10);
        UINT32 = enumC0542t12;
        D d15 = D.ENUM;
        EnumC0542t enumC0542t13 = new EnumC0542t("ENUM", 12, 12, enumC0541s, d15);
        ENUM = enumC0542t13;
        EnumC0542t enumC0542t14 = new EnumC0542t("SFIXED32", 13, 13, enumC0541s, d10);
        SFIXED32 = enumC0542t14;
        EnumC0542t enumC0542t15 = new EnumC0542t("SFIXED64", 14, 14, enumC0541s, d9);
        SFIXED64 = enumC0542t15;
        EnumC0542t enumC0542t16 = new EnumC0542t("SINT32", 15, 15, enumC0541s, d10);
        SINT32 = enumC0542t16;
        EnumC0542t enumC0542t17 = new EnumC0542t("SINT64", 16, 16, enumC0541s, d9);
        SINT64 = enumC0542t17;
        EnumC0542t enumC0542t18 = new EnumC0542t("GROUP", 17, 17, enumC0541s, d13);
        GROUP = enumC0542t18;
        EnumC0541s enumC0541s2 = EnumC0541s.VECTOR;
        EnumC0542t enumC0542t19 = new EnumC0542t("DOUBLE_LIST", 18, 18, enumC0541s2, d7);
        DOUBLE_LIST = enumC0542t19;
        EnumC0542t enumC0542t20 = new EnumC0542t("FLOAT_LIST", 19, 19, enumC0541s2, d8);
        FLOAT_LIST = enumC0542t20;
        EnumC0542t enumC0542t21 = new EnumC0542t("INT64_LIST", 20, 20, enumC0541s2, d9);
        INT64_LIST = enumC0542t21;
        EnumC0542t enumC0542t22 = new EnumC0542t("UINT64_LIST", 21, 21, enumC0541s2, d9);
        UINT64_LIST = enumC0542t22;
        EnumC0542t enumC0542t23 = new EnumC0542t("INT32_LIST", 22, 22, enumC0541s2, d10);
        INT32_LIST = enumC0542t23;
        EnumC0542t enumC0542t24 = new EnumC0542t("FIXED64_LIST", 23, 23, enumC0541s2, d9);
        FIXED64_LIST = enumC0542t24;
        EnumC0542t enumC0542t25 = new EnumC0542t("FIXED32_LIST", 24, 24, enumC0541s2, d10);
        FIXED32_LIST = enumC0542t25;
        EnumC0542t enumC0542t26 = new EnumC0542t("BOOL_LIST", 25, 25, enumC0541s2, d11);
        BOOL_LIST = enumC0542t26;
        EnumC0542t enumC0542t27 = new EnumC0542t("STRING_LIST", 26, 26, enumC0541s2, d12);
        STRING_LIST = enumC0542t27;
        EnumC0542t enumC0542t28 = new EnumC0542t("MESSAGE_LIST", 27, 27, enumC0541s2, d13);
        MESSAGE_LIST = enumC0542t28;
        EnumC0542t enumC0542t29 = new EnumC0542t("BYTES_LIST", 28, 28, enumC0541s2, d14);
        BYTES_LIST = enumC0542t29;
        EnumC0542t enumC0542t30 = new EnumC0542t("UINT32_LIST", 29, 29, enumC0541s2, d10);
        UINT32_LIST = enumC0542t30;
        EnumC0542t enumC0542t31 = new EnumC0542t("ENUM_LIST", 30, 30, enumC0541s2, d15);
        ENUM_LIST = enumC0542t31;
        EnumC0542t enumC0542t32 = new EnumC0542t("SFIXED32_LIST", 31, 31, enumC0541s2, d10);
        SFIXED32_LIST = enumC0542t32;
        EnumC0542t enumC0542t33 = new EnumC0542t("SFIXED64_LIST", 32, 32, enumC0541s2, d9);
        SFIXED64_LIST = enumC0542t33;
        EnumC0542t enumC0542t34 = new EnumC0542t("SINT32_LIST", 33, 33, enumC0541s2, d10);
        SINT32_LIST = enumC0542t34;
        EnumC0542t enumC0542t35 = new EnumC0542t("SINT64_LIST", 34, 34, enumC0541s2, d9);
        SINT64_LIST = enumC0542t35;
        EnumC0541s enumC0541s3 = EnumC0541s.PACKED_VECTOR;
        EnumC0542t enumC0542t36 = new EnumC0542t("DOUBLE_LIST_PACKED", 35, 35, enumC0541s3, d7);
        DOUBLE_LIST_PACKED = enumC0542t36;
        EnumC0542t enumC0542t37 = new EnumC0542t("FLOAT_LIST_PACKED", 36, 36, enumC0541s3, d8);
        FLOAT_LIST_PACKED = enumC0542t37;
        EnumC0542t enumC0542t38 = new EnumC0542t("INT64_LIST_PACKED", 37, 37, enumC0541s3, d9);
        INT64_LIST_PACKED = enumC0542t38;
        EnumC0542t enumC0542t39 = new EnumC0542t("UINT64_LIST_PACKED", 38, 38, enumC0541s3, d9);
        UINT64_LIST_PACKED = enumC0542t39;
        EnumC0542t enumC0542t40 = new EnumC0542t("INT32_LIST_PACKED", 39, 39, enumC0541s3, d10);
        INT32_LIST_PACKED = enumC0542t40;
        EnumC0542t enumC0542t41 = new EnumC0542t("FIXED64_LIST_PACKED", 40, 40, enumC0541s3, d9);
        FIXED64_LIST_PACKED = enumC0542t41;
        EnumC0542t enumC0542t42 = new EnumC0542t("FIXED32_LIST_PACKED", 41, 41, enumC0541s3, d10);
        FIXED32_LIST_PACKED = enumC0542t42;
        EnumC0542t enumC0542t43 = new EnumC0542t("BOOL_LIST_PACKED", 42, 42, enumC0541s3, d11);
        BOOL_LIST_PACKED = enumC0542t43;
        EnumC0542t enumC0542t44 = new EnumC0542t("UINT32_LIST_PACKED", 43, 43, enumC0541s3, d10);
        UINT32_LIST_PACKED = enumC0542t44;
        EnumC0542t enumC0542t45 = new EnumC0542t("ENUM_LIST_PACKED", 44, 44, enumC0541s3, d15);
        ENUM_LIST_PACKED = enumC0542t45;
        EnumC0542t enumC0542t46 = new EnumC0542t("SFIXED32_LIST_PACKED", 45, 45, enumC0541s3, d10);
        SFIXED32_LIST_PACKED = enumC0542t46;
        EnumC0542t enumC0542t47 = new EnumC0542t("SFIXED64_LIST_PACKED", 46, 46, enumC0541s3, d9);
        SFIXED64_LIST_PACKED = enumC0542t47;
        EnumC0542t enumC0542t48 = new EnumC0542t("SINT32_LIST_PACKED", 47, 47, enumC0541s3, d10);
        SINT32_LIST_PACKED = enumC0542t48;
        EnumC0542t enumC0542t49 = new EnumC0542t("SINT64_LIST_PACKED", 48, 48, enumC0541s3, d9);
        SINT64_LIST_PACKED = enumC0542t49;
        EnumC0542t enumC0542t50 = new EnumC0542t("GROUP_LIST", 49, 49, enumC0541s2, d13);
        GROUP_LIST = enumC0542t50;
        EnumC0542t enumC0542t51 = new EnumC0542t("MAP", 50, 50, EnumC0541s.MAP, D.VOID);
        MAP = enumC0542t51;
        $VALUES = new EnumC0542t[]{enumC0542t, enumC0542t2, enumC0542t3, enumC0542t4, enumC0542t5, enumC0542t6, enumC0542t7, enumC0542t8, enumC0542t9, enumC0542t10, enumC0542t11, enumC0542t12, enumC0542t13, enumC0542t14, enumC0542t15, enumC0542t16, enumC0542t17, enumC0542t18, enumC0542t19, enumC0542t20, enumC0542t21, enumC0542t22, enumC0542t23, enumC0542t24, enumC0542t25, enumC0542t26, enumC0542t27, enumC0542t28, enumC0542t29, enumC0542t30, enumC0542t31, enumC0542t32, enumC0542t33, enumC0542t34, enumC0542t35, enumC0542t36, enumC0542t37, enumC0542t38, enumC0542t39, enumC0542t40, enumC0542t41, enumC0542t42, enumC0542t43, enumC0542t44, enumC0542t45, enumC0542t46, enumC0542t47, enumC0542t48, enumC0542t49, enumC0542t50, enumC0542t51};
        EMPTY_TYPES = new Type[0];
        EnumC0542t[] values = values();
        VALUES = new EnumC0542t[values.length];
        for (EnumC0542t enumC0542t52 : values) {
            VALUES[enumC0542t52.id] = enumC0542t52;
        }
    }

    public EnumC0542t(String str, int i7, int i8, EnumC0541s enumC0541s, D d7) {
        int i9;
        this.id = i8;
        this.collection = enumC0541s;
        this.javaType = d7;
        int i10 = r.f7866a[enumC0541s.ordinal()];
        boolean z7 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                this.elementType = null;
            } else {
                this.elementType = d7.a();
            }
        } else {
            this.elementType = d7.a();
        }
        this.primitiveScalar = (enumC0541s != EnumC0541s.SCALAR || (i9 = r.f7867b[d7.ordinal()]) == 1 || i9 == 2 || i9 == 3) ? false : false;
    }

    public static EnumC0542t valueOf(String str) {
        return (EnumC0542t) Enum.valueOf(EnumC0542t.class, str);
    }

    public static EnumC0542t[] values() {
        return (EnumC0542t[]) $VALUES.clone();
    }

    public final int a() {
        return this.id;
    }
}
