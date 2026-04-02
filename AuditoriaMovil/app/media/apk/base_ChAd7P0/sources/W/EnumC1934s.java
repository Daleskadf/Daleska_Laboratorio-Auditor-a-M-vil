package w;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1934s {
    private static final /* synthetic */ EnumC1934s[] $VALUES;
    public static final EnumC1934s CLOSING;
    public static final EnumC1934s CONFIGURED;
    public static final EnumC1934s INITIALIZED;
    public static final EnumC1934s OPENED;
    public static final EnumC1934s OPENING;
    public static final EnumC1934s PENDING_OPEN;
    public static final EnumC1934s RELEASED;
    public static final EnumC1934s RELEASING;
    public static final EnumC1934s REOPENING;
    public static final EnumC1934s REOPENING_QUIRK;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Enum, w.s] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, w.s] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, w.s] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, w.s] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, w.s] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, w.s] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, w.s] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, w.s] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, w.s] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, w.s] */
    static {
        ?? r10 = new Enum("RELEASED", 0);
        RELEASED = r10;
        ?? r11 = new Enum("RELEASING", 1);
        RELEASING = r11;
        ?? r12 = new Enum("INITIALIZED", 2);
        INITIALIZED = r12;
        ?? r13 = new Enum("PENDING_OPEN", 3);
        PENDING_OPEN = r13;
        ?? r14 = new Enum("CLOSING", 4);
        CLOSING = r14;
        ?? r15 = new Enum("REOPENING_QUIRK", 5);
        REOPENING_QUIRK = r15;
        ?? r52 = new Enum("REOPENING", 6);
        REOPENING = r52;
        ?? r42 = new Enum("OPENING", 7);
        OPENING = r42;
        ?? r32 = new Enum("OPENED", 8);
        OPENED = r32;
        ?? r22 = new Enum("CONFIGURED", 9);
        CONFIGURED = r22;
        $VALUES = new EnumC1934s[]{r10, r11, r12, r13, r14, r15, r52, r42, r32, r22};
    }

    public static EnumC1934s valueOf(String str) {
        return (EnumC1934s) Enum.valueOf(EnumC1934s.class, str);
    }

    public static EnumC1934s[] values() {
        return (EnumC1934s[]) $VALUES.clone();
    }
}
