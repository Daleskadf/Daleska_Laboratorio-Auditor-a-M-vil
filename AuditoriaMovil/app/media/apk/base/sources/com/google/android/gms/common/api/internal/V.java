package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;
/* loaded from: classes.dex */
public final class V extends zau {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ W f9214a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(W w2, Looper looper) {
        super(looper);
        this.f9214a = w2;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 0) {
            if (i7 != 1) {
                Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i7);
                return;
            }
            RuntimeException runtimeException = (RuntimeException) message.obj;
            Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
            throw runtimeException;
        }
        com.google.android.gms.common.api.r rVar = (com.google.android.gms.common.api.r) message.obj;
        synchronized (this.f9214a.f9216b) {
            try {
                W w2 = this.f9214a.f9215a;
                com.google.android.gms.common.internal.I.i(w2);
                if (rVar == null) {
                    w2.c(new Status(13, "Transform returned null", null, null));
                } else {
                    w2.b(rVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
