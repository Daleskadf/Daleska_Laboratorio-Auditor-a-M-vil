package a6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w0 {
    private static final /* synthetic */ w0[] $VALUES;
    public static final w0 CUSTOM_MANAGERS;
    public static final w0 FAKE;
    public static final w0 MTLS;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [a6.w0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [a6.w0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [a6.w0, java.lang.Enum] */
    static {
        ?? r32 = new Enum("FAKE", 0);
        FAKE = r32;
        ?? r42 = new Enum("MTLS", 1);
        MTLS = r42;
        ?? r52 = new Enum("CUSTOM_MANAGERS", 2);
        CUSTOM_MANAGERS = r52;
        $VALUES = new w0[]{r32, r42, r52};
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) $VALUES.clone();
    }
}
