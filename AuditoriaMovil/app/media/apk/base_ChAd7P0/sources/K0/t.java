package K0;

import android.os.Message;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public Message f2520a;

    public final void a() {
        this.f2520a = null;
        ArrayList arrayList = u.f2521b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f2520a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
