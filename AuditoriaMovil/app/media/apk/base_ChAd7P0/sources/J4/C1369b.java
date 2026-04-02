package j4;

import h4.InterfaceC1086f;
import h4.InterfaceC1087g;
/* renamed from: j4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1369b implements InterfaceC1086f {

    /* renamed from: b  reason: collision with root package name */
    public static final C1369b f13442b = new C1369b(0);

    /* renamed from: c  reason: collision with root package name */
    public static final C1369b f13443c = new C1369b(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13444a;

    public /* synthetic */ C1369b(int i7) {
        this.f13444a = i7;
    }

    @Override // h4.InterfaceC1081a
    public final void encode(Object obj, Object obj2) {
        switch (this.f13444a) {
            case 0:
                c cVar = d.f13446e;
                ((InterfaceC1087g) obj2).add((String) obj);
                return;
            default:
                c cVar2 = d.f13446e;
                ((InterfaceC1087g) obj2).add(((Boolean) obj).booleanValue());
                return;
        }
    }
}
