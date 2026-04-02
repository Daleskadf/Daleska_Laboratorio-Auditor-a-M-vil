package U2;

import H4.e1;
import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5731a;

    public /* synthetic */ e(int i7) {
        this.f5731a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5731a) {
            case 0:
                int T7 = j3.f.T(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList = null;
                String str7 = null;
                String str8 = null;
                long j = 0;
                int i7 = 0;
                while (parcel.dataPosition() < T7) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i7 = j3.f.M(readInt, parcel);
                            break;
                        case 2:
                            str = j3.f.l(readInt, parcel);
                            break;
                        case 3:
                            str2 = j3.f.l(readInt, parcel);
                            break;
                        case 4:
                            str3 = j3.f.l(readInt, parcel);
                            break;
                        case 5:
                            str4 = j3.f.l(readInt, parcel);
                            break;
                        case 6:
                            uri = (Uri) j3.f.k(parcel, readInt, Uri.CREATOR);
                            break;
                        case 7:
                            str5 = j3.f.l(readInt, parcel);
                            break;
                        case '\b':
                            j = j3.f.O(readInt, parcel);
                            break;
                        case '\t':
                            str6 = j3.f.l(readInt, parcel);
                            break;
                        case '\n':
                            arrayList = j3.f.p(parcel, readInt, Scope.CREATOR);
                            break;
                        case 11:
                            str7 = j3.f.l(readInt, parcel);
                            break;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            str8 = j3.f.l(readInt, parcel);
                            break;
                        default:
                            j3.f.S(readInt, parcel);
                            break;
                    }
                }
                j3.f.s(T7, parcel);
                return new GoogleSignInAccount(i7, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
            case 1:
                int T8 = j3.f.T(parcel);
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                Account account = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                int i8 = 0;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                while (parcel.dataPosition() < T8) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i8 = j3.f.M(readInt2, parcel);
                            break;
                        case 2:
                            arrayList3 = j3.f.p(parcel, readInt2, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) j3.f.k(parcel, readInt2, Account.CREATOR);
                            break;
                        case 4:
                            z7 = j3.f.F(readInt2, parcel);
                            break;
                        case 5:
                            z8 = j3.f.F(readInt2, parcel);
                            break;
                        case 6:
                            z9 = j3.f.F(readInt2, parcel);
                            break;
                        case 7:
                            str9 = j3.f.l(readInt2, parcel);
                            break;
                        case '\b':
                            str10 = j3.f.l(readInt2, parcel);
                            break;
                        case '\t':
                            arrayList2 = j3.f.p(parcel, readInt2, V2.a.CREATOR);
                            break;
                        case '\n':
                            str11 = j3.f.l(readInt2, parcel);
                            break;
                        default:
                            j3.f.S(readInt2, parcel);
                            break;
                    }
                }
                j3.f.s(T8, parcel);
                return new GoogleSignInOptions(i8, arrayList3, account, z7, z8, z9, str9, str10, GoogleSignInOptions.m(arrayList2), str11);
            default:
                int T9 = j3.f.T(parcel);
                String str12 = StringUtils.EMPTY;
                GoogleSignInAccount googleSignInAccount = null;
                String str13 = StringUtils.EMPTY;
                while (parcel.dataPosition() < T9) {
                    int readInt3 = parcel.readInt();
                    char c8 = (char) readInt3;
                    if (c8 != 4) {
                        if (c8 != 7) {
                            if (c8 != '\b') {
                                j3.f.S(readInt3, parcel);
                            } else {
                                str13 = j3.f.l(readInt3, parcel);
                            }
                        } else {
                            googleSignInAccount = (GoogleSignInAccount) j3.f.k(parcel, readInt3, GoogleSignInAccount.CREATOR);
                        }
                    } else {
                        str12 = j3.f.l(readInt3, parcel);
                    }
                }
                j3.f.s(T9, parcel);
                return new SignInAccount(str12, googleSignInAccount, str13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f5731a) {
            case 0:
                return new GoogleSignInAccount[i7];
            case 1:
                return new GoogleSignInOptions[i7];
            default:
                return new SignInAccount[i7];
        }
    }
}
