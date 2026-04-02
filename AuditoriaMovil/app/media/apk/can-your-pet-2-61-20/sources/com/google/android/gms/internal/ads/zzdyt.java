package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdyt implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;

    public zzdyt(zzhjm zzhjmVar, zzhjm zzhjmVar2) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        final CookieManager zza = com.google.android.gms.ads.internal.zzu.zzq().zza((Context) this.zzb.zzb());
        zzfkh zzfkhVar = zzfkh.WEBVIEW_COOKIE;
        zzfke zzi = zzfjx.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = zza;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaN));
            }
        }, zzfkhVar, (zzfkn) this.zza.zzb()).zzi(1L, TimeUnit.SECONDS);
        final zzdyr zzdyrVar = new zzfjq() { // from class: com.google.android.gms.internal.ads.zzdyr
            @Override // com.google.android.gms.internal.ads.zzfjq
            public final Object zza(Object obj) {
                Exception exc = (Exception) obj;
                return "";
            }
        };
        return zzi.zzc(Exception.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzfjy
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                Exception exc = (Exception) ((Throwable) obj);
                return zzgee.zzh("");
            }
        }).zza();
    }
}
