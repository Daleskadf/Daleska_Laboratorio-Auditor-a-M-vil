package u4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes3.dex */
public class b implements u4.a {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f19049a = new a(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public final x4.b f19050b;

    /* loaded from: classes3.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            y4.a aVar = (y4.a) message.obj;
            switch (aVar.k()) {
                case 1:
                    if (aVar.d() != null) {
                        aVar.d().onStart();
                        return;
                    }
                    return;
                case 2:
                    if (aVar.d() != null) {
                        aVar.d().d(aVar.i(), aVar.j());
                        return;
                    }
                    return;
                case 3:
                    if (aVar.d() != null) {
                        aVar.d().c();
                        return;
                    }
                    return;
                case 4:
                    if (aVar.d() != null) {
                        aVar.d().a();
                        return;
                    }
                    return;
                case 5:
                    if (aVar.d() != null) {
                        aVar.d().b();
                        return;
                    }
                    return;
                case 6:
                    if (aVar.d() != null) {
                        aVar.d().e(aVar.f());
                        return;
                    }
                    return;
                case 7:
                    if (aVar.d() != null) {
                        aVar.d().f();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public b(x4.b bVar) {
        this.f19050b = bVar;
    }

    @Override // u4.a
    public void a(y4.a aVar) {
        if (aVar.k() != 7) {
            this.f19050b.e(aVar);
            if (aVar.e() != null) {
                for (y4.b bVar : aVar.e()) {
                    this.f19050b.f(bVar);
                }
            }
        }
        Message obtainMessage = this.f19049a.obtainMessage(aVar.g().hashCode());
        obtainMessage.obj = aVar;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.f19049a.handleMessage(obtainMessage);
        } else {
            obtainMessage.sendToTarget();
        }
    }

    @Override // u4.a
    public void b(y4.a aVar, z4.a aVar2) {
        if (aVar2.a() == 7) {
            return;
        }
        aVar.C(6);
        aVar.x(aVar2);
        a(aVar);
    }
}
