package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import kotlinx.coroutines.scheduling.WorkQueueKt;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzgyt {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzgyu zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgyt(zzgys zzgysVar) {
    }

    public static int zzF(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static int zzG(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & WorkQueueKt.MASK;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw zzhak.zzj();
            }
            i2 |= (read & WorkQueueKt.MASK) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw zzhak.zzj();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw zzhak.zze();
    }

    public static long zzH(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static zzgyt zzI(InputStream inputStream, int i) {
        if (inputStream == null) {
            byte[] bArr = zzhai.zzd;
            int length = bArr.length;
            return zzJ(bArr, 0, 0, false);
        }
        return new zzgyp(inputStream, 4096, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgyt zzJ(byte[] bArr, int i, int i2, boolean z) {
        zzgyl zzgylVar = new zzgyl(bArr, i, i2, z, null);
        try {
            zzgylVar.zze(i2);
            return zzgylVar;
        } catch (zzhak e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract void zzA(int i);

    public abstract boolean zzC() throws IOException;

    public abstract boolean zzD() throws IOException;

    public abstract boolean zzE(int i) throws IOException;

    public abstract double zzb() throws IOException;

    public abstract float zzc() throws IOException;

    public abstract int zzd();

    public abstract int zze(int i) throws zzhak;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzk() throws IOException;

    public abstract int zzl() throws IOException;

    public abstract int zzm() throws IOException;

    public abstract int zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract long zzu() throws IOException;

    public abstract long zzv() throws IOException;

    public abstract zzgyj zzw() throws IOException;

    public abstract String zzx() throws IOException;

    public abstract String zzy() throws IOException;

    public abstract void zzz(int i) throws zzhak;
}
