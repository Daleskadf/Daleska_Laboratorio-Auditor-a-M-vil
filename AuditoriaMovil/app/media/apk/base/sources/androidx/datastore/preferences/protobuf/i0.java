package androidx.datastore.preferences.protobuf;

import java.io.IOException;
/* loaded from: classes.dex */
public final class i0 {
    public static h0 a(Object obj) {
        AbstractC0547y abstractC0547y = (AbstractC0547y) obj;
        h0 h0Var = abstractC0547y.unknownFields;
        if (h0Var == h0.f) {
            h0 h0Var2 = new h0(0, new int[8], new Object[8], true);
            abstractC0547y.unknownFields = h0Var2;
            return h0Var2;
        }
        return h0Var;
    }

    public static void b(Object obj) {
        h0 h0Var = ((AbstractC0547y) obj).unknownFields;
        if (h0Var.f7832e) {
            h0Var.f7832e = false;
        }
    }

    public static boolean c(int i7, K0.l lVar, Object obj) {
        int i8 = lVar.f2494b;
        int i9 = i8 >>> 3;
        int i10 = i8 & 7;
        H3.d dVar = (H3.d) lVar.f2497e;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return false;
                        }
                        if (i10 == 5) {
                            lVar.V(5);
                            ((h0) obj).c(5 | (i9 << 3), Integer.valueOf(dVar.r()));
                            return true;
                        }
                        throw C.b();
                    }
                    h0 h0Var = new h0(0, new int[8], new Object[8], true);
                    int i11 = i9 << 3;
                    int i12 = i11 | 4;
                    int i13 = i7 + 1;
                    if (i13 < 100) {
                        while (lVar.b() != Integer.MAX_VALUE && c(i13, lVar, h0Var)) {
                        }
                        if (i12 == lVar.f2494b) {
                            if (h0Var.f7832e) {
                                h0Var.f7832e = false;
                            }
                            ((h0) obj).c(i11 | 3, h0Var);
                            return true;
                        }
                        throw new IOException("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                ((h0) obj).c((i9 << 3) | 2, lVar.k());
                return true;
            }
            lVar.V(1);
            ((h0) obj).c((i9 << 3) | 1, Long.valueOf(dVar.s()));
            return true;
        }
        lVar.V(0);
        ((h0) obj).c(i9 << 3, Long.valueOf(dVar.v()));
        return true;
    }
}
