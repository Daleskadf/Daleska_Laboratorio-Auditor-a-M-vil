package androidx.datastore.preferences.protobuf;
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
public class v0 {
    private static final /* synthetic */ v0[] $VALUES;
    public static final v0 BOOL;
    public static final v0 BYTES;
    public static final v0 DOUBLE;
    public static final v0 ENUM;
    public static final v0 FIXED32;
    public static final v0 FIXED64;
    public static final v0 FLOAT;
    public static final v0 GROUP;
    public static final v0 INT32;
    public static final v0 INT64;
    public static final v0 MESSAGE;
    public static final v0 SFIXED32;
    public static final v0 SFIXED64;
    public static final v0 SINT32;
    public static final v0 SINT64;
    public static final v0 STRING;
    public static final v0 UINT32;
    public static final v0 UINT64;
    private final w0 javaType;
    private final int wireType;

    static {
        v0 v0Var = new v0("DOUBLE", 0, w0.DOUBLE, 1);
        DOUBLE = v0Var;
        v0 v0Var2 = new v0("FLOAT", 1, w0.FLOAT, 5);
        FLOAT = v0Var2;
        w0 w0Var = w0.LONG;
        v0 v0Var3 = new v0("INT64", 2, w0Var, 0);
        INT64 = v0Var3;
        v0 v0Var4 = new v0("UINT64", 3, w0Var, 0);
        UINT64 = v0Var4;
        w0 w0Var2 = w0.INT;
        v0 v0Var5 = new v0("INT32", 4, w0Var2, 0);
        INT32 = v0Var5;
        v0 v0Var6 = new v0("FIXED64", 5, w0Var, 1);
        FIXED64 = v0Var6;
        v0 v0Var7 = new v0("FIXED32", 6, w0Var2, 5);
        FIXED32 = v0Var7;
        v0 v0Var8 = new v0("BOOL", 7, w0.BOOLEAN, 0);
        BOOL = v0Var8;
        v0 v0Var9 = new v0("STRING", 8, w0.STRING, 2);
        STRING = v0Var9;
        w0 w0Var3 = w0.MESSAGE;
        v0 v0Var10 = new v0("GROUP", 9, w0Var3, 3);
        GROUP = v0Var10;
        v0 v0Var11 = new v0("MESSAGE", 10, w0Var3, 2);
        MESSAGE = v0Var11;
        v0 v0Var12 = new v0("BYTES", 11, w0.BYTE_STRING, 2);
        BYTES = v0Var12;
        v0 v0Var13 = new v0("UINT32", 12, w0Var2, 0);
        UINT32 = v0Var13;
        v0 v0Var14 = new v0("ENUM", 13, w0.ENUM, 0);
        ENUM = v0Var14;
        v0 v0Var15 = new v0("SFIXED32", 14, w0Var2, 5);
        SFIXED32 = v0Var15;
        v0 v0Var16 = new v0("SFIXED64", 15, w0Var, 1);
        SFIXED64 = v0Var16;
        v0 v0Var17 = new v0("SINT32", 16, w0Var2, 0);
        SINT32 = v0Var17;
        v0 v0Var18 = new v0("SINT64", 17, w0Var, 0);
        SINT64 = v0Var18;
        $VALUES = new v0[]{v0Var, v0Var2, v0Var3, v0Var4, v0Var5, v0Var6, v0Var7, v0Var8, v0Var9, v0Var10, v0Var11, v0Var12, v0Var13, v0Var14, v0Var15, v0Var16, v0Var17, v0Var18};
    }

    public v0(String str, int i7, w0 w0Var, int i8) {
        this.javaType = w0Var;
        this.wireType = i8;
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) $VALUES.clone();
    }

    public final w0 a() {
        return this.javaType;
    }

    public final int b() {
        return this.wireType;
    }
}
