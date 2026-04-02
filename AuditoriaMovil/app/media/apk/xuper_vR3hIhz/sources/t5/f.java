package t5;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.mobile.brasiltv.db.MobileDao;
import com.mobile.brasiltv.db.SwitchAccountBean;
import com.mobile.brasiltv.mine.activity.ForceChangePwdAty;
import com.mobile.brasiltv.utils.b0;
import com.mobile.brasiltv.utils.f1;
import com.mobile.brasiltv.utils.x;
import com.mobile.brasiltv.utils.y;
import com.titans.entity.CdnType;
import h9.t;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.List;
import ma.q;
import mobile.com.requestframe.utils.bean.LoginThirdPartBean;
import mobile.com.requestframe.utils.response.LoginResult;
import mobile.com.requestframe.utils.response.PortalCodeList;
import mobile.com.requestframe.utils.response.UserData;
import t9.w;
/* loaded from: classes3.dex */
public final class f implements t5.a {

    /* renamed from: a  reason: collision with root package name */
    public s5.b f18857a;

    /* renamed from: b  reason: collision with root package name */
    public t5.a f18858b;

    /* loaded from: classes3.dex */
    public static final class a extends ha.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ u8.a f18860b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ s5.e f18861c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ SwitchAccountBean f18862d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ w f18863e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w f18864f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ String f18865g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ String f18866h;

        /* renamed from: t5.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0323a extends t9.j implements s9.l {

            /* renamed from: a  reason: collision with root package name */
            public static final C0323a f18867a = new C0323a();

            public C0323a() {
                super(1);
            }

