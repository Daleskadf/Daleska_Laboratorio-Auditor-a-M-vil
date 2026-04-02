package com.distriqt.extension.firebase.functions.analytics;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.firebase.FirebaseContext;
import com.distriqt.extension.firebase.analytics.EventObject;
import com.distriqt.extension.firebase.utils.Errors;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class LogEventFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            FirebaseContext firebaseContext = (FirebaseContext) fREContext;
            boolean z = false;
            if (firebaseContext.v) {
                JSONObject jSONObject = new JSONObject(fREObjectArr[0].getAsString());
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                EventObject eventObject = new EventObject();
                eventObject.name = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        eventObject.params.putString(next, (String) obj);
                    } else if (obj instanceof Double) {
                        eventObject.params.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        eventObject.params.putDouble(next, ((Float) obj).floatValue());
                    } else if (obj instanceof Integer) {
                        eventObject.params.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        eventObject.params.putBoolean(next, ((Boolean) obj).booleanValue());
                    }
                }
                z = firebaseContext.controller().analytics().logEvent(eventObject);
            }
            return FREObject.newObject(z);
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }
}
