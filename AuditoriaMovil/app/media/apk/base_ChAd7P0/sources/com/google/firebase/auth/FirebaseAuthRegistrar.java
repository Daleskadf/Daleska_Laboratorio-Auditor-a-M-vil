package com.google.firebase.auth;

import F.f;
import F3.o;
import U3.h;
import V3.a;
import V3.c;
import V3.d;
import Y1.y;
import Z3.b;
import androidx.annotation.Keep;
import b4.InterfaceC0593a;
import c4.C0632a;
import c4.InterfaceC0633b;
import c4.j;
import c4.r;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import v4.e;
import w4.InterfaceC1956b;
@Keep
/* loaded from: classes.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static FirebaseAuth lambda$getComponents$0(r rVar, r rVar2, r rVar3, r rVar4, r rVar5, InterfaceC0633b interfaceC0633b) {
        InterfaceC1956b e7 = interfaceC0633b.e(b.class);
        InterfaceC1956b e8 = interfaceC0633b.e(e.class);
        Executor executor = (Executor) interfaceC0633b.b(rVar);
        return new FirebaseAuth((h) interfaceC0633b.a(h.class), e7, e8, (Executor) interfaceC0633b.b(rVar2), (Executor) interfaceC0633b.b(rVar3), (ScheduledExecutorService) interfaceC0633b.b(rVar4), (Executor) interfaceC0633b.b(rVar5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C0632a> getComponents() {
        r rVar = new r(a.class, Executor.class);
        r rVar2 = new r(V3.b.class, Executor.class);
        r rVar3 = new r(c.class, Executor.class);
        r rVar4 = new r(c.class, ScheduledExecutorService.class);
        r rVar5 = new r(d.class, Executor.class);
        y yVar = new y(FirebaseAuth.class, new Class[]{InterfaceC0593a.class});
        yVar.c(j.b(h.class));
        yVar.c(new j(1, 1, e.class));
        yVar.c(new j(rVar, 1, 0));
        yVar.c(new j(rVar2, 1, 0));
        yVar.c(new j(rVar3, 1, 0));
        yVar.c(new j(rVar4, 1, 0));
        yVar.c(new j(rVar5, 1, 0));
        yVar.c(j.a(b.class));
        o oVar = new o(7);
        oVar.f1178b = rVar;
        oVar.f1179c = rVar2;
        oVar.f1180d = rVar3;
        oVar.f1181e = rVar4;
        oVar.f = rVar5;
        yVar.f = oVar;
        C0632a d7 = yVar.d();
        Object obj = new Object();
        y b5 = C0632a.b(v4.d.class);
        b5.f6697b = 1;
        b5.f = new P0.c(obj);
        return Arrays.asList(d7, b5.d(), f.i("fire-auth", "23.2.0"));
    }
}
