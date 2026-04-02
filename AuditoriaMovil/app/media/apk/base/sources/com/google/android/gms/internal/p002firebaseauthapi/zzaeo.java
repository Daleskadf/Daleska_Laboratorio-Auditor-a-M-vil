package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeo  reason: invalid package */
/* loaded from: classes.dex */
final class zzaeo implements Runnable {
    private final /* synthetic */ zzaen zza;
    private final /* synthetic */ zzaei zzb;

    public zzaeo(zzaei zzaeiVar, zzaen zzaenVar) {
        this.zza = zzaenVar;
        this.zzb = zzaeiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zza.zzh) {
            try {
                if (!this.zzb.zza.zzh.isEmpty()) {
                    this.zza.zza(this.zzb.zza.zzh.get(0), new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
