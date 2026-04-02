package r;

import java.util.HashMap;
/* renamed from: r.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1716a extends f {

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f15395e = new HashMap();

    @Override // r.f
    public final C1718c e(Object obj) {
        return (C1718c) this.f15395e.get(obj);
    }

    @Override // r.f
    public final Object f(Object obj) {
        Object f = super.f(obj);
        this.f15395e.remove(obj);
        return f;
    }
}
