package c6;

import a6.EnumC0486o;
/* renamed from: c6.r1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0701r1 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f8970a;

    static {
        int[] iArr = new int[EnumC0486o.values().length];
        f8970a = iArr;
        try {
            iArr[EnumC0486o.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f8970a[EnumC0486o.CONNECTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f8970a[EnumC0486o.READY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f8970a[EnumC0486o.TRANSIENT_FAILURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f8970a[EnumC0486o.SHUTDOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
