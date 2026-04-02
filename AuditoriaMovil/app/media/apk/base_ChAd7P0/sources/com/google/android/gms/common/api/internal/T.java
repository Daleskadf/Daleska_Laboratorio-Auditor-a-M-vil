package com.google.android.gms.common.api.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.AbstractC0757f;
import com.google.android.gms.common.internal.C0760i;
import com.google.android.gms.internal.base.zac;
import java.util.Set;
import u3.AbstractC1870b;
import v3.AbstractBinderC1887c;
import v3.C1885a;
import v3.C1888d;
/* loaded from: classes.dex */
public final class T extends AbstractBinderC1887c implements com.google.android.gms.common.api.m, com.google.android.gms.common.api.n {
    public static final O2.g j = AbstractC1870b.f15979a;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9207a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f9208b;

    /* renamed from: c  reason: collision with root package name */
    public final O2.g f9209c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f9210d;

    /* renamed from: e  reason: collision with root package name */
    public final C0760i f9211e;
    public C1885a f;

    /* renamed from: i  reason: collision with root package name */
    public Q0.A f9212i;

    public T(Context context, Handler handler, C0760i c0760i) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f9207a = context;
        this.f9208b = handler;
        this.f9211e = c0760i;
        this.f9210d = c0760i.f9354a;
        this.f9209c = j;
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final void b(W2.b bVar) {
        this.f9212i.j(bVar);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0734h
    public final void c(int i7) {
        Q0.A a7 = this.f9212i;
        G g3 = (G) ((C0735i) a7.f4140g).f9260e0.get((C0728b) a7.f4138d);
        if (g3 != null) {
            if (g3.f9181k) {
                g3.q(new W2.b(17));
            } else {
                g3.c(i7);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0734h
    public final void e() {
        GoogleSignInAccount googleSignInAccount;
        C1885a c1885a = this.f;
        c1885a.getClass();
        try {
            c1885a.f16041b.getClass();
            Account account = new Account(AbstractC0757f.DEFAULT_ACCOUNT, "com.google");
            if (AbstractC0757f.DEFAULT_ACCOUNT.equals(account.name)) {
                googleSignInAccount = V2.b.a(c1885a.getContext()).b();
            } else {
                googleSignInAccount = null;
            }
            Integer num = c1885a.f16043d;
            com.google.android.gms.common.internal.I.i(num);
            com.google.android.gms.common.internal.D d7 = new com.google.android.gms.common.internal.D(2, account, num.intValue(), googleSignInAccount);
            C1888d c1888d = (C1888d) c1885a.getService();
            v3.f fVar = new v3.f(1, d7);
            Parcel zaa = c1888d.zaa();
            zac.zac(zaa, fVar);
            zac.zad(zaa, this);
            c1888d.zac(12, zaa);
        } catch (RemoteException e7) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f9208b.post(new d0(3, this, new v3.g(1, new W2.b(8, null), null)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e7);
            }
        }
    }
}
