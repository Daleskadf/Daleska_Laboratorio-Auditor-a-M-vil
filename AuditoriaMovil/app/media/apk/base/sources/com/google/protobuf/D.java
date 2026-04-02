package com.google.protobuf;

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
/* loaded from: classes.dex */
public final class D {
    private static final /* synthetic */ D[] $VALUES;
    public static final D BOOL;
    public static final D BOOL_LIST;
    public static final D BOOL_LIST_PACKED;
    public static final D BYTES;
    public static final D BYTES_LIST;
    public static final D DOUBLE;
    public static final D DOUBLE_LIST;
    public static final D DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final D ENUM;
    public static final D ENUM_LIST;
    public static final D ENUM_LIST_PACKED;
    public static final D FIXED32;
    public static final D FIXED32_LIST;
    public static final D FIXED32_LIST_PACKED;
    public static final D FIXED64;
    public static final D FIXED64_LIST;
    public static final D FIXED64_LIST_PACKED;
    public static final D FLOAT;
    public static final D FLOAT_LIST;
    public static final D FLOAT_LIST_PACKED;
    public static final D GROUP;
    public static final D GROUP_LIST;
    public static final D INT32;
    public static final D INT32_LIST;
    public static final D INT32_LIST_PACKED;
    public static final D INT64;
    public static final D INT64_LIST;
    public static final D INT64_LIST_PACKED;
    public static final D MAP;
    public static final D MESSAGE;
    public static final D MESSAGE_LIST;
    public static final D SFIXED32;
    public static final D SFIXED32_LIST;
    public static final D SFIXED32_LIST_PACKED;
    public static final D SFIXED64;
    public static final D SFIXED64_LIST;
    public static final D SFIXED64_LIST_PACKED;
    public static final D SINT32;
    public static final D SINT32_LIST;
    public static final D SINT32_LIST_PACKED;
    public static final D SINT64;
    public static final D SINT64_LIST;
    public static final D SINT64_LIST_PACKED;
    public static final D STRING;
    public static final D STRING_LIST;
    public static final D UINT32;
    public static final D UINT32_LIST;
    public static final D UINT32_LIST_PACKED;
    public static final D UINT64;
    public static final D UINT64_LIST;
    public static final D UINT64_LIST_PACKED;
    private static final D[] VALUES;
    private final C collection;
    private final Class<?> elementType;
    private final int id;
    private final Z javaType;
    private final boolean primitiveScalar;

