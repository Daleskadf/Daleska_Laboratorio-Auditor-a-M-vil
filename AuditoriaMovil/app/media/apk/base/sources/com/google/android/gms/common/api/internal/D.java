package com.google.android.gms.common.api.internal;

import android.app.AlertDialog;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class D {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9166a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9167b;

    public D(d0 d0Var, AlertDialog alertDialog) {
        this.f9167b = d0Var;
        this.f9166a = alertDialog;
    }

    public void a(Status status, boolean z7) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f9166a)) {
            hashMap = new HashMap((Map) this.f9166a);
        }
        synchronized (((Map) this.f9167b)) {
            hashMap2 = new HashMap((Map) this.f9167b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z7 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z7 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new com.google.android.gms.common.api.j(status));
            }
        }
    }

    public D() {
        this.f9166a = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.f9167b = DesugarCollections.synchronizedMap(new WeakHashMap());
    }
}
