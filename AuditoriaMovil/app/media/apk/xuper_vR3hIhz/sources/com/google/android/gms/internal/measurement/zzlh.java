package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
final class zzlh {
    public static final int zza(int i10, Object obj, Object obj2) {
        zzlg zzlgVar = (zzlg) obj;
        zzlf zzlfVar = (zzlf) obj2;
        if (!zzlgVar.isEmpty()) {
            Iterator it = zzlgVar.entrySet().iterator();
            if (!it.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzlg zzlgVar = (zzlg) obj;
        zzlg zzlgVar2 = (zzlg) obj2;
        if (!zzlgVar2.isEmpty()) {
            if (!zzlgVar.zze()) {
                zzlgVar = zzlgVar.zzb();
            }
            zzlgVar.zzd(zzlgVar2);
        }
        return zzlgVar;
    }
}
