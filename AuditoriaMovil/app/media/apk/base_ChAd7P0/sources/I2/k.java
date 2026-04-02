package i2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k LOG;
    public static final k QUIET;
    public static final k STRICT;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, i2.k] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, i2.k] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, i2.k] */
    static {
        ?? r32 = new Enum("STRICT", 0);
        STRICT = r32;
        ?? r42 = new Enum("LOG", 1);
        LOG = r42;
        ?? r52 = new Enum("QUIET", 2);
        QUIET = r52;
        $VALUES = new k[]{r32, r42, r52};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
