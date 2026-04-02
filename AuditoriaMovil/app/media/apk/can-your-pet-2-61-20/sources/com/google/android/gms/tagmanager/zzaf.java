package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzaf implements zzdf {
    final /* synthetic */ zzak zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaf(zzak zzakVar, zzae zzaeVar) {
        this.zza = zzakVar;
    }

    @Override // com.google.android.gms.tagmanager.zzdf
    public final void zza(int i) {
        zzal zzalVar;
        zzz zzzVar;
        zzz zzzVar2;
        zzal zzalVar2;
        if (i == 4) {
            zzalVar2 = this.zza.zzi;
            zzalVar2.zzc();
        }
        synchronized (this.zza) {
            if (!this.zza.isReady()) {
                zzzVar = this.zza.zzl;
                if (zzzVar != null) {
                    zzak zzakVar = this.zza;
                    zzzVar2 = zzakVar.zzl;
                    zzakVar.setResult(zzzVar2);
                } else {
                    zzak zzakVar2 = this.zza;
                    zzakVar2.setResult(zzakVar2.createFailedResult(Status.RESULT_TIMEOUT));
                }
            }
        }
        zzalVar = this.zza.zzi;
        this.zza.zzr(zzalVar.zzb());
    }
}
