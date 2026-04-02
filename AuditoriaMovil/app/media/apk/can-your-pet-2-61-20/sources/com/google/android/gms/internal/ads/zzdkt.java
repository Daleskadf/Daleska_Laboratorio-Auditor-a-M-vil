package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdkt extends zzctv {
    public static final zzfzn zzc = zzfzn.zzr("3010", "3008", "1005", "1009", "2011", "2007");
    private final zzbaa zzA;
    private final Executor zzd;
    private final zzdky zze;
    private final zzdlg zzf;
    private final zzdly zzg;
    private final zzdld zzh;
    private final zzdlj zzi;
    private final zzhip zzj;
    private final zzhip zzk;
    private final zzhip zzl;
    private final zzhip zzm;
    private final zzhip zzn;
    private zzdmu zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzbzz zzs;
    private final zzawo zzt;
    private final VersionInfoParcel zzu;
    private final Context zzv;
    private final zzdkv zzw;
    private final zzeod zzx;
    private final Map zzy;
    private final List zzz;

    public zzdkt(zzctu zzctuVar, Executor executor, zzdky zzdkyVar, zzdlg zzdlgVar, zzdly zzdlyVar, zzdld zzdldVar, zzdlj zzdljVar, zzhip zzhipVar, zzhip zzhipVar2, zzhip zzhipVar3, zzhip zzhipVar4, zzhip zzhipVar5, zzbzz zzbzzVar, zzawo zzawoVar, VersionInfoParcel versionInfoParcel, Context context, zzdkv zzdkvVar, zzeod zzeodVar, zzbaa zzbaaVar) {
        super(zzctuVar);
        this.zzd = executor;
        this.zze = zzdkyVar;
        this.zzf = zzdlgVar;
        this.zzg = zzdlyVar;
        this.zzh = zzdldVar;
        this.zzi = zzdljVar;
        this.zzj = zzhipVar;
        this.zzk = zzhipVar2;
        this.zzl = zzhipVar3;
        this.zzm = zzhipVar4;
        this.zzn = zzhipVar5;
        this.zzs = zzbzzVar;
        this.zzt = zzawoVar;
        this.zzu = versionInfoParcel;
        this.zzv = context;
        this.zzw = zzdkvVar;
        this.zzx = zzeodVar;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
        this.zzA = zzbaaVar;
    }

    public static boolean zzW(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkn)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        long zzw = com.google.android.gms.ads.internal.util.zzt.zzw(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (zzw >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzko)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized View zzY(Map map) {
        if (map != null) {
            zzfzn zzfznVar = zzc;
            int size = zzfznVar.size();
            int i = 0;
            while (i < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzfznVar.get(i));
                i++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzZ() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhV)).booleanValue()) {
            zzdmu zzdmuVar = this.zzo;
            if (zzdmuVar == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
                return null;
            }
            IObjectWrapper zzj = zzdmuVar.zzj();
            if (zzj != null) {
                return (ImageView.ScaleType) ObjectWrapper.unwrap(zzj);
            }
            return zzdly.zza;
        }
        return null;
    }

    private final void zzaa(String str, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfc)).booleanValue()) {
            zzf("Google", true);
            return;
        }
        ListenableFuture zzw = this.zze.zzw();
        if (zzw == null) {
            return;
        }
        zzgee.zzr(zzw, new zzdkr(this, "Google", true), this.zzd);
    }

    private final synchronized void zzab(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzq(view, map, map2, zzZ());
        this.zzq = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(View view, zzfmy zzfmyVar) {
        zzcgm zzr = this.zze.zzr();
        if (!this.zzh.zzd() || zzfmyVar == null || zzr == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzA().zzh(zzfmyVar, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzad */
    public final synchronized void zzy(zzdmu zzdmuVar) {
        Iterator<String> keys;
        View view;
        zzawk zzc2;
        if (!this.zzp) {
            this.zzo = zzdmuVar;
            this.zzg.zze(zzdmuVar);
            this.zzf.zzy(zzdmuVar.zzf(), zzdmuVar.zzm(), zzdmuVar.zzn(), zzdmuVar, zzdmuVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcy)).booleanValue() && (zzc2 = this.zzt.zzc()) != null) {
                zzc2.zzo(zzdmuVar.zzf());
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbK)).booleanValue()) {
                zzffn zzffnVar = this.zzb;
                if (zzffnVar.zzal && (keys = zzffnVar.zzak.keys()) != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                        this.zzy.put(next, false);
                        if (weakReference != null && (view = (View) weakReference.get()) != null) {
                            zzazz zzazzVar = new zzazz(this.zzv, view);
                            this.zzz.add(zzazzVar);
                            zzazzVar.zzc(new zzdkq(this, next));
                        }
                    }
                }
            }
            if (zzdmuVar.zzi() != null) {
                zzdmuVar.zzi().zzc(this.zzs);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzae */
    public final void zzz(zzdmu zzdmuVar) {
        this.zzf.zzz(zzdmuVar.zzf(), zzdmuVar.zzl());
        if (zzdmuVar.zzh() != null) {
            zzdmuVar.zzh().setClickable(false);
            zzdmuVar.zzh().removeAllViews();
        }
        if (zzdmuVar.zzi() != null) {
            zzdmuVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public final synchronized void zzA(View view, Map map, Map map2, boolean z) {
        if (!this.zzq) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbK)).booleanValue() && this.zzb.zzal) {
                for (String str : this.zzy.keySet()) {
                    if (!((Boolean) this.zzy.get(str)).booleanValue()) {
                        break;
                    }
                }
            }
            if (!z) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdN)).booleanValue() && map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        View view2 = (View) ((WeakReference) entry.getValue()).get();
                        if (view2 != null && zzW(view2)) {
                            zzab(view, map, map2);
                            return;
                        }
                    }
                }
            } else {
                View zzY = zzY(map);
                if (zzY == null) {
                    zzab(view, map, map2);
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdO)).booleanValue()) {
                    if (zzW(zzY)) {
                        zzab(view, map, map2);
                    }
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdP)).booleanValue()) {
                        Rect rect = new Rect();
                        if (zzY.getGlobalVisibleRect(rect, null) && zzY.getHeight() == rect.height() && zzY.getWidth() == rect.width()) {
                            zzab(view, map, map2);
                        }
                    } else {
                        zzab(view, map, map2);
                    }
                }
            }
        }
    }

    public final synchronized void zzB(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        this.zzf.zzj(zzcwVar);
    }

    public final synchronized void zzC(View view, View view2, Map map, Map map2, boolean z) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzk(view, view2, map, map2, z, zzZ());
        if (this.zzr) {
            zzdky zzdkyVar = this.zze;
            if (zzdkyVar.zzs() != null) {
                zzdkyVar.zzs().zzd("onSdkAdUserInteractionClick", new ArrayMap());
            }
        }
    }

    public final synchronized void zzD(final View view, final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlj)).booleanValue()) {
            zzdmu zzdmuVar = this.zzo;
            if (zzdmuVar == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                return;
            }
            final boolean z = zzdmuVar instanceof zzdls;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkn
                @Override // java.lang.Runnable
                public final void run() {
                    zzdkt.this.zzw(view, z, i);
                }
            });
        }
    }

    public final synchronized void zzE(String str) {
        this.zzf.zzl(str);
    }

    public final synchronized void zzF(Bundle bundle) {
        this.zzf.zzm(bundle);
    }

    public final synchronized void zzG() {
        zzdmu zzdmuVar = this.zzo;
        if (zzdmuVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        final boolean z = zzdmuVar instanceof zzdls;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkp
            @Override // java.lang.Runnable
            public final void run() {
                zzdkt.this.zzx(z);
            }
        });
    }

    public final synchronized void zzH() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzr();
    }

    public final void zzI(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfc)).booleanValue()) {
            zzac(view, this.zze.zzu());
            return;
        }
        zzcbw zzp = this.zze.zzp();
        if (zzp == null) {
            return;
        }
        zzgee.zzr(zzp, new zzdks(this, view), this.zzd);
    }

    public final synchronized void zzJ(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzs(view, motionEvent, view2);
    }

    public final synchronized void zzK(Bundle bundle) {
        this.zzf.zzt(bundle);
    }

    public final synchronized void zzL(View view) {
        this.zzf.zzu(view);
    }

    public final synchronized void zzM() {
        this.zzf.zzv();
    }

    public final synchronized void zzN(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzf.zzw(zzcsVar);
    }

    public final synchronized void zzO(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzx.zza(zzdgVar);
    }

    public final synchronized void zzP(zzbiy zzbiyVar) {
        this.zzf.zzx(zzbiyVar);
    }

    public final synchronized void zzQ(final zzdmu zzdmuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbI)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkj
                @Override // java.lang.Runnable
                public final void run() {
                    zzdkt.this.zzy(zzdmuVar);
                }
            });
        } else {
            zzy(zzdmuVar);
        }
    }

    public final synchronized void zzR(final zzdmu zzdmuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbI)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkk
                @Override // java.lang.Runnable
                public final void run() {
                    zzdkt.this.zzz(zzdmuVar);
                }
            });
        } else {
            zzz(zzdmuVar);
        }
    }

    public final boolean zzS() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzT() {
        return this.zzf.zzA();
    }

    public final synchronized boolean zzU() {
        return this.zzf.zzB();
    }

    public final boolean zzV() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzX(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzC = this.zzf.zzC(bundle);
        this.zzq = zzC;
        return zzC;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdko
            @Override // java.lang.Runnable
            public final void run() {
                zzdkt.this.zzv();
            }
        });
        super.zzb();
    }

    public final zzdkv zzc() {
        return this.zzw;
    }

    public final zzfmy zzf(String str, boolean z) {
        String str2;
        zzege zzegeVar;
        zzege zzegeVar2;
        zzegd zzegdVar;
        if (!this.zzh.zzd() || TextUtils.isEmpty(str)) {
            return null;
        }
        zzdky zzdkyVar = this.zze;
        zzcgm zzr = zzdkyVar.zzr();
        zzcgm zzs = zzdkyVar.zzs();
        if (zzr != null || zzs != null) {
            boolean z2 = false;
            boolean z3 = zzr != null;
            boolean z4 = zzs != null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfa)).booleanValue()) {
                this.zzh.zza();
                int zzb = this.zzh.zza().zzb();
                int i = zzb - 1;
                if (i != 0) {
                    if (i != 1) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Unknown omid media type: " + (zzb != 1 ? zzb != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                        return null;
                    } else if (zzr == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid media type was display but there was no display webview.");
                        return null;
                    } else {
                        z2 = true;
                        z4 = false;
                    }
                } else if (zzs == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid media type was video but there was no video webview.");
                    return null;
                } else {
                    z4 = true;
                }
            } else {
                z2 = z3;
            }
            if (z2) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzr = zzs;
            }
            zzr.zzG();
            if (!com.google.android.gms.ads.internal.zzu.zzA().zzj(this.zzv)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            VersionInfoParcel versionInfoParcel = this.zzu;
            String str3 = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
            if (z4) {
                zzegdVar = zzegd.VIDEO;
                zzegeVar2 = zzege.DEFINED_BY_JAVASCRIPT;
            } else {
                zzdky zzdkyVar2 = this.zze;
                zzegd zzegdVar2 = zzegd.NATIVE_DISPLAY;
                if (zzdkyVar2.zzc() == 3) {
                    zzegeVar = zzege.UNSPECIFIED;
                } else {
                    zzegeVar = zzege.ONE_PIXEL;
                }
                zzegeVar2 = zzegeVar;
                zzegdVar = zzegdVar2;
            }
            zzfmy zzb2 = com.google.android.gms.ads.internal.zzu.zzA().zzb(str3, zzr.zzG(), "", "javascript", str2, str, zzegeVar2, zzegdVar, this.zzb.zzam);
            if (zzb2 == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to create omid session in InternalNativeAd");
                return null;
            }
            this.zze.zzW(zzb2);
            zzr.zzaq(zzb2);
            if (z4) {
                com.google.android.gms.ads.internal.zzu.zzA().zzh(zzb2, zzs.zzF());
                this.zzr = true;
            }
            if (z) {
                com.google.android.gms.ads.internal.zzu.zzA().zzi(zzb2);
                zzr.zzd("onSdkLoaded", new ArrayMap());
            }
            return zzb2;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid display and video webview are null. Skipping initialization.");
        return null;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2, zzZ());
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    public final void zzj() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkl
            @Override // java.lang.Runnable
            public final void run() {
                zzdkt.zzr(zzdkt.this);
            }
        });
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            final zzdlg zzdlgVar = this.zzf;
            Objects.requireNonNull(zzdlgVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkm
                @Override // java.lang.Runnable
                public final void run() {
                    zzdlg.this.zzp();
                }
            });
        }
        super.zzj();
    }

    public final synchronized JSONObject zzk(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzZ());
    }

    public final void zzt(View view) {
        zzfmy zzu = this.zze.zzu();
        if (!this.zzh.zzd() || zzu == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzA().zzf(zzu, view);
    }

    public final synchronized void zzu() {
        this.zzf.zzh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzv() {
        this.zzf.zzi();
        this.zze.zzI();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzw(View view, boolean z, int i) {
        this.zzf.zzo(view, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzZ(), i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzx(boolean z) {
        this.zzf.zzo(null, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzZ(), 0);
    }

    public static /* synthetic */ void zzr(zzdkt zzdktVar) {
        try {
            zzdky zzdkyVar = zzdktVar.zze;
            int zzc2 = zzdkyVar.zzc();
            if (zzc2 == 1) {
                if (zzdktVar.zzi.zzb() != null) {
                    zzdktVar.zzaa("Google", true);
                    zzdktVar.zzi.zzb().zze((zzbhv) zzdktVar.zzj.zzb());
                }
            } else if (zzc2 == 2) {
                if (zzdktVar.zzi.zza() != null) {
                    zzdktVar.zzaa("Google", true);
                    zzdktVar.zzi.zza().zze((zzbht) zzdktVar.zzk.zzb());
                }
            } else if (zzc2 == 3) {
                if (zzdktVar.zzi.zzd(zzdkyVar.zzA()) != null) {
                    if (zzdktVar.zze.zzs() != null) {
                        zzdktVar.zzf("Google", true);
                    }
                    zzdktVar.zzi.zzd(zzdktVar.zze.zzA()).zze((zzbhy) zzdktVar.zzn.zzb());
                }
            } else if (zzc2 == 6) {
                if (zzdktVar.zzi.zzf() != null) {
                    zzdktVar.zzaa("Google", true);
                    zzdktVar.zzi.zzf().zze((zzbjb) zzdktVar.zzl.zzb());
                }
            } else if (zzc2 != 7) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Wrong native template id!");
            } else {
                zzdlj zzdljVar = zzdktVar.zzi;
                if (zzdljVar.zzg() != null) {
                    zzdljVar.zzg().zzg((zzbnl) zzdktVar.zzm.zzb());
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }
}
