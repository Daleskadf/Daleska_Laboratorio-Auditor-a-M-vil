package I2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e DEVICE_CHARGING;
    public static final e DEVICE_IDLE;
    public static final e NETWORK_UNMETERED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [I2.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [I2.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [I2.e, java.lang.Enum] */
    static {
        ?? r32 = new Enum("NETWORK_UNMETERED", 0);
        NETWORK_UNMETERED = r32;
        ?? r42 = new Enum("DEVICE_IDLE", 1);
        DEVICE_IDLE = r42;
        ?? r52 = new Enum("DEVICE_CHARGING", 2);
        DEVICE_CHARGING = r52;
        $VALUES = new e[]{r32, r42, r52};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
