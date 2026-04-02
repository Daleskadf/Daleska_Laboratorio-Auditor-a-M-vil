package c6;

import java.net.ProxySelector;
/* renamed from: c6.f0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0665f0 implements z3.o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8822a;

    @Override // z3.o
    public final Object get() {
        switch (this.f8822a) {
            case 0:
                return new T1();
            default:
                return ProxySelector.getDefault();
        }
    }
}
