package R0;

import android.net.Uri;
import e1.r;
import i1.q;
import j1.AbstractC1362a;
import java.io.IOException;
/* loaded from: classes.dex */
public final class e implements i1.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f4552a;

    public /* synthetic */ e(h hVar) {
        this.f4552a = hVar;
    }

    @Override // i1.i
    public void E(i1.k kVar, long j, long j8, boolean z7) {
        this.f4552a.w((q) kVar, j, j8);
    }

    public void a() {
        long j;
        h hVar = this.f4552a;
        synchronized (AbstractC1362a.f13420b) {
            try {
                if (AbstractC1362a.f13421c) {
                    j = AbstractC1362a.f13422d;
                } else {
                    j = -9223372036854775807L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        hVar.f4568G0 = j;
        hVar.z(true);
    }

    @Override // i1.i
    public void j(i1.k kVar, long j, long j8) {
        q qVar = (q) kVar;
        h hVar = this.f4552a;
        hVar.getClass();
        long j9 = qVar.f11432a;
        Uri uri = qVar.f11435d.f3133c;
        r rVar = new r(j8);
        hVar.f4578h0.getClass();
        hVar.f4582l0.e(rVar, qVar.f11434c);
        hVar.f4568G0 = ((Long) qVar.f).longValue() - j;
        hVar.z(true);
    }

    @Override // i1.i
    public T1.e y(i1.k kVar, long j, long j8, IOException iOException, int i7) {
        q qVar = (q) kVar;
        h hVar = this.f4552a;
        hVar.getClass();
        long j9 = qVar.f11432a;
        Uri uri = qVar.f11435d.f3133c;
        hVar.f4582l0.i(new r(j8), qVar.f11434c, iOException, true);
        hVar.f4578h0.getClass();
        hVar.x(iOException);
        return i1.n.f11428e;
    }
}
