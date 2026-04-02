package V2;

import D.AbstractC0059i;
import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final ReentrantLock f5941c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public static b f5942d;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f5943a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f5944b;

    public b(Context context) {
        this.f5944b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static b a(Context context) {
        I.i(context);
        ReentrantLock reentrantLock = f5941c;
        reentrantLock.lock();
        try {
            if (f5942d == null) {
                f5942d = new b(context.getApplicationContext());
            }
            b bVar = f5942d;
            reentrantLock.unlock();
            return bVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String g(String str, String str2) {
        return AbstractC0059i.A(str, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, str2);
    }

    public final GoogleSignInAccount b() {
        String e7;
        String e8 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e8) || (e7 = e(g("googleSignInAccount", e8))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.k(e7);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final GoogleSignInOptions c() {
        String e7;
        String e8 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e8) || (e7 = e(g("googleSignInOptions", e8))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.l(e7);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        I.i(googleSignInAccount);
        I.i(googleSignInOptions);
        String str = googleSignInAccount.f9107Z;
        f("defaultGoogleSignInAccount", str);
        String g3 = g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f9109b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f9110c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f9111d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f9112e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f9114f0;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f9115g0;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f9105X;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f9106Y);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = googleSignInAccount.f9113e0;
            Scope[] scopeArr = (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
            Arrays.sort(scopeArr, U2.d.f5729b);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f9148b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            f(g3, jSONObject.toString());
            String g4 = g("googleSignInOptions", str);
            String str9 = googleSignInOptions.f9125Y;
            String str10 = googleSignInOptions.f9124X;
            ArrayList arrayList2 = googleSignInOptions.f9128b;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList2, GoogleSignInOptions.f9123l0);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f9148b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f9129c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f9130d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f9131e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                f(g4, jSONObject2.toString());
            } catch (JSONException e7) {
                throw new RuntimeException(e7);
            }
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.f5943a;
        reentrantLock.lock();
        try {
            return this.f5944b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(String str, String str2) {
        ReentrantLock reentrantLock = this.f5943a;
        reentrantLock.lock();
        try {
            this.f5944b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
