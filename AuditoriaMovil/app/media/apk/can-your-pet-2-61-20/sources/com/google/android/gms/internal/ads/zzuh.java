package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzuh implements zzvj {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzvq zzc = new zzvq();
    private final zzsg zzd = new zzsg();
    private Looper zze;
    private zzcx zzf;
    private zzpb zzg;

    @Override // com.google.android.gms.internal.ads.zzvj
    public /* synthetic */ zzcx zzM() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzpb zzb() {
        zzpb zzpbVar = this.zzg;
        zzek.zzb(zzpbVar);
        return zzpbVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzsg zzc(zzvh zzvhVar) {
        return this.zzd.zza(0, zzvhVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzsg zzd(int i, zzvh zzvhVar) {
        return this.zzd.zza(0, zzvhVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzvq zze(zzvh zzvhVar) {
        return this.zzc.zza(0, zzvhVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzvq zzf(int i, zzvh zzvhVar) {
        return this.zzc.zza(0, zzvhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzg(Handler handler, zzsh zzshVar) {
        this.zzd.zzb(handler, zzshVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzh(Handler handler, zzvr zzvrVar) {
        this.zzc.zzb(handler, zzvrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzi(zzvi zzviVar) {
        boolean z = !this.zzb.isEmpty();
        this.zzb.remove(zzviVar);
        if (z && this.zzb.isEmpty()) {
            zzj();
        }
    }

    protected void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzk(zzvi zzviVar) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(zzviVar);
        if (isEmpty) {
            zzl();
        }
    }

    protected void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzm(zzvi zzviVar, zzhy zzhyVar, zzpb zzpbVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        zzek.zzd(z);
        this.zzg = zzpbVar;
        zzcx zzcxVar = this.zzf;
        this.zza.add(zzviVar);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzviVar);
            zzn(zzhyVar);
        } else if (zzcxVar != null) {
            zzk(zzviVar);
            zzviVar.zza(this, zzcxVar);
        }
    }

    protected abstract void zzn(zzhy zzhyVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzo(zzcx zzcxVar) {
        this.zzf = zzcxVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzvi) arrayList.get(i)).zza(this, zzcxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzp(zzvi zzviVar) {
        this.zza.remove(zzviVar);
        if (this.zza.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            this.zzb.clear();
            zzq();
            return;
        }
        zzi(zzviVar);
    }

    protected abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzr(zzsh zzshVar) {
        this.zzd.zzc(zzshVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzs(zzvr zzvrVar) {
        this.zzc.zzh(zzvrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public /* synthetic */ void zzt(zzbp zzbpVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzu() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public /* synthetic */ boolean zzv() {
        return true;
    }
}
