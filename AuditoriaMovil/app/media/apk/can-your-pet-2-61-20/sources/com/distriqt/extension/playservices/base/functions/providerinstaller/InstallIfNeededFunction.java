package com.distriqt.extension.playservices.base.functions.providerinstaller;

import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.playservices.base.PlayServicesBase;
import com.distriqt.extension.playservices.base.events.ProviderInstallerEvent;
import com.google.android.gms.security.ProviderInstaller;
/* loaded from: classes.dex */
public class InstallIfNeededFunction implements FREFunction {
    public static final String TAG = "InstallIfNeededFunction";

    @Override // com.adobe.fre.FREFunction
    public FREObject call(final FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            LogUtil.d(PlayServicesBase.ID, TAG, NotificationCompat.CATEGORY_CALL, new Object[0]);
            ProviderInstaller.installIfNeededAsync(fREContext.getActivity(), new ProviderInstaller.ProviderInstallListener() { // from class: com.distriqt.extension.playservices.base.functions.providerinstaller.InstallIfNeededFunction.1
                @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
                public void onProviderInstalled() {
                    LogUtil.d(PlayServicesBase.ID, InstallIfNeededFunction.TAG, "onProviderInstalled()", new Object[0]);
                    fREContext.dispatchStatusEventAsync(ProviderInstallerEvent.INSTALLED, ProviderInstallerEvent.formatForEvent());
                }

                @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
                public void onProviderInstallFailed(int i, Intent intent) {
                    LogUtil.d(PlayServicesBase.ID, InstallIfNeededFunction.TAG, "onProviderInstallFailed( %d )", Integer.valueOf(i));
                    fREContext.dispatchStatusEventAsync(ProviderInstallerEvent.INSTALL_FAILED, ProviderInstallerEvent.formatForEvent(i));
                }
            });
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            try {
                fREContext.dispatchStatusEventAsync("extension:error", e.getLocalizedMessage());
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
