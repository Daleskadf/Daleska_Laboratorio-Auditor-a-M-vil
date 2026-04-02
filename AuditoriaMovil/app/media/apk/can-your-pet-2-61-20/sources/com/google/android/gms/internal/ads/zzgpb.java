package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgpb {
    private final Class zza;
    private final zzgxm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgpb(Class cls, zzgxm zzgxmVar, zzgpa zzgpaVar) {
        this.zza = cls;
        this.zzb = zzgxmVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgpb) {
            zzgpb zzgpbVar = (zzgpb) obj;
            return zzgpbVar.zza.equals(this.zza) && zzgpbVar.zzb.equals(this.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zzgxm zzgxmVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String valueOf = String.valueOf(zzgxmVar);
        return simpleName + ", object identifier: " + valueOf;
    }
}
