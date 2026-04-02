package Q;

import androidx.camera.core.impl.C0505g;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.m0;
import androidx.camera.core.impl.o0;
import androidx.camera.core.impl.y0;
import h3.AbstractC1079a;
import java.util.Iterator;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements l0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f4096a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f4097b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f4098c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ y0 f4099d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0505g f4100e;
    public final /* synthetic */ C0505g f;

    public /* synthetic */ c(d dVar, String str, String str2, y0 y0Var, C0505g c0505g, C0505g c0505g2) {
        this.f4096a = dVar;
        this.f4097b = str;
        this.f4098c = str2;
        this.f4099d = y0Var;
        this.f4100e = c0505g;
        this.f = c0505g2;
    }

    @Override // androidx.camera.core.impl.l0
    public final void a(o0 o0Var, m0 m0Var) {
        d dVar = this.f4096a;
        if (dVar.b() != null) {
            dVar.B();
            dVar.A(dVar.C(this.f4097b, this.f4098c, this.f4099d, this.f4100e, this.f));
            dVar.n();
            g gVar = dVar.f4103p;
            gVar.getClass();
            AbstractC1079a.e();
            Iterator it = gVar.f4122a.iterator();
            while (it.hasNext()) {
                gVar.i((D.y0) it.next());
            }
        }
    }
}
