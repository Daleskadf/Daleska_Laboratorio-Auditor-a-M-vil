package Q5;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.H;
import com.google.firebase.firestore.q0;
import io.flutter.plugins.firebase.firestore.D;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import n4.C1533t;
import n4.M;
import x.RunnableC1972f;
/* loaded from: classes.dex */
public final class j implements L5.i {

    /* renamed from: X  reason: collision with root package name */
    public List f4442X;

    /* renamed from: a  reason: collision with root package name */
    public final A4.d f4444a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseFirestore f4445b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f4446c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f4447d;
    public D f;

    /* renamed from: e  reason: collision with root package name */
    public final Semaphore f4448e = new Semaphore(0);

    /* renamed from: Y  reason: collision with root package name */
    public final Handler f4443Y = new Handler(Looper.getMainLooper());

    public j(A4.d dVar, FirebaseFirestore firebaseFirestore, Long l8, Long l9) {
        this.f4444a = dVar;
        this.f4445b = firebaseFirestore;
        this.f4446c = l8;
        this.f4447d = l9;
    }

    @Override // L5.i
    public final void a(Object obj, L5.h hVar) {
        Task task;
        FirebaseFirestore firebaseFirestore = this.f4445b;
        int intValue = this.f4447d.intValue();
        if (intValue >= 1) {
            q0 q0Var = new q0(intValue);
            A4.d dVar = new A4.d(10, this, hVar);
            firebaseFirestore.getClass();
            ThreadPoolExecutor threadPoolExecutor = M.f14310g;
            firebaseFirestore.f9754k.n0();
            M.b bVar = new M.b(firebaseFirestore, threadPoolExecutor, dVar, 3);
            R1.j jVar = firebaseFirestore.f9754k;
            synchronized (jVar) {
                jVar.n0();
                C1533t c1533t = (C1533t) jVar.f4683c;
                c1533t.e();
                u4.c cVar = c1533t.f14363d.f15988a;
                H h8 = new H(c1533t, q0Var, bVar, 2);
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                cVar.execute(new RunnableC1972f(h8, cVar, taskCompletionSource, 1));
                task = taskCompletionSource.getTask();
            }
            task.addOnCompleteListener(new g(0, this, hVar));
            return;
        }
        throw new IllegalArgumentException("Max attempts must be at least 1");
    }

    @Override // L5.i
    public final void b() {
        this.f4448e.release();
    }
}
