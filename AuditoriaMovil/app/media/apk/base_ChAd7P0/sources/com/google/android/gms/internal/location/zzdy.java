package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C0742p;
import p3.H;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdy extends H {
    private final zzdr zza;

    public zzdy(zzdr zzdrVar) {
        super("com.google.android.gms.location.ILocationListener");
        this.zza = zzdrVar;
    }

    public final zzdy zzc(C0742p c0742p) {
        this.zza.zzb(c0742p);
        return this;
    }

    @Override // p3.I
    public final void zzd(Location location) {
        this.zza.zza().b(new zzdw(this, location));
    }

    @Override // p3.I
    public final void zze() {
        this.zza.zza().b(new zzdx(this));
    }

    public final void zzf() {
        this.zza.zza().a();
    }

    public final /* synthetic */ zzdr zzg() {
        return this.zza;
    }
}
