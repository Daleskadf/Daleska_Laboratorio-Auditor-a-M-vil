package io.flutter.plugins.googlesignin;

import B5.AbstractActivityC0032e;
import L5.t;
import Q0.x;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.datastore.preferences.protobuf.Y;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import w.C1908S;
/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12316a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractActivityC0032e f12317b;

    /* renamed from: c  reason: collision with root package name */
    public U2.a f12318c;

    /* renamed from: d  reason: collision with root package name */
    public List f12319d;

    /* renamed from: e  reason: collision with root package name */
    public C1908S f12320e;

    public c(Context context, v4.d dVar) {
        this.f12316a = context;
    }

    public static boolean e(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    public final void a(String str, io.flutter.plugins.firebase.storage.g gVar, io.flutter.plugins.firebase.storage.g gVar2, io.flutter.plugins.firebase.storage.g gVar3, io.flutter.plugins.firebase.storage.g gVar4, Object obj) {
        if (this.f12320e == null) {
            this.f12320e = new C1908S(str, gVar, gVar2, gVar3, gVar4, obj);
            return;
        }
        throw new IllegalStateException("Concurrent operations detected: " + ((String) this.f12320e.f16112a) + ", " + str);
    }

    public final void b(String str, String str2) {
        C1908S c1908s = this.f12320e;
        io.flutter.plugins.firebase.storage.g gVar = (io.flutter.plugins.firebase.storage.g) c1908s.f16114c;
        if (gVar != null) {
            gVar.d(new e(str, str2));
        } else {
            io.flutter.plugins.firebase.storage.g gVar2 = (io.flutter.plugins.firebase.storage.g) c1908s.f16113b;
            if (gVar2 == null && (gVar2 = (io.flutter.plugins.firebase.storage.g) c1908s.f16115d) == null) {
                gVar2 = (io.flutter.plugins.firebase.storage.g) c1908s.f16116e;
            }
            Objects.requireNonNull(gVar2);
            gVar2.d(new e(str, str2));
        }
        this.f12320e = null;
    }

    public final void c(String str, Boolean bool, io.flutter.plugins.firebase.storage.g gVar) {
        try {
            Account account = new Account(str, "com.google");
            gVar.a(N2.d.b(this.f12316a, account, "oauth2:" + Y.k(this.f12319d)));
        } catch (UserRecoverableAuthException e7) {
            new Handler(Looper.getMainLooper()).post(new x(this, bool, gVar, e7, str, 6));
        } catch (Exception e8) {
            gVar.d(new e("exception", e8.getMessage()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.google.android.gms.common.api.internal.a] */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.google.android.gms.common.api.l, U2.a] */
    public final void d(g gVar) {
        U2.b bVar;
        boolean z7;
        boolean z8;
        int identifier;
        try {
            int i7 = a.f12313a[gVar.f12328b.ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    bVar = new U2.b(GoogleSignInOptions.f9117f0);
                    ((HashSet) bVar.f5722d).add(GoogleSignInOptions.f9119h0);
                } else {
                    throw new IllegalStateException("Unknown signInOption");
                }
            } else {
                bVar = new U2.b(GoogleSignInOptions.f9118g0);
            }
            String str = gVar.f12331e;
            if (!e(gVar.f12330d) && e(str)) {
                Log.w("google_sign_in", "clientId is not supported on Android and is interpreted as serverClientId. Use serverClientId instead to suppress this warning.");
                str = gVar.f12330d;
            }
            boolean e7 = e(str);
            Context context = this.f12316a;
            if (e7 && (identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName())) != 0) {
                str = context.getString(identifier);
            }
            if (!e(str)) {
                bVar.f5721c = true;
                I.e(str);
                String str2 = (String) bVar.f5723e;
                if (str2 == null || str2.equals(str)) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                I.a("two different server client ids provided", z7);
                bVar.f5723e = str;
                boolean booleanValue = gVar.f.booleanValue();
                bVar.f5719a = true;
                I.e(str);
                String str3 = (String) bVar.f5723e;
                if (str3 == null || str3.equals(str)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                I.a("two different server client ids provided", z8);
                bVar.f5723e = str;
                bVar.f5720b = booleanValue;
            }
            List<String> list = gVar.f12327a;
            this.f12319d = list;
            for (String str4 : list) {
                Scope scope = new Scope(1, str4);
                HashSet hashSet = (HashSet) bVar.f5722d;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
            if (!e(gVar.f12329c)) {
                String str5 = gVar.f12329c;
                I.e(str5);
                bVar.f = str5;
            }
            String str6 = gVar.f12332g;
            if (!e(str6)) {
                I.e(str6);
                bVar.f5725h = new Account(str6, "com.google");
            }
            this.f12318c = new l(context, null, P2.a.f4009a, bVar.a(), new k(new Object(), Looper.getMainLooper()));
        } catch (Exception e8) {
            throw new e("exception", e8.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, io.flutter.plugins.googlesignin.j] */
    public final void f(GoogleSignInAccount googleSignInAccount) {
        String str;
        String str2 = googleSignInAccount.f9111d;
        String str3 = googleSignInAccount.f9105X;
        Uri uri = googleSignInAccount.f;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        ?? obj = new Object();
        obj.f12334a = googleSignInAccount.f9112e;
        if (str2 != null) {
            obj.f12335b = str2;
            String str4 = googleSignInAccount.f9109b;
            if (str4 != null) {
                obj.f12336c = str4;
                obj.f12337d = str;
                obj.f12338e = googleSignInAccount.f9110c;
                obj.f = str3;
                io.flutter.plugins.firebase.storage.g gVar = (io.flutter.plugins.firebase.storage.g) this.f12320e.f16113b;
                Objects.requireNonNull(gVar);
                gVar.a(obj);
                this.f12320e = null;
                return;
            }
            throw new IllegalStateException("Nonnull field \"id\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"email\" is null.");
    }

    public final void g(Task task) {
        String str;
        try {
            f((GoogleSignInAccount) task.getResult(com.google.android.gms.common.api.j.class));
        } catch (com.google.android.gms.common.api.j e7) {
            int statusCode = e7.getStatusCode();
            if (statusCode != 4) {
                if (statusCode != 7) {
                    if (statusCode != 12501) {
                        str = "sign_in_failed";
                    } else {
                        str = "sign_in_canceled";
                    }
                } else {
                    str = "network_error";
                }
            } else {
                str = "sign_in_required";
            }
            b(str, e7.toString());
        } catch (RuntimeExecutionException e8) {
            b("exception", e8.toString());
        }
    }

    @Override // L5.t
    public final boolean onActivityResult(int i7, int i8, Intent intent) {
        U2.c cVar;
        Task forException;
        GoogleSignInAccount googleSignInAccount;
        C1908S c1908s = this.f12320e;
        boolean z7 = false;
        if (c1908s == null) {
            return false;
        }
        switch (i7) {
            case 53293:
                if (intent != null) {
                    Z2.a aVar = V2.j.f5962a;
                    Status status = Status.f9149X;
                    Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
                    GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
                    if (googleSignInAccount2 == null) {
                        if (status2 != null) {
                            status = status2;
                        }
                        cVar = new U2.c(null, status);
                    } else {
                        cVar = new U2.c(googleSignInAccount2, Status.f9152e);
                    }
                    Status status3 = cVar.f5727a;
                    if (status3.k() && (googleSignInAccount = cVar.f5728b) != null) {
                        forException = Tasks.forResult(googleSignInAccount);
                    } else {
                        forException = Tasks.forException(I.n(status3));
                    }
                    g(forException);
                } else {
                    b("sign_in_failed", "Signin failed");
                }
                return true;
            case 53294:
                if (i8 == -1) {
                    io.flutter.plugins.firebase.storage.g gVar = (io.flutter.plugins.firebase.storage.g) c1908s.f16116e;
                    Objects.requireNonNull(gVar);
                    Object obj = this.f12320e.f;
                    Objects.requireNonNull(obj);
                    this.f12320e = null;
                    c((String) obj, Boolean.FALSE, gVar);
                } else {
                    b("failed_to_recover_auth", "Failed attempt to recover authentication");
                }
                return true;
            case 53295:
                if (i8 == -1) {
                    z7 = true;
                }
                Boolean valueOf = Boolean.valueOf(z7);
                io.flutter.plugins.firebase.storage.g gVar2 = (io.flutter.plugins.firebase.storage.g) this.f12320e.f16115d;
                Objects.requireNonNull(gVar2);
                gVar2.a(valueOf);
                this.f12320e = null;
                return true;
            default:
                return false;
        }
    }
}
