package t4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u {
    private static final /* synthetic */ u[] $VALUES;
    public static final u Backoff;
    public static final u Error;
    public static final u Healthy;
    public static final u Initial;
    public static final u Open;
    public static final u Starting;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [t4.u, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v1, types: [t4.u, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v0, types: [t4.u, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [t4.u, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [t4.u, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [t4.u, java.lang.Enum] */
    static {
        ?? r62 = new Enum("Initial", 0);
        Initial = r62;
        ?? r7 = new Enum("Starting", 1);
        Starting = r7;
        ?? r8 = new Enum("Open", 2);
        Open = r8;
        ?? r9 = new Enum("Healthy", 3);
        Healthy = r9;
        ?? r10 = new Enum("Error", 4);
        Error = r10;
        ?? r11 = new Enum("Backoff", 5);
        Backoff = r11;
        $VALUES = new u[]{r62, r7, r8, r9, r10, r11};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
