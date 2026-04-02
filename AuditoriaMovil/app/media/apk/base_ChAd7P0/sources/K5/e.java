package K5;
/* loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f2702a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f2703b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int[] f2704c;

    static {
        int[] iArr = new int[k.values().length];
        f2704c = iArr;
        try {
            iArr[k.LEAN_BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f2704c[k.IMMERSIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f2704c[k.IMMERSIVE_STICKY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f2704c[k.EDGE_TO_EDGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[l.values().length];
        f2703b = iArr2;
        try {
            iArr2[l.TOP_OVERLAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f2703b[l.BOTTOM_OVERLAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[h.values().length];
        f2702a = iArr3;
        try {
            iArr3[h.PORTRAIT_UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f2702a[h.PORTRAIT_DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f2702a[h.LANDSCAPE_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f2702a[h.LANDSCAPE_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
