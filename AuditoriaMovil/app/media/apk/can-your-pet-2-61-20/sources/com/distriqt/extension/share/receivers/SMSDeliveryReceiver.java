package com.distriqt.extension.share.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.adobe.air.wand.message.MessageManager;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.share.ShareExtension;
import com.distriqt.extension.share.events.SMSEvent;
import com.distriqt.extension.share.utils.Logger;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public class SMSDeliveryReceiver extends BroadcastReceiver {
    public static final String SMS_DELIVERED = "com.distriqt.extension.message.SMS_DELIVERED";
    public static final String SMS_DELIVERED_PART = "com.distriqt.extension.message.SMS_DELIVERED_PART";
    public static final String TAG = "SMSDeliveryReceiver";
    private HashMap<String, ArrayList<Integer>> _received = new HashMap<>();

    public SMSDeliveryReceiver(IExtensionContext iExtensionContext) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("partIndex", -1);
        int intExtra2 = intent.getIntExtra("totalParts", -1);
        String stringExtra = intent.getStringExtra("id");
        String stringExtra2 = intent.getStringExtra("address");
        String stringExtra3 = intent.getStringExtra(MessageManager.NAME_ERROR_MESSAGE);
        String stringExtra4 = intent.getStringExtra("scAddress");
        if (intent.getAction().equals(SMS_DELIVERED)) {
            Logger.d(TAG, "Delivered :: [%s] %s :: %s", stringExtra, stringExtra2, stringExtra3);
            if (getResultCode() == -1) {
                ShareExtension.dispatchEvent(SMSEvent.MESSAGE_SMS_DELIVERED, SMSEvent.formatSMSForEvent(stringExtra, stringExtra2, stringExtra3, stringExtra4));
            } else {
                ShareExtension.dispatchEvent(SMSEvent.MESSAGE_SMS_NOT_DELIVERED, SMSEvent.formatSMSForEvent(stringExtra, stringExtra2, stringExtra3, stringExtra4));
            }
        } else if (intent.getAction().equals(SMS_DELIVERED_PART)) {
            Logger.d(TAG, "Delivered part %d / %d :: [%s] %s :: %s", Integer.valueOf(intExtra + 1), Integer.valueOf(intExtra2), stringExtra, stringExtra2, stringExtra3);
            ArrayList<Integer> arrayList = this._received.get(stringExtra);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(Integer.valueOf(intExtra));
            this._received.put(stringExtra, arrayList);
            if (arrayList.size() == intExtra2) {
                if (getResultCode() == -1) {
                    ShareExtension.dispatchEvent(SMSEvent.MESSAGE_SMS_DELIVERED, SMSEvent.formatSMSForEvent(stringExtra, stringExtra2, stringExtra3, stringExtra4));
                } else {
                    ShareExtension.dispatchEvent(SMSEvent.MESSAGE_SMS_NOT_DELIVERED, SMSEvent.formatSMSForEvent(stringExtra, stringExtra2, stringExtra3, stringExtra4));
                }
                this._received.remove(stringExtra);
            }
        }
    }
}
