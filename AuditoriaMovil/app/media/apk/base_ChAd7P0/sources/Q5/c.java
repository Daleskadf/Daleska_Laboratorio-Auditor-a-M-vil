package Q5;

import android.location.Location;
import com.baseflow.geolocator.GeolocatorLocationService;
import s2.InterfaceC1765a;
import t2.s;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements s, InterfaceC1765a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4424a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ L5.h f4425b;

    public /* synthetic */ c(L5.h hVar, int i7) {
        this.f4424a = i7;
        this.f4425b = hVar;
    }

    @Override // s2.InterfaceC1765a
    public void a(s2.b bVar) {
        L5.h hVar = this.f4425b;
        switch (this.f4424a) {
            case 2:
                int i7 = GeolocatorLocationService.f9062f0;
                hVar.b(bVar.toString(), bVar.a(), null);
                return;
            default:
                hVar.b(bVar.toString(), bVar.a(), null);
                return;
        }
    }

    @Override // t2.s
    public void b(Location location) {
        L5.h hVar = this.f4425b;
        switch (this.f4424a) {
            case 1:
                int i7 = GeolocatorLocationService.f9062f0;
                hVar.c(G.i.J(location));
                return;
            default:
                hVar.c(G.i.J(location));
                return;
        }
    }
}
