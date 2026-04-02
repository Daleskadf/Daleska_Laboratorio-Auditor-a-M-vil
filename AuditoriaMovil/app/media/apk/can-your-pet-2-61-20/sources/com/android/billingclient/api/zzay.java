package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.play_billing.zzhs;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes.dex */
public final class zzay implements ServiceConnection {
    final /* synthetic */ BillingClientImpl zza;
    private final Object zzb = new Object();
    private boolean zzc = false;
    private BillingClientStateListener zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzay(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, zzax zzaxVar) {
        this.zza = billingClientImpl;
        this.zzd = billingClientStateListener;
    }

    private final void zzd(BillingResult billingResult) {
        synchronized (this.zzb) {
            BillingClientStateListener billingClientStateListener = this.zzd;
            if (billingClientStateListener != null) {
                billingClientStateListener.onBillingSetupFinished(billingResult);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service connected.");
        BillingClientImpl.zzN(this.zza, com.google.android.gms.internal.play_billing.zzr.zzu(iBinder));
        Callable callable = new Callable() { // from class: com.android.billingclient.api.zzav
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzay.this.zza();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.zzaw
            @Override // java.lang.Runnable
            public final void run() {
                zzay.this.zzb();
            }
        };
        BillingClientImpl billingClientImpl = this.zza;
        if (BillingClientImpl.zzw(billingClientImpl, callable, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, runnable, BillingClientImpl.zze(billingClientImpl)) == null) {
            BillingClientImpl billingClientImpl2 = this.zza;
            BillingResult zzi = BillingClientImpl.zzi(billingClientImpl2);
            BillingClientImpl.zzh(billingClientImpl2).zza(zzbx.zzb(25, 6, zzi));
            zzd(zzi);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing service disconnected.");
        BillingClientImpl.zzh(this.zza).zzd(zzhs.zzA());
        BillingClientImpl.zzN(this.zza, null);
        BillingClientImpl.zzx(this.zza, 0);
        synchronized (this.zzb) {
            BillingClientStateListener billingClientStateListener = this.zzd;
            if (billingClientStateListener != null) {
                billingClientStateListener.onBillingServiceDisconnected();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object zza() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzay.zza():java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        BillingClientImpl.zzx(this.zza, 0);
        BillingClientImpl.zzN(this.zza, null);
        BillingClientImpl.zzh(this.zza).zza(zzbx.zzb(24, 6, zzca.zzn));
        zzd(zzca.zzn);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        synchronized (this.zzb) {
            this.zzd = null;
            this.zzc = true;
        }
    }
}
