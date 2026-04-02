package P5;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.firestore.C1162g;
import java.util.HashMap;
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4037a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f4038b;

    public /* synthetic */ e(int i7, TaskCompletionSource taskCompletionSource) {
        this.f4037a = i7;
        this.f4038b = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TaskCompletionSource taskCompletionSource = this.f4038b;
        switch (this.f4037a) {
            case 0:
                FlutterFirebasePluginRegistry.a(taskCompletionSource);
                return;
            case 1:
                HashMap hashMap = C1162g.f11922Y;
                try {
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
            default:
                HashMap hashMap2 = io.flutter.plugins.firebase.storage.c.f11978c;
                taskCompletionSource.setResult(new HashMap());
                return;
        }
    }
}
