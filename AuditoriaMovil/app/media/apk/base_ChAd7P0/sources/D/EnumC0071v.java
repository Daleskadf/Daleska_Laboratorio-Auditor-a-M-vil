package D;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: D.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0071v {
    private static final /* synthetic */ EnumC0071v[] $VALUES;
    public static final EnumC0071v CLOSED;
    public static final EnumC0071v CLOSING;
    public static final EnumC0071v OPEN;
    public static final EnumC0071v OPENING;
    public static final EnumC0071v PENDING_OPEN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, D.v] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, D.v] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, D.v] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, D.v] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, D.v] */
    static {
        ?? r52 = new Enum("PENDING_OPEN", 0);
        PENDING_OPEN = r52;
        ?? r62 = new Enum("OPENING", 1);
        OPENING = r62;
        ?? r7 = new Enum("OPEN", 2);
        OPEN = r7;
        ?? r8 = new Enum("CLOSING", 3);
        CLOSING = r8;
        ?? r9 = new Enum("CLOSED", 4);
        CLOSED = r9;
        $VALUES = new EnumC0071v[]{r52, r62, r7, r8, r9};
    }

    public static EnumC0071v valueOf(String str) {
        return (EnumC0071v) Enum.valueOf(EnumC0071v.class, str);
    }

    public static EnumC0071v[] values() {
        return (EnumC0071v[]) $VALUES.clone();
    }
}
