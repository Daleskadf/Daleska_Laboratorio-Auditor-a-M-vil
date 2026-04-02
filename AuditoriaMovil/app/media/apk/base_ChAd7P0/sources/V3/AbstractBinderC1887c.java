package v3;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.T;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;
/* renamed from: v3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1887c extends zab {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 3:
                W2.b bVar = (W2.b) zac.zaa(parcel, W2.b.CREATOR);
                C1886b c1886b = (C1886b) zac.zaa(parcel, C1886b.CREATOR);
                zac.zab(parcel);
                break;
            case 4:
                Status status = (Status) zac.zaa(parcel, Status.CREATOR);
                zac.zab(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) zac.zaa(parcel, Status.CREATOR);
                zac.zab(parcel);
                break;
            case 7:
                Status status3 = (Status) zac.zaa(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) zac.zaa(parcel, GoogleSignInAccount.CREATOR);
                zac.zab(parcel);
                break;
            case 8:
                zac.zab(parcel);
                T t7 = (T) this;
                t7.f9208b.post(new d0(3, t7, (g) zac.zaa(parcel, g.CREATOR)));
                break;
            case 9:
                e eVar = (e) zac.zaa(parcel, e.CREATOR);
                zac.zab(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
