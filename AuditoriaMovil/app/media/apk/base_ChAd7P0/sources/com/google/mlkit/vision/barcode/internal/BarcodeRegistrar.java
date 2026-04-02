package com.google.mlkit.vision.barcode.internal;

import Y1.y;
import c4.C0632a;
import c4.j;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.firebase.components.ComponentRegistrar;
import e5.b;
import e5.d;
import e5.g;
import f5.C0993a;
import java.util.List;
import k5.C1400c;
import k5.C1402e;
/* loaded from: classes.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        y b5 = C0632a.b(C1402e.class);
        b5.c(j.b(g.class));
        b5.f = new b(20);
        C0632a d7 = b5.d();
        y b7 = C0632a.b(C1400c.class);
        b7.c(j.b(C1402e.class));
        b7.c(j.b(d.class));
        b7.c(j.b(g.class));
        b7.f = new C0993a(20);
        return zzcs.zzh(d7, b7.d());
    }
}
