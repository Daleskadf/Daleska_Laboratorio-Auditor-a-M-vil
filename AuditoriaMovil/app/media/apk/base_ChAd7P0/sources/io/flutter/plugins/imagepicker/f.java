package io.flutter.plugins.imagepicker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f FRONT;
    public static final f REAR;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [io.flutter.plugins.imagepicker.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [io.flutter.plugins.imagepicker.f, java.lang.Enum] */
    static {
        ?? r22 = new Enum("REAR", 0);
        REAR = r22;
        ?? r32 = new Enum("FRONT", 1);
        FRONT = r32;
        $VALUES = new f[]{r22, r32};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
