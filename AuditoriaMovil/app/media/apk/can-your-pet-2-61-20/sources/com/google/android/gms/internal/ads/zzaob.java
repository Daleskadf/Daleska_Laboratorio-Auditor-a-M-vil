package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaob implements zzano {
    private final String zza;
    private final int zzb;
    private final zzfo zzc;
    private final zzfn zzd;
    private zzaem zze;
    private String zzf;
    private zzam zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    private String zzv;

    public zzaob(String str, int i) {
        this.zza = str;
        this.zzb = i;
        zzfo zzfoVar = new zzfo(1024);
        this.zzc = zzfoVar;
        byte[] zzM = zzfoVar.zzM();
        this.zzd = new zzfn(zzM, zzM.length);
        this.zzl = -9223372036854775807L;
    }

    private final int zzf(zzfn zzfnVar) throws zzcc {
        int zza = zzfnVar.zza();
        zzaca zzb = zzacb.zzb(zzfnVar, true);
        this.zzv = zzb.zzc;
        this.zzs = zzb.zza;
        this.zzu = zzb.zzb;
        return zza - zzfnVar.zza();
    }

    private static long zzg(zzfn zzfnVar) {
        return zzfnVar.zzd((zzfnVar.zzd(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0159, code lost:
        if (r14.zzm == false) goto L105;
     */
    @Override // com.google.android.gms.internal.ads.zzano
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzfo r15) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaob.zza(com.google.android.gms.internal.ads.zzfo):void");
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzb(zzadi zzadiVar, zzapa zzapaVar) {
        zzapaVar.zzc();
        this.zze = zzadiVar.zzw(zzapaVar.zza(), 1);
        this.zzf = zzapaVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzd(long j, int i) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zze() {
        this.zzh = 0;
        this.zzl = -9223372036854775807L;
        this.zzm = false;
    }
}
