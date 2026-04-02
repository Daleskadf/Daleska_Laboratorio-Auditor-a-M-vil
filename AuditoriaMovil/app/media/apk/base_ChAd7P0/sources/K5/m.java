package K5;

import android.location.Location;
import s2.InterfaceC1765a;
/* loaded from: classes.dex */
public final /* synthetic */ class m implements InterfaceC1765a, t2.s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2705a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f2706b;

    public /* synthetic */ m(r rVar, int i7) {
        this.f2705a = i7;
        this.f2706b = rVar;
    }

    @Override // s2.InterfaceC1765a
    public void a(s2.b bVar) {
        switch (this.f2705a) {
            case 2:
                this.f2706b.b(null, bVar.toString(), bVar.a());
                return;
            default:
                this.f2706b.b(null, bVar.toString(), bVar.a());
                return;
        }
    }

    @Override // t2.s
    public void b(Location location) {
        this.f2706b.a(G.i.J(location));
    }
}
