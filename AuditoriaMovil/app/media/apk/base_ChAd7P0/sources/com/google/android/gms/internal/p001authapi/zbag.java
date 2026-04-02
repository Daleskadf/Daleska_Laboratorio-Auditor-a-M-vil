package com.google.android.gms.internal.p001authapi;

import B5.M;
import R2.h;
import R2.m;
import R2.r;
import W2.d;
import X2.b;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.AbstractC0726a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0751z;
import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.internal.auth-api.zbag  reason: invalid package */
/* loaded from: classes.dex */
public final class zbag extends l implements h {
    private static final com.google.android.gms.common.api.h zba;
    private static final AbstractC0726a zbb;
    private static final i zbc;
    private final String zbd;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        zba = obj;
        zbad zbadVar = new zbad();
        zbb = zbadVar;
        zbc = new i("Auth.Api.Identity.CredentialSaving.API", zbadVar, obj);
    }

    public zbag(Activity activity, r rVar) {
        super(activity, activity, zbc, rVar, k.f9283c);
        this.zbd = zbat.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        b r7;
        Status status = Status.f9149X;
        if (intent == null) {
            return status;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        if (byteArrayExtra == null) {
            r7 = null;
        } else {
            r7 = org.slf4j.helpers.i.r(byteArrayExtra, creator);
        }
        Status status2 = (Status) r7;
        if (status2 == null) {
            return status;
        }
        return status2;
    }

    public final Task<R2.k> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        boolean z7;
        boolean z8;
        I.i(saveAccountLinkingTokenRequest);
        new ArrayList();
        TextUtils.isEmpty(saveAccountLinkingTokenRequest.f9104e);
        String str = this.zbd;
        PendingIntent pendingIntent = saveAccountLinkingTokenRequest.f9100a;
        if (pendingIntent != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.a("Consent PendingIntent cannot be null", z7);
        String str2 = saveAccountLinkingTokenRequest.f9101b;
        I.a("Invalid tokenType", "auth_code".equals(str2));
        String str3 = saveAccountLinkingTokenRequest.f9102c;
        I.a("serviceId cannot be null or empty", !TextUtils.isEmpty(str3));
        ArrayList arrayList = saveAccountLinkingTokenRequest.f9103d;
        if (arrayList != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        I.a("scopes cannot be null", z8);
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = new SaveAccountLinkingTokenRequest(pendingIntent, str2, str3, arrayList, str, saveAccountLinkingTokenRequest.f);
        M a7 = AbstractC0751z.a();
        a7.f331d = new d[]{zbas.zbg};
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth-api.zbab
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                zbae zbaeVar = new zbae(zbag.this, (TaskCompletionSource) obj2);
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest3 = saveAccountLinkingTokenRequest2;
                I.i(saveAccountLinkingTokenRequest3);
                ((zbn) ((zbh) obj).getService()).zbc(zbaeVar, saveAccountLinkingTokenRequest3);
            }
        };
        a7.f328a = false;
        a7.f329b = 1535;
        return doRead(a7.a());
    }

    @Override // R2.h
    public final Task<m> savePassword(R2.l lVar) {
        I.i(lVar);
        final R2.l lVar2 = new R2.l(lVar.f4716a, this.zbd, lVar.f4718c);
        M a7 = AbstractC0751z.a();
        a7.f331d = new d[]{zbas.zbe};
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth-api.zbac
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                zbaf zbafVar = new zbaf(zbag.this, (TaskCompletionSource) obj2);
                R2.l lVar3 = lVar2;
                I.i(lVar3);
                ((zbn) ((zbh) obj).getService()).zbd(zbafVar, lVar3);
            }
        };
        a7.f328a = false;
        a7.f329b = 1536;
        return doRead(a7.a());
    }

    public zbag(Context context, r rVar) {
        super(context, null, zbc, rVar, k.f9283c);
        this.zbd = zbat.zba();
    }
}
