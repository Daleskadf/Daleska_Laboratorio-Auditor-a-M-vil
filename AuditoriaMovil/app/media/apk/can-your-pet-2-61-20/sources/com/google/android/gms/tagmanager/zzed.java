package com.google.android.gms.tagmanager;

import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzed extends zzfk {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzaj.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzbx.toString();

    public zzed() {
        super(zza);
    }

    @Override // com.google.android.gms.tagmanager.zzfk
    protected final boolean zzc(String str, String str2, Map map) {
        try {
            return Pattern.compile(str2, true != zzfu.zzf(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) map.get(zzb))).booleanValue() ? 64 : 66).matcher(str).find();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }
}
