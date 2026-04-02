package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zznl implements zznx {
    final /* synthetic */ zzni zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zznl(zzni zzniVar) {
        this.zza = zzniVar;
    }

    @Override // com.google.android.gms.measurement.internal.zznx
    public final void zza(String str, String str2, Bundle bundle) {
        zzhm zzhmVar;
        zzhm zzhmVar2;
        if (TextUtils.isEmpty(str)) {
            zzhmVar = this.zza.zzm;
            if (zzhmVar != null) {
                zzhmVar2 = this.zza.zzm;
                zzhmVar2.zzj().zzg().zza("AppId not known when logging event", str2);
                return;
            }
            return;
        }
        this.zza.zzl().zzb(new zzno(this, str, str2, bundle));
    }
}
