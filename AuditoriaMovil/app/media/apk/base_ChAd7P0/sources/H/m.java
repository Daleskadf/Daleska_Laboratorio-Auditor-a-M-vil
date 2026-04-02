package H;

import a.AbstractC0412a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class m implements E3.b {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f1635a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f1636b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1637c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f1638d;

    /* renamed from: e  reason: collision with root package name */
    public final U.l f1639e = AbstractC0412a.s(new A.m(this, 5));
    public U.i f;

    public m(ArrayList arrayList, boolean z7, G.a aVar) {
        this.f1635a = arrayList;
        this.f1636b = new ArrayList(arrayList.size());
        this.f1637c = z7;
        this.f1638d = new AtomicInteger(arrayList.size());
        a(new G.c(this, 3), j3.f.r());
        if (this.f1635a.isEmpty()) {
            this.f.a(new ArrayList(this.f1636b));
            return;
        }
        for (int i7 = 0; i7 < this.f1635a.size(); i7++) {
            this.f1636b.add(null);
        }
        ArrayList arrayList2 = this.f1635a;
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            E3.b bVar = (E3.b) arrayList2.get(i8);
            bVar.a(new l(this, i8, bVar), aVar);
        }
    }

    @Override // E3.b
    public final void a(Runnable runnable, Executor executor) {
        this.f1639e.f5535b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        ArrayList arrayList = this.f1635a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((E3.b) it.next()).cancel(z7);
            }
        }
        return this.f1639e.cancel(z7);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.f1639e.f5535b.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1639e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1639e.f5535b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        ArrayList arrayList = this.f1635a;
        if (arrayList != null && !isDone()) {
            Iterator it = arrayList.iterator();
            loop0: while (it.hasNext()) {
                E3.b bVar = (E3.b) it.next();
                while (!bVar.isDone()) {
                    try {
                        bVar.get();
                    } catch (Error e7) {
                        throw e7;
                    } catch (InterruptedException e8) {
                        throw e8;
                    } catch (Throwable unused) {
                        if (this.f1637c) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (List) this.f1639e.f5535b.get();
    }
}
