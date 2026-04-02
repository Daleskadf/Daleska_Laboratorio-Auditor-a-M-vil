package com.google.android.gms.internal.p000authapiphone;

import W2.d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC0734h;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.AbstractC0763l;
import com.google.android.gms.common.internal.C0760i;
/* renamed from: com.google.android.gms.internal.auth-api-phone.zzw  reason: invalid package */
/* loaded from: classes.dex */
public final class zzw extends AbstractC0763l {
    public zzw(Context context, Looper looper, C0760i c0760i, InterfaceC0734h interfaceC0734h, r rVar) {
        super(context, looper, 126, c0760i, interfaceC0734h, rVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof zzh) {
            return (zzh) queryLocalInterface;
        }
        return new zzh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final d[] getApiFeatures() {
        return zzac.zze;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
