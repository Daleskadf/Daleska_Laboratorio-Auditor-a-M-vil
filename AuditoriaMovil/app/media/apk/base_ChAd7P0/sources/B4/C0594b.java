package b4;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzagt;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import w.C1908S;
/* renamed from: b4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0594b implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ C0610s f8230a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ TaskCompletionSource f8231b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ FirebaseAuth f8232c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ RecaptchaAction f8233d;

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ String f8234e;
    public /* synthetic */ Activity f;

    /* renamed from: g  reason: collision with root package name */
    public /* synthetic */ boolean f8235g;

    /* renamed from: h  reason: collision with root package name */
    public /* synthetic */ H f8236h;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        boolean z7;
        if (!task.isSuccessful()) {
            Log.e("s", "Failed to initialize reCAPTCHA config: " + task.getException().getMessage());
        }
        FirebaseAuth firebaseAuth = this.f8232c;
        C1908S o7 = firebaseAuth.o();
        C0610s c0610s = this.f8230a;
        TaskCompletionSource taskCompletionSource = this.f8231b;
        String str = this.f8234e;
        Activity activity = this.f;
        boolean z8 = this.f8235g;
        H h8 = this.f8236h;
        if (o7 != null) {
            C1908S o8 = firebaseAuth.o();
            synchronized (o8.f16112a) {
                try {
                    zzagt zzagtVar = (zzagt) o8.f16114c;
                    if (zzagtVar != null && zzagtVar.zzc("PHONE_PROVIDER")) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z7) {
                firebaseAuth.o().h(firebaseAuth.b(), Boolean.FALSE, this.f8233d).addOnSuccessListener(new L(0, taskCompletionSource)).addOnFailureListener(new C0589C(c0610s, firebaseAuth, str, activity, z8, h8, taskCompletionSource));
                return;
            }
        }
        c0610s.c(firebaseAuth, str, activity, z8, false, h8, taskCompletionSource);
    }
}
