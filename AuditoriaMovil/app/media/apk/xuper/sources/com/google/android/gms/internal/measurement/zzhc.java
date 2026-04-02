package com.google.android.gms.internal.measurement;

import android.content.Context;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
final class zzhc extends zzhz {
    private final Context zza;
    private final zzii zzb;

    public zzhc(Context context, @Nullable zzii zziiVar) {
        if (context != null) {
            this.zza = context;
            this.zzb = zziiVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public final boolean equals(Object obj) {
        zzii zziiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhz) {
            zzhz zzhzVar = (zzhz) obj;
            if (this.zza.equals(zzhzVar.zza()) && ((zziiVar = this.zzb) != null ? zziiVar.equals(zzhzVar.zzb()) : zzhzVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzii zziiVar = this.zzb;
        if (zziiVar == null) {
            hashCode = 0;
        } else {
            hashCode = zziiVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        String obj = this.zza.toString();
        String valueOf = String.valueOf(this.zzb);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    @Nullable
    public final zzii zzb() {
        return this.zzb;
    }
}
