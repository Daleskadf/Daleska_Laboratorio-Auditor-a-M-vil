package P5;

import D.RunnableC0053c;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0730d;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public final /* synthetic */ class g implements L5.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4042a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f4043b;

    public /* synthetic */ g(d dVar, int i7) {
        this.f4042a = i7;
        this.f4043b = dVar;
    }

    @Override // L5.b
    public final void j(Object obj, A.f fVar) {
        switch (this.f4042a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                final String str = (String) arrayList2.get(0);
                final Boolean bool = (Boolean) arrayList2.get(1);
                h hVar = new h(arrayList, fVar, 0);
                this.f4043b.getClass();
                final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        Boolean bool2 = bool;
                        String str2 = str;
                        switch (r4) {
                            case 0:
                                HashMap hashMap = d.f4034c;
                                try {
                                    U3.h.e(str2).l(bool2);
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource2.setException(e7);
                                    return;
                                }
                            default:
                                HashMap hashMap2 = d.f4034c;
                                try {
                                    U3.h e8 = U3.h.e(str2);
                                    boolean booleanValue = bool2.booleanValue();
                                    e8.a();
                                    if (e8.f5753e.compareAndSet(!booleanValue, booleanValue)) {
                                        boolean z7 = ComponentCallbacks2C0730d.f9232e.f9233a.get();
                                        if (booleanValue && z7) {
                                            e8.j(true);
                                        } else if (!booleanValue && z7) {
                                            e8.j(false);
                                        }
                                    }
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource2.setException(e9);
                                    return;
                                }
                        }
                    }
                });
                d.b(taskCompletionSource, hVar);
                return;
            case 1:
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = (ArrayList) obj;
                final String str2 = (String) arrayList4.get(0);
                final Boolean bool2 = (Boolean) arrayList4.get(1);
                h hVar2 = new h(arrayList3, fVar, 1);
                this.f4043b.getClass();
                final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        TaskCompletionSource taskCompletionSource22 = taskCompletionSource2;
                        Boolean bool22 = bool2;
                        String str22 = str2;
                        switch (r4) {
                            case 0:
                                HashMap hashMap = d.f4034c;
                                try {
                                    U3.h.e(str22).l(bool22);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource22.setException(e7);
                                    return;
                                }
                            default:
                                HashMap hashMap2 = d.f4034c;
                                try {
                                    U3.h e8 = U3.h.e(str22);
                                    boolean booleanValue = bool22.booleanValue();
                                    e8.a();
                                    if (e8.f5753e.compareAndSet(!booleanValue, booleanValue)) {
                                        boolean z7 = ComponentCallbacks2C0730d.f9232e.f9233a.get();
                                        if (booleanValue && z7) {
                                            e8.j(true);
                                        } else if (!booleanValue && z7) {
                                            e8.j(false);
                                        }
                                    }
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource22.setException(e9);
                                    return;
                                }
                        }
                    }
                });
                d.b(taskCompletionSource2, hVar2);
                return;
            case 2:
                h hVar3 = new h(new ArrayList(), fVar, 2);
                this.f4043b.getClass();
                TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0053c(12, (String) ((ArrayList) obj).get(0), taskCompletionSource3));
                d.b(taskCompletionSource3, hVar3);
                return;
            case 3:
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = (ArrayList) obj;
                j jVar = (j) arrayList6.get(1);
                h hVar4 = new h(arrayList5, fVar, 3);
                d dVar = this.f4043b;
                dVar.getClass();
                TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new M.d(dVar, jVar, (String) arrayList6.get(0), taskCompletionSource4, 2));
                d.b(taskCompletionSource4, hVar4);
                return;
            case 4:
                h hVar5 = new h(new ArrayList(), fVar, 4);
                final d dVar2 = this.f4043b;
                dVar2.getClass();
                final TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P5.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArrayList arrayList7;
                        switch (r3) {
                            case 0:
                                TaskCompletionSource taskCompletionSource6 = taskCompletionSource5;
                                HashMap hashMap = d.f4034c;
                                d dVar3 = dVar2;
                                dVar3.getClass();
                                try {
                                    U3.k a7 = U3.k.a(dVar3.f4035a);
                                    if (a7 == null) {
                                        taskCompletionSource6.setException(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                                    } else {
                                        taskCompletionSource6.setResult(d.a(a7));
                                    }
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource6.setException(e7);
                                    return;
                                }
                            default:
                                d dVar4 = dVar2;
                                TaskCompletionSource taskCompletionSource7 = taskCompletionSource5;
                                HashMap hashMap2 = d.f4034c;
                                dVar4.getClass();
                                try {
                                    if (!dVar4.f4036b) {
                                        dVar4.f4036b = true;
                                    } else {
                                        Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                    }
                                    synchronized (U3.h.f5747k) {
                                        arrayList7 = new ArrayList(U3.h.f5748l.values());
                                    }
                                    ArrayList arrayList8 = new ArrayList(arrayList7.size());
                                    Iterator it = arrayList7.iterator();
                                    while (it.hasNext()) {
                                        TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                                        FlutterFirebasePlugin.cachedThreadPool.execute(new A.h(dVar4, (U3.h) it.next(), taskCompletionSource8, 6));
                                        arrayList8.add((k) Tasks.await(taskCompletionSource8.getTask()));
                                    }
                                    taskCompletionSource7.setResult(arrayList8);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource7.setException(e8);
                                    return;
                                }
                        }
                    }
                });
                d.b(taskCompletionSource5, hVar5);
                return;
            default:
                h hVar6 = new h(new ArrayList(), fVar, 5);
                final d dVar3 = this.f4043b;
                dVar3.getClass();
                final TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P5.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArrayList arrayList7;
                        switch (r3) {
                            case 0:
                                TaskCompletionSource taskCompletionSource62 = taskCompletionSource6;
                                HashMap hashMap = d.f4034c;
                                d dVar32 = dVar3;
                                dVar32.getClass();
                                try {
                                    U3.k a7 = U3.k.a(dVar32.f4035a);
                                    if (a7 == null) {
                                        taskCompletionSource62.setException(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                                    } else {
                                        taskCompletionSource62.setResult(d.a(a7));
                                    }
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource62.setException(e7);
                                    return;
                                }
                            default:
                                d dVar4 = dVar3;
                                TaskCompletionSource taskCompletionSource7 = taskCompletionSource6;
                                HashMap hashMap2 = d.f4034c;
                                dVar4.getClass();
                                try {
                                    if (!dVar4.f4036b) {
                                        dVar4.f4036b = true;
                                    } else {
                                        Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                    }
                                    synchronized (U3.h.f5747k) {
                                        arrayList7 = new ArrayList(U3.h.f5748l.values());
                                    }
                                    ArrayList arrayList8 = new ArrayList(arrayList7.size());
                                    Iterator it = arrayList7.iterator();
                                    while (it.hasNext()) {
                                        TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                                        FlutterFirebasePlugin.cachedThreadPool.execute(new A.h(dVar4, (U3.h) it.next(), taskCompletionSource8, 6));
                                        arrayList8.add((k) Tasks.await(taskCompletionSource8.getTask()));
                                    }
                                    taskCompletionSource7.setResult(arrayList8);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource7.setException(e8);
                                    return;
                                }
                        }
                    }
                });
                d.b(taskCompletionSource6, hVar6);
                return;
        }
    }
}
