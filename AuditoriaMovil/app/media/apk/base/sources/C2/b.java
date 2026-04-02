package C2;

import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
/* loaded from: classes.dex */
public final class b implements InterfaceC1084d {

    /* renamed from: a  reason: collision with root package name */
    public static final b f466a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C1083c f467b = C1083c.c("sdkVersion");

    /* renamed from: c  reason: collision with root package name */
    public static final C1083c f468c = C1083c.c("model");

    /* renamed from: d  reason: collision with root package name */
    public static final C1083c f469d = C1083c.c("hardware");

    /* renamed from: e  reason: collision with root package name */
    public static final C1083c f470e = C1083c.c("device");
    public static final C1083c f = C1083c.c("product");

    /* renamed from: g  reason: collision with root package name */
    public static final C1083c f471g = C1083c.c("osBuild");

    /* renamed from: h  reason: collision with root package name */
    public static final C1083c f472h = C1083c.c("manufacturer");

    /* renamed from: i  reason: collision with root package name */
    public static final C1083c f473i = C1083c.c("fingerprint");
    public static final C1083c j = C1083c.c("locale");

    /* renamed from: k  reason: collision with root package name */
    public static final C1083c f474k = C1083c.c("country");

    /* renamed from: l  reason: collision with root package name */
    public static final C1083c f475l = C1083c.c("mccMnc");

    /* renamed from: m  reason: collision with root package name */
    public static final C1083c f476m = C1083c.c("applicationBuild");

    @Override // h4.InterfaceC1081a
    public final void encode(Object obj, Object obj2) {
        InterfaceC1085e interfaceC1085e = (InterfaceC1085e) obj2;
        i iVar = (i) ((a) obj);
        interfaceC1085e.add(f467b, iVar.f500a);
        interfaceC1085e.add(f468c, iVar.f501b);
        interfaceC1085e.add(f469d, iVar.f502c);
        interfaceC1085e.add(f470e, iVar.f503d);
        interfaceC1085e.add(f, iVar.f504e);
        interfaceC1085e.add(f471g, iVar.f);
        interfaceC1085e.add(f472h, iVar.f505g);
        interfaceC1085e.add(f473i, iVar.f506h);
        interfaceC1085e.add(j, iVar.f507i);
        interfaceC1085e.add(f474k, iVar.j);
        interfaceC1085e.add(f475l, iVar.f508k);
        interfaceC1085e.add(f476m, iVar.f509l);
    }
}
