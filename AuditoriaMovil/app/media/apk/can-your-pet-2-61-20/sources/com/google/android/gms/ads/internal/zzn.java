package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.internal.ads.zzfhk;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes.dex */
public final class zzn extends WebViewClient {
    final /* synthetic */ zzt zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzbh zzbhVar;
        zzbh zzbhVar2;
        zzbh zzbhVar3;
        zzbh zzbhVar4;
        zzt zztVar = this.zza;
        zzbhVar = zztVar.zzg;
        if (zzbhVar != null) {
            try {
                zzbhVar2 = zztVar.zzg;
                zzbhVar2.zzf(zzfhk.zzd(1, null, null));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            }
        }
        zzt zztVar2 = this.zza;
        zzbhVar3 = zztVar2.zzg;
        if (zzbhVar3 != null) {
            try {
                zzbhVar4 = zztVar2.zzg;
                zzbhVar4.zze(0);
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzbh zzbhVar;
        zzbh zzbhVar2;
        zzbh zzbhVar3;
        zzbh zzbhVar4;
        zzbh zzbhVar5;
        zzbh zzbhVar6;
        zzbh zzbhVar7;
        zzbh zzbhVar8;
        zzbh zzbhVar9;
        zzbh zzbhVar10;
        zzbh zzbhVar11;
        zzbh zzbhVar12;
        zzbh zzbhVar13;
        if (str.startsWith(this.zza.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzt zztVar = this.zza;
            zzbhVar10 = zztVar.zzg;
            if (zzbhVar10 != null) {
                try {
                    zzbhVar11 = zztVar.zzg;
                    zzbhVar11.zzf(zzfhk.zzd(3, null, null));
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
                }
            }
            zzt zztVar2 = this.zza;
            zzbhVar12 = zztVar2.zzg;
            if (zzbhVar12 != null) {
                try {
                    zzbhVar13 = zztVar2.zzg;
                    zzbhVar13.zze(3);
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
                }
            }
            this.zza.zzV(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzt zztVar3 = this.zza;
            zzbhVar6 = zztVar3.zzg;
            if (zzbhVar6 != null) {
                try {
                    zzbhVar7 = zztVar3.zzg;
                    zzbhVar7.zzf(zzfhk.zzd(1, null, null));
                } catch (RemoteException e3) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e3);
                }
            }
            zzt zztVar4 = this.zza;
            zzbhVar8 = zztVar4.zzg;
            if (zzbhVar8 != null) {
                try {
                    zzbhVar9 = zztVar4.zzg;
                    zzbhVar9.zze(0);
                } catch (RemoteException e4) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
                }
            }
            this.zza.zzV(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            zzt zztVar5 = this.zza;
            zzbhVar4 = zztVar5.zzg;
            if (zzbhVar4 != null) {
                try {
                    zzbhVar5 = zztVar5.zzg;
                    zzbhVar5.zzi();
                } catch (RemoteException e5) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e5);
                }
            }
            this.zza.zzV(this.zza.zzb(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            zzt zztVar6 = this.zza;
            zzbhVar = zztVar6.zzg;
            if (zzbhVar != null) {
                try {
                    zzbhVar2 = zztVar6.zzg;
                    zzbhVar2.zzc();
                    zzbhVar3 = this.zza.zzg;
                    zzbhVar3.zzh();
                } catch (RemoteException e6) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e6);
                }
            }
            zzt.zzw(this.zza, zzt.zzo(this.zza, str));
            return true;
        }
    }
}
