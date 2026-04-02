package io.flutter.plugins.imagepicker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a IMAGE;
    public static final a VIDEO;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, io.flutter.plugins.imagepicker.a] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, io.flutter.plugins.imagepicker.a] */
    static {
        ?? r22 = new Enum("IMAGE", 0);
        IMAGE = r22;
        ?? r32 = new Enum("VIDEO", 1);
        VIDEO = r32;
        $VALUES = new a[]{r22, r32};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
