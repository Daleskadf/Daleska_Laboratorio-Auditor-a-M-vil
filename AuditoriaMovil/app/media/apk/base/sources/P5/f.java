package P5;

import D.AbstractC0055e;
import a4.AbstractC0467p;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.auth.C1140c;
import io.flutter.plugins.firebase.auth.L;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4039a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ U3.h f4040b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f4041c;

    public /* synthetic */ f(U3.h hVar, TaskCompletionSource taskCompletionSource, int i7) {
        this.f4039a = i7;
        this.f4040b = hVar;
        this.f4041c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L t7;
        TaskCompletionSource taskCompletionSource = this.f4041c;
        U3.h hVar = this.f4040b;
        switch (this.f4039a) {
            case 0:
                FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(hVar, taskCompletionSource);
                return;
            default:
                HashMap hashMap = C1140c.f11846Z;
                try {
                    HashMap hashMap2 = new HashMap();
                    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(hVar);
                    AbstractC0467p abstractC0467p = firebaseAuth.f;
                    String a7 = firebaseAuth.a();
                    if (abstractC0467p == null) {
                        t7 = null;
                    } else {
                        t7 = AbstractC0055e.t(abstractC0467p);
                    }
                    if (a7 != null) {
                        hashMap2.put("APP_LANGUAGE_CODE", a7);
                    }
                    if (t7 != null) {
                        hashMap2.put("APP_CURRENT_USER", AbstractC0055e.p(t7));
                    }
                    taskCompletionSource.setResult(hashMap2);
                    return;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
        }
    }
}
