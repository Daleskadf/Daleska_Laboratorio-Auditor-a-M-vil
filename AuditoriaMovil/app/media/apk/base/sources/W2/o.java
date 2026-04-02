package W2;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class o extends zzb implements G {

    /* renamed from: a  reason: collision with root package name */
    public final int f6191a;

    public o(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        boolean z7;
        if (bArr.length == 25) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.c(z7);
        this.f6191a = Arrays.hashCode(bArr);
    }

    public static byte[] b(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    public abstract byte[] c();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof G)) {
            try {
                G g3 = (G) obj;
                if (((o) g3).f6191a != this.f6191a) {
                    return false;
                }
                return Arrays.equals(c(), (byte[]) i3.b.c(new i3.b(((o) g3).c())));
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6191a;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f6191a);
        } else {
            i3.b bVar = new i3.b(c());
            parcel2.writeNoException();
            zzc.zze(parcel2, bVar);
        }
        return true;
    }
}
