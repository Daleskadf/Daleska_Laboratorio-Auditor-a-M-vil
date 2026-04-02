package j7;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g LOOP;
    public static final g RELEASE;
    public static final g STOP;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j7.g] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, j7.g] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j7.g] */
    static {
        ?? r32 = new Enum("RELEASE", 0);
        RELEASE = r32;
        ?? r42 = new Enum("LOOP", 1);
        LOOP = r42;
        ?? r52 = new Enum("STOP", 2);
        STOP = r52;
        $VALUES = new g[]{r32, r42, r52};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
