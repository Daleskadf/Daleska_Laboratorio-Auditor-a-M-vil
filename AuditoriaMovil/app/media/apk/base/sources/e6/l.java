package E6;

import B5.AbstractActivityC0032e;
import D.C0075z;
import D.z0;
import F6.C0100m;
import H4.W;
import X5.S;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import k7.o;
import m6.AbstractC1443d;
import m6.AbstractC1449j;
import p0.N;
import p0.O;
import r0.C1728h;
import x5.C2011m;
/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.k implements w6.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1088a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1089b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, int i7) {
        super(1);
        this.f1088a = i7;
        this.f1089b = obj;
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        switch (this.f1088a) {
            case 0:
                B6.f it = (B6.f) obj;
                kotlin.jvm.internal.j.e(it, "it");
                return m.f0((String) this.f1089b, it);
            case 1:
                Throwable th = (Throwable) obj;
                l6.j jVar = l6.j.f13876a;
                ((C0100m) this.f1089b).resumeWith(jVar);
                return jVar;
            case 2:
                Throwable th2 = (Throwable) obj;
                ((O6.h) this.f1089b).b();
                return l6.j.f13876a;
            case 3:
                C0075z cameraX = (C0075z) obj;
                R.e eVar = R.e.f4513h;
                kotlin.jvm.internal.j.d(cameraX, "cameraX");
                eVar.f4518e = cameraX;
                Context n7 = android.support.v4.media.session.a.n((AbstractActivityC0032e) this.f1089b);
                kotlin.jvm.internal.j.d(n7, "getApplicationContext(context)");
                eVar.f = n7;
                return eVar;
            case 4:
                Void r42 = (Void) obj;
                return ((C0075z) this.f1089b).j;
            case 5:
                ((w6.l) this.f1089b).invoke(new S(((l6.f) obj).f13868a));
                return l6.j.f13876a;
            case 6:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                o oVar = (o) this.f1089b;
                if (booleanValue) {
                    k7.h hVar = oVar.f13772e;
                    if (hVar != null) {
                        hVar.c();
                    }
                } else {
                    oVar.d();
                }
                return l6.j.f13876a;
            case 7:
                if (obj == ((AbstractC1443d) this.f1089b)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 8:
                Throwable th3 = (Throwable) obj;
                N n8 = (N) this.f1089b;
                if (th3 != null) {
                    n8.f14955Y.o(new O(th3));
                }
                if (n8.f14962e0.f13870b != l6.i.f13875a) {
                    ((C1728h) n8.f14962e0.a()).close();
                }
                return l6.j.f13876a;
            case 9:
                List<i5.f> barcodes = (List) obj;
                kotlin.jvm.internal.j.d(barcodes, "barcodes");
                ArrayList arrayList = new ArrayList(AbstractC1449j.M(barcodes));
                for (i5.f barcode : barcodes) {
                    kotlin.jvm.internal.j.d(barcode, "barcode");
                    arrayList.add(W.n(barcode));
                }
                ((C2011m) this.f1089b).invoke(arrayList);
                return l6.j.f13876a;
            case 10:
                Integer state = (Integer) obj;
                kotlin.jvm.internal.j.d(state, "state");
                ((C2011m) this.f1089b).invoke(state);
                return l6.j.f13876a;
            default:
                ((C2011m) this.f1089b).invoke(Double.valueOf(((z0) obj).c()));
                return l6.j.f13876a;
        }
    }
}
