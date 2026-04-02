package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbdg;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeel implements zzfko {
    private final zzedz zza;
    private final zzeed zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeel(zzedz zzedzVar, zzeed zzeedVar) {
        this.zza = zzedzVar;
        this.zzb = zzeedVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzd(zzfkh zzfkhVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgm)).booleanValue() && zzfkh.RENDERER == zzfkhVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzdC(zzfkh zzfkhVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzdD(zzfkh zzfkhVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgm)).booleanValue() && zzfkh.RENDERER == zzfkhVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzdE(zzfkh zzfkhVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgm)).booleanValue()) {
            if (zzfkh.RENDERER == zzfkhVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime());
            } else if (zzfkh.PRELOADED_LOADER == zzfkhVar || zzfkh.SERVER_TRANSACTION == zzfkhVar) {
                this.zza.zzh(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime());
                final zzeed zzeedVar = this.zzb;
                final long zzd = this.zza.zzd();
                zzeedVar.zza.zza(new zzfjq() { // from class: com.google.android.gms.internal.ads.zzeec
                    @Override // com.google.android.gms.internal.ads.zzfjq
                    public final Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzeed.this.zzf()) {
                            return null;
                        }
                        long j = zzd;
                        zzbdg.zzaf.zza.C0009zza zzn = zzbdg.zzaf.zza.zzn();
                        zzn.zzP(j);
                        byte[] zzaV = zzn.zzbr().zzaV();
                        zzeek.zzf(sQLiteDatabase, false, false);
                        zzeek.zzc(sQLiteDatabase, j, zzaV);
                        return null;
                    }
                });
            }
        }
    }
}
