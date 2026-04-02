package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfuu extends zzfvh {
    final /* synthetic */ zzfva zza;
    final /* synthetic */ zzfvd zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfuy zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfuu(zzfuy zzfuyVar, TaskCompletionSource taskCompletionSource, zzfva zzfvaVar, zzfvd zzfvdVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zza = zzfvaVar;
        this.zzb = zzfvdVar;
        this.zzc = taskCompletionSource2;
        this.zzd = zzfuyVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzftz] */
    @Override // com.google.android.gms.internal.ads.zzfvh
    protected final void zza() {
        zzfvg zzfvgVar;
        String str;
        String str2;
        String str3;
        try {
            ?? zze = this.zzd.zza.zze();
            if (zze == 0) {
                return;
            }
            zzfuy zzfuyVar = this.zzd;
            str2 = zzfuyVar.zzd;
            zzfva zzfvaVar = this.zza;
            str3 = zzfuyVar.zzd;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", zzfvaVar.zzf());
            bundle.putString("adFieldEnifd", zzfvaVar.zzg());
            bundle.putInt("layoutGravity", zzfvaVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfvaVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzfvaVar.zze());
            bundle.putString("deeplinkUrl", null);
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str3);
            if (zzfvaVar.zzh() != null) {
                bundle.putString("appId", zzfvaVar.zzh());
            }
            zze.zzf(str2, bundle, new zzfux(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzfuy zzfuyVar2 = this.zzd;
            zzfvgVar = zzfuy.zzb;
            str = zzfuyVar2.zzd;
            zzfvgVar.zzb(e, "show overlay display from: %s", str);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}
