package x5;

import android.os.Handler;
import android.os.Looper;
import t4.RunnableC1822b;
/* renamed from: x5.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2013o extends kotlin.jvm.internal.k implements w6.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16553a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ K5.r f16554b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2013o(K5.r rVar, int i7) {
        super(1);
        this.f16553a = i7;
        this.f16554b = rVar;
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        switch (this.f16553a) {
            case 0:
                y5.d it = (y5.d) obj;
                kotlin.jvm.internal.j.e(it, "it");
                new Handler(Looper.getMainLooper()).post(new RunnableC1822b(22, this.f16554b, it));
                return l6.j.f13876a;
            default:
                Exception it2 = (Exception) obj;
                kotlin.jvm.internal.j.e(it2, "it");
                new Handler(Looper.getMainLooper()).post(new RunnableC1822b(23, it2, this.f16554b));
                return l6.j.f13876a;
        }
    }
}
