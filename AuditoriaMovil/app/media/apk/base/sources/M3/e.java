package M3;

import R3.EnumC0324v0;
import R3.X0;
/* loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f3232a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f3233b;

    static {
        int[] iArr = new int[EnumC0324v0.values().length];
        f3233b = iArr;
        try {
            iArr[EnumC0324v0.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3233b[EnumC0324v0.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[X0.values().length];
        f3232a = iArr2;
        try {
            iArr2[X0.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f3232a[X0.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f3232a[X0.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f3232a[X0.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
