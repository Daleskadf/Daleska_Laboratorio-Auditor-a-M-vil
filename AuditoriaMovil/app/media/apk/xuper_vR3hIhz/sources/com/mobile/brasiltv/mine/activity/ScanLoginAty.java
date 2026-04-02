package com.mobile.brasiltv.mine.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mobile.brasiltv.R$id;
import com.mobile.brasiltv.activity.MainAty;
import com.mobile.brasiltv.bean.event.ExitScanPageEvent;
import com.mobile.brasiltv.bean.event.LoginSuccessEvent;
import com.mobile.brasiltv.bean.event.RequestAuthAndSlbEvent;
import com.mobile.brasiltv.bean.event.UpdateMineViewEvent;
import com.mobile.brasiltv.bean.event.UpdateRestrictEvent;
import com.mobile.brasiltv.bean.event.UserIdentityChangeEvent;
import com.mobile.brasiltv.db.MobileDao;
import com.mobile.brasiltv.db.SwitchAccountBean;
import com.mobile.brasiltv.mine.activity.ScanLoginAty;
import com.mobile.brasiltv.utils.b0;
import com.mobile.brasiltv.utils.f1;
import com.mobile.brasiltv.utils.x;
import com.mobile.brasiltv.utils.y;
import com.mobile.brasiltv.view.TitleView;
import com.mobile.brasiltv.view.dialog.NumberLimitDialog;
import com.msandroid.mobile.R;
import com.taobao.accs.common.Constants;
import com.titans.entity.CdnType;
import h9.t;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import ma.q;
import mobile.com.requestframe.utils.response.BaseResult;
import mobile.com.requestframe.utils.response.GetQrData;
import mobile.com.requestframe.utils.response.GetQrResult;
import mobile.com.requestframe.utils.response.PortalCodeList;
import mobile.com.requestframe.utils.response.UserData;
import s9.l;
import t9.i;
import t9.j;
import t9.z;
import w6.i;
/* loaded from: classes3.dex */
public final class ScanLoginAty extends f5.c {

    /* renamed from: o  reason: collision with root package name */
    public static final a f8429o = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public static final String f8430p = "qr_token";

    /* renamed from: q  reason: collision with root package name */
    public static final String f8431q = "user_id";

    /* renamed from: m  reason: collision with root package name */
    public Disposable f8434m;

    /* renamed from: n  reason: collision with root package name */
    public Map f8435n = new LinkedHashMap();

    /* renamed from: k  reason: collision with root package name */
    public final h9.g f8432k = h9.h.b(new b());

    /* renamed from: l  reason: collision with root package name */
    public final h9.g f8433l = h9.h.b(new h());

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(t9.g gVar) {
            this();
        }

        public final String a() {
            return ScanLoginAty.f8430p;
        }

