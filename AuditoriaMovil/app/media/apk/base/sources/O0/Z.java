package O0;

import android.util.Pair;
import e1.C0960z;
/* loaded from: classes.dex */
public final /* synthetic */ class Z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3652a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ M0.x f3653b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Pair f3654c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e1.r f3655d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b1.g f3656e;

    public /* synthetic */ Z(M0.x xVar, Pair pair, e1.r rVar, b1.g gVar, int i7) {
        this.f3652a = i7;
        this.f3653b = xVar;
        this.f3654c = pair;
        this.f3655d = rVar;
        this.f3656e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3652a) {
            case 0:
                Pair pair = this.f3654c;
                ((P0.d) ((d0) this.f3653b.f3211c).f3693i).o(((Integer) pair.first).intValue(), (C0960z) pair.second, this.f3655d, this.f3656e);
                return;
            case 1:
                Pair pair2 = this.f3654c;
                ((P0.d) ((d0) this.f3653b.f3211c).f3693i).d(((Integer) pair2.first).intValue(), (C0960z) pair2.second, this.f3655d, this.f3656e);
                return;
            default:
                Pair pair3 = this.f3654c;
                ((P0.d) ((d0) this.f3653b.f3211c).f3693i).e(((Integer) pair3.first).intValue(), (C0960z) pair3.second, this.f3655d, this.f3656e);
                return;
        }
    }
}
