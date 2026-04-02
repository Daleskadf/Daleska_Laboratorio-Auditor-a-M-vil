package B5;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class A {
    private static final /* synthetic */ A[] $VALUES;
    public static final A BOTH;
    public static final A LEFT;
    public static final A NONE;
    public static final A RIGHT;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, B5.A] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, B5.A] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, B5.A] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, B5.A] */
    static {
        ?? r42 = new Enum("NONE", 0);
        NONE = r42;
        ?? r52 = new Enum("LEFT", 1);
        LEFT = r52;
        ?? r62 = new Enum("RIGHT", 2);
        RIGHT = r62;
        ?? r7 = new Enum("BOTH", 3);
        BOTH = r7;
        $VALUES = new A[]{r42, r52, r62, r7};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) $VALUES.clone();
    }
}
