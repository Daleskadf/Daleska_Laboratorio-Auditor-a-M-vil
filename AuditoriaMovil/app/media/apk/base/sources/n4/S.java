package n4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class S {
    private static final /* synthetic */ S[] $VALUES;
    public static final S LOCAL;
    public static final S NONE;
    public static final S SYNCED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, n4.S] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, n4.S] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, n4.S] */
    static {
        ?? r32 = new Enum("NONE", 0);
        NONE = r32;
        ?? r42 = new Enum("LOCAL", 1);
        LOCAL = r42;
        ?? r52 = new Enum("SYNCED", 2);
        SYNCED = r52;
        $VALUES = new S[]{r32, r42, r52};
    }

    public static S valueOf(String str) {
        return (S) Enum.valueOf(S.class, str);
    }

    public static S[] values() {
        return (S[]) $VALUES.clone();
    }
}
