package androidx.camera.core.impl;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t0 {
    private static final /* synthetic */ t0[] $VALUES;
    public static final t0 JPEG;
    public static final t0 JPEG_R;
    public static final t0 PRIV;
    public static final t0 RAW;
    public static final t0 YUV;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.camera.core.impl.t0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.camera.core.impl.t0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.camera.core.impl.t0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.camera.core.impl.t0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.camera.core.impl.t0, java.lang.Enum] */
    static {
        ?? r52 = new Enum("PRIV", 0);
        PRIV = r52;
        ?? r62 = new Enum("YUV", 1);
        YUV = r62;
        ?? r7 = new Enum("JPEG", 2);
        JPEG = r7;
        ?? r8 = new Enum("JPEG_R", 3);
        JPEG_R = r8;
        ?? r9 = new Enum("RAW", 4);
        RAW = r9;
        $VALUES = new t0[]{r52, r62, r7, r8, r9};
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) $VALUES.clone();
    }
}
