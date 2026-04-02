package U2;

import V2.h;
import V2.j;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.C0750y;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.z;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j3.C1367d;
/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: a  reason: collision with root package name */
    public static final f f5717a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static int f5718b = 1;

    public final Intent c() {
        Context applicationContext = getApplicationContext();
        int e7 = e();
        int i7 = e7 - 1;
        if (e7 != 0) {
            if (i7 != 2) {
                if (i7 != 3) {
                    j.f5962a.a("getNoImplementationSignInIntent()", new Object[0]);
                    Intent a7 = j.a(applicationContext, (GoogleSignInOptions) getApiOptions());
                    a7.setAction("com.google.android.gms.auth.NO_IMPL");
                    return a7;
                }
                return j.a(applicationContext, (GoogleSignInOptions) getApiOptions());
            }
            j.f5962a.a("getFallbackSignInIntent()", new Object[0]);
            Intent a8 = j.a(applicationContext, (GoogleSignInOptions) getApiOptions());
            a8.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return a8;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.google.android.gms.common.internal.u] */
    public final Task d() {
        boolean z7;
        BasePendingResult doWrite;
        o asGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        if (e() == 3) {
            z7 = true;
        } else {
            z7 = false;
        }
        j.f5962a.a("Revoking access", new Object[0]);
        String e7 = V2.b.a(applicationContext).e("refreshToken");
        j.b(applicationContext);
        if (z7) {
            if (e7 == null) {
                Z2.a aVar = V2.c.f5945c;
                Status status = new Status(4, null, null, null);
                I.a("Status code must not be SUCCESS", !status.k());
                doWrite = new z(status);
                doWrite.setResult((BasePendingResult) status);
            } else {
                V2.c cVar = new V2.c(e7);
                new Thread(cVar).start();
                doWrite = cVar.f5947b;
            }
        } else {
            doWrite = ((com.google.android.gms.common.api.internal.I) asGoogleApiClient).f9188b.doWrite((l) new h(asGoogleApiClient, 1));
        }
        ?? obj = new Object();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        doWrite.addStatusListener(new C(doWrite, taskCompletionSource, obj));
        return taskCompletionSource.getTask();
    }

    public final synchronized int e() {
        int i7;
        try {
            i7 = f5718b;
            if (i7 == 1) {
                Context applicationContext = getApplicationContext();
                W2.e eVar = W2.e.f6170d;
                int d7 = eVar.d(applicationContext, 12451000);
                if (d7 == 0) {
                    i7 = 4;
                    f5718b = 4;
                } else if (eVar.b(d7, applicationContext, null) == null && C1367d.a(applicationContext, "com.google.android.gms.auth.api.fallback") != 0) {
                    i7 = 3;
                    f5718b = 3;
                } else {
                    i7 = 2;
                    f5718b = 2;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i7;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.google.android.gms.common.internal.u] */
    public final Task signOut() {
        boolean z7;
        BasePendingResult doWrite;
        o asGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        if (e() == 3) {
            z7 = true;
        } else {
            z7 = false;
        }
        j.f5962a.a("Signing out", new Object[0]);
        j.b(applicationContext);
        if (z7) {
            Status status = Status.f9152e;
            doWrite = new C0750y(asGoogleApiClient, 0);
            doWrite.setResult((BasePendingResult) status);
        } else {
            doWrite = ((com.google.android.gms.common.api.internal.I) asGoogleApiClient).f9188b.doWrite((l) new h(asGoogleApiClient, 0));
        }
        ?? obj = new Object();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        doWrite.addStatusListener(new C(doWrite, taskCompletionSource, obj));
        return taskCompletionSource.getTask();
    }
}
