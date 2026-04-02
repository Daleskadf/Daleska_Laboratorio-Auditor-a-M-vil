package L4;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
/* loaded from: classes.dex */
public class J extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.q()) {
            try {
                arrayList.add(Integer.valueOf(aVar.v()));
            } catch (NumberFormatException e7) {
                throw new RuntimeException(e7);
            }
        }
        aVar.g();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i7 = 0; i7 < size; i7++) {
            atomicIntegerArray.set(i7, ((Integer) arrayList.get(i7)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        cVar.b();
        int length = atomicIntegerArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            cVar.u(atomicIntegerArray.get(i7));
        }
        cVar.g();
    }
}
