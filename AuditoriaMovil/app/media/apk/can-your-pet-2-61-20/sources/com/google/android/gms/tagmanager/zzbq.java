package com.google.android.gms.tagmanager;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzbq extends zzfk {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzal.toString();

    public zzbq() {
        super(zza);
    }

    @Override // com.google.android.gms.tagmanager.zzfk
    protected final boolean zzc(String str, String str2, Map map) {
        return str.endsWith(str2);
    }
}
