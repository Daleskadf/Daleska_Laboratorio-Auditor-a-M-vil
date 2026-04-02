package p4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p4.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1676f {
    private static final /* synthetic */ EnumC1676f[] $VALUES;
    public static final EnumC1676f FULL;
    public static final EnumC1676f NONE;
    public static final EnumC1676f PARTIAL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, p4.f] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, p4.f] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, p4.f] */
    static {
        ?? r32 = new Enum("NONE", 0);
        NONE = r32;
        ?? r42 = new Enum("PARTIAL", 1);
        PARTIAL = r42;
        ?? r52 = new Enum("FULL", 2);
        FULL = r52;
        $VALUES = new EnumC1676f[]{r32, r42, r52};
    }

    public static EnumC1676f valueOf(String str) {
        return (EnumC1676f) Enum.valueOf(EnumC1676f.class, str);
    }

    public static EnumC1676f[] values() {
        return (EnumC1676f[]) $VALUES.clone();
    }
}
