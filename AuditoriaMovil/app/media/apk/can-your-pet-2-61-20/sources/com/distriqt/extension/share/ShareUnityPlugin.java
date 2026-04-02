package com.distriqt.extension.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import com.adobe.air.AIRFileUtils$$ExternalSyntheticApiModelOutline2;
import com.android.billingclient.api.BillingClient;
import com.distriqt.core.activities.DispatchActivity;
import com.distriqt.core.utils.IActivityResultHandler;
import com.distriqt.core.utils.IExtensionContextWithResult;
import com.distriqt.extension.share.activities.ShareOptions;
import com.distriqt.extension.share.applications.Application;
import com.distriqt.extension.share.applications.ApplicationOptions;
import com.distriqt.extension.share.applications.ApplicationsController;
import com.distriqt.extension.share.applications.IntentObject;
import com.distriqt.extension.share.controller.ShareController;
import com.distriqt.extension.share.controller.SocialController;
import com.distriqt.extension.share.mail.EmailController;
import com.distriqt.extension.share.mail.MessageAttachment;
import com.distriqt.extension.share.sms.SMS;
import com.distriqt.extension.share.sms.SMSController;
import com.distriqt.extension.share.utils.Errors;
import com.distriqt.extension.share.utils.Logger;
import com.unity3d.player.UnityPlayer;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ShareUnityPlugin implements IExtensionContextWithResult, IActivityResultHandler {
    private static final String TAG = "ShareUnityPlugin";
    private static ShareUnityPlugin _instance;
    private ShareController _shareController = null;
    private SocialController _socialController = null;
    private ApplicationsController _applications = null;
    private SMSController _smsController = null;
    private EmailController _emailController = null;

    public static ShareUnityPlugin instance() {
        if (_instance == null) {
            _instance = new ShareUnityPlugin();
        }
        return _instance;
    }

    private ShareController controller() {
        if (this._shareController == null) {
            this._shareController = new ShareController(this);
        }
        return this._shareController;
    }

    private SocialController socialController() {
        if (this._socialController == null) {
            this._socialController = new SocialController(this);
        }
        return this._socialController;
    }

    private ApplicationsController applications() {
        if (this._applications == null) {
            this._applications = new ApplicationsController(this);
        }
        return this._applications;
    }

    private SMSController smsController() {
        if (this._smsController == null) {
            this._smsController = new SMSController(this);
        }
        return this._smsController;
    }

    private EmailController emailController() {
        if (this._emailController == null) {
            this._emailController = new EmailController(this);
        }
        return this._emailController;
    }

    public ShareUnityPlugin() {
        Logger.d(TAG, "ShareUnityPlugin()", new Object[0]);
        controller();
    }

    public static boolean isSupported() {
        Logger.d(TAG, "isSupported()", new Object[0]);
        return true;
    }

    public String implementation() {
        Logger.d(TAG, "implementation()", new Object[0]);
        return Share.IMPLEMENTATION;
    }

    public String version() {
        Logger.d(TAG, "version()", new Object[0]);
        return Share.VERSION;
    }

    public boolean isShareSupported() {
        return controller().isShareSupported();
    }

    public static File bitmapToCacheFile(Context context, byte[] bArr, int i, int i2, String str, String str2) {
        return bitmapToCacheFile(context, bArr, i, i2, str, str2, "jpg", 0.8f);
    }

    public static File bitmapToCacheFile(Context context, byte[] bArr, int i, int i2, String str, String str2, String str3, float f) {
        File file;
        try {
            Bitmap imageDataToBitmap = imageDataToBitmap(bArr, i, i2);
            if (imageDataToBitmap != null) {
                new File(context.getExternalCacheDir().getAbsolutePath() + "/" + str).mkdir();
                String str4 = file.getAbsolutePath() + "/" + str2;
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str4));
                if (str3.equals("png")) {
                    imageDataToBitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
                } else {
                    imageDataToBitmap.compress(Bitmap.CompressFormat.JPEG, (int) (f * 100.0f), bufferedOutputStream);
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                return new File(str4);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap imageDataToBitmap(byte[] bArr, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(wrap);
            Matrix matrix = new Matrix();
            matrix.postScale(1.0f, -1.0f, createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            return Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void share(String str, String str2, byte[] bArr, int i, int i2, String str3) {
        try {
            String str4 = "";
            File bitmapToCacheFile = bitmapToCacheFile(getActivity(), bArr, i, i2, "distriqt_share", new SimpleDateFormat("'image_'yyyyMMddHHmmss'.jpg'", Locale.ENGLISH).format(new Date()));
            if (bitmapToCacheFile != null) {
                str4 = bitmapToCacheFile.getAbsolutePath();
                Logger.d(TAG, String.format("image path = %s", str4), new Object[0]);
            }
            controller().share(str, str4, str2, ShareOptions.fromJSONObject(new JSONObject(str3)));
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    public void shareFile(String str, String str2, String str3, String str4, boolean z, String str5) {
        try {
            controller().shareFile(str, str2, str3, ShareOptions.fromJSONObject(new JSONObject(str4)), str5);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    public void showOpenIn(String str, String str2, String str3, String str4) {
        try {
            controller().showOpenIn(str, str2, str3, ShareOptions.fromJSONObject(new JSONObject(str4)));
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    public boolean applications_isInstalled(String str) {
        try {
            return applications().isInstalled(Application.fromJSONObject(new JSONObject(str)).packageName);
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    public boolean applications_launch(String str, String str2) {
        try {
            Application fromJSONObject = Application.fromJSONObject(new JSONObject(str));
            return applications().launch(fromJSONObject.packageName, ApplicationOptions.fromJSONObject(new JSONObject(str2)));
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    public boolean applications_startActivity(String str) {
        try {
            return applications().startActivity(IntentObject.fromJSONObject(new JSONObject(str)));
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    public boolean email_isMailSupported() {
        return emailController().isMailSupported();
    }

    public boolean email_sendMail(String str, String str2, String str3) {
        return emailController().sendMail(str, str2, str3.split(","));
    }

    public boolean email_sendMailWithOptions(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        try {
            JSONArray jSONArray = new JSONArray(str6);
            ArrayList<MessageAttachment> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(MessageAttachment.fromJSON(jSONArray.getJSONObject(i)));
            }
            return emailController().sendMailWithOptions(str, str2, str3.split(","), str4.split(","), str5.split(","), arrayList, z, z2);
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    public boolean sms_isSMSSupported() {
        return smsController().isSupported();
    }

    public String sms_getSubscriptions() {
        int subscriptionId;
        CharSequence displayName;
        CharSequence carrierName;
        String countryIso;
        String number;
        String iccId;
        int simSlotIndex;
        try {
            JSONArray jSONArray = new JSONArray();
            if (Build.VERSION.SDK_INT >= 22) {
                Iterator<SubscriptionInfo> it = smsController().getSubscriptions().iterator();
                while (it.hasNext()) {
                    SubscriptionInfo m193m = AIRFileUtils$$ExternalSyntheticApiModelOutline2.m193m((Object) it.next());
                    JSONObject jSONObject = new JSONObject();
                    subscriptionId = m193m.getSubscriptionId();
                    jSONObject.put("id", subscriptionId);
                    displayName = m193m.getDisplayName();
                    jSONObject.put("displayName", displayName.toString());
                    carrierName = m193m.getCarrierName();
                    jSONObject.put("carrierName", carrierName.toString());
                    countryIso = m193m.getCountryIso();
                    jSONObject.put("country", countryIso);
                    number = m193m.getNumber();
                    jSONObject.put("number", number);
                    iccId = m193m.getIccId();
                    jSONObject.put("ICCID", iccId);
                    simSlotIndex = m193m.getSimSlotIndex();
                    jSONObject.put("simSlotIndex", simSlotIndex);
                    jSONArray.put(jSONObject);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(BillingClient.FeatureType.SUBSCRIPTIONS, jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            Errors.handleException(e);
            return "{ 'subscriptions': [] }";
        }
    }

    public boolean sms_sendSMS(String str, int i) {
        try {
            return smsController().sendSMS(SMS.fromJSONObject(new JSONObject(str)), i);
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    public boolean sms_sendSMSWithUI(String str, boolean z) {
        try {
            return smsController().sendSMSWithUI(SMS.fromJSONObject(new JSONObject(str)), z);
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    @Override // com.distriqt.core.utils.IExtensionContext
    public void dispatchEvent(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "";
            }
            jSONObject.put("code", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("data", str2);
            UnityPlayer.UnitySendMessage("Share", "Dispatch", jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.distriqt.core.utils.IExtensionContext
    public Activity getActivity() {
        return UnityPlayer.currentActivity;
    }

    @Override // com.distriqt.core.utils.IExtensionContextWithResult
    public void startActivityForResult(Intent intent, int i) {
        try {
            DispatchActivity.resultHandler = this;
            Intent intent2 = new Intent(getActivity(), DispatchActivity.class);
            intent2.putExtra("android.intent.extra.INTENT", intent);
            intent2.putExtra(DispatchActivity.EXTRA_REQUESTCODE, i);
            getActivity().startActivity(intent2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.distriqt.core.utils.IActivityResultHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            controller().onActivityResult(i, i2, intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
