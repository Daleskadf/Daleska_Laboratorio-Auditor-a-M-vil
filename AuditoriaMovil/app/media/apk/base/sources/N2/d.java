package N2;

import D.AbstractC0059i;
import M0.x;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.AbstractC0764m;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.P;
import com.google.android.gms.common.internal.T;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzby;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zzg;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzht;
import com.google.android.gms.internal.auth.zzhw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f3392a = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: b  reason: collision with root package name */
    public static final ComponentName f3393b = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* renamed from: c  reason: collision with root package name */
    public static final Z2.a f3394c = new Z2.a("Auth", "GoogleAuthUtil");

    public static void a(Context context, String str) {
        I.h("Calling this from your main thread can lead to deadlock");
        f(context);
        Bundle bundle = new Bundle();
        g(context, bundle);
        zzdc.zzd(context);
        if (zzhw.zze() && i(context)) {
            zzg zza = zzh.zza(context);
            zzbw zzbwVar = new zzbw();
            zzbwVar.zza(str);
            try {
                e(zza.zza(zzbwVar), "clear token");
                return;
            } catch (j e7) {
                f3394c.f("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", "clear token", Log.getStackTraceString(e7));
            }
        }
        d(context, f3393b, new x(str, bundle, 3, false));
    }

    public static String b(Context context, Account account, String str) {
        TokenData tokenData;
        Bundle bundle;
        Z2.a aVar = f3394c;
        Bundle bundle2 = new Bundle();
        h(account);
        I.h("Calling this from your main thread can lead to deadlock");
        I.f(str, "Scope cannot be empty or null.");
        h(account);
        f(context);
        Bundle bundle3 = new Bundle(bundle2);
        g(context, bundle3);
        zzdc.zzd(context);
        if (zzhw.zze() && i(context)) {
            try {
                bundle = (Bundle) e(zzh.zza(context).zzc(account, str, bundle3), "token retrieval");
            } catch (j e7) {
                aVar.f("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", "token retrieval", Log.getStackTraceString(e7));
            }
            if (bundle != null) {
                tokenData = c(context, bundle);
                return tokenData.f9087b;
            }
            aVar.f("Service call returned null.", new Object[0]);
            throw new IOException("Service unavailable.");
        }
        tokenData = (TokenData) d(context, f3393b, new E.e(account, str, bundle3, context, 7));
        return tokenData.f9087b;
    }

    public static TokenData c(Context context, Bundle bundle) {
        TokenData tokenData;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent");
        zzby zza = zzby.zza(string);
        Z2.a aVar = f3394c;
        aVar.f("[GoogleAuthUtil] error status:" + zza + " with method:getTokenWithDetails", new Object[0]);
        if (!zzby.BAD_AUTHENTICATION.equals(zza) && !zzby.CAPTCHA.equals(zza) && !zzby.NEED_PERMISSION.equals(zza) && !zzby.NEED_REMOTE_CONSENT.equals(zza) && !zzby.NEEDS_BROWSER.equals(zza) && !zzby.USER_CANCEL.equals(zza) && !zzby.DEVICE_MANAGEMENT_REQUIRED.equals(zza) && !zzby.DM_INTERNAL_ERROR.equals(zza) && !zzby.DM_SYNC_DISABLED.equals(zza) && !zzby.DM_ADMIN_BLOCKED.equals(zza) && !zzby.DM_ADMIN_PENDING_APPROVAL.equals(zza) && !zzby.DM_STALE_SYNC_REQUIRED.equals(zza) && !zzby.DM_DEACTIVATED.equals(zza) && !zzby.DM_REQUIRED.equals(zza) && !zzby.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(zza) && !zzby.DM_SCREENLOCK_REQUIRED.equals(zza)) {
            if (!zzby.NETWORK_ERROR.equals(zza) && !zzby.SERVICE_UNAVAILABLE.equals(zza) && !zzby.INTNERNAL_ERROR.equals(zza) && !zzby.AUTH_SECURITY_ERROR.equals(zza) && !zzby.ACCOUNT_NOT_PRESENT.equals(zza)) {
                throw new Exception(string);
            }
            throw new IOException(string);
        }
        zzdc.zzd(context);
        if (zzht.zzc()) {
            if (pendingIntent != null && intent != null) {
                throw new UserRecoverableAuthException(string, intent, i.zzb);
            }
            Object obj = W2.e.f6169c;
            if (W2.f.a(context) >= Integer.MAX_VALUE && pendingIntent == null) {
                aVar.c("Recovery PendingIntent is missing on current Gms version: 2147483647 for method: getTokenWithDetails. It should always be present on or above Gms version 2147483647. This indicates a bug in Gms implementation.", new Object[0]);
            }
            if (intent == null) {
                aVar.c(AbstractC0059i.M("no recovery Intent found with status=", string, " for method=getTokenWithDetails. This shouldn't happen"), new Object[0]);
            }
            throw new UserRecoverableAuthException(string, intent);
        }
        throw new UserRecoverableAuthException(string, intent);
    }

    public static Object d(Context context, ComponentName componentName, h hVar) {
        W2.a aVar = new W2.a();
        T a7 = AbstractC0764m.a(context);
        try {
            a7.getClass();
            try {
                if (a7.d(new P(componentName), aVar, "GoogleAuthUtil", null)) {
                    try {
                        return hVar.i(aVar.a());
                    } catch (RemoteException | InterruptedException | TimeoutException e7) {
                        Log.i("GoogleAuthUtil", "Error on service connection.", e7);
                        throw new IOException("Error on service connection.", e7);
                    }
                }
                throw new IOException("Could not bind to service.");
            } finally {
                a7.c(new P(componentName), aVar);
            }
        } catch (SecurityException e8) {
            String message = e8.getMessage();
            Log.w("GoogleAuthUtil", "SecurityException while bind to auth service: " + message);
            throw new IOException("SecurityException while binding to Auth service.", e8);
        }
    }

    public static Object e(Task task, String str) {
        Z2.a aVar = f3394c;
        try {
            return Tasks.await(task);
        } catch (InterruptedException e7) {
            String M7 = AbstractC0059i.M("Interrupted while waiting for the task of ", str, " to finish.");
            aVar.f(M7, new Object[0]);
            throw new IOException(M7, e7);
        } catch (CancellationException e8) {
            String M8 = AbstractC0059i.M("Canceled while waiting for the task of ", str, " to finish.");
            aVar.f(M8, new Object[0]);
            throw new IOException(M8, e8);
        } catch (ExecutionException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof j) {
                throw ((j) cause);
            }
            String M9 = AbstractC0059i.M("Unable to get a result for ", str, " due to ExecutionException.");
            aVar.f(M9, new Object[0]);
            throw new IOException(M9, e9);
        }
    }

    public static void f(Context context) {
        try {
            W2.i.a(context.getApplicationContext(), 8400000);
        } catch (W2.g e7) {
            e = e7;
            throw new Exception(e.getMessage(), e);
        } catch (W2.h e8) {
            throw new UserRecoverableAuthException(e8.getMessage(), new Intent(e8.f6174a));
        } catch (GooglePlayServicesIncorrectManifestValueException e9) {
            e = e9;
            throw new Exception(e.getMessage(), e);
        }
    }

    public static void g(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        if (TextUtils.isEmpty(bundle.getString("androidPackageName"))) {
            bundle.putString("androidPackageName", str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    public static void h(Account account) {
        if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = f3392a;
            for (int i7 = 0; i7 < 3; i7++) {
                if (strArr[i7].equals(account.type)) {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        }
        throw new IllegalArgumentException("Account name cannot be empty!");
    }

    public static boolean i(Context context) {
        if (W2.e.f6170d.d(context, 17895000) != 0) {
            return false;
        }
        List<String> zzq = zzhw.zzb().zzq();
        String str = context.getApplicationInfo().packageName;
        for (String str2 : zzq) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
