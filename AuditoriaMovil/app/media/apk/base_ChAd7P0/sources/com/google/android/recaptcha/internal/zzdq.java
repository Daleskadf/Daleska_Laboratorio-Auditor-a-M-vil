package com.google.android.recaptcha.internal;

import android.app.Application;
import kotlin.jvm.internal.k;
import w6.InterfaceC1959a;
/* loaded from: classes.dex */
public final class zzdq extends k implements InterfaceC1959a {
    public static final zzdq zza = new zzdq();

    public zzdq() {
        super(0);
    }

    @Override // w6.InterfaceC1959a
    public final Object invoke() {
        int i7 = zzav.zza;
        Object zzb = zzau.zza().zzb(735120228);
        if (zzb != null) {
            return (Application) zzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
