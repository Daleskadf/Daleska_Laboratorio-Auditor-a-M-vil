package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdmk {
    private final zzdri zza;
    private final zzdpx zzb;
    private final zzcqr zzc;
    private final zzdlg zzd;

    public zzdmk(zzdri zzdriVar, zzdpx zzdpxVar, zzcqr zzcqrVar, zzdlg zzdlgVar) {
        this.zza = zzdriVar;
        this.zzb = zzdpxVar;
        this.zzc = zzcqrVar;
        this.zzd = zzdlgVar;
    }

    public final View zza() throws zzcgy {
        zzcgm zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view = (View) zza;
        view.setVisibility(8);
        zza.zzae("/sendMessageToSdk", new zzbky() { // from class: com.google.android.gms.internal.ads.zzdmf
            @Override // com.google.android.gms.internal.ads.zzbky
            public final void zza(Object obj, Map map) {
                zzdmk.this.zzb((zzcgm) obj, map);
            }
        });
        zza.zzae("/adMuted", new zzbky() { // from class: com.google.android.gms.internal.ads.zzdmg
            @Override // com.google.android.gms.internal.ads.zzbky
            public final void zza(Object obj, Map map) {
                zzdmk.this.zzc((zzcgm) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/loadHtml", new zzbky() { // from class: com.google.android.gms.internal.ads.zzdmh
            @Override // com.google.android.gms.internal.ads.zzbky
            public final void zza(Object obj, final Map map) {
                zzcgm zzcgmVar = (zzcgm) obj;
                zzcic zzN = zzcgmVar.zzN();
                final zzdmk zzdmkVar = zzdmk.this;
                zzN.zzB(new zzcia() { // from class: com.google.android.gms.internal.ads.zzdme
                    @Override // com.google.android.gms.internal.ads.zzcia
                    public final void zza(boolean z, int i, String str, String str2) {
                        zzdmk.this.zzd(map, z, i, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcgmVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcgmVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/showOverlay", new zzbky() { // from class: com.google.android.gms.internal.ads.zzdmi
            @Override // com.google.android.gms.internal.ads.zzbky
            public final void zza(Object obj, Map map) {
                zzdmk.this.zze((zzcgm) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/hideOverlay", new zzbky() { // from class: com.google.android.gms.internal.ads.zzdmj
            @Override // com.google.android.gms.internal.ads.zzbky
            public final void zza(Object obj, Map map) {
                zzdmk.this.zzf((zzcgm) obj, map);
            }
        });
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcgm zzcgmVar, Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcgm zzcgmVar, Map map) {
        this.zzd.zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Map map, boolean z, int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzj("sendMessageToNativeJs", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzcgm zzcgmVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Showing native ads overlay.");
        zzcgmVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcgm zzcgmVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Hiding native ads overlay.");
        zzcgmVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
