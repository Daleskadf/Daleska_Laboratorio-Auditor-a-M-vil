package n4;
/* renamed from: n4.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1522h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f14340a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f14341b;

    static {
        int[] iArr = new int[EnumC1524j.values().length];
        f14341b = iArr;
        try {
            iArr[EnumC1524j.TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f14341b[EnumC1524j.TERMINATE_LOCAL_LISTEN_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f14341b[EnumC1524j.REQUIRE_WATCH_DISCONNECTION_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EnumC1525k.values().length];
        f14340a = iArr2;
        try {
            iArr2[EnumC1525k.INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f14340a[EnumC1525k.INITIALIZE_LOCAL_LISTEN_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f14340a[EnumC1525k.REQUIRE_WATCH_CONNECTION_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
