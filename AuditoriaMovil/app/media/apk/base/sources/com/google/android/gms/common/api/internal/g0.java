package com.google.android.gms.common.api.internal;

import D.AbstractC0059i;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;
import z0.AbstractComponentCallbacksC2061v;
import z0.C2063x;
/* loaded from: classes.dex */
public final class g0 extends AbstractComponentCallbacksC2061v implements InterfaceC0739m {

    /* renamed from: Q0  reason: collision with root package name */
    public static final WeakHashMap f9244Q0 = new WeakHashMap();

    /* renamed from: N0  reason: collision with root package name */
    public final Map f9245N0 = DesugarCollections.synchronizedMap(new S.k(0));

    /* renamed from: O0  reason: collision with root package name */
    public int f9246O0 = 0;

    /* renamed from: P0  reason: collision with root package name */
    public Bundle f9247P0;

    @Override // z0.AbstractComponentCallbacksC2061v
    public final void B() {
        this.f16850y0 = true;
        this.f9246O0 = 3;
        for (LifecycleCallback lifecycleCallback : this.f9245N0.values()) {
            lifecycleCallback.onResume();
        }
    }

    @Override // z0.AbstractComponentCallbacksC2061v
    public final void C(Bundle bundle) {
        for (Map.Entry entry : this.f9245N0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // z0.AbstractComponentCallbacksC2061v
    public final void D() {
        this.f16850y0 = true;
        this.f9246O0 = 2;
        for (LifecycleCallback lifecycleCallback : this.f9245N0.values()) {
            lifecycleCallback.onStart();
        }
    }

    @Override // z0.AbstractComponentCallbacksC2061v
    public final void E() {
        this.f16850y0 = true;
        this.f9246O0 = 4;
        for (LifecycleCallback lifecycleCallback : this.f9245N0.values()) {
            lifecycleCallback.onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0739m
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f9245N0;
        if (!map.containsKey(str)) {
            map.put(str, lifecycleCallback);
            if (this.f9246O0 > 0) {
                new zzi(Looper.getMainLooper()).post(new H2.a(this, lifecycleCallback, str, 7));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(AbstractC0059i.M("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0739m
    public final LifecycleCallback d(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f9245N0.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0739m
    public final Activity f() {
        C2063x c2063x = this.f16841o0;
        if (c2063x == null) {
            return null;
        }
        return c2063x.f16856d;
    }

    @Override // z0.AbstractComponentCallbacksC2061v
    public final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.j(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f9245N0.values()) {
            lifecycleCallback.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // z0.AbstractComponentCallbacksC2061v
    public final void u(int i7, int i8, Intent intent) {
        super.u(i7, i8, intent);
        for (LifecycleCallback lifecycleCallback : this.f9245N0.values()) {
            lifecycleCallback.onActivityResult(i7, i8, intent);
        }
    }

    @Override // z0.AbstractComponentCallbacksC2061v
    public final void w(Bundle bundle) {
        Bundle bundle2;
        super.w(bundle);
        this.f9246O0 = 1;
        this.f9247P0 = bundle;
        for (Map.Entry entry : this.f9245N0.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
    }

    @Override // z0.AbstractComponentCallbacksC2061v
    public final void x() {
        this.f16850y0 = true;
        this.f9246O0 = 5;
        for (LifecycleCallback lifecycleCallback : this.f9245N0.values()) {
            lifecycleCallback.onDestroy();
        }
    }
}
