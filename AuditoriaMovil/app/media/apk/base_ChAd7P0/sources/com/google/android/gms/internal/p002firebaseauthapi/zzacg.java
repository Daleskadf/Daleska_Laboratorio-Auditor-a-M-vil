package com.google.android.gms.internal.p002firebaseauthapi;

import a4.AbstractC0456e;
import b4.C0599g;
import b4.M;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.slf4j.helpers.i;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacg  reason: invalid package */
/* loaded from: classes.dex */
final class zzacg extends zzaeg<Void, M> {
    private final zzaic zzu;

    public zzacg(AbstractC0456e abstractC0456e, String str) {
        super(2);
        I.j(abstractC0456e, "credential cannot be null");
        this.zzu = i.S(abstractC0456e, str).zza(false);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "reauthenticateWithCredential";
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
