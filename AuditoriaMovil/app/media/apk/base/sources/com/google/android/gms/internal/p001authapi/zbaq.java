package com.google.android.gms.internal.p001authapi;

import B5.M;
import R2.b;
import R2.c;
import R2.d;
import R2.e;
import R2.f;
import R2.g;
import R2.n;
import R2.o;
import R2.s;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC0726a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0751z;
import com.google.android.gms.common.api.internal.C0735i;
import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Set;
/* renamed from: com.google.android.gms.internal.auth-api.zbaq  reason: invalid package */
/* loaded from: classes.dex */
public final class zbaq extends l implements n {
    private static final h zba;
    private static final AbstractC0726a zbb;
    private static final i zbc;
    private final String zbd;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        zba = obj;
        zbal zbalVar = new zbal();
        zbb = zbalVar;
        zbc = new i("Auth.Api.Identity.SignIn.API", zbalVar, obj);
    }

    public zbaq(Activity activity, s sVar) {
        super(activity, activity, zbc, sVar, k.f9283c);
        this.zbd = zbat.zba();
    }

    @Override // R2.n
    public final Task<g> beginSignIn(f fVar) {
        I.i(fVar);
        b bVar = fVar.f4704b;
        I.i(bVar);
        e eVar = fVar.f4703a;
        I.i(eVar);
        d dVar = fVar.f;
        I.i(dVar);
        c cVar = fVar.f4702X;
        I.i(cVar);
        final f fVar2 = new f(eVar, bVar, this.zbd, fVar.f4706d, fVar.f4707e, dVar, cVar);
        M a7 = AbstractC0751z.a();
        a7.f331d = new W2.d[]{zbas.zba};
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth-api.zbaj
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                zbam zbamVar = new zbam(zbaq.this, (TaskCompletionSource) obj2);
                f fVar3 = fVar2;
                I.i(fVar3);
                ((zbw) ((zbar) obj).getService()).zbc(zbamVar, fVar3);
            }
        };
        a7.f328a = false;
        a7.f329b = 1553;
        return doRead(a7.a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) {
        X2.b r7;
        Status status = Status.f9149X;
        if (intent != null) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            if (byteArrayExtra == null) {
                r7 = null;
            } else {
                r7 = org.slf4j.helpers.i.r(byteArrayExtra, creator);
            }
            Status status2 = (Status) r7;
            if (status2 != null) {
                if (status2.k()) {
                    String stringExtra = intent.getStringExtra("phone_number_hint_result");
                    if (stringExtra != null) {
                        return stringExtra;
                    }
                    throw new j(status);
                }
                throw new j(status2);
            }
            throw new j(Status.f9151Z);
        }
        throw new j(status);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(final R2.i iVar) {
        I.i(iVar);
        M a7 = AbstractC0751z.a();
        a7.f331d = new W2.d[]{zbas.zbh};
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth-api.zbah
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                zbaq.this.zba(iVar, (zbar) obj, (TaskCompletionSource) obj2);
            }
        };
        a7.f329b = 1653;
        return doRead(a7.a());
    }

    public final o getSignInCredentialFromIntent(Intent intent) {
        X2.b r7;
        Status status = Status.f9149X;
        if (intent != null) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            X2.b bVar = null;
            if (byteArrayExtra == null) {
                r7 = null;
            } else {
                r7 = org.slf4j.helpers.i.r(byteArrayExtra, creator);
            }
            Status status2 = (Status) r7;
            if (status2 != null) {
                if (status2.k()) {
                    Parcelable.Creator<o> creator2 = o.CREATOR;
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
                    if (byteArrayExtra2 != null) {
                        bVar = org.slf4j.helpers.i.r(byteArrayExtra2, creator2);
                    }
                    o oVar = (o) bVar;
                    if (oVar != null) {
                        return oVar;
                    }
                    throw new j(status);
                }
                throw new j(status2);
            }
            throw new j(Status.f9151Z);
        }
        throw new j(status);
    }

    @Override // R2.n
    public final Task<PendingIntent> getSignInIntent(R2.j jVar) {
        I.i(jVar);
        String str = jVar.f4710a;
        I.i(str);
        final R2.j jVar2 = new R2.j(str, jVar.f4711b, this.zbd, jVar.f4713d, jVar.f4714e, jVar.f);
        M a7 = AbstractC0751z.a();
        a7.f331d = new W2.d[]{zbas.zbf};
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth-api.zbak
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                zbao zbaoVar = new zbao(zbaq.this, (TaskCompletionSource) obj2);
                R2.j jVar3 = jVar2;
                I.i(jVar3);
                ((zbw) ((zbar) obj).getService()).zbe(zbaoVar, jVar3);
            }
        };
        a7.f329b = 1555;
        return doRead(a7.a());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = com.google.android.gms.common.api.o.f9286a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            C0735i.a();
            M a7 = AbstractC0751z.a();
            a7.f331d = new W2.d[]{zbas.zbb};
            a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth-api.zbai
                @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
                public final void accept(Object obj, Object obj2) {
                    zbaq.this.zbb((zbar) obj, (TaskCompletionSource) obj2);
                }
            };
            a7.f328a = false;
            a7.f329b = 1554;
            return doWrite(a7.a());
        }
        ((com.google.android.gms.common.api.o) it.next()).getClass();
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void zba(R2.i iVar, zbar zbarVar, TaskCompletionSource taskCompletionSource) {
        ((zbw) zbarVar.getService()).zbd(new zbap(this, taskCompletionSource), iVar, this.zbd);
    }

    public final /* synthetic */ void zbb(zbar zbarVar, TaskCompletionSource taskCompletionSource) {
        ((zbw) zbarVar.getService()).zbf(new zban(this, taskCompletionSource), this.zbd);
    }

    public zbaq(Context context, s sVar) {
        super(context, null, zbc, sVar, k.f9283c);
        this.zbd = zbat.zba();
    }
}
