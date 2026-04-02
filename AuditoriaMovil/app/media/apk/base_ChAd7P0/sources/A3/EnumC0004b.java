package A3;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: A3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0004b {
    private static final /* synthetic */ EnumC0004b[] $VALUES;
    public static final EnumC0004b DONE;
    public static final EnumC0004b FAILED;
    public static final EnumC0004b NOT_READY;
    public static final EnumC0004b READY;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, A3.b] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, A3.b] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, A3.b] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, A3.b] */
    static {
        ?? r42 = new Enum("READY", 0);
        READY = r42;
        ?? r52 = new Enum("NOT_READY", 1);
        NOT_READY = r52;
        ?? r62 = new Enum("DONE", 2);
        DONE = r62;
        ?? r7 = new Enum("FAILED", 3);
        FAILED = r7;
        $VALUES = new EnumC0004b[]{r42, r52, r62, r7};
    }

    public static EnumC0004b valueOf(String str) {
        return (EnumC0004b) Enum.valueOf(EnumC0004b.class, str);
    }

    public static EnumC0004b[] values() {
        return (EnumC0004b[]) $VALUES.clone();
    }
}
