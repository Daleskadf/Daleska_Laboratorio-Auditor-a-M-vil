package P1;

import android.text.Layout;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public String f3992a;

    /* renamed from: b  reason: collision with root package name */
    public int f3993b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3994c;

    /* renamed from: d  reason: collision with root package name */
    public int f3995d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3996e;

    /* renamed from: k  reason: collision with root package name */
    public float f4000k;

    /* renamed from: l  reason: collision with root package name */
    public String f4001l;

    /* renamed from: o  reason: collision with root package name */
    public Layout.Alignment f4004o;

    /* renamed from: p  reason: collision with root package name */
    public Layout.Alignment f4005p;

    /* renamed from: r  reason: collision with root package name */
    public b f4007r;
    public int f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f3997g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f3998h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f3999i = -1;
    public int j = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f4002m = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f4003n = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f4006q = -1;

    /* renamed from: s  reason: collision with root package name */
    public float f4008s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f3994c && gVar.f3994c) {
                this.f3993b = gVar.f3993b;
                this.f3994c = true;
            }
            if (this.f3998h == -1) {
                this.f3998h = gVar.f3998h;
            }
            if (this.f3999i == -1) {
                this.f3999i = gVar.f3999i;
            }
            if (this.f3992a == null && (str = gVar.f3992a) != null) {
                this.f3992a = str;
            }
            if (this.f == -1) {
                this.f = gVar.f;
            }
            if (this.f3997g == -1) {
                this.f3997g = gVar.f3997g;
            }
            if (this.f4003n == -1) {
                this.f4003n = gVar.f4003n;
            }
            if (this.f4004o == null && (alignment2 = gVar.f4004o) != null) {
                this.f4004o = alignment2;
            }
            if (this.f4005p == null && (alignment = gVar.f4005p) != null) {
                this.f4005p = alignment;
            }
            if (this.f4006q == -1) {
                this.f4006q = gVar.f4006q;
            }
            if (this.j == -1) {
                this.j = gVar.j;
                this.f4000k = gVar.f4000k;
            }
            if (this.f4007r == null) {
                this.f4007r = gVar.f4007r;
            }
            if (this.f4008s == Float.MAX_VALUE) {
                this.f4008s = gVar.f4008s;
            }
            if (!this.f3996e && gVar.f3996e) {
                this.f3995d = gVar.f3995d;
                this.f3996e = true;
            }
            if (this.f4002m == -1 && (i7 = gVar.f4002m) != -1) {
                this.f4002m = i7;
            }
        }
    }
}
