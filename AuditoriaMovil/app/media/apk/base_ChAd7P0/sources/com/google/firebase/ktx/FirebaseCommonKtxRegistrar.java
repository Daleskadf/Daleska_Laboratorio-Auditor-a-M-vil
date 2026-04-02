package com.google.firebase.ktx;

import F6.B;
import V3.a;
import V3.b;
import V3.c;
import V3.d;
import Y1.y;
import androidx.annotation.Keep;
import c4.C0632a;
import c4.j;
import c4.r;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import m6.AbstractC1448i;
import z4.C2072a;
@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0632a> getComponents() {
        y a7 = C0632a.a(new r(a.class, B.class));
        a7.c(new j(new r(a.class, Executor.class), 1, 0));
        a7.f = C2072a.f16898b;
        C0632a d7 = a7.d();
        y a8 = C0632a.a(new r(c.class, B.class));
        a8.c(new j(new r(c.class, Executor.class), 1, 0));
        a8.f = C2072a.f16899c;
        C0632a d8 = a8.d();
        y a9 = C0632a.a(new r(b.class, B.class));
        a9.c(new j(new r(b.class, Executor.class), 1, 0));
        a9.f = C2072a.f16900d;
        C0632a d9 = a9.d();
        y a10 = C0632a.a(new r(d.class, B.class));
        a10.c(new j(new r(d.class, Executor.class), 1, 0));
        a10.f = C2072a.f16901e;
        return AbstractC1448i.L(d7, d8, d9, a10.d());
    }
}
