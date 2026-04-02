package d6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: d6.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0909f {
    private static final /* synthetic */ EnumC0909f[] $VALUES;
    public static final EnumC0909f PLAINTEXT;
    public static final EnumC0909f TLS;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, d6.f] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, d6.f] */
    static {
        ?? r22 = new Enum("TLS", 0);
        TLS = r22;
        ?? r32 = new Enum("PLAINTEXT", 1);
        PLAINTEXT = r32;
        $VALUES = new EnumC0909f[]{r22, r32};
    }

    public static EnumC0909f valueOf(String str) {
        return (EnumC0909f) Enum.valueOf(EnumC0909f.class, str);
    }

    public static EnumC0909f[] values() {
        return (EnumC0909f[]) $VALUES.clone();
    }
}
