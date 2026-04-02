package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzlt implements zzvr, zzsh {
    final /* synthetic */ zzlx zza;
    private final zzlv zzb;

    public zzlt(zzlx zzlxVar, zzlv zzlvVar) {
        this.zza = zzlxVar;
        this.zzb = zzlvVar;
    }

    private final Pair zzf(int i, zzvh zzvhVar) {
        zzvh zzvhVar2;
        zzvh zzvhVar3 = null;
        if (zzvhVar != null) {
            zzlv zzlvVar = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzlvVar.zzc.size()) {
                    zzvhVar2 = null;
                    break;
                } else if (((zzvh) zzlvVar.zzc.get(i2)).zzd == zzvhVar.zzd) {
                    zzvhVar2 = zzvhVar.zza(Pair.create(zzlvVar.zzb, zzvhVar.zza));
                    break;
                } else {
                    i2++;
                }
            }
            if (zzvhVar2 == null) {
                return null;
            }
            zzvhVar3 = zzvhVar2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzvhVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzae(int i, zzvh zzvhVar, final zzvd zzvdVar) {
        zzev zzevVar;
        final Pair zzf = zzf(0, zzvhVar);
        if (zzf != null) {
            zzevVar = this.zza.zzi;
            zzevVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlr
                @Override // java.lang.Runnable
                public final void run() {
                    zzmp zzmpVar;
                    Pair pair = zzf;
                    zzmpVar = zzlt.this.zza.zzh;
                    zzmpVar.zzae(((Integer) pair.first).intValue(), (zzvh) pair.second, zzvdVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzaf(int i, zzvh zzvhVar, final zzuy zzuyVar, final zzvd zzvdVar) {
        zzev zzevVar;
        final Pair zzf = zzf(0, zzvhVar);
        if (zzf != null) {
            zzevVar = this.zza.zzi;
            zzevVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlp
                @Override // java.lang.Runnable
                public final void run() {
                    zzmp zzmpVar;
                    Pair pair = zzf;
                    zzmpVar = zzlt.this.zza.zzh;
                    zzmpVar.zzaf(((Integer) pair.first).intValue(), (zzvh) pair.second, zzuyVar, zzvdVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzag(int i, zzvh zzvhVar, final zzuy zzuyVar, final zzvd zzvdVar) {
        zzev zzevVar;
        final Pair zzf = zzf(0, zzvhVar);
        if (zzf != null) {
            zzevVar = this.zza.zzi;
            zzevVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzls
                @Override // java.lang.Runnable
                public final void run() {
                    zzmp zzmpVar;
                    Pair pair = zzf;
                    zzmpVar = zzlt.this.zza.zzh;
                    zzmpVar.zzag(((Integer) pair.first).intValue(), (zzvh) pair.second, zzuyVar, zzvdVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzah(int i, zzvh zzvhVar, final zzuy zzuyVar, final zzvd zzvdVar, final IOException iOException, final boolean z) {
        zzev zzevVar;
        final Pair zzf = zzf(0, zzvhVar);
        if (zzf != null) {
            zzevVar = this.zza.zzi;
            zzevVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlo
                @Override // java.lang.Runnable
                public final void run() {
                    zzmp zzmpVar;
                    Pair pair = zzf;
                    zzmpVar = zzlt.this.zza.zzh;
                    zzmpVar.zzah(((Integer) pair.first).intValue(), (zzvh) pair.second, zzuyVar, zzvdVar, iOException, z);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzai(int i, zzvh zzvhVar, final zzuy zzuyVar, final zzvd zzvdVar) {
        zzev zzevVar;
        final Pair zzf = zzf(0, zzvhVar);
        if (zzf != null) {
            zzevVar = this.zza.zzi;
            zzevVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlq
                @Override // java.lang.Runnable
                public final void run() {
                    zzmp zzmpVar;
                    Pair pair = zzf;
                    zzmpVar = zzlt.this.zza.zzh;
                    zzmpVar.zzai(((Integer) pair.first).intValue(), (zzvh) pair.second, zzuyVar, zzvdVar);
                }
            });
        }
    }
}
