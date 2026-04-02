package com.google.android.recaptcha.internal;

import F6.C0106t;
import F6.H;
import F6.InterfaceC0105s;
import F6.K;
import F6.u0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* loaded from: classes.dex */
public final class zzbx {
    public static final K zza(Task task) {
        final C0106t a7 = H.a();
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                InterfaceC0105s interfaceC0105s = InterfaceC0105s.this;
                Exception exception = task2.getException();
                if (exception == null) {
                    if (task2.isCanceled()) {
                        ((u0) interfaceC0105s).cancel(null);
                        return;
                    }
                    ((C0106t) interfaceC0105s).C(task2.getResult());
                    return;
                }
                ((C0106t) interfaceC0105s).O(exception);
            }
        });
        return new zzbw(a7);
    }
}
