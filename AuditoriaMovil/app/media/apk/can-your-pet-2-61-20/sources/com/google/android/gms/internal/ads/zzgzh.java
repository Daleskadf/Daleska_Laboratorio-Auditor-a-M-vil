package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgzh extends zzgzg {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgzg
    public final int zza(Map.Entry entry) {
        return ((zzgzs) entry.getKey()).zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgzg
    public final zzgzk zzb(Object obj) {
        return ((zzgzr) obj).zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgzg
    public final zzgzk zzc(Object obj) {
        zzgzr zzgzrVar = (zzgzr) obj;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgzg
    public final Object zzd(zzgzf zzgzfVar, zzhbl zzhblVar, int i) {
        return zzgzfVar.zzc(zzhblVar, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgzg
    public final void zzf(Object obj) {
        ((zzgzr) obj).zza.zzi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgzg
    public final void zzg(zzhby zzhbyVar, Object obj, zzgzf zzgzfVar, zzgzk zzgzkVar) throws IOException {
        zzgzt zzgztVar = (zzgzt) obj;
        zzgzkVar.zzk(zzgztVar.zzd, zzhbyVar.zzs(zzgztVar.zzc.getClass(), zzgzfVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgzg
    public final void zzh(zzgyj zzgyjVar, Object obj, zzgzf zzgzfVar, zzgzk zzgzkVar) throws IOException {
        zzgzt zzgztVar = (zzgzt) obj;
        zzhbk zzcY = zzgztVar.zzc.zzcY();
        zzgyt zzl = zzgyjVar.zzl();
        zzcY.zzaW(zzl, zzgzfVar);
        zzgzkVar.zzk(zzgztVar.zzd, zzcY.zzbs());
        zzl.zzz(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgzg
    public final boolean zzi(zzhbl zzhblVar) {
        return zzhblVar instanceof zzgzr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgzg
    public final void zzj(zzgzb zzgzbVar, Map.Entry entry) throws IOException {
        zzgzs zzgzsVar = (zzgzs) entry.getKey();
        if (zzgzsVar.zzd) {
            zzhdn zzhdnVar = zzhdn.DOUBLE;
            switch (zzgzsVar.zzc.ordinal()) {
                case 0:
                    zzhci.zzw(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                    return;
                case 1:
                    zzhci.zzA(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                    return;
                case 2:
                    zzhci.zzD(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                    return;
                case 3:
                    zzhci.zzL(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                    return;
                case 4:
                    zzhci.zzC(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                    return;
                case 5:
                    zzhci.zzz(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                    return;
                case 6:
                    zzhci.zzy(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                    return;
                case 7:
                    zzhci.zzu(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                    return;
                case 8:
                    zzhci.zzJ(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    zzhci.zzB(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzhbv.zza().zzb(list.get(0).getClass()));
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    zzhci.zzE(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzhbv.zza().zzb(list2.get(0).getClass()));
                    return;
                case 11:
                    zzhci.zzv(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar);
                    return;
                case 12:
                    zzhci.zzK(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                    return;
                case 13:
                    zzhci.zzC(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                    return;
                case 14:
                    zzhci.zzF(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                    return;
                case 15:
                    zzhci.zzG(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                    return;
                case 16:
                    zzhci.zzH(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                    return;
                case 17:
                    zzhci.zzI(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                    return;
                default:
                    return;
            }
        }
        zzhdn zzhdnVar2 = zzhdn.DOUBLE;
        switch (zzgzsVar.zzc.ordinal()) {
            case 0:
                zzgzbVar.zzf(zzgzsVar.zzb, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzgzbVar.zzo(zzgzsVar.zzb, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzgzbVar.zzt(zzgzsVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzgzbVar.zzK(zzgzsVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzgzbVar.zzr(zzgzsVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzgzbVar.zzm(zzgzsVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzgzbVar.zzk(zzgzsVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzgzbVar.zzb(zzgzsVar.zzb, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzgzbVar.zzG(zzgzsVar.zzb, (String) entry.getValue());
                return;
            case 9:
                zzgzbVar.zzq(zzgzsVar.zzb, entry.getValue(), zzhbv.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzgzbVar.zzv(zzgzsVar.zzb, entry.getValue(), zzhbv.zza().zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzgzbVar.zzd(zzgzsVar.zzb, (zzgyj) entry.getValue());
                return;
            case 12:
                zzgzbVar.zzI(zzgzsVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzgzbVar.zzr(zzgzsVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzgzbVar.zzx(zzgzsVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzgzbVar.zzz(zzgzsVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzgzbVar.zzB(zzgzsVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzgzbVar.zzD(zzgzsVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0246, code lost:
        if (r8 != 10) goto L56;
     */
    @Override // com.google.android.gms.internal.ads.zzgzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zze(java.lang.Object r7, com.google.android.gms.internal.ads.zzhby r8, java.lang.Object r9, com.google.android.gms.internal.ads.zzgzf r10, com.google.android.gms.internal.ads.zzgzk r11, java.lang.Object r12, com.google.android.gms.internal.ads.zzhcx r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgzh.zze(java.lang.Object, com.google.android.gms.internal.ads.zzhby, java.lang.Object, com.google.android.gms.internal.ads.zzgzf, com.google.android.gms.internal.ads.zzgzk, java.lang.Object, com.google.android.gms.internal.ads.zzhcx):java.lang.Object");
    }
}
