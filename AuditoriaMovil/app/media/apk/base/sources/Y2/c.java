package Y2;

import W2.d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC0734h;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.AbstractC0763l;
import com.google.android.gms.common.internal.C0760i;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zaf;
/* loaded from: classes.dex */
public final class c extends AbstractC0763l {

    /* renamed from: a  reason: collision with root package name */
    public final z f6702a;

    public c(Context context, Looper looper, C0760i c0760i, z zVar, InterfaceC0734h interfaceC0734h, r rVar) {
        super(context, looper, 270, c0760i, interfaceC0734h, rVar);
        this.f6702a = zVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new zaa(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final d[] getApiFeatures() {
        return zaf.zab;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final Bundle getGetServiceRequestExtraArgs() {
        z zVar = this.f6702a;
        zVar.getClass();
        Bundle bundle = new Bundle();
        String str = zVar.f9408a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
