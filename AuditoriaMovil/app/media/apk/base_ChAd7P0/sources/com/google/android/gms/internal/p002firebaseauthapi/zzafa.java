package com.google.android.gms.internal.p002firebaseauthapi;

import U3.h;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafa  reason: invalid package */
/* loaded from: classes.dex */
public final class zzafa {
    private final FirebaseAuth zza;
    private final Activity zzb;

    public zzafa(FirebaseAuth firebaseAuth, Activity activity) {
        this.zza = firebaseAuth;
        this.zzb = activity;
    }

    public final void zza() {
        Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent.setClass(this.zzb, RecaptchaActivity.class);
        intent.setPackage(this.zzb.getPackageName());
        h hVar = this.zza.f9703a;
        hVar.a();
        intent.putExtra("com.google.firebase.auth.KEY_API_KEY", hVar.f5751c.f5757a);
        if (!TextUtils.isEmpty(this.zza.b())) {
            intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", this.zza.b());
        }
        intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzaed.zza().zzb());
        h hVar2 = this.zza.f9703a;
        hVar2.a();
        intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", hVar2.f5750b);
        intent.putExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", this.zza.f9702B);
        this.zzb.startActivity(intent);
    }
}
