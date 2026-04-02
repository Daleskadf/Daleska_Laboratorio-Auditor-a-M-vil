package p;

import androidx.appcompat.widget.Toolbar;
/* loaded from: classes.dex */
public final /* synthetic */ class N0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14700a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Toolbar f14701b;

    public /* synthetic */ N0(Toolbar toolbar, int i7) {
        this.f14700a = i7;
        this.f14701b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o.j jVar;
        switch (this.f14700a) {
            case 0:
                Q0 q0 = this.f14701b.f7450I0;
                if (q0 == null) {
                    jVar = null;
                } else {
                    jVar = q0.f14712b;
                }
                if (jVar != null) {
                    jVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f14701b.m();
                return;
        }
    }
}
