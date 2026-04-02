package j$.util.stream;

import j$.util.Spliterator;
/* renamed from: j$.util.stream.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1280l extends AbstractC1278k2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13299b = 2;

    /* renamed from: c  reason: collision with root package name */
    boolean f13300c;

    /* renamed from: d  reason: collision with root package name */
    Object f13301d;

    public /* synthetic */ C1280l(InterfaceC1298o2 interfaceC1298o2) {
        super(interfaceC1298o2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1280l(M3 m32, InterfaceC1298o2 interfaceC1298o2) {
        super(interfaceC1298o2);
        this.f13301d = m32;
        this.f13300c = true;
    }

    @Override // j$.util.stream.AbstractC1278k2, j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        switch (this.f13299b) {
            case 0:
                this.f13300c = false;
                this.f13301d = null;
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
        switch (this.f13299b) {
            case 0:
                InterfaceC1298o2 interfaceC1298o2 = this.f13295a;
                if (obj == null) {
                    if (this.f13300c) {
                        return;
                    }
                    this.f13300c = true;
                    this.f13301d = null;
                    interfaceC1298o2.accept((InterfaceC1298o2) null);
                    return;
                }
                Object obj2 = this.f13301d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.f13301d = obj;
                    interfaceC1298o2.accept((InterfaceC1298o2) obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((C1225a) ((C1319t) this.f13301d).f13349n).apply((C1225a) obj);
                if (stream != null) {
                    try {
                        boolean z7 = this.f13300c;
                        InterfaceC1298o2 interfaceC1298o22 = this.f13295a;
                        if (!z7) {
                            ((Stream) stream.sequential()).forEach(interfaceC1298o22);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC1298o22.n() && spliterator.tryAdvance(interfaceC1298o22)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f13300c) {
                    boolean test = ((M3) this.f13301d).f13105m.test(obj);
                    this.f13300c = test;
                    if (test) {
                        this.f13295a.accept((InterfaceC1298o2) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC1278k2, j$.util.stream.InterfaceC1298o2
    public boolean n() {
        switch (this.f13299b) {
            case 1:
                this.f13300c = true;
                return this.f13295a.n();
            case 2:
                return !this.f13300c || this.f13295a.n();
            default:
                return super.n();
        }
    }

    @Override // j$.util.stream.AbstractC1278k2, j$.util.stream.InterfaceC1298o2
    public void k() {
        switch (this.f13299b) {
            case 0:
                this.f13300c = false;
                this.f13301d = null;
                this.f13295a.k();
                return;
            default:
                super.k();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1280l(C1319t c1319t, InterfaceC1298o2 interfaceC1298o2) {
        super(interfaceC1298o2);
        this.f13301d = c1319t;
    }
}
