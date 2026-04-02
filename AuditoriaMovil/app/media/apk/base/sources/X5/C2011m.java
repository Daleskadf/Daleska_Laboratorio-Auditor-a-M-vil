package x5;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import t4.RunnableC1822b;
/* renamed from: x5.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2011m extends kotlin.jvm.internal.k implements w6.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16550a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C2014p f16551b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2011m(C2014p c2014p, int i7) {
        super(1);
        this.f16550a = i7;
        this.f16551b = c2014p;
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        l6.j jVar = l6.j.f13876a;
        C2014p c2014p = this.f16551b;
        switch (this.f16550a) {
            case 0:
                String it = (String) obj;
                kotlin.jvm.internal.j.e(it, "it");
                new Handler(Looper.getMainLooper()).post(new RunnableC1822b(20, c2014p, it));
                return jVar;
            case 1:
                List it2 = (List) obj;
                kotlin.jvm.internal.j.e(it2, "it");
                new Handler(Looper.getMainLooper()).post(new RunnableC1822b(21, c2014p, it2));
                return jVar;
            case 2:
                String error = (String) obj;
                kotlin.jvm.internal.j.e(error, "error");
                new Handler(Looper.getMainLooper()).post(new RunnableC1822b(18, c2014p.f16559b, error));
                return jVar;
            case 3:
                c2014p.f16559b.c(m6.s.Q(new l6.d("name", "torchState"), new l6.d("data", Integer.valueOf(((Number) obj).intValue()))));
                return jVar;
            default:
                c2014p.f16559b.c(m6.s.Q(new l6.d("name", "zoomScaleState"), new l6.d("data", Double.valueOf(((Number) obj).doubleValue()))));
                return jVar;
        }
    }
}
