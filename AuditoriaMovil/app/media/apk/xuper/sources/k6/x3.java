package k6;

import android.text.TextUtils;
import com.google.android.gms.common.Scopes;
import com.mobile.brasiltv.bean.MemberInfo;
import com.mobile.brasiltv.bean.event.CloseForcePageEvent;
import com.mobile.brasiltv.db.SwitchAccountBean;
import com.mobile.brasiltv.mine.activity.ForceChangePwdAty;
import com.mobile.brasiltv.view.dialog.NumberLimitDialog;
import com.msandroid.mobile.R;
import io.reactivex.disposables.Disposable;
import java.util.List;
import mobile.com.requestframe.utils.bean.ResetPwdEmailBean;
import mobile.com.requestframe.utils.response.BaseResult;
import mobile.com.requestframe.utils.response.LoginResult;
import mobile.com.requestframe.utils.response.PortalCodeList;
import mobile.com.requestframe.utils.response.UserData;
/* loaded from: classes3.dex */
public final class x3 implements l5.a {

    /* renamed from: a  reason: collision with root package name */
    public final f5.c f15638a;

    /* renamed from: b  reason: collision with root package name */
    public final i6.u0 f15639b;

    /* renamed from: c  reason: collision with root package name */
    public Disposable f15640c;

    /* loaded from: classes3.dex */
    public static final class a extends ha.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f15642b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f15643c;

        /* renamed from: k6.x3$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0263a extends t9.j implements s9.l {

            /* renamed from: a  reason: collision with root package name */
            public static final C0263a f15644a = new C0263a();

