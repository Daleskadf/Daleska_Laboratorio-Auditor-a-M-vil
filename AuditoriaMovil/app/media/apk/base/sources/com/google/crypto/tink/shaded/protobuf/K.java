package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
/* loaded from: classes.dex */
public final class K extends L {
    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final void a(Object obj, long j) {
        ((AbstractC0775b) ((C) s0.f9691c.i(obj, j))).f9632a = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final void b(Object obj, long j, Object obj2) {
        r0 r0Var = s0.f9691c;
        C c8 = (C) r0Var.i(obj, j);
        C c9 = (C) r0Var.i(obj2, j);
        int size = c8.size();
        int size2 = c9.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0775b) c8).f9632a) {
                c8 = c8.a(size2 + size);
            }
            c8.addAll(c9);
        }
        if (size > 0) {
            c9 = c8;
        }
        s0.v(obj, j, c9);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final List c(Object obj, long j) {
        int i7;
        C c8 = (C) s0.f9691c.i(obj, j);
        if (!((AbstractC0775b) c8).f9632a) {
            int size = c8.size();
            if (size == 0) {
                i7 = 10;
            } else {
                i7 = size * 2;
            }
            C a7 = c8.a(i7);
            s0.v(obj, j, a7);
            return a7;
        }
        return c8;
    }
}
