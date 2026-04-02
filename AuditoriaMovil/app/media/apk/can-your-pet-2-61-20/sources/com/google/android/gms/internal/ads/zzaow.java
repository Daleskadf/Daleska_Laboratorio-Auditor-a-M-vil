package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaow implements zzadf {
    @Deprecated
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzaot
        @Override // com.google.android.gms.internal.ads.zzadm
        public final /* synthetic */ zzadf[] zza(Uri uri, Map map) {
            int i = zzadl.zza;
            zzadm zzadmVar = zzaow.zza;
            return new zzadf[]{new zzaow(1, 1, zzalf.zza, new zzfv(0L), new zzanl(0), 112800)};
        }
    };
    private final List zzb;
    private final zzfo zzc;
    private final SparseIntArray zzd;
    private final zzaoz zze;
    private final zzalf zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzaos zzj;
    private zzaor zzk;
    private zzadi zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzaow() {
        this(1, 1, zzalf.zza, new zzfv(0L), new zzanl(0), 112800);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b3, code lost:
        if (r1 == false) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzadf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadg r19, com.google.android.gms.internal.ads.zzaec r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaow.zzb(com.google.android.gms.internal.ads.zzadg, com.google.android.gms.internal.ads.zzaec):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final /* synthetic */ List zzc() {
        return zzfzn.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzd(zzadi zzadiVar) {
        this.zzl = zzadiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zze(long j, long j2) {
        zzaor zzaorVar;
        int size = this.zzb.size();
        for (int i = 0; i < size; i++) {
            zzfv zzfvVar = (zzfv) this.zzb.get(i);
            if (zzfvVar.zzf() != -9223372036854775807L) {
                long zzd = zzfvVar.zzd();
                if (zzd != -9223372036854775807L) {
                    if (zzd != 0) {
                        if (zzd == j2) {
                        }
                    }
                }
            }
            zzfvVar.zzi(j2);
        }
        if (j2 != 0 && (zzaorVar = this.zzk) != null) {
            zzaorVar.zzd(j2);
        }
        this.zzc.zzH(0);
        this.zzd.clear();
        for (int i2 = 0; i2 < this.zzg.size(); i2++) {
            ((zzapb) this.zzg.valueAt(i2)).zzc();
        }
        this.zzq = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzadf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzf(com.google.android.gms.internal.ads.zzadg r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzfo r0 = r6.zzc
            byte[] r0 = r0.zzM()
            com.google.android.gms.internal.ads.zzact r7 = (com.google.android.gms.internal.ads.zzact) r7
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.zzm(r0, r2, r1, r2)
            r1 = 0
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L2b
            r3 = 0
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r1 = r1 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zzo(r1, r2)
            r7 = 1
            return r7
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaow.zzf(com.google.android.gms.internal.ads.zzadg):boolean");
    }

    public zzaow(int i, int i2, zzalf zzalfVar, zzfv zzfvVar, zzaoz zzaozVar, int i3) {
        this.zze = zzaozVar;
        this.zzf = zzalfVar;
        this.zzb = Collections.singletonList(zzfvVar);
        this.zzc = new zzfo(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzaos(112800);
        this.zzl = zzadi.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzg.put(sparseArray2.keyAt(i4), (zzapb) sparseArray2.valueAt(i4));
        }
        this.zzg.put(0, new zzaoo(new zzaou(this)));
    }
}
