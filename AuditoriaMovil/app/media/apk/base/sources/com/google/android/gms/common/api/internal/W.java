package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class W extends com.google.android.gms.common.api.w implements com.google.android.gms.common.api.u {

    /* renamed from: a  reason: collision with root package name */
    public W f9215a = null;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9216b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference f9217c;

    public W(WeakReference weakReference) {
        Looper mainLooper;
        com.google.android.gms.common.internal.I.j(weakReference, "GoogleApiClient reference must not be null");
        this.f9217c = weakReference;
        com.google.android.gms.common.api.o oVar = (com.google.android.gms.common.api.o) weakReference.get();
        if (oVar != null) {
            mainLooper = ((I) oVar).f9188b.getLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        new V(this, mainLooper);
    }

    public final W a() {
        W w2;
        synchronized (this.f9216b) {
            w2 = new W(this.f9217c);
            this.f9215a = w2;
        }
        return w2;
    }

    public final void b(com.google.android.gms.common.api.r rVar) {
        synchronized (this.f9216b) {
        }
    }

    public final void c(Status status) {
        synchronized (this.f9216b) {
            d();
        }
    }

    public final void d() {
        synchronized (this.f9216b) {
            com.google.android.gms.common.api.o oVar = (com.google.android.gms.common.api.o) this.f9217c.get();
        }
    }
}
