package B5;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: B5.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0041n {
    private static final /* synthetic */ EnumC0041n[] $VALUES;
    public static final EnumC0041n background;
    public static final EnumC0041n overlay;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, B5.n] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, B5.n] */
    static {
        ?? r22 = new Enum("background", 0);
        background = r22;
        ?? r32 = new Enum("overlay", 1);
        overlay = r32;
        $VALUES = new EnumC0041n[]{r22, r32};
    }

    public static EnumC0041n valueOf(String str) {
        return (EnumC0041n) Enum.valueOf(EnumC0041n.class, str);
    }

    public static EnumC0041n[] values() {
        return (EnumC0041n[]) $VALUES.clone();
    }
}
