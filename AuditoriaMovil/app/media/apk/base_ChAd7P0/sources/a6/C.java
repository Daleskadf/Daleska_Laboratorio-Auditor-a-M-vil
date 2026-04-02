package a6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class C {
    private static final /* synthetic */ C[] $VALUES;
    public static final C CT_ERROR;
    public static final C CT_INFO;
    public static final C CT_UNKNOWN;
    public static final C CT_WARNING;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, a6.C] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, a6.C] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, a6.C] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, a6.C] */
    static {
        ?? r42 = new Enum("CT_UNKNOWN", 0);
        CT_UNKNOWN = r42;
        ?? r52 = new Enum("CT_INFO", 1);
        CT_INFO = r52;
        ?? r62 = new Enum("CT_WARNING", 2);
        CT_WARNING = r62;
        ?? r7 = new Enum("CT_ERROR", 3);
        CT_ERROR = r7;
        $VALUES = new C[]{r42, r52, r62, r7};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) $VALUES.clone();
    }
}
