package com.distriqt.extension.share;

import android.content.Intent;
import android.content.res.Configuration;
import com.adobe.air.ActivityResultCallback;
import com.adobe.air.AndroidActivityWrapper;
import com.adobe.air.StateChangeCallback;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContextWithResult;
import com.distriqt.extension.share.applications.ApplicationsController;
import com.distriqt.extension.share.controller.ShareController;
import com.distriqt.extension.share.controller.SocialController;
import com.distriqt.extension.share.functions.ClearCacheFunction;
import com.distriqt.extension.share.functions.ImplementationFunction;
import com.distriqt.extension.share.functions.IsApplicationInstalledFunction;
import com.distriqt.extension.share.functions.IsShareSupportedFunction;
import com.distriqt.extension.share.functions.IsSupportedFunction;
import com.distriqt.extension.share.functions.ShareFileFunction;
import com.distriqt.extension.share.functions.ShareFunction;
import com.distriqt.extension.share.functions.ShowOpenInFunction;
import com.distriqt.extension.share.functions.VersionFunction;
import com.distriqt.extension.share.functions.applications.IsInstalledFunction;
import com.distriqt.extension.share.functions.applications.LaunchFunction;
import com.distriqt.extension.share.functions.applications.StartActivityFunction;
import com.distriqt.extension.share.functions.authorisation.AuthorisationStatusFunction;
import com.distriqt.extension.share.functions.authorisation.HasAuthorisationFunction;
import com.distriqt.extension.share.functions.authorisation.RequestAuthorisationFunction;
import com.distriqt.extension.share.functions.email.IsMailSupportedFunction;
import com.distriqt.extension.share.functions.email.SendMailFunction;
import com.distriqt.extension.share.functions.email.SendMailWithOptionsFunction;
import com.distriqt.extension.share.functions.sms.GetSubscriptionInfoFunction;
import com.distriqt.extension.share.functions.sms.IsSMSSupportedFunction;
import com.distriqt.extension.share.functions.sms.SendSMSFunction;
import com.distriqt.extension.share.functions.sms.SendSMSWithUIFunction;
import com.distriqt.extension.share.functions.social.IsNetworkSupportedFunction;
import com.distriqt.extension.share.functions.social.SharePostFunction;
import com.distriqt.extension.share.mail.EmailController;
import com.distriqt.extension.share.sms.SMSController;
import com.distriqt.extension.share.utils.Errors;
import com.distriqt.extension.share.utils.Logger;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class ShareContext extends FREContext implements ActivityResultCallback, StateChangeCallback, IExtensionContextWithResult {
    public static final String TAG = "ShareContext";
    private AndroidActivityWrapper _aaw;
    private ArrayList<ActivityStateListener> _stateListeners;
    public boolean v = true;
    private ShareController _shareController = null;
    private SocialController _socialController = null;
    private ApplicationsController _applications = null;
    private SMSController _smsController = null;
    private EmailController _emailController = null;

    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
    public void onConfigurationChanged(Configuration configuration) {
    }

    public ShareContext() {
        AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
        this._aaw = GetAndroidActivityWrapper;
        GetAndroidActivityWrapper.addActivityResultListener(this);
        this._aaw.addActivityStateChangeListner(this);
        this._stateListeners = new ArrayList<>();
    }

    @Override // com.adobe.fre.FREContext
    public void dispose() {
        ShareController shareController = this._shareController;
        if (shareController != null) {
            shareController.dispose();
            this._shareController = null;
        }
        SocialController socialController = this._socialController;
        if (socialController != null) {
            socialController.dispose();
            this._socialController = null;
        }
        ApplicationsController applicationsController = this._applications;
        if (applicationsController != null) {
            applicationsController.dispose();
            this._applications = null;
        }
        SMSController sMSController = this._smsController;
        if (sMSController != null) {
            sMSController.dispose();
            this._smsController = null;
        }
        EmailController emailController = this._emailController;
        if (emailController != null) {
            emailController.dispose();
            this._emailController = null;
        }
        this._stateListeners.clear();
        this._aaw.removeActivityResultListener(this);
        this._aaw.removeActivityStateChangeListner(this);
    }

    @Override // com.adobe.fre.FREContext
    public Map<String, FREFunction> getFunctions() {
        HashMap hashMap = new HashMap();
        hashMap.put("isSupported", new IsSupportedFunction());
        hashMap.put("version", new VersionFunction());
        hashMap.put("implementation", new ImplementationFunction());
        hashMap.put("isShareSupported", new IsShareSupportedFunction());
        hashMap.put("isApplicationInstalled", new IsApplicationInstalledFunction());
        hashMap.put(FirebaseAnalytics.Event.SHARE, new ShareFunction());
        hashMap.put("shareFile", new ShareFileFunction());
        hashMap.put("showOpenIn", new ShowOpenInFunction());
        hashMap.put("clearCache", new ClearCacheFunction());
        hashMap.put("social_isNetworkSupported", new IsNetworkSupportedFunction());
        hashMap.put("social_sharePost", new SharePostFunction());
        hashMap.put("applications_isInstalled", new IsInstalledFunction());
        hashMap.put("applications_launch", new LaunchFunction());
        hashMap.put("applications_startActivity", new StartActivityFunction());
        hashMap.put("email_isMailSupported", new IsMailSupportedFunction());
        hashMap.put("email_sendMail", new SendMailFunction());
        hashMap.put("email_sendMailWithOptions", new SendMailWithOptionsFunction());
        hashMap.put("authorisationStatus", new AuthorisationStatusFunction());
        hashMap.put("hasAuthorisation", new HasAuthorisationFunction());
        hashMap.put("requestAuthorisation", new RequestAuthorisationFunction());
        hashMap.put("sms_isSMSSupported", new IsSMSSupportedFunction());
        hashMap.put("sms_sendSMS", new SendSMSFunction());
        hashMap.put("sms_sendSMSWithUI", new SendSMSWithUIFunction());
        hashMap.put("sms_getSubscriptions", new GetSubscriptionInfoFunction());
        return hashMap;
    }

    public ShareController shareController() {
        if (this._shareController == null) {
            ShareController shareController = new ShareController(this);
            this._shareController = shareController;
            this._stateListeners.add(shareController);
        }
        return this._shareController;
    }

    public SocialController socialController() {
        if (this._socialController == null) {
            this._socialController = new SocialController(this);
        }
        return this._socialController;
    }

    public ApplicationsController applications() {
        if (this._applications == null) {
            ApplicationsController applicationsController = new ApplicationsController(this);
            this._applications = applicationsController;
            this._stateListeners.add(applicationsController);
        }
        return this._applications;
    }

    public EmailController email() {
        if (this._emailController == null) {
            EmailController emailController = new EmailController(this);
            this._emailController = emailController;
            this._stateListeners.add(emailController);
        }
        return this._emailController;
    }

    public SMSController smsController() {
        if (this._smsController == null) {
            SMSController sMSController = new SMSController(this);
            this._smsController = sMSController;
            this._stateListeners.add(sMSController);
        }
        return this._smsController;
    }

    @Override // com.adobe.air.AndroidActivityWrapper.ActivityResultCallback
    public void onActivityResult(int i, int i2, Intent intent) {
        Logger.d(TAG, "onActivityResult: %d", Integer.valueOf(this._stateListeners.size()));
        try {
            Iterator<ActivityStateListener> it = this._stateListeners.iterator();
            while (it.hasNext()) {
                it.next().onActivityResult(i, i2, intent);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
    public void onActivityStateChanged(AndroidActivityWrapper.ActivityState activityState) {
        Iterator<ActivityStateListener> it = this._stateListeners.iterator();
        while (it.hasNext()) {
            ActivityStateListener next = it.next();
            switch (AnonymousClass1.$SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[activityState.ordinal()]) {
                case 1:
                    next.onStart();
                    break;
                case 2:
                    next.onStop();
                    break;
                case 3:
                    next.onPause();
                    break;
                case 4:
                    next.onRestart();
                    break;
                case 5:
                    next.onDestroy();
                    break;
                case 6:
                    next.onResume();
                    break;
            }
        }
    }

    /* renamed from: com.distriqt.extension.share.ShareContext$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState;

        static {
            int[] iArr = new int[AndroidActivityWrapper.ActivityState.values().length];
            $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState = iArr;
            try {
                iArr[AndroidActivityWrapper.ActivityState.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.RESTARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.RESUMED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.distriqt.core.utils.IExtensionContext
    public void dispatchEvent(String str, String str2) {
        try {
            dispatchStatusEventAsync(str, str2);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.core.utils.IExtensionContextWithResult
    public void startActivityForResult(Intent intent, int i) {
        try {
            getActivity().startActivityForResult(intent, i);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }
}
