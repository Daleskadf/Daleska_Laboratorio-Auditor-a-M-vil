package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhcb {
    private final ArrayDeque zza = new ArrayDeque();

    private zzhcb() {
    }

    public static /* bridge */ /* synthetic */ zzgyj zza(zzhcb zzhcbVar, zzgyj zzgyjVar, zzgyj zzgyjVar2) {
        zzhcbVar.zzb(zzgyjVar);
        zzhcbVar.zzb(zzgyjVar2);
        zzgyj zzgyjVar3 = (zzgyj) zzhcbVar.zza.pop();
        while (!zzhcbVar.zza.isEmpty()) {
            zzgyjVar3 = new zzhcf((zzgyj) zzhcbVar.zza.pop(), zzgyjVar3);
        }
        return zzgyjVar3;
    }

    private final void zzb(zzgyj zzgyjVar) {
        zzgyj zzgyjVar2;
        zzgyj zzgyjVar3;
        if (zzgyjVar.zzh()) {
            int zzc = zzc(zzgyjVar.zzd());
            ArrayDeque arrayDeque = this.zza;
            int zzc2 = zzhcf.zzc(zzc + 1);
            if (arrayDeque.isEmpty() || ((zzgyj) this.zza.peek()).zzd() >= zzc2) {
                this.zza.push(zzgyjVar);
                return;
            }
            int zzc3 = zzhcf.zzc(zzc);
            zzgyj zzgyjVar4 = (zzgyj) this.zza.pop();
            while (!this.zza.isEmpty() && ((zzgyj) this.zza.peek()).zzd() < zzc3) {
                zzgyjVar4 = new zzhcf((zzgyj) this.zza.pop(), zzgyjVar4);
            }
            zzhcf zzhcfVar = new zzhcf(zzgyjVar4, zzgyjVar);
            while (!this.zza.isEmpty()) {
                ArrayDeque arrayDeque2 = this.zza;
                if (((zzgyj) arrayDeque2.peek()).zzd() >= zzhcf.zzc(zzc(zzhcfVar.zzd()) + 1)) {
                    break;
                }
                zzhcfVar = new zzhcf((zzgyj) this.zza.pop(), zzhcfVar);
            }
            this.zza.push(zzhcfVar);
        } else if (!(zzgyjVar instanceof zzhcf)) {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(zzgyjVar.getClass()))));
        } else {
            zzhcf zzhcfVar2 = (zzhcf) zzgyjVar;
            zzgyjVar2 = zzhcfVar2.zzd;
            zzb(zzgyjVar2);
            zzgyjVar3 = zzhcfVar2.zze;
            zzb(zzgyjVar3);
        }
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzhcf.zza, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    public /* synthetic */ zzhcb(zzhca zzhcaVar) {
    }
}
