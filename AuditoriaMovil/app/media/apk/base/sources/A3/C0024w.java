package A3;

import java.util.Map;
/* renamed from: A3.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024w extends AbstractC0017o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f199a;

    /* renamed from: b  reason: collision with root package name */
    public int f200b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0025x f201c;

    public C0024w(C0025x c0025x, int i7) {
        this.f201c = c0025x;
        Object obj = C0025x.f202e0;
        this.f199a = c0025x.j()[i7];
        this.f200b = i7;
    }

    public final void a() {
        int i7 = this.f200b;
        Object obj = this.f199a;
        C0025x c0025x = this.f201c;
        if (i7 != -1 && i7 < c0025x.size()) {
            if (F.f.l(obj, c0025x.j()[this.f200b])) {
                return;
            }
        }
        Object obj2 = C0025x.f202e0;
        this.f200b = c0025x.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f199a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C0025x c0025x = this.f201c;
        Map c8 = c0025x.c();
        if (c8 != null) {
            return c8.get(this.f199a);
        }
        a();
        int i7 = this.f200b;
        if (i7 == -1) {
            return null;
        }
        return c0025x.k()[i7];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C0025x c0025x = this.f201c;
        Map c8 = c0025x.c();
        Object obj2 = this.f199a;
        if (c8 != null) {
            return c8.put(obj2, obj);
        }
        a();
        int i7 = this.f200b;
        if (i7 == -1) {
            c0025x.put(obj2, obj);
            return null;
        }
        Object obj3 = c0025x.k()[i7];
        c0025x.k()[this.f200b] = obj;
        return obj3;
    }
}
