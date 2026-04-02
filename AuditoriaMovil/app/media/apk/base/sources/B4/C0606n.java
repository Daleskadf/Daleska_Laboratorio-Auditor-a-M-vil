package b4;

import a4.C0462k;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: b4.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0606n implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8281a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8282b;

    public /* synthetic */ C0606n(Object obj, int i7) {
        this.f8281a = i7;
        this.f8282b = obj;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        long j;
        switch (this.f8281a) {
            case 0:
                if (exc instanceof U3.j) {
                    Z2.a aVar = C0604l.f;
                    aVar.e("Failure to refresh token; scheduling refresh after failure", new Object[0]);
                    C0604l c0604l = (C0604l) ((H.h) this.f8282b).f1627c;
                    int i7 = (int) c0604l.f8276b;
                    if (i7 != 30 && i7 != 60 && i7 != 120 && i7 != 240 && i7 != 480) {
                        if (i7 != 960) {
                            j = 30;
                        } else {
                            j = 960;
                        }
                    } else {
                        j = 2 * c0604l.f8276b;
                    }
                    c0604l.f8276b = j;
                    c0604l.f8275a = (c0604l.f8276b * 1000) + System.currentTimeMillis();
                    aVar.e(io.flutter.plugins.pathprovider.b.g("Scheduling refresh for ", c0604l.f8275a), new Object[0]);
                    c0604l.f8278d.postDelayed(c0604l.f8279e, c0604l.f8276b * 1000);
                    return;
                }
                return;
            default:
                String message = exc.getMessage();
                Log.e("s", "Failed to get reCAPTCHA token with error [" + message + "]- calling backend without app verification");
                boolean z7 = exc instanceof C0462k;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f8282b;
                if (z7 && ((C0462k) exc).f7038a.endsWith("UNAUTHORIZED_DOMAIN")) {
                    taskCompletionSource.setException(exc);
                    return;
                } else {
                    taskCompletionSource.setResult(new N(null, null, null));
                    return;
                }
        }
    }
}
