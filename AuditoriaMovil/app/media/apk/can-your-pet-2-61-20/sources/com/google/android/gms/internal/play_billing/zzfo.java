package com.google.android.gms.internal.play_billing;

import java.io.IOException;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
final class zzfo extends zzfm {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzfm
    public final /* synthetic */ int zza(Object obj) {
        return ((zzfn) obj).zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzfm
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzfn) obj).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzfm
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzdd zzddVar = (zzdd) obj;
        zzfn zzfnVar = zzddVar.zzc;
        if (zzfnVar == zzfn.zzc()) {
            zzfn zzf = zzfn.zzf();
            zzddVar.zzc = zzf;
            return zzf;
        }
        return zzfnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzfm
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzdd) obj).zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzfm
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (zzfn.zzc().equals(obj2)) {
            return obj;
        }
        if (zzfn.zzc().equals(obj)) {
            return zzfn.zze((zzfn) obj, (zzfn) obj2);
        }
        ((zzfn) obj).zzd((zzfn) obj2);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzfm
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i, long j) {
        ((zzfn) obj).zzj(i << 3, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzfm
    public final void zzg(Object obj) {
        ((zzdd) obj).zzc.zzh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzfm
    public final /* synthetic */ void zzh(Object obj, Object obj2) {
        ((zzdd) obj).zzc = (zzfn) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzfm
    public final /* synthetic */ void zzi(Object obj, zzge zzgeVar) throws IOException {
        ((zzfn) obj).zzk(zzgeVar);
    }
}
