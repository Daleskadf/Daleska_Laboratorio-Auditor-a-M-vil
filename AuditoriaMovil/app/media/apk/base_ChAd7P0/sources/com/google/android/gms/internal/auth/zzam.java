package com.google.android.gms.internal.auth;

import N2.g;
import O2.e;
import O2.f;
import W2.d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0763l;
import com.google.android.gms.common.internal.C0760i;
/* loaded from: classes.dex */
public final class zzam extends AbstractC0763l {
    public zzam(Context context, Looper looper, C0760i c0760i, m mVar, n nVar) {
        super(context, looper, 120, c0760i, mVar, nVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final IInterface createServiceInterface(IBinder iBinder) {
        int i7 = e.f3848a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        if (queryLocalInterface instanceof f) {
            return (f) queryLocalInterface;
        }
        return new zza(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final d[] getApiFeatures() {
        return new d[]{g.f3399d};
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
