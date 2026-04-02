package com.google.android.gms.internal.fido;

import W2.d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0763l;
import com.google.android.gms.common.internal.C0760i;
import k3.AbstractC1394b;
/* loaded from: classes.dex */
public final class zzk extends AbstractC0763l {
    public zzk(Context context, Looper looper, C0760i c0760i, m mVar, n nVar) {
        super(context, looper, 149, c0760i, mVar, nVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
        if (queryLocalInterface instanceof zzn) {
            return (zzn) queryLocalInterface;
        }
        return new zzn(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final d[] getApiFeatures() {
        return new d[]{AbstractC1394b.f13697b, AbstractC1394b.f13698c, AbstractC1394b.f13699d};
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.privileged.START");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.fido2.privileged.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
