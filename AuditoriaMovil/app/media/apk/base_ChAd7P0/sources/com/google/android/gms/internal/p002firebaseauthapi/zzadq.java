package com.google.android.gms.internal.p002firebaseauthapi;

import U3.h;
import Z2.a;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.auth.FirebaseAuth;
import h3.AbstractC1079a;
import io.flutter.plugins.pathprovider.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadq  reason: invalid package */
/* loaded from: classes.dex */
public final class zzadq extends AsyncTask<Void, Void, zzadt> {
    private static final a zza = new a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzads> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final h zzg;

    public zzadq(String str, String str2, Intent intent, h hVar, zzads zzadsVar) {
        I.e(str);
        this.zzb = str;
        I.i(hVar);
        this.zzg = hVar;
        I.e(str2);
        I.i(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        I.e(stringExtra);
        Uri.Builder buildUpon = Uri.parse(zzadsVar.zza(stringExtra)).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendPath("getProjectConfig").appendQueryParameter(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, stringExtra).appendQueryParameter("androidPackageName", str);
        I.i(str2);
        appendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.zzc = buildUpon.build().toString();
        this.zzd = new WeakReference<>(zzadsVar);
        this.zze = zzadsVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final zzadt doInBackground(Void... voidArr) {
        try {
            URL url = new URL(this.zzc);
            zzads zzadsVar = this.zzd.get();
            HttpURLConnection zza2 = zzadsVar.zza(url);
            zza2.addRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");
            zza2.setConnectTimeout(60000);
            new zzaef(zzadsVar.zza(), this.zzg, zzaed.zza().zzb()).zza(zza2);
            int responseCode = zza2.getResponseCode();
            if (responseCode != 200) {
                String zza3 = zza(zza2);
                a aVar = zza;
                aVar.c("Error getting project config. Failed with " + zza3 + StringUtils.SPACE + responseCode, new Object[0]);
                return zzadt.zzb(zza3);
            }
            zzagr zzagrVar = new zzagr();
            zzagrVar.zza(new String(zza(zza2.getInputStream(), RecognitionOptions.ITF)));
            if (!TextUtils.isEmpty(this.zzf)) {
                if (!zzagrVar.zza().contains(this.zzf)) {
                    return zzadt.zzb("UNAUTHORIZED_DOMAIN");
                }
                return zzadt.zza(this.zzf);
            }
            for (String str : zzagrVar.zza()) {
                if (zza(str)) {
                    return zzadt.zza(str);
                }
            }
            return null;
        } catch (zzabr e7) {
            zza.c(b.h("ConversionException encountered: ", e7.getMessage()), new Object[0]);
            return null;
        } catch (IOException e8) {
            zza.c(b.h("IOException occurred: ", e8.getMessage()), new Object[0]);
            return null;
        } catch (NullPointerException e9) {
            zza.c(b.h("Null pointer encountered: ", e9.getMessage()), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(zzadt zzadtVar) {
        onPostExecute((zzadt) null);
    }

    private static String zza(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() >= 400) {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream == null) {
                    return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
                }
                return (String) zzady.zza(new String(zza(errorStream, RecognitionOptions.ITF)), String.class);
            }
            return null;
        } catch (IOException e7) {
            zza.f("Error parsing error message from response body in getErrorMessageFromBody. ".concat(String.valueOf(e7)), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final void onPostExecute(zzadt zzadtVar) {
        String str;
        String str2;
        Uri.Builder builder;
        zzads zzadsVar = this.zzd.get();
        if (zzadtVar != null) {
            str = zzadtVar.zza();
            str2 = zzadtVar.zzb();
        } else {
            str = null;
            str2 = null;
        }
        if (zzadsVar == null) {
            zza.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(str) && (builder = this.zze) != null) {
            builder.authority(str);
            zzadsVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).f9722v);
        } else {
            zzadsVar.zza(this.zzb, AbstractC1079a.y(str2));
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host != null) {
                if (host.endsWith("firebaseapp.com")) {
                    return true;
                }
                if (host.endsWith("web.app")) {
                    return true;
                }
            }
        } catch (URISyntaxException e7) {
            zza.c(b.i("Error parsing URL for auth domain check: ", str, ". ", e7.getMessage()), new Object[0]);
        }
        return false;
    }

    private static byte[] zza(InputStream inputStream, int i7) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[RecognitionOptions.ITF];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            byteArrayOutputStream.close();
            throw th;
        }
    }
}
