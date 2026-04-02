package com.distriqt.extension.adverts.platforms.admob;

import android.app.Activity;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.adverts.controller.ump.AdvertConsentRequestParameters;
import com.distriqt.extension.adverts.controller.ump.AdvertUserMessagingPlatform;
import com.distriqt.extension.adverts.events.ConsentInformationEvent;
import com.distriqt.extension.adverts.events.UserMessagingPlatformEvent;
import com.distriqt.extension.adverts.utils.Errors;
import com.distriqt.extension.adverts.utils.Logger;
import com.distriqt.extension.inappbilling.controller.InAppBillingAvailability;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class GoogleAdMobUserMessagingPlatform implements AdvertUserMessagingPlatform {
    private static final String TAG = "GoogleAdMobUserMessagingPlatform";
    private ConsentForm _consentForm;
    private ConsentInformation _consentInformation;
    private IExtensionContext _extContext;

    public GoogleAdMobUserMessagingPlatform(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
        this._consentInformation = UserMessagingPlatform.getConsentInformation(iExtensionContext.getActivity());
    }

    public void destroy() {
        this._extContext = null;
    }

    @Override // com.distriqt.extension.adverts.controller.ump.AdvertUserMessagingPlatform
    public boolean isSupported() {
        return GoogleAdMobUserMessagingPlatformSupport.isSupported();
    }

    @Override // com.distriqt.extension.adverts.controller.ump.AdvertUserMessagingPlatform
    public boolean loadConsentForm() {
        Logger.d(TAG, "loadConsentForm()", new Object[0]);
        if (isConsentFormAvailable()) {
            final Activity activity = this._extContext.getActivity();
            this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobUserMessagingPlatform$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleAdMobUserMessagingPlatform.this.m243xc6b86fe7(activity);
                }
            });
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$loadConsentForm$2$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobUserMessagingPlatform  reason: not valid java name */
    public /* synthetic */ void m243xc6b86fe7(Activity activity) {
        UserMessagingPlatform.loadConsentForm(activity, new UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobUserMessagingPlatform$$ExternalSyntheticLambda0
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                GoogleAdMobUserMessagingPlatform.this.m241x5c5c3e5(consentForm);
            }
        }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobUserMessagingPlatform$$ExternalSyntheticLambda1
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError) {
                GoogleAdMobUserMessagingPlatform.this.m242xe63f19e6(formError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$loadConsentForm$0$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobUserMessagingPlatform  reason: not valid java name */
    public /* synthetic */ void m241x5c5c3e5(ConsentForm consentForm) {
        Logger.d(TAG, "loadConsentForm::onConsentFormLoadSuccess()", new Object[0]);
        this._consentForm = consentForm;
        IExtensionContext iExtensionContext = this._extContext;
        if (iExtensionContext != null) {
            iExtensionContext.dispatchEvent(UserMessagingPlatformEvent.CONSENT_FORM_LOAD_SUCCESS, UserMessagingPlatformEvent.formatForEvent());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$loadConsentForm$1$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobUserMessagingPlatform  reason: not valid java name */
    public /* synthetic */ void m242xe63f19e6(FormError formError) {
        Logger.d(TAG, "loadConsentForm::onConsentFormLoadFailure()", new Object[0]);
        IExtensionContext iExtensionContext = this._extContext;
        if (iExtensionContext != null) {
            iExtensionContext.dispatchEvent(UserMessagingPlatformEvent.CONSENT_FORM_LOAD_FAILURE, UserMessagingPlatformEvent.formatErrorForEvent(formError.getMessage(), formError.getErrorCode()));
        }
    }

    @Override // com.distriqt.extension.adverts.controller.ump.AdvertUserMessagingPlatform
    public boolean showConsentForm() {
        Logger.d(TAG, "showConsentForm()", new Object[0]);
        if (isSupported() && this._consentForm != null) {
            this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobUserMessagingPlatform$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleAdMobUserMessagingPlatform.this.m247x513c6932();
                }
            });
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$showConsentForm$4$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobUserMessagingPlatform  reason: not valid java name */
    public /* synthetic */ void m247x513c6932() {
        this._consentForm.show(this._extContext.getActivity(), new ConsentForm.OnConsentFormDismissedListener() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobUserMessagingPlatform$$ExternalSyntheticLambda2
            @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
            public final void onConsentFormDismissed(FormError formError) {
                GoogleAdMobUserMessagingPlatform.this.m246x70c31331(formError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$showConsentForm$3$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobUserMessagingPlatform  reason: not valid java name */
    public /* synthetic */ void m246x70c31331(FormError formError) {
        String str = TAG;
        Object[] objArr = new Object[1];
        objArr[0] = formError == null ? "null" : formError.getMessage();
        Logger.d(str, "showConsentForm::onConsentFormDismissed( %s )", objArr);
        this._extContext.dispatchEvent(UserMessagingPlatformEvent.CONSENT_FORM_DISMISSED, UserMessagingPlatformEvent.formatForEvent());
    }

    @Override // com.distriqt.extension.adverts.controller.ump.AdvertUserMessagingPlatform
    public JSONObject getConsentInformation() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("consentStatus", Integer.valueOf(getConsentStatus()));
            jSONObject.putOpt("formStatus", getFormStatus());
            jSONObject.putOpt("canRequestAds", Boolean.valueOf(this._consentInformation.canRequestAds()));
            jSONObject.putOpt("isConsentFormAvailable", Boolean.valueOf(this._consentInformation.isConsentFormAvailable()));
            jSONObject.putOpt("privacyOptionsRequirementStatus", getPrivacyOptionsRequirementStatus());
        } catch (Exception e) {
            Errors.handleException(e);
        }
        return jSONObject;
    }

    @Override // com.distriqt.extension.adverts.controller.ump.AdvertUserMessagingPlatform
    public int getConsentStatus() {
        Logger.d(TAG, "getConsentStatus()", new Object[0]);
        try {
            return this._consentInformation.getConsentStatus();
        } catch (Exception e) {
            Errors.handleException(e);
            return 0;
        }
    }

    @Override // com.distriqt.extension.adverts.controller.ump.AdvertUserMessagingPlatform
    public boolean isConsentFormAvailable() {
        Logger.d(TAG, "isConsentFormAvailable()", new Object[0]);
        if (isSupported()) {
            try {
                return this._consentInformation.isConsentFormAvailable();
            } catch (Exception e) {
                Errors.handleException(e);
                return false;
            }
        }
        return false;
    }

    public String getFormStatus() {
        return isConsentFormAvailable() ? InAppBillingAvailability.AVAILABLE : "unavailable";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobUserMessagingPlatform$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus;

        static {
            int[] iArr = new int[ConsentInformation.PrivacyOptionsRequirementStatus.values().length];
            $SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus = iArr;
            try {
                iArr[ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus[ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus[ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public String getPrivacyOptionsRequirementStatus() {
        int i = AnonymousClass1.$SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus[this._consentInformation.getPrivacyOptionsRequirementStatus().ordinal()];
        return i != 1 ? i != 2 ? "unknown" : "required" : "not_required";
    }

    @Override // com.distriqt.extension.adverts.controller.ump.AdvertUserMessagingPlatform
    public void requestConsentInfoUpdate(AdvertConsentRequestParameters advertConsentRequestParameters) {
        Logger.d(TAG, "requestConsentInfoUpdate( %s )", advertConsentRequestParameters.toString());
        if (isSupported()) {
            try {
                ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
                builder.setTagForUnderAgeOfConsent(advertConsentRequestParameters.tagForUnderAgeOfConsent);
                if (advertConsentRequestParameters.debugSettings != null) {
                    ConsentDebugSettings.Builder builder2 = new ConsentDebugSettings.Builder(this._extContext.getActivity());
                    builder2.setDebugGeography(advertConsentRequestParameters.debugSettings.debugGeography);
                    for (String str : advertConsentRequestParameters.debugSettings.testDeviceIds) {
                        builder2.addTestDeviceHashedId(str);
                    }
                    builder.setConsentDebugSettings(builder2.build());
                }
                this._consentInformation.requestConsentInfoUpdate(this._extContext.getActivity(), builder.build(), new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobUserMessagingPlatform$$ExternalSyntheticLambda4
                    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
                    public final void onConsentInfoUpdateSuccess() {
                        GoogleAdMobUserMessagingPlatform.this.m244x15325ace();
                    }
                }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobUserMessagingPlatform$$ExternalSyntheticLambda5
                    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
                    public final void onConsentInfoUpdateFailure(FormError formError) {
                        GoogleAdMobUserMessagingPlatform.this.m245xf5abb0cf(formError);
                    }
                });
            } catch (Exception e) {
                Errors.handleException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$requestConsentInfoUpdate$5$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobUserMessagingPlatform  reason: not valid java name */
    public /* synthetic */ void m244x15325ace() {
        Logger.d(TAG, "requestConsentInfoUpdate::onConsentInfoUpdateSuccess()", new Object[0]);
        IExtensionContext iExtensionContext = this._extContext;
        if (iExtensionContext != null) {
            iExtensionContext.dispatchEvent(ConsentInformationEvent.CONSENT_INFO_UPDATE_SUCCESS, ConsentInformationEvent.formatForEvent());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$requestConsentInfoUpdate$6$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobUserMessagingPlatform  reason: not valid java name */
    public /* synthetic */ void m245xf5abb0cf(FormError formError) {
        Logger.d(TAG, "requestConsentInfoUpdate::onConsentInfoUpdateFailure()", new Object[0]);
        IExtensionContext iExtensionContext = this._extContext;
        if (iExtensionContext != null) {
            iExtensionContext.dispatchEvent(ConsentInformationEvent.CONSENT_INFO_UPDATE_FAILURE, ConsentInformationEvent.formatErrorForEvent(formError.getMessage(), formError.getErrorCode()));
        }
    }

    @Override // com.distriqt.extension.adverts.controller.ump.AdvertUserMessagingPlatform
    public void reset() {
        Logger.d(TAG, "reset()", new Object[0]);
        if (isSupported()) {
            try {
                this._consentInformation.reset();
            } catch (Exception e) {
                Errors.handleException(e);
            }
        }
    }
}
