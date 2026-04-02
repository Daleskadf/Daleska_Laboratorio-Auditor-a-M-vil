package com.distriqt.extension.playservices.base.functions.availability;

import androidx.core.content.pm.PackageInfoCompat;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.core.utils.FREUtils;
/* loaded from: classes.dex */
public class GetInstalledGooglePlayServicesVersionFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        long j;
        try {
            try {
                j = PackageInfoCompat.getLongVersionCode(fREContext.getActivity().getPackageManager().getPackageInfo("com.google.android.gms", 0));
            } catch (Exception e) {
                e.printStackTrace();
                j = 0;
            }
            return FREObject.newObject(j);
        } catch (Exception e2) {
            FREUtils.handleException(fREContext, e2);
            return null;
        }
    }
}
