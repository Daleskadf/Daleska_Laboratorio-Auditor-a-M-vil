package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import f7.a;
/* loaded from: classes.dex */
final class zzd extends zzk {
    @Override // com.google.android.gms.internal.mlkit_common.zzk
    public final int zza(Context context, zzj zzjVar, boolean z7) {
        if (zzjVar.zza.getAuthority().lastIndexOf(64) >= 0 && a.b(context, "android.permission.INTERACT_ACROSS_USERS") == 0) {
            return 2;
        }
        return 3;
    }
}
