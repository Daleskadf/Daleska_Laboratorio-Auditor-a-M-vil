package q4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;
    public static final l HAS_COMMITTED_MUTATIONS;
    public static final l HAS_LOCAL_MUTATIONS;
    public static final l SYNCED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, q4.l] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, q4.l] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, q4.l] */
    static {
        ?? r32 = new Enum("HAS_LOCAL_MUTATIONS", 0);
        HAS_LOCAL_MUTATIONS = r32;
        ?? r42 = new Enum("HAS_COMMITTED_MUTATIONS", 1);
        HAS_COMMITTED_MUTATIONS = r42;
        ?? r52 = new Enum("SYNCED", 2);
        SYNCED = r52;
        $VALUES = new l[]{r32, r42, r52};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
