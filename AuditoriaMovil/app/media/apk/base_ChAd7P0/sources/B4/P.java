package b4;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzbg;
import com.google.android.gms.internal.p002firebaseauthapi.zzbj;
import com.google.android.gms.internal.p002firebaseauthapi.zzbz;
import com.google.android.gms.internal.p002firebaseauthapi.zzke;
import com.google.android.gms.internal.p002firebaseauthapi.zzkh;
import com.google.android.gms.internal.p002firebaseauthapi.zzkq;
import com.google.android.gms.internal.p002firebaseauthapi.zzmi;
import com.google.android.gms.internal.p002firebaseauthapi.zzp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class P {

    /* renamed from: c  reason: collision with root package name */
    public static P f8212c;

    /* renamed from: a  reason: collision with root package name */
    public final String f8213a;

    /* renamed from: b  reason: collision with root package name */
    public final zzmi f8214b;

    public P(Context context, String str) {
        zzmi zzmiVar;
        this.f8213a = str;
        try {
            zzke.zza();
            zzmi.zza zzaVar = new zzmi.zza();
            zzmi.zza zza = zzaVar.zza(context, "GenericIdpKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzkq.zza);
            zza.zza("android-keystore://firebear_master_key_id." + str);
            zzmiVar = zza.zza();
        } catch (IOException | GeneralSecurityException e7) {
            String message = e7.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + message);
            zzmiVar = null;
        }
        this.f8214b = zzmiVar;
    }

    public static P a(Context context, String str) {
        P p7 = f8212c;
        if (p7 == null || !zzp.zza(p7.f8213a, str)) {
            f8212c = new P(context, str);
        }
        return f8212c;
    }

    public final String b() {
        if (this.f8214b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzbz zza = zzbg.zza(byteArrayOutputStream);
        try {
            synchronized (this.f8214b) {
                this.f8214b.zza().zza().zza(zza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e7) {
            String message = e7.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + message);
            return null;
        }
    }

    public final String c(String str) {
        String str2;
        zzmi zzmiVar = this.f8214b;
        if (zzmiVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmiVar) {
                str2 = new String(((zzbj) this.f8214b.zza().zza(zzkh.zza(), zzbj.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e7) {
            String message = e7.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + message);
            return null;
        }
    }
}
