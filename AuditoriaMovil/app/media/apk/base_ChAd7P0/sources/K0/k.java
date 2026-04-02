package K0;

import H0.C0136p;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final s f2485a;

    /* renamed from: b  reason: collision with root package name */
    public final u f2486b;

    /* renamed from: c  reason: collision with root package name */
    public final i f2487c;

    /* renamed from: d  reason: collision with root package name */
    public final CopyOnWriteArraySet f2488d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque f2489e;
    public final ArrayDeque f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f2490g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2491h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2492i;

    public k(Looper looper, s sVar, i iVar) {
        this(new CopyOnWriteArraySet(), looper, sVar, iVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f2490g) {
            try {
                if (this.f2491h) {
                    return;
                }
                this.f2488d.add(new j(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        u uVar = this.f2486b;
        if (!uVar.f2522a.hasMessages(1)) {
            uVar.getClass();
            t b5 = u.b();
            b5.f2520a = uVar.f2522a.obtainMessage(1);
            uVar.getClass();
            Message message = b5.f2520a;
            message.getClass();
            uVar.f2522a.sendMessageAtFrontOfQueue(message);
            b5.a();
        }
        ArrayDeque arrayDeque2 = this.f2489e;
        boolean isEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (!isEmpty) {
            return;
        }
        while (!arrayDeque2.isEmpty()) {
            ((Runnable) arrayDeque2.peekFirst()).run();
            arrayDeque2.removeFirst();
        }
    }

    public final void c(int i7, h hVar) {
        f();
        this.f.add(new g(new CopyOnWriteArraySet(this.f2488d), i7, 0, hVar));
    }

    public final void d() {
        f();
        synchronized (this.f2490g) {
            this.f2491h = true;
        }
        Iterator it = this.f2488d.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            i iVar = this.f2487c;
            jVar.f2484d = true;
            if (jVar.f2483c) {
                jVar.f2483c = false;
                iVar.c(jVar.f2481a, jVar.f2482b.b());
            }
        }
        this.f2488d.clear();
    }

    public final void e(int i7, h hVar) {
        c(i7, hVar);
        b();
    }

    public final void f() {
        boolean z7;
        if (!this.f2492i) {
            return;
        }
        if (Thread.currentThread() == this.f2486b.f2522a.getLooper().getThread()) {
            z7 = true;
        } else {
            z7 = false;
        }
        a.j(z7);
    }

    public k(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, s sVar, i iVar, boolean z7) {
        this.f2485a = sVar;
        this.f2488d = copyOnWriteArraySet;
        this.f2487c = iVar;
        this.f2490g = new Object();
        this.f2489e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.f2486b = sVar.a(looper, new Handler.Callback() { // from class: K0.f
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                k kVar = k.this;
                Iterator it = kVar.f2488d.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (!jVar.f2484d && jVar.f2483c) {
                        C0136p b5 = jVar.f2482b.b();
                        jVar.f2482b = new A.l();
                        jVar.f2483c = false;
                        kVar.f2487c.c(jVar.f2481a, b5);
                    }
                    if (kVar.f2486b.f2522a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f2492i = z7;
    }
}
