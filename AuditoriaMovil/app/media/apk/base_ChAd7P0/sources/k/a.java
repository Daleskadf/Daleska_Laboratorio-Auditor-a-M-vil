package K;

import A.n;
import C5.e;
import D.j0;
import K1.d;
import X0.y;
import android.media.MediaCodec;
import androidx.camera.core.impl.C0503e;
import java.util.Comparator;
import java.util.Map;
import n4.C1521g;
import n4.D;
import u4.u;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2461a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2462b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f2461a = i7;
        this.f2462b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7;
        switch (this.f2461a) {
            case 0:
                C0503e c0503e = (C0503e) obj2;
                ((n) this.f2462b).getClass();
                Class cls = ((C0503e) obj).f7616a.j;
                int i8 = 1;
                if (cls == MediaCodec.class) {
                    i7 = 2;
                } else if (cls == j0.class) {
                    i7 = 0;
                } else {
                    i7 = 1;
                }
                Class cls2 = c0503e.f7616a.j;
                if (cls2 == MediaCodec.class) {
                    i8 = 2;
                } else if (cls2 == j0.class) {
                    i8 = 0;
                }
                return i7 - i8;
            case 1:
                y yVar = (y) this.f2462b;
                return yVar.a(obj2) - yVar.a(obj);
            case 2:
                C1521g c1521g = (C1521g) obj;
                C1521g c1521g2 = (C1521g) obj2;
                e eVar = (e) this.f2462b;
                eVar.getClass();
                int d7 = u.d(e.d(c1521g), e.d(c1521g2));
                if (d7 == 0) {
                    return ((D) eVar.f578b).a().compare(c1521g.f14339b, c1521g2.f14339b);
                }
                return d7;
            case 3:
                q4.n nVar = (q4.n) obj;
                q4.n nVar2 = (q4.n) obj2;
                int compare = ((Q.a) this.f2462b).compare(nVar, nVar2);
                if (compare == 0) {
                    return nVar.f15362a.compareTo(nVar2.f15362a);
                }
                return compare;
            default:
                return ((d) this.f2462b).compare(((Map.Entry) obj).getValue(), ((Map.Entry) obj2).getValue());
        }
    }
}
