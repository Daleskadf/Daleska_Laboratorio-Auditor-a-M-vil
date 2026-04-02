package X3;

import D.RunnableC0053c;
import android.content.Context;
import c4.n;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import w4.InterfaceC1956b;
/* loaded from: classes.dex */
public final class d implements Z3.b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f6380a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f6381b;

    /* renamed from: c  reason: collision with root package name */
    public final h f6382c;

    /* renamed from: d  reason: collision with root package name */
    public final j f6383d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f6384e;
    public final Executor f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f6385g;

    /* renamed from: h  reason: collision with root package name */
    public final Task f6386h;

    /* renamed from: i  reason: collision with root package name */
    public final t2.i f6387i;
    public a j;

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, X3.h] */
    public d(U3.h hVar, InterfaceC1956b interfaceC1956b, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        I.i(hVar);
        I.i(interfaceC1956b);
        this.f6380a = new ArrayList();
        this.f6381b = new ArrayList();
        hVar.a();
        String f = hVar.f();
        ?? obj = new Object();
        Context context = hVar.f5749a;
        I.i(context);
        I.e(f);
        obj.f6393a = new n(new e(0, context, "com.google.firebase.appcheck.store." + f));
        this.f6382c = obj;
        hVar.a();
        this.f6383d = new j(context, this, executor2, scheduledExecutorService);
        this.f6384e = executor;
        this.f = executor2;
        this.f6385g = executor3;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor3.execute(new RunnableC0053c(20, this, taskCompletionSource));
        this.f6386h = taskCompletionSource.getTask();
        this.f6387i = new t2.i(13);
    }

    public final void a(Z3.a aVar) {
        ArrayList arrayList = this.f6380a;
        arrayList.add(aVar);
        int size = this.f6381b.size() + arrayList.size();
        j jVar = this.f6383d;
        if (jVar.f6397b == 0 && size > 0) {
            jVar.f6397b = size;
        } else if (jVar.f6397b > 0 && size == 0) {
            jVar.f6396a.getClass();
        }
        jVar.f6397b = size;
        a aVar2 = this.j;
        if (aVar2 != null) {
            this.f6387i.getClass();
            if ((aVar2.f6373a + aVar2.f6374b) - System.currentTimeMillis() > 300000) {
                aVar.c(b.a(this.j));
            }
        }
    }

    public final Task b(boolean z7) {
        return this.f6386h.continueWithTask(this.f, new c(this, z7));
    }
}