            @Override // s9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return t.f14242a;
            }

            public final void invoke(String str) {
                f1.f8649a.x(y.p(y.f8771a, "CUSTOM_NO_ASSOCIATED_PORTAL", null, null, 6, null));
            }
        }

        /* loaded from: classes3.dex */
        public static final class b extends t9.j implements s9.l {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f18868a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(1);
                this.f18868a = str;
            }

            @Override // s9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return t.f14242a;
            }

            public final void invoke(String str) {
                y yVar = y.f8771a;
                f1.f8649a.x(y.p(yVar, this.f18868a, yVar.i(), null, 4, null));
            }
        }

        public a(u8.a aVar, s5.e eVar, SwitchAccountBean switchAccountBean, w wVar, w wVar2, String str, String str2) {
            this.f18860b = aVar;
            this.f18861c = eVar;
            this.f18862d = switchAccountBean;
            this.f18863e = wVar;
            this.f18864f = wVar2;
            this.f18865g = str;
            this.f18866h = str2;
        }

        @Override // ha.a, io.reactivex.Observer
        /* renamed from: f */
        public void onNext(LoginResult loginResult) {
            List<PortalCodeList> list;
            String areaCode;
            String str;
            t9.i.g(loginResult, "t");
            f.this.c(this.f18860b, this.f18861c);
            this.f18862d.setLogged(true);
            UserData data = loginResult.getData();
            String str2 = null;
            if (data != null) {
                list = data.getPortalCodeList();
            } else {
                list = null;
            }
            if (b0.I(list)) {
                d6.b bVar = d6.b.f12660a;
                UserData data2 = loginResult.getData();
                t9.i.d(data2);
                bVar.H(data2);
                bVar.E(this.f18860b, (String) this.f18863e.f18961a);
                u8.a aVar = this.f18860b;
                UserData data3 = loginResult.getData();
                t9.i.d(data3);
                d6.b.G(bVar, aVar, data3, (String) this.f18864f.f18961a, this.f18865g, null, null, null, false, 240, null);
                if (!TextUtils.isEmpty((CharSequence) this.f18863e.f18961a)) {
                    UserData data4 = loginResult.getData();
                    if (data4 != null) {
                        str = data4.getPwdTip();
                    } else {
                        str = null;
                    }
                    if (t9.i.b(str, "yes")) {
                        UserData data5 = loginResult.getData();
                        if (data5 != null) {
                            str2 = data5.getHasPwd();
                        }
                        if (t9.i.b(str2, "1")) {
                            this.f18860b.startActivity(new Intent(this.f18860b, ForceChangePwdAty.class));
                            s5.b bVar2 = f.this.f18857a;
                            if (bVar2 != null) {
                                bVar2.q0("4");
                                return;
                            }
                            return;
                        }
                    }
                }
                bVar.C(loginResult.getData());
                this.f18862d.setPassword(this.f18865g);
                SwitchAccountBean switchAccountBean = this.f18862d;
                UserData data6 = loginResult.getData();
                String str3 = "";
                switchAccountBean.setUserId((data6 == null || (r1 = data6.getUserId()) == null) ? "" : "");
                this.f18862d.setAreaCode(this.f18866h);
                SwitchAccountBean switchAccountBean2 = this.f18862d;
                UserData data7 = loginResult.getData();
                switchAccountBean2.setVerificationToken((data7 == null || (r1 = data7.getVerificationToken()) == null) ? "" : "");
                SwitchAccountBean switchAccountBean3 = this.f18862d;
                UserData data8 = loginResult.getData();
                switchAccountBean3.setEmail((data8 == null || (r1 = data8.getEmail()) == null) ? "" : "");
                SwitchAccountBean switchAccountBean4 = this.f18862d;
                UserData data9 = loginResult.getData();
                switchAccountBean4.setPhone((data9 == null || (r1 = data9.getMobile()) == null) ? "" : "");
                SwitchAccountBean switchAccountBean5 = this.f18862d;
                UserData data10 = loginResult.getData();
                if (data10 != null && (areaCode = data10.getAreaCode()) != null) {
                    str3 = areaCode;
                }
                switchAccountBean5.setAreaCode(str3);
                f.this.l(this.f18860b, this.f18862d);
                s5.b bVar3 = f.this.f18857a;
                if (bVar3 != null) {
                    bVar3.q0("0");
                    return;
                }
                return;
            }
            x.f8754a.w(this.f18860b, C0323a.f18867a);
            s5.b bVar4 = f.this.f18857a;
            if (bVar4 != null) {
                bVar4.q0("1");
            }
        }

        @Override // ha.a
        public void showErrorHint(String str) {
            t9.i.g(str, "returnCode");
            b0.U(this, "login fail: " + str);
            if (t9.i.b("aaa100094", str)) {
                s5.b bVar = f.this.f18857a;
                if (bVar != null) {
                    bVar.q0("2");
                }
            } else if (t9.i.b("aaa100028", str) || t9.i.b("aaa100027", str)) {
                s5.b bVar2 = f.this.f18857a;
                if (bVar2 != null) {
                    bVar2.q0("3");
                }
            } else {
                x.f8754a.w(this.f18860b, new b(str));
                s5.b bVar3 = f.this.f18857a;
                if (bVar3 != null) {
                    bVar3.q0("1");
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends ha.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ u8.a f18870b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ s5.e f18871c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ SwitchAccountBean f18872d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f18873e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f18874f;

        /* loaded from: classes3.dex */
        public static final class a extends t9.j implements s9.l {

            /* renamed from: a  reason: collision with root package name */
            public static final a f18875a = new a();

            public a() {
                super(1);
            }

            @Override // s9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return t.f14242a;
            }

            public final void invoke(String str) {
                f1.f8649a.x(y.p(y.f8771a, "CUSTOM_NO_ASSOCIATED_PORTAL", null, null, 6, null));
            }
        }

        public b(u8.a aVar, s5.e eVar, SwitchAccountBean switchAccountBean, String str, String str2) {
            this.f18870b = aVar;
            this.f18871c = eVar;
            this.f18872d = switchAccountBean;
            this.f18873e = str;
            this.f18874f = str2;
        }

        @Override // ha.a, io.reactivex.Observer
        /* renamed from: f */
        public void onNext(LoginResult loginResult) {
            List<PortalCodeList> list;
            String areaCode;
            String str;
            t9.i.g(loginResult, "t");
            f.this.c(this.f18870b, this.f18871c);
            this.f18872d.setLogged(true);
            UserData data = loginResult.getData();
            String str2 = null;
            if (data != null) {
                list = data.getPortalCodeList();
            } else {
                list = null;
            }
            if (b0.I(list)) {
                d6.b bVar = d6.b.f12660a;
                UserData data2 = loginResult.getData();
                t9.i.d(data2);
                bVar.H(data2);
                bVar.E(this.f18870b, this.f18873e);
                u8.a aVar = this.f18870b;
                UserData data3 = loginResult.getData();
                t9.i.d(data3);
                d6.b.G(bVar, aVar, data3, "", "", this.f18873e, this.f18874f, null, false, 192, null);
                if (!TextUtils.isEmpty(this.f18873e)) {
                    UserData data4 = loginResult.getData();
                    if (data4 != null) {
                        str = data4.getPwdTip();
                    } else {
                        str = null;
                    }
                    if (t9.i.b(str, "yes")) {
                        UserData data5 = loginResult.getData();
                        if (data5 != null) {
                            str2 = data5.getHasPwd();
                        }
                        if (t9.i.b(str2, "1")) {
                            this.f18870b.startActivity(new Intent(this.f18870b, ForceChangePwdAty.class));
                            s5.b bVar2 = f.this.f18857a;
                            if (bVar2 != null) {
                                bVar2.q0("4");
                                return;
                            }
                            return;
                        }
                    }
                }
                bVar.C(loginResult.getData());
                this.f18872d.setAccountType(this.f18873e);
                SwitchAccountBean switchAccountBean = this.f18872d;
                UserData data6 = loginResult.getData();
                String str3 = "";
                switchAccountBean.setUserName((data6 == null || (r1 = data6.getGoogleEmail()) == null) ? "" : "");
                SwitchAccountBean switchAccountBean2 = this.f18872d;
                UserData data7 = loginResult.getData();
                switchAccountBean2.setEmail((data7 == null || (r1 = data7.getEmail()) == null) ? "" : "");
                SwitchAccountBean switchAccountBean3 = this.f18872d;
                UserData data8 = loginResult.getData();
                switchAccountBean3.setPhone((data8 == null || (r1 = data8.getMobile()) == null) ? "" : "");
                SwitchAccountBean switchAccountBean4 = this.f18872d;
                UserData data9 = loginResult.getData();
                switchAccountBean4.setUserId((data9 == null || (r1 = data9.getUserId()) == null) ? "" : "");
                SwitchAccountBean switchAccountBean5 = this.f18872d;
                UserData data10 = loginResult.getData();
                switchAccountBean5.setNickName((data10 == null || (r1 = data10.getGoogleNickName()) == null) ? "" : "");
                this.f18872d.setAuthCode(this.f18874f);
                SwitchAccountBean switchAccountBean6 = this.f18872d;
                UserData data11 = loginResult.getData();
                if (data11 != null && (areaCode = data11.getAreaCode()) != null) {
                    str3 = areaCode;
                }
                switchAccountBean6.setAreaCode(str3);
                f.this.l(this.f18870b, this.f18872d);
                s5.b bVar3 = f.this.f18857a;
                if (bVar3 != null) {
                    bVar3.q0("0");
                    return;
                }
                return;
            }
            x.f8754a.w(this.f18870b, a.f18875a);
            s5.b bVar4 = f.this.f18857a;
            if (bVar4 != null) {
                bVar4.q0("1");
            }
        }

        @Override // ha.a
        public void showErrorHint(String str) {
            t9.i.g(str, "returnCode");
            if (t9.i.b("aaa100094", str)) {
                s5.b bVar = f.this.f18857a;
                if (bVar != null) {
                    bVar.q0("2");
                }
            } else if (t9.i.b("aaa100028", str) || t9.i.b("aaa100027", str)) {
                s5.b bVar2 = f.this.f18857a;
                if (bVar2 != null) {
                    bVar2.q0("3");
                }
            } else {
                y.f8771a.c(str);
                s5.b bVar3 = f.this.f18857a;
                if (bVar3 != null) {
                    bVar3.q0("1");
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends t9.j implements s9.l {
        public c() {
            super(1);
        }

        public final void b(SwitchAccountBean switchAccountBean) {
            b0.U(f.this, "增加账号记录成功！");
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SwitchAccountBean) obj);
            return t.f14242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends t9.j implements s9.l {
        public d() {
            super(1);
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return t.f14242a;
        }

        public final void invoke(Throwable th) {
            b0.U(f.this, "增加账号记录失败！");
        }
    }

    public static final void m(u8.a aVar, SwitchAccountBean switchAccountBean, ObservableEmitter observableEmitter) {
        t9.i.g(aVar, "$activity");
        t9.i.g(switchAccountBean, "$account");
        t9.i.g(observableEmitter, "it");
        Context applicationContext = aVar.getApplicationContext();
        t9.i.f(applicationContext, "activity.applicationContext");
        new MobileDao(applicationContext).addAccount(switchAccountBean);
        observableEmitter.onNext(switchAccountBean);
        observableEmitter.onComplete();
    }

    public static final void n(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static final void o(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    @Override // t5.a
    public void a(u8.a aVar, s5.e eVar) {
        t9.i.g(aVar, "activity");
        t9.i.g(eVar, "tmpLoginInfo");
        s5.b bVar = this.f18857a;
        if (bVar != null) {
            bVar.f1();
        }
        SwitchAccountBean g10 = eVar.g();
        if (g10 == null) {
            s5.b bVar2 = this.f18857a;
            if (bVar2 != null) {
                bVar2.q0("1");
            }
        } else if (!t9.i.b(g10.getAccountType(), "google") && !t9.i.b(g10.getAccountType(), "facebook")) {
            j(aVar, eVar);
        } else {
            k(aVar, eVar);
        }
    }

    @Override // t5.a
    public void b(t5.a aVar) {
        t9.i.g(aVar, "logOutMethod");
        this.f18858b = aVar;
    }

    @Override // t5.a
    public void c(u8.a aVar, s5.e eVar) {
        t5.a aVar2;
        t9.i.g(aVar, "activity");
        t9.i.g(eVar, "tmpLoginInfo");
        if (eVar.d() && (aVar2 = this.f18858b) != null) {
            aVar2.c(aVar, eVar);
        }
    }

    @Override // t5.a
    public void d(s5.b bVar) {
        t9.i.g(bVar, "callback");
        this.f18857a = bVar;
    }

    public final void j(u8.a aVar, s5.e eVar) {
        SwitchAccountBean g10 = eVar.g();
        t9.i.d(g10);
        String k10 = eVar.k();
        w wVar = new w();
        wVar.f18961a = g10.getAccountType();
        boolean z10 = false;
        k7.f.e("loginType:" + ((String) wVar.f18961a), new Object[0]);
        w wVar2 = new w();
        wVar2.f18961a = g10.getUserName();
        String password = g10.getPassword();
        String areaCode = g10.getAreaCode();
        String qrAuthCode = g10.getQrAuthCode();
        String verificationToken = g10.getVerificationToken();
        if (TextUtils.equals((CharSequence) wVar.f18961a, "4") && b0.K(verificationToken)) {
            wVar.f18961a = CdnType.DIGITAL_TYPE_PCDN;
        }
        if (t9.i.b(wVar.f18961a, "7")) {
            if (qrAuthCode.length() > 0) {
                z10 = true;
            }
            if (z10) {
                wVar2.f18961a = qrAuthCode;
            }
        }
        w6.i.f19214g.b().W1((String) wVar.f18961a, areaCode, (String) wVar2.f18961a, password, k10, null, verificationToken).compose(aVar.O1()).subscribe(new a(aVar, eVar, g10, wVar, wVar2, password, areaCode));
    }

    public final void k(u8.a aVar, s5.e eVar) {
        SwitchAccountBean g10 = eVar.g();
        t9.i.d(g10);
        String accountType = g10.getAccountType();
        String authCode = g10.getAuthCode();
        w6.i.f19214g.b().Z1(new LoginThirdPartBean(accountType, authCode, "0", "1", null, 16, null)).compose(aVar.O1()).subscribe(new b(aVar, eVar, g10, accountType, authCode));
    }

    public final void l(final u8.a aVar, final SwitchAccountBean switchAccountBean) {
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: t5.c
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                f.m(u8.a.this, switchAccountBean, observableEmitter);
            }
        }).compose(q.b());
        final c cVar = new c();
        Consumer consumer = new Consumer() { // from class: t5.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                f.n(s9.l.this, obj);
            }
        };
        final d dVar = new d();
        compose.subscribe(consumer, new Consumer() { // from class: t5.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                f.o(s9.l.this, obj);
            }
        });
    }
}
