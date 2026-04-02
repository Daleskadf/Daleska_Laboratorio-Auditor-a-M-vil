package b3;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.AbstractC0763l;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zav;
/* loaded from: classes.dex */
public final class i extends AbstractC0763l {
    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        if (queryLocalInterface instanceof C0584e) {
            return (C0584e) queryLocalInterface;
        }
        return new zaa(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final W2.d[] getApiFeatures() {
        return zav.zab;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getStartServiceAction() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
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
