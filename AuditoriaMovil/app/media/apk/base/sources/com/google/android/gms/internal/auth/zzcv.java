package com.google.android.gms.internal.auth;

import android.util.Log;
import androidx.datastore.preferences.protobuf.Y;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l8, boolean z7) {
        super(zzczVar, str, l8, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder m7 = Y.m("Invalid long value for ", this.zzc, ": ");
            m7.append((String) obj);
            Log.e("PhenotypeFlag", m7.toString());
            return null;
        }
    }
}
