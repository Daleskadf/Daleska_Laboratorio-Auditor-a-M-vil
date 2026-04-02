package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzand implements zzadf {
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzanc
        @Override // com.google.android.gms.internal.ads.zzadm
        public final /* synthetic */ zzadf[] zza(Uri uri, Map map) {
            int i = zzadl.zza;
            zzadm zzadmVar = zzand.zza;
            return new zzadf[]{new zzand()};
        }
    };
    private final zzane zzb = new zzane(null, 0);
    private final zzfo zzc = new zzfo(2786);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzadf
    public final int zzb(zzadg zzadgVar, zzaec zzaecVar) throws IOException {
        int zza2 = zzadgVar.zza(this.zzc.zzM(), 0, 2786);
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
        if ((r4 - r3) >= 8192) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
        r9.zzj();
        r4 = r4 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzadf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzf(com.google.android.gms.internal.ads.zzadg r9) throws java.io.IOException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzfo r0 = new com.google.android.gms.internal.ads.zzfo
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.zzM()
            r5 = r9
            com.google.android.gms.internal.ads.zzact r5 = (com.google.android.gms.internal.ads.zzact) r5
            r5.zzm(r4, r2, r1, r2)
            r0.zzK(r2)
            int r4 = r0.zzo()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L62
            r9.zzj()
            r5.zzl(r3, r2)
            r4 = r3
        L26:
            r1 = 0
        L27:
            byte[] r6 = r0.zzM()
            r7 = 6
            r5.zzm(r6, r2, r7, r2)
            r0.zzK(r2)
            int r6 = r0.zzq()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r6 == r7) goto L4a
            r9.zzj()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L49
            r5.zzl(r4, r2)
            goto L26
        L49:
            return r2
        L4a:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L50
            return r6
        L50:
            byte[] r6 = r0.zzM()
            int r6 = com.google.android.gms.internal.ads.zzace.zzb(r6)
            r7 = -1
            if (r6 != r7) goto L5c
            return r2
        L5c:
            int r6 = r6 + (-6)
            r5.zzl(r6, r2)
            goto L27
        L62:
            r4 = 3
            r0.zzL(r4)
            int r4 = r0.zzl()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzl(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzand.zzf(com.google.android.gms.internal.ads.zzadg):boolean");
    }
}
