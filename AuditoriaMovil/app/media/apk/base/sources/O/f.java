package O;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f DEFAULT;
    public static final f UNKNOWN;
    public static final f YUV;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, O.f] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, O.f] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, O.f] */
    static {
        ?? r32 = new Enum("UNKNOWN", 0);
        UNKNOWN = r32;
        ?? r42 = new Enum("DEFAULT", 1);
        DEFAULT = r42;
        ?? r52 = new Enum("YUV", 2);
        YUV = r52;
        $VALUES = new f[]{r32, r42, r52};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
