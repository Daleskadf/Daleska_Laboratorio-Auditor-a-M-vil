package b4;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzv;
import com.google.android.gms.internal.p002firebaseauthapi.zzzp;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public static final Z2.a f8304a = new Z2.a("JSONParser", new String[0]);

    /* JADX WARN: Type inference failed for: r0v0, types: [S.k, S.f] */
    public static S.f a(JSONObject jSONObject) {
        ?? kVar = new S.k(0);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = b((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = a((JSONObject) obj);
            }
            kVar.put(next, obj);
        }
        return kVar;
    }

    public static ArrayList b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object obj = jSONArray.get(i7);
            if (obj instanceof JSONArray) {
                obj = b((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = a((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map c(String str) {
        byte[] decode;
        com.google.android.gms.common.internal.I.e(str);
        List<String> zza = zzv.zza('.').zza((CharSequence) str);
        int size = zza.size();
        Z2.a aVar = f8304a;
        if (size < 2) {
            aVar.c(io.flutter.plugins.pathprovider.b.h("Invalid idToken ", str), new Object[0]);
            return new HashMap();
        }
        String str2 = zza.get(1);
        try {
            if (str2 == null) {
                decode = null;
            } else {
                decode = Base64.decode(str2, 11);
            }
            S.f d7 = d(new String(decode, "UTF-8"));
            if (d7 == null) {
                return new HashMap();
            }
            return d7;
        } catch (UnsupportedEncodingException e7) {
            aVar.b("Unable to decode token", e7, new Object[0]);
            return new HashMap();
        }
    }

    public static S.f d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject == JSONObject.NULL) {
                return null;
            }
            return a(jSONObject);
        } catch (Exception e7) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzzp(e7);
        }
    }
}
