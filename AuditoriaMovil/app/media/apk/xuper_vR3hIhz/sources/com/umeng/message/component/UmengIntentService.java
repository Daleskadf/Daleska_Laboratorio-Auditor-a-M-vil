package com.umeng.message.component;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.taobao.agoo.TaobaoBaseIntentService;
import com.umeng.message.UTrack;
import com.umeng.message.common.UPLog;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.bb;
import com.umeng.message.proguard.f;
import com.umeng.message.proguard.r;
import com.umeng.message.proguard.v;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class UmengIntentService extends TaobaoBaseIntentService {
    @Override // org.android.agoo.control.BaseIntentService, android.app.Service
    public final IBinder onBind(Intent intent) {
        try {
            return super.onBind(intent);
        } catch (Throwable th) {
            UPLog.e("IntentService", th);
            return null;
        }
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService, org.android.agoo.control.BaseIntentService
    public final void onError(Context context, String str) {
        UPLog.e("IntentService", "onError msg:", str);
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService, org.android.agoo.control.BaseIntentService
    public final void onMessage(Context context, Intent intent) {
        Class<?> cls;
        JSONObject optJSONObject;
        try {
            UPLog.i("IntentService", "onMessage");
            String stringExtra = intent.getStringExtra("body");
            String stringExtra2 = intent.getStringExtra("id");
            String stringExtra3 = intent.getStringExtra(AgooConstants.MESSAGE_TASK_ID);
            if (stringExtra == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject(stringExtra);
            jSONObject.put("agoo_msg_id", stringExtra2);
            jSONObject.put("agoo_task_id", stringExtra3);
            UMessage uMessage = new UMessage(jSONObject);
            bb.a(context).a(uMessage.getMsgId(), 0, System.currentTimeMillis());
            UTrack.getInstance().trackMsgArrival(uMessage);
            if (TextUtils.equals("ad", uMessage.getDisplayType())) {
                String custom = uMessage.getCustom();
                if (custom != null && custom.length() > 0 && (optJSONObject = new JSONObject(custom).optJSONObject("id_res")) != null) {
                    f.a(context, optJSONObject.optString("id"), optJSONObject.optLong("d_ts", 0L));
                    return;
                }
                return;
            }
            UPLog.i("IntentService", "message:", jSONObject);
            Intent intent2 = new Intent("com.umeng.message.action");
            intent2.setPackage(context.getPackageName());
            intent2.putExtra("um_command", "handle");
            intent2.putExtra("body", uMessage.getRaw().toString());
            String pushIntentServiceClass = v.a().getPushIntentServiceClass();
            if (!TextUtils.isEmpty(pushIntentServiceClass)) {
                cls = Class.forName(pushIntentServiceClass);
            } else {
                cls = null;
            }
            if (cls == null) {
                cls = UmengMessageHandlerService.class;
            }
            intent2.setClass(context, cls);
            r.enqueueWork(context, cls, intent2);
        } catch (Throwable th) {
            UPLog.e("IntentService", th);
        }
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService, org.android.agoo.control.BaseIntentService
    public final void onRegistered(Context context, String str) {
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService
    public final void onUnregistered(Context context, String str) {
    }
}
