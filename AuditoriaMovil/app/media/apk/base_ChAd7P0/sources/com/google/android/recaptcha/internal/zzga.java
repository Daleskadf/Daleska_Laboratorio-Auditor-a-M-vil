package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.j;
import m6.AbstractC1446g;
import m6.p;
/* loaded from: classes.dex */
public final class zzga extends zzfx {
    private final zzfz zza;
    private final String zzb;

    public zzga(zzfz zzfzVar, String str, Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List list;
        if (j.a(method.getName(), this.zzb)) {
            zzfz zzfzVar = this.zza;
            if (objArr != null) {
                list = AbstractC1446g.H(objArr);
            } else {
                list = p.f14074a;
            }
            zzfzVar.zzb(list);
            return true;
        }
        return false;
    }
}
