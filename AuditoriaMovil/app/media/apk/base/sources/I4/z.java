package I4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z {
    private static final /* synthetic */ z[] $VALUES;
    public static final z LEGACY_STRICT;
    public static final z LENIENT;
    public static final z STRICT;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, I4.z] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, I4.z] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, I4.z] */
    static {
        ?? r32 = new Enum("LENIENT", 0);
        LENIENT = r32;
        ?? r42 = new Enum("LEGACY_STRICT", 1);
        LEGACY_STRICT = r42;
        ?? r52 = new Enum("STRICT", 2);
        STRICT = r52;
        $VALUES = new z[]{r32, r42, r52};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}
