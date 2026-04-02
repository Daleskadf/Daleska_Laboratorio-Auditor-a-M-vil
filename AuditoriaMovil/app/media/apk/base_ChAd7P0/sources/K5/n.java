package K5;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {
    private static final /* synthetic */ n[] $VALUES;
    public static final n HYBRID_ONLY;
    public static final n TEXTURE_WITH_HYBRID_FALLBACK;
    public static final n TEXTURE_WITH_VIRTUAL_FALLBACK;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, K5.n] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, K5.n] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, K5.n] */
    static {
        ?? r32 = new Enum("TEXTURE_WITH_VIRTUAL_FALLBACK", 0);
        TEXTURE_WITH_VIRTUAL_FALLBACK = r32;
        ?? r42 = new Enum("TEXTURE_WITH_HYBRID_FALLBACK", 1);
        TEXTURE_WITH_HYBRID_FALLBACK = r42;
        ?? r52 = new Enum("HYBRID_ONLY", 2);
        HYBRID_ONLY = r52;
        $VALUES = new n[]{r32, r42, r52};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
