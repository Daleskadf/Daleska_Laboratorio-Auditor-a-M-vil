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
import android.util.Log;
import b4.C0613v;
import b4.C0614w;
import b4.H;
import b4.O;
import b4.P;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzadq;
import com.google.android.gms.internal.p002firebaseauthapi.zzads;
import com.google.android.gms.internal.p002firebaseauthapi.zzadv;
import com.google.android.gms.internal.p002firebaseauthapi.zzaee;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import f3.AbstractC0989b;
import h3.AbstractC1079a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.apache.tika.utils.StringUtils;
import w4.InterfaceC1956b;
import z0.AbstractActivityC2064y;
/* loaded from: classes.dex */
public class RecaptchaActivity extends AbstractActivityC2064y implements zzads {

    /* renamed from: t0  reason: collision with root package name */
    public static long f9730t0;

    /* renamed from: u0  reason: collision with root package name */
    public static final H f9731u0 = H.f8195c;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f9732s0 = false;

    public final Uri.Builder l(Uri.Builder builder, Intent intent, String str, String str2) {
        String zza;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        h e7 = h.e(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(e7);
        O o7 = O.f8211a;
        Context applicationContext = getApplicationContext();
        synchronized (o7) {
            I.e(str);
            I.e(uuid);
            SharedPreferences a7 = O.a(applicationContext, str);
            O.b(a7);
            SharedPreferences.Editor edit = a7.edit();
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".FIREBASE_APP_NAME", stringExtra3);
            edit.apply();
        }
        String b5 = P.a(getApplicationContext(), e7.f()).b();
        if (TextUtils.isEmpty(b5)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            m(AbstractC1079a.y("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        if (!TextUtils.isEmpty(firebaseAuth.a())) {
            zza = firebaseAuth.a();
        } else {
            zza = zzaee.zza();
        }
        Uri.Builder appendQueryParameter = builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", zza).appendQueryParameter("eventId", uuid);
        appendQueryParameter.appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", b5);
        return builder;
    }

    public final void m(Status status) {
        f9730t0 = 0L;
        this.f9732s0 = false;
        Intent intent = new Intent();
        HashMap hashMap = b4.I.f8198a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        c.a(this).b(intent);
        f9731u0.a(this);
        finish();
    }

    public final void n() {
        f9730t0 = 0L;
        this.f9732s0 = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        c.a(this).b(intent);
        f9731u0.a(this);
        finish();
    }

    @Override // z0.AbstractActivityC2064y, e.n, W.AbstractActivityC0362e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("RecaptchaActivity", "Could not do operation - unknown action: " + action);
            n();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f9730t0 < 30000) {
            Log.e("RecaptchaActivity", "Could not start operation - already in progress");
            return;
        }
        f9730t0 = currentTimeMillis;
        if (bundle != null) {
            this.f9732s0 = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
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
        super.onResume();
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                m(b4.I.a(intent.getStringExtra("firebaseError")));
            } else if (intent.hasExtra("link") && intent.hasExtra("eventId")) {
                String stringExtra = intent.getStringExtra("link");
                O o7 = O.f8211a;
                Context applicationContext = getApplicationContext();
                String packageName = getPackageName();
                String stringExtra2 = intent.getStringExtra("eventId");
                synchronized (o7) {
                    I.e(packageName);
                    I.e(stringExtra2);
                    SharedPreferences a7 = O.a(applicationContext, packageName);
                    String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
                    str = null;
                    String string = a7.getString(str2, null);
                    String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
                    String string2 = a7.getString(str3, null);
                    SharedPreferences.Editor edit = a7.edit();
                    edit.remove(str2);
                    edit.remove(str3);
                    edit.apply();
                    if (!TextUtils.isEmpty(string)) {
                        str = string2;
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
                    m(AbstractC1079a.y("Failed to find registration for this reCAPTCHA event"));
                }
                if (intent.getBooleanExtra("encryptionEnabled", true)) {
                    stringExtra = P.a(getApplicationContext(), h.e(str).f()).c(stringExtra);
                }
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
                f9730t0 = 0L;
                this.f9732s0 = false;
                Intent intent2 = new Intent();
                intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!c.a(this).b(intent2)) {
                    SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    edit2.putString("recaptchaToken", queryParameter);
                    edit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                    edit2.putLong("timestamp", System.currentTimeMillis());
                    edit2.commit();
                } else {
                    f9731u0.a(this);
                }
                finish();
            } else {
                n();
            }
        } else if (!this.f9732s0) {
            Intent intent3 = getIntent();
            String packageName2 = getPackageName();
            try {
                String lowerCase = AbstractC0989b.a(AbstractC0989b.c(this, packageName2)).toLowerCase(Locale.US);
                h e7 = h.e(intent3.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(e7);
                if (!zzafm.zza(e7)) {
                    new zzadq(packageName2, lowerCase, intent3, e7, this).executeOnExecutor(firebaseAuth.f9725y, new Void[0]);
                } else {
                    e7.a();
                    zza(l(Uri.parse(zzafm.zza(e7.f5751c.f5757a)).buildUpon(), getIntent(), packageName2, lowerCase).build(), packageName2, firebaseAuth.f9722v);
                }
            } catch (PackageManager.NameNotFoundException e8) {
                Log.e("RecaptchaActivity", "Could not get package signature: " + packageName2 + StringUtils.SPACE + String.valueOf(e8));
                zzadv.zzb(this, packageName2);
            }
            this.f9732s0 = true;
        } else {
            n();
        }
    }

    @Override // e.n, W.AbstractActivityC0362e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f9732s0);
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
            zzads.zza.c("Error generating connection", new Object[0]);
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
            C0613v c0613v = new C0613v(1);
            c0613v.f8300b = uri;
            forResult = b5.continueWith(c0613v);
        } else {
            forResult = Tasks.forResult(uri);
        }
        C0614w c0614w = new C0614w(1);
        c0614w.f8303c = this;
        c0614w.f8302b = str;
        forResult.addOnCompleteListener(c0614w);
    }
}
