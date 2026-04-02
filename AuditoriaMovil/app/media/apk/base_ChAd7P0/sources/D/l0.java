package D;
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: d  reason: collision with root package name */
    public static final l0 f738d = new l0(0, false, false);

    /* renamed from: e  reason: collision with root package name */
    public static final l0 f739e = new l0(500, true, false);
    public static final l0 f;

    /* renamed from: a  reason: collision with root package name */
    public final long f740a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f741b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f742c;

    static {
        new l0(100L, true, false);
        f = new l0(0L, false, true);
    }

    public l0(long j, boolean z7, boolean z8) {
        this.f741b = z7;
        this.f740a = j;
        if (z8) {
            g0.c.a("shouldRetry must be false when completeWithoutFailure is set to true", !z7);
        }
        this.f742c = z8;
    }
}
