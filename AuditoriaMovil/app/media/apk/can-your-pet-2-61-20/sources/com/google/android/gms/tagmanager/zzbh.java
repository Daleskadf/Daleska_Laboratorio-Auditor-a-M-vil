package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzbh extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzI.toString();
    private final Context zzb;

    public zzbh(Context context) {
        super(zza, new String[0]);
        this.zzb = context;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String string = Settings.Secure.getString(this.zzb.getContentResolver(), "android_id");
        return string == null ? zzfu.zza() : zzfu.zzb(string);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
