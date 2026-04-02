package com.google.android.gms.internal.auth;

import android.util.Base64;
import android.util.Log;
import androidx.datastore.preferences.protobuf.Y;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcy extends zzdc {
    final /* synthetic */ zzhy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzcz zzczVar, String str, Object obj, boolean z7, zzhy zzhyVar) {
        super(zzczVar, "getTokenRefactor__blocked_packages", obj, true, null);
        this.zza = zzhyVar;
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final Object zza(Object obj) {
        try {
            return zzhs.zzp(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            StringBuilder m7 = Y.m("Invalid byte[] value for ", this.zzc, ": ");
            m7.append((String) obj);
            Log.e("PhenotypeFlag", m7.toString());
            return null;
        }
    }
}
