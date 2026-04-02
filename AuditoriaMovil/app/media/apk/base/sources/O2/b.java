package O2;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzc;
/* loaded from: classes.dex */
public abstract class b extends zzb implements c {
    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            boolean z7 = false;
            if (i7 != 2) {
                return false;
            }
            int i9 = zzc.zza;
            int readInt = parcel.readInt();
            zzc.zzb(parcel);
            if (readInt != 0) {
                z7 = true;
            }
            zzc(z7);
        } else {
            zzc.zzb(parcel);
            zzb((Account) zzc.zza(parcel, Account.CREATOR));
        }
        return true;
    }
}
