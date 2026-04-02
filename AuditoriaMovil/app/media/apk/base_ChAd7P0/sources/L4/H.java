package L4;

import com.dexterous.flutterlocalnotifications.models.ScheduleMode;
import java.lang.reflect.Type;
/* loaded from: classes.dex */
public final class H extends F {

    /* renamed from: a  reason: collision with root package name */
    public final I4.p f2929a;

    /* renamed from: b  reason: collision with root package name */
    public final I4.n f2930b;

    /* renamed from: c  reason: collision with root package name */
    public final P4.a f2931c;

    /* renamed from: d  reason: collision with root package name */
    public final I4.H f2932d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2933e;
    public volatile I4.G f;

    public H(I4.p pVar, I4.n nVar, P4.a aVar, I4.H h8, boolean z7) {
        this.f2929a = pVar;
        this.f2930b = nVar;
        this.f2931c = aVar;
        this.f2932d = h8;
        this.f2933e = z7;
    }

    @Override // I4.G
    public final Object b(Q4.a aVar) {
        I4.p pVar = this.f2929a;
        if (pVar == null) {
            return e().b(aVar);
        }
        I4.q i7 = K4.d.i(aVar);
        if (this.f2933e) {
            i7.getClass();
            if (i7 instanceof I4.s) {
                return null;
            }
        }
        Type type = this.f2931c.f4023b;
        ((ScheduleMode.a) pVar).getClass();
        try {
            return ScheduleMode.valueOf(i7.h());
        } catch (Exception unused) {
            if (i7.e()) {
                return ScheduleMode.exactAllowWhileIdle;
            }
            return ScheduleMode.exact;
        }
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        e().c(cVar, obj);
    }

    @Override // L4.F
    public final I4.G d() {
        return e();
    }

    public final I4.G e() {
        I4.G g3 = this.f;
        if (g3 == null) {
            I4.G d7 = this.f2930b.d(this.f2932d, this.f2931c);
            this.f = d7;
            return d7;
        }
        return g3;
    }
}
