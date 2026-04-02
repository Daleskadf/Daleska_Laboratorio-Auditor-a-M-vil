package w3;

import b4.C0614w;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public final class B extends z {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f16335X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ z f16336Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ d f16337Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(d dVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, z zVar) {
        super(taskCompletionSource);
        this.f16337Z = dVar;
        this.f16335X = taskCompletionSource2;
        this.f16336Y = zVar;
    }

    @Override // w3.z
    public final void b() {
        synchronized (this.f16337Z.f) {
            try {
                d dVar = this.f16337Z;
                TaskCompletionSource taskCompletionSource = this.f16335X;
                dVar.f16349e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new C0614w(dVar, taskCompletionSource));
                if (this.f16337Z.f16354l.getAndIncrement() > 0) {
                    this.f16337Z.f16346b.b("Already connected to the service.", new Object[0]);
                }
                d.b(this.f16337Z, this.f16336Y);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
