package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzaku {
    private zzaem zzb;
    private zzadi zzc;
    private zzakp zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzakn zza = new zzakn();
    private zzakr zzj = new zzakr();

    protected abstract long zza(zzfo zzfoVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzb(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzakr();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean zzc(zzfo zzfoVar, long j, zzakr zzakrVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zze(zzadg zzadgVar, zzaec zzaecVar) throws IOException {
        zzek.zzb(this.zzb);
        int i = zzfx.zza;
        int i2 = this.zzh;
        if (i2 == 0) {
            while (this.zza.zze(zzadgVar)) {
                long zzf = zzadgVar.zzf();
                long j = this.zzf;
                this.zzk = zzf - j;
                if (zzc(this.zza.zza(), j, this.zzj)) {
                    this.zzf = zzadgVar.zzf();
                } else {
                    zzam zzamVar = this.zzj.zza;
                    this.zzi = zzamVar.zzA;
                    if (!this.zzm) {
                        this.zzb.zzl(zzamVar);
                        this.zzm = true;
                    }
                    zzakp zzakpVar = this.zzj.zzb;
                    if (zzakpVar != null) {
                        this.zzd = zzakpVar;
                    } else if (zzadgVar.zzd() == -1) {
                        this.zzd = new zzakt(null);
                    } else {
                        zzako zzb = this.zza.zzb();
                        this.zzd = new zzaki(this, this.zzf, zzadgVar.zzd(), zzb.zzd + zzb.zze, zzb.zzb, (zzb.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                }
            }
            this.zzh = 3;
            return -1;
        } else if (i2 == 1) {
            ((zzact) zzadgVar).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        } else if (i2 != 2) {
            return -1;
        } else {
            long zzd = this.zzd.zzd(zzadgVar);
            if (zzd >= 0) {
                zzaecVar.zza = zzd;
                return 1;
            }
            if (zzd < -1) {
                zzi(-(zzd + 2));
            }
            if (!this.zzl) {
                zzaef zze = this.zzd.zze();
                zzek.zzb(zze);
                this.zzc.zzO(zze);
                this.zzl = true;
            }
            if (this.zzk > 0 || this.zza.zze(zzadgVar)) {
                this.zzk = 0L;
                zzfo zza = this.zza.zza();
                long zza2 = zza(zza);
                if (zza2 >= 0) {
                    long j2 = this.zzg;
                    if (j2 + zza2 >= this.zze) {
                        long zzf2 = zzf(j2);
                        zzaek.zzb(this.zzb, zza, zza.zze());
                        this.zzb.zzs(zzf2, 1, zza.zze(), 0, null);
                        this.zze = -1L;
                    }
                }
                this.zzg += zza2;
            } else {
                this.zzh = 3;
                return -1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzf(long j) {
        return (j * 1000000) / this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzg(long j) {
        return (this.zzi * j) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(zzadi zzadiVar, zzaem zzaemVar) {
        this.zzc = zzadiVar;
        this.zzb = zzaemVar;
        zzb(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzi(long j) {
        this.zzg = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(long j, long j2) {
        this.zza.zzc();
        if (j == 0) {
            zzb(!this.zzl);
        } else if (this.zzh != 0) {
            this.zze = zzg(j2);
            zzakp zzakpVar = this.zzd;
            int i = zzfx.zza;
            zzakpVar.zzg(this.zze);
            this.zzh = 2;
        }
    }
}
