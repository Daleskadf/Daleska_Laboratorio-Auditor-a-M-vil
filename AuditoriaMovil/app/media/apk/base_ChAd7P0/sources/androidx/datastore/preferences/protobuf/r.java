package androidx.datastore.preferences.protobuf;
/* loaded from: classes.dex */
public abstract /* synthetic */ class r {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f7866a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f7867b;

    static {
        int[] iArr = new int[D.values().length];
        f7867b = iArr;
        try {
            iArr[D.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f7867b[D.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f7867b[D.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EnumC0541s.values().length];
        f7866a = iArr2;
        try {
            iArr2[EnumC0541s.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f7866a[EnumC0541s.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f7866a[EnumC0541s.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
