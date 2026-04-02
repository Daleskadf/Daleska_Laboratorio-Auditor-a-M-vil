package com.google.firebase.auth;

import U3.h;
import U3.i;
import a4.AbstractC0456e;
import a4.AbstractC0467p;
import a4.C0448A;
import a4.C0453b;
import a4.C0454c;
import a4.C0455d;
import a4.C0457f;
import a4.C0459h;
import a4.C0460i;
import a4.L;
import a4.N;
import a4.P;
import a4.S;
import a4.v;
import a4.w;
import a4.x;
import a4.y;
import a6.t0;
import android.app.Activity;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import b4.C0591E;
import b4.C0597e;
import b4.C0599g;
import b4.C0603k;
import b4.C0610s;
import b4.H;
import b4.InterfaceC0592F;
import b4.InterfaceC0593a;
import b4.M;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zzabq;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.android.gms.internal.p002firebaseauthapi.zzadu;
import com.google.android.gms.internal.p002firebaseauthapi.zzafc;
import com.google.android.gms.internal.p002firebaseauthapi.zzagw;
import com.google.android.gms.internal.p002firebaseauthapi.zzan;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import f5.C0993a;
import io.flutter.plugins.firebase.auth.Q;
import io.flutter.plugins.pathprovider.b;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import w.C1908S;
import w4.InterfaceC1956b;
/* loaded from: classes.dex */
public class FirebaseAuth implements InterfaceC0593a {

    /* renamed from: A  reason: collision with root package name */
    public final Executor f9701A;

    /* renamed from: B  reason: collision with root package name */
    public String f9702B;

    /* renamed from: a  reason: collision with root package name */
    public final h f9703a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f9704b;

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f9705c;

    /* renamed from: d  reason: collision with root package name */
    public final CopyOnWriteArrayList f9706d;

    /* renamed from: e  reason: collision with root package name */
    public final zzabq f9707e;
    public AbstractC0467p f;

    /* renamed from: g  reason: collision with root package name */
    public final C0597e f9708g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f9709h;

    /* renamed from: i  reason: collision with root package name */
    public String f9710i;
    public final Object j;

    /* renamed from: k  reason: collision with root package name */
    public String f9711k;

    /* renamed from: l  reason: collision with root package name */
    public C1908S f9712l;

    /* renamed from: m  reason: collision with root package name */
    public final RecaptchaAction f9713m;

    /* renamed from: n  reason: collision with root package name */
    public final RecaptchaAction f9714n;

    /* renamed from: o  reason: collision with root package name */
    public final RecaptchaAction f9715o;

    /* renamed from: p  reason: collision with root package name */
    public final RecaptchaAction f9716p;

    /* renamed from: q  reason: collision with root package name */
    public final RecaptchaAction f9717q;

    /* renamed from: r  reason: collision with root package name */
    public final RecaptchaAction f9718r;

    /* renamed from: s  reason: collision with root package name */
    public final t0 f9719s;

    /* renamed from: t  reason: collision with root package name */
    public final H f9720t;

    /* renamed from: u  reason: collision with root package name */
    public final C0610s f9721u;

    /* renamed from: v  reason: collision with root package name */
    public final InterfaceC1956b f9722v;

    /* renamed from: w  reason: collision with root package name */
    public final InterfaceC1956b f9723w;

    /* renamed from: x  reason: collision with root package name */
    public C0591E f9724x;

    /* renamed from: y  reason: collision with root package name */
    public final Executor f9725y;