        public final String b() {
            return ScanLoginAty.f8431q;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends j implements s9.a {
        public b() {
            super(0);
        }

        @Override // s9.a
        public final String invoke() {
            String stringExtra = ScanLoginAty.this.getIntent().getStringExtra(ScanLoginAty.f8429o.a());
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends j implements l {
        public c() {
            super(1);
        }

        public final void b(SwitchAccountBean switchAccountBean) {
            b0.U(ScanLoginAty.this, "增加账号记录成功！");
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SwitchAccountBean) obj);
            return t.f14242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends j implements l {
        public d() {
            super(1);
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return t.f14242a;
        }

        public final void invoke(Throwable th) {
            b0.U(ScanLoginAty.this, "增加账号记录失败！");
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends j implements l {
        public e() {
            super(1);
        }

        @Override // s9.l
        /* renamed from: b */
        public final ObservableSource invoke(Long l10) {
            i.g(l10, "it");
            String b32 = ScanLoginAty.this.b3();
            if (b32 != null) {
                return w6.i.f19214g.b().e2(b32);
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class f extends ha.a {

        /* loaded from: classes3.dex */
        public static final class a extends j implements l {

            /* renamed from: a  reason: collision with root package name */
            public static final a f8441a = new a();

            public a() {
                super(1);
            }

            @Override // s9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return t.f14242a;
            }

            public final void invoke(String str) {
                f1.f8649a.u(y.p(y.f8771a, "CUSTOM_NO_ASSOCIATED_PORTAL", null, null, 6, null));
            }
        }

        /* loaded from: classes3.dex */
        public static final class b extends j implements l {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f8442a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(1);
                this.f8442a = str;
            }

            @Override // s9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return t.f14242a;
            }

            public final void invoke(String str) {
                f1.f8649a.x(y.p(y.f8771a, this.f8442a, null, null, 6, null));
            }
        }

        public f() {
        }

        @Override // ha.a, io.reactivex.Observer
        /* renamed from: f */
        public void onNext(GetQrResult getQrResult) {
            String str;
            boolean z10;
            i.g(getQrResult, "t");
            GetQrData data = getQrResult.getData();
            if (data != null) {
                str = data.getStatus();
            } else {
                str = null;
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case 49:
                        if (str.equals("1")) {
                            return;
                        }
                        break;
                    case 50:
                        if (str.equals("2")) {
                            ScanLoginAty.this.o3();
                            return;
                        }
                        break;
                    case 51:
                        if (str.equals("3")) {
                            GetQrData data2 = getQrResult.getData();
                            i.d(data2);
                            if (data2.getUserInfo() != null) {
                                GetQrData data3 = getQrResult.getData();
                                i.d(data3);
                                UserData userInfo = data3.getUserInfo();
                                i.d(userInfo);
                                List<PortalCodeList> portalCodeList = userInfo.getPortalCodeList();
                                if (portalCodeList != null && !portalCodeList.isEmpty()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10) {
                                    ScanLoginAty scanLoginAty = ScanLoginAty.this;
                                    GetQrData data4 = getQrResult.getData();
                                    i.d(data4);
                                    UserData userInfo2 = data4.getUserInfo();
                                    i.d(userInfo2);
                                    GetQrData data5 = getQrResult.getData();
                                    i.d(data5);
                                    String qrAuthCodeToken = data5.getQrAuthCodeToken();
                                    if (qrAuthCodeToken == null) {
                                        qrAuthCodeToken = "";
                                    }
                                    scanLoginAty.i3(userInfo2, qrAuthCodeToken);
                                    xa.c.c().j(new UserIdentityChangeEvent());
                                    ((ProgressBar) ScanLoginAty.this.Y2(R$id.mPbLoading)).setVisibility(8);
                                    return;
                                }
                            }
                            x.f8754a.w(ScanLoginAty.this.Q1(), a.f8441a);
                            ((ProgressBar) ScanLoginAty.this.Y2(R$id.mPbLoading)).setVisibility(8);
                            return;
                        }
                        break;
                    case 52:
                        if (str.equals("4")) {
                            ((ProgressBar) ScanLoginAty.this.Y2(R$id.mPbLoading)).setVisibility(8);
                            f1.f8649a.w(R.string.scan_login_failed);
                            return;
                        }
                        break;
                    case 53:
                        if (str.equals(CdnType.DIGITAL_TYPE_PCDN)) {
                            ((ProgressBar) ScanLoginAty.this.Y2(R$id.mPbLoading)).setVisibility(8);
                            f1.f8649a.w(R.string.scan_qr_expired);
                            return;
                        }
                        break;
                }
            }
            ((ProgressBar) ScanLoginAty.this.Y2(R$id.mPbLoading)).setVisibility(8);
            f1.f8649a.w(R.string.scan_login_failed);
        }

        @Override // ha.a, io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            i.g(disposable, "d");
            super.onSubscribe(disposable);
            ScanLoginAty.this.n3(disposable);
        }

        @Override // ha.a
        public void showErrorHint(String str) {
            i.g(str, "returnCode");
            if (i.b("aaa100094", str)) {
                new NumberLimitDialog(ScanLoginAty.this.Q1()).show();
            } else {
                x.f8754a.w(ScanLoginAty.this.Q1(), new b(str));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class g extends ha.a {

        /* loaded from: classes3.dex */
        public static final class a extends j implements l {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f8444a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(1);
                this.f8444a = str;
            }

            @Override // s9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return t.f14242a;
            }

            public final void invoke(String str) {
                f1.f8649a.x(y.p(y.f8771a, this.f8444a, null, null, 6, null));
            }
        }

        public g() {
        }

        @Override // ha.a, io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            i.g(disposable, "d");
            super.onSubscribe(disposable);
            ((ProgressBar) ScanLoginAty.this.Y2(R$id.mPbLoading)).setVisibility(0);
        }

        @Override // ha.a
        public void showErrorHint(String str) {
            i.g(str, "returnCode");
            ((ProgressBar) ScanLoginAty.this.Y2(R$id.mPbLoading)).setVisibility(8);
            x.f8754a.w(ScanLoginAty.this.Q1(), new a(str));
        }

        @Override // ha.a, io.reactivex.Observer
        public void onNext(BaseResult baseResult) {
            i.g(baseResult, "t");
            ScanLoginAty.this.o3();
        }
    }

    /* loaded from: classes3.dex */
    public static final class h extends j implements s9.a {
        public h() {
            super(0);
        }

        @Override // s9.a
        public final String invoke() {
            return ScanLoginAty.this.getIntent().getStringExtra(ScanLoginAty.f8429o.b());
        }
    }

    public static final void e3(ScanLoginAty scanLoginAty, View view) {
        i.g(scanLoginAty, "this$0");
        b0.c0(scanLoginAty, MainAty.class);
    }

    public static final void f3(ScanLoginAty scanLoginAty, View view) {
        i.g(scanLoginAty, "this$0");
        scanLoginAty.q3();
    }

    public static final void g3(ScanLoginAty scanLoginAty, View view) {
        i.g(scanLoginAty, "this$0");
        if (d6.b.f12660a.u(scanLoginAty)) {
            scanLoginAty.finish();
            xa.c.c().j(new ExitScanPageEvent());
            return;
        }
        b0.c0(scanLoginAty, MainAty.class);
    }

    public static final void k3(ScanLoginAty scanLoginAty, SwitchAccountBean switchAccountBean, ObservableEmitter observableEmitter) {
        i.g(scanLoginAty, "this$0");
        i.g(switchAccountBean, "$account");
        i.g(observableEmitter, "it");
        Context applicationContext = scanLoginAty.Q1().getApplicationContext();
        i.f(applicationContext, "context.applicationContext");
        new MobileDao(applicationContext).addAccount(switchAccountBean);
        observableEmitter.onNext(switchAccountBean);
        observableEmitter.onComplete();
    }

    public static final void l3(l lVar, Object obj) {
        i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static final void m3(l lVar, Object obj) {
        i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static final ObservableSource p3(l lVar, Object obj) {
        i.g(lVar, "$tmp0");
        return (ObservableSource) lVar.invoke(obj);
    }

    public View Y2(int i10) {
        Map map = this.f8435n;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view == null) {
            View findViewById = findViewById(i10);
            if (findViewById != null) {
                map.put(Integer.valueOf(i10), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final String b3() {
        return (String) this.f8432k.getValue();
    }

    public final String c3() {
        return (String) this.f8433l.getValue();
    }

    public final void d3() {
        ((TitleView) Y2(R$id.title_view)).setXClickListener(new View.OnClickListener() { // from class: e6.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScanLoginAty.e3(ScanLoginAty.this, view);
            }
        });
        ((TextView) Y2(R$id.mTextConfirm)).setOnClickListener(new View.OnClickListener() { // from class: e6.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScanLoginAty.f3(ScanLoginAty.this, view);
            }
        });
        ((TextView) Y2(R$id.mTextCancel)).setOnClickListener(new View.OnClickListener() { // from class: e6.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScanLoginAty.g3(ScanLoginAty.this, view);
            }
        });
    }

    public final void h3() {
        ((TitleView) Y2(R$id.title_view)).setXVisible(0);
        z zVar = z.f18964a;
        String string = getResources().getString(R.string.try_to_login);
        i.f(string, "resources.getString(R.string.try_to_login)");
        String format = String.format(string, Arrays.copyOf(new Object[]{c3()}, 1));
        i.f(format, "format(format, *args)");
        ((TextView) Y2(R$id.mTextNotify)).setText(format);
    }

    public final void i3(UserData userData, String str) {
        i.g(userData, Constants.KEY_USER_ID);
        i.g(str, "qrAuthCode");
        k7.f.e("扫码登录成功 " + userData, new Object[0]);
        d6.b bVar = d6.b.f12660a;
        bVar.E(this, "7");
        i.c cVar = w6.i.f19214g;
        if (!t9.i.b(cVar.A(), "") && !t9.i.b(userData.getRestrictedStatus(), cVar.A())) {
            xa.c.c().m(new UpdateRestrictEvent(userData.getRestrictedStatus(), false, 2, null));
        }
        d6.b.G(bVar, this, userData, "", "", null, null, str, false, 176, null);
        if (!TextUtils.isEmpty("7") && t9.i.b(userData.getPwdTip(), "yes") && t9.i.b(userData.getHasPwd(), "1")) {
            startActivity(new Intent(this, ForceChangePwdAty.class));
            return;
        }
        xa.c.c().j(new LoginSuccessEvent(null, 1, null));
        xa.c.c().m(new UpdateMineViewEvent());
        xa.c.c().m(new RequestAuthAndSlbEvent(false, null, 3, null));
        SwitchAccountBean switchAccountBean = new SwitchAccountBean();
        switchAccountBean.setUserName(userData.getUserId());
        switchAccountBean.setUserId(userData.getUserId());
        switchAccountBean.setQrAuthCode(str);
        switchAccountBean.setAccountType("7");
        String areaCode = userData.getAreaCode();
        if (areaCode == null) {
            areaCode = "";
        }
        switchAccountBean.setAreaCode(areaCode);
        String email = userData.getEmail();
        if (email == null) {
            email = "";
        }
        switchAccountBean.setEmail(email);
        String mobile2 = userData.getMobile();
        if (mobile2 == null) {
            mobile2 = "";
        }
        switchAccountBean.setPhone(mobile2);
        j3(switchAccountBean);
        b0.c0(this, MainAty.class);
    }

    public final void j3(final SwitchAccountBean switchAccountBean) {
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: e6.b1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                ScanLoginAty.k3(ScanLoginAty.this, switchAccountBean, observableEmitter);
            }
        }).compose(q.b());
        final c cVar = new c();
        Consumer consumer = new Consumer() { // from class: e6.c1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ScanLoginAty.l3(s9.l.this, obj);
            }
        };
        final d dVar = new d();
        compose.subscribe(consumer, new Consumer() { // from class: e6.d1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ScanLoginAty.m3(s9.l.this, obj);
            }
        });
    }

    @Override // i5.a
    public void k2() {
        n2();
    }

    public final void n3(Disposable disposable) {
        this.f8434m = disposable;
    }

    public final void o3() {
        Disposable disposable = this.f8434m;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable<Long> timer = Observable.timer(1L, TimeUnit.SECONDS);
        final e eVar = new e();
        timer.flatMap(new Function() { // from class: e6.a1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource p32;
                p32 = ScanLoginAty.p3(s9.l.this, obj);
                return p32;
            }
        }).compose(O1()).subscribe(new f());
    }

    @Override // f5.c, i5.a, u8.a, androidx.appcompat.app.d, androidx.fragment.app.e, androidx.activity.ComponentActivity, o.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_scan_login_confirm);
        if (xa.c.c().h(this)) {
            xa.c.c().r(this);
        }
        h3();
        d3();
    }

    @Override // f5.c, u8.a, androidx.appcompat.app.d, androidx.fragment.app.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((ProgressBar) Y2(R$id.mPbLoading)).setVisibility(8);
    }

    public final void q3() {
        String b32 = b3();
        if (b32 != null) {
            w6.i.f19214g.b().t2(b32).compose(O1()).subscribe(new g());
        }
    }
}
