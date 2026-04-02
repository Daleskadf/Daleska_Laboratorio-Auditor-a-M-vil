package X3;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g DEFAULT_APP_CHECK_TOKEN;
    public static final g UNKNOWN_APP_CHECK_TOKEN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, X3.g] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, X3.g] */
    static {
        ?? r22 = new Enum("DEFAULT_APP_CHECK_TOKEN", 0);
        DEFAULT_APP_CHECK_TOKEN = r22;
        ?? r32 = new Enum("UNKNOWN_APP_CHECK_TOKEN", 1);
        UNKNOWN_APP_CHECK_TOKEN = r32;
        $VALUES = new g[]{r22, r32};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
