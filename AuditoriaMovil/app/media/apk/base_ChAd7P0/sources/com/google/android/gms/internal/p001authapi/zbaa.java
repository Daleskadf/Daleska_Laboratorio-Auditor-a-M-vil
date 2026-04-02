package com.google.android.gms.internal.p001authapi;

import B5.M;
import R2.a;
import R2.q;
import W2.d;
import X2.b;
import android.accounts.Account;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.AbstractC0726a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0751z;
import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.internal.auth-api.zbaa  reason: invalid package */
/* loaded from: classes.dex */
public final class zbaa extends l {
    private static final h zba;
    private static final AbstractC0726a zbb;
    private static final i zbc;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        zba = obj;
        zby zbyVar = new zby();
        zbb = zbyVar;
        zbc = new i("Auth.Api.Identity.Authorization.API", zbyVar, obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zbaa(android.app.Activity r7, R2.q r8) {
        /*
            r6 = this;
            com.google.android.gms.common.api.i r3 = com.google.android.gms.internal.p001authapi.zbaa.zbc
            java.lang.String r8 = r8.f4730a
            if (r8 == 0) goto L9
            com.google.android.gms.common.internal.I.e(r8)
        L9:
            java.lang.String r8 = com.google.android.gms.internal.p001authapi.zbat.zba()
            com.google.android.gms.common.internal.I.e(r8)
            R2.q r4 = new R2.q
            r4.<init>(r8)
            com.google.android.gms.common.api.k r5 = com.google.android.gms.common.api.k.f9283c
            r0 = r6
            r1 = r7
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001authapi.zbaa.<init>(android.app.Activity, R2.q):void");
    }

    public final Task<a> authorize(AuthorizationRequest authorizationRequest) {
        boolean z7;
        String str;
        Account account;
        boolean z8;
        boolean z9;
        boolean z10;
        String str2;
        boolean z11;
        I.i(authorizationRequest);
        ArrayList arrayList = authorizationRequest.f9095a;
        if (arrayList != null && !arrayList.isEmpty()) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.a("requestedScopes cannot be null or empty", z7);
        String str3 = null;
        String str4 = authorizationRequest.f;
        if (str4 != null) {
            I.e(str4);
            str = str4;
        } else {
            str = null;
        }
        Account account2 = authorizationRequest.f9099e;
        if (account2 != null) {
            account = account2;
        } else {
            account = null;
        }
        boolean z12 = authorizationRequest.f9098d;
        String str5 = authorizationRequest.f9096b;
        if (z12 && str5 != null) {
            z8 = true;
            str3 = str5;
        } else {
            z8 = false;
        }
        if (authorizationRequest.f9097c && str5 != null) {
            if (str3 == null || str3.equals(str5)) {
                z11 = true;
            } else {
                z11 = false;
            }
            I.a("two different server client ids provided", z11);
            z10 = authorizationRequest.f9094Y;
            str2 = str5;
            z9 = true;
        } else {
            z9 = false;
            z10 = false;
            str2 = str3;
        }
        final AuthorizationRequest authorizationRequest2 = new AuthorizationRequest(arrayList, str2, z9, z8, account, str, ((q) getApiOptions()).f4730a, z10);
        M a7 = AbstractC0751z.a();
        a7.f331d = new d[]{zbas.zbc};
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth-api.zbx
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                zbz zbzVar = new zbz(zbaa.this, (TaskCompletionSource) obj2);
                AuthorizationRequest authorizationRequest3 = authorizationRequest2;
                I.i(authorizationRequest3);
                ((zbk) ((zbg) obj).getService()).zbc(zbzVar, authorizationRequest3);
            }
        };
        a7.f328a = false;
        a7.f329b = 1534;
        return doRead(a7.a());
    }

    public final a getAuthorizationResultFromIntent(Intent intent) {
        b r7;
        Status status = Status.f9149X;
        if (intent != null) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            b bVar = null;
            if (byteArrayExtra == null) {
                r7 = null;
            } else {
                r7 = org.slf4j.helpers.i.r(byteArrayExtra, creator);
            }
            Status status2 = (Status) r7;
            if (status2 != null) {
                if (status2.k()) {
                    Parcelable.Creator<a> creator2 = a.CREATOR;
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("authorization_result");
                    if (byteArrayExtra2 != null) {
                        bVar = org.slf4j.helpers.i.r(byteArrayExtra2, creator2);
                    }
                    a aVar = (a) bVar;
                    if (aVar != null) {
                        return aVar;
                    }
                    throw new j(status);
                }
                throw new j(status2);
            }
            throw new j(Status.f9151Z);
        }
        throw new j(status);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zbaa(android.content.Context r7, R2.q r8) {
        /*
            r6 = this;
            com.google.android.gms.common.api.i r3 = com.google.android.gms.internal.p001authapi.zbaa.zbc
            java.lang.String r8 = r8.f4730a
            if (r8 == 0) goto L9
            com.google.android.gms.common.internal.I.e(r8)
        L9:
            java.lang.String r8 = com.google.android.gms.internal.p001authapi.zbat.zba()
            com.google.android.gms.common.internal.I.e(r8)
            R2.q r4 = new R2.q
            r4.<init>(r8)
            com.google.android.gms.common.api.k r5 = com.google.android.gms.common.api.k.f9283c
            r2 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001authapi.zbaa.<init>(android.content.Context, R2.q):void");
    }
}
