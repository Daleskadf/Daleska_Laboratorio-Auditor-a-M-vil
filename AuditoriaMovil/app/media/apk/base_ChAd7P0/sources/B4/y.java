package b4;

import a4.C0468q;
import com.google.android.gms.internal.p002firebaseauthapi.zzzp;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public static final Z2.a f8305a = new Z2.a("GetTokenResultFactory", new String[0]);

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, a4.q] */
    public static C0468q a(String str) {
        Map hashMap;
        try {
            hashMap = x.c(str);
        } catch (zzzp e7) {
            f8305a.b("Error parsing token claims", e7, new Object[0]);
            hashMap = new HashMap();
        }
        ?? obj = new Object();
        obj.f7043a = str;
        obj.f7044b = hashMap;
        return obj;
    }
}
