package androidx.camera.core.impl;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class A0 {
    private static final /* synthetic */ A0[] $VALUES;
    public static final A0 IMAGE_ANALYSIS;
    public static final A0 IMAGE_CAPTURE;
    public static final A0 METERING_REPEATING;
    public static final A0 PREVIEW;
    public static final A0 STREAM_SHARING;
    public static final A0 VIDEO_CAPTURE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, androidx.camera.core.impl.A0] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, androidx.camera.core.impl.A0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, androidx.camera.core.impl.A0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, androidx.camera.core.impl.A0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.camera.core.impl.A0] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.camera.core.impl.A0] */
    static {
        ?? r62 = new Enum("IMAGE_CAPTURE", 0);
        IMAGE_CAPTURE = r62;
        ?? r7 = new Enum("PREVIEW", 1);
        PREVIEW = r7;
        ?? r8 = new Enum("IMAGE_ANALYSIS", 2);
        IMAGE_ANALYSIS = r8;
        ?? r9 = new Enum("VIDEO_CAPTURE", 3);
        VIDEO_CAPTURE = r9;
        ?? r10 = new Enum("STREAM_SHARING", 4);
        STREAM_SHARING = r10;
        ?? r11 = new Enum("METERING_REPEATING", 5);
        METERING_REPEATING = r11;
        $VALUES = new A0[]{r62, r7, r8, r9, r10, r11};
    }

    public static A0 valueOf(String str) {
        return (A0) Enum.valueOf(A0.class, str);
    }

    public static A0[] values() {
        return (A0[]) $VALUES.clone();
    }
}
