package com.google.android.gms.internal.fido;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzdj extends zzdr {
    private final boolean zza;

    public zzdj(boolean z7) {
        this.zza = z7;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i7;
        zzdr zzdrVar = (zzdr) obj;
        if (zzdr.zzd((byte) -32) != zzdrVar.zza()) {
            return zzdr.zzd((byte) -32) - zzdrVar.zza();
        }
        zzdj zzdjVar = (zzdj) zzdrVar;
        int i8 = 21;
        if (true != this.zza) {
            i7 = 20;
        } else {
            i7 = 21;
        }
        if (true != zzdjVar.zza) {
            i8 = 20;
        }
        return i7 - i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdj.class == obj.getClass() && this.zza == ((zzdj) obj).zza) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzdr.zzd((byte) -32)), Boolean.valueOf(this.zza)});
    }

    public final String toString() {
        return Boolean.toString(this.zza);
    }

    @Override // com.google.android.gms.internal.fido.zzdr
    public final int zza() {
        return zzdr.zzd((byte) -32);
    }
}
