package O0;

import android.util.Pair;
import e1.C0960z;
import java.io.IOException;
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Object f3660X;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3661a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e1.r f3662b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b1.g f3663c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ IOException f3664d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f3665e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a0(Object obj, Object obj2, e1.r rVar, b1.g gVar, IOException iOException, boolean z7, int i7) {
        this.f3661a = i7;
        this.f = obj;
        this.f3660X = obj2;
        this.f3662b = rVar;
        this.f3663c = gVar;
        this.f3664d = iOException;
        this.f3665e = z7;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, e1.D] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3661a) {
            case 0:
                P0.d dVar = (P0.d) ((d0) ((M0.x) this.f).f3211c).f3693i;
                Pair pair = (Pair) this.f3660X;
                dVar.A(((Integer) pair.first).intValue(), (C0960z) pair.second, this.f3662b, this.f3663c, this.f3664d, this.f3665e);
                return;
            default:
                T0.d dVar2 = (T0.d) this.f;
                int i7 = dVar2.f5287a;
                this.f3660X.A(i7, dVar2.f5288b, this.f3662b, this.f3663c, this.f3664d, this.f3665e);
                return;
        }
    }
}
