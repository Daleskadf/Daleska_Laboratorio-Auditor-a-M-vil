package com.google.android.gms.internal.p002firebaseauthapi;

import a4.C0457f;
import b4.C0599g;
import b4.M;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaci  reason: invalid package */
/* loaded from: classes.dex */
final class zzaci extends zzaeg<Void, M> {
    private final zzafy zzu;

    public zzaci(C0457f c0457f, String str) {
        super(2);
        I.j(c0457f, "Credential cannot be null");
        this.zzu = new zzafy(c0457f, null, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "reauthenticateWithEmailLink";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        C0599g zza = zzabq.zza(this.zzc, this.zzk);
        if (((C0599g) this.zzd).f8254b.f8241a.equalsIgnoreCase(zza.f8254b.f8241a)) {
            ((M) this.zze).a(this.zzj, zza);
            zzb(null);
            return;
        }
        zza(new Status(17024, null, null, null));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzb);
    }
}
