package P6;

import B5.AbstractActivityC0032e;
import L5.r;
import M0.x;
import android.content.Context;
/* loaded from: classes.dex */
public class g implements H5.b, I5.a {

    /* renamed from: a  reason: collision with root package name */
    public Context f4085a;

    /* renamed from: b  reason: collision with root package name */
    public r f4086b;

    @Override // I5.a
    public final void onAttachedToActivity(I5.b bVar) {
        r rVar;
        if (this.f4085a != null) {
            this.f4085a = null;
        }
        AbstractActivityC0032e abstractActivityC0032e = ((C5.d) bVar).f571a;
        this.f4085a = abstractActivityC0032e;
        if (abstractActivityC0032e != null && (rVar = this.f4086b) != null) {
            rVar.b(new x(abstractActivityC0032e, rVar, 9, false));
        }
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
        this.f4085a = aVar.f2029a;
        r rVar = new r(aVar.f2030b, "net.nfet.printing");
        this.f4086b = rVar;
        Context context = this.f4085a;
        if (context != null) {
            rVar.b(new x(context, rVar, 9, false));
        }
    }

    @Override // I5.a
    public final void onDetachedFromActivity() {
        this.f4086b.b(null);
        this.f4085a = null;
    }

    @Override // I5.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
        this.f4086b.b(null);
        this.f4086b = null;
    }

    @Override // I5.a
    public final void onReattachedToActivityForConfigChanges(I5.b bVar) {
        r rVar;
        this.f4085a = null;
        AbstractActivityC0032e abstractActivityC0032e = ((C5.d) bVar).f571a;
        this.f4085a = abstractActivityC0032e;
        if (abstractActivityC0032e != null && (rVar = this.f4086b) != null) {
            rVar.b(new x(abstractActivityC0032e, rVar, 9, false));
        }
    }
}
