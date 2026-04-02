package a6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l0 {
    private static final /* synthetic */ l0[] $VALUES;
    public static final l0 INTEGRITY;
    public static final l0 NONE;
    public static final l0 PRIVACY_AND_INTEGRITY;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, a6.l0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, a6.l0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, a6.l0] */
    static {
        ?? r32 = new Enum("NONE", 0);
        NONE = r32;
        ?? r42 = new Enum("INTEGRITY", 1);
        INTEGRITY = r42;
        ?? r52 = new Enum("PRIVACY_AND_INTEGRITY", 2);
        PRIVACY_AND_INTEGRITY = r52;
        $VALUES = new l0[]{r32, r42, r52};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) $VALUES.clone();
    }
}
