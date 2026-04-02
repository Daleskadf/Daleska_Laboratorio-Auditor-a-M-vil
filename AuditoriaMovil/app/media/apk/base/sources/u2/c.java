package U2;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a  reason: collision with root package name */
    public final Status f5727a;

    /* renamed from: b  reason: collision with root package name */
    public final GoogleSignInAccount f5728b;

    public c(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f5728b = googleSignInAccount;
        this.f5727a = status;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.f5727a;
    }
}
