package a4;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
/* loaded from: classes.dex */
public final class P extends m5.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6999a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f7000b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0454c f7001c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f7002d;

    public /* synthetic */ P(FirebaseAuth firebaseAuth, String str, C0454c c0454c, int i7) {
        this.f6999a = i7;
        this.f7000b = str;
        this.f7001c = c0454c;
        this.f7002d = firebaseAuth;
    }

    @Override // m5.d
    public final Task I(String str) {
        switch (this.f6999a) {
            case 0:
                boolean isEmpty = TextUtils.isEmpty(str);
                String str2 = this.f7000b;
                if (isEmpty) {
                    Log.i("FirebaseAuth", "Password reset request " + str2 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for password reset of email " + str2);
                }
                FirebaseAuth firebaseAuth = this.f7002d;
                return firebaseAuth.f9707e.zza(firebaseAuth.f9703a, this.f7000b, this.f7001c, firebaseAuth.f9711k, str);
            default:
                boolean isEmpty2 = TextUtils.isEmpty(str);
                String str3 = this.f7000b;
                if (isEmpty2) {
                    Log.i("FirebaseAuth", "Email link sign in for " + str3 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for email link sign in for " + str3);
                }
                FirebaseAuth firebaseAuth2 = this.f7002d;
                return firebaseAuth2.f9707e.zzb(firebaseAuth2.f9703a, this.f7000b, this.f7001c, firebaseAuth2.f9711k, str);
        }
    }
}
