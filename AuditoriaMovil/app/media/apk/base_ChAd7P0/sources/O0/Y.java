package O0;

import android.util.Pair;
import e1.C0960z;
/* loaded from: classes.dex */
public final /* synthetic */ class Y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3648a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ M0.x f3649b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Pair f3650c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b1.g f3651d;

    public /* synthetic */ Y(M0.x xVar, Pair pair, b1.g gVar, int i7) {
        this.f3648a = i7;
        this.f3649b = xVar;
        this.f3650c = pair;
        this.f3651d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3648a) {
            case 0:
                Pair pair = this.f3650c;
                int intValue = ((Integer) pair.first).intValue();
                C0960z c0960z = (C0960z) pair.second;
                c0960z.getClass();
                ((P0.d) ((d0) this.f3649b.f3211c).f3693i).C(intValue, c0960z, this.f3651d);
                return;
            default:
                Pair pair2 = this.f3650c;
                ((P0.d) ((d0) this.f3649b.f3211c).f3693i).B(((Integer) pair2.first).intValue(), (C0960z) pair2.second, this.f3651d);
                return;
        }
    }
}
