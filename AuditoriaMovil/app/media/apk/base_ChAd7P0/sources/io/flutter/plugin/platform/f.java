package io.flutter.plugin.platform;
/* loaded from: classes.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f11695a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f11696b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int[] f11697c;

    static {
        int[] iArr = new int[K5.f.values().length];
        f11697c = iArr;
        try {
            iArr[K5.f.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11697c[K5.f.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[K5.l.values().length];
        f11696b = iArr2;
        try {
            iArr2[K5.l.TOP_OVERLAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f11696b[K5.l.BOTTOM_OVERLAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr3 = new int[K5.i.values().length];
        f11695a = iArr3;
        try {
            iArr3[K5.i.STANDARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f11695a[K5.i.LIGHT_IMPACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f11695a[K5.i.MEDIUM_IMPACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f11695a[K5.i.HEAVY_IMPACT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f11695a[K5.i.SELECTION_CLICK.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
