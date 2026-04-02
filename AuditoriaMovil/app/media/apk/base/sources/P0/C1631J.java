package p0;

import java.util.concurrent.CancellationException;
/* renamed from: p0.J  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1631J extends kotlin.jvm.internal.k implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public static final C1631J f14940a = new kotlin.jvm.internal.k(2);

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        P msg = (P) obj;
        Throwable th = (Throwable) obj2;
        kotlin.jvm.internal.j.e(msg, "msg");
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        msg.f14967b.O(th);
        return l6.j.f13876a;
    }
}
