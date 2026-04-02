package c6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c6.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0714w {
    private static final /* synthetic */ EnumC0714w[] $VALUES;
    public static final EnumC0714w DROPPED;
    public static final EnumC0714w MISCARRIED;
    public static final EnumC0714w PROCESSED;
    public static final EnumC0714w REFUSED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [c6.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [c6.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [c6.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [c6.w, java.lang.Enum] */
    static {
        ?? r42 = new Enum("PROCESSED", 0);
        PROCESSED = r42;
        ?? r52 = new Enum("REFUSED", 1);
        REFUSED = r52;
        ?? r62 = new Enum("DROPPED", 2);
        DROPPED = r62;
        ?? r7 = new Enum("MISCARRIED", 3);
        MISCARRIED = r7;
        $VALUES = new EnumC0714w[]{r42, r52, r62, r7};
    }

    public static EnumC0714w valueOf(String str) {
        return (EnumC0714w) Enum.valueOf(EnumC0714w.class, str);
    }

    public static EnumC0714w[] values() {
        return (EnumC0714w[]) $VALUES.clone();
    }
}
