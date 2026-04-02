package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzais implements zzadf {
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzaiq
        @Override // com.google.android.gms.internal.ads.zzadm
        public final /* synthetic */ zzadf[] zza(Uri uri, Map map) {
            int i = zzadl.zza;
            zzadm zzadmVar = zzais.zza;
            return new zzadf[]{new zzais(0)};
        }
    };
    private static final zzaha zzb = new zzaha() { // from class: com.google.android.gms.internal.ads.zzair
    };
    private final zzfo zzc;
    private final zzadz zzd;
    private final zzadv zze;
    private final zzadx zzf;
    private final zzaem zzg;
    private zzadi zzh;
    private zzaem zzi;
    private zzaem zzj;
    private int zzk;
    private zzby zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzaiu zzq;
    private boolean zzr;

    public zzais() {
        this(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0142  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzg(com.google.android.gms.internal.ads.zzadg r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzais.zzg(com.google.android.gms.internal.ads.zzadg):int");
    }

    private final long zzh(long j) {
        return this.zzm + ((j * 1000000) / this.zzd.zzd);
    }

    private final zzaiu zzi(zzadg zzadgVar, long j, boolean z) throws IOException {
        ((zzact) zzadgVar).zzm(this.zzc.zzM(), 0, 4, false);
        this.zzc.zzK(0);
        this.zzd.zza(this.zzc.zzg());
        if (zzadgVar.zzd() != -1) {
            j = zzadgVar.zzd();
        }
        return new zzain(j, zzadgVar.zzf(), this.zzd, false);
    }

    private static boolean zzj(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean zzk(zzadg zzadgVar) throws IOException {
        zzaiu zzaiuVar = this.zzq;
        if (zzaiuVar != null) {
            long zzc = zzaiuVar.zzc();
            if (zzc != -1 && zzadgVar.zze() > zzc - 4) {
                return true;
            }
        }
        try {
            return !zzadgVar.zzm(this.zzc.zzM(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzl(zzadg zzadgVar, boolean z) throws IOException {
        int i;
        int i2;
        int zzb2;
        zzadgVar.zzj();
        if (zzadgVar.zzf() == 0) {
            zzby zza2 = this.zzf.zza(zzadgVar, null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zzb(zza2);
            }
            i2 = (int) zzadgVar.zze();
            if (!z) {
                ((zzact) zzadgVar).zzo(i2, false);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (!zzk(zzadgVar)) {
                this.zzc.zzK(0);
                int zzg = this.zzc.zzg();
                if ((i == 0 || zzj(zzg, i)) && (zzb2 = zzaea.zzb(zzg)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(zzg);
                        i = zzg;
                    }
                    ((zzact) zzadgVar).zzl(zzb2 - 4, false);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == (true != z ? 131072 : 32768)) {
                        if (z) {
                            return false;
                        }
                        throw zzcc.zza("Searched too many bytes.", null);
                    }
                    if (!z) {
                        ((zzact) zzadgVar).zzo(1, false);
                    } else {
                        zzadgVar.zzj();
                        ((zzact) zzadgVar).zzl(i2 + i5, false);
                    }
                    i4 = i5;
                    i = 0;
                    i3 = 0;
                }
            } else if (i3 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zzact) zzadgVar).zzo(i2 + i4, false);
        } else {
            zzadgVar.zzj();
        }
        this.zzk = i;
        return true;
    }

    public final void zza() {
        this.zzr = true;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final int zzb(zzadg zzadgVar, zzaec zzaecVar) throws IOException {
        zzek.zzb(this.zzi);
        int i = zzfx.zza;
        int zzg = zzg(zzadgVar);
        if (zzg == -1 && (this.zzq instanceof zzaio)) {
            if (this.zzq.zza() != zzh(this.zzn)) {
                zzaio zzaioVar = (zzaio) this.zzq;
                throw null;
            }
        }
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final /* synthetic */ List zzc() {
        return zzfzn.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzd(zzadi zzadiVar) {
        this.zzh = zzadiVar;
        zzaem zzw = zzadiVar.zzw(0, 1);
        this.zzi = zzw;
        this.zzj = zzw;
        this.zzh.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zze(long j, long j2) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzaiu zzaiuVar = this.zzq;
        if (zzaiuVar instanceof zzaio) {
            zzaio zzaioVar = (zzaio) zzaiuVar;
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final boolean zzf(zzadg zzadgVar) throws IOException {
        return zzl(zzadgVar, true);
    }

    public zzais(int i) {
        this.zzc = new zzfo(10);
        this.zzd = new zzadz();
        this.zze = new zzadv();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzadx();
        zzade zzadeVar = new zzade();
        this.zzg = zzadeVar;
        this.zzj = zzadeVar;
    }
}
