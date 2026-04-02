package io.flutter.plugins.firebase.firestore;
/* renamed from: io.flutter.plugins.firebase.firestore.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1161f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f11919a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f11920b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int[] f11921c;

    static {
        int[] iArr = new int[t.values().length];
        f11921c = iArr;
        try {
            iArr[t.ENABLE_INDEX_AUTO_CREATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11921c[t.DISABLE_INDEX_AUTO_CREATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11921c[t.DELETE_ALL_INDEXES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[E.values().length];
        f11920b = iArr2;
        try {
            iArr2[E.DELETE_TYPE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f11920b[E.UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f11920b[E.SET.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[l.values().length];
        f11919a = iArr3;
        try {
            iArr3[l.COUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f11919a[l.SUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f11919a[l.AVERAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
