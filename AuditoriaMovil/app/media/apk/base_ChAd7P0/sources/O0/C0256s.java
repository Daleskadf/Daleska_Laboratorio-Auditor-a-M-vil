package O0;

import a4.C0468q;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import l4.C1421e;
import p4.C1683m;
import p4.InterfaceC1693x;
/* renamed from: O0.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0256s implements K0.h, Continuation, u4.r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3827a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3828b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3829c;

    public /* synthetic */ C0256s(Object obj, int i7, int i8) {
        this.f3827a = i8;
        this.f3829c = obj;
        this.f3828b = i7;
    }

    @Override // u4.r
    public Object get() {
        boolean z7;
        C1683m c1683m = (C1683m) this.f3829c;
        InterfaceC1693x interfaceC1693x = c1683m.f15268c;
        int i7 = this.f3828b;
        r4.i f = interfaceC1693x.f(i7);
        if (f != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Attempt to reject nonexistent batch!", z7, new Object[0]);
        c1683m.f15268c.i(f);
        c1683m.f15268c.b();
        c1683m.f15269d.I(i7);
        E.e eVar = c1683m.f;
        eVar.X(((p4.C) eVar.f920b).p(f.b()));
        return c1683m.f.H(f.b());
    }

    @Override // K0.h
    public void invoke(Object obj) {
        H0.N n7 = (H0.N) obj;
        switch (this.f3827a) {
            case 0:
                H0.V v6 = ((e0) this.f3829c).f3713a;
                n7.b(this.f3828b);
                return;
            default:
                n7.g((H0.C) this.f3829c, this.f3828b);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Task forException;
        C1421e c1421e = (C1421e) this.f3829c;
        int i7 = this.f3828b;
        synchronized (c1421e) {
            try {
                if (i7 != c1421e.f13854g) {
                    u4.q.a("FirebaseAuthCredentialsProvider", "getToken aborted due to token change", new Object[0]);
                    forException = c1421e.A();
                } else if (task.isSuccessful()) {
                    forException = Tasks.forResult(((C0468q) task.getResult()).f7043a);
                } else {
                    forException = Tasks.forException(task.getException());
                }
            } finally {
            }
        }
        return forException;
    }
}
