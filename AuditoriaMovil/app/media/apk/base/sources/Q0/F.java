package Q0;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParsingReader;
/* loaded from: classes.dex */
public final /* synthetic */ class F implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4158a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4159b;

    public /* synthetic */ F(Object obj, int i7) {
        this.f4158a = i7;
        this.f4159b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4158a) {
            case 0:
                ((Handler) this.f4159b).post(runnable);
                return;
            case 1:
                u4.c cVar = ((u4.e) ((R1.j) this.f4159b).f4684d).f15988a;
                cVar.getClass();
                try {
                    cVar.f15984a.execute(runnable);
                    return;
                } catch (RejectedExecutionException unused) {
                    u4.q.d(u4.e.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
                    return;
                }
            default:
                ParsingReader.a((Metadata) this.f4159b, runnable);
                return;
        }
    }
}
