package S4;

import G.i;
import c6.C0684l1;
import c6.U0;
import com.google.android.gms.common.api.internal.G;
import d6.l;
import j6.AbstractC1371b;
import j6.C1370a;
import java.util.ArrayList;
import java.util.List;
import u0.AbstractC1850f;
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5266a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5267b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5268c;

    public /* synthetic */ c(Object obj, int i7, int i8) {
        this.f5266a = i8;
        this.f5268c = obj;
        this.f5267b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        switch (this.f5266a) {
            case 0:
                try {
                    Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
                } catch (InterruptedException unused) {
                }
                ((d) this.f5268c).A(this.f5267b);
                return;
            case 1:
                l lVar = (l) this.f5268c;
                try {
                    AbstractC1371b.c();
                    C1370a c1370a = AbstractC1371b.f13458a;
                    c1370a.getClass();
                    C0684l1 c0684l1 = lVar.f8771a;
                    int i7 = this.f5267b;
                    c0684l1.getClass();
                    if (i7 > 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    i.f("numMessages must be > 0", z7);
                    if (!c0684l1.b()) {
                        c0684l1.f8898h0 += i7;
                        c0684l1.a();
                    }
                    c1370a.getClass();
                    return;
                } catch (Throwable th) {
                    lVar.n(th);
                    return;
                }
            case 2:
                ((U0) this.f5268c).f.c(this.f5267b);
                return;
            case 3:
                ((G) this.f5268c).i(this.f5267b);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f5268c;
                int size = arrayList.size();
                int i8 = 0;
                if (this.f5267b != 1) {
                    while (i8 < size) {
                        ((AbstractC1850f) arrayList.get(i8)).a();
                        i8++;
                    }
                    return;
                }
                while (i8 < size) {
                    ((AbstractC1850f) arrayList.get(i8)).b();
                    i8++;
                }
                return;
        }
    }

    public c(List list, int i7, Throwable th) {
        this.f5266a = 4;
        g0.c.f(list, "initCallbacks cannot be null");
        this.f5268c = new ArrayList(list);
        this.f5267b = i7;
    }
}
