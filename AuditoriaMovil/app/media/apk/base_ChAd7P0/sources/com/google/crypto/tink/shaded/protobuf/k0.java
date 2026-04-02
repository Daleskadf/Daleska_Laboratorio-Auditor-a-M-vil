package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
/* loaded from: classes.dex */
public final class k0 {
    public static j0 a(Object obj) {
        AbstractC0797y abstractC0797y = (AbstractC0797y) obj;
        j0 j0Var = abstractC0797y.unknownFields;
        if (j0Var == j0.f) {
            j0 c8 = j0.c();
            abstractC0797y.unknownFields = c8;
            return c8;
        }
        return j0Var;
    }

    public static void b(Object obj) {
        ((AbstractC0797y) obj).unknownFields.f9671e = false;
    }

    public static boolean c(Object obj, K0.l lVar) {
        int i7 = lVar.f2494b;
        int i8 = i7 >>> 3;
        int i9 = i7 & 7;
        H3.d dVar = (H3.d) lVar.f2497e;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 == 4) {
                            return false;
                        }
                        if (i9 == 5) {
                            lVar.V(5);
                            ((j0) obj).d((i8 << 3) | 5, Integer.valueOf(dVar.r()));
                            return true;
                        }
                        throw F.c();
                    }
                    j0 c8 = j0.c();
                    int i10 = i8 << 3;
                    int i11 = i10 | 4;
                    while (lVar.b() != Integer.MAX_VALUE && c(c8, lVar)) {
                    }
                    if (i11 == lVar.f2494b) {
                        c8.f9671e = false;
                        ((j0) obj).d(i10 | 3, c8);
                        return true;
                    }
                    throw new IOException("Protocol message end-group tag did not match expected tag.");
                }
                ((j0) obj).d((i8 << 3) | 2, lVar.l());
                return true;
            }
            lVar.V(1);
            ((j0) obj).d((i8 << 3) | 1, Long.valueOf(dVar.s()));
            return true;
        }
        lVar.V(0);
        ((j0) obj).d(i8 << 3, Long.valueOf(dVar.v()));
        return true;
    }
}
