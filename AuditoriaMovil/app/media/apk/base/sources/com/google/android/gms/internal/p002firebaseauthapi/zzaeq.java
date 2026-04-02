package com.google.android.gms.internal.p002firebaseauthapi;

import a4.AbstractC0456e;
import a4.AbstractC0467p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeq  reason: invalid package */
/* loaded from: classes.dex */
public final class zzaeq<ResultT, CallbackT> implements zzaeh<ResultT> {
    private final zzaeg<ResultT, CallbackT> zza;
    private final TaskCompletionSource<ResultT> zzb;

    public zzaeq(zzaeg<ResultT, CallbackT> zzaegVar, TaskCompletionSource<ResultT> taskCompletionSource) {
        this.zza = zzaegVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeh
    public final void zza(ResultT resultt, Status status) {
        AbstractC0467p abstractC0467p;
        I.j(this.zzb, "completion source cannot be null");
        if (status != null) {
            zzaeg<ResultT, CallbackT> zzaegVar = this.zza;
            if (zzaegVar.zzq != null) {
                TaskCompletionSource<ResultT> taskCompletionSource = this.zzb;
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zzaegVar.zzc);
                zzaeg<ResultT, CallbackT> zzaegVar2 = this.zza;
                zzzs zzzsVar = zzaegVar2.zzq;
                if (!"reauthenticateWithCredential".equals(zzaegVar2.zza()) && !"reauthenticateWithCredentialWithData".equals(this.zza.zza())) {
                    abstractC0467p = null;
                } else {
                    abstractC0467p = this.zza.zzd;
                }
                taskCompletionSource.setException(zzadr.zza(firebaseAuth, zzzsVar, abstractC0467p));
                return;
            }
            AbstractC0456e abstractC0456e = zzaegVar.zzn;
            if (abstractC0456e != null) {
                this.zzb.setException(zzadr.zza(status, abstractC0456e, zzaegVar.zzo, zzaegVar.zzp));
                return;
            } else {
                this.zzb.setException(zzadr.zza(status));
                return;
            }
        }
        this.zzb.setResult(resultt);
    }
}
