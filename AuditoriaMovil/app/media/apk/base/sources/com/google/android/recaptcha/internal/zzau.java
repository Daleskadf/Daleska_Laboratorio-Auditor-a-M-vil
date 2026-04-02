package com.google.android.recaptcha.internal;

import java.util.Map;
import w6.InterfaceC1959a;
/* loaded from: classes.dex */
public final class zzau {
    public static final zzav zza() {
        zzav zzavVar;
        InterfaceC1959a interfaceC1959a;
        Map map;
        zzavVar = zzav.zzb;
        if (zzavVar == null) {
            interfaceC1959a = zzav.zzd;
            zzav zzavVar2 = new zzav((Map) interfaceC1959a.invoke(), null);
            map = zzav.zzc;
            map.clear();
            zzav.zzb = zzavVar2;
            return zzavVar2;
        }
        return zzavVar;
    }
}
