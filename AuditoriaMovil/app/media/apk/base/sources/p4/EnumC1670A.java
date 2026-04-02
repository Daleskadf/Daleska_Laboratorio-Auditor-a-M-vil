package p4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p4.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1670A {
    private static final /* synthetic */ EnumC1670A[] $VALUES;
    public static final EnumC1670A EXISTENCE_FILTER_MISMATCH;
    public static final EnumC1670A EXISTENCE_FILTER_MISMATCH_BLOOM;
    public static final EnumC1670A LIMBO_RESOLUTION;
    public static final EnumC1670A LISTEN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, p4.A] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, p4.A] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, p4.A] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, p4.A] */
    static {
        ?? r42 = new Enum("LISTEN", 0);
        LISTEN = r42;
        ?? r52 = new Enum("EXISTENCE_FILTER_MISMATCH", 1);
        EXISTENCE_FILTER_MISMATCH = r52;
        ?? r62 = new Enum("EXISTENCE_FILTER_MISMATCH_BLOOM", 2);
        EXISTENCE_FILTER_MISMATCH_BLOOM = r62;
        ?? r7 = new Enum("LIMBO_RESOLUTION", 3);
        LIMBO_RESOLUTION = r7;
        $VALUES = new EnumC1670A[]{r42, r52, r62, r7};
    }

    public static EnumC1670A valueOf(String str) {
        return (EnumC1670A) Enum.valueOf(EnumC1670A.class, str);
    }

    public static EnumC1670A[] values() {
        return (EnumC1670A[]) $VALUES.clone();
    }
}
