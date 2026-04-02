package androidx.lifecycle;
/* renamed from: androidx.lifecycle.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0559k {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f7939a;

    static {
        int[] iArr = new int[EnumC0563o.values().length];
        try {
            iArr[EnumC0563o.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC0563o.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC0563o.RESUMED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC0563o.DESTROYED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC0563o.INITIALIZED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f7939a = iArr;
    }
}
