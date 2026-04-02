package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfuv extends zzfvh {
    final /* synthetic */ zzfup zza;
    final /* synthetic */ zzfvd zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfuy zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfuv(zzfuy zzfuyVar, TaskCompletionSource taskCompletionSource, zzfup zzfupVar, zzfvd zzfvdVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zza = zzfupVar;
        this.zzb = zzfvdVar;
        this.zzc = taskCompletionSource2;
        this.zzd = zzfuyVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzftz] */
    @Override // com.google.android.gms.internal.ads.zzfvh
    protected final void zza() {
        zzfvg zzfvgVar;
        String str;
        String str2;
        try {
            ?? zze = this.zzd.zza.zze();
            if (zze == 0) {
                return;
            }
            zzfup zzfupVar = this.zza;
            str2 = this.zzd.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfupVar.zzb());
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", zzfupVar.zza());
            zze.zze(bundle, new zzfux(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzfuy zzfuyVar = this.zzd;
            zzfvgVar = zzfuy.zzb;
            str = zzfuyVar.zzd;
            zzfvgVar.zzb(e, "dismiss overlay display from: %s", str);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}
