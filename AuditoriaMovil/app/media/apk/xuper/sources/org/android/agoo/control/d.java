package org.android.agoo.control;

import android.text.TextUtils;
import com.hpplay.cybergarage.xml.XML;
import com.hpplay.sdk.source.common.global.Constant;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.message.MessageService;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ byte[] f17844a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f17845b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AgooFactory f17846c;

    public d(AgooFactory agooFactory, byte[] bArr, boolean z10) {
        this.f17846c = agooFactory;
        this.f17844a = bArr;
        this.f17845b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        MessageService messageService;
        MessageService messageService2;
        try {
            String str2 = new String(this.f17844a, XML.CHARSET_UTF8);
            if (TextUtils.isEmpty(str2)) {
                com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "msg==null", 0.0d);
                return;
            }
            ALog.i("AgooFactory", "message = " + str2, new Object[0]);
            JSONObject jSONObject = new JSONObject(str2);
            String string = jSONObject.getString("api");
            String string2 = jSONObject.getString("id");
            if (TextUtils.equals(string, "agooReport")) {
                str = jSONObject.getString(Constant.KEY_STATUS);
            } else {
                str = null;
            }
            if (TextUtils.equals(string, AgooConstants.AGOO_SERVICE_AGOOACK)) {
                com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, "handlerACKMessage", 0.0d);
            }
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(str)) {
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.i("AgooFactory", "updateMsg data begin,api=" + string + ",id=" + string2 + ",status=" + str + ",reportTimes=" + Config.f(AgooFactory.mContext), new Object[0]);
                }
                if (TextUtils.equals(string, "agooReport")) {
                    if (TextUtils.equals(str, "4") && this.f17845b) {
                        messageService2 = this.f17846c.messageService;
                        messageService2.a(string2, "1");
                    } else if ((TextUtils.equals(str, MessageService.MSG_ACCS_NOTIFY_CLICK) || TextUtils.equals(str, MessageService.MSG_ACCS_NOTIFY_DISMISS)) && this.f17845b) {
                        messageService = this.f17846c.messageService;
                        messageService.a(string2, "100");
                    }
                    com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, str, 0.0d);
                    return;
                }
                return;
            }
            com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "json key null", 0.0d);
        } catch (Throwable th) {
            ALog.e("AgooFactory", "updateMsg get data error,e=" + th, new Object[0]);
            com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "json exception", 0.0d);
        }
    }
}
