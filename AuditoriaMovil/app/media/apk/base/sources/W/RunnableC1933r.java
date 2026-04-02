package w;

import java.util.concurrent.atomic.AtomicBoolean;
import p.C1608t;
/* renamed from: w.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1933r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16260a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p4.P f16261b;

    public /* synthetic */ RunnableC1933r(p4.P p7, int i7) {
        this.f16260a = i7;
        this.f16261b = p7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16260a) {
            case 0:
                p4.P p7 = this.f16261b;
                if (!((AtomicBoolean) p7.f15211b).getAndSet(true)) {
                    ((C1936u) ((C1608t) p7.f15212c).f14881c).f16275c.execute(new RunnableC1933r(p7, 1));
                    return;
                }
                return;
            default:
                p4.P p8 = this.f16261b;
                if (((C1936u) ((C1608t) p8.f15212c).f14881c).f16277e != EnumC1934s.OPENING) {
                    ((C1936u) ((C1608t) p8.f15212c).f14881c).t("Camera skip reopen at state: " + ((C1936u) ((C1608t) p8.f15212c).f14881c).f16277e, null);
                    return;
                }
                ((C1936u) ((C1608t) p8.f15212c).f14881c).t("Camera onError timeout, reopen it.", null);
                ((C1936u) ((C1608t) p8.f15212c).f14881c).E(EnumC1934s.REOPENING);
                ((C1936u) ((C1608t) p8.f15212c).f14881c).f16272Z.b();
                return;
        }
    }
}
