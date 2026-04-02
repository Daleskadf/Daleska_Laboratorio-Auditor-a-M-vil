package t4;

import a6.AbstractC0479h;
import a6.AbstractC0496z;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class n extends AbstractC0496z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC0479h[] f15819a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f15820b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p f15821c;

    public n(p pVar, AbstractC0479h[] abstractC0479hArr, Task task) {
        this.f15821c = pVar;
        this.f15819a = abstractC0479hArr;
        this.f15820b = task;
    }

    @Override // a6.AbstractC0496z, a6.AbstractC0479h
    public final void b() {
        if (this.f15819a[0] == null) {
            this.f15820b.addOnSuccessListener((Executor) this.f15821c.f15828a.f15988a, (OnSuccessListener) new Object());
            return;
        }
        super.b();
    }

    @Override // a6.AbstractC0496z
    public final AbstractC0479h f() {
        boolean z7;
        AbstractC0479h[] abstractC0479hArr = this.f15819a;
        if (abstractC0479hArr[0] != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("ClientCall used before onOpen() callback", z7, new Object[0]);
        return abstractC0479hArr[0];
    }
}
