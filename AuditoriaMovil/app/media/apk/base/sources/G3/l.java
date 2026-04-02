package G3;

import R3.EnumC0301j0;
import R3.X0;
/* loaded from: classes.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f1561a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f1562b;

    static {
        int[] iArr = new int[EnumC0301j0.values().length];
        f1562b = iArr;
        try {
            iArr[EnumC0301j0.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f1562b[EnumC0301j0.SHA224.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f1562b[EnumC0301j0.SHA256.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f1562b[EnumC0301j0.SHA384.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f1562b[EnumC0301j0.SHA512.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[X0.values().length];
        f1561a = iArr2;
        try {
            iArr2[X0.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f1561a[X0.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f1561a[X0.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f1561a[X0.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
