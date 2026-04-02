package com.google.firebase.auth.internal;

import F0.c;
import U3.h;
import X3.d;
import Z3.b;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import b4.C0587A;
import b4.C0613v;
import b4.C0614w;
import b4.H;
import b4.O;
import b4.P;
import b4.Q;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzadq;
import com.google.android.gms.internal.p002firebaseauthapi.zzads;
import com.google.android.gms.internal.p002firebaseauthapi.zzadv;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import f3.AbstractC0989b;
import h3.AbstractC1079a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.apache.tika.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import w4.InterfaceC1956b;
import z0.AbstractActivityC2064y;
@KeepName
/* loaded from: classes.dex */
public class GenericIdpActivity extends AbstractActivityC2064y implements zzads {

    /* renamed from: t0  reason: collision with root package name */
    public static long f9727t0;

    /* renamed from: u0  reason: collision with root package name */
    public static final H f9728u0 = H.f8195c;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f9729s0 = false;

    public final Uri.Builder l(Uri.Builder builder, Intent intent, String str, String str2) {
        String str3;
        String jSONObject;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
            str3 = TextUtils.join(",", stringArrayListExtra);
        } else {
            str3 = null;
        }
        Bundle bundleExtra = intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            jSONObject = null;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (String str4 : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str4);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject2.put(str4, string);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            jSONObject = jSONObject2.toString();
        }
        String uuid = UUID.randomUUID().toString();
        String zza = zzadv.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        O o7 = O.f8211a;
        Context applicationContext = getApplicationContext();
        String str5 = jSONObject;
        String str6 = str3;
        synchronized (o7) {
            I.e(str);
            I.e(uuid);
            I.e(zza);
            I.e(stringExtra4);
            SharedPreferences a7 = O.a(applicationContext, str);
            O.b(a7);
            SharedPreferences.Editor edit = a7.edit();
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".SESSION_ID", zza);
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".OPERATION", action);
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".PROVIDER_ID", stringExtra2);
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".FIREBASE_APP_NAME", stringExtra4);
            edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
            edit.apply();
        }
        String b5 = P.a(getApplicationContext(), h.e(stringExtra4).f()).b();
        if (TextUtils.isEmpty(b5)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            m(AbstractC1079a.y("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        } else if (zza == null) {
            return null;
        } else {
            Uri.Builder appendQueryParameter = builder.appendQueryParameter("eid", "p");
            appendQueryParameter.appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", zza).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", b5);
            if (!TextUtils.isEmpty(str6)) {
                builder.appendQueryParameter("scopes", str6);
            }
            if (!TextUtils.isEmpty(str5)) {
                builder.appendQueryParameter("customParameters", str5);
            }
            if (!TextUtils.isEmpty(stringExtra3)) {
                builder.appendQueryParameter("tid", stringExtra3);
            }
            return builder;
        }
    }

    public final void m(Status status) {
        f9727t0 = 0L;
        this.f9729s0 = false;
        Intent intent = new Intent();
        HashMap hashMap = b4.I.f8198a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!c.a(this).b(intent)) {
            C0587A.a(getApplicationContext(), status);
        } else {
            f9728u0.a(this);
        }
        finish();
    }

    public final void n() {
        f9727t0 = 0L;
        this.f9729s0 = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!c.a(this).b(intent)) {
            C0587A.a(this, AbstractC1079a.y("WEB_CONTEXT_CANCELED"));
        } else {
            f9728u0.a(this);
        }
        finish();
    }

    @Override // z0.AbstractActivityC2064y, e.n, W.AbstractActivityC0362e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
            n();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f9727t0 < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f9727t0 = currentTimeMillis;
        if (bundle != null) {
            this.f9729s0 = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // e.n, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // z0.AbstractActivityC2064y, android.app.Activity
    public final void onResume() {
        String str;
        Q q2;
        super.onResume();
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                m(b4.I.a(intent.getStringExtra("firebaseError")));
            } else if (intent.hasExtra("link") && intent.hasExtra("eventId")) {
                String stringExtra = intent.getStringExtra("link");
                String stringExtra2 = intent.getStringExtra("eventId");
                String packageName = getPackageName();
                boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
                synchronized (O.f8211a) {
                    I.e(packageName);
                    I.e(stringExtra2);
                    SharedPreferences a7 = O.a(this, packageName);
                    String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".SESSION_ID";
                    String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
                    String str4 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".PROVIDER_ID";
                    String str5 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
                    str = null;
                    String string = a7.getString(str2, null);
                    String string2 = a7.getString(str3, null);
                    String string3 = a7.getString(str4, null);
                    String string4 = a7.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
                    String string5 = a7.getString(str5, null);
                    SharedPreferences.Editor edit = a7.edit();
                    edit.remove(str2);
                    edit.remove(str3);
                    edit.remove(str4);
                    edit.remove(str5);
                    edit.apply();
                    if (string != null && string2 != null && string3 != null) {
                        q2 = new Q(string, string2, string3, string4, string5);
                    } else {
                        q2 = null;
                    }
                }
                if (q2 == null) {
                    n();
                }
                if (booleanExtra) {
                    stringExtra = P.a(getApplicationContext(), h.e(q2.f8219e).f()).c(stringExtra);
                }
                zzaic zzaicVar = new zzaic(q2, stringExtra);
                String str6 = q2.f8218d;
                String str7 = q2.f8216b;
                zzaicVar.zzb(str6);
                if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str7) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str7) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str7)) {
                    Log.e("GenericIdpActivity", "unsupported operation: ".concat(str7));
                    n();
                    return;
                }
                f9727t0 = 0L;
                this.f9729s0 = false;
                Intent intent2 = new Intent();
                Parcel obtain = Parcel.obtain();
                zzaicVar.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", marshall);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str7);
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!c.a(this).b(intent2)) {
                    SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    Parcel obtain2 = Parcel.obtain();
                    zzaicVar.writeToParcel(obtain2, 0);
                    byte[] marshall2 = obtain2.marshall();
                    obtain2.recycle();
                    if (marshall2 != null) {
                        str = Base64.encodeToString(marshall2, 10);
                    }
                    edit2.putString("verifyAssertionRequest", str);
                    edit2.putString("operation", str7);
                    edit2.putString("tenantId", str6);
                    edit2.putLong("timestamp", System.currentTimeMillis());
                    edit2.commit();
                } else {
                    f9728u0.a(this);
                }
                finish();
            } else {
                n();
            }
        } else if (!this.f9729s0) {
            String packageName2 = getPackageName();
            try {
                String lowerCase = AbstractC0989b.a(AbstractC0989b.c(this, packageName2)).toLowerCase(Locale.US);
                h e7 = h.e(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(e7);
                if (!zzafm.zza(e7)) {
                    new zzadq(packageName2, lowerCase, getIntent(), e7, this).executeOnExecutor(firebaseAuth.f9725y, new Void[0]);
                } else {
                    e7.a();
                    zza(l(Uri.parse(zzafm.zza(e7.f5751c.f5757a)).buildUpon(), getIntent(), packageName2, lowerCase).build(), packageName2, firebaseAuth.f9722v);
                }
            } catch (PackageManager.NameNotFoundException e8) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName2 + StringUtils.SPACE + String.valueOf(e8));
                zzadv.zzb(this, packageName2);
            }
            this.f9729s0 = true;
        } else {
            n();
        }
    }

    @Override // e.n, W.AbstractActivityC0362e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f9729s0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzads
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return l(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzads
    public final String zza(String str) {
        return zzafm.zzb(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzads
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzads
    public final void zza(String str, Status status) {
        if (status == null) {
            n();
        } else {
            m(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzads
    public final void zza(Uri uri, String str, InterfaceC1956b interfaceC1956b) {
        Task forResult;
        b bVar = (b) interfaceC1956b.get();
        if (bVar != null) {
            Task b5 = ((d) bVar).b(false);
            C0613v c0613v = new C0613v(0);
            c0613v.f8300b = uri;
            forResult = b5.continueWith(c0613v);
        } else {
            forResult = Tasks.forResult(uri);
        }
        C0614w c0614w = new C0614w(0);
        c0614w.f8303c = this;
        c0614w.f8302b = str;
        forResult.addOnCompleteListener(c0614w);
    }
}
