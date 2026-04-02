package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzup extends zzuh {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzhy zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zzA(Object obj, zzvj zzvjVar, zzcx zzcxVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzB(final Object obj, zzvj zzvjVar) {
        zzek.zzd(!this.zza.containsKey(obj));
        zzvi zzviVar = new zzvi() { // from class: com.google.android.gms.internal.ads.zzum
            @Override // com.google.android.gms.internal.ads.zzvi
            public final void zza(zzvj zzvjVar2, zzcx zzcxVar) {
                zzup.this.zzA(obj, zzvjVar2, zzcxVar);
            }
        };
        zzun zzunVar = new zzun(this, obj);
        this.zza.put(obj, new zzuo(zzvjVar, zzviVar, zzunVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzvjVar.zzh(handler, zzunVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzvjVar.zzg(handler2, zzunVar);
        zzvjVar.zzm(zzviVar, this.zzc, zzb());
        if (zzu()) {
            return;
        }
        zzvjVar.zzi(zzviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    protected final void zzj() {
        for (zzuo zzuoVar : this.zza.values()) {
            zzuoVar.zza.zzi(zzuoVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    protected final void zzl() {
        for (zzuo zzuoVar : this.zza.values()) {
            zzuoVar.zza.zzk(zzuoVar.zzb);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzuh
    public void zzn(zzhy zzhyVar) {
        this.zzc = zzhyVar;
        this.zzb = zzfx.zzx(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzuh
    public void zzq() {
        for (zzuo zzuoVar : this.zza.values()) {
            zzuoVar.zza.zzp(zzuoVar.zzb);
            zzuoVar.zza.zzs(zzuoVar.zzc);
            zzuoVar.zza.zzr(zzuoVar.zzc);
        }
        this.zza.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int zzw(Object obj, int i) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long zzx(Object obj, long j, zzvh zzvhVar) {
        return j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zzvh zzy(Object obj, zzvh zzvhVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public void zzz() throws IOException {
        for (zzuo zzuoVar : this.zza.values()) {
            zzuoVar.zza.zzz();
        }
    }
}
