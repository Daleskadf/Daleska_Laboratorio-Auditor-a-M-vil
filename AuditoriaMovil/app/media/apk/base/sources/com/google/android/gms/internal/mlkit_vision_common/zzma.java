package com.google.android.gms.internal.mlkit_vision_common;

import D.AbstractC0059i;
/* loaded from: classes.dex */
final class zzma extends zzme {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zzma(String str, boolean z7, int i7, zzlz zzlzVar) {
        this.zza = str;
        this.zzb = z7;
        this.zzc = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzme) {
            zzme zzmeVar = (zzme) obj;
            if (this.zza.equals(zzmeVar.zzb()) && this.zzb == zzmeVar.zzc() && this.zzc == zzmeVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.zza.hashCode() ^ 1000003;
        if (true != this.zzb) {
            i7 = 1237;
        } else {
            i7 = 1231;
        }
        return (((hashCode * 1000003) ^ i7) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        String str = this.zza;
        boolean z7 = this.zzb;
        int i7 = this.zzc;
        StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb.append(str);
        sb.append(", enableFirelog=");
        sb.append(z7);
        sb.append(", firelogEventType=");
        return AbstractC0059i.B(sb, i7, "}");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final boolean zzc() {
        return this.zzb;
    }
}
