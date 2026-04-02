package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakv  reason: invalid package */
/* loaded from: classes.dex */
public class zzakv {
    private volatile zzaln zza;
    private volatile zzaiw zzb;
    private volatile boolean zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzakv)) {
            return false;
        }
        zzakv zzakvVar = (zzakv) obj;
        zzaln zzalnVar = this.zza;
        zzaln zzalnVar2 = zzakvVar.zza;
        if (zzalnVar == null && zzalnVar2 == null) {
            return zzb().equals(zzakvVar.zzb());
        }
        if (zzalnVar != null && zzalnVar2 != null) {
            return zzalnVar.equals(zzalnVar2);
        }
        if (zzalnVar != null) {
            return zzalnVar.equals(zzakvVar.zzb(zzalnVar.zzs()));
        }
        return zzb(zzalnVar2.zzs()).equals(zzalnVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return this.zzb.zzb();
        }
        if (this.zza != null) {
            return this.zza.zzl();
        }
        return 0;
    }

    public final zzaiw zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzaiw.zza;
                } else {
                    this.zzb = this.zza.zzj();
                }
                return this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzaln zza(zzaln zzalnVar) {
        zzaln zzalnVar2 = this.zza;
        this.zzb = null;
        this.zza = zzalnVar;
        return zzalnVar2;
    }

    private final zzaln zzb(zzaln zzalnVar) {
        if (this.zza == null) {
            synchronized (this) {
                if (this.zza == null) {
                    try {
                        this.zza = zzalnVar;
                        this.zzb = zzaiw.zza;
                    } catch (zzakm unused) {
                        this.zzc = true;
                        this.zza = zzalnVar;
                        this.zzb = zzaiw.zza;
                    }
                }
            }
        }
        return this.zza;
    }
}
