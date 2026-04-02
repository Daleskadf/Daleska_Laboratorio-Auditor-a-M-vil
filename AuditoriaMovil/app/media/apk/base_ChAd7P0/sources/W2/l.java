package W2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzd;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class l extends zau {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6185a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f6186b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(W2.e r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f6186b = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto Ld
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L11:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f6185a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.l.<init>(W2.e, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i7 = message.what;
        if (i7 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i7);
            return;
        }
        int i8 = f.f6171a;
        e eVar = this.f6186b;
        Context context = this.f6185a;
        int d7 = eVar.d(context, i8);
        AtomicBoolean atomicBoolean = i.f6175a;
        if (d7 != 1 && d7 != 2 && d7 != 3 && d7 != 9) {
            return;
        }
        Intent b5 = eVar.b(d7, context, "n");
        if (b5 == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(context, 0, b5, zzd.zza | 134217728);
        }
        eVar.h(context, d7, activity);
    }
}
