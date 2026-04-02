package W2;

import H4.p1;
import a6.t0;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import org.apache.tika.utils.XMLReaderUtils;
/* loaded from: classes.dex */
public final class b extends X2.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f6159a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6160b;

    /* renamed from: c  reason: collision with root package name */
    public final PendingIntent f6161c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6162d;

    /* renamed from: e  reason: collision with root package name */
    public static final b f6158e = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new m(0);

    public b(int i7, int i8, PendingIntent pendingIntent, String str) {
        this.f6159a = i7;
        this.f6160b = i8;
        this.f6161c = pendingIntent;
        this.f6162d = str;
    }

    public static String k(int i7) {
        if (i7 != 99) {
            if (i7 != 1500) {
                switch (i7) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i7) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case RecognitionOptions.DATA_MATRIX /* 16 */:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return io.flutter.plugins.pathprovider.b.f("UNKNOWN_ERROR_CODE(", i7, ")");
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f6160b == bVar.f6160b && I.m(this.f6161c, bVar.f6161c) && I.m(this.f6162d, bVar.f6162d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6160b), this.f6161c, this.f6162d});
    }

    public final String toString() {
        t0 t0Var = new t0(this);
        t0Var.m(k(this.f6160b), "statusCode");
        t0Var.m(this.f6161c, "resolution");
        t0Var.m(this.f6162d, "message");
        return t0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f6159a);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f6160b);
        m5.d.A(parcel, 3, this.f6161c, i7, false);
        m5.d.B(parcel, 4, this.f6162d, false);
        m5.d.J(G2, parcel);
    }

    public b(int i7) {
        this(1, i7, null, null);
    }

    public b(int i7, PendingIntent pendingIntent) {
        this(1, i7, pendingIntent, null);
    }
}
