package W2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.I;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6156a = false;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedBlockingQueue f6157b = new LinkedBlockingQueue();

    public final IBinder a() {
        I.h("BlockingServiceConnection.getService() called on main thread");
        if (!this.f6156a) {
            this.f6156a = true;
            return (IBinder) this.f6157b.take();
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f6157b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
