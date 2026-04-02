package c4;

import java.util.Set;
import k4.C1395a;
import k4.InterfaceC1396b;
/* loaded from: classes.dex */
public final class s implements InterfaceC1396b {

    /* renamed from: a  reason: collision with root package name */
    public final Set f8414a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC1396b f8415b;

    public s(Set set, InterfaceC1396b interfaceC1396b) {
        this.f8414a = set;
        this.f8415b = interfaceC1396b;
    }

    @Override // k4.InterfaceC1396b
    public final void a(C1395a c1395a) {
        if (this.f8414a.contains(U3.b.class)) {
            this.f8415b.a(c1395a);
            return;
        }
        throw new RuntimeException("Attempting to publish an undeclared event " + c1395a + ".");
    }
}
