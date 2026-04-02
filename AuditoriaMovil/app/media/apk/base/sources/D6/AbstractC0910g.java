package d6;
/* renamed from: d6.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0910g {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f10380a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f10381b;

    static {
        int[] iArr = new int[EnumC0911h.values().length];
        f10381b = iArr;
        try {
            iArr[EnumC0911h.PLAINTEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10381b[EnumC0911h.TLS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[EnumC0909f.values().length];
        f10380a = iArr2;
        try {
            iArr2[EnumC0909f.TLS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f10380a[EnumC0909f.PLAINTEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
