package T4;

import android.os.Handler;
import android.os.Message;
import g1.C1006c;
/* loaded from: classes.dex */
public final class g extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5362a = false;

    /* renamed from: b  reason: collision with root package name */
    public f f5363b = null;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f5364c;

    public g(h hVar) {
        this.f5364c = hVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        f fVar;
        if (message.what == 1) {
            this.f5362a = false;
            if (this.f5363b != null) {
                sendEmptyMessage(0);
                return;
            }
            return;
        }
        removeMessages(0);
        if (this.f5362a || this.f5363b == null) {
            return;
        }
        C1006c e02 = this.f5364c.f5367a.e0();
        synchronized (this) {
            fVar = this.f5363b;
            this.f5363b = null;
            this.f5362a = true;
        }
        fVar.f5358b = new C.b(this, 19);
        fVar.f5359c = e02;
        float f = this.f5364c.f5367a.c0().f9460b;
        fVar.f5361e = f;
        fVar.f5360d = new X4.b(Math.pow(2.0d, Math.min(f, fVar.f.f5378n)) * 256.0d);
        this.f5364c.f.execute(fVar);
    }
}
