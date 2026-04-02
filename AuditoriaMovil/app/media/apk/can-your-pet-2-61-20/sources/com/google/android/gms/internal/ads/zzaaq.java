package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaaq implements zzaby, zzdn, zzabi {
    private static final Executor zza = new Executor() { // from class: com.google.android.gms.internal.ads.zzaai
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };
    private final Context zzb;
    private final zzcp zzc;
    private final CopyOnWriteArraySet zzd;
    private zzel zze;
    private zzabd zzf;
    private zzabj zzg;
    private zzaba zzh;
    private zzev zzi;
    private zzcq zzj;
    private zzaao zzk;
    private List zzl;
    private Pair zzm;
    private int zzn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaaq(zzaaj zzaajVar, zzaap zzaapVar) {
        Context context;
        zzcp zzcpVar;
        context = zzaajVar.zza;
        this.zzb = context;
        zzcpVar = zzaajVar.zzc;
        zzek.zzb(zzcpVar);
        this.zzc = zzcpVar;
        this.zzd = new CopyOnWriteArraySet();
        this.zze = zzel.zza;
        this.zzn = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final zzabd zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final zzabx zzb() {
        zzaao zzaaoVar = this.zzk;
        zzek.zzb(zzaaoVar);
        return zzaaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final void zzc() {
        zzfp.zza.zzb();
        zzfp.zza.zza();
        this.zzm = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final void zzd(zzam zzamVar) throws zzabw {
        int i;
        boolean z = true;
        zzek.zzf(this.zzn == 0);
        zzek.zzb(this.zzl);
        zzek.zzf((this.zzg == null || this.zzf == null) ? false : false);
        zzel zzelVar = this.zze;
        Looper myLooper = Looper.myLooper();
        zzek.zzb(myLooper);
        this.zzi = zzelVar.zzb(myLooper, null);
        zzt zztVar = zzamVar.zzy;
        if (zztVar == null || ((i = zztVar.zzf) != 7 && i != 6)) {
            zztVar = zzt.zza;
        }
        if (zztVar.zzf == 7) {
            zzr zzc = zztVar.zzc();
            zzc.zzd(6);
            zztVar = zzc.zzg();
        }
        zzt zztVar2 = zztVar;
        try {
            zzcp zzcpVar = this.zzc;
            Context context = this.zzb;
            zzw zzwVar = zzw.zzb;
            final zzev zzevVar = this.zzi;
            Objects.requireNonNull(zzevVar);
            this.zzj = zzcpVar.zza(context, zztVar2, zzwVar, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzaah
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    zzev.this.zzh(runnable);
                }
            }, zzfzn.zzm(), 0L);
            Pair pair = this.zzm;
            if (pair != null) {
                Surface surface = (Surface) pair.first;
                zzfp zzfpVar = (zzfp) this.zzm.second;
                zzfpVar.zzb();
                zzfpVar.zza();
            }
            this.zzk = new zzaao(this.zzb, this, null);
            this.zzl.getClass();
            throw null;
        } catch (zzdl e) {
            throw new zzabw(e, zzamVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final void zze() {
        if (this.zzn == 2) {
            return;
        }
        zzev zzevVar = this.zzi;
        if (zzevVar != null) {
            zzevVar.zze(null);
        }
        this.zzm = null;
        this.zzn = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final void zzf(zzel zzelVar) {
        zzek.zzf(!zzl());
        this.zze = zzelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final void zzg(Surface surface, zzfp zzfpVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzfp) this.zzm.second).equals(zzfpVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzfpVar);
        zzfpVar.zzb();
        zzfpVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final void zzh(long j) {
        zzek.zzb(this.zzk);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final void zzi(List list) {
        this.zzl = list;
        if (zzl()) {
            zzek.zzb(this.zzk);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final void zzj(zzaba zzabaVar) {
        this.zzh = zzabaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final void zzk(zzabd zzabdVar) {
        zzek.zzf(!zzl());
        this.zzf = zzabdVar;
        this.zzg = new zzabj(this, zzabdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final boolean zzl() {
        return this.zzn == 1;
    }
}
