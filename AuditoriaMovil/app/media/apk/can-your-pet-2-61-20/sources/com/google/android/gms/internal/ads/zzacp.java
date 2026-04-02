package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzacp {
    protected final zzacj zza;
    protected final zzaco zzb;
    protected zzacl zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzacp(zzacm zzacmVar, zzaco zzacoVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzacoVar;
        this.zzd = i;
        this.zza = new zzacj(zzacmVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(zzadg zzadgVar, long j, zzaec zzaecVar) {
        if (j == zzadgVar.zzf()) {
            return 0;
        }
        zzaecVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzadg zzadgVar, long j) throws IOException {
        long zzf = j - zzadgVar.zzf();
        if (zzf < 0 || zzf > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        ((zzact) zzadgVar).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzadg zzadgVar, zzaec zzaecVar) throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        while (true) {
            zzacl zzaclVar = this.zzc;
            zzek.zzb(zzaclVar);
            j = zzaclVar.zzf;
            j2 = zzaclVar.zzg;
            int i2 = this.zzd;
            j3 = zzaclVar.zzh;
            if (j2 - j > i2) {
                if (zzg(zzadgVar, j3)) {
                    zzadgVar.zzj();
                    zzaco zzacoVar = this.zzb;
                    j4 = zzaclVar.zzb;
                    zzacn zza = zzacoVar.zza(zzadgVar, j4);
                    i = zza.zzb;
                    if (i == -3) {
                        zzc(false, j3);
                        return zzf(zzadgVar, j3, zzaecVar);
                    } else if (i == -2) {
                        j10 = zza.zzc;
                        j11 = zza.zzd;
                        zzacl.zzh(zzaclVar, j10, j11);
                    } else if (i == -1) {
                        j8 = zza.zzc;
                        j9 = zza.zzd;
                        zzacl.zzg(zzaclVar, j8, j9);
                    } else {
                        j5 = zza.zzd;
                        zzg(zzadgVar, j5);
                        j6 = zza.zzd;
                        zzc(true, j6);
                        j7 = zza.zzd;
                        return zzf(zzadgVar, j7, zzaecVar);
                    }
                } else {
                    return zzf(zzadgVar, j3, zzaecVar);
                }
            } else {
                zzc(false, j);
                return zzf(zzadgVar, j, zzaecVar);
            }
        }
    }

    public final zzaef zzb() {
        return this.zza;
    }

    protected final void zzc(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        zzacl zzaclVar = this.zzc;
        if (zzaclVar != null) {
            j6 = zzaclVar.zza;
            if (j6 == j) {
                return;
            }
        }
        zzacj zzacjVar = this.zza;
        long zzf = zzacjVar.zzf(j);
        j2 = zzacjVar.zzc;
        j3 = zzacjVar.zzd;
        j4 = zzacjVar.zze;
        j5 = zzacjVar.zzf;
        this.zzc = new zzacl(j, zzf, 0L, j2, j3, j4, j5);
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
