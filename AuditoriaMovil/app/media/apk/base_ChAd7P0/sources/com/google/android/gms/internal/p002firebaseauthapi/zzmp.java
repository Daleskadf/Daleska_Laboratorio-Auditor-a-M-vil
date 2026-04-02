package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmp  reason: invalid package */
/* loaded from: classes.dex */
public final class zzmp implements zzbz {
    private final SharedPreferences.Editor zza;
    private final String zzb;

    public zzmp(Context context, String str, String str2) {
        if (str != null) {
            this.zzb = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.zza = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                return;
            } else {
                this.zza = applicationContext.getSharedPreferences(str2, 0).edit();
                return;
            }
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbz
    public final void zza(zzuz zzuzVar) {
        if (!this.zza.putString(this.zzb, zzza.zza(zzuzVar.zzk())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbz
    public final void zza(zzwl zzwlVar) {
        if (!this.zza.putString(this.zzb, zzza.zza(zzwlVar.zzk())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
