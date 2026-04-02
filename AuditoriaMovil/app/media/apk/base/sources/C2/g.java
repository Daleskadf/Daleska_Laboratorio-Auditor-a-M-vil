package C2;

import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
/* loaded from: classes.dex */
public final class g implements InterfaceC1084d {

    /* renamed from: a  reason: collision with root package name */
    public static final g f496a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C1083c f497b = C1083c.c("networkType");

    /* renamed from: c  reason: collision with root package name */
    public static final C1083c f498c = C1083c.c("mobileSubtype");

    @Override // h4.InterfaceC1081a
    public final void encode(Object obj, Object obj2) {
        InterfaceC1085e interfaceC1085e = (InterfaceC1085e) obj2;
        o oVar = (o) ((w) obj);
        interfaceC1085e.add(f497b, oVar.f526a);
        interfaceC1085e.add(f498c, oVar.f527b);
    }
}
