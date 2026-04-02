package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import D2.b;
import D2.i;
import I2.f;
import I2.g;
import M2.a;
import V2.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f9083a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR)).intValue();
        int i7 = intent.getExtras().getInt("attemptNumber");
        i.b(context);
        k a7 = b.a();
        if (queryParameter != null) {
            a7.f5965b = queryParameter;
            a7.f5967d = a.b(intValue);
            if (queryParameter2 != null) {
                a7.f5966c = Base64.decode(queryParameter2, 0);
            }
            g gVar = i.a().f856d;
            b a8 = a7.a();
            I2.a aVar = I2.a.f2174a;
            gVar.getClass();
            gVar.f2191e.execute(new f(gVar, a8, i7, aVar));
            return;
        }
        throw new NullPointerException("Null backendName");
    }
}
