package io.flutter.plugins.imagepicker;
/* loaded from: classes.dex */
public abstract /* synthetic */ class i {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f12362a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f12363b;

    static {
        int[] iArr = new int[w.values().length];
        f12363b = iArr;
        try {
            iArr[w.GALLERY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12363b[w.CAMERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[u.values().length];
        f12362a = iArr2;
        try {
            iArr2[u.FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f12362a[u.REAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
