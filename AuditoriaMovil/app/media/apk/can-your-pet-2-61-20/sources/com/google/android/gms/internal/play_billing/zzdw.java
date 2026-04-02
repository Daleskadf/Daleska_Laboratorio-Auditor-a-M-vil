package com.google.android.gms.internal.play_billing;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
final class zzdw extends zzdy {
    private zzdw() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdw(zzdv zzdvVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzdy
    public final void zza(Object obj, long j) {
        ((zzdk) zzfw.zzf(obj, j)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzdy
    public final void zzb(Object obj, Object obj2, long j) {
        zzdk zzdkVar = (zzdk) zzfw.zzf(obj, j);
        zzdk zzdkVar2 = (zzdk) zzfw.zzf(obj2, j);
        int size = zzdkVar.size();
        int size2 = zzdkVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzdkVar.zzc()) {
                zzdkVar = zzdkVar.zzd(size2 + size);
            }
            zzdkVar.addAll(zzdkVar2);
        }
        if (size > 0) {
            zzdkVar2 = zzdkVar;
        }
        zzfw.zzs(obj, j, zzdkVar2);
    }
}
