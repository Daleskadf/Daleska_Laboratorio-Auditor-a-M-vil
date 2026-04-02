package c6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c6.i0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0674i0 {
    private static final /* synthetic */ EnumC0674i0[] $VALUES;
    public static final EnumC0674i0 HEADER;
    public static final EnumC0674i0 HEADER_COMMENT;
    public static final EnumC0674i0 HEADER_CRC;
    public static final EnumC0674i0 HEADER_EXTRA;
    public static final EnumC0674i0 HEADER_EXTRA_LEN;
    public static final EnumC0674i0 HEADER_NAME;
    public static final EnumC0674i0 INFLATER_NEEDS_INPUT;
    public static final EnumC0674i0 INFLATING;
    public static final EnumC0674i0 INITIALIZE_INFLATER;
    public static final EnumC0674i0 TRAILER;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Enum, c6.i0] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, c6.i0] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, c6.i0] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, c6.i0] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, c6.i0] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, c6.i0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, c6.i0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, c6.i0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, c6.i0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, c6.i0] */
    static {
        ?? r10 = new Enum("HEADER", 0);
        HEADER = r10;
        ?? r11 = new Enum("HEADER_EXTRA_LEN", 1);
        HEADER_EXTRA_LEN = r11;
        ?? r12 = new Enum("HEADER_EXTRA", 2);
        HEADER_EXTRA = r12;
        ?? r13 = new Enum("HEADER_NAME", 3);
        HEADER_NAME = r13;
        ?? r14 = new Enum("HEADER_COMMENT", 4);
        HEADER_COMMENT = r14;
        ?? r15 = new Enum("HEADER_CRC", 5);
        HEADER_CRC = r15;
        ?? r52 = new Enum("INITIALIZE_INFLATER", 6);
        INITIALIZE_INFLATER = r52;
        ?? r42 = new Enum("INFLATING", 7);
        INFLATING = r42;
        ?? r32 = new Enum("INFLATER_NEEDS_INPUT", 8);
        INFLATER_NEEDS_INPUT = r32;
        ?? r22 = new Enum("TRAILER", 9);
        TRAILER = r22;
        $VALUES = new EnumC0674i0[]{r10, r11, r12, r13, r14, r15, r52, r42, r32, r22};
    }

    public static EnumC0674i0 valueOf(String str) {
        return (EnumC0674i0) Enum.valueOf(EnumC0674i0.class, str);
    }

    public static EnumC0674i0[] values() {
        return (EnumC0674i0[]) $VALUES.clone();
    }
}
