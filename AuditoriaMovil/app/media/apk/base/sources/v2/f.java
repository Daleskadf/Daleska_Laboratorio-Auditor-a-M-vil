package V2;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001authapi.zbb;
import com.google.android.gms.internal.p001authapi.zbc;
/* loaded from: classes.dex */
public final class f extends zbb implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5957a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f5958b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, int i7) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        this.f5957a = i7;
        this.f5958b = iVar;
    }

    @Override // V2.l
    public void a(Status status) {
        switch (this.f5957a) {
            case 1:
                ((h) this.f5958b).setResult((h) status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // V2.l
    public void g(Status status) {
        switch (this.f5957a) {
            case 2:
                ((h) this.f5958b).setResult((h) status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // V2.l
    public void h(GoogleSignInAccount googleSignInAccount, Status status) {
        switch (this.f5957a) {
            case 0:
                g gVar = (g) this.f5958b;
                if (googleSignInAccount != null) {
                    k F7 = k.F(gVar.f5959a);
                    GoogleSignInOptions googleSignInOptions = gVar.f5960b;
                    synchronized (F7) {
                        ((b) F7.f5965b).d(googleSignInAccount, googleSignInOptions);
                        F7.f5966c = googleSignInAccount;
                        F7.f5967d = googleSignInOptions;
                    }
                }
                gVar.setResult((g) new U2.c(googleSignInAccount, status));
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.android.gms.internal.p001authapi.zbb
    public final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 101:
                zbc.zbb(parcel);
                h((GoogleSignInAccount) zbc.zba(parcel, GoogleSignInAccount.CREATOR), (Status) zbc.zba(parcel, Status.CREATOR));
                break;
            case 102:
                zbc.zbb(parcel);
                a((Status) zbc.zba(parcel, Status.CREATOR));
                break;
            case 103:
                zbc.zbb(parcel);
                g((Status) zbc.zba(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
