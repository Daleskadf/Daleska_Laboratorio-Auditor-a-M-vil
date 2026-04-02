package E0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e FINISHED;
    public static final e PENDING;
    public static final e RUNNING;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [E0.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [E0.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [E0.e, java.lang.Enum] */
    static {
        ?? r32 = new Enum("PENDING", 0);
        PENDING = r32;
        ?? r42 = new Enum("RUNNING", 1);
        RUNNING = r42;
        ?? r52 = new Enum("FINISHED", 2);
        FINISHED = r52;
        $VALUES = new e[]{r32, r42, r52};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
