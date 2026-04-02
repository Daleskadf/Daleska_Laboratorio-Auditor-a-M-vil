package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzang implements zzadf {
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzanf
        @Override // com.google.android.gms.internal.ads.zzadm
        public final /* synthetic */ zzadf[] zza(Uri uri, Map map) {
            int i = zzadl.zza;
            zzadm zzadmVar = zzang.zza;
            return new zzadf[]{new zzang()};
        }
    };
    private final zzanh zzb = new zzanh(null, 0);
    private final zzfo zzc = new zzfo(16384);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzadf
    public final int zzb(zzadg zzadgVar, zzaec zzaecVar) throws IOException {
        int zza2 = zzadgVar.zza(this.zzc.zzM(), 0, 16384);
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzK(0);
        this.zzc.zzJ(zza2);
        if (!this.zzd) {
            this.zzb.zzd(0L, 4);
            this.zzd = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final /* synthetic */ List zzc() {
        return zzfzn.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzd(zzadi zzadiVar) {
        this.zzb.zzb(zzadiVar, new zzapa(Integer.MIN_VALUE, 0, 1));
        zzadiVar.zzD();
        zzadiVar.zzO(new zzaee(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zze(long j, long j2) {
        this.zzd = false;
        this.zzb.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
        r16.zzj();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
        if ((r4 - r3) >= 8192) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
        return false;
     */
    @Override // com.google.android.gms.internal.ads.zzadf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzf(com.google.android.gms.internal.ads.zzadg r16) throws java.io.IOException {
        /*
            r15 = this;
            com.google.android.gms.internal.ads.zzfo r0 = new com.google.android.gms.internal.ads.zzfo
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.zzM()
            r5 = r16
            com.google.android.gms.internal.ads.zzact r5 = (com.google.android.gms.internal.ads.zzact) r5
            r5.zzm(r4, r2, r1, r2)
            r0.zzK(r2)
            int r4 = r0.zzo()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L9a
            r16.zzj()
            r5.zzl(r3, r2)
            r4 = r3
        L28:
            r1 = 0
        L29:
            byte[] r6 = r0.zzM()
            r8 = 7
            r5.zzm(r6, r2, r8, r2)
            r0.zzK(r2)
            int r6 = r0.zzq()
            r9 = 44096(0xac40, float:6.1792E-41)
            r10 = 44097(0xac41, float:6.1793E-41)
            if (r6 == r9) goto L52
            if (r6 == r10) goto L52
            r16.zzj()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L51
            r5.zzl(r4, r2)
            goto L28
        L51:
            return r2
        L52:
            r9 = 1
            int r1 = r1 + r9
            r11 = 4
            if (r1 < r11) goto L58
            return r9
        L58:
            byte[] r9 = r0.zzM()
            int r12 = com.google.android.gms.internal.ads.zzach.zza
            int r12 = r9.length
            r13 = -1
            if (r12 >= r8) goto L64
            r12 = -1
            goto L91
        L64:
            r12 = 2
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r14 = r9[r7]
            int r12 = r12 << 8
            r14 = r14 & 255(0xff, float:3.57E-43)
            r12 = r12 | r14
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r12 != r14) goto L8b
            r11 = r9[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 5
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 16
            int r12 = r12 << 8
            r14 = 6
            r9 = r9[r14]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r11 = r11 | r12
            r12 = r11 | r9
            goto L8c
        L8b:
            r8 = 4
        L8c:
            if (r6 != r10) goto L90
            int r8 = r8 + 2
        L90:
            int r12 = r12 + r8
        L91:
            if (r12 != r13) goto L94
            return r2
        L94:
            int r12 = r12 + (-7)
            r5.zzl(r12, r2)
            goto L29
        L9a:
            r0.zzL(r7)
            int r4 = r0.zzl()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzl(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzang.zzf(com.google.android.gms.internal.ads.zzadg):boolean");
    }
}
