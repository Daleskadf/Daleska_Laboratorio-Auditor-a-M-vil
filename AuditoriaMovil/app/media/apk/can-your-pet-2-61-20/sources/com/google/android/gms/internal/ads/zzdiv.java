package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbdg;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdiv implements zzdae, com.google.android.gms.ads.internal.overlay.zzp, zzczk {
    zzfmy zza;
    private final Context zzb;
    private final zzcgm zzc;
    private final zzffn zzd;
    private final VersionInfoParcel zze;
    private final zzbdg.zza.EnumC0007zza zzf;

    public zzdiv(Context context, zzcgm zzcgmVar, zzffn zzffnVar, VersionInfoParcel versionInfoParcel, zzbdg.zza.EnumC0007zza enumC0007zza) {
        this.zzb = context;
        this.zzc = zzcgmVar;
        this.zzd = zzffnVar;
        this.zze = versionInfoParcel;
        this.zzf = enumC0007zza;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfb)).booleanValue()) {
            return;
        }
        this.zzc.zzd("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final void zzr() {
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfb)).booleanValue()) {
            this.zzc.zzd("onSdkImpression", new ArrayMap());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdae
    public final void zzs() {
        zzege zzegeVar;
        zzege zzegeVar2;
        zzegd zzegdVar;
        zzbdg.zza.EnumC0007zza enumC0007zza = this.zzf;
        if ((enumC0007zza == zzbdg.zza.EnumC0007zza.REWARD_BASED_VIDEO_AD || enumC0007zza == zzbdg.zza.EnumC0007zza.INTERSTITIAL || enumC0007zza == zzbdg.zza.EnumC0007zza.APP_OPEN) && this.zzd.zzU && this.zzc != null) {
            if (com.google.android.gms.ads.internal.zzu.zzA().zzj(this.zzb)) {
                VersionInfoParcel versionInfoParcel = this.zze;
                String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                zzfgl zzfglVar = this.zzd.zzW;
                String zza = zzfglVar.zza();
                if (zzfglVar.zzb() == 1) {
                    zzegdVar = zzegd.VIDEO;
                    zzegeVar2 = zzege.DEFINED_BY_JAVASCRIPT;
                } else {
                    if (this.zzd.zzZ == 2) {
                        zzegeVar = zzege.UNSPECIFIED;
                    } else {
                        zzegeVar = zzege.BEGIN_TO_RENDER;
                    }
                    zzegeVar2 = zzegeVar;
                    zzegdVar = zzegd.HTML_DISPLAY;
                }
                zzfmy zza2 = com.google.android.gms.ads.internal.zzu.zzA().zza(str, this.zzc.zzG(), "", "javascript", zza, zzegeVar2, zzegdVar, this.zzd.zzam);
                this.zza = zza2;
                if (zza2 != null) {
                    com.google.android.gms.ads.internal.zzu.zzA().zzh(this.zza, (View) this.zzc);
                    this.zzc.zzaq(this.zza);
                    com.google.android.gms.ads.internal.zzu.zzA().zzi(this.zza);
                    this.zzc.zzd("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }
}
