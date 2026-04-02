package r0;

import Q6.o;
import c5.C0639a;
import com.google.firebase.firestore.Z;
import kotlin.jvm.internal.k;
import w6.InterfaceC1959a;
/* renamed from: r0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1724d extends k implements InterfaceC1959a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15419a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1725e f15420b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1724d(C1725e c1725e, int i7) {
        super(0);
        this.f15419a = i7;
        this.f15420b = c1725e;
    }

    @Override // w6.InterfaceC1959a
    public final Object invoke() {
        switch (this.f15419a) {
            case 0:
                C1725e c1725e = this.f15420b;
                o oVar = (o) c1725e.f15424c.invoke();
                if (R6.c.a(oVar) != -1) {
                    return Z.s(oVar.f4481a.r(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + c1725e.f15424c + ", instead got " + oVar).toString());
            default:
                C0639a c0639a = C1725e.f;
                C1725e c1725e2 = this.f15420b;
                synchronized (c0639a) {
                    C1725e.f15421e.remove(((o) c1725e2.f15425d.a()).f4481a.r());
                }
                return l6.j.f13876a;
        }
    }
}
