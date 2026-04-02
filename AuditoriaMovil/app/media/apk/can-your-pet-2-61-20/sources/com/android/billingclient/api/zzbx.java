package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzgg;
import com.google.android.gms.internal.play_billing.zzgh;
import com.google.android.gms.internal.play_billing.zzgk;
import com.google.android.gms.internal.play_billing.zzgl;
import com.google.android.gms.internal.play_billing.zzgn;
import com.google.android.gms.internal.play_billing.zzgr;
import com.google.android.gms.internal.play_billing.zzgv;
import com.google.android.gms.internal.play_billing.zzgw;
import com.google.android.gms.internal.play_billing.zzgy;
import java.util.List;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzbx {
    public static final /* synthetic */ int zza = 0;

    static {
        com.google.android.gms.internal.play_billing.zzal zzalVar = zzby.zza;
    }

    public static zzgv zza(String str) {
        return (zzgv) zzby.zza.getOrDefault(str, zzgv.BROADCAST_ACTION_UNSPECIFIED);
    }

    public static zzgh zzb(int i, int i2, BillingResult billingResult) {
        try {
            zzgg zzz = zzgh.zzz();
            zzgn zzz2 = zzgr.zzz();
            zzz2.zzk(billingResult.getResponseCode());
            zzz2.zzj(billingResult.getDebugMessage());
            zzz2.zzl(i);
            zzz.zzi(zzz2);
            zzz.zzk(i2);
            return (zzgh) zzz.zzc();
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    public static zzgh zzc(int i, int i2, BillingResult billingResult, String str) {
        try {
            zzgn zzz = zzgr.zzz();
            zzz.zzk(billingResult.getResponseCode());
            zzz.zzj(billingResult.getDebugMessage());
            zzz.zzl(i);
            if (str != null) {
                zzz.zzi(str);
            }
            zzgg zzz2 = zzgh.zzz();
            zzz2.zzi(zzz);
            zzz2.zzk(i2);
            return (zzgh) zzz2.zzc();
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    public static zzgl zzd(int i) {
        try {
            zzgk zzz = zzgl.zzz();
            zzz.zzj(i);
            return (zzgl) zzz.zzc();
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    public static zzgy zze(int i, List list) {
        try {
            zzgw zzz = zzgy.zzz();
            zzz.zzn(3);
            zzz.zzi(list);
            return (zzgy) zzz.zzc();
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
