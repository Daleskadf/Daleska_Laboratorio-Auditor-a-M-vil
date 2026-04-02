package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzff {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        edit.apply();
    }
}
