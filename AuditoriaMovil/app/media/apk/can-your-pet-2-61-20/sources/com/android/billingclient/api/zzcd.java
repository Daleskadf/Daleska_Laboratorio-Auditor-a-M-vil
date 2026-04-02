package com.android.billingclient.api;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.play_billing.zzgh;
import com.google.android.gms.internal.play_billing.zzgl;
import com.google.android.gms.internal.play_billing.zzgn;
import com.google.android.gms.internal.play_billing.zzgr;
import com.google.android.gms.internal.play_billing.zzgw;
import com.google.android.gms.internal.play_billing.zzgy;
import com.google.android.gms.internal.play_billing.zzhb;
import com.google.android.gms.internal.play_billing.zzhd;
import com.google.android.gms.internal.play_billing.zzhe;
import com.google.android.gms.internal.play_billing.zzhk;
import com.google.android.gms.internal.play_billing.zzhl;
import com.google.android.gms.internal.play_billing.zzhn;
import com.google.android.gms.internal.play_billing.zzho;
import com.google.android.gms.internal.play_billing.zzhs;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes.dex */
public final class zzcd implements zzby {
    private final zzhb zzb;
    private final Context zzc;
    private final zzcf zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcd(Context context, zzhb zzhbVar) {
        this.zzd = new zzcf(context);
        this.zzb = zzhbVar;
        this.zzc = context;
    }

    @Override // com.android.billingclient.api.zzby
    public final void zza(zzgh zzghVar) {
        if (zzghVar == null) {
            return;
        }
        try {
            zzhk zzz = zzhl.zzz();
            zzhb zzhbVar = this.zzb;
            if (zzhbVar != null) {
                zzz.zzl(zzhbVar);
            }
            zzz.zzi(zzghVar);
            this.zzd.zza((zzhl) zzz.zzc());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzby
    public final void zzb(zzgl zzglVar) {
        if (zzglVar == null) {
            return;
        }
        try {
            zzhk zzz = zzhl.zzz();
            zzhb zzhbVar = this.zzb;
            if (zzhbVar != null) {
                zzz.zzl(zzhbVar);
            }
            zzz.zzj(zzglVar);
            this.zzd.zza((zzhl) zzz.zzc());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzby
    public final void zzc(byte[] bArr) {
        try {
            zzg(zzgy.zzB(bArr, com.google.android.gms.internal.play_billing.zzcp.zza()));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzby
    public final void zzd(zzhs zzhsVar) {
        if (zzhsVar == null) {
            return;
        }
        try {
            zzhk zzz = zzhl.zzz();
            zzhb zzhbVar = this.zzb;
            if (zzhbVar != null) {
                zzz.zzl(zzhbVar);
            }
            zzz.zzn(zzhsVar);
            this.zzd.zza((zzhl) zzz.zzc());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzby
    public final void zze(int i, List list, boolean z, boolean z2) {
        zzgy zzgyVar;
        try {
            int i2 = zzbx.zza;
            try {
                zzgw zzz = zzgy.zzz();
                zzz.zzn(i);
                zzz.zzm(false);
                zzz.zzl(z2);
                zzz.zzi(list);
                zzgyVar = (zzgy) zzz.zzc();
            } catch (Exception e) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e);
                zzgyVar = null;
            }
            zzg(zzgyVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzby
    public final void zzf(int i, List list, List list2, BillingResult billingResult, boolean z, boolean z2) {
        zzgy zzgyVar;
        try {
            int i2 = zzbx.zza;
            try {
                zzgw zzz = zzgy.zzz();
                zzz.zzn(4);
                zzz.zzi(list);
                zzz.zzm(false);
                zzz.zzl(z2);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    Purchase purchase = (Purchase) it.next();
                    zzhn zzz2 = zzho.zzz();
                    zzz2.zzi(purchase.getProducts());
                    zzz2.zzk(purchase.getPurchaseState());
                    zzz2.zzj(purchase.getPackageName());
                    zzz.zzj(zzz2);
                }
                zzgn zzz3 = zzgr.zzz();
                zzz3.zzk(billingResult.getResponseCode());
                zzz3.zzj(billingResult.getDebugMessage());
                zzz.zzk(zzz3);
                zzgyVar = (zzgy) zzz.zzc();
            } catch (Exception e) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e);
                zzgyVar = null;
            }
            zzg(zzgyVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    final void zzg(zzgy zzgyVar) {
        if (zzgyVar == null) {
            return;
        }
        try {
            if (this.zzb != null) {
                try {
                    Context context = this.zzc;
                    String str = null;
                    ContentResolver contentResolver = context == null ? null : context.getContentResolver();
                    if (contentResolver != null) {
                        str = Settings.Secure.getString(contentResolver, "android_id");
                    }
                    int zza = str == null ? 0 : com.google.android.gms.internal.play_billing.zzbg.zza().zza(str).zza();
                    int i = com.google.android.gms.internal.play_billing.zzbk.zza;
                    long j = (zza % 100) % 100;
                    if (j < 0) {
                        j += 100;
                    }
                    if (((int) j) < 0) {
                        zzhk zzz = zzhl.zzz();
                        zzhb zzhbVar = this.zzb;
                        if (zzhbVar != null) {
                            zzz.zzl(zzhbVar);
                        }
                        zzz.zzk(zzgyVar);
                        zzhd zzz2 = zzhe.zzz();
                        zzdi.zza(this.zzc);
                        zzz2.zzi(false);
                        zzz.zzm(zzz2);
                        this.zzd.zza((zzhl) zzz.zzc());
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }
}
