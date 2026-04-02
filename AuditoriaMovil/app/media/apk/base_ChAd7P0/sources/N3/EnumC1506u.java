package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
/* renamed from: n3.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1506u implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);
    
    public static final Parcelable.Creator<EnumC1506u> CREATOR = new c0(1);
    private final int zzb;

    EnumC1506u(int i7) {
        this.zzb = i7;
    }

    public static EnumC1506u d(int i7) {
        EnumC1506u[] values;
        for (EnumC1506u enumC1506u : values()) {
            if (i7 == enumC1506u.zzb) {
                return enumC1506u;
            }
        }
        Locale locale = Locale.US;
        throw new Exception(io.flutter.plugins.pathprovider.b.f("Error code ", i7, " is not supported"));
    }

    public final int a() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.zzb);
    }
}
