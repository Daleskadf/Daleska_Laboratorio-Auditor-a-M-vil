package com.google.android.gms.internal.p001authapi;

import R2.r;
import W2.d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC0734h;
import com.google.android.gms.common.internal.AbstractC0763l;
import com.google.android.gms.common.internal.C0760i;
/* renamed from: com.google.android.gms.internal.auth-api.zbh  reason: invalid package */
/* loaded from: classes.dex */
public final class zbh extends AbstractC0763l {
    private final Bundle zba;

    public zbh(Context context, Looper looper, r rVar, C0760i c0760i, InterfaceC0734h interfaceC0734h, com.google.android.gms.common.api.internal.r rVar2) {
        super(context, looper, 223, c0760i, interfaceC0734h, rVar2);
        this.zba = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        if (queryLocalInterface instanceof zbn) {
            return (zbn) queryLocalInterface;
        }
        return new zbn(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final d[] getApiFeatures() {
        return zbas.zbi;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
