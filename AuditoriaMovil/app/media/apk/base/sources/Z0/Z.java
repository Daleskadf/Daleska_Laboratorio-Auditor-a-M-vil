package z0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Z {
    private static final /* synthetic */ Z[] $VALUES;
    public static final Z ADDING;
    public static final Z NONE;
    public static final Z REMOVING;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, z0.Z] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, z0.Z] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, z0.Z] */
    static {
        ?? r32 = new Enum("NONE", 0);
        NONE = r32;
        ?? r42 = new Enum("ADDING", 1);
        ADDING = r42;
        ?? r52 = new Enum("REMOVING", 2);
        REMOVING = r52;
        $VALUES = new Z[]{r32, r42, r52};
    }

    public static Z valueOf(String str) {
        return (Z) Enum.valueOf(Z.class, str);
    }

    public static Z[] values() {
        return (Z[]) $VALUES.clone();
    }
}
