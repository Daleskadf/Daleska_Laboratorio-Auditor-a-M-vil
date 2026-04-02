package d6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q {
    private static final /* synthetic */ q[] $VALUES;
    public static final q INBOUND;
    public static final q OUTBOUND;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, d6.q] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, d6.q] */
    static {
        ?? r22 = new Enum("INBOUND", 0);
        INBOUND = r22;
        ?? r32 = new Enum("OUTBOUND", 1);
        OUTBOUND = r32;
        $VALUES = new q[]{r22, r32};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
