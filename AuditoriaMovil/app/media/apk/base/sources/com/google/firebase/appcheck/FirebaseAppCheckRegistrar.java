package com.google.firebase.appcheck;

import F.f;
import U3.h;
import V3.a;
import V3.b;
import V3.c;
import V3.d;
import Y1.y;
import c4.C0632a;
import c4.j;
import c4.r;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import v4.e;
/* loaded from: classes.dex */
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        boolean z7;
        r rVar = new r(d.class, Executor.class);
        r rVar2 = new r(c.class, Executor.class);
        r rVar3 = new r(a.class, Executor.class);
        r rVar4 = new r(b.class, ScheduledExecutorService.class);
        y yVar = new y(X3.d.class, new Class[]{Z3.b.class});
        yVar.f6698c = "fire-app-check";
        yVar.c(j.b(h.class));
        yVar.c(new j(rVar, 1, 0));
        yVar.c(new j(rVar2, 1, 0));
        yVar.c(new j(rVar3, 1, 0));
        yVar.c(new j(rVar4, 1, 0));
        yVar.c(j.a(e.class));
        yVar.f = new W3.a(rVar, rVar2, rVar3, rVar4);
        if (yVar.f6696a == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            yVar.f6696a = 1;
            C0632a d7 = yVar.d();
            Object obj = new Object();
            y b5 = C0632a.b(v4.d.class);
            b5.f6697b = 1;
            b5.f = new P0.c(obj);
            return Arrays.asList(d7, b5.d(), f.i("fire-app-check", "18.0.0"));
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
