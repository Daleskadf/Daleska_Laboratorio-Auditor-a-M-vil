package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaov implements zzaon {
    final /* synthetic */ zzaow zza;
    private final zzfn zzb = new zzfn(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzaov(zzaow zzaowVar, int i) {
        this.zza = zzaowVar;
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza(zzfo zzfoVar) {
        List list;
        SparseArray sparseArray;
        int i;
        zzadi zzadiVar;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        zzfv zzfvVar;
        zzadi zzadiVar2;
        SparseArray sparseArray2;
        SparseBooleanArray sparseBooleanArray3;
        zzaoz zzaozVar;
        zzfv zzfvVar2;
        if (zzfoVar.zzm() != 2) {
            return;
        }
        list = this.zza.zzb;
        zzfv zzfvVar3 = (zzfv) list.get(0);
        if ((zzfoVar.zzm() & 128) != 0) {
            zzfoVar.zzL(1);
            int zzq = zzfoVar.zzq();
            int i2 = 3;
            zzfoVar.zzL(3);
            zzfoVar.zzF(this.zzb, 2);
            this.zzb.zzm(3);
            int i3 = 13;
            this.zza.zzr = this.zzb.zzd(13);
            zzfoVar.zzF(this.zzb, 2);
            int i4 = 4;
            this.zzb.zzm(4);
            int i5 = 12;
            zzfoVar.zzL(this.zzb.zzd(12));
            this.zzc.clear();
            this.zzd.clear();
            int zzb = zzfoVar.zzb();
            while (zzb > 0) {
                int i6 = 5;
                zzfoVar.zzF(this.zzb, 5);
                zzfn zzfnVar = this.zzb;
                int zzd = zzfnVar.zzd(8);
                zzfnVar.zzm(i2);
                int zzd2 = this.zzb.zzd(i3);
                this.zzb.zzm(i4);
                int zzd3 = this.zzb.zzd(i5);
                int zzd4 = zzfoVar.zzd();
                int i7 = zzd4 + zzd3;
                String str = null;
                ArrayList arrayList = null;
                int i8 = -1;
                int i9 = 0;
                while (zzfoVar.zzd() < i7) {
                    int zzm = zzfoVar.zzm();
                    int zzd5 = zzfoVar.zzd() + zzfoVar.zzm();
                    if (zzd5 > i7) {
                        break;
                    }
                    if (zzm == i6) {
                        long zzu = zzfoVar.zzu();
                        if (zzu != 1094921523) {
                            if (zzu != 1161904947) {
                                if (zzu != 1094921524) {
                                    if (zzu == 1212503619) {
                                        zzfvVar2 = zzfvVar3;
                                        i8 = 36;
                                    }
                                    zzfvVar2 = zzfvVar3;
                                }
                                zzfvVar2 = zzfvVar3;
                                i8 = 172;
                            }
                            zzfvVar2 = zzfvVar3;
                            i8 = 135;
                        }
                        zzfvVar2 = zzfvVar3;
                        i8 = 129;
                    } else {
                        if (zzm != 106) {
                            if (zzm != 122) {
                                if (zzm == 127) {
                                    int zzm2 = zzfoVar.zzm();
                                    if (zzm2 != 21) {
                                        if (zzm2 == 14) {
                                            zzfvVar2 = zzfvVar3;
                                            i8 = 136;
                                        } else {
                                            if (zzm2 == 33) {
                                                zzfvVar2 = zzfvVar3;
                                                i8 = 139;
                                            }
                                            zzfvVar2 = zzfvVar3;
                                        }
                                    }
                                    zzfvVar2 = zzfvVar3;
                                    i8 = 172;
                                } else if (zzm == 123) {
                                    zzfvVar2 = zzfvVar3;
                                    i8 = 138;
                                } else if (zzm == 10) {
                                    String trim = zzfoVar.zzA(i2, zzfwd.zzc).trim();
                                    i9 = zzfoVar.zzm();
                                    zzfvVar2 = zzfvVar3;
                                    str = trim;
                                } else if (zzm == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (zzfoVar.zzd() < zzd5) {
                                        String trim2 = zzfoVar.zzA(i2, zzfwd.zzc).trim();
                                        int zzm3 = zzfoVar.zzm();
                                        zzfv zzfvVar4 = zzfvVar3;
                                        byte[] bArr = new byte[i4];
                                        zzfoVar.zzG(bArr, 0, i4);
                                        arrayList2.add(new zzaox(trim2, zzm3, bArr));
                                        zzfvVar3 = zzfvVar4;
                                        i2 = 3;
                                        i4 = 4;
                                    }
                                    zzfvVar2 = zzfvVar3;
                                    arrayList = arrayList2;
                                    i8 = 89;
                                } else {
                                    zzfvVar2 = zzfvVar3;
                                    if (zzm == 111) {
                                        i8 = 257;
                                    }
                                }
                            }
                            zzfvVar2 = zzfvVar3;
                            i8 = 135;
                        }
                        zzfvVar2 = zzfvVar3;
                        i8 = 129;
                    }
                    zzfoVar.zzL(zzd5 - zzfoVar.zzd());
                    zzfvVar3 = zzfvVar2;
                    i2 = 3;
                    i4 = 4;
                    i6 = 5;
                }
                zzfv zzfvVar5 = zzfvVar3;
                zzfoVar.zzK(i7);
                zzaoy zzaoyVar = new zzaoy(i8, str, i9, arrayList, Arrays.copyOfRange(zzfoVar.zzM(), zzd4, i7));
                if (zzd == 6 || zzd == 5) {
                    zzd = zzaoyVar.zza;
                }
                zzb -= zzd3 + 5;
                sparseBooleanArray3 = this.zza.zzh;
                if (!sparseBooleanArray3.get(zzd2)) {
                    zzaozVar = this.zza.zze;
                    zzapb zza = zzaozVar.zza(zzd, zzaoyVar);
                    this.zzd.put(zzd2, zzd2);
                    this.zzc.put(zzd2, zza);
                }
                zzfvVar3 = zzfvVar5;
                i2 = 3;
                i4 = 4;
                i5 = 12;
                i3 = 13;
            }
            zzfv zzfvVar6 = zzfvVar3;
            int size = this.zzd.size();
            int i10 = 0;
            while (i10 < size) {
                SparseIntArray sparseIntArray = this.zzd;
                zzaow zzaowVar = this.zza;
                int keyAt = sparseIntArray.keyAt(i10);
                int valueAt = sparseIntArray.valueAt(i10);
                sparseBooleanArray = zzaowVar.zzh;
                sparseBooleanArray.put(keyAt, true);
                sparseBooleanArray2 = this.zza.zzi;
                sparseBooleanArray2.put(valueAt, true);
                zzapb zzapbVar = (zzapb) this.zzc.valueAt(i10);
                if (zzapbVar != null) {
                    zzadiVar2 = this.zza.zzl;
                    zzapa zzapaVar = new zzapa(zzq, keyAt, 8192);
                    zzfvVar = zzfvVar6;
                    zzapbVar.zzb(zzfvVar, zzadiVar2, zzapaVar);
                    sparseArray2 = this.zza.zzg;
                    sparseArray2.put(valueAt, zzapbVar);
                } else {
                    zzfvVar = zzfvVar6;
                }
                i10++;
                zzfvVar6 = zzfvVar;
            }
            zzaow zzaowVar2 = this.zza;
            int i11 = this.zze;
            sparseArray = zzaowVar2.zzg;
            sparseArray.remove(i11);
            this.zza.zzm = 0;
            zzaow zzaowVar3 = this.zza;
            i = zzaowVar3.zzm;
            if (i == 0) {
                zzadiVar = zzaowVar3.zzl;
                zzadiVar.zzD();
                this.zza.zzn = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzfv zzfvVar, zzadi zzadiVar, zzapa zzapaVar) {
    }
}
