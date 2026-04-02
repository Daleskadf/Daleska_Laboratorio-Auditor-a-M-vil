package q4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {
    private static final /* synthetic */ m[] $VALUES;
    public static final m FOUND_DOCUMENT;
    public static final m INVALID;
    public static final m NO_DOCUMENT;
    public static final m UNKNOWN_DOCUMENT;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, q4.m] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, q4.m] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, q4.m] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, q4.m] */
    static {
        ?? r42 = new Enum("INVALID", 0);
        INVALID = r42;
        ?? r52 = new Enum("FOUND_DOCUMENT", 1);
        FOUND_DOCUMENT = r52;
        ?? r62 = new Enum("NO_DOCUMENT", 2);
        NO_DOCUMENT = r62;
        ?? r7 = new Enum("UNKNOWN_DOCUMENT", 3);
        UNKNOWN_DOCUMENT = r7;
        $VALUES = new m[]{r42, r52, r62, r7};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
