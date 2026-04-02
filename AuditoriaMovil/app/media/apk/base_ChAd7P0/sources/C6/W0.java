package c6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class W0 {
    private static final /* synthetic */ W0[] $VALUES;
    public static final W0 ERROR;
    public static final W0 NO_RESOLUTION;
    public static final W0 SUCCESS;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, c6.W0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, c6.W0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, c6.W0] */
    static {
        ?? r32 = new Enum("NO_RESOLUTION", 0);
        NO_RESOLUTION = r32;
        ?? r42 = new Enum("SUCCESS", 1);
        SUCCESS = r42;
        ?? r52 = new Enum("ERROR", 2);
        ERROR = r52;
        $VALUES = new W0[]{r32, r42, r52};
    }

    public static W0 valueOf(String str) {
        return (W0) Enum.valueOf(W0.class, str);
    }

    public static W0[] values() {
        return (W0[]) $VALUES.clone();
    }
}
