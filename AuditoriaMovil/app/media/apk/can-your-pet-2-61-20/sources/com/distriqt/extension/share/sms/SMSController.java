package com.distriqt.extension.share.sms;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import com.adobe.air.AIRFileUtils$$ExternalSyntheticApiModelOutline2;
import com.adobe.air.wand.message.MessageManager;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.auth.Authorisation;
import com.distriqt.core.auth.AuthorisationStatus;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.share.receivers.SMSDeliveryReceiver;
import com.distriqt.extension.share.receivers.SMSSentReceiver;
import com.distriqt.extension.share.utils.Errors;
import com.distriqt.extension.share.utils.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class SMSController extends ActivityStateListener {
    public static final String TAG = "SMSController";
    private Authorisation _auth;
    private IExtensionContext _extContext;
    private String[] _permissions;
    private SMSSentReceiver _smsSentReceiver = null;
    private SMSDeliveryReceiver _smsDeliveredReceiver = null;

    public SMSController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
        this._auth = new Authorisation(this._extContext);
        this._permissions = new String[]{"android.permission.SEND_SMS", "android.permission.READ_SMS", "android.permission.RECEIVE_SMS"};
        this._permissions = Authorisation.filterOptionalPermissionsFromManifest(iExtensionContext.getActivity(), new ArrayList(), Arrays.asList("android.permission.SEND_SMS", "android.permission.READ_SMS", "android.permission.RECEIVE_SMS", "android.permission.READ_PHONE_STATE"));
    }

    public void dispose() {
        unregisterSMSReceivers();
    }

    public boolean isSupported() {
        return isAndroidEmulator() || this._extContext.getActivity().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    public static boolean isAndroidEmulator() {
        String str = Build.MODEL;
        String str2 = Build.PRODUCT;
        if (str2 != null) {
            return str2.equals("sdk") || str2.contains("_sdk") || str2.contains("sdk_");
        }
        return false;
    }

    public String authorisationStatus() {
        Logger.d(TAG, "authorisationStatus()", new Object[0]);
        return this._auth.hasPermissions(this._permissions) ? AuthorisationStatus.AUTHORISED : this._auth.shouldExplainPermissions(this._permissions) ? AuthorisationStatus.SHOULD_EXPLAIN : AuthorisationStatus.NOT_DETERMINED;
    }

    public boolean hasAuthorisation() {
        Logger.d(TAG, "hasAuthorisation()", new Object[0]);
        return this._auth.hasPermissions(this._permissions);
    }

    public boolean requestAuthorisation() {
        Logger.d(TAG, "requestAuthorisation()", new Object[0]);
        return this._auth.requestPermissions(this._permissions);
    }

    public ArrayList<SubscriptionInfo> getSubscriptions() {
        SubscriptionManager from;
        List activeSubscriptionInfoList;
        Logger.d(TAG, "getSubscriptions()", new Object[0]);
        ArrayList<SubscriptionInfo> arrayList = new ArrayList<>();
        if (Build.VERSION.SDK_INT >= 22) {
            try {
                from = SubscriptionManager.from(this._extContext.getActivity());
                activeSubscriptionInfoList = from.getActiveSubscriptionInfoList();
                arrayList.addAll(activeSubscriptionInfoList);
            } catch (SecurityException e) {
                Errors.handleException(e);
            } catch (Exception e2) {
                Errors.handleException(e2);
            }
        }
        return arrayList;
    }

    private SmsManager getSmsManagerForSubscriptionId(int i) {
        SubscriptionManager from;
        List<Object> activeSubscriptionInfoList;
        int subscriptionId;
        SmsManager smsManager = null;
        if (i != -1 && Build.VERSION.SDK_INT >= 22) {
            try {
                from = SubscriptionManager.from(this._extContext.getActivity());
                activeSubscriptionInfoList = from.getActiveSubscriptionInfoList();
                for (Object obj : activeSubscriptionInfoList) {
                    subscriptionId = AIRFileUtils$$ExternalSyntheticApiModelOutline2.m193m(obj).getSubscriptionId();
                    if (i == subscriptionId) {
                        smsManager = SmsManager.getSmsManagerForSubscriptionId(i);
                    }
                }
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        }
        return smsManager == null ? SmsManager.getDefault() : smsManager;
    }

    public boolean sendSMS(SMS sms, int i) {
        String str = TAG;
        Object[] objArr = new Object[4];
        objArr[0] = sms.id;
        objArr[1] = sms.address;
        objArr[2] = sms.message;
        objArr[3] = sms.scAddress == null ? "null" : sms.scAddress;
        Logger.d(str, "sendSMS( [%s, %s, %s, %s] )", objArr);
        int i2 = Build.VERSION.SDK_INT >= 23 ? 67108864 : 0;
        registerSMSReceivers();
        SmsManager smsManagerForSubscriptionId = getSmsManagerForSubscriptionId(i);
        if (sms.message.length() < 160) {
            Intent intent = new Intent(this._extContext.getActivity(), SMSDeliveryReceiver.class);
            intent.setAction(SMSDeliveryReceiver.SMS_DELIVERED);
            intent.setData(Uri.parse("dtme://" + sms.id));
            intent.putExtra("id", sms.id);
            intent.putExtra("address", sms.address);
            intent.putExtra(MessageManager.NAME_ERROR_MESSAGE, sms.message);
            if (sms.scAddress != null) {
                intent.putExtra("scAddress", sms.scAddress);
            }
            Intent intent2 = new Intent(this._extContext.getActivity(), SMSSentReceiver.class);
            intent2.setAction(SMSSentReceiver.SMS_SENT);
            intent2.setData(Uri.parse("dtme://" + sms.id));
            intent2.putExtra("id", sms.id);
            intent2.putExtra("address", sms.address);
            intent2.putExtra(MessageManager.NAME_ERROR_MESSAGE, sms.message);
            if (sms.scAddress != null) {
                intent2.putExtra("scAddress", sms.scAddress);
            }
            smsManagerForSubscriptionId.sendTextMessage(sms.address, sms.scAddress, sms.message, PendingIntent.getBroadcast(this._extContext.getActivity(), 0, intent2, i2), PendingIntent.getBroadcast(this._extContext.getActivity(), 0, intent, i2));
            return true;
        }
        Logger.d(str, "Sending multipart sms", new Object[0]);
        ArrayList<String> divideMessage = smsManagerForSubscriptionId.divideMessage(sms.message);
        ArrayList<PendingIntent> arrayList = new ArrayList<>();
        ArrayList<PendingIntent> arrayList2 = new ArrayList<>();
        int i3 = 0;
        while (i3 < divideMessage.size()) {
            Intent intent3 = new Intent(this._extContext.getActivity(), SMSDeliveryReceiver.class);
            intent3.setAction(SMSDeliveryReceiver.SMS_DELIVERED_PART);
            StringBuilder sb = new StringBuilder("dtme://");
            sb.append(sms.id);
            sb.append(".");
            SmsManager smsManager = smsManagerForSubscriptionId;
            sb.append(Integer.toString(i3));
            intent3.setData(Uri.parse(sb.toString()));
            intent3.putExtra("id", sms.id);
            intent3.putExtra("address", sms.address);
            intent3.putExtra(MessageManager.NAME_ERROR_MESSAGE, sms.message);
            if (sms.scAddress != null) {
                intent3.putExtra("scAddress", sms.scAddress);
            }
            intent3.putExtra("partIndex", i3);
            ArrayList<PendingIntent> arrayList3 = arrayList;
            intent3.putExtra("totalParts", divideMessage.size());
            arrayList2.add(PendingIntent.getBroadcast(this._extContext.getActivity(), 0, intent3, i2));
            Intent intent4 = new Intent(this._extContext.getActivity(), SMSSentReceiver.class);
            intent4.setAction(SMSSentReceiver.SMS_SENT_PART);
            intent4.setData(Uri.parse("dtme://" + sms.id + "." + Integer.toString(i3)));
            intent4.putExtra("id", sms.id);
            intent4.putExtra("address", sms.address);
            intent4.putExtra(MessageManager.NAME_ERROR_MESSAGE, sms.message);
            if (sms.scAddress != null) {
                intent4.putExtra("scAddress", sms.scAddress);
            }
            intent4.putExtra("partIndex", i3);
            intent4.putExtra("totalParts", divideMessage.size());
            arrayList3.add(PendingIntent.getBroadcast(this._extContext.getActivity(), 0, intent4, i2));
            i3++;
            smsManagerForSubscriptionId = smsManager;
            arrayList = arrayList3;
        }
        smsManagerForSubscriptionId.sendMultipartTextMessage(sms.address, sms.scAddress, divideMessage, arrayList, arrayList2);
        return true;
    }

    public boolean sendSMSWithUI(SMS sms, boolean z) {
        Logger.d(TAG, "sendSMSWithUI( [%s, %s, %s] )", sms.id, sms.address, sms.message);
        Intent intent = new Intent();
        intent.setData(Uri.parse("sms:" + sms.address));
        if (sms.id.length() > 0) {
            intent.putExtra("id", sms.id);
        }
        intent.putExtra("address", sms.address);
        intent.setAction("android.intent.action.SENDTO");
        intent.putExtra("sms_body", sms.message);
        if (z) {
            this._extContext.getActivity().startActivity(Intent.createChooser(intent, "Send message"));
        } else {
            String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(this._extContext.getActivity());
            if (defaultSmsPackage != null) {
                intent.setPackage(defaultSmsPackage);
            }
            this._extContext.getActivity().startActivity(intent);
        }
        return true;
    }

    public void registerSMSReceivers() {
        if (this._smsSentReceiver == null) {
            this._smsSentReceiver = new SMSSentReceiver(this._extContext);
            IntentFilter intentFilter = new IntentFilter(SMSSentReceiver.SMS_SENT);
            intentFilter.addDataScheme("dtme");
            this._extContext.getActivity().registerReceiver(this._smsSentReceiver, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter(SMSSentReceiver.SMS_SENT_PART);
            intentFilter2.addDataScheme("dtme");
            this._extContext.getActivity().registerReceiver(this._smsSentReceiver, intentFilter2);
        }
        if (this._smsDeliveredReceiver == null) {
            this._smsDeliveredReceiver = new SMSDeliveryReceiver(this._extContext);
            IntentFilter intentFilter3 = new IntentFilter(SMSDeliveryReceiver.SMS_DELIVERED);
            intentFilter3.addDataScheme("dtme");
            this._extContext.getActivity().registerReceiver(this._smsDeliveredReceiver, intentFilter3);
            IntentFilter intentFilter4 = new IntentFilter(SMSDeliveryReceiver.SMS_DELIVERED_PART);
            intentFilter4.addDataScheme("dtme");
            this._extContext.getActivity().registerReceiver(this._smsDeliveredReceiver, intentFilter4);
        }
    }

    public void unregisterSMSReceivers() {
        if (this._smsSentReceiver != null) {
            this._extContext.getActivity().unregisterReceiver(this._smsSentReceiver);
            this._smsSentReceiver = null;
        }
        if (this._smsDeliveredReceiver != null) {
            this._extContext.getActivity().unregisterReceiver(this._smsDeliveredReceiver);
            this._smsDeliveredReceiver = null;
        }
    }
}
