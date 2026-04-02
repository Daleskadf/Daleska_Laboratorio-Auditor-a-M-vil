package C2;

import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
/* loaded from: classes.dex */
public final class f implements InterfaceC1084d {

    /* renamed from: a  reason: collision with root package name */
    public static final f f489a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C1083c f490b = C1083c.c("requestTimeMs");

    /* renamed from: c  reason: collision with root package name */
    public static final C1083c f491c = C1083c.c("requestUptimeMs");

    /* renamed from: d  reason: collision with root package name */
    public static final C1083c f492d = C1083c.c("clientInfo");

    /* renamed from: e  reason: collision with root package name */
    public static final C1083c f493e = C1083c.c("logSource");
    public static final C1083c f = C1083c.c("logSourceName");

    /* renamed from: g  reason: collision with root package name */
    public static final C1083c f494g = C1083c.c("logEvent");

    /* renamed from: h  reason: collision with root package name */
    public static final C1083c f495h = C1083c.c("qosTier");

    @Override // h4.InterfaceC1081a
    public final void encode(Object obj, Object obj2) {
        InterfaceC1085e interfaceC1085e = (InterfaceC1085e) obj2;
        m mVar = (m) ((t) obj);
        interfaceC1085e.add(f490b, mVar.f519a);
        interfaceC1085e.add(f491c, mVar.f520b);
        interfaceC1085e.add(f492d, mVar.f521c);
        interfaceC1085e.add(f493e, mVar.f522d);
        interfaceC1085e.add(f, mVar.f523e);
        interfaceC1085e.add(f494g, mVar.f);
        interfaceC1085e.add(f495h, mVar.f524g);
    }
}
