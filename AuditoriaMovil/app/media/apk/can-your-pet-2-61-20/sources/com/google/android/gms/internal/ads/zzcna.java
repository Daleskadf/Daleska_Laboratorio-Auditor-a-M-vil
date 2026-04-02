package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcna extends com.google.android.gms.ads.internal.client.zzcn {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdry zzc;
    private final zzegl zzd;
    private final zzemw zze;
    private final zzdwk zzf;
    private final zzcad zzg;
    private final zzdsd zzh;
    private final zzdxf zzi;
    private final zzbgm zzj;
    private final zzflk zzk;
    private final zzfhe zzl;
    private final zzcwi zzm;
    private final zzduh zzn;
    private boolean zzo = false;
    private final Long zzp = Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime());

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcna(Context context, VersionInfoParcel versionInfoParcel, zzdry zzdryVar, zzegl zzeglVar, zzemw zzemwVar, zzdwk zzdwkVar, zzcad zzcadVar, zzdsd zzdsdVar, zzdxf zzdxfVar, zzbgm zzbgmVar, zzflk zzflkVar, zzfhe zzfheVar, zzcwi zzcwiVar, zzduh zzduhVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdryVar;
        this.zzd = zzeglVar;
        this.zze = zzemwVar;
        this.zzf = zzdwkVar;
        this.zzg = zzcadVar;
        this.zzh = zzdsdVar;
        this.zzi = zzdxfVar;
        this.zzj = zzbgmVar;
        this.zzk = zzflkVar;
        this.zzl = zzfheVar;
        this.zzm = zzcwiVar;
        this.zzn = zzduhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        if (com.google.android.gms.ads.internal.zzu.zzo().zzi().zzN()) {
            String zzk = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzk();
            if (com.google.android.gms.ads.internal.zzu.zzs().zzj(this.zza, zzk, this.zzb.afmaVersion)) {
                return;
            }
            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzA(false);
            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzz("");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map zze = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzg().zze();
        if (zze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzd()) {
            HashMap hashMap = new HashMap();
            for (zzbqi zzbqiVar : zze.values()) {
                for (zzbqh zzbqhVar : zzbqiVar.zza) {
                    String str = zzbqhVar.zzk;
                    for (String str2 : zzbqhVar.zzc) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzegm zza = this.zzd.zza(str3, jSONObject);
                    if (zza != null) {
                        zzfhg zzfhgVar = (zzfhg) zza.zzb;
                        if (!zzfhgVar.zzC() && zzfhgVar.zzB()) {
                            zzfhgVar.zzj(this.zza, (zzeig) zza.zzc, (List) entry.getValue());
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfgp e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        zzfhn.zzb(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzu.zzr().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return this.zzb.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzk() {
        if (this.zzo) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbdz.zza(this.zza);
        com.google.android.gms.ads.internal.zzu.zzo().zzu(this.zza, this.zzb);
        this.zzm.zzc();
        com.google.android.gms.ads.internal.zzu.zzc().zzi(this.zza);
        this.zzo = true;
        this.zzf.zzr();
        this.zze.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdV)).booleanValue()) {
            this.zzh.zzc();
        }
        this.zzi.zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjd)).booleanValue()) {
            zzcbr.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmv
                @Override // java.lang.Runnable
                public final void run() {
                    zzcna.this.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkC)).booleanValue()) {
            zzcbr.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmx
                @Override // java.lang.Runnable
                public final void run() {
                    zzcna.this.zzw();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcJ)).booleanValue()) {
            zzcbr.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmw
                @Override // java.lang.Runnable
                public final void run() {
                    zzcna.this.zzd();
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.ads.internal.client.zzco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzl(java.lang.String r12, com.google.android.gms.dynamic.IObjectWrapper r13) {
        /*
            r11 = this;
            android.content.Context r0 = r11.zza
            com.google.android.gms.internal.ads.zzbdz.zza(r0)
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzdZ
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2b
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: android.os.RemoteException -> L21
            android.content.Context r0 = r11.zza     // Catch: android.os.RemoteException -> L21
            java.lang.String r0 = com.google.android.gms.ads.internal.util.zzt.zzp(r0)     // Catch: android.os.RemoteException -> L21
            goto L2d
        L21:
            r0 = move-exception
            java.lang.String r1 = "NonagonMobileAdsSettingManager_AppId"
            com.google.android.gms.internal.ads.zzcbh r2 = com.google.android.gms.ads.internal.zzu.zzo()
            r2.zzw(r0, r1)
        L2b:
            java.lang.String r0 = ""
        L2d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r2 != r1) goto L36
            r6 = r12
            goto L37
        L36:
            r6 = r0
        L37:
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 == 0) goto L3e
            goto L93
        L3e:
            com.google.android.gms.internal.ads.zzbdq r12 = com.google.android.gms.internal.ads.zzbdz.zzdT
            com.google.android.gms.internal.ads.zzbdx r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r12 = r0.zza(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzaQ
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r12 = r12 | r0
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzaQ
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7d
            java.lang.Object r12 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r13)
            java.lang.Runnable r12 = (java.lang.Runnable) r12
            com.google.android.gms.internal.ads.zzcmy r13 = new com.google.android.gms.internal.ads.zzcmy
            r13.<init>()
            goto L7f
        L7d:
            r13 = 0
            r2 = r12
        L7f:
            r7 = r13
            if (r2 == 0) goto L93
            android.content.Context r4 = r11.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r5 = r11.zzb
            com.google.android.gms.internal.ads.zzflk r8 = r11.zzk
            com.google.android.gms.internal.ads.zzduh r9 = r11.zzn
            java.lang.Long r10 = r11.zzp
            com.google.android.gms.ads.internal.zzf r3 = com.google.android.gms.ads.internal.zzu.zza()
            r3.zza(r4, r5, r6, r7, r8, r9, r10)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcna.zzl(java.lang.String, com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(com.google.android.gms.ads.internal.client.zzda zzdaVar) throws RemoteException {
        this.zzi.zzh(zzdaVar, zzdxe.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
        zzauVar.zzn(str);
        zzauVar.zzo(this.zzb.afmaVersion);
        zzauVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbqo zzbqoVar) throws RemoteException {
        this.zzl.zzf(zzbqoVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzp(boolean z) {
        com.google.android.gms.ads.internal.zzu.zzr().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzq(float f) {
        com.google.android.gms.ads.internal.zzu.zzr().zzd(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzr(String str) {
        zzbdz.zza(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdT)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zza().zza(this.zza, this.zzb, str, null, this.zzk, null, null);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbnd zzbndVar) throws RemoteException {
        this.zzf.zzs(zzbndVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjo)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzy(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(com.google.android.gms.ads.internal.client.zzff zzffVar) throws RemoteException {
        this.zzg.zzn(this.zza, zzffVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized boolean zzv() {
        return com.google.android.gms.ads.internal.zzu.zzr().zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzw() {
        this.zzj.zza(new zzbvx());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) throws RemoteException {
        try {
            zzfts.zzi(this.zza).zzn(z);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }
}
