package G;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j IDLE;
    public static final j QUEUED;
    public static final j QUEUING;
    public static final j RUNNING;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [G.j, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [G.j, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [G.j, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [G.j, java.lang.Enum] */
    static {
        ?? r42 = new Enum("IDLE", 0);
        IDLE = r42;
        ?? r52 = new Enum("QUEUING", 1);
        QUEUING = r52;
        ?? r62 = new Enum("QUEUED", 2);
        QUEUED = r62;
        ?? r7 = new Enum("RUNNING", 3);
        RUNNING = r7;
        $VALUES = new j[]{r42, r52, r62, r7};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
