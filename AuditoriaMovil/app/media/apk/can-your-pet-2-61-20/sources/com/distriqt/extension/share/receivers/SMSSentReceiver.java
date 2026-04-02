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
public class SMSSentReceiver extends BroadcastReceiver {
    public static final String SMS_SENT = "com.distriqt.extension.message.SMS_SENT";
    public static final String SMS_SENT_PART = "com.distriqt.extension.message.SMS_SENT_PART";
    public static final String TAG = "SMSSentReceiver";
    private HashMap<String, ArrayList<Integer>> _received = new HashMap<>();

    public SMSSentReceiver(IExtensionContext iExtensionContext) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("partIndex", -1);
        int intExtra2 = intent.getIntExtra("totalParts", -1);
        String stringExtra = intent.getStringExtra("id");
        String stringExtra2 = intent.getStringExtra("address");
        String stringExtra3 = intent.getStringExtra(MessageManager.NAME_ERROR_MESSAGE);
        String stringExtra4 = intent.getStringExtra("scAddress");
        if (intent.getAction().equals(SMS_SENT)) {
            Logger.d(TAG, "Sent :: [%s] %s :: %s", stringExtra, stringExtra2, stringExtra3);
            int resultCode = getResultCode();
            if (resultCode == -1) {
                ShareExtension.dispatchEvent(SMSEvent.MESSAGE_SMS_SENT, SMSEvent.formatSMSForEvent(stringExtra, stringExtra2, stringExtra3, stringExtra4));
            } else if (resultCode == 1) {
                ShareExtension.dispatchEvent(SMSEvent.MESSAGE_SMS_SENT_ERROR, SMSEvent.formatSMSForEvent(stringExtra, stringExtra2, stringExtra3, stringExtra4, "generic_failure"));
            } else if (resultCode == 2) {
                ShareExtension.dispatchEvent(SMSEvent.MESSAGE_SMS_SENT_ERROR, SMSEvent.formatSMSForEvent(stringExtra, stringExtra2, stringExtra3, stringExtra4, "radio_off"));
            } else if (resultCode == 3) {
                ShareExtension.dispatchEvent(SMSEvent.MESSAGE_SMS_SENT_ERROR, SMSEvent.formatSMSForEvent(stringExtra, stringExtra2, stringExtra3, stringExtra4, "null_pdu"));
            } else if (resultCode != 4) {
            } else {
                ShareExtension.dispatchEvent(SMSEvent.MESSAGE_SMS_SENT_ERROR, SMSEvent.formatSMSForEvent(stringExtra, stringExtra2, stringExtra3, stringExtra4, "no_service"));
            }
        } else if (intent.getAction().equals(SMS_SENT_PART)) {
            Logger.d(TAG, "Sent part %d / %d :: [%s] %s :: %s", Integer.valueOf(intExtra + 1), Integer.valueOf(intExtra2), stringExtra, stringExtra2, stringExtra3);
            ArrayList<Integer> arrayList = this._received.get(stringExtra);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(Integer.valueOf(intExtra));
            this._received.put(stringExtra, arrayList);
            if (arrayList.size() == intExtra2) {
                int resultCode2 = getResultCode();
                if (resultCode2 == -1) {
                    ShareExtension.dispatchEvent(SMSEvent.MESSAGE_SMS_SENT, SMSEvent.formatSMSForEvent(stringExtra, stringExtra2, stringExtra3, stringExtra4));
                } else if (resultCode2 == 1) {
                    ShareExtension.dispatchEvent(SMSEvent.MESSAGE_SMS_SENT_ERROR, SMSEvent.formatSMSForEvent(stringExtra, stringExtra2, stringExtra3, stringExtra4, "generic_failure"));
                } else if (resultCode2 == 2) {
                    ShareExtension.dispatchEvent(SMSEvent.MESSAGE_SMS_SENT_ERROR, SMSEvent.formatSMSForEvent(stringExtra, stringExtra2, stringExtra3, stringExtra4, "radio_off"));
                } else if (resultCode2 == 3) {
                    ShareExtension.dispatchEvent(SMSEvent.MESSAGE_SMS_SENT_ERROR, SMSEvent.formatSMSForEvent(stringExtra, stringExtra2, stringExtra3, stringExtra4, "null_pdu"));
                } else if (resultCode2 == 4) {
                    ShareExtension.dispatchEvent(SMSEvent.MESSAGE_SMS_SENT_ERROR, SMSEvent.formatSMSForEvent(stringExtra, stringExtra2, stringExtra3, stringExtra4, "no_service"));
                }
                this._received.remove(stringExtra);
            }
        }
    }
}
