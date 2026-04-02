package M3;

import R3.EnumC0328x0;
/* loaded from: classes.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f3234a;

    static {
        int[] iArr = new int[EnumC0328x0.values().length];
        f3234a = iArr;
        try {
            iArr[EnumC0328x0.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3234a[EnumC0328x0.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f3234a[EnumC0328x0.DESTROYED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
