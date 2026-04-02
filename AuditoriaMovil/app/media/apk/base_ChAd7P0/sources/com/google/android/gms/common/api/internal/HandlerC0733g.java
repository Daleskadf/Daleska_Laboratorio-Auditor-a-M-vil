package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;
/* renamed from: com.google.android.gms.common.api.internal.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC0733g extends zau {
    public final void a(com.google.android.gms.common.api.u uVar, com.google.android.gms.common.api.t tVar) {
        int i7 = BasePendingResult.zad;
        com.google.android.gms.common.internal.I.i(uVar);
        sendMessage(obtainMessage(1, new Pair(uVar, tVar)));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            if (i7 != 2) {
                Log.wtf("BasePendingResult", io.flutter.plugins.pathprovider.b.e(i7, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f9150Y);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        com.google.android.gms.common.api.u uVar = (com.google.android.gms.common.api.u) pair.first;
        com.google.android.gms.common.api.t tVar = (com.google.android.gms.common.api.t) pair.second;
        try {
            W w2 = (W) uVar;
            synchronized (w2.f9216b) {
                if (tVar.getStatus().k()) {
                    com.google.android.gms.common.api.o oVar = (com.google.android.gms.common.api.o) w2.f9217c.get();
                } else {
                    w2.c(tVar.getStatus());
                }
            }
        } catch (RuntimeException e7) {
            BasePendingResult.zal(tVar);
            throw e7;
        }
    }
}
