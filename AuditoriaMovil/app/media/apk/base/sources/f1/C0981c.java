package f1;

import H0.InterfaceC0131k;
import H0.r;
import K0.q;
import K0.x;
import m1.F;
import m1.G;
/* renamed from: f1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0981c implements G {

    /* renamed from: a  reason: collision with root package name */
    public final int f10985a;

    /* renamed from: b  reason: collision with root package name */
    public final r f10986b;

    /* renamed from: c  reason: collision with root package name */
    public final m1.n f10987c = new m1.n();

    /* renamed from: d  reason: collision with root package name */
    public r f10988d;

    /* renamed from: e  reason: collision with root package name */
    public G f10989e;
    public long f;

    public C0981c(int i7, int i8, r rVar) {
        this.f10985a = i8;
        this.f10986b = rVar;
    }

    @Override // m1.G
    public final void a(q qVar, int i7, int i8) {
        G g3 = this.f10989e;
        int i9 = x.f2529a;
        g3.d(i7, qVar);
    }

    @Override // m1.G
    public final int b(InterfaceC0131k interfaceC0131k, int i7, boolean z7) {
        return f(interfaceC0131k, i7, z7);
    }

    @Override // m1.G
    public final void c(r rVar) {
        r rVar2 = this.f10986b;
        if (rVar2 != null) {
            rVar = rVar.d(rVar2);
        }
        this.f10988d = rVar;
        G g3 = this.f10989e;
        int i7 = x.f2529a;
        g3.c(rVar);
    }

    @Override // m1.G
    public final /* synthetic */ void d(int i7, q qVar) {
        io.flutter.plugins.pathprovider.b.b(this, qVar, i7);
    }

    @Override // m1.G
    public final void e(long j, int i7, int i8, int i9, F f) {
        long j8 = this.f;
        if (j8 != -9223372036854775807L && j >= j8) {
            this.f10989e = this.f10987c;
        }
        G g3 = this.f10989e;
        int i10 = x.f2529a;
        g3.e(j, i7, i8, i9, f);
    }

    @Override // m1.G
    public final int f(InterfaceC0131k interfaceC0131k, int i7, boolean z7) {
        G g3 = this.f10989e;
        int i8 = x.f2529a;
        return g3.b(interfaceC0131k, i7, z7);
    }
}
