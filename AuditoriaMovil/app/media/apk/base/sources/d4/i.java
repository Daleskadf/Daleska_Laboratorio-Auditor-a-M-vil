package d4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i IDLE;
    public static final i QUEUED;
    public static final i QUEUING;
    public static final i RUNNING;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, d4.i] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, d4.i] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, d4.i] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, d4.i] */
    static {
        ?? r42 = new Enum("IDLE", 0);
        IDLE = r42;
        ?? r52 = new Enum("QUEUING", 1);
        QUEUING = r52;
        ?? r62 = new Enum("QUEUED", 2);
        QUEUED = r62;
        ?? r7 = new Enum("RUNNING", 3);
        RUNNING = r7;
        $VALUES = new i[]{r42, r52, r62, r7};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
