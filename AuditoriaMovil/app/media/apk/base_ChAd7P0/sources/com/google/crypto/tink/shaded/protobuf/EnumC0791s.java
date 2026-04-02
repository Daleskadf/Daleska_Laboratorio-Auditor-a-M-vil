package com.google.crypto.tink.shaded.protobuf;

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
/* renamed from: com.google.crypto.tink.shaded.protobuf.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0791s {
    private static final /* synthetic */ EnumC0791s[] $VALUES;
    public static final EnumC0791s BOOL;
    public static final EnumC0791s BOOL_LIST;
    public static final EnumC0791s BOOL_LIST_PACKED;
    public static final EnumC0791s BYTES;
    public static final EnumC0791s BYTES_LIST;
    public static final EnumC0791s DOUBLE;
    public static final EnumC0791s DOUBLE_LIST;
    public static final EnumC0791s DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC0791s ENUM;
    public static final EnumC0791s ENUM_LIST;
    public static final EnumC0791s ENUM_LIST_PACKED;
    public static final EnumC0791s FIXED32;
    public static final EnumC0791s FIXED32_LIST;
    public static final EnumC0791s FIXED32_LIST_PACKED;
    public static final EnumC0791s FIXED64;
    public static final EnumC0791s FIXED64_LIST;
    public static final EnumC0791s FIXED64_LIST_PACKED;
    public static final EnumC0791s FLOAT;
    public static final EnumC0791s FLOAT_LIST;
    public static final EnumC0791s FLOAT_LIST_PACKED;
    public static final EnumC0791s GROUP;
    public static final EnumC0791s GROUP_LIST;
    public static final EnumC0791s INT32;
    public static final EnumC0791s INT32_LIST;
    public static final EnumC0791s INT32_LIST_PACKED;
    public static final EnumC0791s INT64;
    public static final EnumC0791s INT64_LIST;
    public static final EnumC0791s INT64_LIST_PACKED;
    public static final EnumC0791s MAP;
    public static final EnumC0791s MESSAGE;
    public static final EnumC0791s MESSAGE_LIST;
    public static final EnumC0791s SFIXED32;
    public static final EnumC0791s SFIXED32_LIST;
    public static final EnumC0791s SFIXED32_LIST_PACKED;
    public static final EnumC0791s SFIXED64;
    public static final EnumC0791s SFIXED64_LIST;
    public static final EnumC0791s SFIXED64_LIST_PACKED;
    public static final EnumC0791s SINT32;
    public static final EnumC0791s SINT32_LIST;
    public static final EnumC0791s SINT32_LIST_PACKED;
    public static final EnumC0791s SINT64;
    public static final EnumC0791s SINT64_LIST;
    public static final EnumC0791s SINT64_LIST_PACKED;
    public static final EnumC0791s STRING;
    public static final EnumC0791s STRING_LIST;
    public static final EnumC0791s UINT32;
    public static final EnumC0791s UINT32_LIST;
    public static final EnumC0791s UINT32_LIST_PACKED;
    public static final EnumC0791s UINT64;
    public static final EnumC0791s UINT64_LIST;
    public static final EnumC0791s UINT64_LIST_PACKED;
    private static final EnumC0791s[] VALUES;
    private final r collection;
    private final Class<?> elementType;
    private final int id;
    private final G javaType;
    private final boolean primitiveScalar;

    static {
        r rVar = r.SCALAR;
        G g3 = G.DOUBLE;
        EnumC0791s enumC0791s = new EnumC0791s("DOUBLE", 0, 0, rVar, g3);
        DOUBLE = enumC0791s;
        G g4 = G.FLOAT;
        EnumC0791s enumC0791s2 = new EnumC0791s("FLOAT", 1, 1, rVar, g4);
        FLOAT = enumC0791s2;
        G g8 = G.LONG;
        EnumC0791s enumC0791s3 = new EnumC0791s("INT64", 2, 2, rVar, g8);
        INT64 = enumC0791s3;
        EnumC0791s enumC0791s4 = new EnumC0791s("UINT64", 3, 3, rVar, g8);
        UINT64 = enumC0791s4;
        G g9 = G.INT;
        EnumC0791s enumC0791s5 = new EnumC0791s("INT32", 4, 4, rVar, g9);
        INT32 = enumC0791s5;
        EnumC0791s enumC0791s6 = new EnumC0791s("FIXED64", 5, 5, rVar, g8);
        FIXED64 = enumC0791s6;
        EnumC0791s enumC0791s7 = new EnumC0791s("FIXED32", 6, 6, rVar, g9);
        FIXED32 = enumC0791s7;
        G g10 = G.BOOLEAN;
        EnumC0791s enumC0791s8 = new EnumC0791s("BOOL", 7, 7, rVar, g10);
        BOOL = enumC0791s8;
        G g11 = G.STRING;
        EnumC0791s enumC0791s9 = new EnumC0791s("STRING", 8, 8, rVar, g11);
        STRING = enumC0791s9;
        G g12 = G.MESSAGE;
        EnumC0791s enumC0791s10 = new EnumC0791s("MESSAGE", 9, 9, rVar, g12);
        MESSAGE = enumC0791s10;
        G g13 = G.BYTE_STRING;
        EnumC0791s enumC0791s11 = new EnumC0791s("BYTES", 10, 10, rVar, g13);
        BYTES = enumC0791s11;
        EnumC0791s enumC0791s12 = new EnumC0791s("UINT32", 11, 11, rVar, g9);
        UINT32 = enumC0791s12;
        G g14 = G.ENUM;
        EnumC0791s enumC0791s13 = new EnumC0791s("ENUM", 12, 12, rVar, g14);
        ENUM = enumC0791s13;
        EnumC0791s enumC0791s14 = new EnumC0791s("SFIXED32", 13, 13, rVar, g9);
        SFIXED32 = enumC0791s14;
        EnumC0791s enumC0791s15 = new EnumC0791s("SFIXED64", 14, 14, rVar, g8);
        SFIXED64 = enumC0791s15;
        EnumC0791s enumC0791s16 = new EnumC0791s("SINT32", 15, 15, rVar, g9);
        SINT32 = enumC0791s16;
        EnumC0791s enumC0791s17 = new EnumC0791s("SINT64", 16, 16, rVar, g8);
        SINT64 = enumC0791s17;
        EnumC0791s enumC0791s18 = new EnumC0791s("GROUP", 17, 17, rVar, g12);
        GROUP = enumC0791s18;
        r rVar2 = r.VECTOR;
        EnumC0791s enumC0791s19 = new EnumC0791s("DOUBLE_LIST", 18, 18, rVar2, g3);
        DOUBLE_LIST = enumC0791s19;
        EnumC0791s enumC0791s20 = new EnumC0791s("FLOAT_LIST", 19, 19, rVar2, g4);
        FLOAT_LIST = enumC0791s20;
        EnumC0791s enumC0791s21 = new EnumC0791s("INT64_LIST", 20, 20, rVar2, g8);
        INT64_LIST = enumC0791s21;
        EnumC0791s enumC0791s22 = new EnumC0791s("UINT64_LIST", 21, 21, rVar2, g8);
        UINT64_LIST = enumC0791s22;
        EnumC0791s enumC0791s23 = new EnumC0791s("INT32_LIST", 22, 22, rVar2, g9);
        INT32_LIST = enumC0791s23;
        EnumC0791s enumC0791s24 = new EnumC0791s("FIXED64_LIST", 23, 23, rVar2, g8);
        FIXED64_LIST = enumC0791s24;
        EnumC0791s enumC0791s25 = new EnumC0791s("FIXED32_LIST", 24, 24, rVar2, g9);
        FIXED32_LIST = enumC0791s25;
        EnumC0791s enumC0791s26 = new EnumC0791s("BOOL_LIST", 25, 25, rVar2, g10);
        BOOL_LIST = enumC0791s26;
        EnumC0791s enumC0791s27 = new EnumC0791s("STRING_LIST", 26, 26, rVar2, g11);
        STRING_LIST = enumC0791s27;
        EnumC0791s enumC0791s28 = new EnumC0791s("MESSAGE_LIST", 27, 27, rVar2, g12);
        MESSAGE_LIST = enumC0791s28;
        EnumC0791s enumC0791s29 = new EnumC0791s("BYTES_LIST", 28, 28, rVar2, g13);
        BYTES_LIST = enumC0791s29;
        EnumC0791s enumC0791s30 = new EnumC0791s("UINT32_LIST", 29, 29, rVar2, g9);
        UINT32_LIST = enumC0791s30;
        EnumC0791s enumC0791s31 = new EnumC0791s("ENUM_LIST", 30, 30, rVar2, g14);
        ENUM_LIST = enumC0791s31;
        EnumC0791s enumC0791s32 = new EnumC0791s("SFIXED32_LIST", 31, 31, rVar2, g9);
        SFIXED32_LIST = enumC0791s32;
        EnumC0791s enumC0791s33 = new EnumC0791s("SFIXED64_LIST", 32, 32, rVar2, g8);
        SFIXED64_LIST = enumC0791s33;
        EnumC0791s enumC0791s34 = new EnumC0791s("SINT32_LIST", 33, 33, rVar2, g9);
        SINT32_LIST = enumC0791s34;
        EnumC0791s enumC0791s35 = new EnumC0791s("SINT64_LIST", 34, 34, rVar2, g8);
        SINT64_LIST = enumC0791s35;
        r rVar3 = r.PACKED_VECTOR;
        EnumC0791s enumC0791s36 = new EnumC0791s("DOUBLE_LIST_PACKED", 35, 35, rVar3, g3);
        DOUBLE_LIST_PACKED = enumC0791s36;
        EnumC0791s enumC0791s37 = new EnumC0791s("FLOAT_LIST_PACKED", 36, 36, rVar3, g4);
        FLOAT_LIST_PACKED = enumC0791s37;
        EnumC0791s enumC0791s38 = new EnumC0791s("INT64_LIST_PACKED", 37, 37, rVar3, g8);
        INT64_LIST_PACKED = enumC0791s38;
        EnumC0791s enumC0791s39 = new EnumC0791s("UINT64_LIST_PACKED", 38, 38, rVar3, g8);
        UINT64_LIST_PACKED = enumC0791s39;
        EnumC0791s enumC0791s40 = new EnumC0791s("INT32_LIST_PACKED", 39, 39, rVar3, g9);
        INT32_LIST_PACKED = enumC0791s40;
        EnumC0791s enumC0791s41 = new EnumC0791s("FIXED64_LIST_PACKED", 40, 40, rVar3, g8);
        FIXED64_LIST_PACKED = enumC0791s41;
        EnumC0791s enumC0791s42 = new EnumC0791s("FIXED32_LIST_PACKED", 41, 41, rVar3, g9);
        FIXED32_LIST_PACKED = enumC0791s42;
        EnumC0791s enumC0791s43 = new EnumC0791s("BOOL_LIST_PACKED", 42, 42, rVar3, g10);
        BOOL_LIST_PACKED = enumC0791s43;
        EnumC0791s enumC0791s44 = new EnumC0791s("UINT32_LIST_PACKED", 43, 43, rVar3, g9);
        UINT32_LIST_PACKED = enumC0791s44;
        EnumC0791s enumC0791s45 = new EnumC0791s("ENUM_LIST_PACKED", 44, 44, rVar3, g14);
        ENUM_LIST_PACKED = enumC0791s45;
        EnumC0791s enumC0791s46 = new EnumC0791s("SFIXED32_LIST_PACKED", 45, 45, rVar3, g9);
        SFIXED32_LIST_PACKED = enumC0791s46;
        EnumC0791s enumC0791s47 = new EnumC0791s("SFIXED64_LIST_PACKED", 46, 46, rVar3, g8);
        SFIXED64_LIST_PACKED = enumC0791s47;
        EnumC0791s enumC0791s48 = new EnumC0791s("SINT32_LIST_PACKED", 47, 47, rVar3, g9);
        SINT32_LIST_PACKED = enumC0791s48;
        EnumC0791s enumC0791s49 = new EnumC0791s("SINT64_LIST_PACKED", 48, 48, rVar3, g8);
        SINT64_LIST_PACKED = enumC0791s49;
        EnumC0791s enumC0791s50 = new EnumC0791s("GROUP_LIST", 49, 49, rVar2, g12);
        GROUP_LIST = enumC0791s50;
        EnumC0791s enumC0791s51 = new EnumC0791s("MAP", 50, 50, r.MAP, G.VOID);
        MAP = enumC0791s51;
        $VALUES = new EnumC0791s[]{enumC0791s, enumC0791s2, enumC0791s3, enumC0791s4, enumC0791s5, enumC0791s6, enumC0791s7, enumC0791s8, enumC0791s9, enumC0791s10, enumC0791s11, enumC0791s12, enumC0791s13, enumC0791s14, enumC0791s15, enumC0791s16, enumC0791s17, enumC0791s18, enumC0791s19, enumC0791s20, enumC0791s21, enumC0791s22, enumC0791s23, enumC0791s24, enumC0791s25, enumC0791s26, enumC0791s27, enumC0791s28, enumC0791s29, enumC0791s30, enumC0791s31, enumC0791s32, enumC0791s33, enumC0791s34, enumC0791s35, enumC0791s36, enumC0791s37, enumC0791s38, enumC0791s39, enumC0791s40, enumC0791s41, enumC0791s42, enumC0791s43, enumC0791s44, enumC0791s45, enumC0791s46, enumC0791s47, enumC0791s48, enumC0791s49, enumC0791s50, enumC0791s51};
        EMPTY_TYPES = new Type[0];
        EnumC0791s[] values = values();
        VALUES = new EnumC0791s[values.length];
        for (EnumC0791s enumC0791s52 : values) {
            VALUES[enumC0791s52.id] = enumC0791s52;
        }
    }

    public EnumC0791s(String str, int i7, int i8, r rVar, G g3) {
        int i9;
        this.id = i8;
        this.collection = rVar;
        this.javaType = g3;
        int i10 = AbstractC0790q.f9686a[rVar.ordinal()];
        boolean z7 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                this.elementType = null;
            } else {
                this.elementType = g3.a();
            }
        } else {
            this.elementType = g3.a();
        }
        this.primitiveScalar = (rVar != r.SCALAR || (i9 = AbstractC0790q.f9687b[g3.ordinal()]) == 1 || i9 == 2 || i9 == 3) ? false : false;
    }

    public static EnumC0791s valueOf(String str) {
        return (EnumC0791s) Enum.valueOf(EnumC0791s.class, str);
    }

    public static EnumC0791s[] values() {
        return (EnumC0791s[]) $VALUES.clone();
    }

    public final int a() {
        return this.id;
    }
}
