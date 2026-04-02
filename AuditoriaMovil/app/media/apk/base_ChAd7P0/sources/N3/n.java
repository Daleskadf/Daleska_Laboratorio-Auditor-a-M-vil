package N3;

import R3.EnumC0301j0;
import R3.X0;
/* loaded from: classes.dex */
public abstract /* synthetic */ class n {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f3433a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f3434b;

    static {
        int[] iArr = new int[X0.values().length];
        f3434b = iArr;
        try {
            iArr[X0.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3434b[X0.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f3434b[X0.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f3434b[X0.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[EnumC0301j0.values().length];
        f3433a = iArr2;
        try {
            iArr2[EnumC0301j0.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f3433a[EnumC0301j0.SHA224.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f3433a[EnumC0301j0.SHA256.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f3433a[EnumC0301j0.SHA384.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f3433a[EnumC0301j0.SHA512.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
