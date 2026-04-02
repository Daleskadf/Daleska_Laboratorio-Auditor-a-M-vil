package E0;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/* loaded from: classes.dex */
public final class c extends FutureTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f935a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, b bVar) {
        super(bVar);
        this.f935a = aVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        a aVar = this.f935a;
        try {
            Object obj = get();
            if (!aVar.f931d.get()) {
                aVar.a(obj);
            }
        } catch (InterruptedException e7) {
            Log.w("AsyncTask", e7);
        } catch (CancellationException unused) {
            if (!aVar.f931d.get()) {
                aVar.a(null);
            }
        } catch (ExecutionException e8) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e8.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
