package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Ascii;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgb implements zzbx {
    public static final Parcelable.Creator<zzgb> CREATOR = new zzfz();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgb(Parcel parcel, zzga zzgaVar) {
        String readString = parcel.readString();
        int i = zzfx.zza;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
    }

    public zzgb(String str, byte[] bArr, int i, int i2) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzgb zzgbVar = (zzgb) obj;
            if (this.zza.equals(zzgbVar.zza) && Arrays.equals(this.zzb, zzgbVar.zzb) && this.zzc == zzgbVar.zzc && this.zzd == zzgbVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }

    public final String toString() {
        String zzA;
        int i = this.zzd;
        if (i == 1) {
            zzA = zzfx.zzA(this.zzb);
        } else if (i == 23) {
            zzA = String.valueOf(Float.intBitsToFloat(zzgcl.zzd(this.zzb)));
        } else if (i == 67) {
            zzA = String.valueOf(zzgcl.zzd(this.zzb));
        } else {
            byte[] bArr = this.zzb;
            int length = bArr.length;
            StringBuilder sb = new StringBuilder(length + length);
            for (int i2 = 0; i2 < bArr.length; i2++) {
                sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i2] & Ascii.SI, 16));
            }
            zzA = sb.toString();
        }
        String str = this.zza;
        return "mdta: key=" + str + ", value=" + zzA;
    }
}
