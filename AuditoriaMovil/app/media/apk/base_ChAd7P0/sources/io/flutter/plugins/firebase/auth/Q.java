package io.flutter.plugins.firebase.auth;

import java.util.HashMap;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class Q extends a4.y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ S f11830a;

    public Q(S s7) {
        this.f11830a = s7;
    }

    @Override // a4.y
    public final void onCodeAutoRetrievalTimeOut(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("verificationId", str);
        hashMap.put("name", "Auth#phoneCodeAutoRetrievalTimeout");
        L5.h hVar = this.f11830a.f11840e0;
        if (hVar != null) {
            hVar.c(hashMap);
        }
    }

    @Override // a4.y
    public final void onCodeSent(String str, a4.x xVar) {
        int hashCode = xVar.hashCode();
        S.f11831f0.put(Integer.valueOf(hashCode), xVar);
        HashMap hashMap = new HashMap();
        hashMap.put("verificationId", str);
        hashMap.put("forceResendingToken", Integer.valueOf(hashCode));
        hashMap.put("name", "Auth#phoneCodeSent");
        L5.h hVar = this.f11830a.f11840e0;
        if (hVar != null) {
            hVar.c(hashMap);
        }
    }

    @Override // a4.y
    public final void onVerificationCompleted(a4.v vVar) {
        int hashCode = vVar.hashCode();
        S s7 = this.f11830a;
        s7.f.getClass();
        HashMap hashMap = C1140c.f11846Z;
        C1140c.f11846Z.put(Integer.valueOf(vVar.hashCode()), vVar);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("token", Integer.valueOf(hashCode));
        String str = vVar.f7049b;
        if (str != null) {
            hashMap2.put("smsCode", str);
        }
        hashMap2.put("name", "Auth#phoneVerificationCompleted");
        L5.h hVar = s7.f11840e0;
        if (hVar != null) {
            hVar.c(hashMap2);
        }
    }

    @Override // a4.y
    public final void onVerificationFailed(U3.i iVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        r J5 = org.slf4j.helpers.i.J(iVar);
        hashMap2.put("code", J5.f11890a.replaceAll("ERROR_", StringUtils.EMPTY).toLowerCase(Locale.ROOT).replaceAll("_", "-"));
        hashMap2.put("message", J5.getMessage());
        hashMap2.put("details", J5.f11891b);
        hashMap.put("error", hashMap2);
        hashMap.put("name", "Auth#phoneVerificationFailed");
        L5.h hVar = this.f11830a.f11840e0;
        if (hVar != null) {
            hVar.c(hashMap);
        }
    }
}
