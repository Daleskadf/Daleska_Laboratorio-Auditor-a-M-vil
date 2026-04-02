package z0;

import androidx.lifecycle.C0570w;
import androidx.lifecycle.EnumC0562n;
/* renamed from: z0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2044d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16760a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f16761b;

    public /* synthetic */ RunnableC2044d(androidx.lifecycle.H h8) {
        this.f16761b = h8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16760a) {
            case 0:
                C2053m this$0 = (C2053m) this.f16761b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(null, "$operation");
                this$0.a(null);
                return;
            default:
                androidx.lifecycle.H this$02 = (androidx.lifecycle.H) this.f16761b;
                kotlin.jvm.internal.j.e(this$02, "this$0");
                int i7 = this$02.f7892b;
                C0570w c0570w = this$02.f;
                if (i7 == 0) {
                    this$02.f7893c = true;
                    c0570w.e(EnumC0562n.ON_PAUSE);
                }
                if (this$02.f7891a == 0 && this$02.f7893c) {
                    c0570w.e(EnumC0562n.ON_STOP);
                    this$02.f7894d = true;
                    return;
                }
                return;
        }
    }
}
