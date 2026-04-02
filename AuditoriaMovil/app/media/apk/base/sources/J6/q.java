package J6;

import F6.C;
import F6.InterfaceC0091h0;
/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.k implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f2454a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        super(2);
        this.f2454a = nVar;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        int i7;
        int intValue = ((Number) obj).intValue();
        n6.g gVar = (n6.g) obj2;
        n6.h key = gVar.getKey();
        n6.g gVar2 = this.f2454a.f2448b.get(key);
        if (key != C.f1216b) {
            if (gVar != gVar2) {
                i7 = Integer.MIN_VALUE;
            } else {
                i7 = intValue + 1;
            }
            return Integer.valueOf(i7);
        }
        InterfaceC0091h0 interfaceC0091h0 = (InterfaceC0091h0) gVar2;
        InterfaceC0091h0 interfaceC0091h02 = (InterfaceC0091h0) gVar;
        while (true) {
            if (interfaceC0091h02 == null) {
                interfaceC0091h02 = null;
                break;
            } else if (interfaceC0091h02 == interfaceC0091h0 || !(interfaceC0091h02 instanceof K6.t)) {
                break;
            } else {
                interfaceC0091h02 = interfaceC0091h02.getParent();
            }
        }
        if (interfaceC0091h02 == interfaceC0091h0) {
            if (interfaceC0091h0 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC0091h02 + ", expected child of " + interfaceC0091h0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
