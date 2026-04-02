package com.google.android.recaptcha.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import m6.s;
import w6.InterfaceC1959a;
/* loaded from: classes.dex */
final class zzat extends k implements InterfaceC1959a {
    public static final zzat zza = new zzat();

    public zzat() {
        super(0);
    }

    public static final Map zza() {
        Map map;
        map = zzav.zzc;
        LinkedHashMap linkedHashMap = new LinkedHashMap(s.O(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zzaw) entry.getValue()).zzb());
        }
        return linkedHashMap;
    }

    @Override // w6.InterfaceC1959a
    public final /* bridge */ /* synthetic */ Object invoke() {
        return zza();
    }
}
