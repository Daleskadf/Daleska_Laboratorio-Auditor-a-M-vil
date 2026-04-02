package b4;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.firebase.auth.FirebaseAuth;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final /* synthetic */ class J implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ C0610s f8199a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ TaskCompletionSource f8200b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ FirebaseAuth f8201c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Activity f8202d;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        String message;
        boolean isSuccessful = task.isSuccessful();
        TaskCompletionSource taskCompletionSource = this.f8200b;
        if (isSuccessful && task.getResult() != null && !TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) {
            taskCompletionSource.setResult(new N(null, ((IntegrityTokenResponse) task.getResult()).token(), null));
            return;
        }
        if (task.getException() == null) {
            message = StringUtils.EMPTY;
        } else {
            message = task.getException().getMessage();
        }
        Log.e("s", "Play Integrity Token fetch failed, falling back to Recaptcha" + message);
        C0610s c0610s = this.f8199a;
        FirebaseAuth firebaseAuth = this.f8201c;
        Activity activity = this.f8202d;
        c0610s.getClass();
        C0610s.b(firebaseAuth, activity, taskCompletionSource);
    }
}
