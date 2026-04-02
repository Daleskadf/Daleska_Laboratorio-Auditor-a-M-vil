package com.google.android.recaptcha.internal;

import E6.m;
import io.flutter.plugins.pathprovider.b;
/* loaded from: classes.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String V7 = m.V(10, String.valueOf(this.zzb / this.zza));
        String V8 = m.V(10, String.valueOf(this.zzc));
        String V9 = m.V(10, String.valueOf(this.zzb));
        String V10 = m.V(5, String.valueOf(this.zza));
        StringBuilder l8 = b.l("avgExecutionTime: ", V7, " us| maxExecutionTime: ", V8, " us| totalTime: ");
        l8.append(V9);
        l8.append(" us| #Usages: ");
        l8.append(V10);
        return l8.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzbj zzbjVar) {
        Long valueOf = Long.valueOf(this.zzb);
        Long valueOf2 = Long.valueOf(zzbjVar.zzb);
        if (valueOf == valueOf2) {
            return 0;
        }
        return valueOf.compareTo(valueOf2);
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i7) {
        this.zza = i7;
    }
}
