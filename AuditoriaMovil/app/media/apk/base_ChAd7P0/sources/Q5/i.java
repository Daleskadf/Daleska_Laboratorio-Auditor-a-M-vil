package Q5;

import io.flutter.plugins.firebase.firestore.E;
/* loaded from: classes.dex */
public abstract /* synthetic */ class i {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f4441a;

    static {
        int[] iArr = new int[E.values().length];
        f4441a = iArr;
        try {
            iArr[E.DELETE_TYPE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4441a[E.UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f4441a[E.SET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
