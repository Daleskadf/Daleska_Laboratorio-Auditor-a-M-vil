package z5;

import K5.h;
/* renamed from: z5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2073a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f16903a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.PORTRAIT_UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.PORTRAIT_DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.LANDSCAPE_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.LANDSCAPE_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f16903a = iArr;
    }
}
