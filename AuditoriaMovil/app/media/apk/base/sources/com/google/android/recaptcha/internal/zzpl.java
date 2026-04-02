package com.google.android.recaptcha.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzpl {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i7, int i8);

    public abstract void zze(Object obj, int i7, long j);

    public abstract void zzf(Object obj, int i7, Object obj2);

    public abstract void zzg(Object obj, int i7, zzle zzleVar);

    public abstract void zzh(Object obj, int i7, long j);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzov zzovVar, int i7) {
        int zzd = zzovVar.zzd();
        int i8 = zzd >>> 3;
        int i9 = zzd & 7;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 == 5) {
                                zzd(obj, i8, zzovVar.zzf());
                                return true;
                            }
                            throw new zznm("Protocol message tag had invalid wire type.");
                        }
                        return false;
                    }
                    Object zzb = zzb();
                    int i10 = i8 << 3;
                    int i11 = i7 + 1;
                    if (i11 < zza) {
                        while (zzovVar.zzc() != Integer.MAX_VALUE && zzk(zzb, zzovVar, i11)) {
                        }
                        if ((i10 | 4) == zzovVar.zzd()) {
                            zzf(obj, i8, zzc(zzb));
                            return true;
                        }
                        throw new zznn("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                zzg(obj, i8, zzovVar.zzp());
                return true;
            }
            zze(obj, i8, zzovVar.zzk());
            return true;
        }
        zzh(obj, i8, zzovVar.zzl());
        return true;
    }
}
