package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes2.dex */
final class K2 extends C2 {

    /* renamed from: d  reason: collision with root package name */
    private ArrayList f13086d;

    @Override // j$.util.stream.AbstractC1278k2, j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f13086d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }

    @Override // j$.util.stream.AbstractC1278k2, j$.util.stream.InterfaceC1298o2
    public final void k() {
        List.EL.sort(this.f13086d, this.f13028b);
        InterfaceC1298o2 interfaceC1298o2 = this.f13295a;
        interfaceC1298o2.l(this.f13086d.size());
        if (!this.f13029c) {
            ArrayList arrayList = this.f13086d;
            Objects.requireNonNull(interfaceC1298o2);
            Collection.EL.a(arrayList, new C1225a(1, interfaceC1298o2));
        } else {
            Iterator it = this.f13086d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (interfaceC1298o2.n()) {
                    break;
                }
                interfaceC1298o2.accept((InterfaceC1298o2) next);
            }
        }
        interfaceC1298o2.k();
        this.f13086d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f13086d.add(obj);
    }
}
