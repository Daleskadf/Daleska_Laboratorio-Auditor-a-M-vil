package F3;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i CRUNCHY;
    public static final i LEGACY;
    public static final i RAW;
    public static final i TINK;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, F3.i] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, F3.i] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, F3.i] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, F3.i] */
    static {
        ?? r42 = new Enum("TINK", 0);
        TINK = r42;
        ?? r52 = new Enum("LEGACY", 1);
        LEGACY = r52;
        ?? r62 = new Enum("RAW", 2);
        RAW = r62;
        ?? r7 = new Enum("CRUNCHY", 3);
        CRUNCHY = r7;
        $VALUES = new i[]{r42, r52, r62, r7};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
