package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
/* loaded from: classes.dex */
public abstract class zad extends com.google.android.gms.internal.base.zab implements zae {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return false;
                    }
                    com.google.android.gms.internal.base.zac.zab(parcel);
                    zab((Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR));
                } else {
                    com.google.android.gms.internal.base.zac.zab(parcel);
                    zac((Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR), (ModuleInstallIntentResponse) com.google.android.gms.internal.base.zac.zaa(parcel, ModuleInstallIntentResponse.CREATOR));
                }
            } else {
                com.google.android.gms.internal.base.zac.zab(parcel);
                zad((Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR), (ModuleInstallResponse) com.google.android.gms.internal.base.zac.zaa(parcel, ModuleInstallResponse.CREATOR));
            }
        } else {
            com.google.android.gms.internal.base.zac.zab(parcel);
            zae((Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR), (ModuleAvailabilityResponse) com.google.android.gms.internal.base.zac.zaa(parcel, ModuleAvailabilityResponse.CREATOR));
        }
        return true;
    }
}
