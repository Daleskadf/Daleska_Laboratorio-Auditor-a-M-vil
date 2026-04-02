package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzagu extends zzahd {
    public static final Parcelable.Creator<zzagu> CREATOR = new zzagt();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzahd[] zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagu(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = zzfx.zza;
        this.zza = readString;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.zze = new zzahd[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zze[i2] = (zzahd) parcel.readParcelable(zzahd.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagu zzaguVar = (zzagu) obj;
            if (this.zzb == zzaguVar.zzb && this.zzc == zzaguVar.zzc && zzfx.zzG(this.zza, zzaguVar.zza) && Arrays.equals(this.zzd, zzaguVar.zzd) && Arrays.equals(this.zze, zzaguVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return (((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzahd zzahdVar : this.zze) {
            parcel.writeParcelable(zzahdVar, 0);
        }
    }

    public zzagu(String str, boolean z, boolean z2, String[] strArr, zzahd[] zzahdVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzahdVarArr;
    }
}
