package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcrg extends zzctv {
    private final zzcgm zzc;
    private final int zzd;
    private final Context zze;
    private final zzcqu zzf;
    private final zzdiu zzg;
    private final zzdfr zzh;
    private final zzczd zzi;
    private final boolean zzj;
    private final zzcbl zzk;
    private boolean zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcrg(zzctu zzctuVar, Context context, zzcgm zzcgmVar, int i, zzcqu zzcquVar, zzdiu zzdiuVar, zzdfr zzdfrVar, zzczd zzczdVar, zzcbl zzcblVar) {
        super(zzctuVar);
        this.zzl = false;
        this.zzc = zzcgmVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcquVar;
        this.zzg = zzdiuVar;
        this.zzh = zzdfrVar;
        this.zzi = zzczdVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfm)).booleanValue();
        this.zzk = zzcblVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    public final void zzb() {
        super.zzb();
        zzcgm zzcgmVar = this.zzc;
        if (zzcgmVar != null) {
            zzcgmVar.destroy();
        }
    }

    public final void zzc(zzbbl zzbblVar) {
        zzcgm zzcgmVar = this.zzc;
        if (zzcgmVar != null) {
            zzcgmVar.zzai(zzbblVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(android.app.Activity r3, com.google.android.gms.internal.ads.zzbby r4, boolean r5) throws android.os.RemoteException {
        /*
            r2 = this;
            if (r3 != 0) goto L4
            android.content.Context r3 = r2.zze
        L4:
            boolean r4 = r2.zzj
            if (r4 == 0) goto Ld
            com.google.android.gms.internal.ads.zzdfr r4 = r2.zzh
            r4.zzb()
        Ld:
            com.google.android.gms.internal.ads.zzbdq r4 = com.google.android.gms.internal.ads.zzbdz.zzaB
            com.google.android.gms.internal.ads.zzbdx r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L61
            com.google.android.gms.ads.internal.zzu.zzp()
            boolean r4 = com.google.android.gms.ads.internal.util.zzt.zzG(r3)
            if (r4 == 0) goto L61
            java.lang.String r4 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            com.google.android.gms.internal.ads.zzczd r4 = r2.zzi
            r4.zzb()
            com.google.android.gms.internal.ads.zzbdq r4 = com.google.android.gms.internal.ads.zzbdz.zzaC
            com.google.android.gms.internal.ads.zzbdx r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Ld2
            com.google.android.gms.internal.ads.zzfqa r4 = new com.google.android.gms.internal.ads.zzfqa
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzbx r5 = com.google.android.gms.ads.internal.zzu.zzt()
            android.os.Looper r5 = r5.zzb()
            r4.<init>(r3, r5)
            com.google.android.gms.internal.ads.zzffz r3 = r2.zza
            com.google.android.gms.internal.ads.zzffy r3 = r3.zzb
            com.google.android.gms.internal.ads.zzffq r3 = r3.zzb
            java.lang.String r3 = r3.zzb
            r4.zza(r3)
            return
        L61:
            com.google.android.gms.internal.ads.zzbdq r4 = com.google.android.gms.internal.ads.zzbdz.zzlz
            com.google.android.gms.internal.ads.zzbdx r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto La0
            com.google.android.gms.internal.ads.zzcgm r4 = r2.zzc
            if (r4 == 0) goto La0
            com.google.android.gms.internal.ads.zzffn r4 = r4.zzD()
            if (r4 == 0) goto La0
            boolean r1 = r4.zzar
            if (r1 == 0) goto La0
            int r4 = r4.zzas
            com.google.android.gms.internal.ads.zzcbl r1 = r2.zzk
            int r1 = r1.zzb()
            if (r4 != r1) goto L8d
            goto La0
        L8d:
            java.lang.String r3 = "The app open consent form has been shown."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)
            com.google.android.gms.internal.ads.zzczd r3 = r2.zzi
            r4 = 12
            java.lang.String r5 = "The consent form has already been shown."
            com.google.android.gms.ads.internal.client.zze r4 = com.google.android.gms.internal.ads.zzfhk.zzd(r4, r5, r0)
            r3.zza(r4)
            return
        La0:
            boolean r4 = r2.zzl
            if (r4 == 0) goto Lb4
            java.lang.String r4 = "App open interstitial ad is already visible."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            com.google.android.gms.internal.ads.zzczd r4 = r2.zzi
            r1 = 10
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfhk.zzd(r1, r0, r0)
            r4.zza(r0)
        Lb4:
            boolean r4 = r2.zzl
            if (r4 != 0) goto Ld2
            com.google.android.gms.internal.ads.zzdiu r4 = r2.zzg     // Catch: com.google.android.gms.internal.ads.zzdit -> Lcc
            com.google.android.gms.internal.ads.zzczd r0 = r2.zzi     // Catch: com.google.android.gms.internal.ads.zzdit -> Lcc
            r4.zza(r5, r3, r0)     // Catch: com.google.android.gms.internal.ads.zzdit -> Lcc
            boolean r3 = r2.zzj     // Catch: com.google.android.gms.internal.ads.zzdit -> Lcc
            if (r3 == 0) goto Lc8
            com.google.android.gms.internal.ads.zzdfr r3 = r2.zzh     // Catch: com.google.android.gms.internal.ads.zzdit -> Lcc
            r3.zza()     // Catch: com.google.android.gms.internal.ads.zzdit -> Lcc
        Lc8:
            r3 = 1
            r2.zzl = r3
            return
        Lcc:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzczd r4 = r2.zzi
            r4.zzc(r3)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcrg.zzd(android.app.Activity, com.google.android.gms.internal.ads.zzbby, boolean):void");
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}
