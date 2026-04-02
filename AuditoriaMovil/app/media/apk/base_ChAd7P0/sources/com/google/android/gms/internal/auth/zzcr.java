package com.google.android.gms.internal.auth;

import S.f;
import S.k;
import android.net.Uri;
/* loaded from: classes.dex */
public final class zzcr {
    private static final f zza = new k(0);

    public static synchronized Uri zza(String str) {
        synchronized (zzcr.class) {
            f fVar = zza;
            Uri uri = (Uri) fVar.get("com.google.android.gms.auth_account");
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
                fVar.put("com.google.android.gms.auth_account", parse);
                return parse;
            }
            return uri;
        }
    }
}
