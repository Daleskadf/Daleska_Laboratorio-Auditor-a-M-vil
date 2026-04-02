package A2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d DEFAULT;
    public static final d HIGHEST;
    public static final d VERY_LOW;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, A2.d] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, A2.d] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, A2.d] */
    static {
        ?? r32 = new Enum("DEFAULT", 0);
        DEFAULT = r32;
        ?? r42 = new Enum("VERY_LOW", 1);
        VERY_LOW = r42;
        ?? r52 = new Enum("HIGHEST", 2);
        HIGHEST = r52;
        $VALUES = new d[]{r32, r42, r52};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
