package com.google.android.gms.internal.p002firebaseauthapi;

import a4.K;
import android.text.TextUtils;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaad  reason: invalid package */
/* loaded from: classes.dex */
public final class zzaad implements zzaew<zzagm> {
    private final /* synthetic */ zzaet zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ K zze;
    private final /* synthetic */ zzadp zzf;
    private final /* synthetic */ zzagw zzg;

    public zzaad(zzzv zzzvVar, zzaet zzaetVar, String str, String str2, Boolean bool, K k2, zzadp zzadpVar, zzagw zzagwVar) {
        this.zza = zzaetVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = k2;
        this.zzf = zzadpVar;
        this.zzg = zzagwVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagm zzagmVar) {
        List<zzagl> zza = zzagmVar.zza();
        if (zza != null && !zza.isEmpty()) {
            zzagl zzaglVar = zza.get(0);
            zzahb zzf = zzaglVar.zzf();
            List<zzahc> zza2 = zzf != null ? zzf.zza() : null;
            if (zza2 != null && !zza2.isEmpty()) {
                if (TextUtils.isEmpty(this.zzb)) {
                    zza2.get(0).zza(this.zzc);
                } else {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= zza2.size()) {
                            break;
                        } else if (zza2.get(i7).zzf().equals(this.zzb)) {
                            zza2.get(i7).zza(this.zzc);
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
            }
            Boolean bool = this.zzd;
            if (bool != null) {
                zzaglVar.zza(bool.booleanValue());
            } else {
                zzaglVar.zza(zzaglVar.zzb() - zzaglVar.zza() < 1000);
            }
            zzaglVar.zza(this.zze);
            this.zzf.zza(this.zzg, zzaglVar);
            return;
        }
        this.zza.zza("No users.");
    }
}
