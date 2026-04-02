package D;

import a.AbstractC0412a;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.C0505g;
import g0.InterfaceC1003a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f782a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Size f783b;

    /* renamed from: c  reason: collision with root package name */
    public final D f784c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f785d;

    /* renamed from: e  reason: collision with root package name */
    public final U.l f786e;
    public final U.i f;

    /* renamed from: g  reason: collision with root package name */
    public final U.l f787g;

    /* renamed from: h  reason: collision with root package name */
    public final U.i f788h;

    /* renamed from: i  reason: collision with root package name */
    public final U.i f789i;
    public final t0 j;

    /* renamed from: k  reason: collision with root package name */
    public C0064n f790k;

    /* renamed from: l  reason: collision with root package name */
    public A4.d f791l;

    /* renamed from: m  reason: collision with root package name */
    public G.e f792m;

    static {
        Range range = C0505g.f;
    }

    public v0(Size size, boolean z7, D d7, M.h hVar) {
        this.f783b = size;
        this.f785d = z7;
        this.f784c = d7;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        U.l s7 = AbstractC0412a.s(new U.j() { // from class: D.q0
            @Override // U.j
            public final Object i(U.i iVar) {
                switch (r3) {
                    case 0:
                        atomicReference.set(iVar);
                        return AbstractC0059i.D(new StringBuilder(), str, "-cancellation");
                    case 1:
                        atomicReference.set(iVar);
                        return AbstractC0059i.D(new StringBuilder(), str, "-status");
                    default:
                        atomicReference.set(iVar);
                        return AbstractC0059i.D(new StringBuilder(), str, "-Surface");
                }
            }
        });
        U.i iVar = (U.i) atomicReference.get();
        iVar.getClass();
        this.f789i = iVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        U.l s8 = AbstractC0412a.s(new U.j() { // from class: D.q0
            @Override // U.j
            public final Object i(U.i iVar2) {
                switch (r3) {
                    case 0:
                        atomicReference2.set(iVar2);
                        return AbstractC0059i.D(new StringBuilder(), str, "-cancellation");
                    case 1:
                        atomicReference2.set(iVar2);
                        return AbstractC0059i.D(new StringBuilder(), str, "-status");
                    default:
                        atomicReference2.set(iVar2);
                        return AbstractC0059i.D(new StringBuilder(), str, "-Surface");
                }
            }
        });
        this.f787g = s8;
        s8.a(new H.h(0, s8, new A.f(3, iVar, s7)), j3.f.r());
        U.i iVar2 = (U.i) atomicReference2.get();
        iVar2.getClass();
        final AtomicReference atomicReference3 = new AtomicReference(null);
        U.l s9 = AbstractC0412a.s(new U.j() { // from class: D.q0
            @Override // U.j
            public final Object i(U.i iVar22) {
                switch (r3) {
                    case 0:
                        atomicReference3.set(iVar22);
                        return AbstractC0059i.D(new StringBuilder(), str, "-cancellation");
                    case 1:
                        atomicReference3.set(iVar22);
                        return AbstractC0059i.D(new StringBuilder(), str, "-status");
                    default:
                        atomicReference3.set(iVar22);
                        return AbstractC0059i.D(new StringBuilder(), str, "-Surface");
                }
            }
        });
        this.f786e = s9;
        U.i iVar3 = (U.i) atomicReference3.get();
        iVar3.getClass();
        this.f = iVar3;
        t0 t0Var = new t0(this, size);
        this.j = t0Var;
        E3.b d8 = H.i.d(t0Var.f7552e);
        s9.a(new H.h(0, s9, new V2.k(d8, iVar2, str, 5)), j3.f.r());
        d8.a(new r0(this, 0), j3.f.r());
        G.a r7 = j3.f.r();
        AtomicReference atomicReference4 = new AtomicReference(null);
        U.l s10 = AbstractC0412a.s(new A4.d(4, this, atomicReference4));
        s10.a(new H.h(0, s10, new C5.i(hVar, 7)), r7);
        U.i iVar4 = (U.i) atomicReference4.get();
        iVar4.getClass();
        this.f788h = iVar4;
    }

    public final void a(final Surface surface, Executor executor, final InterfaceC1003a interfaceC1003a) {
        if (!this.f.a(surface)) {
            U.l lVar = this.f786e;
            if (!lVar.isCancelled()) {
                g0.c.g(null, lVar.f5535b.isDone());
                try {
                    lVar.get();
                    executor.execute(new Runnable() { // from class: D.s0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    interfaceC1003a.accept(new C0063m(3, surface));
                                    return;
                                default:
                                    interfaceC1003a.accept(new C0063m(4, surface));
                                    return;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new Runnable() { // from class: D.s0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    interfaceC1003a.accept(new C0063m(3, surface));
                                    return;
                                default:
                                    interfaceC1003a.accept(new C0063m(4, surface));
                                    return;
                            }
                        }
                    });
                    return;
                }
            }
        }
        A.f fVar = new A.f(4, interfaceC1003a, surface);
        U.l lVar2 = this.f787g;
        lVar2.a(new H.h(0, lVar2, fVar), executor);
    }

    public final void b() {
        this.f.b(new Exception("Surface request will not complete."));
    }
}
