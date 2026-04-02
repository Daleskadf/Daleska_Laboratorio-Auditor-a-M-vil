package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzajv implements zzadf, zzaef {
    @Deprecated
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzajt
        @Override // com.google.android.gms.internal.ads.zzadm
        public final /* synthetic */ zzadf[] zza(Uri uri, Map map) {
            int i = zzadl.zza;
            zzadm zzadmVar = zzajv.zza;
            return new zzadf[]{new zzajv(zzalf.zza, 16)};
        }
    };
    private int zzA;
    private zzahq zzB;
    private final zzalf zzb;
    private final int zzc;
    private final zzfo zzd;
    private final zzfo zze;
    private final zzfo zzf;
    private final zzfo zzg;
    private final ArrayDeque zzh;
    private final zzajz zzi;
    private final List zzj;
    private zzfzn zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;
    private zzfo zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private zzadi zzv;
    private zzaju[] zzw;
    private long[][] zzx;
    private int zzy;
    private long zzz;

    @Deprecated
    public zzajv() {
        this(zzalf.zza, 16);
    }

    private static int zzi(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzj(zzake zzakeVar, long j) {
        int zza2 = zzakeVar.zza(j);
        return zza2 == -1 ? zzakeVar.zzb(j) : zza2;
    }

    private static long zzk(zzake zzakeVar, long j, long j2) {
        int zzj = zzj(zzakeVar, j);
        return zzj == -1 ? j2 : Math.min(zzakeVar.zzc[zzj], j2);
    }

    private final void zzl() {
        this.zzl = 0;
        this.zzo = 0;
    }

    private final void zzm(long j) throws zzcc {
        zzby zzbyVar;
        long j2;
        List list;
        int i;
        zzby zzbyVar2;
        int i2;
        int i3;
        while (!this.zzh.isEmpty() && ((zzaiy) this.zzh.peek()).zza == j) {
            zzaiy zzaiyVar = (zzaiy) this.zzh.pop();
            if (zzaiyVar.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i4 = this.zzA;
                zzadv zzadvVar = new zzadv();
                zzaiz zzb = zzaiyVar.zzb(1969517665);
                if (zzb != null) {
                    zzby zzb2 = zzaji.zzb(zzb);
                    zzadvVar.zzb(zzb2);
                    zzbyVar = zzb2;
                } else {
                    zzbyVar = null;
                }
                zzaiy zza2 = zzaiyVar.zza(1835365473);
                zzby zza3 = zza2 != null ? zzaji.zza(zza2) : null;
                zzbx[] zzbxVarArr = new zzbx[1];
                zzaiz zzb3 = zzaiyVar.zzb(1836476516);
                zzb3.getClass();
                boolean z = i4 == 1;
                zzbxVarArr[0] = zzaji.zzc(zzb3.zza);
                zzby zzbyVar3 = new zzby(-9223372036854775807L, zzbxVarArr);
                zzby zzbyVar4 = zzbyVar;
                long j3 = -9223372036854775807L;
                List zzd = zzaji.zzd(zzaiyVar, zzadvVar, -9223372036854775807L, null, 1 == (this.zzc & 1), z, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzajs
                    @Override // com.google.android.gms.internal.ads.zzfwf
                    public final Object apply(Object obj) {
                        zzakb zzakbVar = (zzakb) obj;
                        zzadm zzadmVar = zzajv.zza;
                        return zzakbVar;
                    }
                });
                long j4 = -9223372036854775807L;
                int i5 = 0;
                int i6 = -1;
                int i7 = 0;
                while (true) {
                    j2 = 0;
                    if (i7 >= zzd.size()) {
                        break;
                    }
                    zzake zzakeVar = (zzake) zzd.get(i7);
                    if (zzakeVar.zzb == 0) {
                        list = zzd;
                    } else {
                        zzakb zzakbVar = zzakeVar.zza;
                        list = zzd;
                        long j5 = zzakbVar.zze;
                        if (j5 == j3) {
                            j5 = zzakeVar.zzh;
                        }
                        long max = Math.max(j4, j5);
                        int i8 = i5 + 1;
                        zzaju zzajuVar = new zzaju(zzakbVar, zzakeVar, this.zzv.zzw(i5, zzakbVar.zzb));
                        if ("audio/true-hd".equals(zzakbVar.zzf.zzm)) {
                            i = zzakeVar.zze * 16;
                        } else {
                            i = zzakeVar.zze + 30;
                        }
                        zzak zzb4 = zzakbVar.zzf.zzb();
                        zzb4.zzO(i);
                        if (zzakbVar.zzb == 2) {
                            if ((this.zzc & 8) != 0) {
                                zzb4.zzU(zzakbVar.zzf.zzf | (i6 == -1 ? 1 : 2));
                            }
                            if (j5 > 0 && (i3 = zzakeVar.zzb) > 0) {
                                zzb4.zzH(i3 / (((float) j5) / 1000000.0f));
                            }
                        }
                        int i9 = zzakbVar.zzb;
                        int i10 = zzajr.zzb;
                        if (i9 == 1 && zzadvVar.zza()) {
                            zzb4.zzF(zzadvVar.zza);
                            zzb4.zzG(zzadvVar.zzb);
                        }
                        int i11 = zzakbVar.zzb;
                        zzby[] zzbyVarArr = new zzby[3];
                        if (this.zzj.isEmpty()) {
                            i2 = 0;
                            zzbyVar2 = null;
                        } else {
                            zzbyVar2 = new zzby(this.zzj);
                            i2 = 0;
                        }
                        zzbyVarArr[i2] = zzbyVar2;
                        zzbyVarArr[1] = zzbyVar4;
                        zzbyVarArr[2] = zzbyVar3;
                        int i12 = i6;
                        zzby zzbyVar5 = new zzby(-9223372036854775807L, new zzbx[i2]);
                        if (zza3 != null) {
                            for (int i13 = 0; i13 < zza3.zza(); i13++) {
                                zzbx zzb5 = zza3.zzb(i13);
                                if (zzb5 instanceof zzgb) {
                                    zzgb zzgbVar = (zzgb) zzb5;
                                    if (!zzgbVar.zza.equals("com.android.capture.fps")) {
                                        zzbyVar5 = zzbyVar5.zzc(zzgbVar);
                                    } else if (i11 == 2) {
                                        zzbyVar5 = zzbyVar5.zzc(zzgbVar);
                                    }
                                }
                            }
                        }
                        for (int i14 = 0; i14 < 3; i14++) {
                            zzbyVar5 = zzbyVar5.zzd(zzbyVarArr[i14]);
                        }
                        if (zzbyVar5.zza() > 0) {
                            zzb4.zzP(zzbyVar5);
                        }
                        zzajuVar.zzc.zzl(zzb4.zzac());
                        if (zzakbVar.zzb == 2 && i12 == -1) {
                            i6 = arrayList.size();
                            arrayList.add(zzajuVar);
                            i5 = i8;
                            j4 = max;
                        }
                        i6 = i12;
                        arrayList.add(zzajuVar);
                        i5 = i8;
                        j4 = max;
                    }
                    i7++;
                    zzd = list;
                    j3 = -9223372036854775807L;
                }
                this.zzy = i6;
                this.zzz = j4;
                zzaju[] zzajuVarArr = (zzaju[]) arrayList.toArray(new zzaju[0]);
                this.zzw = zzajuVarArr;
                int length = zzajuVarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i15 = 0; i15 < zzajuVarArr.length; i15++) {
                    jArr[i15] = new long[zzajuVarArr[i15].zzb.zzb];
                    jArr2[i15] = zzajuVarArr[i15].zzb.zzf[0];
                }
                int i16 = 0;
                while (i16 < zzajuVarArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i17 = -1;
                    for (int i18 = 0; i18 < zzajuVarArr.length; i18++) {
                        if (!zArr[i18]) {
                            long j7 = jArr2[i18];
                            if (j7 <= j6) {
                                i17 = i18;
                                j6 = j7;
                            }
                        }
                    }
                    int i19 = iArr[i17];
                    long[] jArr3 = jArr[i17];
                    jArr3[i19] = j2;
                    zzake zzakeVar2 = zzajuVarArr[i17].zzb;
                    j2 += zzakeVar2.zzd[i19];
                    int i20 = i19 + 1;
                    iArr[i17] = i20;
                    if (i20 < jArr3.length) {
                        jArr2[i17] = zzakeVar2.zzf[i20];
                    } else {
                        zArr[i17] = true;
                        i16++;
                    }
                }
                this.zzx = jArr;
                this.zzv.zzD();
                this.zzv.zzO(this);
                this.zzh.clear();
                this.zzl = 2;
            } else if (!this.zzh.isEmpty()) {
                ((zzaiy) this.zzh.peek()).zzc(zzaiyVar);
            }
        }
        if (this.zzl != 2) {
            zzl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zza() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final /* synthetic */ List zzc() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzd(zzadi zzadiVar) {
        if ((this.zzc & 16) == 0) {
            zzadiVar = new zzali(zzadiVar, this.zzb);
        }
        this.zzv = zzadiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zze(long j, long j2) {
        zzaju[] zzajuVarArr;
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        if (j == 0) {
            if (this.zzl != 3) {
                zzl();
                return;
            }
            this.zzi.zzb();
            this.zzj.clear();
            return;
        }
        for (zzaju zzajuVar : this.zzw) {
            zzake zzakeVar = zzajuVar.zzb;
            int zza2 = zzakeVar.zza(j2);
            if (zza2 == -1) {
                zza2 = zzakeVar.zzb(j2);
            }
            zzajuVar.zze = zza2;
            zzaen zzaenVar = zzajuVar.zzd;
            if (zzaenVar != null) {
                zzaenVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final boolean zzf(zzadg zzadgVar) throws IOException {
        zzaej zzb = zzaka.zzb(zzadgVar, (this.zzc & 2) != 0);
        this.zzk = zzb != null ? zzfzn.zzn(zzb) : zzfzn.zzm();
        return zzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaed zzg(long j) {
        long j2;
        long j3;
        int zzb;
        zzaju[] zzajuVarArr = this.zzw;
        if (zzajuVarArr.length == 0) {
            zzaeg zzaegVar = zzaeg.zza;
            return new zzaed(zzaegVar, zzaegVar);
        }
        int i = this.zzy;
        long j4 = -1;
        if (i != -1) {
            zzake zzakeVar = zzajuVarArr[i].zzb;
            int zzj = zzj(zzakeVar, j);
            if (zzj == -1) {
                zzaeg zzaegVar2 = zzaeg.zza;
                return new zzaed(zzaegVar2, zzaegVar2);
            }
            long j5 = zzakeVar.zzf[zzj];
            j2 = zzakeVar.zzc[zzj];
            if (j5 >= j || zzj >= zzakeVar.zzb - 1 || (zzb = zzakeVar.zzb(j)) == -1 || zzb == zzj) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zzakeVar.zzf[zzb];
                j4 = zzakeVar.zzc[zzb];
            }
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzaju[] zzajuVarArr2 = this.zzw;
            if (i2 >= zzajuVarArr2.length) {
                break;
            }
            if (i2 != this.zzy) {
                zzake zzakeVar2 = zzajuVarArr2[i2].zzb;
                long zzk = zzk(zzakeVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = zzk(zzakeVar2, j3, j4);
                }
                j2 = zzk;
            }
            i2++;
        }
        zzaeg zzaegVar3 = new zzaeg(j, j2);
        return j3 == -9223372036854775807L ? new zzaed(zzaegVar3, zzaegVar3) : new zzaed(zzaegVar3, new zzaeg(j3, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final boolean zzh() {
        return true;
    }

    public zzajv(zzalf zzalfVar, int i) {
        this.zzb = zzalfVar;
        this.zzc = i;
        this.zzk = zzfzn.zzm();
        this.zzl = (i & 4) != 0 ? 3 : 0;
        this.zzi = new zzajz();
        this.zzj = new ArrayList();
        this.zzg = new zzfo(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzfo(zzgl.zza);
        this.zze = new zzfo(4);
        this.zzf = new zzfo();
        this.zzq = -1;
        this.zzv = zzadi.zza;
        this.zzw = new zzaju[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x03e6, code lost:
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    @Override // com.google.android.gms.internal.ads.zzadf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadg r33, com.google.android.gms.internal.ads.zzaec r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajv.zzb(com.google.android.gms.internal.ads.zzadg, com.google.android.gms.internal.ads.zzaec):int");
    }
}
