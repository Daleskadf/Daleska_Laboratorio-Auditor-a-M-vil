package d6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: d6.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0911h {
    private static final /* synthetic */ EnumC0911h[] $VALUES;
    public static final EnumC0911h PLAINTEXT;
    public static final EnumC0911h TLS;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [d6.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [d6.h, java.lang.Enum] */
    static {
        ?? r22 = new Enum("TLS", 0);
        TLS = r22;
        ?? r32 = new Enum("PLAINTEXT", 1);
        PLAINTEXT = r32;
        $VALUES = new EnumC0911h[]{r22, r32};
    }

    public static EnumC0911h valueOf(String str) {
        return (EnumC0911h) Enum.valueOf(EnumC0911h.class, str);
    }

    public static EnumC0911h[] values() {
        return (EnumC0911h[]) $VALUES.clone();
    }
}
