package I4;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
/* loaded from: classes.dex */
public final class l extends G {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2206a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ G f2207b;

    public /* synthetic */ l(G g3, int i7) {
        this.f2206a = i7;
        this.f2207b = g3;
    }

    @Override // I4.G
    public final Object b(Q4.a aVar) {
        switch (this.f2206a) {
            case 0:
                return new AtomicLong(((Number) this.f2207b.b(aVar)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.q()) {
                    arrayList.add(Long.valueOf(((Number) this.f2207b.b(aVar)).longValue()));
                }
                aVar.g();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i7 = 0; i7 < size; i7++) {
                    atomicLongArray.set(i7, ((Long) arrayList.get(i7)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        switch (this.f2206a) {
            case 0:
                this.f2207b.c(cVar, Long.valueOf(((AtomicLong) obj).get()));
                return;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                cVar.b();
                int length = atomicLongArray.length();
                for (int i7 = 0; i7 < length; i7++) {
                    this.f2207b.c(cVar, Long.valueOf(atomicLongArray.get(i7)));
                }
                cVar.g();
                return;
        }
    }
}
