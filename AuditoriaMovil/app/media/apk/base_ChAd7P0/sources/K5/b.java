package K5;
/* loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f2696a;

    static {
        int[] iArr = new int[c.values().length];
        f2696a = iArr;
        try {
            iArr[c.RESUMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f2696a[c.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f2696a[c.HIDDEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f2696a[c.PAUSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f2696a[c.DETACHED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
