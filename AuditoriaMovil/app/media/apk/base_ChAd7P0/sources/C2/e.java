package C2;

import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
/* loaded from: classes.dex */
public final class e implements InterfaceC1084d {

    /* renamed from: a  reason: collision with root package name */
    public static final e f482a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C1083c f483b = C1083c.c("eventTimeMs");

    /* renamed from: c  reason: collision with root package name */
    public static final C1083c f484c = C1083c.c("eventCode");

    /* renamed from: d  reason: collision with root package name */
    public static final C1083c f485d = C1083c.c("eventUptimeMs");

    /* renamed from: e  reason: collision with root package name */
    public static final C1083c f486e = C1083c.c("sourceExtension");
    public static final C1083c f = C1083c.c("sourceExtensionJsonProto3");

    /* renamed from: g  reason: collision with root package name */
    public static final C1083c f487g = C1083c.c("timezoneOffsetSeconds");

    /* renamed from: h  reason: collision with root package name */
    public static final C1083c f488h = C1083c.c("networkConnectionInfo");

    @Override // h4.InterfaceC1081a
    public final void encode(Object obj, Object obj2) {
        InterfaceC1085e interfaceC1085e = (InterfaceC1085e) obj2;
        l lVar = (l) ((s) obj);
        interfaceC1085e.add(f483b, lVar.f513a);
        interfaceC1085e.add(f484c, lVar.f514b);
        interfaceC1085e.add(f485d, lVar.f515c);
        interfaceC1085e.add(f486e, lVar.f516d);
        interfaceC1085e.add(f, lVar.f517e);
        interfaceC1085e.add(f487g, lVar.f);
        interfaceC1085e.add(f488h, lVar.f518g);
    }
}
