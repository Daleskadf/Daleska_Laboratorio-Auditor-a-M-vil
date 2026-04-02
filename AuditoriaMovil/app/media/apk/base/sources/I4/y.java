package I4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y {
    private static final /* synthetic */ y[] $VALUES;
    public static final y ALLOW;
    public static final y BLOCK_ALL;
    public static final y BLOCK_INACCESSIBLE;
    public static final y INDECISIVE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, I4.y] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, I4.y] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, I4.y] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, I4.y] */
    static {
        ?? r42 = new Enum("ALLOW", 0);
        ALLOW = r42;
        ?? r52 = new Enum("INDECISIVE", 1);
        INDECISIVE = r52;
        ?? r62 = new Enum("BLOCK_INACCESSIBLE", 2);
        BLOCK_INACCESSIBLE = r62;
        ?? r7 = new Enum("BLOCK_ALL", 3);
        BLOCK_ALL = r7;
        $VALUES = new y[]{r42, r52, r62, r7};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
