package V4;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final double f5969a;

    /* renamed from: b  reason: collision with root package name */
    public final double f5970b;

    /* renamed from: c  reason: collision with root package name */
    public final double f5971c;

    /* renamed from: d  reason: collision with root package name */
    public final double f5972d;

    /* renamed from: e  reason: collision with root package name */
    public final double f5973e;
    public final double f;

    public a(double d7, double d8, double d9, double d10) {
        this.f5969a = d7;
        this.f5970b = d9;
        this.f5971c = d8;
        this.f5972d = d10;
        this.f5973e = (d7 + d8) / 2.0d;
        this.f = (d9 + d10) / 2.0d;
    }

    public final boolean a(double d7, double d8) {
        if (this.f5969a <= d7 && d7 <= this.f5971c && this.f5970b <= d8 && d8 <= this.f5972d) {
            return true;
        }
        return false;
    }
}
