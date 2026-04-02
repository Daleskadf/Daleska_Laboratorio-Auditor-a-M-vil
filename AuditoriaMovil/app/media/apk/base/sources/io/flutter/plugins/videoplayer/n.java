package io.flutter.plugins.videoplayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {
    private static final /* synthetic */ n[] $VALUES;
    public static final n DYNAMIC_ADAPTIVE;
    public static final n HTTP_LIVE;
    public static final n SMOOTH;
    public static final n UNKNOWN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, io.flutter.plugins.videoplayer.n] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, io.flutter.plugins.videoplayer.n] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, io.flutter.plugins.videoplayer.n] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, io.flutter.plugins.videoplayer.n] */
    static {
        ?? r42 = new Enum("UNKNOWN", 0);
        UNKNOWN = r42;
        ?? r52 = new Enum("SMOOTH", 1);
        SMOOTH = r52;
        ?? r62 = new Enum("DYNAMIC_ADAPTIVE", 2);
        DYNAMIC_ADAPTIVE = r62;
        ?? r7 = new Enum("HTTP_LIVE", 3);
        HTTP_LIVE = r7;
        $VALUES = new n[]{r42, r52, r62, r7};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
