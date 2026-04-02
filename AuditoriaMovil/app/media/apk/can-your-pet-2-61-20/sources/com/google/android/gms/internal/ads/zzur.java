package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzur implements zzxa {
    private final zzfzn zza;
    private long zzb;

    public zzur(List list, List list2) {
        zzfzk zzfzkVar = new zzfzk();
        zzek.zzd(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            zzfzkVar.zzf(new zzuq((zzxa) list.get(i), (List) list2.get(i)));
        }
        this.zza = zzfzkVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzb() {
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        for (int i = 0; i < this.zza.size(); i++) {
            zzuq zzuqVar = (zzuq) this.zza.get(i);
            long zzb = zzuqVar.zzb();
            if ((zzuqVar.zza().contains(1) || zzuqVar.zza().contains(2) || zzuqVar.zza().contains(4)) && zzb != Long.MIN_VALUE) {
                j = Math.min(j, zzb);
            }
            if (zzb != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzb);
            }
        }
        if (j != Long.MAX_VALUE) {
            this.zzb = j;
            return j;
        } else if (j2 != Long.MAX_VALUE) {
            long j3 = this.zzb;
            return j3 != -9223372036854775807L ? j3 : j2;
        } else {
            return Long.MIN_VALUE;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzc() {
        long j = Long.MAX_VALUE;
        for (int i = 0; i < this.zza.size(); i++) {
            long zzc = ((zzuq) this.zza.get(i)).zzc();
            if (zzc != Long.MIN_VALUE) {
                j = Math.min(j, zzc);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzm(long j) {
        for (int i = 0; i < this.zza.size(); i++) {
            ((zzuq) this.zza.get(i)).zzm(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final boolean zzo(zzlg zzlgVar) {
        boolean z;
        boolean z2 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (int i = 0; i < this.zza.size(); i++) {
                long zzc2 = ((zzuq) this.zza.get(i)).zzc();
                boolean z3 = zzc2 != Long.MIN_VALUE && zzc2 <= zzlgVar.zza;
                if (zzc2 == zzc || z3) {
                    z |= ((zzuq) this.zza.get(i)).zzo(zzlgVar);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final boolean zzp() {
        for (int i = 0; i < this.zza.size(); i++) {
            if (((zzuq) this.zza.get(i)).zzp()) {
                return true;
            }
        }
        return false;
    }
}
