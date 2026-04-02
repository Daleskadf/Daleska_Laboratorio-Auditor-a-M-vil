package D;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a0 {
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 ERROR_CONVERSION;
    public static final a0 SUCCESS;
    public static final a0 UNKNOWN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, D.a0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, D.a0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, D.a0] */
    static {
        ?? r32 = new Enum("UNKNOWN", 0);
        UNKNOWN = r32;
        ?? r42 = new Enum("SUCCESS", 1);
        SUCCESS = r42;
        ?? r52 = new Enum("ERROR_CONVERSION", 2);
        ERROR_CONVERSION = r52;
        $VALUES = new a0[]{r32, r42, r52};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}
