package androidx.camera.core.impl;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class F {
    private static final /* synthetic */ F[] $VALUES;
    public static final F ALWAYS_OVERRIDE;
    public static final F HIGH_PRIORITY_REQUIRED;
    public static final F OPTIONAL;
    public static final F REQUIRED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, androidx.camera.core.impl.F] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, androidx.camera.core.impl.F] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, androidx.camera.core.impl.F] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, androidx.camera.core.impl.F] */
    static {
        ?? r42 = new Enum("ALWAYS_OVERRIDE", 0);
        ALWAYS_OVERRIDE = r42;
        ?? r52 = new Enum("HIGH_PRIORITY_REQUIRED", 1);
        HIGH_PRIORITY_REQUIRED = r52;
        ?? r62 = new Enum("REQUIRED", 2);
        REQUIRED = r62;
        ?? r7 = new Enum("OPTIONAL", 3);
        OPTIONAL = r7;
        $VALUES = new F[]{r42, r52, r62, r7};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) $VALUES.clone();
    }
}
