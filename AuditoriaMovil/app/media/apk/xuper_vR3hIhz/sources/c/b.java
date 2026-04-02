package c;

import android.content.Context;
import android.content.Intent;
import c.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class b extends a {
    public static Intent e(String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // c.a
    /* renamed from: d */
    public Intent a(Context context, String[] strArr) {
        return e(strArr);
    }

    @Override // c.a
    /* renamed from: f */
    public a.C0077a b(Context context, String[] strArr) {
        boolean z10;
        if (strArr != null && strArr.length != 0) {
            androidx.collection.a aVar = new androidx.collection.a();
            boolean z11 = true;
            for (String str : strArr) {
                if (p.a.checkSelfPermission(context, str) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.put(str, Boolean.valueOf(z10));
                if (!z10) {
                    z11 = false;
                }
            }
            if (z11) {
                return new a.C0077a(aVar);
            }
            return null;
        }
        return new a.C0077a(Collections.emptyMap());
    }

    @Override // c.a
    /* renamed from: g */
    public Map c(int i10, Intent intent) {
        boolean z10;
        if (i10 != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra != null && stringArrayExtra != null) {
            HashMap hashMap = new HashMap();
            int length = stringArrayExtra.length;
            for (int i11 = 0; i11 < length; i11++) {
                String str = stringArrayExtra[i11];
                if (intArrayExtra[i11] == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hashMap.put(str, Boolean.valueOf(z10));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
