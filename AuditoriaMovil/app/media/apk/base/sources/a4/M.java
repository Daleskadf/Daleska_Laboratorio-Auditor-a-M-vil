package a4;

import com.google.firebase.auth.FirebaseAuth;
/* loaded from: classes.dex */
public final class M extends y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugins.firebase.auth.Q f6989a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6990b;

    public M(FirebaseAuth firebaseAuth, io.flutter.plugins.firebase.auth.Q q2) {
        this.f6989a = q2;
        this.f6990b = firebaseAuth;
    }

    @Override // a4.y
    public final void onCodeSent(String str, x xVar) {
        String str2 = (String) this.f6990b.f9708g.f8249d;
        com.google.android.gms.common.internal.I.i(str2);
        this.f6989a.onVerificationCompleted(v.n(str, str2));
    }

    @Override // a4.y
    public final void onVerificationCompleted(v vVar) {
        this.f6989a.onVerificationCompleted(vVar);
    }

    @Override // a4.y
    public final void onVerificationFailed(U3.i iVar) {
        this.f6989a.onVerificationFailed(iVar);
    }

    @Override // a4.y
    public final void onCodeAutoRetrievalTimeOut(String str) {
    }
}
