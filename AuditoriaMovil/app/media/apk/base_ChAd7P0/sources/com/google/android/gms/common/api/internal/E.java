package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class E extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f9168a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference f9169b;

    /* renamed from: c  reason: collision with root package name */
    public final zau f9170c;

    /* renamed from: d  reason: collision with root package name */
    public final W2.e f9171d;

    /* renamed from: e  reason: collision with root package name */
    public final S.g f9172e;
    public final C0735i f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(InterfaceC0739m interfaceC0739m, C0735i c0735i) {
        super(interfaceC0739m);
        W2.e eVar = W2.e.f6170d;
        this.f9169b = new AtomicReference(null);
        this.f9170c = new zau(Looper.getMainLooper());
        this.f9171d = eVar;
        this.f9172e = new S.g(0);
        this.f = c0735i;
        this.mLifecycleFragment.b("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i7, int i8, Intent intent) {
        AtomicReference atomicReference = this.f9169b;
        c0 c0Var = (c0) atomicReference.get();
        C0735i c0735i = this.f;
        if (i7 != 1) {
            if (i7 == 2) {
                int d7 = this.f9171d.d(getActivity(), W2.f.f6171a);
                if (d7 == 0) {
                    atomicReference.set(null);
                    zau zauVar = c0735i.f9264i0;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                    return;
                } else if (c0Var != null) {
                    if (c0Var.f9231b.f6160b == 18 && d7 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i8 == -1) {
            atomicReference.set(null);
            zau zauVar2 = c0735i.f9264i0;
            zauVar2.sendMessage(zauVar2.obtainMessage(3));
            return;
        } else if (i8 == 0) {
            if (c0Var != null) {
                int i9 = 13;
                if (intent != null) {
                    i9 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                W2.b bVar = new W2.b(1, i9, null, c0Var.f9231b.toString());
                atomicReference.set(null);
                c0735i.j(bVar, c0Var.f9230a);
                return;
            }
            return;
        }
        if (c0Var != null) {
            atomicReference.set(null);
            c0735i.j(c0Var.f9231b, c0Var.f9230a);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i7;
        W2.b bVar = new W2.b(13, null);
        AtomicReference atomicReference = this.f9169b;
        c0 c0Var = (c0) atomicReference.get();
        if (c0Var == null) {
            i7 = -1;
        } else {
            i7 = c0Var.f9230a;
        }
        atomicReference.set(null);
        this.f.j(bVar, i7);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        c0 c0Var;
        super.onCreate(bundle);
        if (bundle != null) {
            AtomicReference atomicReference = this.f9169b;
            if (bundle.getBoolean("resolving_error", false)) {
                c0Var = new c0(new W2.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                c0Var = null;
            }
            atomicReference.set(c0Var);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        if (!this.f9172e.isEmpty()) {
            this.f.b(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        c0 c0Var = (c0) this.f9169b.get();
        if (c0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c0Var.f9230a);
        W2.b bVar = c0Var.f9231b;
        bundle.putInt("failed_status", bVar.f6160b);
        bundle.putParcelable("failed_resolution", bVar.f6161c);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        this.f9168a = true;
        if (!this.f9172e.isEmpty()) {
            this.f.b(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        this.f9168a = false;
        C0735i c0735i = this.f;
        c0735i.getClass();
        synchronized (C0735i.f9250m0) {
            try {
                if (c0735i.f9261f0 == this) {
                    c0735i.f9261f0 = null;
                    c0735i.f9262g0.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
