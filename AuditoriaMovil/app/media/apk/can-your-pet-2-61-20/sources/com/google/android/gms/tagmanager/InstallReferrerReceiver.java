package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public final class InstallReferrerReceiver extends CampaignTrackingReceiver {
    protected final void zza(Context context, String str) {
        zzcw.zzd(str);
        zzff.zza(context, "gtm_install_referrer", "referrer", str);
        zzcw.zzc(context, str);
    }
}
