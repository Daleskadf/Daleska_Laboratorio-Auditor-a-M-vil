package c6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c6.k1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0681k1 {
    private static final /* synthetic */ EnumC0681k1[] $VALUES;
    public static final EnumC0681k1 BODY;
    public static final EnumC0681k1 HEADER;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, c6.k1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, c6.k1] */
    static {
        ?? r22 = new Enum("HEADER", 0);
        HEADER = r22;
        ?? r32 = new Enum("BODY", 1);
        BODY = r32;
        $VALUES = new EnumC0681k1[]{r22, r32};
    }

    public static EnumC0681k1 valueOf(String str) {
        return (EnumC0681k1) Enum.valueOf(EnumC0681k1.class, str);
    }

    public static EnumC0681k1[] values() {
        return (EnumC0681k1[]) $VALUES.clone();
    }
}
