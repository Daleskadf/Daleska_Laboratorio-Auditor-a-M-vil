package u0;

import K0.w;
import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: u0.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1855k implements InterfaceC1851g, w3.h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15931a;

    public C1855k(Context context, int i7) {
        switch (i7) {
            case 1:
                this.f15931a = context;
                return;
            default:
                this.f15931a = context.getApplicationContext();
                return;
        }
    }

    @Override // w3.i
    public Object a() {
        return this.f15931a;
    }

    @Override // u0.InterfaceC1851g
    public void a(f7.a aVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new w("EmojiCompatInitializer", 1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new A.h(this, aVar, threadPoolExecutor, 28));
    }
}
