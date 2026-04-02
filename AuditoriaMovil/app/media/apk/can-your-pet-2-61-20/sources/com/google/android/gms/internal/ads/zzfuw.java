package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfuw extends zzfvh {
    final /* synthetic */ zzfvf zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfvd zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzfuy zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfuw(zzfuy zzfuyVar, TaskCompletionSource taskCompletionSource, zzfvf zzfvfVar, int i, zzfvd zzfvdVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zza = zzfvfVar;
        this.zzb = i;
        this.zzc = zzfvdVar;
        this.zzd = taskCompletionSource2;
        this.zze = zzfuyVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzftz] */
    @Override // com.google.android.gms.internal.ads.zzfvh
    protected final void zza() {
        zzfvg zzfvgVar;
        String str;
        String str2;
        try {
            ?? zze = this.zze.zza.zze();
            if (zze == 0) {
                return;
            }
            zzfvf zzfvfVar = this.zza;
            str2 = this.zze.zzd;
            int i = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfvfVar.zzb());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", zzfvfVar.zza());
            zze.zzg(bundle, new zzfux(this.zze, this.zzc));
        } catch (RemoteException e) {
            int i2 = this.zzb;
            zzfvgVar = zzfuy.zzb;
            str = this.zze.zzd;
            zzfvgVar.zzb(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i2), str);
            this.zzd.trySetException(new RuntimeException(e));
        }
    }
}
