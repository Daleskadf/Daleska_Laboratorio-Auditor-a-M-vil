package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
/* loaded from: classes.dex */
public final class S implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ T f9339a;

    public /* synthetic */ S(T t7) {
        this.f9339a = t7;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 0) {
            if (i7 != 1) {
                return false;
            }
            synchronized (this.f9339a.f9340d) {
                try {
                    P p7 = (P) message.obj;
                    Q q2 = (Q) this.f9339a.f9340d.get(p7);
                    if (q2 != null && q2.f9335b == 3) {
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(p7)), new Exception());
                        ComponentName componentName = q2.f;
                        if (componentName == null) {
                            componentName = p7.f9331c;
                        }
                        if (componentName == null) {
                            String str = p7.f9330b;
                            I.i(str);
                            componentName = new ComponentName(str, "unknown");
                        }
                        q2.onServiceDisconnected(componentName);
                    }
                } finally {
                }
            }
            return true;
        }
        synchronized (this.f9339a.f9340d) {
            try {
                P p8 = (P) message.obj;
                Q q7 = (Q) this.f9339a.f9340d.get(p8);
                if (q7 != null && q7.f9334a.isEmpty()) {
                    if (q7.f9336c) {
                        q7.f9333X.f.removeMessages(1, q7.f9338e);
                        T t7 = q7.f9333X;
                        t7.f9342g.a(t7.f9341e, q7);
                        q7.f9336c = false;
                        q7.f9335b = 2;
                    }
                    this.f9339a.f9340d.remove(p8);
                }
            } finally {
            }
        }
        return true;
    }
}
