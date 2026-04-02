package X3;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import w.c0;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Continuation, U.j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f6378a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6379b;

    public /* synthetic */ c(Object obj, boolean z7) {
        this.f6379b = obj;
        this.f6378a = z7;
    }

    @Override // U.j
    public Object i(final U.i iVar) {
        final c0 c0Var = (c0) this.f6379b;
        c0Var.getClass();
        final boolean z7 = this.f6378a;
        c0Var.f16187d.execute(new Runnable() { // from class: w.b0
            @Override // java.lang.Runnable
            public final void run() {
                c0 c0Var2 = c0.this;
                U.i iVar2 = iVar;
                boolean z8 = z7;
                if (!c0Var2.f16186c) {
                    if (iVar2 != null) {
                        iVar2.b(new IllegalStateException("No flash unit"));
                        return;
                    }
                    return;
                }
                boolean z9 = c0Var2.f16188e;
                androidx.lifecycle.C c8 = c0Var2.f16185b;
                if (!z9) {
                    c0.a(c8, 0);
                    if (iVar2 != null) {
                        iVar2.b(new Exception("Camera is not active."));
                        return;
                    }
                    return;
                }
                c0Var2.f16189g = z8;
                c0Var2.f16184a.d(z8);
                c0.a(c8, Integer.valueOf(z8 ? 1 : 0));
                U.i iVar3 = c0Var2.f;
                if (iVar3 != null) {
                    iVar3.b(new Exception("There is a new enableTorch being set"));
                }
                c0Var2.f = iVar2;
            }
        });
        return "enableTorch: " + z7;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z7 = this.f6378a;
        d dVar = (d) this.f6379b;
        if (!z7) {
            a aVar = dVar.j;
            if (aVar != null) {
                dVar.f6387i.getClass();
                if ((aVar.f6373a + aVar.f6374b) - System.currentTimeMillis() > 300000) {
                    return Tasks.forResult(b.a(dVar.j));
                }
            }
        } else {
            dVar.getClass();
        }
        return Tasks.forResult(new b("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", new U3.i("No AppCheckProvider installed.")));
    }
}
