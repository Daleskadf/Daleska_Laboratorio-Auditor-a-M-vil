package b4;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import h3.AbstractC1079a;
import java.util.HashMap;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f8198a;

    static {
        HashMap hashMap = new HashMap();
        f8198a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                HashMap hashMap = f8198a;
                if (hashMap.containsKey(string)) {
                    return AbstractC1079a.y(((String) hashMap.get(string)) + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + string2);
                }
            }
            return AbstractC1079a.y("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e7) {
            String localizedMessage = e7.getLocalizedMessage();
            return AbstractC1079a.y("WEB_INTERNAL_ERROR:" + str + "[ " + localizedMessage + " ]");
        }
    }
}
