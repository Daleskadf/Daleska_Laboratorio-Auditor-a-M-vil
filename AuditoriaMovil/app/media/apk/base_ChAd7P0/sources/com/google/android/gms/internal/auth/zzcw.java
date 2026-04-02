package com.google.android.gms.internal.auth;

import android.util.Log;
import androidx.datastore.preferences.protobuf.Y;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcw extends zzdc {
    public zzcw(zzcz zzczVar, String str, Boolean bool, boolean z7) {
        super(zzczVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        if (zzcb.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzcb.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder m7 = Y.m("Invalid boolean value for ", this.zzc, ": ");
        m7.append((String) obj);
        Log.e("PhenotypeFlag", m7.toString());
        return null;
    }
}
