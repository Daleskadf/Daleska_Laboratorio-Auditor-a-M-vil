package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzfz {
    private final ArrayDeque zza = new ArrayDeque();

    private zzfz() {
    }

    public static /* bridge */ /* synthetic */ zzdf zza(zzfz zzfzVar, zzdf zzdfVar, zzdf zzdfVar2) {
        zzfzVar.zzb(zzdfVar);
        zzfzVar.zzb(zzdfVar2);
        zzdf zzdfVar3 = (zzdf) zzfzVar.zza.pop();
        while (!zzfzVar.zza.isEmpty()) {
            zzdfVar3 = new zzgd((zzdf) zzfzVar.zza.pop(), zzdfVar3);
        }
        return zzdfVar3;
    }

    private final void zzb(zzdf zzdfVar) {
        zzdf zzdfVar2;
        zzdf zzdfVar3;
        if (zzdfVar.zzh()) {
            int zzc = zzc(zzdfVar.zzd());
            ArrayDeque arrayDeque = this.zza;
            int zzc2 = zzgd.zzc(zzc + 1);
            if (!arrayDeque.isEmpty() && ((zzdf) this.zza.peek()).zzd() < zzc2) {
                int zzc3 = zzgd.zzc(zzc);
                zzdf zzdfVar4 = (zzdf) this.zza.pop();
                while (!this.zza.isEmpty() && ((zzdf) this.zza.peek()).zzd() < zzc3) {
                    zzdfVar4 = new zzgd((zzdf) this.zza.pop(), zzdfVar4);
                }
                zzgd zzgdVar = new zzgd(zzdfVar4, zzdfVar);
                while (!this.zza.isEmpty()) {
                    ArrayDeque arrayDeque2 = this.zza;
                    if (((zzdf) arrayDeque2.peek()).zzd() >= zzgd.zzc(zzc(zzgdVar.zzd()) + 1)) {
                        break;
                    }
                    zzgdVar = new zzgd((zzdf) this.zza.pop(), zzgdVar);
                }
                this.zza.push(zzgdVar);
                return;
            }
            this.zza.push(zzdfVar);
        } else if (zzdfVar instanceof zzgd) {
            zzgd zzgdVar2 = (zzgd) zzdfVar;
            zzdfVar2 = zzgdVar2.zzd;
            zzb(zzdfVar2);
            zzdfVar3 = zzgdVar2.zze;
            zzb(zzdfVar3);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzdfVar.getClass())));
        }
    }

    private static final int zzc(int i7) {
        int binarySearch = Arrays.binarySearch(zzgd.zza, i7);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }

    public /* synthetic */ zzfz(zzfy zzfyVar) {
    }
}
