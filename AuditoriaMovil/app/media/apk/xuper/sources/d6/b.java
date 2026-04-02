package d6;

import android.content.Context;
import ba.t;
import c2.d;
import com.google.android.gms.common.Scopes;
import com.hpplay.component.protocol.push.IPushHandler;
import com.hpplay.sdk.source.bean.DramaInfoBean;
import com.mobile.brasiltv.bean.MemberInfo;
import com.mobile.brasiltv.bean.event.LoginSuccessEvent;
import com.mobile.brasiltv.bean.event.RequestAuthAndSlbEvent;
import com.mobile.brasiltv.bean.event.UpdateMineViewEvent;
import com.mobile.brasiltv.bean.event.UpdateRestrictEvent;
import com.mobile.brasiltv.bean.event.UserIdentityChangeEvent;
import com.mobile.brasiltv.utils.b0;
import com.umeng.analytics.pro.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import mobile.com.requestframe.utils.response.AuthInfo;
import mobile.com.requestframe.utils.response.UserData;
import na.e;
import w6.i;
import w6.l;
import xa.c;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f12660a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static AuthInfo f12661b;

    /* renamed from: c  reason: collision with root package name */
    public static AuthInfo f12662c;

    /* renamed from: d  reason: collision with root package name */
    public static AuthInfo f12663d;

    public static /* synthetic */ void G(b bVar, Context context, UserData userData, String str, String str2, String str3, String str4, String str5, boolean z10, int i10, Object obj) {
        String str6;
        String str7;
        String str8;
        boolean z11;
        if ((i10 & 16) != 0) {
            str6 = "";
        } else {
            str6 = str3;
        }
        if ((i10 & 32) != 0) {
            str7 = "";
        } else {
            str7 = str4;
        }
        if ((i10 & 64) != 0) {
            str8 = "";
        } else {
            str8 = str5;
        }
        if ((i10 & 128) != 0) {
            z11 = true;
        } else {
            z11 = z10;
        }
        bVar.F(context, userData, str, str2, str6, str7, str8, z11);
    }

    public final void A() {
        i.c cVar = i.f19214g;
        cVar.x0("");
        cVar.y0("");
        cVar.O("");
        cVar.t0("");
        cVar.b0("");
        cVar.j0("");
        cVar.d0("");
        cVar.q();
        cVar.T("");
        cVar.V("");
        cVar.U("");
        l.f19260a.e(0);
        e.f17345e = "";
        f12661b = null;
        f12662c = null;
        f12663d = null;
    }

    public final void B(List list) {
        boolean z10;
        f12661b = null;
        f12662c = null;
        f12663d = null;
        if (list != null && !list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AuthInfo authInfo = (AuthInfo) it.next();
            if (!b0.J(authInfo.getServiceType()) && !t9.i.b(authInfo.getServiceType(), "vip")) {
                if (t9.i.b(authInfo.getServiceType(), "quality")) {
                    f12662c = authInfo;
                } else if (t9.i.b(authInfo.getServiceType(), DramaInfoBean.CATEGORY_SUPER)) {
                    f12663d = authInfo;
                }
            } else {
                f12661b = authInfo;
            }
        }
    }

    public final void C(UserData userData) {
        String str;
        c c10 = c.c();
        if (userData != null) {
            str = userData.getHeartBeatTime();
        } else {
            str = null;
        }
        c10.j(new LoginSuccessEvent(str));
        c.c().j(new UserIdentityChangeEvent());
        c.c().m(new UpdateMineViewEvent());
        c.c().m(new RequestAuthAndSlbEvent(false, userData));
    }

    public final void D(HashMap hashMap) {
    }

    public final void E(Context context, String str) {
        t9.i.g(context, f.X);
        t9.i.g(str, "loginType");
        na.f.k(context, "accountType", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(android.content.Context r6, mobile.com.requestframe.utils.response.UserData r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.b.F(android.content.Context, mobile.com.requestframe.utils.response.UserData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public final void H(UserData userData) {
        t9.i.g(userData, "data");
        i.c cVar = i.f19214g;
        if (!t9.i.b(cVar.A(), "") && !t9.i.b(userData.getRestrictedStatus(), cVar.A())) {
            c.c().m(new UpdateRestrictEvent(userData.getRestrictedStatus(), false, 2, null));
        }
    }

    public final void I(Context context, String str, String str2) {
        t9.i.g(context, f.X);
        t9.i.g(str, "thirdPartType");
        t9.i.g(str2, "authCode");
        na.f.k(context, "tp_type", str);
        na.f.k(context, "tp_google_auth_code", str2);
    }

    public final boolean a() {
        return b0.T(i.f19214g.s(), "1");
    }

    public final boolean b() {
        return b0.T(i.f19214g.h(), "1");
    }

    public final boolean c() {
        return b0.T(i.f19214g.i(), "2");
    }

    public final boolean d() {
        return b0.T(i.f19214g.j(), "1");
    }

    public final void e(Context context) {
        t9.i.g(context, f.X);
        r5.i.f18523a.u();
        i.c cVar = i.f19214g;
        cVar.x0("");
        cVar.y0("1");
        cVar.O("");
        cVar.t0("");
        cVar.b0("");
        cVar.j0("");
        cVar.d0("");
        cVar.q();
        cVar.T("");
        cVar.V("");
        cVar.U("");
        cVar.f0(false);
        cVar.X(false);
        cVar.r0(0);
        MemberInfo memberInfo = MemberInfo.INSTANCE;
        memberInfo.putUserName("");
        memberInfo.putPassword("", false);
        na.f.k(context, "accountType", "");
        na.f.k(context, "verification_token", "");
        na.f.k(context, "qr_auth_code", "");
        I(context, "", "");
        na.f.k(context, "lastest_input_bind_email", "");
        l.a aVar = l.f19260a;
        aVar.e(aVar.d() & (aVar.a() ^ (-1)));
        aVar.e(aVar.d() | aVar.b());
        e.f17345e = "";
        c2.i.f5350q.a().E("", cVar.l());
    }

    public final void f() {
        HashMap hashMap = new HashMap();
        hashMap.put(IPushHandler.STATE, "1");
        D(hashMap);
        d.f5311a.j(hashMap);
    }

    public final String g(String str) {
        if (b0.J(str) || b0.T(str, "1") || b0.T(str, "2")) {
            String lastUserName = MemberInfo.INSTANCE.getLastUserName();
            if (b0.K(lastUserName)) {
                if (t.o(lastUserName, "@", false, 2, null)) {
                    return "2";
                }
                return "1";
            }
            return str;
        }
        return str;
    }

    public final void h(Context context) {
        t9.i.g(context, f.X);
        String e10 = na.f.e(context, "accountType");
        t9.i.f(e10, "loginType");
        String g10 = g(e10);
        if (b0.T(g10, e10)) {
            return;
        }
        na.f.k(context, "accountType", g10);
    }

    public final String i(Context context) {
        if (context == null) {
            return null;
        }
        return na.f.g(context, "feedback_email");
    }

    public final String j(Context context) {
        t9.i.g(context, f.X);
        String e10 = na.f.e(context, "accountType");
        t9.i.f(e10, "loginType");
        String g10 = g(e10);
        t9.i.f(g10, "loginType");
        return g10;
    }

    public final String k(Context context) {
        t9.i.g(context, f.X);
        String e10 = na.f.e(context, "tp_google_auth_code");
        t9.i.f(e10, "getStrings(context, Constant.TP_G_AUTH_CODE)");
        return e10;
    }

    public final String l() {
        return i.f19214g.H();
    }

    public final String m(Context context) {
        t9.i.g(context, f.X);
        if (v(context) && b0.K(k(context))) {
            return k(context);
        }
        if (t9.i.b(na.f.e(context, "accountType"), "7")) {
            return na.f.e(context, "qr_auth_code");
        }
        return MemberInfo.INSTANCE.getLastUserName();
    }

    public final String n() {
        String expInvalidTime;
        AuthInfo authInfo = f12661b;
        if (authInfo == null || (expInvalidTime = authInfo.getExpInvalidTime()) == null) {
            return "";
        }
        return expInvalidTime;
    }

    public final String o() {
        String invalidTime;
        AuthInfo authInfo = f12661b;
        if (authInfo == null || (invalidTime = authInfo.getInvalidTime()) == null) {
            return "";
        }
        return invalidTime;
    }

    public final boolean p() {
        return t9.i.b(i.f19214g.I(), "3");
    }

    public final boolean q() {
        return t9.i.b(i.f19214g.I(), "2");
    }

    public final boolean r() {
        boolean z10;
        i.c cVar = i.f19214g;
        if (!t9.i.b(cVar.H(), cVar.l())) {
            return false;
        }
        if (cVar.H().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public final boolean s(Context context, String str) {
        t9.i.g(context, f.X);
        t9.i.g(str, "matchLoginType");
        return b0.T(j(context), str);
    }

    public final boolean t() {
        i.c cVar = i.f19214g;
        if (b0.T(cVar.i(), "1") && b0.T(cVar.h(), "0") && b0.T(cVar.j(), "0") && b0.T(cVar.H(), cVar.l())) {
            return true;
        }
        return false;
    }

    public final boolean u(Context context) {
        t9.i.g(context, f.X);
        return t9.i.b(j(context), "7");
    }

    public final boolean v(Context context) {
        t9.i.g(context, f.X);
        String j10 = j(context);
        if (!t9.i.b(j10, "google") && !t9.i.b(j10, "facebook")) {
            return false;
        }
        return true;
    }

    public final boolean w() {
        return t9.i.b(i.f19214g.c(), "1");
    }

    public final boolean x() {
        return t9.i.b(i.f19214g.I(), "4");
    }

    public final boolean y() {
        return t9.i.b(i.f19214g.I(), "1");
    }

    public final void z(Context context, String str) {
        t9.i.g(str, Scopes.EMAIL);
        if (context == null) {
            return;
        }
        na.f.l(context, "feedback_email", str);
    }
}
