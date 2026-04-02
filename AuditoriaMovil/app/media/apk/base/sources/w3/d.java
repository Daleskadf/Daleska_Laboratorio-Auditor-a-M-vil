package w3;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import r2.ServiceConnectionC1733b;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: o  reason: collision with root package name */
    public static final HashMap f16344o = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f16345a;

    /* renamed from: b  reason: collision with root package name */
    public final y f16346b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16347c;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16350g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f16351h;

    /* renamed from: i  reason: collision with root package name */
    public final C f16352i;

    /* renamed from: m  reason: collision with root package name */
    public ServiceConnectionC1733b f16355m;

    /* renamed from: n  reason: collision with root package name */
    public IInterface f16356n;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f16348d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f16349e = new HashSet();
    public final Object f = new Object();

    /* renamed from: k  reason: collision with root package name */
    public final C1951A f16353k = new IBinder.DeathRecipient() { // from class: w3.A
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            d dVar = d.this;
            dVar.f16346b.b("reportBinderDeath", new Object[0]);
            if (dVar.j.get() == null) {
                dVar.f16346b.b("%s : Binder has died.", dVar.f16347c);
                Iterator it = dVar.f16348d.iterator();
                while (it.hasNext()) {
                    ((z) it.next()).a(new RemoteException(String.valueOf(dVar.f16347c).concat(" : Binder has died.")));
                }
                dVar.f16348d.clear();
                synchronized (dVar.f) {
                    dVar.e();
                }
                return;
            }
            throw new ClassCastException();
        }
    };

    /* renamed from: l  reason: collision with root package name */
    public final AtomicInteger f16354l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [w3.A] */
    public d(Context context, y yVar, String str, Intent intent, C c8) {
        this.f16345a = context;
        this.f16346b = yVar;
        this.f16347c = str;
        this.f16351h = intent;
        this.f16352i = c8;
    }

    public static void b(d dVar, z zVar) {
        IInterface iInterface = dVar.f16356n;
        ArrayList arrayList = dVar.f16348d;
        y yVar = dVar.f16346b;
        if (iInterface == null && !dVar.f16350g) {
            yVar.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(zVar);
            ServiceConnectionC1733b serviceConnectionC1733b = new ServiceConnectionC1733b(dVar, 1);
            dVar.f16355m = serviceConnectionC1733b;
            dVar.f16350g = true;
            if (!dVar.f16345a.bindService(dVar.f16351h, serviceConnectionC1733b, 1)) {
                yVar.b("Failed to bind to the service.", new Object[0]);
                dVar.f16350g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((z) it.next()).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (dVar.f16350g) {
            yVar.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(zVar);
        } else {
            zVar.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f16344o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f16347c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f16347c, 10);
                    handlerThread.start();
                    hashMap.put(this.f16347c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f16347c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(z zVar, TaskCompletionSource taskCompletionSource) {
        a().post(new B(this, zVar.c(), taskCompletionSource, zVar));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.f16349e.remove(taskCompletionSource);
        }
        a().post(new C1954c(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f16349e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f16347c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
