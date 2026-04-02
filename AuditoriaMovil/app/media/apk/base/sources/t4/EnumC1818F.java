package t4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t4.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1818F {
    private static final /* synthetic */ EnumC1818F[] $VALUES;
    public static final EnumC1818F FALSE_POSITIVE;
    public static final EnumC1818F SKIPPED;
    public static final EnumC1818F SUCCESS;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, t4.F] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, t4.F] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, t4.F] */
    static {
        ?? r32 = new Enum("SUCCESS", 0);
        SUCCESS = r32;
        ?? r42 = new Enum("SKIPPED", 1);
        SKIPPED = r42;
        ?? r52 = new Enum("FALSE_POSITIVE", 2);
        FALSE_POSITIVE = r52;
        $VALUES = new EnumC1818F[]{r32, r42, r52};
    }

    public static EnumC1818F valueOf(String str) {
        return (EnumC1818F) Enum.valueOf(EnumC1818F.class, str);
    }

    public static EnumC1818F[] values() {
        return (EnumC1818F[]) $VALUES.clone();
    }
}
