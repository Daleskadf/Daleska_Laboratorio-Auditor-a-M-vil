package c6;

import a6.EnumC0486o;
/* renamed from: c6.y1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0722y1 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f9057a;

    static {
        int[] iArr = new int[EnumC0486o.values().length];
        f9057a = iArr;
        try {
            iArr[EnumC0486o.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f9057a[EnumC0486o.CONNECTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f9057a[EnumC0486o.READY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f9057a[EnumC0486o.TRANSIENT_FAILURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
