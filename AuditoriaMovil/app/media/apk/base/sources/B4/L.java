package b4;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public final class L implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8206a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8207b;

    public /* synthetic */ L(int i7, TaskCompletionSource taskCompletionSource) {
        this.f8206a = i7;
        this.f8207b = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.f8206a) {
            case 0:
                this.f8207b.setResult(new N(null, null, (String) obj));
                return;
            default:
                this.f8207b.setResult(new N((String) obj, null, null));
                return;
        }
    }
}
