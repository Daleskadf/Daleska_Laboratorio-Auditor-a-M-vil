package com.distriqt.extension.share.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import com.distriqt.extension.share.ShareExtension;
import com.distriqt.extension.share.events.SMSEvent;
import com.distriqt.extension.share.utils.Logger;
/* loaded from: classes.dex */
public class SMSReceiver extends BroadcastReceiver {
    public static final String SMS_EXTRA_NAME = "pdus";
    public static final String SMS_RECEIVED_ACTION = "android.provider.Telephony.SMS_RECEIVED";
    public static final String TAG = "SMSReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        String str = TAG;
        Logger.d(str, "onReceive", new Object[0]);
        if (!SMS_RECEIVED_ACTION.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return;
        }
        int i = extras.getInt("slot", -1);
        int i2 = extras.getInt("subscription", -1);
        Logger.d(str, "onReceive: slot:%d subscriptionId:%d", Integer.valueOf(i), Integer.valueOf(i2));
        for (Object obj : (Object[]) extras.get(SMS_EXTRA_NAME)) {
            SmsMessage createFromPdu = SmsMessage.createFromPdu((byte[]) obj);
            createFromPdu.getIndexOnIcc();
            ShareExtension.dispatchEvent(SMSEvent.MESSAGE_SMS_RECEIVED, SMSEvent.formatSMSForEvent("", createFromPdu.getOriginatingAddress(), createFromPdu.getMessageBody(), createFromPdu.getServiceCenterAddress(), null, i2));
        }
    }
}
