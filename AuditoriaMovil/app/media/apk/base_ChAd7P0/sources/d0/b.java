package D0;

import V2.d;
import androidx.lifecycle.D;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
/* loaded from: classes.dex */
public final class b implements D {

    /* renamed from: a  reason: collision with root package name */
    public final A.c f825a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f826b = false;

    public b(d dVar, A.c cVar) {
        this.f825a = cVar;
    }

    @Override // androidx.lifecycle.D
    public final void a(Object obj) {
        this.f826b = true;
        A.c cVar = this.f825a;
        cVar.getClass();
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) cVar.f4b;
        signInHubActivity.setResult(signInHubActivity.f9142v0, signInHubActivity.f9143w0);
        signInHubActivity.finish();
    }

    public final String toString() {
        return this.f825a.toString();
    }
}
