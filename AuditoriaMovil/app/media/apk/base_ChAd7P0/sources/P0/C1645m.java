package p0;

import java.util.LinkedHashSet;
import r0.C1724d;
import r0.C1725e;
import r0.C1728h;
import w6.InterfaceC1959a;
/* renamed from: p0.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1645m extends kotlin.jvm.internal.k implements InterfaceC1959a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15035a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ N f15036b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1645m(N n7, int i7) {
        super(0);
        this.f15035a = i7;
        this.f15036b = n7;
    }

    @Override // w6.InterfaceC1959a
    public final Object invoke() {
        switch (this.f15035a) {
            case 0:
                return ((C1728h) this.f15036b.f14962e0.a()).f15439c;
            default:
                C1725e c1725e = this.f15036b.f14957a;
                String r7 = ((Q6.o) c1725e.f15425d.a()).f4481a.r();
                synchronized (C1725e.f) {
                    LinkedHashSet linkedHashSet = C1725e.f15421e;
                    if (!linkedHashSet.contains(r7)) {
                        linkedHashSet.add(r7);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + r7 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return new C1728h(c1725e.f15422a, (Q6.o) c1725e.f15425d.a(), (X) c1725e.f15423b.invoke((Q6.o) c1725e.f15425d.a(), c1725e.f15422a), new C1724d(c1725e, 1));
        }
    }
}
