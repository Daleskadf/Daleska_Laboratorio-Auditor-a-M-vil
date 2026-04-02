package N3;

import R3.EnumC0301j0;
/* loaded from: classes.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f3428a;

    static {
        int[] iArr = new int[EnumC0301j0.values().length];
        f3428a = iArr;
        try {
            iArr[EnumC0301j0.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3428a[EnumC0301j0.SHA224.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f3428a[EnumC0301j0.SHA256.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f3428a[EnumC0301j0.SHA384.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f3428a[EnumC0301j0.SHA512.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
