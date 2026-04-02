package w3;

import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public abstract class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TaskCompletionSource f16367a;

    public z() {
        this.f16367a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f16367a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f16367a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e7) {
            a(e7);
        }
    }

    public z(TaskCompletionSource taskCompletionSource) {
        this.f16367a = taskCompletionSource;
    }
}