    static {
        C c8 = C.SCALAR;
        Z z7 = Z.DOUBLE;
        D d7 = new D("DOUBLE", 0, 0, c8, z7);
        DOUBLE = d7;
        Z z8 = Z.FLOAT;
        D d8 = new D("FLOAT", 1, 1, c8, z8);
        FLOAT = d8;
        Z z9 = Z.LONG;
        D d9 = new D("INT64", 2, 2, c8, z9);
        INT64 = d9;
        D d10 = new D("UINT64", 3, 3, c8, z9);
        UINT64 = d10;
        Z z10 = Z.INT;
        D d11 = new D("INT32", 4, 4, c8, z10);
        INT32 = d11;
        D d12 = new D("FIXED64", 5, 5, c8, z9);
        FIXED64 = d12;
        D d13 = new D("FIXED32", 6, 6, c8, z10);
        FIXED32 = d13;
        Z z11 = Z.BOOLEAN;
        D d14 = new D("BOOL", 7, 7, c8, z11);
        BOOL = d14;
        Z z12 = Z.STRING;
        D d15 = new D("STRING", 8, 8, c8, z12);
        STRING = d15;
        Z z13 = Z.MESSAGE;
        D d16 = new D("MESSAGE", 9, 9, c8, z13);
        MESSAGE = d16;
        Z z14 = Z.BYTE_STRING;
        D d17 = new D("BYTES", 10, 10, c8, z14);
        BYTES = d17;
        D d18 = new D("UINT32", 11, 11, c8, z10);
        UINT32 = d18;
        Z z15 = Z.ENUM;
        D d19 = new D("ENUM", 12, 12, c8, z15);
        ENUM = d19;
        D d20 = new D("SFIXED32", 13, 13, c8, z10);
        SFIXED32 = d20;
        D d21 = new D("SFIXED64", 14, 14, c8, z9);
        SFIXED64 = d21;
        D d22 = new D("SINT32", 15, 15, c8, z10);
        SINT32 = d22;
        D d23 = new D("SINT64", 16, 16, c8, z9);
        SINT64 = d23;
        D d24 = new D("GROUP", 17, 17, c8, z13);
        GROUP = d24;
        C c9 = C.VECTOR;
        D d25 = new D("DOUBLE_LIST", 18, 18, c9, z7);
        DOUBLE_LIST = d25;
        D d26 = new D("FLOAT_LIST", 19, 19, c9, z8);
        FLOAT_LIST = d26;
        D d27 = new D("INT64_LIST", 20, 20, c9, z9);
        INT64_LIST = d27;
        D d28 = new D("UINT64_LIST", 21, 21, c9, z9);
        UINT64_LIST = d28;
        D d29 = new D("INT32_LIST", 22, 22, c9, z10);
        INT32_LIST = d29;
        D d30 = new D("FIXED64_LIST", 23, 23, c9, z9);
        FIXED64_LIST = d30;
        D d31 = new D("FIXED32_LIST", 24, 24, c9, z10);
        FIXED32_LIST = d31;
        D d32 = new D("BOOL_LIST", 25, 25, c9, z11);
        BOOL_LIST = d32;
        D d33 = new D("STRING_LIST", 26, 26, c9, z12);
        STRING_LIST = d33;
        D d34 = new D("MESSAGE_LIST", 27, 27, c9, z13);
        MESSAGE_LIST = d34;
        D d35 = new D("BYTES_LIST", 28, 28, c9, z14);
        BYTES_LIST = d35;
        D d36 = new D("UINT32_LIST", 29, 29, c9, z10);
        UINT32_LIST = d36;
        D d37 = new D("ENUM_LIST", 30, 30, c9, z15);
        ENUM_LIST = d37;
        D d38 = new D("SFIXED32_LIST", 31, 31, c9, z10);
        SFIXED32_LIST = d38;
        D d39 = new D("SFIXED64_LIST", 32, 32, c9, z9);
        SFIXED64_LIST = d39;
        D d40 = new D("SINT32_LIST", 33, 33, c9, z10);
        SINT32_LIST = d40;
        D d41 = new D("SINT64_LIST", 34, 34, c9, z9);
        SINT64_LIST = d41;
        C c10 = C.PACKED_VECTOR;
        D d42 = new D("DOUBLE_LIST_PACKED", 35, 35, c10, z7);
        DOUBLE_LIST_PACKED = d42;
        D d43 = new D("FLOAT_LIST_PACKED", 36, 36, c10, z8);
        FLOAT_LIST_PACKED = d43;
        D d44 = new D("INT64_LIST_PACKED", 37, 37, c10, z9);
        INT64_LIST_PACKED = d44;
        D d45 = new D("UINT64_LIST_PACKED", 38, 38, c10, z9);
        UINT64_LIST_PACKED = d45;
        D d46 = new D("INT32_LIST_PACKED", 39, 39, c10, z10);
        INT32_LIST_PACKED = d46;
        D d47 = new D("FIXED64_LIST_PACKED", 40, 40, c10, z9);
        FIXED64_LIST_PACKED = d47;
        D d48 = new D("FIXED32_LIST_PACKED", 41, 41, c10, z10);
        FIXED32_LIST_PACKED = d48;
        D d49 = new D("BOOL_LIST_PACKED", 42, 42, c10, z11);
        BOOL_LIST_PACKED = d49;
        D d50 = new D("UINT32_LIST_PACKED", 43, 43, c10, z10);
        UINT32_LIST_PACKED = d50;
        D d51 = new D("ENUM_LIST_PACKED", 44, 44, c10, z15);
        ENUM_LIST_PACKED = d51;
        D d52 = new D("SFIXED32_LIST_PACKED", 45, 45, c10, z10);
        SFIXED32_LIST_PACKED = d52;
        D d53 = new D("SFIXED64_LIST_PACKED", 46, 46, c10, z9);
        SFIXED64_LIST_PACKED = d53;
        D d54 = new D("SINT32_LIST_PACKED", 47, 47, c10, z10);
        SINT32_LIST_PACKED = d54;
        D d55 = new D("SINT64_LIST_PACKED", 48, 48, c10, z9);
        SINT64_LIST_PACKED = d55;
        D d56 = new D("GROUP_LIST", 49, 49, c9, z13);
        GROUP_LIST = d56;
        D d57 = new D("MAP", 50, 50, C.MAP, Z.VOID);
        MAP = d57;
        $VALUES = new D[]{d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31, d32, d33, d34, d35, d36, d37, d38, d39, d40, d41, d42, d43, d44, d45, d46, d47, d48, d49, d50, d51, d52, d53, d54, d55, d56, d57};
        EMPTY_TYPES = new Type[0];
        D[] values = values();
        VALUES = new D[values.length];
        for (D d58 : values) {
            VALUES[d58.id] = d58;
        }
    }

    public D(String str, int i7, int i8, C c8, Z z7) {
        int i9;
        this.id = i8;
        this.collection = c8;
        this.javaType = z7;
        int i10 = B.f9987a[c8.ordinal()];
        boolean z8 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                this.elementType = null;
            } else {
                this.elementType = z7.a();
            }
        } else {
            this.elementType = z7.a();
        }
        this.primitiveScalar = (c8 != C.SCALAR || (i9 = B.f9988b[z7.ordinal()]) == 1 || i9 == 2 || i9 == 3) ? false : false;
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) $VALUES.clone();
    }

    public final int a() {
        return this.id;
    }
}
