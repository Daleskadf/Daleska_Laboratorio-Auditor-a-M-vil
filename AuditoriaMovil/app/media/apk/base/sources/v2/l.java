package V2;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public interface l extends IInterface {
    void a(Status status);

    void g(Status status);

    void h(GoogleSignInAccount googleSignInAccount, Status status);
}
