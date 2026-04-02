package b4;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
/* renamed from: b4.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589C implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f8179a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8180b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f8181c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f8182d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ H f8183e;
    public final /* synthetic */ TaskCompletionSource f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0610s f8184g;

    public C0589C(C0610s c0610s, FirebaseAuth firebaseAuth, String str, Activity activity, boolean z7, H h8, TaskCompletionSource taskCompletionSource) {
        this.f8179a = firebaseAuth;
        this.f8180b = str;
        this.f8181c = activity;
        this.f8182d = z7;
        this.f8183e = h8;
        this.f = taskCompletionSource;
        this.f8184g = c0610s;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        String message = exc.getMessage();
        Log.e("s", "Failed to get reCAPTCHA enterprise token: " + message + "\n\n Using fallback methods.");
        boolean i7 = this.f8179a.o().i();
        TaskCompletionSource taskCompletionSource = this.f;
        if (i7) {
            this.f8184g.c(this.f8179a, this.f8180b, this.f8181c, this.f8182d, false, this.f8183e, taskCompletionSource);
            return;
        }
        taskCompletionSource.setResult(new N(null, null, null));
    }
}
