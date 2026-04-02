package X5;
/* loaded from: classes.dex */
public abstract /* synthetic */ class T {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f6437a;

    static {
        int[] iArr = new int[V.values().length];
        f6437a = iArr;
        try {
            iArr[V.DATE_INVALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6437a[V.EXPIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6437a[V.ID_MISMATCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6437a[V.INVALID.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6437a[V.NOT_YET_VALID.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f6437a[V.UNTRUSTED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f6437a[V.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
