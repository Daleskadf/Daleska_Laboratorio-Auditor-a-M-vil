package com.google.protobuf;

import java.util.List;
/* renamed from: com.google.protobuf.d0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0835d0 extends AbstractC0837e0 {
    @Override // com.google.protobuf.AbstractC0837e0
    public final void a(Object obj, long j) {
        AbstractC0830b abstractC0830b = (AbstractC0830b) ((U) Y0.f10049c.k(obj, j));
        if (abstractC0830b.f10056a) {
            abstractC0830b.f10056a = false;
        }
    }

    @Override // com.google.protobuf.AbstractC0837e0
    public final void b(Object obj, long j, Object obj2) {
        X0 x02 = Y0.f10049c;
        U u7 = (U) x02.k(obj, j);
        U u8 = (U) x02.k(obj2, j);
        int size = u7.size();
        int size2 = u8.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0830b) u7).f10056a) {
                u7 = u7.a(size2 + size);
            }
            u7.addAll(u8);
        }
        if (size > 0) {
            u8 = u7;
        }
        Y0.s(obj, j, u8);
    }

    @Override // com.google.protobuf.AbstractC0837e0
    public final List c(Object obj, long j) {
        int i7;
        U u7 = (U) Y0.f10049c.k(obj, j);
        if (!((AbstractC0830b) u7).f10056a) {
            int size = u7.size();
            if (size == 0) {
                i7 = 10;
            } else {
                i7 = size * 2;
            }
            U a7 = u7.a(i7);
            Y0.s(obj, j, a7);
            return a7;
        }
        return u7;
    }
}
