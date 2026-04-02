package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zzfe extends zzkb implements zzln {
    private zzfe() {
        super(zzff.zzf());
    }

    public final int zza() {
        return ((zzff) this.zza).zzb();
    }

    public final zzfd zzb(int i10) {
        return ((zzff) this.zza).zzd(i10);
    }

    public final zzfe zzc() {
        zzaG();
        zzff.zzp((zzff) this.zza);
        return this;
    }

    public final zzfe zzd(int i10, zzfc zzfcVar) {
        zzaG();
        zzff.zzo((zzff) this.zza, i10, (zzfd) zzfcVar.zzaC());
        return this;
    }

    public final String zze() {
        return ((zzff) this.zza).zzi();
    }

    public final List zzf() {
        return Collections.unmodifiableList(((zzff) this.zza).zzj());
    }

    public final List zzg() {
        return Collections.unmodifiableList(((zzff) this.zza).zzk());
    }

    public /* synthetic */ zzfe(zzez zzezVar) {
        super(zzff.zzf());
    }
}
