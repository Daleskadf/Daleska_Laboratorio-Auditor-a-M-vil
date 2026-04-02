package K5;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c DETACHED;
    public static final c HIDDEN;
    public static final c INACTIVE;
    public static final c PAUSED;
    public static final c RESUMED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, K5.c] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, K5.c] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, K5.c] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, K5.c] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, K5.c] */
    static {
        ?? r52 = new Enum("DETACHED", 0);
        DETACHED = r52;
        ?? r62 = new Enum("RESUMED", 1);
        RESUMED = r62;
        ?? r7 = new Enum("INACTIVE", 2);
        INACTIVE = r7;
        ?? r8 = new Enum("HIDDEN", 3);
        HIDDEN = r8;
        ?? r9 = new Enum("PAUSED", 4);
        PAUSED = r9;
        $VALUES = new c[]{r52, r62, r7, r8, r9};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
