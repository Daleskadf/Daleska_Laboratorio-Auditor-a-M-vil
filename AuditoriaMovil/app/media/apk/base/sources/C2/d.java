package C2;

import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
/* loaded from: classes.dex */
public final class d implements InterfaceC1084d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f479a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C1083c f480b = C1083c.c("clientType");

    /* renamed from: c  reason: collision with root package name */
    public static final C1083c f481c = C1083c.c("androidClientInfo");

    @Override // h4.InterfaceC1081a
    public final void encode(Object obj, Object obj2) {
        InterfaceC1085e interfaceC1085e = (InterfaceC1085e) obj2;
        k kVar = (k) ((r) obj);
        interfaceC1085e.add(f480b, kVar.f511a);
        interfaceC1085e.add(f481c, kVar.f512b);
    }
}
