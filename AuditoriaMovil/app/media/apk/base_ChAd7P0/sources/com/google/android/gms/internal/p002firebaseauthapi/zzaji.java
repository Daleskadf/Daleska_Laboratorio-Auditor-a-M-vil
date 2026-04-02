package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaji  reason: invalid package */
/* loaded from: classes.dex */
public abstract class zzaji {
    private static volatile int zzd = 100;
    int zza;
    int zzb;
    zzajm zzc;
    private int zze;
    private int zzf;

    public static int zza(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public abstract double zza();

    public abstract float zzb();

    public abstract int zzb(int i7);

    public abstract int zzc();

    public abstract void zzc(int i7);

    public abstract int zzd();

    public abstract void zzd(int i7);

    public abstract int zze();

    public abstract boolean zze(int i7);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract zzaiw zzq();

    public abstract String zzr();

    public abstract String zzs();

    public final void zzt() {
        if (this.zza + this.zze < this.zzf) {
            return;
        }
        throw zzakm.zzh();
    }

    public final void zzu() {
        if (this.zze == 0) {
            zzc(0);
        }
    }

    public final void zzv() {
        int zzi;
        do {
            zzi = zzi();
            if (zzi == 0) {
                return;
            }
            zzt();
            this.zze++;
            this.zze--;
        } while (zze(zzi));
    }

    public abstract boolean zzw();

    public abstract boolean zzx();

    private zzaji() {
        this.zzf = zzd;
        this.zzb = f.API_PRIORITY_OTHER;
    }

    public static long zza(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static zzaji zza(byte[] bArr, int i7, int i8, boolean z7) {
        zzajl zzajlVar = new zzajl(bArr, i7, i8, z7);
        try {
            zzajlVar.zzb(i8);
            return zzajlVar;
        } catch (zzakm e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
