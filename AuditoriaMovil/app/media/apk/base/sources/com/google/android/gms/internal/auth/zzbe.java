package com.google.android.gms.internal.auth;

import P2.b;
import P2.c;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.InterfaceC0734h;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.AbstractC0763l;
import com.google.android.gms.common.internal.C0760i;
/* loaded from: classes.dex */
public final class zzbe extends AbstractC0763l {
    private final Bundle zze;

    public zzbe(Context context, Looper looper, C0760i c0760i, c cVar, InterfaceC0734h interfaceC0734h, r rVar) {
        super(context, looper, 16, c0760i, interfaceC0734h, rVar);
        Bundle bundle;
        if (cVar == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle(cVar.f4012a);
        }
        this.zze = bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof zzbh) {
            return (zzbh) queryLocalInterface;
        }
        return new zzbh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f, com.google.android.gms.common.api.g
    public final boolean requiresSignIn() {
        C0760i clientSettings = getClientSettings();
        clientSettings.getClass();
        if (!TextUtils.isEmpty(null)) {
            if (clientSettings.f9356c.get(b.f4010a) == null) {
                if (!clientSettings.f9354a.isEmpty()) {
                    return true;
                }
                return false;
            }
            throw new ClassCastException();
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
