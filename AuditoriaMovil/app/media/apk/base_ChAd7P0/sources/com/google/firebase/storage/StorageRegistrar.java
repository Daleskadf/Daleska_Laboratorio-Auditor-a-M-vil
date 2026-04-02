package com.google.firebase.storage;

import X5.E;
import androidx.annotation.Keep;
import b4.InterfaceC0593a;
import c4.C0632a;
import c4.InterfaceC0633b;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
@Keep
/* loaded from: classes.dex */
public class StorageRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-gcs";
    c4.r blockingExecutor = new c4.r(V3.b.class, Executor.class);
    c4.r uiExecutor = new c4.r(V3.d.class, Executor.class);

    public static /* synthetic */ g a(StorageRegistrar storageRegistrar, M3.q qVar) {
        return storageRegistrar.lambda$getComponents$0(qVar);
    }

    public /* synthetic */ g lambda$getComponents$0(InterfaceC0633b interfaceC0633b) {
        return new g((U3.h) interfaceC0633b.a(U3.h.class), interfaceC0633b.e(InterfaceC0593a.class), interfaceC0633b.e(Z3.b.class), (Executor) interfaceC0633b.b(this.blockingExecutor), (Executor) interfaceC0633b.b(this.uiExecutor));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0632a> getComponents() {
        Y1.y b5 = C0632a.b(g.class);
        b5.f6698c = LIBRARY_NAME;
        b5.c(c4.j.b(U3.h.class));
        b5.c(new c4.j(this.blockingExecutor, 1, 0));
        b5.c(new c4.j(this.uiExecutor, 1, 0));
        b5.c(c4.j.a(InterfaceC0593a.class));
        b5.c(c4.j.a(Z3.b.class));
        b5.f = new E(this, 9);
        return Arrays.asList(b5.d(), F.f.i(LIBRARY_NAME, "21.0.1"));
    }
}
