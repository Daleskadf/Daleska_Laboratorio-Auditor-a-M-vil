package k0;
/* renamed from: k0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1374a {

    /* renamed from: a  reason: collision with root package name */
    public int f13537a;

    /* renamed from: b  reason: collision with root package name */
    public int f13538b;

    /* renamed from: c  reason: collision with root package name */
    public float f13539c;

    /* renamed from: d  reason: collision with root package name */
    public float f13540d;

    /* renamed from: e  reason: collision with root package name */
    public long f13541e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public long f13542g;

    /* renamed from: h  reason: collision with root package name */
    public float f13543h;

    /* renamed from: i  reason: collision with root package name */
    public int f13544i;

    public final float a(long j) {
        long j8 = this.f13541e;
        if (j < j8) {
            return 0.0f;
        }
        long j9 = this.f13542g;
        if (j9 >= 0 && j >= j9) {
            float f = this.f13543h;
            return (View$OnTouchListenerC1378e.b(((float) (j - j9)) / this.f13544i, 0.0f, 1.0f) * f) + (1.0f - f);
        }
        return View$OnTouchListenerC1378e.b(((float) (j - j8)) / this.f13537a, 0.0f, 1.0f) * 0.5f;
    }
}
