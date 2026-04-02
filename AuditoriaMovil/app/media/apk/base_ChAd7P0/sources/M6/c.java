package M6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c BLOCKING;
    public static final c CPU_ACQUIRED;
    public static final c DORMANT;
    public static final c PARKING;
    public static final c TERMINATED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, M6.c] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, M6.c] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, M6.c] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, M6.c] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, M6.c] */
    static {
        ?? r52 = new Enum("CPU_ACQUIRED", 0);
        CPU_ACQUIRED = r52;
        ?? r62 = new Enum("BLOCKING", 1);
        BLOCKING = r62;
        ?? r7 = new Enum("PARKING", 2);
        PARKING = r7;
        ?? r8 = new Enum("DORMANT", 3);
        DORMANT = r8;
        ?? r9 = new Enum("TERMINATED", 4);
        TERMINATED = r9;
        $VALUES = new c[]{r52, r62, r7, r8, r9};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
