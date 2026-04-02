package D6;

import F6.q0;
import java.util.Iterator;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f899a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f900b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f899a = i7;
        this.f900b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Iterator, D6.e, java.lang.Object, n6.d] */
    @Override // D6.d
    public final Iterator iterator() {
        switch (this.f899a) {
            case 0:
                return new b(this);
            case 1:
                ?? obj = new Object();
                obj.f903c = AbstractC1740d.k(obj, obj, (q0) this.f900b);
                return obj;
            default:
                return (Iterator) this.f900b;
        }
    }
}
