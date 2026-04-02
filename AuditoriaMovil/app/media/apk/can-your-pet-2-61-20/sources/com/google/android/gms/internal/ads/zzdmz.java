package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzdmz implements zzdlg {
    private final zzbrd zza;
    private final zzczi zzb;
    private final zzcyo zzc;
    private final zzdgl zzd;
    private final Context zze;
    private final zzffn zzf;
    private final VersionInfoParcel zzg;
    private final zzfgi zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzbqz zzl;
    private final zzbra zzm;

    public zzdmz(zzbqz zzbqzVar, zzbra zzbraVar, zzbrd zzbrdVar, zzczi zzcziVar, zzcyo zzcyoVar, zzdgl zzdglVar, Context context, zzffn zzffnVar, VersionInfoParcel versionInfoParcel, zzfgi zzfgiVar) {
        this.zzl = zzbqzVar;
        this.zzm = zzbraVar;
        this.zza = zzbrdVar;
        this.zzb = zzcziVar;
        this.zzc = zzcyoVar;
        this.zzd = zzdglVar;
        this.zze = context;
        this.zzf = zzffnVar;
        this.zzg = versionInfoParcel;
        this.zzh = zzfgiVar;
    }

    private final void zzb(View view) {
        try {
            zzbrd zzbrdVar = this.zza;
            if (zzbrdVar == null || zzbrdVar.zzA()) {
                zzbqz zzbqzVar = this.zzl;
                if (zzbqzVar == null || zzbqzVar.zzx()) {
                    zzbra zzbraVar = this.zzm;
                    if (zzbraVar == null || zzbraVar.zzv()) {
                        return;
                    }
                    this.zzm.zzq(ObjectWrapper.wrap(view));
                    this.zzc.onAdClicked();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkv)).booleanValue()) {
                        this.zzd.zzdG();
                        return;
                    }
                    return;
                }
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkv)).booleanValue()) {
                    this.zzd.zzdG();
                    return;
                }
                return;
            }
            this.zza.zzw(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkv)).booleanValue()) {
                this.zzd.zzdG();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call handleClick", e);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            synchronized (map) {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        hashMap.put((String) entry.getKey(), view);
                    }
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final boolean zzB() {
        return this.zzf.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzj(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzk(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzM) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzo(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.zzj) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzf.zzM) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            zzb(view2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzu.zzs().zzn(this.zze, this.zzg.afmaVersion, this.zzf.zzD.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbrd zzbrdVar = this.zza;
                if (zzbrdVar == null || zzbrdVar.zzB()) {
                    zzbqz zzbqzVar = this.zzl;
                    if (zzbqzVar == null || zzbqzVar.zzy()) {
                        zzbra zzbraVar = this.zzm;
                        if (zzbraVar == null || zzbraVar.zzw()) {
                            return;
                        }
                        this.zzm.zzr();
                        this.zzb.zza();
                        return;
                    }
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                this.zza.zzx();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzv() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzx(zzbiy zzbiyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        IObjectWrapper zzn;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzak;
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbx)).booleanValue() && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzby)).booleanValue() && next.equals("3010")) {
                                zzbrd zzbrdVar = this.zza;
                                Object obj2 = null;
                                if (zzbrdVar != null) {
                                    try {
                                        zzn = zzbrdVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbqz zzbqzVar = this.zzl;
                                    if (zzbqzVar != null) {
                                        zzn = zzbqzVar.zzk();
                                    } else {
                                        zzbra zzbraVar = this.zzm;
                                        zzn = zzbraVar != null ? zzbraVar.zzj() : null;
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = ObjectWrapper.unwrap(zzn);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList<String> arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbw.zzc(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzu.zzp();
                                ClassLoader classLoader = this.zze.getClassLoader();
                                for (String str : arrayList) {
                                    if (Class.forName(str, false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.zzk = z;
            HashMap zzc = zzc(map);
            HashMap zzc2 = zzc(map2);
            zzbrd zzbrdVar2 = this.zza;
            if (zzbrdVar2 != null) {
                zzbrdVar2.zzy(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                return;
            }
            zzbqz zzbqzVar2 = this.zzl;
            if (zzbqzVar2 != null) {
                zzbqzVar2.zzv(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzl.zzu(wrap);
                return;
            }
            zzbra zzbraVar2 = this.zzm;
            if (zzbraVar2 != null) {
                zzbraVar2.zzt(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzm.zzs(wrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzz(View view, Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbrd zzbrdVar = this.zza;
            if (zzbrdVar != null) {
                zzbrdVar.zzz(wrap);
                return;
            }
            zzbqz zzbqzVar = this.zzl;
            if (zzbqzVar != null) {
                zzbqzVar.zzw(wrap);
                return;
            }
            zzbra zzbraVar = this.zzm;
            if (zzbraVar != null) {
                zzbraVar.zzu(wrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call untrackView", e);
        }
    }
}
