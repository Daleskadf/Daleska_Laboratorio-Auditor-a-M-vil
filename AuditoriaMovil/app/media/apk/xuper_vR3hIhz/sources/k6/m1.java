package k6;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.mobile.brasiltv.activity.MainAty;
import com.mobile.brasiltv.bean.event.CloseForcePageEvent;
import com.mobile.brasiltv.db.MobileDao;
import com.mobile.brasiltv.db.SwitchAccountBean;
import com.mobile.brasiltv.mine.activity.ForceChangePwdAty;
import com.mobile.brasiltv.mine.activity.LoginAty;
import com.mobile.brasiltv.view.dialog.NumberLimitDialog;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.List;
import mobile.com.requestframe.utils.response.LoginResult;
import mobile.com.requestframe.utils.response.PortalCodeList;
import mobile.com.requestframe.utils.response.UserData;
/* loaded from: classes3.dex */
public final class m1 implements l5.a {

    /* renamed from: a  reason: collision with root package name */
    public final f5.c f15400a;

    /* renamed from: b  reason: collision with root package name */
    public final i6.d0 f15401b;

    /* loaded from: classes3.dex */
    public static final class a extends ha.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f15403b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f15404c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f15405d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f15406e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f15407f;

        /* renamed from: k6.m1$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0255a extends t9.j implements s9.l {

            /* renamed from: a  reason: collision with root package name */
            public static final C0255a f15408a = new C0255a();

            public C0255a() {
                super(1);
            }

