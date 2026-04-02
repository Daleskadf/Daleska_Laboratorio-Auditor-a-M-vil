package com.google.android.gms.internal.ads;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzpf {
    public static final zzpf zza;
    public final int zzb;
    public final int zzc;
    private final zzfzs zzd;

    static {
        zzpf zzpfVar;
        if (zzfx.zza >= 33) {
            zzfzr zzfzrVar = new zzfzr();
            for (int i = 1; i <= 10; i++) {
                zzfzrVar.zzf(Integer.valueOf(zzfx.zzh(i)));
            }
            zzpfVar = new zzpf(2, zzfzrVar.zzi());
        } else {
            zzpfVar = new zzpf(2, 10);
        }
        zza = zzpfVar;
    }

    public zzpf(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = null;
    }

    public zzpf(int i, Set set) {
        this.zzb = i;
        zzfzs zzl = zzfzs.zzl(set);
        this.zzd = zzl;
        zzgbt it = zzl.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzpf) {
            zzpf zzpfVar = (zzpf) obj;
            return this.zzb == zzpfVar.zzb && this.zzc == zzpfVar.zzc && zzfx.zzG(this.zzd, zzpfVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        zzfzs zzfzsVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzfzsVar == null ? 0 : zzfzsVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        return "AudioProfile[format=" + this.zzb + ", maxChannelCount=" + this.zzc + ", channelMasks=" + valueOf + "]";
    }

    public final int zza(int i, zzk zzkVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (zzfx.zza >= 29) {
            return zzpd.zza(this.zzb, i, zzkVar);
        }
        Integer num = (Integer) zzph.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
        num.getClass();
        return num.intValue();
    }

    public final boolean zzb(int i) {
        if (this.zzd == null) {
            return i <= this.zzc;
        }
        int zzh = zzfx.zzh(i);
        if (zzh == 0) {
            return false;
        }
        return this.zzd.contains(Integer.valueOf(zzh));
    }
}
