package j$.util.stream;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.d3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1244d3 {
    public static final EnumC1244d3 DOUBLE_VALUE;
    public static final EnumC1244d3 INT_VALUE;
    public static final EnumC1244d3 LONG_VALUE;
    public static final EnumC1244d3 REFERENCE;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ EnumC1244d3[] f13239a;

    public static EnumC1244d3 valueOf(String str) {
        return (EnumC1244d3) Enum.valueOf(EnumC1244d3.class, str);
    }

    public static EnumC1244d3[] values() {
        return (EnumC1244d3[]) f13239a.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, j$.util.stream.d3] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.util.stream.d3] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, j$.util.stream.d3] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, j$.util.stream.d3] */
    static {
        ?? r42 = new Enum("REFERENCE", 0);
        REFERENCE = r42;
        ?? r52 = new Enum("INT_VALUE", 1);
        INT_VALUE = r52;
        ?? r62 = new Enum("LONG_VALUE", 2);
        LONG_VALUE = r62;
        ?? r7 = new Enum("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = r7;
        f13239a = new EnumC1244d3[]{r42, r52, r62, r7};
    }
}
