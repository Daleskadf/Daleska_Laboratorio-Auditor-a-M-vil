package j4;

import h4.InterfaceC1084d;
import i4.InterfaceC1111b;
import java.util.Date;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class d implements InterfaceC1111b {

    /* renamed from: e  reason: collision with root package name */
    public static final c f13446e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f13447a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f13448b;

    /* renamed from: c  reason: collision with root package name */
    public final C1368a f13449c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13450d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f13447a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f13448b = hashMap2;
        this.f13449c = C1368a.f13441a;
        this.f13450d = false;
        hashMap2.put(String.class, C1369b.f13442b);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, C1369b.f13443c);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f13446e);
        hashMap.remove(Date.class);
    }

    @Override // i4.InterfaceC1111b
    public final InterfaceC1111b registerEncoder(Class cls, InterfaceC1084d interfaceC1084d) {
        this.f13447a.put(cls, interfaceC1084d);
        this.f13448b.remove(cls);
        return this;
    }
}
