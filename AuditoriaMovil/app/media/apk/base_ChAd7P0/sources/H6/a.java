package H6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a DROP_LATEST;
    public static final a DROP_OLDEST;
    public static final a SUSPEND;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [H6.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [H6.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [H6.a, java.lang.Enum] */
    static {
        ?? r32 = new Enum("SUSPEND", 0);
        SUSPEND = r32;
        ?? r42 = new Enum("DROP_OLDEST", 1);
        DROP_OLDEST = r42;
        ?? r52 = new Enum("DROP_LATEST", 2);
        DROP_LATEST = r52;
        $VALUES = new a[]{r32, r42, r52};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
