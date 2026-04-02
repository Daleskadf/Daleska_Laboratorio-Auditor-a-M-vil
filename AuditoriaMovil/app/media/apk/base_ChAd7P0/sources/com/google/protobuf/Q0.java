package com.google.protobuf;

import java.io.IOException;
/* loaded from: classes.dex */
public final class Q0 {
    public static P0 a(Object obj) {
        J j = (J) obj;
        P0 p02 = j.unknownFields;
        if (p02 == P0.f) {
            P0 c8 = P0.c();
            j.unknownFields = c8;
            return c8;
        }
        return p02;
    }

    public static void b(Object obj) {
        P0 p02 = ((J) obj).unknownFields;
        if (p02.f10029e) {
            p02.f10029e = false;
        }
    }

    public static boolean c(int i7, K0.l lVar, Object obj) {
        int i8 = lVar.f2494b;
        int i9 = i8 >>> 3;
        int i10 = i8 & 7;
        J6.b bVar = (J6.b) lVar.f2497e;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return false;
                        }
                        if (i10 == 5) {
                            lVar.V(5);
                            ((P0) obj).d(5 | (i9 << 3), Integer.valueOf(bVar.o()));
                            return true;
                        }
                        throw X.d();
                    }
                    P0 c8 = P0.c();
                    int i11 = i9 << 3;
                    int i12 = i11 | 4;
                    int i13 = i7 + 1;
                    if (i13 < 100) {
                        while (lVar.b() != Integer.MAX_VALUE && c(i13, lVar, c8)) {
                        }
                        if (i12 == lVar.f2494b) {
                            if (c8.f10029e) {
                                c8.f10029e = false;
                            }
                            ((P0) obj).d(i11 | 3, c8);
                            return true;
                        }
                        throw X.a();
                    }
                    throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                ((P0) obj).d((i9 << 3) | 2, lVar.m());
                return true;
            }
            lVar.V(1);
            ((P0) obj).d((i9 << 3) | 1, Long.valueOf(bVar.p()));
            return true;
        }
        lVar.V(0);
        ((P0) obj).d(i9 << 3, Long.valueOf(bVar.t()));
        return true;
    }
}
