package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
/* renamed from: j$.util.stream.c2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1238c2 extends AbstractC1278k2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13209b = 1;

    /* renamed from: c  reason: collision with root package name */
    boolean f13210c;

    /* renamed from: d  reason: collision with root package name */
    Object f13211d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AbstractC1230b f13212e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238c2(W w2, InterfaceC1298o2 interfaceC1298o2) {
        super(interfaceC1298o2);
        this.f13212e = w2;
        InterfaceC1298o2 interfaceC1298o22 = this.f13295a;
        Objects.requireNonNull(interfaceC1298o22);
        this.f13211d = new U(interfaceC1298o22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238c2(C1344y c1344y, InterfaceC1298o2 interfaceC1298o2) {
        super(interfaceC1298o2);
        this.f13212e = c1344y;
        InterfaceC1298o2 interfaceC1298o22 = this.f13295a;
        Objects.requireNonNull(interfaceC1298o22);
        this.f13211d = new C1295o(interfaceC1298o22);
    }

    @Override // j$.util.stream.AbstractC1278k2, j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        switch (this.f13209b) {
            case 0:
                this.f13295a.l(-1L);
                return;
            case 1:
                this.f13295a.l(-1L);
                return;
            default:
                this.f13295a.l(-1L);
                return;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f13209b) {
            case 0:
                InterfaceC1286m0 interfaceC1286m0 = (InterfaceC1286m0) ((C1225a) ((C1256g0) this.f13212e).f13274n).apply((C1225a) obj);
                if (interfaceC1286m0 != null) {
                    try {
                        boolean z7 = this.f13210c;
                        C1236c0 c1236c0 = (C1236c0) this.f13211d;
                        if (!z7) {
                            interfaceC1286m0.sequential().forEach(c1236c0);
                        } else {
                            j$.util.c0 spliterator = interfaceC1286m0.sequential().spliterator();
                            while (!this.f13295a.n() && spliterator.tryAdvance((LongConsumer) c1236c0)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            interfaceC1286m0.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (interfaceC1286m0 != null) {
                    interfaceC1286m0.close();
                    return;
                }
                return;
            case 1:
                IntStream intStream = (IntStream) ((C1225a) ((W) this.f13212e).f13171n).apply((C1225a) obj);
                if (intStream != null) {
                    try {
                        boolean z8 = this.f13210c;
                        U u7 = (U) this.f13211d;
                        if (!z8) {
                            intStream.sequential().forEach(u7);
                        } else {
                            j$.util.Z spliterator2 = intStream.sequential().spliterator();
                            while (!this.f13295a.n() && spliterator2.tryAdvance((IntConsumer) u7)) {
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                E e7 = (E) ((C1225a) ((C1344y) this.f13212e).f13394n).apply((C1225a) obj);
                if (e7 != null) {
                    try {
                        boolean z9 = this.f13210c;
                        C1295o c1295o = (C1295o) this.f13211d;
                        if (!z9) {
                            e7.sequential().forEach(c1295o);
                        } else {
                            j$.util.W spliterator3 = e7.sequential().spliterator();
                            while (!this.f13295a.n() && spliterator3.tryAdvance((DoubleConsumer) c1295o)) {
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            e7.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (e7 != null) {
                    e7.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC1278k2, j$.util.stream.InterfaceC1298o2
    public final boolean n() {
        switch (this.f13209b) {
            case 0:
                this.f13210c = true;
                return this.f13295a.n();
            case 1:
                this.f13210c = true;
                return this.f13295a.n();
            default:
                this.f13210c = true;
                return this.f13295a.n();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238c2(C1256g0 c1256g0, InterfaceC1298o2 interfaceC1298o2) {
        super(interfaceC1298o2);
        this.f13212e = c1256g0;
        InterfaceC1298o2 interfaceC1298o22 = this.f13295a;
        Objects.requireNonNull(interfaceC1298o22);
        this.f13211d = new C1236c0(interfaceC1298o22);
    }
}
