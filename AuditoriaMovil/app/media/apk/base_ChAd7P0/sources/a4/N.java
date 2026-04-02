package a4;

import android.text.TextUtils;
import android.util.Log;
import b4.InterfaceC0592F;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
/* loaded from: classes.dex */
public final class N extends m5.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6991a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6992b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f6993c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f6994d;

    public /* synthetic */ N(FirebaseAuth firebaseAuth, Object obj, Object obj2, int i7) {
        this.f6991a = i7;
        this.f6993c = obj;
        this.f6994d = obj2;
        this.f6992b = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [a4.h, b4.F] */
    @Override // m5.d
    public final Task I(String str) {
        switch (this.f6991a) {
            case 0:
                if (TextUtils.isEmpty(str)) {
                    Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
                }
                FirebaseAuth firebaseAuth = this.f6992b;
                return firebaseAuth.f9707e.zza(firebaseAuth.f9703a, (AbstractC0467p) this.f6993c, (AbstractC0456e) ((C0457f) this.f6994d), str, (InterfaceC0592F) new C0459h(firebaseAuth, 0));
            default:
                boolean isEmpty = TextUtils.isEmpty(str);
                String str2 = (String) this.f6993c;
                if (isEmpty) {
                    Log.i("FirebaseAuth", "Creating user with " + str2 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for sign up with email " + str2);
                }
                FirebaseAuth firebaseAuth2 = this.f6992b;
                return firebaseAuth2.f9707e.zza(firebaseAuth2.f9703a, (String) this.f6993c, (String) this.f6994d, firebaseAuth2.f9711k, str, new C0460i(firebaseAuth2));
        }
    }
}
