package N2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class b extends X2.a {
    public static final Parcelable.Creator<b> CREATOR = new f(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f3386a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3387b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3388c;

    /* renamed from: d  reason: collision with root package name */
    public final Account f3389d;

    public b(int i7, int i8, String str, Account account) {
        this.f3386a = i7;
        this.f3387b = i8;
        this.f3388c = str;
        if (account == null && !TextUtils.isEmpty(str)) {
            this.f3389d = new Account(str, "com.google");
        } else {
            this.f3389d = account;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f3386a);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f3387b);
        m5.d.B(parcel, 3, this.f3388c, false);
        m5.d.A(parcel, 4, this.f3389d, i7, false);
        m5.d.J(G2, parcel);
    }
}
