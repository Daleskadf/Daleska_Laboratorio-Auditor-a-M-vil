package l4;

import U3.i;
import X3.j;
import c4.p;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h3.AbstractC1079a;
import java.util.ArrayList;
import u4.k;
import u4.n;
/* renamed from: l4.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1419c extends AbstractC1079a {

    /* renamed from: d  reason: collision with root package name */
    public n f13848d;

    /* renamed from: e  reason: collision with root package name */
    public Z3.b f13849e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final C1417a f13850g = new C1417a(this);

    public C1419c(p pVar) {
        pVar.a(new C1417a(this));
    }

    public final synchronized Task A() {
        Z3.b bVar = this.f13849e;
        if (bVar == null) {
            return Tasks.forException(new i("AppCheck is not available"));
        }
        Task b5 = ((X3.d) bVar).b(this.f);
        this.f = false;
        return b5.continueWithTask(k.f16005b, new C1418b(0));
    }

    public final synchronized void B() {
        this.f = true;
    }

    public final synchronized void C() {
        this.f13848d = null;
        Z3.b bVar = this.f13849e;
        if (bVar != null) {
            C1417a c1417a = this.f13850g;
            X3.d dVar = (X3.d) bVar;
            ArrayList arrayList = dVar.f6380a;
            arrayList.remove(c1417a);
            int size = dVar.f6381b.size() + arrayList.size();
            j jVar = dVar.f6383d;
            if (jVar.f6397b == 0 && size > 0) {
                jVar.f6397b = size;
            } else if (jVar.f6397b > 0 && size == 0) {
                jVar.f6396a.getClass();
            }
            jVar.f6397b = size;
        }
    }

    public final synchronized void D(n nVar) {
        this.f13848d = nVar;
    }
}
