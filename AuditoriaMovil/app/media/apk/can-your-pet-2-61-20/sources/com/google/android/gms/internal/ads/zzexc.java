package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzexc implements zzewr {
    private final zzgep zza;
    private final Context zzb;

    public zzexc(zzgep zzgepVar, Context context) {
        this.zza = zzgepVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzexb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzexc.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzexa zzc() throws Exception {
        int i;
        boolean z;
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzu.zzp();
        int i3 = -1;
        if (com.google.android.gms.ads.internal.util.zzt.zzA(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i = type;
                i3 = ordinal;
            } else {
                i = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i2 = i3;
        } else {
            i = -2;
            z = false;
            i2 = -1;
        }
        return new zzexa(networkOperator, i, com.google.android.gms.ads.internal.zzu.zzq().zzm(this.zzb), phoneType, z, i2);
    }
}
