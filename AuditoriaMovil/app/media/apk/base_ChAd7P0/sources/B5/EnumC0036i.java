package B5;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: B5.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0036i {
    private static final /* synthetic */ EnumC0036i[] $VALUES;
    public static final EnumC0036i opaque;
    public static final EnumC0036i transparent;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [B5.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [B5.i, java.lang.Enum] */
    static {
        ?? r22 = new Enum("opaque", 0);
        opaque = r22;
        ?? r32 = new Enum("transparent", 1);
        transparent = r32;
        $VALUES = new EnumC0036i[]{r22, r32};
    }

    public static EnumC0036i valueOf(String str) {
        return (EnumC0036i) Enum.valueOf(EnumC0036i.class, str);
    }

    public static EnumC0036i[] values() {
        return (EnumC0036i[]) $VALUES.clone();
    }
}
