package Q5;

import D.AbstractC0055e;
import com.google.firebase.firestore.C0813o;
import com.google.firebase.firestore.C0814p;
import com.google.firebase.firestore.EnumC0815q;
import com.google.firebase.firestore.P;
import com.google.firebase.firestore.Q;
import com.google.firebase.firestore.a0;
import com.google.firebase.firestore.g0;
import java.util.concurrent.Executor;
import n4.C1523i;
import u4.k;
/* loaded from: classes.dex */
public final class b implements L5.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4419a;

    /* renamed from: b  reason: collision with root package name */
    public a0 f4420b;

    /* renamed from: c  reason: collision with root package name */
    public EnumC0815q f4421c;

    /* renamed from: d  reason: collision with root package name */
    public P f4422d;

    /* renamed from: e  reason: collision with root package name */
    public Q f4423e;
    public Object f;

    @Override // L5.i
    public final void a(Object obj, L5.h hVar) {
        boolean z7;
        boolean z8;
        switch (this.f4419a) {
            case 0:
                Executor executor = k.f16004a;
                a0 a0Var = this.f4420b;
                AbstractC0055e.b(a0Var, "metadataChanges must not be null.");
                P p7 = this.f4422d;
                AbstractC0055e.b(p7, "listen source must not be null.");
                a aVar = new a(0, this, hVar);
                C0814p c0814p = (C0814p) this.f;
                C1523i c1523i = new C1523i();
                a0 a0Var2 = a0.INCLUDE;
                boolean z9 = true;
                if (a0Var == a0Var2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                c1523i.f14342a = z7;
                if (a0Var != a0Var2) {
                    z9 = false;
                }
                c1523i.f14343b = z9;
                c1523i.f14344c = false;
                c1523i.f14345d = p7;
                this.f4423e = c0814p.a(executor, c1523i, aVar);
                return;
            default:
                Executor executor2 = k.f16004a;
                a0 a0Var3 = this.f4420b;
                AbstractC0055e.b(a0Var3, "metadataChanges must not be null.");
                P p8 = this.f4422d;
                AbstractC0055e.b(p8, "listen source must not be null.");
                a aVar2 = new a(1, this, hVar);
                g0 g0Var = (g0) this.f;
                C1523i c1523i2 = new C1523i();
                a0 a0Var4 = a0.INCLUDE;
                boolean z10 = true;
                if (a0Var3 == a0Var4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                c1523i2.f14342a = z8;
                if (a0Var3 != a0Var4) {
                    z10 = false;
                }
                c1523i2.f14343b = z10;
                c1523i2.f14344c = false;
                c1523i2.f14345d = p8;
                this.f4423e = g0Var.a(executor2, c1523i2, aVar2);
                return;
        }
    }

    @Override // L5.i
    public final void b() {
        switch (this.f4419a) {
            case 0:
                C0813o c0813o = (C0813o) this.f4423e;
                if (c0813o != null) {
                    c0813o.remove();
                    this.f4423e = null;
                    return;
                }
                return;
            default:
                C0813o c0813o2 = (C0813o) this.f4423e;
                if (c0813o2 != null) {
                    c0813o2.remove();
                    this.f4423e = null;
                    return;
                }
                return;
        }
    }
}
