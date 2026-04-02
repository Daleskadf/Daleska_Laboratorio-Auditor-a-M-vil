package v2;

import B5.AbstractActivityC0032e;
import C5.d;
import L5.r;
import android.content.Context;
import com.google.firebase.firestore.Z;
import p.C1608t;
/* renamed from: v2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1882a implements H5.b, I5.a {

    /* renamed from: a  reason: collision with root package name */
    public C1883b f16032a;

    /* renamed from: b  reason: collision with root package name */
    public r f16033b;

    /* renamed from: c  reason: collision with root package name */
    public I5.b f16034c;

    @Override // I5.a
    public final void onAttachedToActivity(I5.b bVar) {
        d dVar = (d) bVar;
        AbstractActivityC0032e abstractActivityC0032e = dVar.f571a;
        C1883b c1883b = this.f16032a;
        if (c1883b != null) {
            c1883b.f16037c = abstractActivityC0032e;
        }
        this.f16034c = bVar;
        dVar.a(c1883b);
        ((d) this.f16034c).b(this.f16032a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [c5.a, java.lang.Object] */
    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
        Context context = aVar.f2029a;
        this.f16032a = new C1883b(context);
        r rVar = new r(aVar.f2030b, "flutter.baseflow.com/permissions/methods");
        this.f16033b = rVar;
        rVar.b(new C1608t(context, new Object(), this.f16032a, new Z(23)));
    }

    @Override // I5.a
    public final void onDetachedFromActivity() {
        C1883b c1883b = this.f16032a;
        if (c1883b != null) {
            c1883b.f16037c = null;
        }
        I5.b bVar = this.f16034c;
        if (bVar != null) {
            ((d) bVar).d(c1883b);
            I5.b bVar2 = this.f16034c;
            ((d) bVar2).f573c.remove(this.f16032a);
        }
        this.f16034c = null;
    }

    @Override // I5.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
        this.f16033b.b(null);
        this.f16033b = null;
    }

    @Override // I5.a
    public final void onReattachedToActivityForConfigChanges(I5.b bVar) {
        onAttachedToActivity(bVar);
    }
}