            @Override // s9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return h9.t.f14242a;
            }

            public final void invoke(String str) {
                com.mobile.brasiltv.utils.f1.f8649a.x(com.mobile.brasiltv.utils.y.p(com.mobile.brasiltv.utils.y.f8771a, "CUSTOM_NO_ASSOCIATED_PORTAL", null, null, 6, null));
            }
        }

        /* loaded from: classes3.dex */
        public static final class b extends t9.j implements s9.l {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f15409a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(1);
                this.f15409a = str;
            }

            @Override // s9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return h9.t.f14242a;
            }

            public final void invoke(String str) {
                com.mobile.brasiltv.utils.f1.f8649a.x(com.mobile.brasiltv.utils.y.p(com.mobile.brasiltv.utils.y.f8771a, this.f15409a, null, null, 6, null));
            }
        }

        /* loaded from: classes3.dex */
        public static final class c extends t9.j implements s9.l {

            /* renamed from: a  reason: collision with root package name */
            public static final c f15410a = new c();

            public c() {
                super(1);
            }

            @Override // s9.l
            /* renamed from: b */
            public final Intent invoke(Intent intent) {
                t9.i.g(intent, "it");
                intent.putExtra("can_back", false);
                Intent putExtra = intent.putExtra("success_to_main", true);
                t9.i.f(putExtra, "it.putExtra(LoginAty.SUCCESS_TO_MAIN, true)");
                return putExtra;
            }
        }

        public a(String str, String str2, String str3, String str4, String str5) {
            this.f15403b = str;
            this.f15404c = str2;
            this.f15405d = str3;
            this.f15406e = str4;
            this.f15407f = str5;
        }

        @Override // ha.a, io.reactivex.Observer
        /* renamed from: f */
        public void onNext(LoginResult loginResult) {
            List<PortalCodeList> list;
            String areaCode;
            String str;
            t9.i.g(loginResult, "t");
            UserData data = loginResult.getData();
            String str2 = null;
            if (data != null) {
                list = data.getPortalCodeList();
            } else {
                list = null;
            }
            if (com.mobile.brasiltv.utils.b0.I(list)) {
                k7.f.e("登录成功 " + loginResult, new Object[0]);
                d6.b bVar = d6.b.f12660a;
                UserData data2 = loginResult.getData();
                t9.i.d(data2);
                bVar.H(data2);
                bVar.E(m1.this.l(), this.f15403b);
                f5.c l10 = m1.this.l();
                UserData data3 = loginResult.getData();
                t9.i.d(data3);
                d6.b.G(bVar, l10, data3, this.f15404c, this.f15405d, null, null, null, false, 240, null);
                String str3 = "";
                if (!TextUtils.isEmpty(this.f15403b)) {
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
                            com.mobile.brasiltv.utils.b0.c0(m1.this.l(), ForceChangePwdAty.class);
                            SwitchAccountBean switchAccountBean = new SwitchAccountBean();
                            switchAccountBean.setAccountType(this.f15403b);
                            String str4 = this.f15406e;
                            if (str4 != null) {
                                str3 = str4;
                            }
                            switchAccountBean.setAreaCode(str3);
                            switchAccountBean.setUserName(this.f15404c);
                            switchAccountBean.setPassword(this.f15405d);
                            s5.e.f18766a.n(s5.c.QUICK_LOGIN, switchAccountBean, this.f15407f);
                            return;
                        }
                    }
                }
                bVar.C(loginResult.getData());
                SwitchAccountBean switchAccountBean2 = new SwitchAccountBean();
                switchAccountBean2.setUserName(this.f15404c);
                switchAccountBean2.setPassword(this.f15405d);
                UserData data6 = loginResult.getData();
                switchAccountBean2.setUserId((data6 == null || (r1 = data6.getUserId()) == null) ? "" : "");
                switchAccountBean2.setAccountType(this.f15403b);
                String str5 = this.f15406e;
                if (str5 == null) {
                    str5 = "";
                }
                switchAccountBean2.setAreaCode(str5);
                UserData data7 = loginResult.getData();
                switchAccountBean2.setVerificationToken((data7 == null || (r1 = data7.getVerificationToken()) == null) ? "" : "");
                UserData data8 = loginResult.getData();
                switchAccountBean2.setEmail((data8 == null || (r1 = data8.getEmail()) == null) ? "" : "");
                UserData data9 = loginResult.getData();
                switchAccountBean2.setPhone((data9 == null || (r1 = data9.getMobile()) == null) ? "" : "");
                UserData data10 = loginResult.getData();
                if (data10 != null && (areaCode = data10.getAreaCode()) != null) {
                    str3 = areaCode;
                }
                switchAccountBean2.setAreaCode(str3);
                m1.this.n(switchAccountBean2);
                xa.c.c().j(new CloseForcePageEvent());
                com.mobile.brasiltv.utils.b0.c0(m1.this.l(), MainAty.class);
                return;
            }
            com.mobile.brasiltv.utils.x.f8754a.w(m1.this.l(), C0255a.f15408a);
        }

        @Override // ha.a
        public void showErrorHint(String str) {
            t9.i.g(str, "returnCode");
            if (t9.i.b("aaa100094", str)) {
                new NumberLimitDialog(m1.this.l().Q1()).show();
                return;
            }
            com.mobile.brasiltv.utils.x.f8754a.w(m1.this.l(), new b(str));
            com.mobile.brasiltv.utils.b0.d0(m1.this.l(), LoginAty.class, c.f15410a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends t9.j implements s9.l {
        public b() {
            super(1);
        }

        public final void b(SwitchAccountBean switchAccountBean) {
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SwitchAccountBean) obj);
            return h9.t.f14242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends t9.j implements s9.l {
        public c() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return h9.t.f14242a;
        }
    }

    public m1(f5.c cVar, i6.d0 d0Var) {
        t9.i.g(cVar, "activity");
        t9.i.g(d0Var, "view");
        this.f15400a = cVar;
        this.f15401b = d0Var;
    }

    public static final void o(m1 m1Var, SwitchAccountBean switchAccountBean, ObservableEmitter observableEmitter) {
        t9.i.g(m1Var, "this$0");
        t9.i.g(switchAccountBean, "$account");
        t9.i.g(observableEmitter, "it");
        Context applicationContext = m1Var.f15400a.getApplicationContext();
        t9.i.f(applicationContext, "activity.applicationContext");
        new MobileDao(applicationContext).addAccount(switchAccountBean);
        observableEmitter.onNext(switchAccountBean);
        observableEmitter.onComplete();
    }

    public static final void p(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static final void q(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    @Override // l5.a
    public void e() {
    }

    @Override // l5.a
    public void g() {
    }

    public final f5.c l() {
        return this.f15400a;
    }

    public void m(String str, String str2, String str3, String str4, String str5, boolean z10) {
        t9.i.g(str, "userName");
        t9.i.g(str2, "password");
        t9.i.g(str3, "accountTypes");
        w6.i.X1(w6.i.f19214g.b(), str3, str4, str, str2, str5, null, null, 64, null).compose(this.f15400a.O1()).subscribe(new a(str3, str, str2, str4, str5));
    }

    public final void n(final SwitchAccountBean switchAccountBean) {
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: k6.j1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                m1.o(m1.this, switchAccountBean, observableEmitter);
            }
        }).compose(ma.q.b());
        final b bVar = new b();
        Consumer consumer = new Consumer() { // from class: k6.k1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                m1.p(s9.l.this, obj);
            }
        };
        final c cVar = new c();
        compose.subscribe(consumer, new Consumer() { // from class: k6.l1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                m1.q(s9.l.this, obj);
            }
        });
    }
}