    /* renamed from: z  reason: collision with root package name */
    public final Executor f9726z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a4, code lost:
        if (r11.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE") == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v1, types: [b4.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FirebaseAuth(U3.h r7, w4.InterfaceC1956b r8, w4.InterfaceC1956b r9, java.util.concurrent.Executor r10, java.util.concurrent.Executor r11, java.util.concurrent.ScheduledExecutorService r12, java.util.concurrent.Executor r13) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(U3.h, w4.b, w4.b, java.util.concurrent.Executor, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService, java.util.concurrent.Executor):void");
    }

    @Keep
    public static FirebaseAuth getInstance() {
        h d7 = h.d();
        d7.a();
        return (FirebaseAuth) d7.f5752d.a(FirebaseAuth.class);
    }

    public static void k(i iVar, w wVar, String str) {
        Log.e("FirebaseAuth", "Invoking verification failure callback for phone number/uid - " + str);
        y zza = zzafc.zza(str, wVar.f7055c, null);
        H.h hVar = new H.h();
        hVar.f1626b = zza;
        hVar.f1627c = iVar;
        wVar.f7056d.execute(hVar);
    }

    public static void l(w wVar) {
        String str;
        String str2;
        RecaptchaAction recaptchaAction;
        C0603k c0603k = wVar.f7059h;
        Executor executor = wVar.f7056d;
        Activity activity = wVar.f;
        Q q2 = wVar.f7055c;
        x xVar = wVar.f7058g;
        FirebaseAuth firebaseAuth = wVar.f7053a;
        if (c0603k != null) {
            if (c0603k.f8270a != null) {
                String str3 = wVar.f7057e;
                I.e(str3);
                str = str3;
                str2 = str;
            } else {
                C0448A c0448a = wVar.f7060i;
                I.i(c0448a);
                String str4 = c0448a.f6948a;
                I.e(str4);
                str = c0448a.f6951d;
                str2 = str4;
            }
            if (xVar == null || !zzafc.zza(str2, q2, activity, executor)) {
                if (c0603k.f8270a != null) {
                    recaptchaAction = firebaseAuth.f9717q;
                } else {
                    recaptchaAction = firebaseAuth.f9718r;
                }
                RecaptchaAction recaptchaAction2 = recaptchaAction;
                firebaseAuth.f9721u.a(firebaseAuth, str, wVar.f, firebaseAuth.s(), wVar.j, wVar.f7061k, recaptchaAction2).addOnCompleteListener(new L(firebaseAuth, wVar, str2, 1));
                return;
            }
            return;
        }
        String str5 = wVar.f7057e;
        I.e(str5);
        if (xVar != null || !zzafc.zza(str5, q2, activity, executor)) {
            firebaseAuth.f9721u.a(firebaseAuth, str5, wVar.f, firebaseAuth.s(), wVar.j, wVar.f7061k, firebaseAuth.f9716p).addOnCompleteListener(new L(firebaseAuth, wVar, str5, 0));
        }
    }

    public static void m(FirebaseAuth firebaseAuth, AbstractC0467p abstractC0467p) {
        if (abstractC0467p != null) {
            String str = ((C0599g) abstractC0467p).f8254b.f8241a;
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + str + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f9701A.execute(new S(firebaseAuth));
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(com.google.firebase.auth.FirebaseAuth r18, a4.AbstractC0467p r19, com.google.android.gms.internal.p002firebaseauthapi.zzagw r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.n(com.google.firebase.auth.FirebaseAuth, a4.p, com.google.android.gms.internal.firebase-auth-api.zzagw, boolean, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [x4.b, java.lang.Object] */
    public static void p(FirebaseAuth firebaseAuth, AbstractC0467p abstractC0467p) {
        String str;
        if (abstractC0467p != null) {
            String str2 = ((C0599g) abstractC0467p).f8254b.f8241a;
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + str2 + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        if (abstractC0467p != null) {
            str = ((C0599g) abstractC0467p).f8253a.zzc();
        } else {
            str = null;
        }
        ?? obj = new Object();
        obj.f16505a = str;
        firebaseAuth.f9701A.execute(new S(firebaseAuth, obj));
    }

    public final String a() {
        String str;
        synchronized (this.f9709h) {
            str = this.f9710i;
        }
        return str;
    }

    public final String b() {
        String str;
        synchronized (this.j) {
            str = this.f9711k;
        }
        return str;
    }

    public final Task c() {
        if (this.f9712l == null) {
            this.f9712l = new C1908S(this.f9703a, this);
        }
        return this.f9712l.g(this.f9711k, Boolean.FALSE).continueWithTask(new C0993a(14));
    }

    public final Task d(String str, C0454c c0454c) {
        I.e(str);
        if (c0454c == null) {
            c0454c = new C0454c(new C0453b());
        }
        String str2 = this.f9710i;
        if (str2 != null) {
            c0454c.f7016Y = str2;
        }
        c0454c.f7017Z = 1;
        return new P(this, str, c0454c, 0).H(this, this.f9711k, this.f9713m);
    }

    public final void e(String str) {
        String concat;
        I.e(str);
        if (str.startsWith("chrome-extension://")) {
            this.f9702B = str;
            return;
        }
        if (str.contains("://")) {
            concat = str;
        } else {
            concat = "http://".concat(str);
        }
        try {
            String host = new URI(concat).getHost();
            I.i(host);
            this.f9702B = host;
        } catch (URISyntaxException e7) {
            if (Log.isLoggable("FirebaseAuth", 4)) {
                String message = e7.getMessage();
                Log.i("FirebaseAuth", "Error parsing URL: '" + str + "', " + message);
            }
            this.f9702B = str;
        }
    }

    public final void f(String str) {
        I.e(str);
        synchronized (this.f9709h) {
            this.f9710i = str;
        }
    }

    public final void g(String str) {
        I.e(str);
        synchronized (this.j) {
            this.f9711k = str;
        }
    }

    public final Task h(AbstractC0456e abstractC0456e) {
        C0455d c0455d;
        boolean z7;
        AbstractC0456e m7 = abstractC0456e.m();
        if (m7 instanceof C0457f) {
            C0457f c0457f = (C0457f) m7;
            String str = c0457f.f7031c;
            if (TextUtils.isEmpty(str)) {
                String str2 = c0457f.f7030b;
                I.i(str2);
                String str3 = this.f9711k;
                return new a4.I(this, c0457f.f7029a, false, null, str2, str3).H(this, str3, this.f9714n);
            }
            I.e(str);
            zzan zzanVar = C0455d.f7025d;
            I.e(str);
            try {
                c0455d = new C0455d(str);
            } catch (IllegalArgumentException unused) {
                c0455d = null;
            }
            if (c0455d != null && !TextUtils.equals(this.f9711k, c0455d.f7028c)) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                return Tasks.forException(zzadr.zza(new Status(17072, null, null, null)));
            }
            return new a4.H(this, false, null, c0457f).H(this, this.f9711k, this.f9713m);
        }
        boolean z8 = m7 instanceof v;
        h hVar = this.f9703a;
        zzabq zzabqVar = this.f9707e;
        if (z8) {
            return zzabqVar.zza(hVar, (v) m7, this.f9711k, (M) new C0460i(this));
        }
        return zzabqVar.zza(hVar, m7, this.f9711k, new C0460i(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [a4.h, b4.F] */
    public final Task i(AbstractC0467p abstractC0467p, AbstractC0456e abstractC0456e) {
        I.i(abstractC0467p);
        if (abstractC0456e instanceof C0457f) {
            return new N(this, abstractC0467p, (C0457f) abstractC0456e.m(), 0).H(this, abstractC0467p.k(), this.f9715o);
        }
        AbstractC0456e m7 = abstractC0456e.m();
        ?? c0459h = new C0459h(this, 0);
        return this.f9707e.zza(this.f9703a, abstractC0467p, m7, (String) null, (InterfaceC0592F) c0459h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [a4.h, b4.F] */
    public final Task j(AbstractC0467p abstractC0467p, boolean z7) {
        if (abstractC0467p == null) {
            return Tasks.forException(zzadr.zza(new Status(17495, null, null, null)));
        }
        zzagw zzagwVar = ((C0599g) abstractC0467p).f8253a;
        if (zzagwVar.zzg() && !z7) {
            return Tasks.forResult(b4.y.a(zzagwVar.zzc()));
        }
        return this.f9707e.zza(this.f9703a, abstractC0467p, zzagwVar.zzd(), (InterfaceC0592F) new C0459h(this, 1));
    }

    public final synchronized C1908S o() {
        return this.f9712l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [a4.h, b4.F] */
    /* JADX WARN: Type inference failed for: r6v0, types: [a4.h, b4.F] */
    public final Task q(AbstractC0467p abstractC0467p, AbstractC0456e abstractC0456e) {
        C0455d c0455d;
        I.i(abstractC0467p);
        AbstractC0456e m7 = abstractC0456e.m();
        if (m7 instanceof C0457f) {
            C0457f c0457f = (C0457f) m7;
            if ("password".equals(c0457f.l())) {
                String str = c0457f.f7030b;
                I.e(str);
                String k2 = abstractC0467p.k();
                return new a4.I(this, c0457f.f7029a, true, abstractC0467p, str, k2).H(this, k2, this.f9714n);
            }
            String str2 = c0457f.f7031c;
            I.e(str2);
            zzan zzanVar = C0455d.f7025d;
            I.e(str2);
            try {
                c0455d = new C0455d(str2);
            } catch (IllegalArgumentException unused) {
                c0455d = null;
            }
            if (c0455d != null && !TextUtils.equals(this.f9711k, c0455d.f7028c)) {
                return Tasks.forException(zzadr.zza(new Status(17072, null, null, null)));
            }
            return new a4.H(this, true, abstractC0467p, c0457f).H(this, this.f9711k, this.f9713m);
        } else if (m7 instanceof v) {
            return this.f9707e.zzb(this.f9703a, abstractC0467p, (v) m7, this.f9711k, (InterfaceC0592F) new C0459h(this, 0));
        } else {
            return this.f9707e.zzc(this.f9703a, abstractC0467p, m7, abstractC0467p.k(), new C0459h(this, 0));
        }
    }

    public final void r() {
        t0 t0Var = this.f9719s;
        I.i(t0Var);
        AbstractC0467p abstractC0467p = this.f;
        if (abstractC0467p != null) {
            ((SharedPreferences) t0Var.f7209b).edit().remove(b.h("com.google.firebase.auth.GET_TOKEN_RESPONSE.", ((C0599g) abstractC0467p).f8254b.f8241a)).apply();
            this.f = null;
        }
        ((SharedPreferences) t0Var.f7209b).edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        p(this, null);
        m(this, null);
    }

    public final boolean s() {
        h hVar = this.f9703a;
        hVar.a();
        return zzadu.zza(hVar.f5749a);
    }

    public final synchronized C0591E t() {
        if (this.f9724x == null) {
            h hVar = this.f9703a;
            I.i(hVar);
            this.f9724x = new C0591E(hVar);
        }
        return this.f9724x;
    }

    @Keep
    public static FirebaseAuth getInstance(h hVar) {
        hVar.a();
        return (FirebaseAuth) hVar.f5752d.a(FirebaseAuth.class);
    }
}
