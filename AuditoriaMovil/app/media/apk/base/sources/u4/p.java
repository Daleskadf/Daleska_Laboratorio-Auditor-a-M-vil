package u4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {
    private static final /* synthetic */ p[] $VALUES;
    public static final p DEBUG;
    public static final p NONE;
    public static final p WARN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, u4.p] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, u4.p] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, u4.p] */
    static {
        ?? r32 = new Enum("DEBUG", 0);
        DEBUG = r32;
        ?? r42 = new Enum("WARN", 1);
        WARN = r42;
        ?? r52 = new Enum("NONE", 2);
        NONE = r52;
        $VALUES = new p[]{r32, r42, r52};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
