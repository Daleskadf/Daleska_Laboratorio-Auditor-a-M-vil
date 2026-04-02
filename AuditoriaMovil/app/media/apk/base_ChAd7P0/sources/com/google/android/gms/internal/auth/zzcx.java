package com.google.android.gms.internal.auth;

import android.util.Log;
import androidx.datastore.preferences.protobuf.Y;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d7, boolean z7) {
        super(zzczVar, str, d7, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder m7 = Y.m("Invalid double value for ", this.zzc, ": ");
            m7.append((String) obj);
            Log.e("PhenotypeFlag", m7.toString());
            return null;
        }
    }
}
