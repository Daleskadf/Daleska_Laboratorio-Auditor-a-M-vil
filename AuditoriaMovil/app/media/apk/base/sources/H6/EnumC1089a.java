package h6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1089a {
    private static final /* synthetic */ EnumC1089a[] $VALUES;
    public static final EnumC1089a ASYNC;
    public static final EnumC1089a BLOCKING;
    public static final EnumC1089a FUTURE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [h6.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [h6.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [h6.a, java.lang.Enum] */
    static {
        ?? r32 = new Enum("BLOCKING", 0);
        BLOCKING = r32;
        ?? r42 = new Enum("FUTURE", 1);
        FUTURE = r42;
        ?? r52 = new Enum("ASYNC", 2);
        ASYNC = r52;
        $VALUES = new EnumC1089a[]{r32, r42, r52};
    }

    public static EnumC1089a valueOf(String str) {
        return (EnumC1089a) Enum.valueOf(EnumC1089a.class, str);
    }

    public static EnumC1089a[] values() {
        return (EnumC1089a[]) $VALUES.clone();
    }
}
