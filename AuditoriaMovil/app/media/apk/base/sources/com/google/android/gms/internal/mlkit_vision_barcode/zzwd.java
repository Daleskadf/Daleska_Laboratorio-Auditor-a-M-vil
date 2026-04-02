package com.google.android.gms.internal.mlkit_vision_barcode;

import D.AbstractC0059i;
/* loaded from: classes.dex */
final class zzwd extends zzwh {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zzwd(String str, boolean z7, int i7, zzwc zzwcVar) {
        this.zza = str;
        this.zzb = z7;
        this.zzc = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzwh) {
            zzwh zzwhVar = (zzwh) obj;
            if (this.zza.equals(zzwhVar.zzb()) && this.zzb == zzwhVar.zzc() && this.zzc == zzwhVar.zza()) {
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
        StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb.append(this.zza);
        sb.append(", enableFirelog=");
        sb.append(this.zzb);
        sb.append(", firelogEventType=");
        return AbstractC0059i.B(sb, this.zzc, "}");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwh
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwh
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwh
    public final boolean zzc() {
        return this.zzb;
    }
}
