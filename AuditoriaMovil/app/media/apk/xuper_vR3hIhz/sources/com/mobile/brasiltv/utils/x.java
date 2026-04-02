package com.mobile.brasiltv.utils;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.Scopes;
import com.google.gson.Gson;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import mobile.com.requestframe.utils.response.ConfigData;
import mobile.com.requestframe.utils.response.ConfigInfoBean;
import mobile.com.requestframe.utils.response.ConfigResult;
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f8754a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f8755b;

    /* renamed from: c  reason: collision with root package name */
    public static String f8756c;

    /* renamed from: d  reason: collision with root package name */
    public static int f8757d;

    /* renamed from: e  reason: collision with root package name */
    public static int f8758e;

    /* renamed from: f  reason: collision with root package name */
    public static int f8759f;

    /* renamed from: g  reason: collision with root package name */
    public static Disposable f8760g;

    /* renamed from: h  reason: collision with root package name */
    public static String f8761h;

    /* renamed from: i  reason: collision with root package name */
    public static String f8762i;

    /* loaded from: classes3.dex */
    public static final class a extends t9.j implements s9.l {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f8763a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(1);
            this.f8763a = context;
        }

        public final void b(ConfigResult configResult) {
            String str;
            ConfigData data = configResult.getData();
            if (data != null) {
                str = data.getConfig();
            } else {
                str = null;
            }
            if (str != null) {
                Context context = this.f8763a;
                ConfigData data2 = configResult.getData();
                t9.i.d(data2);
                String config = data2.getConfig();
                t9.i.d(config);
                n7.a.e(context, "Properties", config);
            }
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ConfigResult) obj);
            return h9.t.f14242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends t9.j implements s9.l {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s9.l f8764a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ s9.l f8765b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ x f8766c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s9.l lVar, s9.l lVar2, x xVar) {
            super(1);
            this.f8764a = lVar;
            this.f8765b = lVar2;
            this.f8766c = xVar;
        }

        public final void b(ConfigResult configResult) {
            Gson a10 = s2.b.a();
            ConfigData data = configResult.getData();
            t9.i.d(data);
            Object fromJson = a10.fromJson(data.getConfig(), (Class<Object>) ConfigInfoBean.class);
            t9.i.f(fromJson, "jsoner.fromJson(it.data!…nfigInfoBean::class.java)");
            x.s(x.f8754a, (ConfigInfoBean) fromJson, this.f8764a, this.f8765b, false, 8, null);
            synchronized (this.f8766c) {
                x.f8759f = 1;
                h9.t tVar = h9.t.f14242a;
            }
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ConfigResult) obj);
            return h9.t.f14242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends t9.j implements s9.l {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ s9.l f8768b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s9.l lVar) {
            super(1);
            this.f8768b = lVar;
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return h9.t.f14242a;
        }

        public final void invoke(Throwable th) {
            synchronized (x.this) {
                x.f8759f = 2;
                h9.t tVar = h9.t.f14242a;
            }
            x.f8757d++;
            s9.l lVar = this.f8768b;
            if (lVar != null) {
                lVar.invoke("");
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends t9.j implements s9.l {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t9.w f8769a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(t9.w wVar) {
            super(1);
            this.f8769a = wVar;
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return h9.t.f14242a;
        }

        public final void invoke(String str) {
            this.f8769a.f18961a = str;
        }
    }

    static {
        x xVar = new x();
        f8754a = xVar;
        String simpleName = xVar.getClass().getSimpleName();
        t9.i.f(simpleName, "javaClass.simpleName");
        f8755b = simpleName;
        f8758e = 3;
        f8759f = 2;
    }

    public static /* synthetic */ void j(x xVar, Context context, s9.l lVar, s9.l lVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar2 = null;
        }
        xVar.i(context, lVar, lVar2);
    }

    public static final void k(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static final void l(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static final void m(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static /* synthetic */ void o(x xVar, Context context, s9.l lVar, s9.l lVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar2 = null;
        }
        xVar.n(context, lVar, lVar2);
    }

    public static /* synthetic */ void s(x xVar, ConfigInfoBean configInfoBean, s9.l lVar, s9.l lVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        xVar.r(configInfoBean, lVar, lVar2, z10);
    }

    public static final void u(Context context) {
        String str;
        boolean z10;
        t9.i.g(context, "$context");
        Object b10 = n7.a.b(context, "Properties", "");
        if (b10 instanceof String) {
            str = (String) b10;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            f8754a.r((ConfigInfoBean) s2.b.a().fromJson(str, (Class<Object>) ConfigInfoBean.class), null, null, true);
        }
    }

    public final String h() {
        boolean z10;
        String str;
        String str2 = f8756c;
        boolean z11 = false;
        if (str2 != null && str2.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            String str3 = f8756c;
            if (str3 == null) {
                return "";
            }
            return str3;
        }
        String str4 = f8761h;
        if (((str4 == null || str4.length() == 0) ? true : true) || (str = f8761h) == null) {
            return "";
        }
        return str;
    }

    public final void i(Context context, s9.l lVar, s9.l lVar2) {
        Disposable disposable;
        Disposable disposable2 = f8760g;
        boolean z10 = false;
        if (disposable2 != null && !disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = f8760g) != null) {
            disposable.dispose();
        }
        Observable j12 = w6.i.f19214g.b().j1();
        final a aVar = new a(context);
        Observable compose = j12.doOnNext(new Consumer() { // from class: com.mobile.brasiltv.utils.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                x.k(s9.l.this, obj);
            }
        }).compose(s2.c.a());
        final b bVar = new b(lVar, lVar2, this);
        Consumer consumer = new Consumer() { // from class: com.mobile.brasiltv.utils.u
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                x.l(s9.l.this, obj);
            }
        };
        final c cVar = new c(lVar);
        f8760g = compose.subscribe(consumer, new Consumer() { // from class: com.mobile.brasiltv.utils.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                x.m(s9.l.this, obj);
            }
        });
    }

    public final void n(Context context, s9.l lVar, s9.l lVar2) {
        t9.i.g(context, com.umeng.analytics.pro.f.X);
        if (lVar2 != null) {
            if (TextUtils.isEmpty(f8762i)) {
                i(context, lVar, lVar2);
                return;
            }
            String str = f8762i;
            t9.i.d(str);
            lVar2.invoke(str);
        }
        if (!TextUtils.isEmpty(f8756c)) {
            if (lVar != null) {
                lVar.invoke(f8756c);
            }
        } else if (f8757d >= f8758e) {
            String q10 = q();
            if (lVar != null) {
                lVar.invoke(q10);
            }
        } else {
            synchronized (this) {
                if (f8759f != 2) {
                    String q11 = f8754a.q();
                    if (lVar != null) {
                        lVar.invoke(q11);
                    }
                    return;
                }
                f8759f = 3;
                h9.t tVar = h9.t.f14242a;
                j(this, context, lVar, null, 4, null);
            }
        }
    }

    public final String p(String str) {
        t9.i.g(str, Scopes.EMAIL);
        int x10 = ba.t.x(str, '@', 0, false, 6, null);
        if (x10 != -1) {
            String substring = str.substring(x10);
            t9.i.f(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return null;
    }

    public final String q() {
        if (TextUtils.isEmpty(f8756c)) {
            if (!TextUtils.isEmpty(f8761h)) {
                return f8761h;
            }
            return "";
        }
        return f8756c;
    }

    public final void r(ConfigInfoBean configInfoBean, s9.l lVar, s9.l lVar2, boolean z10) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (configInfoBean != null) {
            str = configInfoBean.getOfficialWebsiteLink();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str) && !z10) {
            if (configInfoBean != null) {
                str3 = configInfoBean.getOfficialWebsiteLink();
            } else {
                str3 = null;
            }
            f8762i = str3;
            if (lVar2 != null) {
                t9.i.d(str3);
                lVar2.invoke(str3);
            }
        }
        if (configInfoBean != null) {
            str2 = configInfoBean.getCustomerEmail();
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (z10) {
                if (configInfoBean != null) {
                    str4 = configInfoBean.getCustomerEmail();
                }
                f8761h = str4;
                if (lVar != null) {
                    lVar.invoke(str4);
                    return;
                }
                return;
            }
            if (configInfoBean != null) {
                str4 = configInfoBean.getCustomerEmail();
            }
            f8756c = str4;
            if (lVar != null) {
                lVar.invoke(str4);
            }
        } else if (lVar != null) {
            lVar.invoke("");
        }
    }

    public final void t(final Context context) {
        t9.i.g(context, com.umeng.analytics.pro.f.X);
        s2.d.b("loadCacheConfigInfo", new Runnable() { // from class: com.mobile.brasiltv.utils.w
            @Override // java.lang.Runnable
            public final void run() {
                x.u(context);
            }
        }, false);
    }

    public final String v(Context context) {
        t9.i.g(context, com.umeng.analytics.pro.f.X);
        t9.w wVar = new t9.w();
        wVar.f18961a = "";
        o(this, context, new d(wVar), null, 4, null);
        return (String) wVar.f18961a;
    }

    public final void w(Context context, s9.l lVar) {
        t9.i.g(context, com.umeng.analytics.pro.f.X);
        x(context, lVar, null);
    }

    public final void x(Context context, s9.l lVar, s9.l lVar2) {
        t9.i.g(context, com.umeng.analytics.pro.f.X);
        n(context, lVar, lVar2);
    }

    public final String y(Context context, int i10) {
        t9.i.g(context, com.umeng.analytics.pro.f.X);
        t9.z zVar = t9.z.f18964a;
        String string = context.getString(i10);
        t9.i.f(string, "context.getString(resId)");
        String format = String.format(string, Arrays.copyOf(new Object[]{h()}, 1));
        t9.i.f(format, "format(format, *args)");
        return format;
    }
}
