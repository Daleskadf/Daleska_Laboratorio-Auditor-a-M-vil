package w;

import androidx.camera.core.impl.EnumC0520w;
/* renamed from: w.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1898H {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f16074a;

    static {
        int[] iArr = new int[EnumC0520w.values().length];
        f16074a = iArr;
        try {
            iArr[EnumC0520w.PENDING_OPEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f16074a[EnumC0520w.OPENING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f16074a[EnumC0520w.OPEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f16074a[EnumC0520w.CONFIGURED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f16074a[EnumC0520w.CLOSING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f16074a[EnumC0520w.RELEASING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f16074a[EnumC0520w.CLOSED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f16074a[EnumC0520w.RELEASED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
