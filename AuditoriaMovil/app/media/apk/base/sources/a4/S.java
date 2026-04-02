package a4;

import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.auth.C1138a;
import java.util.Iterator;
import l4.C1420d;
import x4.C1998b;
/* loaded from: classes.dex */
public final class S implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7005a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f7006b;

    public S(FirebaseAuth firebaseAuth) {
        this.f7006b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7005a) {
            case 0:
                FirebaseAuth firebaseAuth = this.f7006b;
                Iterator it = firebaseAuth.f9706d.iterator();
                while (it.hasNext()) {
                    ((C1138a) it.next()).a(firebaseAuth);
                }
                return;
            default:
                FirebaseAuth firebaseAuth2 = this.f7006b;
                Iterator it2 = firebaseAuth2.f9705c.iterator();
                while (it2.hasNext()) {
                    ((C1420d) it2.next()).f13851a.D();
                }
                Iterator it3 = firebaseAuth2.f9704b.iterator();
                while (it3.hasNext()) {
                    ((io.flutter.plugins.firebase.auth.P) it3.next()).a(firebaseAuth2);
                }
                return;
        }
    }

    public S(FirebaseAuth firebaseAuth, C1998b c1998b) {
        this.f7006b = firebaseAuth;
    }
}
