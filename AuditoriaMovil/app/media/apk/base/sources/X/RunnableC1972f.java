package x;

import X5.E;
import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.H;
import java.util.concurrent.Executor;
/* renamed from: x.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1972f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16393a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f16394b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f16395c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f16396d;

    public /* synthetic */ RunnableC1972f(Object obj, Object obj2, Object obj3, int i7) {
        this.f16393a = i7;
        this.f16394b = obj;
        this.f16395c = obj2;
        this.f16396d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16393a) {
            case 0:
                ((C1973g) this.f16394b).f16397a.onSurfacePrepared((CameraCaptureSession) this.f16395c, (Surface) this.f16396d);
                return;
            default:
                H h8 = (H) this.f16394b;
                Executor executor = (Executor) this.f16395c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f16396d;
                try {
                    ((Task) h8.call()).continueWith(executor, new E(taskCompletionSource, 22));
                    return;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                } catch (Throwable th) {
                    taskCompletionSource.setException(new IllegalStateException("Unhandled throwable in callTask.", th));
                    return;
                }
        }
    }
}
