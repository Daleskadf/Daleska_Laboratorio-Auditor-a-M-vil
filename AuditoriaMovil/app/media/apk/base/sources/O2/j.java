package o2;

import B5.C0050x;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import e0.C0927b;
import io.flutter.plugin.platform.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import l2.k;
import m2.InterfaceC1435a;
import m6.p;
/* loaded from: classes.dex */
public final class j implements InterfaceC1435a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile j f14567c;

    /* renamed from: d  reason: collision with root package name */
    public static final ReentrantLock f14568d = new ReentrantLock();

    /* renamed from: a  reason: collision with root package name */
    public final h f14569a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f14570b = new CopyOnWriteArrayList();

    public j(h hVar) {
        this.f14569a = hVar;
        if (hVar != null) {
            hVar.h(new C0927b(this));
        }
    }

    @Override // m2.InterfaceC1435a
    public final void a(C0050x c0050x) {
        synchronized (f14568d) {
            try {
                if (this.f14569a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f14570b.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    if (iVar.f14565b == c0050x) {
                        arrayList.add(iVar);
                    }
                }
                this.f14570b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((i) it2.next()).f14564a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f14570b;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((i) it3.next()).f14564a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    h hVar = this.f14569a;
                    if (hVar != null) {
                        hVar.f(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m2.InterfaceC1435a
    public final void b(Context context, W1.c cVar, C0050x c0050x) {
        Activity activity;
        Object obj;
        WindowManager.LayoutParams attributes;
        l6.j jVar = null;
        r1 = null;
        IBinder iBinder = null;
        k kVar = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        p pVar = p.f14074a;
        if (activity != null) {
            ReentrantLock reentrantLock = f14568d;
            reentrantLock.lock();
            try {
                h hVar = this.f14569a;
                if (hVar == null) {
                    c0050x.accept(new k(pVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f14570b;
                boolean z7 = false;
                if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((i) it.next()).f14564a.equals(activity)) {
                            z7 = true;
                            break;
                        }
                    }
                }
                i iVar = new i(activity, cVar, c0050x);
                copyOnWriteArrayList.add(iVar);
                if (!z7) {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        hVar.g(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new y(hVar, activity));
                    }
                } else {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (activity.equals(((i) obj).f14564a)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    i iVar2 = (i) obj;
                    if (iVar2 != null) {
                        kVar = iVar2.f14566c;
                    }
                    if (kVar != null) {
                        iVar.f14566c = kVar;
                        iVar.f14565b.accept(kVar);
                    }
                }
                reentrantLock.unlock();
                jVar = l6.j.f13876a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (jVar == null) {
            c0050x.accept(new k(pVar));
        }
    }
}
