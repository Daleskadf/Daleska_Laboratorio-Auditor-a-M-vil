package com.google.android.gms.internal.ads;

import androidx.browser.customtabs.CustomTabsSession;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbez extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbfa zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbez(zzbfa zzbfaVar, String str) {
        this.zza = str;
        this.zzb = zzbfaVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        CustomTabsSession customTabsSession;
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbfa zzbfaVar = this.zzb;
            customTabsSession = zzbfaVar.zzd;
            customTabsSession.postMessage(zzbfaVar.zzc(this.zza, str).toString(), null);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error creating PACT Error Response JSON: ", e);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        CustomTabsSession customTabsSession;
        String query = queryInfo.getQuery();
        try {
            zzbfa zzbfaVar = this.zzb;
            customTabsSession = zzbfaVar.zzd;
            customTabsSession.postMessage(zzbfaVar.zzd(this.zza, query).toString(), null);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error creating PACT Signal Response JSON: ", e);
        }
    }
}
