package w;

import androidx.camera.core.impl.A0;
/* renamed from: w.Z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1915Z {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f16168a;

    static {
        int[] iArr = new int[A0.values().length];
        f16168a = iArr;
        try {
            iArr[A0.IMAGE_CAPTURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f16168a[A0.VIDEO_CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f16168a[A0.STREAM_SHARING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f16168a[A0.PREVIEW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f16168a[A0.IMAGE_ANALYSIS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
