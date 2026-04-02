package u4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d ALL;
    public static final d CONNECTIVITY_ATTEMPT_TIMER;
    public static final d GARBAGE_COLLECTION;
    public static final d HEALTH_CHECK_TIMEOUT;
    public static final d INDEX_BACKFILL;
    public static final d LISTEN_STREAM_CONNECTION_BACKOFF;
    public static final d LISTEN_STREAM_IDLE;
    public static final d ONLINE_STATE_TIMEOUT;
    public static final d RETRY_TRANSACTION;
    public static final d WRITE_STREAM_CONNECTION_BACKOFF;
    public static final d WRITE_STREAM_IDLE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [u4.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r12v1, types: [u4.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r13v1, types: [u4.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r14v1, types: [u4.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r15v1, types: [u4.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [u4.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [u4.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [u4.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [u4.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [u4.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v2, types: [u4.d, java.lang.Enum] */
    static {
        ?? r11 = new Enum("ALL", 0);
        ALL = r11;
        ?? r12 = new Enum("LISTEN_STREAM_IDLE", 1);
        LISTEN_STREAM_IDLE = r12;
        ?? r13 = new Enum("LISTEN_STREAM_CONNECTION_BACKOFF", 2);
        LISTEN_STREAM_CONNECTION_BACKOFF = r13;
        ?? r14 = new Enum("WRITE_STREAM_IDLE", 3);
        WRITE_STREAM_IDLE = r14;
        ?? r15 = new Enum("WRITE_STREAM_CONNECTION_BACKOFF", 4);
        WRITE_STREAM_CONNECTION_BACKOFF = r15;
        ?? r7 = new Enum("HEALTH_CHECK_TIMEOUT", 5);
        HEALTH_CHECK_TIMEOUT = r7;
        ?? r62 = new Enum("ONLINE_STATE_TIMEOUT", 6);
        ONLINE_STATE_TIMEOUT = r62;
        ?? r52 = new Enum("GARBAGE_COLLECTION", 7);
        GARBAGE_COLLECTION = r52;
        ?? r42 = new Enum("RETRY_TRANSACTION", 8);
        RETRY_TRANSACTION = r42;
        ?? r32 = new Enum("CONNECTIVITY_ATTEMPT_TIMER", 9);
        CONNECTIVITY_ATTEMPT_TIMER = r32;
        ?? r22 = new Enum("INDEX_BACKFILL", 10);
        INDEX_BACKFILL = r22;
        $VALUES = new d[]{r11, r12, r13, r14, r15, r7, r62, r52, r42, r32, r22};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
