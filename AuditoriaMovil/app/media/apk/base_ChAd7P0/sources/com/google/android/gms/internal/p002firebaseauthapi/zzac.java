package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzac  reason: invalid package */
/* loaded from: classes.dex */
abstract class zzac extends zzd<String> {
    final CharSequence zza;
    private final zzf zzb;
    private final boolean zzc;
    private int zzd = 0;
    private int zze;

    public zzac(zzv zzvVar, CharSequence charSequence) {
        zzf zzfVar;
        int i7;
        zzfVar = zzvVar.zza;
        this.zzb = zzfVar;
        this.zzc = false;
        i7 = zzvVar.zzc;
        this.zze = i7;
        this.zza = charSequence;
    }

    public abstract int zza(int i7);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzd
    public final /* synthetic */ String zza() {
        int i7 = this.zzd;
        while (true) {
            int i8 = this.zzd;
            if (i8 != -1) {
                int zzb = zzb(i8);
                if (zzb == -1) {
                    zzb = this.zza.length();
                    this.zzd = -1;
                } else {
                    this.zzd = zza(zzb);
                }
                int i9 = this.zzd;
                if (i9 == i7) {
                    int i10 = i9 + 1;
                    this.zzd = i10;
                    if (i10 > this.zza.length()) {
                        this.zzd = -1;
                    }
                } else {
                    while (i7 < zzb && this.zzb.zza(this.zza.charAt(i7))) {
                        i7++;
                    }
                    while (zzb > i7 && this.zzb.zza(this.zza.charAt(zzb - 1))) {
                        zzb--;
                    }
                    int i11 = this.zze;
                    if (i11 == 1) {
                        zzb = this.zza.length();
                        this.zzd = -1;
                        while (zzb > i7 && this.zzb.zza(this.zza.charAt(zzb - 1))) {
                            zzb--;
                        }
                    } else {
                        this.zze = i11 - 1;
                    }
                    return this.zza.subSequence(i7, zzb).toString();
                }
            } else {
                zzb();
                return null;
            }
        }
    }

    public abstract int zzb(int i7);
}
