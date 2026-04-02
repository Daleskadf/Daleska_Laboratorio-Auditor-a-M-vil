package io.flutter.plugins.firebase.storage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d BYTES;
    public static final d DOWNLOAD;
    public static final d FILE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, io.flutter.plugins.firebase.storage.d] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, io.flutter.plugins.firebase.storage.d] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, io.flutter.plugins.firebase.storage.d] */
    static {
        ?? r32 = new Enum("FILE", 0);
        FILE = r32;
        ?? r42 = new Enum("BYTES", 1);
        BYTES = r42;
        ?? r52 = new Enum("DOWNLOAD", 2);
        DOWNLOAD = r52;
        $VALUES = new d[]{r32, r42, r52};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
