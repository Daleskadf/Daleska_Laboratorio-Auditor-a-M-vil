package j$.util.stream;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class D3 {
    public static final D3 MAYBE_MORE;
    public static final D3 NO_MORE;
    public static final D3 UNLIMITED;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ D3[] f13035a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j$.util.stream.D3] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, j$.util.stream.D3] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.util.stream.D3] */
    static {
        ?? r32 = new Enum("NO_MORE", 0);
        NO_MORE = r32;
        ?? r42 = new Enum("MAYBE_MORE", 1);
        MAYBE_MORE = r42;
        ?? r52 = new Enum("UNLIMITED", 2);
        UNLIMITED = r52;
        f13035a = new D3[]{r32, r42, r52};
    }

    public static D3 valueOf(String str) {
        return (D3) Enum.valueOf(D3.class, str);
    }

    public static D3[] values() {
        return (D3[]) f13035a.clone();
    }
}
