package c6;

import D.AbstractC0059i;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum NO_ERROR uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: c6.g0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0668g0 {
    private static final /* synthetic */ EnumC0668g0[] $VALUES;
    public static final EnumC0668g0 CANCEL;
    public static final EnumC0668g0 COMPRESSION_ERROR;
    public static final EnumC0668g0 CONNECT_ERROR;
    public static final EnumC0668g0 ENHANCE_YOUR_CALM;
    public static final EnumC0668g0 FLOW_CONTROL_ERROR;
    public static final EnumC0668g0 FRAME_SIZE_ERROR;
    public static final EnumC0668g0 HTTP_1_1_REQUIRED;
    public static final EnumC0668g0 INADEQUATE_SECURITY;
    public static final EnumC0668g0 INTERNAL_ERROR;
    public static final EnumC0668g0 NO_ERROR;
    public static final EnumC0668g0 PROTOCOL_ERROR;
    public static final EnumC0668g0 REFUSED_STREAM;
    public static final EnumC0668g0 SETTINGS_TIMEOUT;
    public static final EnumC0668g0 STREAM_CLOSED;
    private static final EnumC0668g0[] codeMap;
    private final int code;
    private final a6.o0 status;

    static {
        EnumC0668g0[] values;
        a6.o0 o0Var = a6.o0.f7180n;
        EnumC0668g0 enumC0668g0 = new EnumC0668g0("NO_ERROR", 0, 0, o0Var);
        NO_ERROR = enumC0668g0;
        a6.o0 o0Var2 = a6.o0.f7179m;
        EnumC0668g0 enumC0668g02 = new EnumC0668g0("PROTOCOL_ERROR", 1, 1, o0Var2);
        PROTOCOL_ERROR = enumC0668g02;
        EnumC0668g0 enumC0668g03 = new EnumC0668g0("INTERNAL_ERROR", 2, 2, o0Var2);
        INTERNAL_ERROR = enumC0668g03;
        EnumC0668g0 enumC0668g04 = new EnumC0668g0("FLOW_CONTROL_ERROR", 3, 3, o0Var2);
        FLOW_CONTROL_ERROR = enumC0668g04;
        EnumC0668g0 enumC0668g05 = new EnumC0668g0("SETTINGS_TIMEOUT", 4, 4, o0Var2);
        SETTINGS_TIMEOUT = enumC0668g05;
        EnumC0668g0 enumC0668g06 = new EnumC0668g0("STREAM_CLOSED", 5, 5, o0Var2);
        STREAM_CLOSED = enumC0668g06;
        EnumC0668g0 enumC0668g07 = new EnumC0668g0("FRAME_SIZE_ERROR", 6, 6, o0Var2);
        FRAME_SIZE_ERROR = enumC0668g07;
        EnumC0668g0 enumC0668g08 = new EnumC0668g0("REFUSED_STREAM", 7, 7, o0Var);
        REFUSED_STREAM = enumC0668g08;
        EnumC0668g0 enumC0668g09 = new EnumC0668g0("CANCEL", 8, 8, a6.o0.f);
        CANCEL = enumC0668g09;
        EnumC0668g0 enumC0668g010 = new EnumC0668g0("COMPRESSION_ERROR", 9, 9, o0Var2);
        COMPRESSION_ERROR = enumC0668g010;
        EnumC0668g0 enumC0668g011 = new EnumC0668g0("CONNECT_ERROR", 10, 10, o0Var2);
        CONNECT_ERROR = enumC0668g011;
        EnumC0668g0 enumC0668g012 = new EnumC0668g0("ENHANCE_YOUR_CALM", 11, 11, a6.o0.f7177k.g("Bandwidth exhausted"));
        ENHANCE_YOUR_CALM = enumC0668g012;
        EnumC0668g0 enumC0668g013 = new EnumC0668g0("INADEQUATE_SECURITY", 12, 12, a6.o0.f7176i.g("Permission denied as protocol is not secure enough to call"));
        INADEQUATE_SECURITY = enumC0668g013;
        EnumC0668g0 enumC0668g014 = new EnumC0668g0("HTTP_1_1_REQUIRED", 13, 13, a6.o0.f7174g);
        HTTP_1_1_REQUIRED = enumC0668g014;
        $VALUES = new EnumC0668g0[]{enumC0668g0, enumC0668g02, enumC0668g03, enumC0668g04, enumC0668g05, enumC0668g06, enumC0668g07, enumC0668g08, enumC0668g09, enumC0668g010, enumC0668g011, enumC0668g012, enumC0668g013, enumC0668g014};
        EnumC0668g0[] enumC0668g0Arr = new EnumC0668g0[values[values.length - 1].code + 1];
        for (EnumC0668g0 enumC0668g015 : values()) {
            enumC0668g0Arr[enumC0668g015.code] = enumC0668g015;
        }
        codeMap = enumC0668g0Arr;
    }

    public EnumC0668g0(String str, int i7, int i8, a6.o0 o0Var) {
        this.code = i8;
        String str2 = "HTTP/2 error code: " + name();
        if (o0Var.f7184b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" (");
            str2 = AbstractC0059i.D(sb, o0Var.f7184b, ")");
        }
        this.status = o0Var.g(str2);
    }

    public static a6.o0 a(long j) {
        EnumC0668g0 enumC0668g0;
        EnumC0668g0[] enumC0668g0Arr = codeMap;
        if (j < enumC0668g0Arr.length && j >= 0) {
            enumC0668g0 = enumC0668g0Arr[(int) j];
        } else {
            enumC0668g0 = null;
        }
        if (enumC0668g0 == null) {
            a6.o0 c8 = a6.o0.c(INTERNAL_ERROR.status.f7183a.c());
            return c8.g("Unrecognized HTTP/2 error code: " + j);
        }
        return enumC0668g0.status;
    }

    public static EnumC0668g0 valueOf(String str) {
        return (EnumC0668g0) Enum.valueOf(EnumC0668g0.class, str);
    }

    public static EnumC0668g0[] values() {
        return (EnumC0668g0[]) $VALUES.clone();
    }
}
