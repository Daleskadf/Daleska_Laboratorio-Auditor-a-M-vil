package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C0742p;
import p3.AbstractBinderC1660B;
import p3.C1665e;
/* loaded from: classes.dex */
final class zzdq extends AbstractBinderC1660B {
    private C0742p zza;

    public zzdq(C0742p c0742p) {
        super("com.google.android.gms.location.IDeviceOrientationListener");
        this.zza = c0742p;
    }

    public final synchronized void zzc(C0742p c0742p) {
        C0742p c0742p2 = this.zza;
        if (c0742p2 != c0742p) {
            c0742p2.a();
            this.zza = c0742p;
        }
    }

    @Override // p3.C
    public final void zzd(C1665e c1665e) {
        C0742p c0742p;
        synchronized (this) {
            c0742p = this.zza;
        }
        c0742p.b(new zzdp(this, c1665e));
    }

    public final synchronized void zze() {
        this.zza.a();
    }
}
