package p;
/* renamed from: p.r0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1605r0 {

    /* renamed from: a  reason: collision with root package name */
    public int f14872a;

    /* renamed from: b  reason: collision with root package name */
    public int f14873b;

    /* renamed from: c  reason: collision with root package name */
    public int f14874c;

    /* renamed from: d  reason: collision with root package name */
    public int f14875d;

    /* renamed from: e  reason: collision with root package name */
    public int f14876e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14877g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14878h;

    public final void a(int i7, int i8) {
        this.f14874c = i7;
        this.f14875d = i8;
        this.f14878h = true;
        if (this.f14877g) {
            if (i8 != Integer.MIN_VALUE) {
                this.f14872a = i8;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f14873b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f14872a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f14873b = i8;
        }
    }
}
