package Q0;

import B5.AbstractActivityC0032e;
import D.RunnableC0053c;
import H4.W;
import X5.C0391q;
import X5.g0;
import X5.i0;
import a.AbstractC0412a;
import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Log;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.C0814p;
import com.google.firebase.firestore.EnumC0815q;
import com.google.firebase.firestore.p0;
import io.flutter.plugins.firebase.auth.C1154q;
import io.flutter.plugins.firebase.firestore.C1162g;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import l4.C1422f;
import n4.C1533t;
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4350a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4351b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4352c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f4353d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f4354e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f4350a = i7;
        this.f4351b = obj;
        this.f4352c = obj2;
        this.f4353d = obj3;
        this.f4354e = obj4;
        this.f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intent intent = null;
        switch (this.f4350a) {
            case 0:
                AudioTrack audioTrack = (AudioTrack) this.f4351b;
                A.m mVar = (A.m) this.f4352c;
                Handler handler = (Handler) this.f4353d;
                J j = (J) this.f4354e;
                A.n nVar = (A.n) this.f;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (mVar != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC0053c(16, mVar, j));
                    }
                    nVar.d();
                    synchronized (I.f4164m0) {
                        try {
                            int i7 = I.f4166o0 - 1;
                            I.f4166o0 = i7;
                            if (i7 == 0) {
                                I.f4165n0.shutdown();
                                I.f4165n0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (mVar != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC0053c(16, mVar, j));
                    }
                    nVar.d();
                    synchronized (I.f4164m0) {
                        try {
                            int i8 = I.f4166o0 - 1;
                            I.f4166o0 = i8;
                            if (i8 == 0) {
                                I.f4165n0.shutdown();
                                I.f4165n0 = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 1:
                C0391q c0391q = new C0391q(2);
                g0 g0Var = (g0) this.f4351b;
                g0Var.f6492b.k(g0Var, (WebView) this.f4352c, (String) this.f4353d, (String) this.f4354e, (String) this.f, c0391q);
                return;
            case 2:
                C0391q c0391q2 = new C0391q(2);
                g0 g0Var2 = (g0) this.f4351b;
                g0Var2.f6492b.i(g0Var2, (WebView) this.f4352c, (HttpAuthHandler) this.f4353d, (String) this.f4354e, (String) this.f, c0391q2);
                return;
            case 3:
                C0391q c0391q3 = new C0391q(3);
                i0 i0Var = (i0) this.f4351b;
                i0Var.f6501a.k(i0Var, (WebView) this.f4352c, (String) this.f4353d, (String) this.f4354e, (String) this.f, c0391q3);
                return;
            case 4:
                C0391q c0391q4 = new C0391q(3);
                i0 i0Var2 = (i0) this.f4351b;
                i0Var2.f6501a.i(i0Var2, (WebView) this.f4352c, (HttpAuthHandler) this.f4353d, (String) this.f4354e, (String) this.f, c0391q4);
                return;
            case 5:
                io.flutter.plugins.firebase.firestore.q qVar = (io.flutter.plugins.firebase.firestore.q) this.f4352c;
                String str = (String) this.f4353d;
                String str2 = (String) this.f4354e;
                C1154q c1154q = (C1154q) this.f;
                HashMap hashMap = C1162g.f11922Y;
                C1162g c1162g = (C1162g) this.f4351b;
                try {
                    C0814p d7 = C1162g.c(qVar).d(str);
                    p0 p0Var = (p0) c1162g.f11928d.get(str2);
                    if (p0Var == null) {
                        c1154q.b(new Exception("Transaction.getDocument(): No transaction handler exists for ID: " + str2));
                    } else {
                        c1154q.d(AbstractC0412a.a0(p0Var.a(d7), EnumC0815q.NONE));
                    }
                    return;
                } catch (Exception e7) {
                    W.H(c1154q, e7);
                    return;
                }
            case 6:
                io.flutter.plugins.googlesignin.c cVar = (io.flutter.plugins.googlesignin.c) this.f4351b;
                cVar.getClass();
                boolean booleanValue = ((Boolean) this.f4352c).booleanValue();
                UserRecoverableAuthException userRecoverableAuthException = (UserRecoverableAuthException) this.f4354e;
                io.flutter.plugins.firebase.storage.g gVar = (io.flutter.plugins.firebase.storage.g) this.f4353d;
                if (booleanValue && cVar.f12320e == null) {
                    AbstractActivityC0032e abstractActivityC0032e = cVar.f12317b;
                    if (abstractActivityC0032e == null) {
                        gVar.d(new io.flutter.plugins.googlesignin.e("user_recoverable_auth", "Cannot recover auth because app is not in foreground. " + userRecoverableAuthException.getLocalizedMessage()));
                        return;
                    }
                    cVar.a("getTokens", null, null, null, gVar, (String) this.f);
                    Intent intent2 = userRecoverableAuthException.f9091a;
                    if (intent2 == null) {
                        int ordinal = userRecoverableAuthException.f9092b.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal == 2) {
                                    Log.e("Auth", "this instantiation of UserRecoverableAuthException doesn't support an Intent.");
                                }
                            } else {
                                Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
                            }
                        } else {
                            Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
                        }
                    } else {
                        intent = new Intent(intent2);
                    }
                    abstractActivityC0032e.startActivityForResult(intent, 53294);
                    return;
                }
                gVar.d(new io.flutter.plugins.googlesignin.e("user_recoverable_auth", userRecoverableAuthException.getLocalizedMessage()));
                return;
            default:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f4352c;
                Context context = (Context) this.f4353d;
                n4.y yVar = (n4.y) this.f4354e;
                t4.j jVar = (t4.j) this.f;
                C1533t c1533t = (C1533t) this.f4351b;
                c1533t.getClass();
                try {
                    c1533t.a(context, (C1422f) Tasks.await(taskCompletionSource.getTask()), yVar, jVar);
                    return;
                } catch (InterruptedException | ExecutionException e8) {
                    throw new RuntimeException(e8);
                }
        }
    }
}
