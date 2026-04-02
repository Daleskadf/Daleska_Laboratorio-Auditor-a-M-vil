package q4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j ASCENDING;
    public static final j CONTAINS;
    public static final j DESCENDING;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, q4.j] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, q4.j] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, q4.j] */
    static {
        ?? r32 = new Enum("ASCENDING", 0);
        ASCENDING = r32;
        ?? r42 = new Enum("DESCENDING", 1);
        DESCENDING = r42;
        ?? r52 = new Enum("CONTAINS", 2);
        CONTAINS = r52;
        $VALUES = new j[]{r32, r42, r52};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
