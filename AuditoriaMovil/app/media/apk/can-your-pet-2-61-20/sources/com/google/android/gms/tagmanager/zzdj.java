package com.google.android.gms.tagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzdj extends BroadcastReceiver {
    static final String zza = "com.google.android.gms.tagmanager.zzdj";
    private final zzex zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdj(zzex zzexVar) {
        this.zzb = zzexVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            Bundle extras = intent.getExtras();
            Boolean bool = Boolean.FALSE;
            if (extras != null) {
                bool = Boolean.valueOf(intent.getExtras().getBoolean("noConnectivity"));
            }
            this.zzb.zzc(!bool.booleanValue());
        } else if (!"com.google.analytics.RADIO_POWERED".equals(action) || intent.hasExtra(zza)) {
        } else {
            this.zzb.zzb();
        }
    }
}
