package a6;

import j$.util.concurrent.ConcurrentHashMap;
/* renamed from: a6.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0485n {

    /* renamed from: b  reason: collision with root package name */
    public static final C0485n f7170b = new C0485n(new C0483l(2), C0483l.f7167b);

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f7171a = new ConcurrentHashMap();

    public C0485n(InterfaceC0484m... interfaceC0484mArr) {
        for (InterfaceC0484m interfaceC0484m : interfaceC0484mArr) {
            this.f7171a.put(interfaceC0484m.g(), interfaceC0484m);
        }
    }
}
