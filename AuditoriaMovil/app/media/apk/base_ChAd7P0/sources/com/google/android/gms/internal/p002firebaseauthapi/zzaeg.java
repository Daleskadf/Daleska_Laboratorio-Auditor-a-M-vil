package com.google.android.gms.internal.p002firebaseauthapi;

import U3.h;
import a4.AbstractC0456e;
import a4.AbstractC0467p;
import a4.y;
import android.app.Activity;
import b4.InterfaceC0607o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC0739m;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeg  reason: invalid package */
/* loaded from: classes.dex */
public abstract class zzaeg<ResultT, CallbackT> implements zzaer<ResultT> {
    protected final int zza;
    protected h zzc;
    protected AbstractC0467p zzd;
    protected CallbackT zze;
    protected InterfaceC0607o zzf;
    protected zzaeh<ResultT> zzg;
    protected Executor zzi;
    protected zzagw zzj;
    protected zzagl zzk;
    protected zzafw zzl;
    protected zzahg zzm;
    protected AbstractC0456e zzn;
    protected String zzo;
    protected String zzp;
    protected zzzs zzq;
    protected zzagt zzr;
    protected zzags zzs;
    protected zzahs zzt;
    private boolean zzu;
    protected final zzaei zzb = new zzaei(this);
    protected final List<y> zzh = new ArrayList();

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeg$zza */
    /* loaded from: classes.dex */
    public static class zza extends LifecycleCallback {
        private final List<y> zza;

        private zza(InterfaceC0739m interfaceC0739m, List<y> list) {
            super(interfaceC0739m);
            this.mLifecycleFragment.b("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<y> list) {
            InterfaceC0739m fragment = LifecycleCallback.getFragment(activity);
            if (((zza) fragment.d(zza.class, "PhoneAuthActivityStopCallback")) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzaeg(int i7) {
        this.zza = i7;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, null);
    }

    public final zzaeg<ResultT, CallbackT> zza(CallbackT callbackt) {
        I.j(callbackt, "external callback cannot be null");
        this.zze = callbackt;
        return this;
    }

    public final zzaeg<ResultT, CallbackT> zza(InterfaceC0607o interfaceC0607o) {
        I.j(interfaceC0607o, "external failure callback cannot be null");
        this.zzf = interfaceC0607o;
        return this;
    }

    public final zzaeg<ResultT, CallbackT> zza(h hVar) {
        I.j(hVar, "firebaseApp cannot be null");
        this.zzc = hVar;
        return this;
    }

    public final zzaeg<ResultT, CallbackT> zza(AbstractC0467p abstractC0467p) {
        I.j(abstractC0467p, "firebaseUser cannot be null");
        this.zzd = abstractC0467p;
        return this;
    }

    public final zzaeg<ResultT, CallbackT> zza(y yVar, Activity activity, Executor executor, String str) {
        y zza2 = zzafc.zza(str, yVar, this);
        synchronized (this.zzh) {
            List<y> list = this.zzh;
            I.i(zza2);
            list.add(zza2);
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        I.i(executor);
        this.zzi = executor;
        return this;
    }

    public static /* synthetic */ void zza(zzaeg zzaegVar) {
        zzaegVar.zzb();
        I.k("no success or failure set on method implementation", zzaegVar.zzu);
    }

    public static /* synthetic */ void zza(zzaeg zzaegVar, Status status) {
        InterfaceC0607o interfaceC0607o = zzaegVar.zzf;
        if (interfaceC0607o != null) {
            interfaceC0607o.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }
}
