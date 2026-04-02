package com.distriqt.extension.share.events;

import android.content.Intent;
import android.os.Bundle;
import com.distriqt.extension.share.utils.Errors;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ApplicationEvent {
    public static final String ACTIVITY_RESULT = "activity:result";

    public static String formatForEvent(int i, Intent intent) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", i);
            if (intent != null && intent.getExtras() != null) {
                JSONObject jSONObject2 = new JSONObject();
                Bundle extras = intent.getExtras();
                for (String str : extras.keySet()) {
                    try {
                        jSONObject2.put(str, extras.get(str));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                jSONObject.put("data", jSONObject2);
            }
            return jSONObject.toString();
        } catch (Exception e2) {
            Errors.handleException(e2);
            return "{}";
        }
    }
}
