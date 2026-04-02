package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.i;
import w6.l;
/* loaded from: classes.dex */
final /* synthetic */ class zzdz extends i implements l {
    public zzdz(Object obj) {
        super(1, obj, zzec.class, "isRetriable", "isRetriable(Ljava/lang/Exception;)Z", 0);
    }

    @Override // w6.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean zzo;
        zzec zzecVar = (zzec) this.receiver;
        zzo = zzec.zzo((Exception) obj);
        return Boolean.valueOf(zzo);
    }
}
