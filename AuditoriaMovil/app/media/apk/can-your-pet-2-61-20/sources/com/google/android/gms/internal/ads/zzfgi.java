package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfgi {
    public final com.google.android.gms.ads.internal.client.zzfk zza;
    public final zzbni zzb;
    public final zzeoa zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;
    public final com.google.android.gms.ads.internal.client.zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbgt zzi;
    public final com.google.android.gms.ads.internal.client.zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzcb zzn;
    public final zzffv zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final Bundle zzr;
    public final com.google.android.gms.ads.internal.client.zzcf zzs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfgi(zzfgg zzfggVar, zzfgh zzfghVar) {
        com.google.android.gms.ads.internal.client.zzfk zzfkVar;
        zzbgt zzbgtVar;
        this.zze = zzfgg.zzg(zzfggVar);
        this.zzf = zzfgg.zzJ(zzfggVar);
        this.zzs = zzfgg.zzR(zzfggVar);
        int i = zzfgg.zze(zzfggVar).zza;
        long j = zzfgg.zze(zzfggVar).zzb;
        Bundle bundle = zzfgg.zze(zzfggVar).zzc;
        int i2 = zzfgg.zze(zzfggVar).zzd;
        List list = zzfgg.zze(zzfggVar).zze;
        boolean z = zzfgg.zze(zzfggVar).zzf;
        int i3 = zzfgg.zze(zzfggVar).zzg;
        boolean z2 = true;
        if (!zzfgg.zze(zzfggVar).zzh && !zzfgg.zzP(zzfggVar)) {
            z2 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzl(i, j, bundle, i2, list, z, i3, z2, zzfgg.zze(zzfggVar).zzi, zzfgg.zze(zzfggVar).zzj, zzfgg.zze(zzfggVar).zzk, zzfgg.zze(zzfggVar).zzl, zzfgg.zze(zzfggVar).zzm, zzfgg.zze(zzfggVar).zzn, zzfgg.zze(zzfggVar).zzo, zzfgg.zze(zzfggVar).zzp, zzfgg.zze(zzfggVar).zzq, zzfgg.zze(zzfggVar).zzr, zzfgg.zze(zzfggVar).zzs, zzfgg.zze(zzfggVar).zzt, zzfgg.zze(zzfggVar).zzu, zzfgg.zze(zzfggVar).zzv, com.google.android.gms.ads.internal.util.zzt.zza(zzfgg.zze(zzfggVar).zzw), zzfgg.zze(zzfggVar).zzx, zzfgg.zze(zzfggVar).zzy, zzfgg.zze(zzfggVar).zzz);
        if (zzfgg.zzk(zzfggVar) != null) {
            zzfkVar = zzfgg.zzk(zzfggVar);
        } else {
            zzfkVar = zzfgg.zzl(zzfggVar) != null ? zzfgg.zzl(zzfggVar).zzf : null;
        }
        this.zza = zzfkVar;
        this.zzg = zzfgg.zzL(zzfggVar);
        this.zzh = zzfgg.zzM(zzfggVar);
        if (zzfgg.zzL(zzfggVar) == null) {
            zzbgtVar = null;
        } else {
            zzbgtVar = zzfgg.zzl(zzfggVar) == null ? new zzbgt(new NativeAdOptions.Builder().build()) : zzfgg.zzl(zzfggVar);
        }
        this.zzi = zzbgtVar;
        this.zzj = zzfgg.zzi(zzfggVar);
        this.zzk = zzfgg.zza(zzfggVar);
        this.zzl = zzfgg.zzc(zzfggVar);
        this.zzm = zzfgg.zzd(zzfggVar);
        this.zzn = zzfgg.zzj(zzfggVar);
        this.zzb = zzfgg.zzm(zzfggVar);
        this.zzo = new zzffv(zzfgg.zzo(zzfggVar), null);
        this.zzp = zzfgg.zzN(zzfggVar);
        this.zzc = zzfgg.zzn(zzfggVar);
        this.zzq = zzfgg.zzO(zzfggVar);
        this.zzr = zzfgg.zzb(zzfggVar);
    }

    public final zzbiv zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.zzl.zza();
    }

    public final boolean zzb() {
        zzbdq zzbdqVar = zzbdz.zzcZ;
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdqVar));
    }
}
