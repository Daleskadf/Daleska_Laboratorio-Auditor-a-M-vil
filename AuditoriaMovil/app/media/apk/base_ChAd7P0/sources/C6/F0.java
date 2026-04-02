package c6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class F0 {
    private static final /* synthetic */ F0[] $VALUES;
    public static final F0 DISCONNECTED;
    public static final F0 IDLE;
    public static final F0 IDLE_AND_PING_SENT;
    public static final F0 PING_DELAYED;
    public static final F0 PING_SCHEDULED;
    public static final F0 PING_SENT;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, c6.F0] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, c6.F0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, c6.F0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, c6.F0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, c6.F0] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, c6.F0] */
    static {
        ?? r62 = new Enum("IDLE", 0);
        IDLE = r62;
        ?? r7 = new Enum("PING_SCHEDULED", 1);
        PING_SCHEDULED = r7;
        ?? r8 = new Enum("PING_DELAYED", 2);
        PING_DELAYED = r8;
        ?? r9 = new Enum("PING_SENT", 3);
        PING_SENT = r9;
        ?? r10 = new Enum("IDLE_AND_PING_SENT", 4);
        IDLE_AND_PING_SENT = r10;
        ?? r11 = new Enum("DISCONNECTED", 5);
        DISCONNECTED = r11;
        $VALUES = new F0[]{r62, r7, r8, r9, r10, r11};
    }

    public static F0 valueOf(String str) {
        return (F0) Enum.valueOf(F0.class, str);
    }

    public static F0[] values() {
        return (F0[]) $VALUES.clone();
    }
}
