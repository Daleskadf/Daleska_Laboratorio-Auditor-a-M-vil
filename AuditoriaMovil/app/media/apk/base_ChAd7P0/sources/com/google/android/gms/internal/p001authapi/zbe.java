package com.google.android.gms.internal.p001authapi;

import M0.x;
import P2.d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0763l;
import com.google.android.gms.common.internal.C0760i;
/* renamed from: com.google.android.gms.internal.auth-api.zbe  reason: invalid package */
/* loaded from: classes.dex */
public final class zbe extends AbstractC0763l {
    private final d zba;

    public zbe(Context context, Looper looper, C0760i c0760i, d dVar, m mVar, n nVar) {
        super(context, looper, 68, c0760i, mVar, nVar);
        dVar = dVar == null ? d.f4013c : dVar;
        x xVar = new x((char) 0, 8);
        xVar.f3210b = Boolean.FALSE;
        d dVar2 = d.f4013c;
        dVar.getClass();
        xVar.f3210b = Boolean.valueOf(dVar.f4014a);
        xVar.f3211c = dVar.f4015b;
        xVar.f3211c = zbat.zba();
        this.zba = new d(xVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof zbf) {
            return (zbf) queryLocalInterface;
        }
        return new zbf(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final Bundle getGetServiceRequestExtraArgs() {
        d dVar = this.zba;
        dVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", dVar.f4014a);
        bundle.putString("log_session_id", dVar.f4015b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
