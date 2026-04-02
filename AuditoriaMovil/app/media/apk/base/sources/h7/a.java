package h7;

import androidx.datastore.preferences.protobuf.Y;
import java.io.Serializable;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.helpers.g;
/* loaded from: classes.dex */
public final class a implements g7.b, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public String f11345a;

    /* renamed from: b  reason: collision with root package name */
    public g f11346b;

    /* renamed from: c  reason: collision with root package name */
    public LinkedBlockingQueue f11347c;

    public final void A(b bVar, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            C(bVar, new Object[]{obj});
        } else {
            C(bVar, new Object[]{obj, obj2});
        }
    }

    public final void B(b bVar, String str, Object[] objArr) {
        Throwable th = null;
        if (objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                th = (Throwable) obj;
            }
        }
        if (th != null) {
            if (objArr.length != 0) {
                int length = objArr.length - 1;
                Object[] objArr2 = new Object[length];
                if (length > 0) {
                    System.arraycopy(objArr, 0, objArr2, 0, length);
                }
                C(bVar, objArr2);
                return;
            }
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        C(bVar, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h7.c, java.lang.Object] */
    public final void C(b bVar, Object[] objArr) {
        ?? obj = new Object();
        System.currentTimeMillis();
        obj.f11348a = bVar;
        obj.f11349b = this.f11346b;
        Thread.currentThread().getName();
        obj.f11350c = objArr;
        this.f11347c.add(obj);
    }

    @Override // g7.b
    public final void a(String str, Object obj) {
        C(b.ERROR, new Object[]{obj});
    }

    @Override // g7.b
    public final void b(String str, Object... objArr) {
        B(b.DEBUG, str, objArr);
    }

    @Override // g7.b
    public final boolean c() {
        return true;
    }

    @Override // g7.b
    public final boolean d() {
        return true;
    }

    @Override // g7.b
    public final void e(Object... objArr) {
        B(b.ERROR, "pipesClientId={} didn't receive ready byte from server within StartupTimeoutMillis {}; ms elapsed {}; did read >{}<", objArr);
    }

    @Override // g7.b
    public final void f(Integer num, String str) {
        C(b.WARN, new Object[]{num});
    }

    @Override // g7.b
    public final void g(String str, Throwable th) {
        C(b.WARN, null);
    }

    @Override // g7.b
    public final String getName() {
        return this.f11345a;
    }

    @Override // g7.b
    public final void h(Object obj, String str) {
        A(b.ERROR, "Error assigning value '{}' to '{}'", obj, str);
    }

    @Override // g7.b
    public final void i(String str, Throwable th) {
        C(b.DEBUG, null);
    }

    @Override // g7.b
    public final void j(String str, Throwable th) {
        C(b.ERROR, null);
    }

    @Override // g7.b
    public final void k(String str) {
        C(b.INFO, null);
    }

    @Override // g7.b
    public final void l(String str) {
        C(b.WARN, null);
    }

    @Override // g7.b
    public final void m(String str) {
        C(b.TRACE, null);
    }

    @Override // g7.b
    public final boolean n() {
        return true;
    }

    @Override // g7.b
    public final void o(String str, Object... objArr) {
        B(b.WARN, str, objArr);
    }

    @Override // g7.b
    public final void p(Object obj, Object obj2, String str) {
        A(b.WARN, str, obj, obj2);
    }

    @Override // g7.b
    public final void q(Object obj, String str) {
        C(b.DEBUG, new Object[]{obj});
    }

    @Override // g7.b
    public final boolean r() {
        return true;
    }

    @Override // g7.b
    public final /* synthetic */ boolean s(b bVar) {
        return Y.b(this, bVar);
    }

    @Override // g7.b
    public final void t(String str) {
        C(b.DEBUG, null);
    }

    @Override // g7.b
    public final boolean u() {
        return true;
    }

    @Override // g7.b
    public final void v(String str, Object obj, Serializable serializable) {
        A(b.DEBUG, str, obj, serializable);
    }

    @Override // g7.b
    public final void w(String str, Object obj, Serializable serializable) {
        A(b.TRACE, str, obj, serializable);
    }

    @Override // g7.b
    public final void x(Integer num, String str) {
        C(b.INFO, new Object[]{num});
    }

    @Override // g7.b
    public final void y(String str, Serializable serializable) {
        C(b.TRACE, new Object[]{serializable});
    }

    @Override // g7.b
    public final void z(String str, Object obj, Serializable serializable) {
        A(b.INFO, str, obj, serializable);
    }
}
