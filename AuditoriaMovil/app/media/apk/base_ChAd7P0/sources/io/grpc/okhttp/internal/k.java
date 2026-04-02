package io.grpc.okhttp.internal;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k ALPN_AND_NPN;
    public static final k NONE;
    public static final k NPN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, io.grpc.okhttp.internal.k] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, io.grpc.okhttp.internal.k] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, io.grpc.okhttp.internal.k] */
    static {
        ?? r32 = new Enum("ALPN_AND_NPN", 0);
        ALPN_AND_NPN = r32;
        ?? r42 = new Enum("NPN", 1);
        NPN = r42;
        ?? r52 = new Enum("NONE", 2);
        NONE = r52;
        $VALUES = new k[]{r32, r42, r52};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
