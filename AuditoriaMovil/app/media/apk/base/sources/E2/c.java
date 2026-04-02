package E2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c FATAL_ERROR;
    public static final c OK;
    public static final c TRANSIENT_ERROR;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [E2.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [E2.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [E2.c, java.lang.Enum] */
    static {
        ?? r32 = new Enum("OK", 0);
        OK = r32;
        ?? r42 = new Enum("TRANSIENT_ERROR", 1);
        TRANSIENT_ERROR = r42;
        ?? r52 = new Enum("FATAL_ERROR", 2);
        FATAL_ERROR = r52;
        $VALUES = new c[]{r32, r42, r52};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
