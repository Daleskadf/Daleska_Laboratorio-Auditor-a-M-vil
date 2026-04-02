package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import b4.InterfaceC0593a;
import c4.C0632a;
import c4.InterfaceC0633b;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    public static /* synthetic */ M lambda$getComponents$0(InterfaceC0633b interfaceC0633b) {
        return new M((Context) interfaceC0633b.a(Context.class), (U3.h) interfaceC0633b.a(U3.h.class), interfaceC0633b.g(InterfaceC0593a.class), interfaceC0633b.g(Z3.b.class), new t4.j(interfaceC0633b.e(A4.b.class), interfaceC0633b.e(v4.g.class), (U3.k) interfaceC0633b.a(U3.k.class)));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C0632a> getComponents() {
        Y1.y b5 = C0632a.b(M.class);
        b5.f6698c = LIBRARY_NAME;
        b5.c(c4.j.b(U3.h.class));
        b5.c(c4.j.b(Context.class));
        b5.c(c4.j.a(v4.g.class));
        b5.c(c4.j.a(A4.b.class));
        b5.c(new c4.j(0, 2, InterfaceC0593a.class));
        b5.c(new c4.j(0, 2, Z3.b.class));
        b5.c(new c4.j(0, 0, U3.k.class));
        b5.f = new X5.L(24);
        return Arrays.asList(b5.d(), F.f.i(LIBRARY_NAME, "25.1.4"));
    }
}
