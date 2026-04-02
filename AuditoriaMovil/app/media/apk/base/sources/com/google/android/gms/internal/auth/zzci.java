package com.google.android.gms.internal.auth;

import S.k;
import android.net.Uri;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzci {
    private final k zza;

    public zzci(k kVar) {
        this.zza = kVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        k kVar;
        if (uri != null) {
            kVar = (k) this.zza.get(uri.toString());
        } else {
            kVar = null;
        }
        if (kVar == null) {
            return null;
        }
        return (String) kVar.get(StringUtils.EMPTY.concat(str3));
    }
}