            public C0263a() {
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

        public a(String str, String str2) {
            this.f15642b = str;
            this.f15643c = str2;
        }

        @Override // ha.a, io.reactivex.Observer
        /* renamed from: f */
        public void onNext(LoginResult loginResult) {
            List<PortalCodeList> list;
            String str;
            t9.i.g(loginResult, "t");
            x3.this.j().showLoading(false);
            UserData data = loginResult.getData();
            String str2 = null;
            if (data != null) {
                list = data.getPortalCodeList();
            } else {
                list = null;
            }
            if (com.mobile.brasiltv.utils.b0.I(list)) {
                d6.b bVar = d6.b.f12660a;
                UserData data2 = loginResult.getData();
                t9.i.d(data2);
                bVar.H(data2);
                bVar.E(x3.this.i(), "2");
                f5.c i10 = x3.this.i();
                UserData data3 = loginResult.getData();
                t9.i.d(data3);
                d6.b.G(bVar, i10, data3, this.f15642b, this.f15643c, null, null, null, false, 240, null);
                xa.c.c().j(new CloseForcePageEvent());
                if (!TextUtils.isEmpty("2")) {
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
                            com.mobile.brasiltv.utils.b0.c0(x3.this.i(), ForceChangePwdAty.class);
                            SwitchAccountBean switchAccountBean = new SwitchAccountBean();
                            switchAccountBean.setAccountType("2");
                            switchAccountBean.setUserName(this.f15642b);
                            switchAccountBean.setPassword(this.f15643c);
                            s5.e.f18766a.n(s5.c.QUICK_LOGIN, switchAccountBean, "");
                            return;
                        }
                    }
                }
                bVar.C(loginResult.getData());
            } else {
                com.mobile.brasiltv.utils.x.f8754a.w(x3.this.i(), C0263a.f15644a);
            }
            x3.this.j().j1(true);
        }

        @Override // ha.a, io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            t9.i.g(disposable, "d");
            super.onSubscribe(disposable);
            x3.this.f15640c = disposable;
        }

        @Override // ha.a
        public void showErrorHint(String str) {
            t9.i.g(str, "returnCode");
            com.mobile.brasiltv.utils.b0.U(this, "login fail: " + str);
            x3.this.j().showLoading(false);
            if (t9.i.b("aaa100094", str)) {
                new NumberLimitDialog(x3.this.i()).show();
                x3.this.j().x();
                return;
            }
            x3.this.j().j1(false);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends ha.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f15646b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f15647c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f15648d;

        /* loaded from: classes3.dex */
        public static final class a extends t9.j implements s9.l {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f15649a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ String f15650b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ x3 f15651c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2, x3 x3Var) {
                super(1);
                this.f15649a = str;
                this.f15650b = str2;
                this.f15651c = x3Var;
            }

            @Override // s9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return h9.t.f14242a;
            }

            public final void invoke(String str) {
                String d10 = com.mobile.brasiltv.utils.y.f8771a.d(this.f15649a);
                if (com.mobile.brasiltv.utils.b0.T(this.f15650b, "portal100072") || com.mobile.brasiltv.utils.b0.T(this.f15650b, "portal100073")) {
                    d10 = this.f15651c.i().getString(R.string.verification_invalid);
                    t9.i.f(d10, "context.getString(R.string.verification_invalid)");
                }
                com.mobile.brasiltv.utils.f1.f8649a.x(d10);
            }
        }

        public b(String str, boolean z10, String str2) {
            this.f15646b = str;
            this.f15647c = z10;
            this.f15648d = str2;
        }

        @Override // ha.a, io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            t9.i.g(disposable, "d");
            super.onSubscribe(disposable);
            x3.this.j().showLoading(true);
        }

        @Override // ha.a
        public void showErrorHint(String str) {
            t9.i.g(str, "returnCode");
            x3.this.j().showLoading(false);
            com.mobile.brasiltv.utils.x.f8754a.w(x3.this.i(), new a(com.mobile.brasiltv.utils.y.f8771a.c(str), str, x3.this));
        }

        @Override // ha.a, io.reactivex.Observer
        public void onNext(BaseResult baseResult) {
            t9.i.g(baseResult, "t");
            MemberInfo memberInfo = MemberInfo.INSTANCE;
            String str = this.f15646b;
            t9.i.f(str, "password");
            memberInfo.putPassword(str, false);
            if (this.f15647c) {
                x3.this.k(this.f15648d, memberInfo.getLastPassword());
                return;
            }
            x3.this.j().showLoading(false);
            x3.this.j().j1(true);
        }
    }

    public x3(f5.c cVar, i6.u0 u0Var) {
        t9.i.g(cVar, com.umeng.analytics.pro.f.X);
        t9.i.g(u0Var, "view");
        this.f15638a = cVar;
        this.f15639b = u0Var;
    }

    @Override // l5.a
    public void e() {
    }

    @Override // l5.a
    public void g() {
    }

    public final f5.c i() {
        return this.f15638a;
    }

    public final i6.u0 j() {
        return this.f15639b;
    }

    public final void k(String str, String str2) {
        Disposable disposable;
        t9.i.g(str, "userName");
        t9.i.g(str2, "password");
        Disposable disposable2 = this.f15640c;
        boolean z10 = false;
        if (disposable2 != null && !disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = this.f15640c) != null) {
            disposable.dispose();
        }
        w6.i.X1(w6.i.f19214g.b(), "2", "", str, str2, "", null, null, 64, null).compose(this.f15638a.O1()).subscribe(new a(str, str2));
    }

    public void l(String str, String str2, String str3, String str4, boolean z10) {
        t9.i.g(str, Scopes.EMAIL);
        t9.i.g(str2, "pwd");
        t9.i.g(str3, "repeatPwd");
        t9.i.g(str4, "verifyCode");
        if (!com.mobile.brasiltv.utils.j1.g(str2)) {
            this.f15639b.d(R.string.password_format_error_tips);
        } else if (!com.mobile.brasiltv.utils.j1.g(str3)) {
            this.f15639b.d(R.string.password_error_tips);
        } else if (!com.mobile.brasiltv.utils.b0.T(str2, str3)) {
            this.f15639b.d(R.string.not_match_password);
        } else {
            String e10 = ma.m.e(str2);
            w6.i b10 = w6.i.f19214g.b();
            t9.i.f(e10, "password");
            b10.h2(new ResetPwdEmailBean(str, e10, "3", str4)).compose(this.f15638a.O1()).subscribe(new b(e10, z10, str));
        }
    }
}
