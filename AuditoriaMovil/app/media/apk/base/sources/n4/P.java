package n4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class P {
    private static final /* synthetic */ P[] $VALUES;
    public static final P Argument;
    public static final P ArrayArgument;
    public static final P MergeSet;
    public static final P Set;
    public static final P Update;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, n4.P] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, n4.P] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, n4.P] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, n4.P] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, n4.P] */
    static {
        ?? r52 = new Enum("Set", 0);
        Set = r52;
        ?? r62 = new Enum("MergeSet", 1);
        MergeSet = r62;
        ?? r7 = new Enum("Update", 2);
        Update = r7;
        ?? r8 = new Enum("Argument", 3);
        Argument = r8;
        ?? r9 = new Enum("ArrayArgument", 4);
        ArrayArgument = r9;
        $VALUES = new P[]{r52, r62, r7, r8, r9};
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    public static P[] values() {
        return (P[]) $VALUES.clone();
    }
}
