package n3;

import D.AbstractC0059i;
import android.os.Parcel;
import android.os.Parcelable;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n3.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1472E implements Parcelable {
    public static final Parcelable.Creator<EnumC1472E> CREATOR;
    public static final EnumC1472E PUBLIC_KEY;
    private static final /* synthetic */ EnumC1472E[] zza;
    private final String zzb = "public-key";

    static {
        EnumC1472E enumC1472E = new EnumC1472E();
        PUBLIC_KEY = enumC1472E;
        zza = new EnumC1472E[]{enumC1472E};
        CREATOR = new U(6);
    }

    public static EnumC1472E a(String str) {
        EnumC1472E[] values;
        for (EnumC1472E enumC1472E : values()) {
            if (str.equals(enumC1472E.zzb)) {
                return enumC1472E;
            }
        }
        throw new Exception(AbstractC0059i.M("PublicKeyCredentialType ", str, " not supported"));
    }

    public static EnumC1472E valueOf(String str) {
        return (EnumC1472E) Enum.valueOf(EnumC1472E.class, str);
    }

    public static EnumC1472E[] values() {
        return (EnumC1472E[]) zza.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.zzb);
    }
}
