package e;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.S;
import w6.InterfaceC1959a;
import z0.AbstractActivityC2064y;
/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.k implements InterfaceC1959a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10545a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2064y f10546b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(AbstractActivityC2064y abstractActivityC2064y, int i7) {
        super(0);
        this.f10545a = i7;
        this.f10546b = abstractActivityC2064y;
    }

    @Override // w6.InterfaceC1959a
    public final Object invoke() {
        Bundle bundle;
        switch (this.f10545a) {
            case 0:
                AbstractActivityC2064y abstractActivityC2064y = this.f10546b;
                Application application = abstractActivityC2064y.getApplication();
                if (abstractActivityC2064y.getIntent() != null) {
                    bundle = abstractActivityC2064y.getIntent().getExtras();
                } else {
                    bundle = null;
                }
                return new S(application, abstractActivityC2064y, bundle);
            case 1:
                this.f10546b.reportFullyDrawn();
                return l6.j.f13876a;
            case 2:
                AbstractActivityC2064y abstractActivityC2064y2 = this.f10546b;
                return new p(abstractActivityC2064y2.f, new m(abstractActivityC2064y2, 1));
            default:
                AbstractActivityC2064y abstractActivityC2064y3 = this.f10546b;
                C0918D c0918d = new C0918D(new RunnableC0923d(abstractActivityC2064y3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!kotlin.jvm.internal.j.a(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new com.google.firebase.firestore.S(5, abstractActivityC2064y3, c0918d));
                    } else {
                        abstractActivityC2064y3.f6028a.a(new h(c0918d, abstractActivityC2064y3));
                    }
                }
                return c0918d;
        }
    }
}
