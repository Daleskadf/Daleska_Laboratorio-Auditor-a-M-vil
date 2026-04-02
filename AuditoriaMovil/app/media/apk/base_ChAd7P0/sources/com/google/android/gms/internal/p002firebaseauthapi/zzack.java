package com.google.android.gms.internal.p002firebaseauthapi;

import b4.C0599g;
import b4.M;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzack  reason: invalid package */
/* loaded from: classes.dex */
final class zzack extends zzaeg<Void, M> {
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzack(String str, String str2, String str3, String str4) {
        super(2);
        I.f(str, "email cannot be null or empty");
        I.f(str2, "password cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
        this.zzw = str3;
        this.zzx = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "reauthenticateWithEmailPassword";
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
        zzadoVar.zzb(this.zzu, this.zzv, this.zzw, this.zzx, this.zzb);
    }
}
