package a4;

import android.text.TextUtils;
import android.util.Log;
import b4.InterfaceC0592F;
import com.google.android.gms.internal.p002firebaseauthapi.zzabq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
/* loaded from: classes.dex */
public final class H extends m5.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f6967a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC0467p f6968b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0457f f6969c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6970d;

    public H(FirebaseAuth firebaseAuth, boolean z7, AbstractC0467p abstractC0467p, C0457f c0457f) {
        this.f6967a = z7;
        this.f6968b = abstractC0467p;
        this.f6969c = c0457f;
        this.f6970d = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [a4.h, b4.F] */
    @Override // m5.d
    public final Task I(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        C0457f c0457f = this.f6969c;
        boolean z7 = this.f6967a;
        FirebaseAuth firebaseAuth = this.f6970d;
        if (z7) {
            zzabq zzabqVar = firebaseAuth.f9707e;
            AbstractC0467p abstractC0467p = this.f6968b;
            com.google.android.gms.common.internal.I.i(abstractC0467p);
            return zzabqVar.zzb(firebaseAuth.f9703a, abstractC0467p, c0457f, str, (InterfaceC0592F) new C0459h(firebaseAuth, 0));
        }
        return firebaseAuth.f9707e.zza(firebaseAuth.f9703a, c0457f, str, (b4.M) new C0460i(firebaseAuth));
    }
}
