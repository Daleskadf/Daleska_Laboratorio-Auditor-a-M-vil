package com.google.android.gms.internal.mlkit_common;

import D.AbstractC0059i;
import androidx.datastore.preferences.protobuf.Y;
import e5.i;
/* loaded from: classes.dex */
final class zzrx extends zzsj {
    private final zzmu zza;
    private final String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final i zze;
    private final zzna zzf;
    private final int zzg;

    public /* synthetic */ zzrx(zzmu zzmuVar, String str, boolean z7, boolean z8, i iVar, zzna zznaVar, int i7, zzrw zzrwVar) {
        this.zza = zzmuVar;
        this.zzb = str;
        this.zzc = z7;
        this.zzd = z8;
        this.zze = iVar;
        this.zzf = zznaVar;
        this.zzg = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzsj) {
            zzsj zzsjVar = (zzsj) obj;
            if (this.zza.equals(zzsjVar.zzc()) && this.zzb.equals(zzsjVar.zze()) && this.zzc == zzsjVar.zzg() && this.zzd == zzsjVar.zzf() && this.zze.equals(zzsjVar.zzb()) && this.zzf.equals(zzsjVar.zzd()) && this.zzg == zzsjVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        int i8 = 1231;
        if (true != this.zzc) {
            i7 = 1237;
        } else {
            i7 = 1231;
        }
        int i9 = ((hashCode * 1000003) ^ i7) * 1000003;
        if (true != this.zzd) {
            i8 = 1237;
        }
        return ((((((i9 ^ i8) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg;
    }

    public final String toString() {
        zzna zznaVar = this.zzf;
        i iVar = this.zze;
        String obj = this.zza.toString();
        String obj2 = iVar.toString();
        String obj3 = zznaVar.toString();
        StringBuilder m7 = Y.m("RemoteModelLoggingOptions{errorCode=", obj, ", tfliteSchemaVersion=");
        m7.append(this.zzb);
        m7.append(", shouldLogRoughDownloadTime=");
        m7.append(this.zzc);
        m7.append(", shouldLogExactDownloadTime=");
        m7.append(this.zzd);
        m7.append(", modelType=");
        m7.append(obj2);
        m7.append(", downloadStatus=");
        m7.append(obj3);
        m7.append(", failureStatusCode=");
        return AbstractC0059i.B(m7, this.zzg, "}");
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final i zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzmu zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzna zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzg() {
        return this.zzc;
    }
}
