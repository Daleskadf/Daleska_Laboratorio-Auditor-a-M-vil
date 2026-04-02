package U3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class g extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference f5745b = new AtomicReference();

    /* renamed from: a  reason: collision with root package name */
    public final Context f5746a;

    public g(Context context) {
        this.f5746a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (h.f5747k) {
            try {
                Iterator it = ((S.e) h.f5748l.values()).iterator();
                while (it.hasNext()) {
                    ((h) it.next()).g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5746a.unregisterReceiver(this);
    }
}
