package F6;
/* loaded from: classes.dex */
public abstract /* synthetic */ class E {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f1217a;

    static {
        int[] iArr = new int[F.values().length];
        try {
            iArr[F.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[F.ATOMIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[F.UNDISPATCHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[F.LAZY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f1217a = iArr;
    }
}
