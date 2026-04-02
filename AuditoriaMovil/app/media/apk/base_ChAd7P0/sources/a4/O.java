package a4;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.firebase.auth.FirebaseAuth;
/* loaded from: classes.dex */
public final class O extends y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f6995a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b4.N f6996b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ y f6997c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6998d;

    public O(FirebaseAuth firebaseAuth, w wVar, b4.N n7, y yVar) {
        this.f6995a = wVar;
        this.f6996b = n7;
        this.f6997c = yVar;
        this.f6998d = firebaseAuth;
    }

    @Override // a4.y
    public final void onCodeAutoRetrievalTimeOut(String str) {
        this.f6997c.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // a4.y
    public final void onCodeSent(String str, x xVar) {
        this.f6997c.onCodeSent(str, xVar);
    }

    @Override // a4.y
    public final void onVerificationCompleted(v vVar) {
        this.f6997c.onVerificationCompleted(vVar);
    }

    @Override // a4.y
    public final void onVerificationFailed(U3.i iVar) {
        boolean zza = zzadr.zza(iVar);
        w wVar = this.f6995a;
        if (zza) {
            wVar.j = true;
            String str = wVar.f7057e;
            Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number " + str);
            FirebaseAuth.l(wVar);
            return;
        }
        b4.N n7 = this.f6996b;
        boolean isEmpty = TextUtils.isEmpty(n7.f8210c);
        y yVar = this.f6997c;
        if (!isEmpty) {
            if (zzadr.zzb(iVar) && this.f6998d.o().i() && TextUtils.isEmpty(n7.f8209b)) {
                wVar.f7061k = true;
                String str2 = wVar.f7057e;
                Log.d("FirebaseAuth", "Re-triggering phone verification with non-reCAPTCHA Enterprise flow for phone number " + str2);
                FirebaseAuth.l(wVar);
                return;
            }
            String str3 = wVar.f7057e;
            String message = iVar.getMessage();
            Log.d("FirebaseAuth", "Invoking original failure callbacks after reCAPTCHA Enterprise + phone verification failure for " + str3 + ", error - " + message);
            yVar.onVerificationFailed(iVar);
            return;
        }
        String str4 = wVar.f7057e;
        String message2 = iVar.getMessage();
        Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + str4 + ", error - " + message2);
        yVar.onVerificationFailed(iVar);
    }
}
