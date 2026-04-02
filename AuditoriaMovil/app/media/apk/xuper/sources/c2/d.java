package c2;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bigbee.bean.request.AppBean;
import com.bigbee.db.EventDbModel;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.taobao.accs.common.Constants;
import h9.t;
import i2.d;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c */
    public static AppBean f5313c;

    /* renamed from: a */
    public static final d f5311a = new d();

    /* renamed from: b */
    public static final String f5312b = d.class.getSimpleName();

    /* renamed from: d */
    public static String f5314d = "";

    /* renamed from: e */
    public static HashMap f5315e = new HashMap();

    /* loaded from: classes.dex */
    public static final class a implements d.c {

        /* renamed from: a */
        public final /* synthetic */ String f5316a;

        /* renamed from: b */
        public final /* synthetic */ HashMap f5317b;

        /* renamed from: c */
        public final /* synthetic */ int f5318c;

        /* renamed from: d */
        public final /* synthetic */ String f5319d;

        /* renamed from: e */
        public final /* synthetic */ boolean f5320e;

        /* renamed from: f */
        public final /* synthetic */ String f5321f;

        /* renamed from: g */
        public final /* synthetic */ long f5322g;

        /* renamed from: h */
        public final /* synthetic */ long f5323h;

        public a(String str, HashMap hashMap, int i10, String str2, boolean z10, String str3, long j10, long j11) {
            this.f5316a = str;
            this.f5317b = hashMap;
            this.f5318c = i10;
            this.f5319d = str2;
            this.f5320e = z10;
            this.f5321f = str3;
            this.f5322g = j10;
            this.f5323h = j11;
        }

        @Override // i2.d.c
        public void a() {
            String userName;
            if (!TextUtils.isEmpty(this.f5316a)) {
                userName = this.f5316a;
            } else {
                userName = l.f5383a.b().getUserName();
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = this.f5317b;
            if (hashMap2 != null && hashMap2.size() > 0) {
                hashMap = this.f5317b;
            }
            HashMap hashMap3 = hashMap;
            hashMap3.put("httpStatus", Integer.valueOf(this.f5318c));
            hashMap3.put("uri", this.f5319d);
            if (this.f5320e) {
                hashMap3.put("domain|DES", this.f5321f);
            } else {
                hashMap3.put("domain", this.f5321f);
            }
            if (!TextUtils.isEmpty(userName) || !TextUtils.isEmpty(l.f5383a.b().getUserName())) {
                if (userName == null && (userName = l.f5383a.b().getUserName()) == null) {
                    userName = "";
                }
                hashMap3.put("uname", userName);
            }
            i2.h hVar = i2.h.f14287a;
            long a10 = hVar.a();
            long j10 = this.f5322g;
            i2.a aVar = i2.a.f14261a;
            i.f5350q.a().w(e.d(e.f5339a, "app_api", hashMap3, (j10 - aVar.g()) + a10, (this.f5323h - aVar.g()) + hVar.a(), false, 16, null));
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements d.c {

        /* renamed from: a */
        public final /* synthetic */ String f5324a;

        /* renamed from: b */
        public final /* synthetic */ String f5325b;

        /* renamed from: c */
        public final /* synthetic */ String f5326c;

        /* renamed from: d */
        public final /* synthetic */ String f5327d;

        /* renamed from: e */
        public final /* synthetic */ String f5328e;

        /* renamed from: f */
        public final /* synthetic */ String f5329f;

        /* renamed from: g */
        public final /* synthetic */ String f5330g;

        /* renamed from: h */
        public final /* synthetic */ String f5331h;

        /* renamed from: i */
        public final /* synthetic */ String f5332i;

        /* renamed from: j */
        public final /* synthetic */ String f5333j;

        /* renamed from: k */
        public final /* synthetic */ String f5334k;

        /* renamed from: l */
        public final /* synthetic */ String f5335l;

        /* renamed from: m */
        public final /* synthetic */ HashMap f5336m;

        public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, HashMap hashMap) {
            this.f5324a = str;
            this.f5325b = str2;
            this.f5326c = str3;
            this.f5327d = str4;
            this.f5328e = str5;
            this.f5329f = str6;
            this.f5330g = str7;
            this.f5331h = str8;
            this.f5332i = str9;
            this.f5333j = str10;
            this.f5334k = str11;
            this.f5335l = str12;
            this.f5336m = hashMap;
        }

        @Override // i2.d.c
        public void a() {
            long a10 = i2.h.f14287a.a() + (SystemClock.elapsedRealtime() - i2.a.f14261a.g());
            HashMap hashMap = new HashMap();
            l lVar = l.f5383a;
            String str = "";
            if (!TextUtils.isEmpty(lVar.b().getUserName())) {
                String userName = lVar.b().getUserName();
                if (userName == null) {
                    userName = "";
                }
                hashMap.put("uname", userName);
            }
            hashMap.put("mCode", this.f5324a);
            hashMap.put("cdnType", this.f5325b);
            hashMap.put("bussType", this.f5326c);
            hashMap.put("eCode", this.f5327d);
            String str2 = this.f5328e;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("castMode", str2);
            String str3 = this.f5329f;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("castDevice", str3);
            hashMap.put("title", this.f5330g);
            hashMap.put(Constants.KEY_HOST, this.f5331h);
            String str4 = this.f5332i;
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put("transId", str4);
            String str5 = this.f5333j;
            if (str5 == null) {
                str5 = "";
            }
            hashMap.put(Constants.KEY_MODE, str5);
            String str6 = this.f5334k;
            if (str6 == null) {
                str6 = "";
            }
            hashMap.put("p2pErr", str6);
            String str7 = this.f5335l;
            if (str7 != null) {
                str = str7;
            }
            hashMap.put("p2pMode", str);
            HashMap hashMap2 = this.f5336m;
            if (hashMap2 != null) {
                for (String str8 : hashMap2.keySet()) {
                    if (str8 != null && this.f5336m.get(str8) != null) {
                        hashMap.put(str8, String.valueOf(this.f5336m.get(str8)));
                    }
                }
            }
            i.f5350q.a().w(e.d(e.f5339a, "app_play_error", hashMap, a10, a10, false, 16, null));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends t9.j implements s9.l {

        /* renamed from: a */
        public final /* synthetic */ long f5337a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10) {
            super(1);
            this.f5337a = j10;
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return t.f14242a;
        }

        public final void invoke(String str) {
            i2.e.f14282b.a().c("server_time", Long.valueOf(i2.h.f14287a.a()));
            d.f5311a.k(this.f5337a);
        }
    }

    /* renamed from: c2.d$d */
    /* loaded from: classes.dex */
    public static final class C0079d extends t9.j implements s9.l {

        /* renamed from: a */
        public static final C0079d f5338a = new C0079d();

        public C0079d() {
            super(1);
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return t.f14242a;
        }

        public final void invoke(Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ void e(d dVar, long j10, long j11, String str, String str2, int i10, String str3, HashMap hashMap, boolean z10, int i11, Object obj) {
        String str4;
        HashMap hashMap2;
        if ((i11 & 32) != 0) {
            str4 = "";
        } else {
            str4 = str3;
        }
        if ((i11 & 64) != 0) {
            hashMap2 = null;
        } else {
            hashMap2 = hashMap;
        }
        dVar.d(j10, j11, str, str2, i10, str4, hashMap2, z10);
    }

    public static /* synthetic */ void l(d dVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        dVar.k(j10);
    }

    public static final void n(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static final void o(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static /* synthetic */ void r(d dVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        dVar.q(z10, z11);
    }

    public final EventDbModel c(boolean z10) {
        String str;
        long j10;
        long j11;
        AppBean appBean = f5313c;
        if (appBean != null) {
            str = appBean.getTag();
        } else {
            str = null;
        }
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = f5315e;
            AppBean appBean2 = f5313c;
            hashMap.put("tag", (appBean2 == null || (r2 = appBean2.getTag()) == null) ? "" : "");
        }
        l lVar = l.f5383a;
        if (!TextUtils.isEmpty(lVar.b().getUserName())) {
            HashMap hashMap2 = f5315e;
            String userName = lVar.b().getUserName();
            if (userName != null) {
                str2 = userName;
            }
            hashMap2.put("uname", str2);
        }
        e eVar = e.f5339a;
        HashMap hashMap3 = f5315e;
        AppBean appBean3 = f5313c;
        if (appBean3 != null) {
            j10 = appBean3.getSt();
        } else {
            j10 = 0;
        }
        AppBean appBean4 = f5313c;
        if (appBean4 != null) {
            j11 = appBean4.getEt();
        } else {
            j11 = 0;
        }
        return eVar.c("app", hashMap3, j10, j11, z10);
    }

    public final void d(long j10, long j11, String str, String str2, int i10, String str3, HashMap hashMap, boolean z10) {
        t9.i.g(str, "uri");
        t9.i.g(str2, "domain");
        if (i10 >= 0) {
            i2.d.f14275c.a().f(new a(str3, hashMap, i10, str, z10, str2, j10, j11));
        }
    }

    public final void f() {
        AppBean appBean = f5313c;
        if (appBean != null && appBean != null) {
            appBean.setEt(i2.h.f14287a.a() + (SystemClock.elapsedRealtime() - i2.a.f14261a.g()));
        }
    }

    public final void g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        t9.i.g(str, "mCode");
        t9.i.g(str2, "title");
        t9.i.g(str3, Constants.KEY_HOST);
        t9.i.g(str4, "bussType");
        t9.i.g(str5, "cdnType");
        t9.i.g(str6, "hCode");
        t9.i.g(str7, "eCode");
        t9.i.g(str8, "uri");
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.put("mCode", str);
        hashMap.put("cdnType", str5);
        hashMap.put("bussType", str4);
        hashMap.put("eCode", str7);
        hashMap.put("title", str2);
        hashMap.put(Constants.KEY_HOST, str3);
        hashMap.put("hCode", str6);
        hashMap.put("uri", str8);
        e.f5339a.a("app_error_hint", hashMap, elapsedRealtime, elapsedRealtime, false, true);
    }

    public final void h(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, HashMap hashMap) {
        boolean z10;
        t9.i.g(str, "mCode");
        t9.i.g(str2, Constants.KEY_HOST);
        t9.i.g(str3, "bussType");
        t9.i.g(str4, "cdnType");
        t9.i.g(str5, "title");
        t9.i.g(str6, "eCode");
        if (str6.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i2.d.f14275c.a().f(new b(str, str4, str3, str6, str8, str9, str5, str2, str7, str10, str11, str12, hashMap));
        }
    }

    public final void i() {
        if (f5313c != null) {
            i.f5350q.a().G(c(false));
        }
        f5313c = null;
    }

    public final void j(HashMap hashMap) {
        t9.i.g(hashMap, DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS);
        f5315e = hashMap;
    }

    public final void k(long j10) {
        if (f5313c == null) {
            if (j10 == 0) {
                j10 = i2.h.f14287a.a() + (SystemClock.elapsedRealtime() - i2.a.f14261a.g());
            }
            long j11 = j10;
            l lVar = l.f5383a;
            f5313c = new AppBean(lVar.b().getAppVer(), lVar.b().getSysVer(), lVar.b().getUserId(), lVar.b().getUserName(), j11, 1000 + j11, f5314d);
            i.f5350q.a().G(c(true));
        }
    }

    public final void m(long j10) {
        Observable compose = Observable.just("ioSchedulers").compose(s2.c.b());
        final c cVar = new c(j10);
        Consumer consumer = new Consumer() { // from class: c2.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                d.n(s9.l.this, obj);
            }
        };
        final C0079d c0079d = C0079d.f5338a;
        compose.subscribe(consumer, new Consumer() { // from class: c2.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                d.o(s9.l.this, obj);
            }
        });
    }

    public final void p(String str) {
        t9.i.g(str, "reverseSign");
        f5314d = str;
    }

    public final void q(boolean z10, boolean z11) {
        long j10;
        long j11;
        if (f5313c != null) {
            long a10 = i2.h.f14287a.a();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AppBean appBean = f5313c;
            long j12 = 0;
            if (appBean != null) {
                j10 = appBean.getEt();
            } else {
                j10 = 0;
            }
            i2.a aVar = i2.a.f14261a;
            if (aVar.g() < 1) {
                aVar.m(elapsedRealtime);
            } else {
                j10 = a10 + (elapsedRealtime - aVar.g());
            }
            AppBean appBean2 = f5313c;
            if (appBean2 != null) {
                if (appBean2 != null) {
                    j11 = appBean2.getSt();
                } else {
                    j11 = 0;
                }
                if (j10 < j11) {
                    long j13 = 60000;
                    AppBean appBean3 = f5313c;
                    if (appBean3 != null) {
                        j12 = appBean3.getSt();
                    }
                    j10 = j13 + j12;
                }
                AppBean appBean4 = f5313c;
                if (appBean4 != null) {
                    appBean4.setEt(j10);
                }
                i.f5350q.a().G(c(z10));
                if (!z10) {
                    f5313c = null;
                }
            }
        }
    }
}
