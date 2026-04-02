package com.google.mlkit.common.internal;

import Y1.y;
import c4.C0632a;
import c4.j;
import c5.C0639a;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.firestore.Z;
import d5.C0901c;
import d5.C0902d;
import e5.C0965a;
import e5.b;
import e5.d;
import e5.g;
import e5.h;
import e5.k;
import f5.C0993a;
import j6.C1372c;
import java.util.List;
import t2.i;
/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C0632a c0632a = k.f10904b;
        y b5 = C0632a.b(C0993a.class);
        b5.c(j.b(g.class));
        b5.f = new i(15);
        C0632a d7 = b5.d();
        y b7 = C0632a.b(h.class);
        b7.f = new Object();
        C0632a d8 = b7.d();
        y b8 = C0632a.b(C0902d.class);
        b8.c(new j(2, 0, C0901c.class));
        b8.f = new Object();
        C0632a d9 = b8.d();
        y b9 = C0632a.b(d.class);
        b9.c(new j(1, 1, h.class));
        b9.f = new Z(16);
        C0632a d10 = b9.d();
        y b10 = C0632a.b(C0965a.class);
        b10.f = new b(16);
        C0632a d11 = b10.d();
        y b11 = C0632a.b(b.class);
        b11.c(j.b(C0965a.class));
        b11.f = new C0993a(16);
        C0632a d12 = b11.d();
        y b12 = C0632a.b(C0639a.class);
        b12.c(j.b(g.class));
        b12.f = new C1372c(16);
        C0632a d13 = b12.d();
        y b13 = C0632a.b(C0901c.class);
        b13.f6697b = 1;
        b13.c(new j(1, 1, C0639a.class));
        b13.f = new i(16);
        return zzaf.zzi(c0632a, d7, d8, d9, d10, d11, d12, d13, b13.d());
    }
}
