package V2;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p001authapi.zbb;
import e0.C0927b;
import h3.C1080b;
/* loaded from: classes.dex */
public final class n extends zbb {

    /* renamed from: a  reason: collision with root package name */
    public final RevocationBoundService f5968a;

    public n(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.f5968a = revocationBoundService;
    }

    public final void b() {
        AppOpsManager appOpsManager;
        int callingUid = Binder.getCallingUid();
        RevocationBoundService revocationBoundService = this.f5968a;
        C0927b a7 = C1080b.a(revocationBoundService);
        a7.getClass();
        try {
            appOpsManager = (AppOpsManager) ((Context) a7.f10587a).getSystemService("appops");
        } catch (SecurityException unused) {
        }
        if (appOpsManager != null) {
            appOpsManager.checkPackage(callingUid, "com.google.android.gms");
            try {
                PackageInfo packageInfo = revocationBoundService.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                W2.j b5 = W2.j.b(revocationBoundService);
                b5.getClass();
                if (packageInfo != null) {
                    if (!W2.j.d(packageInfo, false)) {
                        if (W2.j.d(packageInfo, true)) {
                            Context context = b5.f6181a;
                            try {
                                if (!W2.i.f6177c) {
                                    try {
                                        PackageInfo packageInfo2 = ((Context) C1080b.a(context).f10587a).getPackageManager().getPackageInfo("com.google.android.gms", 64);
                                        W2.j.b(context);
                                        if (packageInfo2 != null && !W2.j.d(packageInfo2, false) && W2.j.d(packageInfo2, true)) {
                                            W2.i.f6176b = true;
                                        } else {
                                            W2.i.f6176b = false;
                                        }
                                        W2.i.f6177c = true;
                                    } catch (PackageManager.NameNotFoundException e7) {
                                        Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e7);
                                        W2.i.f6177c = true;
                                    }
                                }
                                if (!W2.i.f6176b && "user".equals(Build.TYPE)) {
                                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                } else {
                                    return;
                                }
                            } catch (Throwable th) {
                                W2.i.f6177c = true;
                                throw th;
                            }
                        }
                    } else {
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
            throw new SecurityException(io.flutter.plugins.pathprovider.b.f("Calling UID ", Binder.getCallingUid(), " is not Google Play services."));
        }
        throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, com.google.android.gms.common.api.internal.a] */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.google.android.gms.common.api.l, U2.a] */
    @Override // com.google.android.gms.internal.p001authapi.zbb
    public final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i8) {
        GoogleSignInOptions googleSignInOptions;
        RevocationBoundService revocationBoundService = this.f5968a;
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
            b();
            k.F(revocationBoundService).G();
        } else {
            b();
            b a7 = b.a(revocationBoundService);
            GoogleSignInAccount b5 = a7.b();
            GoogleSignInOptions googleSignInOptions2 = GoogleSignInOptions.f9117f0;
            if (b5 != null) {
                googleSignInOptions = a7.c();
            } else {
                googleSignInOptions = googleSignInOptions2;
            }
            I.i(googleSignInOptions);
            ?? lVar = new com.google.android.gms.common.api.l(revocationBoundService, null, P2.a.f4009a, googleSignInOptions, new com.google.android.gms.common.api.k(new Object(), Looper.getMainLooper()));
            if (b5 != null) {
                lVar.d();
            } else {
                lVar.signOut();
            }
        }
        return true;
    }
}
