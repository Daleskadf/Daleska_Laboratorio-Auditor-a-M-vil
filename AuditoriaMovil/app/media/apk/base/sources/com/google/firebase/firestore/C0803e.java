package com.google.firebase.firestore;

import D.AbstractC0055e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import n4.C1533t;
/* renamed from: com.google.firebase.firestore.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0803e {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f9803a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f9804b;

    public C0803e(g0 g0Var, d0 d0Var) {
        this.f9803a = g0Var;
        this.f9804b = d0Var;
    }

    public final Task a(EnumC0805g enumC0805g) {
        Task task;
        AbstractC0055e.b(enumC0805g, "AggregateSource must not be null");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        R1.j jVar = this.f9803a.f9809b.f9754k;
        synchronized (jVar) {
            jVar.n0();
            C1533t c1533t = (C1533t) jVar.f4683c;
            n4.D d7 = this.f9803a.f9808a;
            c1533t.e();
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            c1533t.f14363d.a(new M.d(c1533t, d7, this.f9804b, taskCompletionSource2, 15));
            task = taskCompletionSource2.getTask();
        }
        task.continueWith(u4.k.f16005b, new A4.d(13, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0803e)) {
            return false;
        }
        C0803e c0803e = (C0803e) obj;
        if (this.f9803a.equals(c0803e.f9803a) && this.f9804b.equals(c0803e.f9804b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9803a, this.f9804b);
    }
}
