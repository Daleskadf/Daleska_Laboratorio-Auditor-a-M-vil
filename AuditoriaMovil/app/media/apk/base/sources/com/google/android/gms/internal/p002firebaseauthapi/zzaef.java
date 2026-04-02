package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import U3.h;
import U3.i;
import X3.d;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.pathprovider.b;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import v4.c;
import v4.e;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaef  reason: invalid package */
/* loaded from: classes.dex */
public final class zzaef {
    private Context zza;
    private zzaey zzb;
    private String zzc;
    private final h zzd;
    private boolean zze;
    private String zzf;

    public zzaef(Context context, h hVar, String str) {
        this.zze = false;
        I.i(context);
        this.zza = context;
        I.i(hVar);
        this.zzd = hVar;
        this.zzc = b.h("Android/Fallback/", str);
    }

    private static String zza(h hVar) {
        Z3.b bVar = (Z3.b) FirebaseAuth.getInstance(hVar).f9722v.get();
        if (bVar == null) {
            return null;
        }
        try {
            X3.b bVar2 = (X3.b) Tasks.await(((d) bVar).b(false));
            i iVar = bVar2.f6377b;
            if (iVar != null) {
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(iVar)));
            }
            return bVar2.f6376a;
        } catch (InterruptedException e7) {
            e = e7;
            String message = e.getMessage();
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + message);
            return null;
        } catch (ExecutionException e8) {
            e = e8;
            String message2 = e.getMessage();
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + message2);
            return null;
        }
    }

    private static String zzb(h hVar) {
        e eVar = (e) FirebaseAuth.getInstance(hVar).f9723w.get();
        if (eVar != null) {
            try {
                return (String) Tasks.await(((c) eVar).a());
            } catch (InterruptedException | ExecutionException e7) {
                String message = e7.getMessage();
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + message);
            }
        }
        return null;
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    public final void zza(URLConnection uRLConnection) {
        String z7;
        if (this.zze) {
            z7 = AbstractC0059i.z(this.zzc, "/FirebaseUI-Android");
        } else {
            z7 = AbstractC0059i.z(this.zzc, "/FirebaseCore-Android");
        }
        if (this.zzb == null) {
            this.zzb = new zzaey(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzaee.zza());
        uRLConnection.setRequestProperty("X-Client-Version", z7);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        h hVar = this.zzd;
        hVar.a();
        uRLConnection.setRequestProperty("X-Firebase-GMPID", hVar.f5751c.f5758b);
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String zza = zza(this.zzd);
        if (!TextUtils.isEmpty(zza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", zza);
        }
        this.zzf = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzaef(h hVar, String str) {
        this(hVar.f5749a, hVar, str);
        hVar.a();
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}
