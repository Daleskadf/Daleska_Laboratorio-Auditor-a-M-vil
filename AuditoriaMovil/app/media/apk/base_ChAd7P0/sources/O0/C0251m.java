package O0;

import e1.InterfaceC0959y;
/* renamed from: O0.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0251m implements z3.o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3800a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3801b;

    public /* synthetic */ C0251m(Object obj, int i7) {
        this.f3800a = i7;
        this.f3801b = obj;
    }

    @Override // z3.o
    public final Object get() {
        switch (this.f3800a) {
            case 0:
                return (InterfaceC0959y) this.f3801b;
            case 1:
                return Boolean.valueOf(((N) this.f3801b).f3598u0);
            default:
                try {
                    return (InterfaceC0959y) ((Class) this.f3801b).getConstructor(null).newInstance(null);
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
                }
        }
    }
}
