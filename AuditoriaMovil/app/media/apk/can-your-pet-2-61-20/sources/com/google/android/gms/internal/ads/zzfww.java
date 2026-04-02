package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfww extends zzfwm {
    private final Object zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfww(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzfww) {
            return this.zza.equals(((zzfww) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "Optional.of(" + obj + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final zzfwm zza(zzfwf zzfwfVar) {
        Object apply = zzfwfVar.apply(this.zza);
        zzfwr.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzfww(apply);
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
