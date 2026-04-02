package com.google.android.gms.auth.api.signin.internal;

import B0.a;
import D0.b;
import D0.c;
import S.l;
import V2.d;
import V2.k;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.lifecycle.X;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import java.lang.reflect.Modifier;
import java.util.Set;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import t2.i;
import z0.AbstractActivityC2064y;
@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends AbstractActivityC2064y {

    /* renamed from: x0  reason: collision with root package name */
    public static boolean f9138x0 = false;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f9139s0 = false;

    /* renamed from: t0  reason: collision with root package name */
    public SignInConfiguration f9140t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f9141u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f9142v0;

    /* renamed from: w0  reason: collision with root package name */
    public Intent f9143w0;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void l() {
        X store = g();
        i iVar = c.f827d;
        j.e(store, "store");
        a defaultCreationExtras = a.f228b;
        j.e(defaultCreationExtras, "defaultCreationExtras");
        k kVar = new k(store, iVar, defaultCreationExtras);
        e a7 = s.a(c.class);
        String b5 = a7.b();
        if (b5 != null) {
            c cVar = (c) kVar.v(a7, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b5));
            A.c cVar2 = new A.c(this, 17);
            if (!cVar.f829c) {
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    l lVar = cVar.f828b;
                    D0.a aVar = (D0.a) lVar.c(0);
                    if (aVar == null) {
                        try {
                            cVar.f829c = true;
                            Set set = o.f9286a;
                            synchronized (set) {
                            }
                            d dVar = new d(this, set);
                            if (d.class.isMemberClass() && !Modifier.isStatic(d.class.getModifiers())) {
                                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + dVar);
                            }
                            D0.a aVar2 = new D0.a(dVar);
                            lVar.d(0, aVar2);
                            cVar.f829c = false;
                            b bVar = new b(aVar2.f822l, cVar2);
                            aVar2.e(this, bVar);
                            b bVar2 = aVar2.f824n;
                            if (bVar2 != null) {
                                aVar2.j(bVar2);
                            }
                            aVar2.f823m = this;
                            aVar2.f824n = bVar;
                        } catch (Throwable th) {
                            cVar.f829c = false;
                            throw th;
                        }
                    } else {
                        b bVar3 = new b(aVar.f822l, cVar2);
                        aVar.e(this, bVar3);
                        b bVar4 = aVar.f824n;
                        if (bVar4 != null) {
                            aVar.j(bVar4);
                        }
                        aVar.f823m = this;
                        aVar.f824n = bVar3;
                    }
                    f9138x0 = false;
                    return;
                }
                throw new IllegalStateException("initLoader must be called on the main thread");
            }
            throw new IllegalStateException("Called while creating a loader");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final void m(int i7) {
        Status status = new Status(i7, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f9138x0 = false;
    }

    @Override // z0.AbstractActivityC2064y, e.n, android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (!this.f9139s0) {
            setResult(0);
            if (i7 != 40962) {
                return;
            }
            if (intent != null) {
                SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                if (signInAccount != null && (googleSignInAccount = signInAccount.f9134b) != null) {
                    k F7 = k.F(this);
                    GoogleSignInOptions googleSignInOptions = this.f9140t0.f9137b;
                    synchronized (F7) {
                        ((V2.b) F7.f5965b).d(googleSignInAccount, googleSignInOptions);
                        F7.f5966c = googleSignInAccount;
                        F7.f5967d = googleSignInOptions;
                    }
                    intent.removeExtra("signInAccount");
                    intent.putExtra("googleSignInAccount", googleSignInAccount);
                    this.f9141u0 = true;
                    this.f9142v0 = i8;
                    this.f9143w0 = intent;
                    l();
                    return;
                } else if (intent.hasExtra("errorCode")) {
                    int intExtra = intent.getIntExtra("errorCode", 8);
                    if (intExtra == 13) {
                        intExtra = 12501;
                    }
                    m(intExtra);
                    return;
                }
            }
            m(8);
        }
    }

    @Override // z0.AbstractActivityC2064y, e.n, W.AbstractActivityC0362e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m(12500);
        } else if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
        } else {
            Bundle bundleExtra = intent.getBundleExtra("config");
            bundleExtra.getClass();
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.f9140t0 = signInConfiguration;
            if (bundle == null) {
                if (f9138x0) {
                    setResult(0);
                    m(12502);
                    return;
                }
                f9138x0 = true;
                Intent intent2 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra("config", this.f9140t0);
                try {
                    startActivityForResult(intent2, 40962);
                    return;
                } catch (ActivityNotFoundException unused) {
                    this.f9139s0 = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    m(17);
                    return;
                }
            }
            boolean z7 = bundle.getBoolean("signingInGoogleApiClients");
            this.f9141u0 = z7;
            if (z7) {
                this.f9142v0 = bundle.getInt("signInResultCode");
                Intent intent3 = (Intent) bundle.getParcelable("signInResultData");
                intent3.getClass();
                this.f9143w0 = intent3;
                l();
            }
        }
    }

    @Override // z0.AbstractActivityC2064y, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f9138x0 = false;
    }

    @Override // e.n, W.AbstractActivityC0362e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f9141u0);
        if (this.f9141u0) {
            bundle.putInt("signInResultCode", this.f9142v0);
            bundle.putParcelable("signInResultData", this.f9143w0);
        }
    }
}
