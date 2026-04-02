package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
/* loaded from: classes.dex */
final class ar extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ as f9507a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(as asVar, Handler handler) {
        super(handler);
        this.f9507a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i7, Bundle bundle) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                this.f9507a.f9508a.trySetResult(1);
                return;
            }
            this.f9507a.f9508a.trySetResult(2);
            return;
        }
        this.f9507a.f9508a.trySetResult(3);
    }
}
