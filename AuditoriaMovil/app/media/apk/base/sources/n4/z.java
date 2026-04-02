package n4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z {
    private static final /* synthetic */ z[] $VALUES;
    public static final z OFFLINE;
    public static final z ONLINE;
    public static final z UNKNOWN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [n4.z, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [n4.z, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [n4.z, java.lang.Enum] */
    static {
        ?? r32 = new Enum("UNKNOWN", 0);
        UNKNOWN = r32;
        ?? r42 = new Enum("ONLINE", 1);
        ONLINE = r42;
        ?? r52 = new Enum("OFFLINE", 2);
        OFFLINE = r52;
        $VALUES = new z[]{r32, r42, r52};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}
