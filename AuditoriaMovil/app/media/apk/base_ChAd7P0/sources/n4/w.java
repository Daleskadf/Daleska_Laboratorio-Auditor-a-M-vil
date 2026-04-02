package n4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w {
    private static final /* synthetic */ w[] $VALUES;
    public static final w ADDED;
    public static final w REMOVED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, n4.w] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, n4.w] */
    static {
        ?? r22 = new Enum("ADDED", 0);
        ADDED = r22;
        ?? r32 = new Enum("REMOVED", 1);
        REMOVED = r32;
        $VALUES = new w[]{r22, r32};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
