package w;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w.K  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1901K {
    private static final /* synthetic */ EnumC1901K[] $VALUES;
    public static final EnumC1901K CLOSED;
    public static final EnumC1901K GET_SURFACE;
    public static final EnumC1901K INITIALIZED;
    public static final EnumC1901K OPENED;
    public static final EnumC1901K OPENING;
    public static final EnumC1901K RELEASED;
    public static final EnumC1901K RELEASING;
    public static final EnumC1901K UNINITIALIZED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, w.K] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, w.K] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, w.K] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, w.K] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, w.K] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, w.K] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Enum, w.K] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, w.K] */
    static {
        ?? r8 = new Enum("UNINITIALIZED", 0);
        UNINITIALIZED = r8;
        ?? r9 = new Enum("INITIALIZED", 1);
        INITIALIZED = r9;
        ?? r10 = new Enum("GET_SURFACE", 2);
        GET_SURFACE = r10;
        ?? r11 = new Enum("OPENING", 3);
        OPENING = r11;
        ?? r12 = new Enum("OPENED", 4);
        OPENED = r12;
        ?? r13 = new Enum("CLOSED", 5);
        CLOSED = r13;
        ?? r14 = new Enum("RELEASING", 6);
        RELEASING = r14;
        ?? r15 = new Enum("RELEASED", 7);
        RELEASED = r15;
        $VALUES = new EnumC1901K[]{r8, r9, r10, r11, r12, r13, r14, r15};
    }

    public static EnumC1901K valueOf(String str) {
        return (EnumC1901K) Enum.valueOf(EnumC1901K.class, str);
    }

    public static EnumC1901K[] values() {
        return (EnumC1901K[]) $VALUES.clone();
    }
}
