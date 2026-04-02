package O0;

import android.content.Context;
import android.os.Handler;
import g1.C1008e;
import java.util.ArrayList;
import l1.C1414a;
/* renamed from: O0.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249k {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3786a;

    /* renamed from: b  reason: collision with root package name */
    public final W2.j f3787b;

    public C0249k(Context context) {
        this.f3786a = context;
        this.f3787b = new W2.j(context, 2);
    }

    public final AbstractC0243e[] a(Handler handler, E e7, E e8, E e9, E e10) {
        ArrayList arrayList = new ArrayList();
        W2.j jVar = this.f3787b;
        Context context = this.f3786a;
        arrayList.add(new k1.k(context, jVar, handler, e7));
        Q0.A a7 = new Q0.A(context);
        K0.a.j(!a7.f4136b);
        a7.f4136b = true;
        if (((V2.k) a7.f4139e) == null) {
            a7.f4139e = new V2.k(new I0.d[0]);
        }
        if (((M0.x) a7.f4140g) == null) {
            a7.f4140g = new M0.x(context, 10);
        }
        arrayList.add(new Q0.L(this.f3786a, jVar, handler, e8, new Q0.I(a7)));
        arrayList.add(new C1008e(e9, handler.getLooper()));
        arrayList.add(new Y0.b(e10, handler.getLooper()));
        arrayList.add(new C1414a());
        arrayList.add(new W0.g(W0.c.f6104p));
        return (AbstractC0243e[]) arrayList.toArray(new AbstractC0243e[0]);
    }
}
