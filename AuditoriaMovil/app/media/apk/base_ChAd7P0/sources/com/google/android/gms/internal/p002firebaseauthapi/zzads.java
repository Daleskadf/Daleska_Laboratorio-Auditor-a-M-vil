package com.google.android.gms.internal.p002firebaseauthapi;

import Z2.a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;
import w4.InterfaceC1956b;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzads  reason: invalid package */
/* loaded from: classes.dex */
public interface zzads {
    public static final a zza = new a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Context zza();

    Uri.Builder zza(Intent intent, String str, String str2);

    String zza(String str);

    HttpURLConnection zza(URL url);

    void zza(Uri uri, String str, InterfaceC1956b interfaceC1956b);

    void zza(String str, Status status);
}
