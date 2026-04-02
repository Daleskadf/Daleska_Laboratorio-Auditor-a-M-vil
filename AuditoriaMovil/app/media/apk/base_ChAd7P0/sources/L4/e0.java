package L4;

import java.util.BitSet;
/* loaded from: classes.dex */
public class e0 extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        BitSet bitSet = new BitSet();
        aVar.a();
        Q4.b D4 = aVar.D();
        int i7 = 0;
        while (D4 != Q4.b.END_ARRAY) {
            int i8 = g0.f2953a[D4.ordinal()];
            boolean z7 = true;
            if (i8 != 1 && i8 != 2) {
                if (i8 == 3) {
                    z7 = aVar.t();
                } else {
                    throw new RuntimeException("Invalid bitset value type: " + D4 + "; at path " + aVar.n());
                }
            } else {
                int v6 = aVar.v();
                if (v6 == 0) {
                    z7 = false;
                } else if (v6 != 1) {
                    StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("Invalid bitset value ", v6, ", expected 0 or 1; at path ");
                    k2.append(aVar.p());
                    throw new RuntimeException(k2.toString());
                }
            }
            if (z7) {
                bitSet.set(i7);
            }
            i7++;
            D4 = aVar.D();
        }
        aVar.g();
        return bitSet;
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        cVar.b();
        int length = bitSet.length();
        for (int i7 = 0; i7 < length; i7++) {
            cVar.u(bitSet.get(i7) ? 1L : 0L);
        }
        cVar.g();
    }
}
