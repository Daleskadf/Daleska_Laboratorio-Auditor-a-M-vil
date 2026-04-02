package com.google.android.recaptcha.internal;

import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class zzln extends zzkw {
    private static final Logger zzb = Logger.getLogger(zzln.class.getName());
    private static final boolean zzc = zzps.zzx();
    zzlo zza;

    private zzln() {
        throw null;
    }

    public static int zzA(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int zzB(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzw(int i7, zzoi zzoiVar, zzow zzowVar) {
        int zzA = zzA(i7 << 3);
        return ((zzko) zzoiVar).zza(zzowVar) + zzA + zzA;
    }

    public static int zzx(zzoi zzoiVar) {
        int zzo = zzoiVar.zzo();
        return zzA(zzo) + zzo;
    }

    public static int zzy(zzoi zzoiVar, zzow zzowVar) {
        int zza = ((zzko) zzoiVar).zza(zzowVar);
        return zzA(zza) + zza;
    }

    public static int zzz(String str) {
        int length;
        try {
            length = zzpv.zzc(str);
        } catch (zzpu unused) {
            length = str.getBytes(zznl.zza).length;
        }
        return zzA(length) + length;
    }

    public final void zzC() {
        if (zza() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final void zzD(String str, zzpu zzpuVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzpuVar);
        byte[] bytes = str.getBytes(zznl.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzll(e7);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b5);

    public abstract void zzd(int i7, boolean z7);

    public abstract void zze(int i7, zzle zzleVar);

    public abstract void zzf(int i7, int i8);

    public abstract void zzg(int i7);

    public abstract void zzh(int i7, long j);

    public abstract void zzi(long j);

    public abstract void zzj(int i7, int i8);

    public abstract void zzk(int i7);

    public abstract void zzl(byte[] bArr, int i7, int i8);

    public abstract void zzm(int i7, zzoi zzoiVar, zzow zzowVar);

    public abstract void zzn(int i7, zzoi zzoiVar);

    public abstract void zzo(int i7, zzle zzleVar);

    public abstract void zzp(int i7, String str);

    public abstract void zzr(int i7, int i8);

    public abstract void zzs(int i7, int i8);

    public abstract void zzt(int i7);

    public abstract void zzu(int i7, long j);

    public abstract void zzv(long j);

    public /* synthetic */ zzln(zzlm zzlmVar) {
    }
}
