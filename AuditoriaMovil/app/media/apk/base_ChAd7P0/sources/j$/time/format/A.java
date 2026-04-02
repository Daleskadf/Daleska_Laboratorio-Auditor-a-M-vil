package j$.time.format;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class A {
    public static final A FULL;
    public static final A FULL_STANDALONE;
    public static final A NARROW;
    public static final A NARROW_STANDALONE;
    public static final A SHORT;
    public static final A SHORT_STANDALONE;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ A[] f12660a;

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f12660a.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, j$.time.format.A] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, j$.time.format.A] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, j$.time.format.A] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, j$.time.format.A] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, j$.time.format.A] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, j$.time.format.A] */
    static {
        ?? r62 = new Enum("FULL", 0);
        FULL = r62;
        ?? r7 = new Enum("FULL_STANDALONE", 1);
        FULL_STANDALONE = r7;
        ?? r8 = new Enum("SHORT", 2);
        SHORT = r8;
        ?? r9 = new Enum("SHORT_STANDALONE", 3);
        SHORT_STANDALONE = r9;
        ?? r10 = new Enum("NARROW", 4);
        NARROW = r10;
        ?? r11 = new Enum("NARROW_STANDALONE", 5);
        NARROW_STANDALONE = r11;
        f12660a = new A[]{r62, r7, r8, r9, r10, r11};
    }
}
