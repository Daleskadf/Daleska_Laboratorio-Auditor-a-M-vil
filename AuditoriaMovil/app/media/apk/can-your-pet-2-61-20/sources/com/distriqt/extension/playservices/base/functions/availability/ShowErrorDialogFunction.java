package com.distriqt.extension.playservices.base.functions.availability;

import android.content.DialogInterface;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.core.utils.FREUtils;
import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.playservices.base.PlayServicesBase;
import com.google.android.gms.common.GoogleApiAvailability;
/* loaded from: classes.dex */
public class ShowErrorDialogFunction implements FREFunction {
    public static final int PLAY_SERVICES_REQUESTCODE = 99550;
    public static final String TAG = "ShowErrorDialogFunction";

    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            GoogleApiAvailability.getInstance().getErrorDialog(fREContext.getActivity(), fREObjectArr[0].getAsInt(), 99550, new DialogInterface.OnCancelListener() { // from class: com.distriqt.extension.playservices.base.functions.availability.ShowErrorDialogFunction.1
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    LogUtil.d(PlayServicesBase.ID, ShowErrorDialogFunction.TAG, "onCancel", new Object[0]);
                }
            }).show();
            return null;
        } catch (Exception e) {
            FREUtils.handleException(fREContext, e);
            return null;
        }
    }
}
