package b6;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Html;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import b6.r0;
import b6.r1;
import b6.z;
import b8.a;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.common.images.WebImage;
import com.google.gson.Gson;
import com.hpplay.component.protocol.plist.ASCIIPropertyListParser;
import com.hpplay.sdk.source.common.global.Constant;
import com.mobile.brasiltv.R$id;
import com.mobile.brasiltv.activity.CastByNativeDeviceAty;
import com.mobile.brasiltv.activity.MainAty;
import com.mobile.brasiltv.bean.BaseGuideManager;
import com.mobile.brasiltv.bean.GuideNextClickListener;
import com.mobile.brasiltv.bean.LiveFeedBackGuideManager;
import com.mobile.brasiltv.bean.event.AlreadyQueryFavEvent;
import com.mobile.brasiltv.bean.event.CastPlaySuccessEvent;
import com.mobile.brasiltv.bean.event.CastToCloseFloatViewEvent;
import com.mobile.brasiltv.bean.event.CastToCloseOtherPlayEvent;
import com.mobile.brasiltv.bean.event.CastToPlayEvent;
import com.mobile.brasiltv.bean.event.CheckPwdSuccessEvent;
import com.mobile.brasiltv.bean.event.FullScreenEvent;
import com.mobile.brasiltv.bean.event.GoogleCastToPlayEvent;
import com.mobile.brasiltv.bean.event.NetworkEvent;
import com.mobile.brasiltv.bean.event.ReadyPlayFavEvent;
import com.mobile.brasiltv.bean.event.RefreshEPGEvent;
import com.mobile.brasiltv.bean.event.UpdateChannelEvent;
import com.mobile.brasiltv.bean.event.UpdateFavStatusEvent;
import com.mobile.brasiltv.bean.event.UpdateFullScreenSortEvent;
import com.mobile.brasiltv.bean.event.UpdateHighLightEvent;
import com.mobile.brasiltv.bean.event.UserIdentityChangeEvent;
import com.mobile.brasiltv.mine.activity.AccountBindAty;
import com.mobile.brasiltv.mine.activity.LoginAty;
import com.mobile.brasiltv.player.TitanPlayerController;
import com.mobile.brasiltv.utils.f1;
import com.mobile.brasiltv.utils.g;
import com.mobile.brasiltv.view.AnimatorFrameLayout;
import com.mobile.brasiltv.view.AutoHideRelativeLayout;
import com.mobile.brasiltv.view.KoocanRecyclerView;
import com.mobile.brasiltv.view.LinearLayoutManagerWrapper;
import com.mobile.brasiltv.view.RatioFrameLayout;
import com.mobile.brasiltv.view.RoundedDrawable;
import com.mobile.brasiltv.view.dialog.BindEmailOrPhoneNotification;
import com.mobile.brasiltv.view.dialog.CommTipsDialog;
import com.mobile.brasiltv.view.dialog.CommonDialog;
import com.mobile.brasiltv.view.dialog.GuideDialog;
import com.mobile.brasiltv.view.dialog.feedback.CastFeedBackDialog;
import com.mobile.brasiltv.view.dialog.feedback.FeedBackDialog;
import com.msandroid.mobile.R;
import com.titan.cast.bean.Device;
import com.titan.ranger.Status;
import com.titan.ranger.bean.Media;
import com.titan.ranger.bean.Program;
import com.titans.widget.TitanVideoView;
import com.umeng.analytics.pro.q;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;
import com.zhy.autolayout.utils.AutoUtils;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import j6.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import mobile.com.requestframe.utils.response.Channel;
import mobile.com.requestframe.utils.response.ChildColumnList;
import mobile.com.requestframe.utils.response.EpgResultData;
import mobile.com.requestframe.utils.response.GetLiveData;
import mobile.com.requestframe.utils.response.GetLiveDataResult;
import org.android.agoo.common.AgooConstants;
import org.greenrobot.eventbus.ThreadMode;
import q5.j;
import w6.i;
import z5.c;
/* loaded from: classes.dex */
public final class r1 extends b6.f implements View.OnClickListener, KoocanRecyclerView.OnVisibility, j6.g, c.d, c.e, o8.a {

    /* renamed from: n0  reason: collision with root package name */
    public static final a f4909n0 = new a(null);

    /* renamed from: o0  reason: collision with root package name */
    public static q5.j f4910o0;
    public g6.d A;
    public Disposable B;
    public Program J;
    public boolean K;
    public boolean L;
    public String M;
    public Integer N;
    public boolean Q;
    public String S;
    public Channel W;
    public int X;
    public long Y;
    public boolean Z;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f4913f0;

    /* renamed from: h0  reason: collision with root package name */
    public PopupWindow f4917h0;

    /* renamed from: i  reason: collision with root package name */
    public int f4918i;

    /* renamed from: i0  reason: collision with root package name */
    public b8.b f4919i0;

    /* renamed from: k  reason: collision with root package name */
    public Channel f4922k;

    /* renamed from: k0  reason: collision with root package name */
    public Float f4923k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4924l;

    /* renamed from: m  reason: collision with root package name */
    public g5.j0 f4926m;

    /* renamed from: n  reason: collision with root package name */
    public g5.o0 f4928n;

    /* renamed from: o  reason: collision with root package name */
    public AudioManager f4929o;

    /* renamed from: q  reason: collision with root package name */
    public CommonDialog f4931q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4932r;

    /* renamed from: s  reason: collision with root package name */
    public Disposable f4933s;

    /* renamed from: t  reason: collision with root package name */
    public Disposable f4934t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4935u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4936v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4937w;

    /* renamed from: x  reason: collision with root package name */
    public l6.g0 f4938x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4939y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4940z;

    /* renamed from: m0  reason: collision with root package name */
    public Map f4927m0 = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final String f4911e = s4();

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f4912f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f4914g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public int f4916h = -1;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f4920j = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public int f4930p = 7;
    public z5.c C = new z5.c();
    public String D = "";
    public String E = "";
    public String F = "";
    public String G = "";
    public String H = "";
    public String I = "";
    public boolean O = true;
    public final h9.g V = h9.h.b(r.f4979a);

    /* renamed from: g0  reason: collision with root package name */
    public final s f4915g0 = new s();

    /* renamed from: j0  reason: collision with root package name */
    public TitanPlayerController.b f4921j0 = TitanPlayerController.b.NONE;

    /* renamed from: l0  reason: collision with root package name */
    public c f4925l0 = new c();

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(t9.g gVar) {
            this();
        }

        public final q5.j a() {
            return r1.f4910o0;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a0 extends t9.j implements s9.l {
        public a0() {
            super(1);
        }

        public final void b(CommTipsDialog commTipsDialog) {
            boolean z10;
            t9.i.g(commTipsDialog, "it");
            commTipsDialog.dismiss();
            if (d6.b.f12660a.y()) {
                com.mobile.brasiltv.utils.b0.a0(r1.this, AccountBindAty.class);
                return;
            }
            i.c cVar = w6.i.f19214g;
            if (cVar.g().length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                com.mobile.brasiltv.utils.b0.k0(r1.this, cVar.g(), false, true, false, 8, null);
            }
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CommTipsDialog) obj);
            return h9.t.f14242a;
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4942a;

        static {
            int[] iArr = new int[TitanPlayerController.b.values().length];
            try {
                iArr[TitanPlayerController.b.VOLUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TitanPlayerController.b.BRIGHTNESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TitanPlayerController.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TitanPlayerController.b.FF_REW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f4942a = iArr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b0 extends t9.j implements s9.l {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f4943a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ r1 f4944b;

        /* loaded from: classes3.dex */
        public static final class a extends t9.j implements s9.l {

            /* renamed from: a  reason: collision with root package name */
            public static final a f4945a = new a();

            public a() {
                super(1);
            }

            @Override // s9.l
            /* renamed from: b */
            public final Intent invoke(Intent intent) {
                t9.i.g(intent, "intent");
                Intent putExtra = intent.putExtra("experience_mode", true);
                t9.i.f(putExtra, "intent.putExtra(Constant…ST_EXPERIENCE_MODE, true)");
                return putExtra;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(boolean z10, r1 r1Var) {
            super(1);
            this.f4943a = z10;
            this.f4944b = r1Var;
        }

        public final void b(CommTipsDialog commTipsDialog) {
            t9.i.g(commTipsDialog, "it");
            if (!this.f4943a) {
                return;
            }
            com.mobile.brasiltv.utils.i1.g(this.f4944b.getActivity(), "EVENT_CAST_EXPERIENCE_VOD_CLICK");
            com.mobile.brasiltv.utils.b0.b0(this.f4944b, CastByNativeDeviceAty.class, a.f4945a);
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CommTipsDialog) obj);
            return h9.t.f14242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements g.b {
        public c() {
        }

        public static final void i(r1 r1Var, int i10, String str, String str2) {
            t9.i.g(r1Var, "this$0");
            t9.i.g(str, "$extra");
            if (com.mobile.brasiltv.utils.h.f8694a.t()) {
                com.mobile.brasiltv.utils.g.f8651a.G();
            }
            xa.c.c().j(new CastToCloseFloatViewEvent());
            if (i10 != 501 && i10 != 701) {
                TextView textView = (TextView) r1Var.x3(R$id.mTvCastRecommendHint);
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = (TextView) r1Var.x3(R$id.mTvCastErrorHint);
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            } else {
                TextView textView3 = (TextView) r1Var.x3(R$id.mTvCastRecommendHint);
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                int i11 = R$id.mTvCastErrorHint;
                TextView textView4 = (TextView) r1Var.x3(i11);
                if (textView4 != null) {
                    textView4.setText(r1Var.getResources().getString(R.string.cast_restart_device));
                }
                TextView textView5 = (TextView) r1Var.x3(i11);
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
            }
            int i12 = R$id.mTvCastState;
            TextView textView6 = (TextView) r1Var.x3(i12);
            if (textView6 != null) {
                Context context = r1Var.getContext();
                t9.i.d(context);
                textView6.setText(context.getResources().getString(R.string.cast_status_casting_failed));
            }
            ((TextView) r1Var.x3(i12)).append(ASCIIPropertyListParser.ARRAY_BEGIN_TOKEN + str2 + ASCIIPropertyListParser.DATE_DATE_FIELD_DELIMITER + i10 + ASCIIPropertyListParser.ARRAY_END_TOKEN);
            Context context2 = r1Var.getContext();
            t9.i.d(context2);
            ((TextView) r1Var.x3(i12)).setTextColor(context2.getResources().getColor(R.color.color_f72f2f));
            ((TextView) r1Var.x3(R$id.mTvPleaseWait)).setVisibility(8);
        }

        public static final void j(r1 r1Var) {
            t9.i.g(r1Var, "this$0");
            xa.c.c().j(new CastPlaySuccessEvent("LIVE"));
            int i10 = R$id.mTvCastState;
            TextView textView = (TextView) r1Var.x3(i10);
            if (textView != null) {
                Context context = r1Var.getContext();
                t9.i.d(context);
                textView.setText(context.getResources().getString(R.string.cast_status_casting));
            }
            TextView textView2 = (TextView) r1Var.x3(i10);
            if (textView2 != null) {
                Context context2 = r1Var.getContext();
                t9.i.d(context2);
                textView2.setTextColor(context2.getResources().getColor(R.color.color_fffefe));
            }
            TextView textView3 = (TextView) r1Var.x3(R$id.mTvPleaseWait);
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            TextView textView4 = (TextView) r1Var.x3(R$id.mTvCastRecommendHint);
            if (textView4 != null) {
                textView4.setVisibility(4);
            }
            TextView textView5 = (TextView) r1Var.x3(R$id.mTvCastErrorHint);
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            r1Var.c5();
        }

        public static final void k(r1 r1Var, long j10, long j11) {
            t9.i.g(r1Var, "this$0");
            int i10 = R$id.mTvCastState;
            TextView textView = (TextView) r1Var.x3(i10);
            if (textView != null) {
                Context context = r1Var.getContext();
                t9.i.d(context);
                textView.setText(context.getResources().getString(R.string.cast_status_casting));
            }
            TextView textView2 = (TextView) r1Var.x3(i10);
            if (textView2 != null) {
                Context context2 = r1Var.getContext();
                t9.i.d(context2);
                textView2.setTextColor(context2.getResources().getColor(R.color.color_fffefe));
            }
            TextView textView3 = (TextView) r1Var.x3(R$id.mTvPleaseWait);
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            TextView textView4 = (TextView) r1Var.x3(R$id.mTvCastRecommendHint);
            if (textView4 != null) {
                textView4.setVisibility(4);
            }
            TextView textView5 = (TextView) r1Var.x3(R$id.mTvCastErrorHint);
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
        }

        public static final void l(r1 r1Var) {
            String str;
            t9.i.g(r1Var, "this$0");
            xa.c.c().j(new CastToCloseFloatViewEvent());
            TextView textView = (TextView) r1Var.x3(R$id.mTvCastRecommendHint);
            if (textView != null) {
                textView.setVisibility(8);
            }
            int i10 = R$id.mTvCastErrorHint;
            TextView textView2 = (TextView) r1Var.x3(i10);
            if (textView2 != null) {
                Context context = r1Var.getContext();
                if (context != null) {
                    str = com.mobile.brasiltv.utils.x.f8754a.y(context, R.string.failed_cast_play);
                } else {
                    str = null;
                }
                textView2.setText(str);
            }
            TextView textView3 = (TextView) r1Var.x3(i10);
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            int i11 = R$id.mTvCastState;
            TextView textView4 = (TextView) r1Var.x3(i11);
            if (textView4 != null) {
                Context context2 = r1Var.getContext();
                t9.i.d(context2);
                textView4.setText(context2.getResources().getString(R.string.cast_status_casting_failed));
            }
            TextView textView5 = (TextView) r1Var.x3(i11);
            if (textView5 != null) {
                Context context3 = r1Var.getContext();
                t9.i.d(context3);
                textView5.setTextColor(context3.getResources().getColor(R.color.color_f72f2f));
            }
            TextView textView6 = (TextView) r1Var.x3(R$id.mTvPleaseWait);
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
        }

        @Override // com.mobile.brasiltv.utils.g.b
        public void a() {
        }

        @Override // com.mobile.brasiltv.utils.g.b
        public void b(final int i10, final String str, final String str2) {
            t9.i.g(str, "extra");
            if (h()) {
                return;
            }
            final r1 r1Var = r1.this;
            ((AutoLinearLayout) r1.this.x3(R$id.llCastContainer)).post(new Runnable() { // from class: b6.t1
                @Override // java.lang.Runnable
                public final void run() {
                    r1.c.i(r1.this, i10, str, str2);
                }
            });
        }

        @Override // com.mobile.brasiltv.utils.g.b
        public void d() {
            if (h()) {
                return;
            }
            final r1 r1Var = r1.this;
            ((AutoLinearLayout) r1.this.x3(R$id.llCastContainer)).post(new Runnable() { // from class: b6.s1
                @Override // java.lang.Runnable
                public final void run() {
                    r1.c.j(r1.this);
                }
            });
        }

        public final boolean h() {
            if (r1.this.isDetached()) {
                com.mobile.brasiltv.utils.g.f8651a.w(null);
                return true;
            }
            return false;
        }

        @Override // com.mobile.brasiltv.utils.g.b
        public void onLoading() {
            xa.c.c().j(new CastPlaySuccessEvent("LIVE"));
        }

        @Override // com.mobile.brasiltv.utils.g.b
        public void onPositionUpdate(final long j10, final long j11) {
            if (h()) {
                return;
            }
            final r1 r1Var = r1.this;
            ((AutoLinearLayout) r1.this.x3(R$id.llCastContainer)).post(new Runnable() { // from class: b6.u1
                @Override // java.lang.Runnable
                public final void run() {
                    r1.c.k(r1.this, j10, j11);
                }
            });
        }

        @Override // com.mobile.brasiltv.utils.g.b
        public void onStop() {
            if (h()) {
                return;
            }
            final r1 r1Var = r1.this;
            ((AutoLinearLayout) r1.this.x3(R$id.llCastContainer)).post(new Runnable() { // from class: b6.v1
                @Override // java.lang.Runnable
                public final void run() {
                    r1.c.l(r1.this);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static final class c0 extends t9.j implements s9.l {
        public c0() {
            super(1);
        }

        public final void b(CommTipsDialog commTipsDialog) {
            t9.i.g(commTipsDialog, "it");
            commTipsDialog.dismiss();
            r1.this.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CommTipsDialog) obj);
            return h9.t.f14242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends t9.j implements s9.l {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f4949b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ long f4950c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, long j10) {
            super(1);
            this.f4949b = context;
            this.f4950c = j10;
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return h9.t.f14242a;
        }

        public final void invoke(String str) {
            r1 r1Var = r1.this;
            p6.a aVar = p6.a.f18068a;
            Context context = this.f4949b;
            t9.i.f(context, "it");
            r1Var.M = aVar.a(context, (int) this.f4950c);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d0 extends t9.j implements s9.l {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f4951a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f4952b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ r1 f4953c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(Context context, int i10, r1 r1Var) {
            super(1);
            this.f4951a = context;
            this.f4952b = i10;
            this.f4953c = r1Var;
        }

        public static final void c(String str) {
            f1.a aVar = com.mobile.brasiltv.utils.f1.f8649a;
            aVar.u(str + ' ' + w6.i.f19214g.H());
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return h9.t.f14242a;
        }

        public final void invoke(String str) {
            androidx.fragment.app.e activity;
            p6.b bVar = p6.b.f18069a;
            Context context = this.f4951a;
            t9.i.f(context, "it");
            final String a10 = bVar.a(context, this.f4952b);
            if ((a10 == null || a10.length() == 0) || !this.f4953c.K4() || (activity = this.f4953c.getActivity()) == null) {
                return;
            }
            activity.runOnUiThread(new Runnable() { // from class: b6.b2
                @Override // java.lang.Runnable
                public final void run() {
                    r1.d0.c(a10);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends t9.j implements s9.l {
        public e() {
            super(1);
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return h9.t.f14242a;
        }

        public final void invoke(String str) {
            f1.a aVar = com.mobile.brasiltv.utils.f1.f8649a;
            StringBuilder sb = new StringBuilder();
            sb.append("EC21-");
            t9.z zVar = t9.z.f18964a;
            String string = r1.this.getString(R.string.failed_play_consult_dealer);
            t9.i.f(string, "getString(R.string.failed_play_consult_dealer)");
            String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
            t9.i.f(format, "format(format, *args)");
            sb.append(format);
            aVar.x(sb.toString());
        }
    }

    /* loaded from: classes3.dex */
    public static final class e0 implements GuideNextClickListener {
        public e0() {
        }

        @Override // com.mobile.brasiltv.bean.GuideNextClickListener
        public void onGuideNextClick(String str, boolean z10) {
            if (z10) {
                q5.j a10 = r1.f4909n0.a();
                if (a10 != null) {
                    a10.x();
                }
                ((AutoHideRelativeLayout) r1.this.x3(R$id.mLiveControlPanelLandscape)).delayHide();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class f extends t9.j implements s9.l {
        public f() {
            super(1);
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Long) obj);
            return h9.t.f14242a;
        }

        public final void invoke(Long l10) {
            if (r1.this.f4935u) {
                return;
            }
            r1.this.F4();
        }
    }

    /* loaded from: classes3.dex */
    public static final class f0 extends t9.j implements s9.l {

        /* renamed from: a  reason: collision with root package name */
        public static final f0 f4957a = new f0();

        public f0() {
            super(1);
        }

        @Override // s9.l
        /* renamed from: b */
        public final Boolean invoke(Long l10) {
            t9.i.g(l10, "it");
            return Boolean.valueOf(r5.i.f18523a.I());
        }
    }

    /* loaded from: classes3.dex */
    public static final class g extends t9.j implements s9.l {

        /* renamed from: a  reason: collision with root package name */
        public static final g f4958a = new g();

        public g() {
            super(1);
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return h9.t.f14242a;
        }

        public final void invoke(Throwable th) {
            th.printStackTrace();
        }
    }

    /* loaded from: classes3.dex */
    public static final class g0 implements Observer {
        public g0() {
        }

        public void a(long j10) {
            Disposable disposable = r1.this.B;
            if (disposable != null) {
                disposable.dispose();
            }
            r1.this.O3();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            r5.i iVar = r5.i.f18523a;
            iVar.K(true);
            iVar.L("32600");
            r1.this.O3();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            t9.i.g(th, "e");
        }

        @Override // io.reactivex.Observer
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            a(((Number) obj).longValue());
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            t9.i.g(disposable, "d");
            r1.this.B = disposable;
        }
    }

    /* loaded from: classes3.dex */
    public static final class h extends t9.j implements s9.l {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4960a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(1);
            this.f4960a = str;
        }

        @Override // s9.l
        /* renamed from: b */
        public final ObservableSource invoke(ArrayList arrayList) {
            t9.i.g(arrayList, "list");
            String str = this.f4960a;
            int i10 = 0;
            for (Object obj : arrayList) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    i9.j.j();
                }
                if (t9.i.b(str, ((Channel) obj).getChannelCode())) {
                    return Observable.just(Integer.valueOf(i10));
                }
                i10 = i11;
            }
            return Observable.just(-1);
        }
    }

    /* loaded from: classes3.dex */
    public static final class h0 extends t9.j implements s9.l {
        public h0() {
            super(1);
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return h9.t.f14242a;
        }

        public final void invoke(String str) {
            r1 r1Var = r1.this;
            StringBuilder sb = new StringBuilder();
            sb.append("EC21-");
            t9.z zVar = t9.z.f18964a;
            String string = r1.this.getString(R.string.failed_play_consult_dealer);
            t9.i.f(string, "getString(R.string.failed_play_consult_dealer)");
            String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
            t9.i.f(format, "format(format, *args)");
            sb.append(format);
            r1Var.z0(sb.toString());
        }
    }

    /* loaded from: classes3.dex */
    public static final class i extends t9.j implements s9.l {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f4963b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z10) {
            super(1);
            this.f4963b = z10;
        }

        public final void b(Integer num) {
            g5.j0 j0Var = r1.this.f4926m;
            if (j0Var == null) {
                t9.i.w("adapterChannel");
                j0Var = null;
            }
            t9.i.f(num, "it");
            j0Var.c(num.intValue());
            if (this.f4963b && num.intValue() != -1) {
                ((KoocanRecyclerView) r1.this.x3(R$id.mRecyclerChannel)).scrollToPosition(num.intValue());
            }
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Integer) obj);
            return h9.t.f14242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class j extends t9.j implements s9.l {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4964a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(1);
            this.f4964a = str;
        }

        @Override // s9.l
        /* renamed from: b */
        public final ObservableSource invoke(ArrayList arrayList) {
            t9.i.g(arrayList, "list");
            String str = this.f4964a;
            int i10 = 0;
            for (Object obj : arrayList) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    i9.j.j();
                }
                if (t9.i.b(str, ((Channel) obj).getChannelCode())) {
                    return Observable.just(Integer.valueOf(i10));
                }
                i10 = i11;
            }
            return Observable.just(-1);
        }
    }

    /* loaded from: classes3.dex */
    public static final class k extends t9.j implements s9.l {
        public k() {
            super(1);
        }

        public final void b(Integer num) {
            if (num == null || num.intValue() != -1) {
                t9.i.f(num, "it");
                ((KoocanRecyclerView) r1.this.x3(R$id.mRecyclerChannel)).scrollToPosition(num.intValue());
            }
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Integer) obj);
            return h9.t.f14242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class l implements j.d {
        @Override // q5.j.d
        public void a() {
        }

        @Override // q5.j.d
        public void b() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class m extends b8.b {
        public m(androidx.fragment.app.e eVar) {
            super(eVar);
        }

        @Override // b8.b
        public void f(int i10) {
            if (i10 == 0) {
                r1 r1Var = r1.this;
                int i11 = R$id.mIconSilence;
                ((ImageView) r1Var.x3(i11)).setTag(Boolean.TRUE);
                ((ImageView) r1.this.x3(i11)).setImageResource(R.drawable.ic_live_volume_off);
            } else {
                r1 r1Var2 = r1.this;
                int i12 = R$id.mIconSilence;
                if (t9.i.b(((ImageView) r1Var2.x3(i12)).getTag(), Boolean.TRUE)) {
                    ((ImageView) r1.this.x3(i12)).setTag(Boolean.FALSE);
                    ((ImageView) r1.this.x3(i12)).setImageResource(R.drawable.ic_live_volume_on);
                }
            }
            if (((AutoHideRelativeLayout) r1.this.x3(R$id.mLiveControlPanelLandscape)).getVisibility() == 0) {
                ((ProgressBar) r1.this.x3(R$id.mPbVolume)).setProgress((i10 * 100) / r1.this.p4().e());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class n extends t9.j implements s9.l {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f4968b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i10) {
            super(1);
            this.f4968b = i10;
        }

        public final void b(GetLiveDataResult getLiveDataResult) {
            GetLiveData data = getLiveDataResult.getData();
            t9.i.d(data);
            if (!TextUtils.isEmpty(data.getDataVersion())) {
                com.mobile.brasiltv.utils.n0 n0Var = com.mobile.brasiltv.utils.n0.f8733a;
                Context context = r1.this.getContext();
                t9.i.d(context);
                GetLiveData data2 = getLiveDataResult.getData();
                t9.i.d(data2);
                n0Var.j(context, "DATA_VERSION" + this.f4968b, data2.getDataVersion());
            }
            GetLiveData data3 = getLiveDataResult.getData();
            t9.i.d(data3);
            if (!TextUtils.isEmpty(data3.getExpireTimeStr())) {
                com.mobile.brasiltv.utils.n0 n0Var2 = com.mobile.brasiltv.utils.n0.f8733a;
                Context context2 = r1.this.getContext();
                t9.i.d(context2);
                GetLiveData data4 = getLiveDataResult.getData();
                t9.i.d(data4);
                n0Var2.j(context2, "EXPIRE_TIME" + this.f4968b, data4.getExpireTimeStr());
            }
            String json = new Gson().toJson(getLiveDataResult);
            if (!TextUtils.isEmpty(json)) {
                na.f.m(r1.this.getContext(), String.valueOf(this.f4968b), String.valueOf(this.f4968b), json);
            }
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetLiveDataResult) obj);
            return h9.t.f14242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o extends ha.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f4970b;

        /* loaded from: classes3.dex */
        public static final class a extends t9.j implements s9.l {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ r1 f4971a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ int f4972b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ t9.w f4973c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r1 r1Var, int i10, t9.w wVar) {
                super(1);
                this.f4971a = r1Var;
                this.f4972b = i10;
                this.f4973c = wVar;
            }

            public final void b(GetLiveData getLiveData) {
                this.f4971a.Z4(getLiveData.getChannelList(), this.f4972b);
                Disposable disposable = (Disposable) this.f4973c.f18961a;
                if (disposable != null) {
                    disposable.dispose();
                }
            }

            @Override // s9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((GetLiveData) obj);
                return h9.t.f14242a;
            }
        }

        /* loaded from: classes3.dex */
        public static final class b extends t9.j implements s9.l {

            /* renamed from: a  reason: collision with root package name */
            public static final b f4974a = new b();

            public b() {
                super(1);
            }

            @Override // s9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return h9.t.f14242a;
            }

            public final void invoke(Throwable th) {
                th.printStackTrace();
            }
        }

        /* loaded from: classes3.dex */
        public static final class c extends t9.j implements s9.l {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f4975a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super(1);
                this.f4975a = str;
            }

            @Override // s9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return h9.t.f14242a;
            }

            public final void invoke(String str) {
                com.mobile.brasiltv.utils.y yVar = com.mobile.brasiltv.utils.y.f8771a;
                com.mobile.brasiltv.utils.f1.f8649a.x(com.mobile.brasiltv.utils.y.p(yVar, this.f4975a, yVar.f(), null, 4, null));
            }
        }

        /* loaded from: classes3.dex */
        public static final class d extends t9.j implements s9.l {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ t9.w f4976a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(t9.w wVar) {
                super(1);
                this.f4976a = wVar;
            }

            public final void b(Disposable disposable) {
                this.f4976a.f18961a = disposable;
            }

            @Override // s9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Disposable) obj);
                return h9.t.f14242a;
            }
        }

        public o(int i10) {
            this.f4970b = i10;
        }

        public static final void l(String str, r1 r1Var, int i10, ObservableEmitter observableEmitter) {
            t9.i.g(str, "$returnCode");
            t9.i.g(r1Var, "this$0");
            t9.i.g(observableEmitter, "it");
            if (t9.i.b(str, "304")) {
                String h10 = na.f.h(r1Var.getContext(), String.valueOf(i10), String.valueOf(i10));
                if (!TextUtils.isEmpty(h10)) {
                    GetLiveDataResult getLiveDataResult = (GetLiveDataResult) new Gson().fromJson(h10, (Class<Object>) GetLiveDataResult.class);
                    if (getLiveDataResult.getData() != null) {
                        GetLiveData data = getLiveDataResult.getData();
                        t9.i.d(data);
                        observableEmitter.onNext(data);
                    }
                } else {
                    com.mobile.brasiltv.utils.n0 n0Var = com.mobile.brasiltv.utils.n0.f8733a;
                    Context context = r1Var.getContext();
                    t9.i.d(context);
                    n0Var.k(context, new String[]{"DATA_VERSION" + i10, "EXPIRE_TIME" + i10}, new String[]{"", ""});
                }
            }
            observableEmitter.onComplete();
        }

        public static final void m(s9.l lVar, Object obj) {
            t9.i.g(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        public static final void n(s9.l lVar, Object obj) {
            t9.i.g(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        public static final void o(r1 r1Var, String str) {
            t9.i.g(r1Var, "this$0");
            t9.i.g(str, "$returnCode");
            com.mobile.brasiltv.utils.x xVar = com.mobile.brasiltv.utils.x.f8754a;
            Context context = r1Var.getContext();
            t9.i.d(context);
            xVar.w(context, new c(str));
            r1Var.Y4();
        }

        public static final void p(s9.l lVar, Object obj) {
            t9.i.g(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        @Override // ha.a, io.reactivex.Observer
        /* renamed from: k */
        public void onNext(GetLiveDataResult getLiveDataResult) {
            t9.i.g(getLiveDataResult, "it");
            if (getLiveDataResult.getData() != null) {
                GetLiveData data = getLiveDataResult.getData();
                t9.i.d(data);
                if (com.mobile.brasiltv.utils.b0.I(data.getChannelList())) {
                    r1 r1Var = r1.this;
                    GetLiveData data2 = getLiveDataResult.getData();
                    t9.i.d(data2);
                    r1Var.Z4(data2.getChannelList(), this.f4970b);
                    return;
                }
            }
            r1.this.Y4();
        }

        @Override // ha.a
        public void showErrorHint(final String str) {
            t9.i.g(str, "returnCode");
            t9.w wVar = new t9.w();
            final r1 r1Var = r1.this;
            final int i10 = this.f4970b;
            Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: b6.w1
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) {
                    r1.o.l(str, r1Var, i10, observableEmitter);
                }
            }).compose(com.mobile.brasiltv.utils.p0.b());
            final a aVar = new a(r1.this, this.f4970b, wVar);
            Consumer consumer = new Consumer() { // from class: b6.x1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    r1.o.m(s9.l.this, obj);
                }
            };
            final b bVar = b.f4974a;
            Consumer<? super Throwable> consumer2 = new Consumer() { // from class: b6.y1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    r1.o.n(s9.l.this, obj);
                }
            };
            final r1 r1Var2 = r1.this;
            Action action = new Action() { // from class: b6.z1
                @Override // io.reactivex.functions.Action
                public final void run() {
                    r1.o.o(r1.this, str);
                }
            };
            final d dVar = new d(wVar);
            compose.subscribe(consumer, consumer2, action, new Consumer() { // from class: b6.a2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    r1.o.p(s9.l.this, obj);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static final class p extends t9.j implements s9.l {
        public p() {
            super(1);
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Long) obj);
            return h9.t.f14242a;
        }

        public final void invoke(Long l10) {
            ((AutoFrameLayout) r1.this.x3(R$id.mFlLocked)).setVisibility(8);
        }
    }

    /* loaded from: classes3.dex */
    public static final class q extends t9.j implements s9.l {

        /* renamed from: a  reason: collision with root package name */
        public static final q f4978a = new q();

        public q() {
            super(1);
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return h9.t.f14242a;
        }

        public final void invoke(Throwable th) {
            th.printStackTrace();
        }
    }

    /* loaded from: classes3.dex */
    public static final class r extends t9.j implements s9.a {

        /* renamed from: a  reason: collision with root package name */
        public static final r f4979a = new r();

        public r() {
            super(0);
        }

        @Override // s9.a
        /* renamed from: b */
        public final u6.b invoke() {
            return new u6.b();
        }
    }

    /* loaded from: classes3.dex */
    public static final class s implements RecyclerView.s {
        public s() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            t9.i.g(recyclerView, "rv");
            t9.i.g(motionEvent, "event");
            if (motionEvent.getAction() == 0) {
                r1.this.f4935u = true;
                Disposable disposable = r1.this.f4933s;
                if (disposable != null) {
                    disposable.dispose();
                }
            } else if (motionEvent.getAction() == 1) {
                r1.this.f4935u = false;
                r1.this.f4();
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onRequestDisallowInterceptTouchEvent(boolean z10) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            t9.i.g(recyclerView, "rv");
            t9.i.g(motionEvent, "e");
        }
    }

    /* loaded from: classes3.dex */
    public static final class t extends t9.j implements s9.l {

        /* renamed from: a  reason: collision with root package name */
        public static final t f4981a = new t();

        public t() {
            super(1);
        }

        @Override // s9.l
        /* renamed from: b */
        public final Intent invoke(Intent intent) {
            t9.i.g(intent, "intent");
            Intent putExtra = intent.putExtra("from_type", "LIVE");
            t9.i.f(putExtra, "intent.putExtra(Constant… Constant.FROM_TYPE_LIVE)");
            return putExtra;
        }
    }

    /* loaded from: classes3.dex */
    public static final class u extends ha.a {
        @Override // ha.a
        public void showErrorHint(String str) {
            t9.i.g(str, "returnCode");
        }
    }

    /* loaded from: classes3.dex */
    public static final class v implements GestureDetector.OnGestureListener {
        public v() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            t9.i.g(motionEvent, "e");
            r1.this.f4921j0 = TitanPlayerController.b.NONE;
            r1.this.f4923k0 = Float.valueOf(motionEvent.getRawY());
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            t9.i.g(motionEvent2, "e2");
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            t9.i.g(motionEvent, "e");
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            t9.i.g(motionEvent2, "e2");
            if (!r1.this.f4936v && r1.this.J4() && ((AnimatorFrameLayout) r1.this.x3(R$id.mLayoutChannelList)).getVisibility() != 0) {
                return r1.this.B4(motionEvent, motionEvent2, f10, f11);
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            t9.i.g(motionEvent, "e");
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            t9.i.g(motionEvent, "e");
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public static final class w extends t9.j implements s9.l {

        /* renamed from: a  reason: collision with root package name */
        public static final w f4983a = new w();

        public w() {
            super(1);
        }

        @Override // s9.l
        /* renamed from: b */
        public final Intent invoke(Intent intent) {
            t9.i.g(intent, "intent");
            Intent putExtra = intent.putExtra("from_type", "LIVE");
            t9.i.f(putExtra, "intent.putExtra(Constant… Constant.FROM_TYPE_LIVE)");
            return putExtra;
        }
    }

    /* loaded from: classes3.dex */
    public static final class x extends OnItemClickListener {
        public x() {
        }

        @Override // com.chad.library.adapter.base.listener.OnItemClickListener
        public void onSimpleItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i10) {
            t9.i.g(baseQuickAdapter, "adapter");
            Object item = baseQuickAdapter.getItem(i10);
            t9.i.e(item, "null cannot be cast to non-null type kotlin.String");
            r1.D4(r1.this, (String) item, i10, false, 4, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class y extends OnItemClickListener {
        public y() {
        }

        @Override // com.chad.library.adapter.base.listener.OnItemClickListener
        public void onSimpleItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i10) {
            t9.i.g(baseQuickAdapter, "adapter");
            t9.i.g(view, "view");
            Object item = baseQuickAdapter.getItem(i10);
            t9.i.e(item, "null cannot be cast to non-null type mobile.com.requestframe.utils.response.Channel");
            Channel channel = (Channel) item;
            z.a aVar = b6.z.f5049u;
            if (aVar.b().get(channel.getChannelCode()) != null) {
                Object obj = aVar.b().get(channel.getChannelCode());
                t9.i.d(obj);
                channel = (Channel) obj;
            }
            r1.u4(r1.this, channel, i10, false, 4, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class z extends t9.j implements s9.l {
        public z() {
            super(1);
        }

        public final void b(CommTipsDialog commTipsDialog) {
            boolean z10;
            t9.i.g(commTipsDialog, "it");
            commTipsDialog.dismiss();
            if (d6.b.f12660a.y()) {
                com.mobile.brasiltv.utils.b0.a0(r1.this, AccountBindAty.class);
                return;
            }
            i.c cVar = w6.i.f19214g;
            if (cVar.g().length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                com.mobile.brasiltv.utils.b0.k0(r1.this, cVar.g(), false, true, false, 8, null);
            }
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CommTipsDialog) obj);
            return h9.t.f14242a;
        }
    }

    public static final void A5(r1 r1Var) {
        t9.i.g(r1Var, "this$0");
        String string = r1Var.getString(R.string.guide_live_feedback);
        t9.i.f(string, "getString(R.string.guide_live_feedback)");
        GuideDialog.Direction direction = GuideDialog.Direction.TOP_RIGHT;
        LiveFeedBackGuideManager liveFeedBackGuideManager = new LiveFeedBackGuideManager(r1Var.getContext(), (ImageView) r1Var.x3(R$id.mImageLandFeedback), "keyFirstPlayLIVE", string, direction);
        int i10 = R$id.mIconSave;
        if (((ImageView) r1Var.x3(i10)).getVisibility() == 0) {
            String string2 = r1Var.getString(R.string.guide_live_fav);
            t9.i.f(string2, "getString(R.string.guide_live_fav)");
            liveFeedBackGuideManager.addNextRecursion(new BaseGuideManager(r1Var.getContext(), (ImageView) r1Var.x3(i10), "keyFirstViewEPG", string2, direction, null, false, true, null, 352, null));
        }
        BaseGuideManager findFirstShow = liveFeedBackGuideManager.findFirstShow();
        if (findFirstShow != null) {
            int i11 = R$id.mLiveControlPanelLandscape;
            if (((AutoHideRelativeLayout) r1Var.x3(i11)).getVisibility() == 8) {
                ((AutoHideRelativeLayout) r1Var.x3(i11)).setVisibility(0);
            }
            ((AutoHideRelativeLayout) r1Var.x3(i11)).cancelDelayHide();
            q5.j jVar = f4910o0;
            if (jVar != null) {
                jVar.t();
            }
            findFirstShow.setGuideNextClickListener(new e0());
            findFirstShow.showGuide();
        }
    }

    public static final void B5(r1 r1Var) {
        t9.i.g(r1Var, "this$0");
        r1Var.T4(false, false);
    }

    public static /* synthetic */ void D4(r1 r1Var, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        r1Var.C4(str, i10, z10);
    }

    public static final void F5(r1 r1Var) {
        t9.i.g(r1Var, "this$0");
        Context context = r1Var.getContext();
        int i10 = R$id.mImageShare;
        String string = ((ImageView) r1Var.x3(i10)).getContext().getString(R.string.sharing_guide_tips);
        t9.i.f(string, "mImageShare.context.getS…tring.sharing_guide_tips)");
        new BaseGuideManager(context, (ImageView) r1Var.x3(i10), "keyLiveSharing", string, GuideDialog.Direction.TOP_RIGHT, null, false, false, null, 480, null).showGuide();
    }

    public static final boolean I5(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    public static final void M4(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static /* synthetic */ void N5(r1 r1Var, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = null;
        }
        r1Var.M5(bool);
    }

    public static final void O4(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static final void P4(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static final void Q3(r1 r1Var) {
        t9.i.g(r1Var, "this$0");
        if (com.mobile.brasiltv.utils.h.f8694a.o() || r1Var.K) {
            xa.c.c().j(new CastToPlayEvent("LIVE"));
        }
    }

    public static final void R3(r1 r1Var) {
        t9.i.g(r1Var, "this$0");
        if (com.mobile.brasiltv.utils.b0.K(r1Var.M) && r1Var.f4937w) {
            Integer num = r1Var.N;
            t9.i.d(num);
            int intValue = num.intValue();
            String str = r1Var.M;
            t9.i.d(str);
            r1Var.s5(intValue, str);
            r1Var.L = true;
        }
        if ((com.mobile.brasiltv.utils.h.f8694a.o() || r1Var.K) && !r1Var.L) {
            xa.c.c().j(new CastToPlayEvent("LIVE"));
        }
    }

    public static final void R4(r1 r1Var, DialogInterface dialogInterface) {
        t9.i.g(r1Var, "this$0");
        r1Var.f4931q = null;
    }

    public static final void S3(r1 r1Var) {
        t9.i.g(r1Var, "this$0");
        U3(r1Var, false, false, 2, null);
    }

    public static /* synthetic */ void U3(r1 r1Var, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        r1Var.T3(z10, z11);
    }

    public static final void U5(r1 r1Var, DialogInterface dialogInterface) {
        t9.i.g(r1Var, "this$0");
        r1Var.A = null;
    }

    public static /* synthetic */ String a4(r1 r1Var, Program program, o6.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return r1Var.Z3(program, aVar, z10);
    }

    public static final void g4(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static final void h4(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static final boolean h5(r1 r1Var, GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        t9.i.g(r1Var, "this$0");
        t9.i.g(gestureDetector, "$mGestureDetector");
        t9.i.f(view, "v");
        t9.i.f(motionEvent, "event");
        return r1Var.S5(view, motionEvent, gestureDetector);
    }

    public static /* synthetic */ void k4(r1 r1Var, String str, ArrayList arrayList, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        r1Var.j4(str, arrayList, z10);
    }

    public static final void k5(View view) {
    }

    public static final ObservableSource l4(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        return (ObservableSource) lVar.invoke(obj);
    }

    public static final void l5(r1 r1Var, BaseQuickAdapter baseQuickAdapter, View view, int i10) {
        t9.i.g(r1Var, "this$0");
        if (view.getId() == R.id.mFavWrapper) {
            Object item = baseQuickAdapter.getItem(i10);
            t9.i.e(item, "null cannot be cast to non-null type mobile.com.requestframe.utils.response.Channel");
            r1Var.v4((Channel) item, i10);
        }
    }

    public static final void m4(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static final void m5(r1 r1Var, View view) {
        t9.i.g(r1Var, "this$0");
        Context context = r1Var.getContext();
        if (context != null) {
            com.mobile.brasiltv.utils.b0.l(context);
        }
    }

    public static final ObservableSource n4(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        return (ObservableSource) lVar.invoke(obj);
    }

    public static final void n5(r1 r1Var, View view) {
        Program program;
        t9.i.g(r1Var, "this$0");
        com.mobile.brasiltv.utils.h hVar = com.mobile.brasiltv.utils.h.f8694a;
        if (t9.i.b(hVar.a(), hVar.k())) {
            if (hVar.t()) {
                com.mobile.brasiltv.utils.g.f8651a.G();
            }
        } else if (t9.i.b(hVar.a(), hVar.l())) {
            r1Var.C.r();
            r1Var.C.s();
        }
        r1Var.F = "";
        xa.c.c().j(new CastToCloseFloatViewEvent());
        U3(r1Var, true, false, 2, null);
        int i10 = R$id.mVideoViewLive;
        n8.b titanContext = ((TitanVideoView) r1Var.x3(i10)).getTitanContext();
        if (titanContext != null) {
            program = titanContext.h();
        } else {
            program = null;
        }
        if (program != null) {
            ((TitanVideoView) r1Var.x3(i10)).D();
        }
        l6.g0 g0Var = r1Var.f4938x;
        if (g0Var == null) {
            t9.i.w("mLivePlayPresenter");
            g0Var = null;
        }
        f.a.a(g0Var, r1Var.f4922k, null, 2, null);
    }

    public static final void o4(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static final void o5(r1 r1Var, View view) {
        t9.i.g(r1Var, "this$0");
        xa.c.c().j(new CastToCloseOtherPlayEvent("LIVE", false, 2, null));
        Context context = r1Var.getContext();
        t9.i.e(context, "null cannot be cast to non-null type com.mobile.brasiltv.activity.BaseActivity");
        com.mobile.brasiltv.utils.b0.d0((f5.c) context, CastByNativeDeviceAty.class, w.f4983a);
    }

    public static final void p5(r1 r1Var, View view) {
        t9.i.g(r1Var, "this$0");
        Context context = r1Var.getContext();
        t9.i.d(context);
        new CastFeedBackDialog(context).show();
    }

    public static /* synthetic */ void u4(r1 r1Var, Channel channel, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        r1Var.t4(channel, i10, z10);
    }

    public static /* synthetic */ void u5(r1 r1Var, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        r1Var.t5(z10, z11);
    }

    public final void A4(boolean z10) {
        this.f4937w = true;
        if (Q2()) {
            V2();
            T4(z10, true);
        }
    }

    public final boolean B4(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (motionEvent != null && motionEvent2 != null) {
            float rawX = motionEvent.getRawX();
            float rawX2 = motionEvent2.getRawX();
            float rawY = motionEvent.getRawY();
            float rawY2 = motionEvent2.getRawY();
            int i10 = R$id.mVideoViewLive;
            int width = ((TitanVideoView) x3(i10)).getWidth();
            ((TitanVideoView) x3(i10)).getHeight();
            if (this.f4921j0 == TitanPlayerController.b.NONE && Math.abs(rawX - rawX2) < Math.abs(rawY - rawY2)) {
                double d10 = width;
                Double.isNaN(d10);
                if (rawX > (d10 * 1.0d) / 2.0d) {
                    if (Math.abs(f11) > 3.0f) {
                        this.f4921j0 = TitanPlayerController.b.VOLUME;
                    }
                } else {
                    this.f4921j0 = TitanPlayerController.b.BRIGHTNESS;
                }
            }
            int i11 = b.f4942a[this.f4921j0.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    double d11 = width;
                    Double.isNaN(d11);
                    if (rawX <= (d11 * 1.0d) / 2.0d) {
                        Q4(f11 / AutoUtils.getPercentHeightSize(280));
                    }
                }
            } else {
                double d12 = width;
                Double.isNaN(d12);
                if (rawX > (d12 * 1.0d) / 2.0d) {
                    S4(motionEvent2);
                }
            }
        }
        return true;
    }

    @Override // j6.g
    public void C0(Channel channel, Program program) {
        Program program2;
        TitanVideoView titanVideoView;
        TitanVideoView titanVideoView2;
        t9.i.g(channel, "channel");
        t9.i.g(program, "program");
        l6.g0 g0Var = this.f4938x;
        Program program3 = null;
        if (g0Var == null) {
            t9.i.w("mLivePlayPresenter");
            g0Var = null;
        }
        String a42 = a4(this, program, g0Var.v(), false, 4, null);
        if (com.mobile.brasiltv.utils.b0.H(a42)) {
            t9.i.d(a42);
            program.setMedia(a42);
            this.J = program;
            if (!com.mobile.brasiltv.utils.h.f8694a.o()) {
                U3(this, true, false, 2, null);
                ((TitanVideoView) x3(R$id.mVideoViewLive)).B(program, channel.getChannelCode(), program.getBuss());
                D5(0);
                x5(true);
                return;
            }
            U3(this, false, false, 2, null);
            int i10 = R$id.mVideoViewLive;
            n8.b titanContext = ((TitanVideoView) x3(i10)).getTitanContext();
            if (titanContext != null) {
                program2 = titanContext.h();
            } else {
                program2 = null;
            }
            if (program2 != null && (titanVideoView2 = (TitanVideoView) x3(i10)) != null) {
                titanVideoView2.D();
            }
            n8.b titanContext2 = ((TitanVideoView) x3(i10)).getTitanContext();
            if (titanContext2 != null) {
                program3 = titanContext2.a();
            }
            if (program3 != null && (titanVideoView = (TitanVideoView) x3(i10)) != null) {
                titanVideoView.C();
            }
            Program program4 = this.J;
            t9.i.d(program4);
            ((TitanVideoView) x3(i10)).v(program4, program.getBuss());
            this.O = false;
        }
    }

    @Override // o8.a
    public void C1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v14, types: [g5.j0] */
    public final void C4(String str, int i10, boolean z10) {
        f4();
        z.a aVar = b6.z.f5049u;
        String f10 = aVar.f();
        if (f10 == null) {
            f10 = "";
        }
        boolean z11 = false;
        g5.o0 o0Var = null;
        if (i10 == 0) {
            this.f4918i = -1;
            this.f4916h = 0;
            g5.o0 o0Var2 = this.f4928n;
            if (o0Var2 == null) {
                t9.i.w("adapterSort");
            } else {
                o0Var = o0Var2;
            }
            o0Var.b(0);
            R5();
            return;
        }
        int i11 = i10 - 1;
        if (i11 >= this.f4912f.size()) {
            return;
        }
        Object obj = this.f4912f.get(i11);
        t9.i.f(obj, "allColumnIdList[position - 1]");
        int intValue = ((Number) obj).intValue();
        if (intValue != this.f4918i) {
            this.f4918i = intValue;
            this.f4916h = i10;
            g5.o0 o0Var3 = this.f4928n;
            if (o0Var3 == null) {
                t9.i.w("adapterSort");
                o0Var3 = null;
            }
            o0Var3.b(i10);
            g5.j0 j0Var = this.f4926m;
            if (j0Var == null) {
                t9.i.w("adapterChannel");
                j0Var = null;
            }
            j0Var.d(false);
            g5.j0 j0Var2 = this.f4926m;
            if (j0Var2 == null) {
                t9.i.w("adapterChannel");
                j0Var2 = null;
            }
            j0Var2.getData().clear();
            g5.j0 j0Var3 = this.f4926m;
            if (j0Var3 == null) {
                t9.i.w("adapterChannel");
                j0Var3 = null;
            }
            j0Var3.notifyDataSetChanged();
            ChildColumnList a10 = aVar.a();
            if (a10 != null && intValue == a10.getId()) {
                z11 = true;
            }
            if (z11 && (!c4() || !T5())) {
                return;
            }
            if (aVar.g().indexOfKey(intValue) >= 0) {
                g5.j0 j0Var4 = this.f4926m;
                if (j0Var4 == null) {
                    t9.i.w("adapterChannel");
                    j0Var4 = null;
                }
                List data = j0Var4.getData();
                Object obj2 = aVar.g().get(intValue);
                t9.i.d(obj2);
                data.addAll((Collection) obj2);
                ?? r82 = this.f4926m;
                if (r82 == 0) {
                    t9.i.w("adapterChannel");
                } else {
                    o0Var = r82;
                }
                o0Var.notifyDataSetChanged();
                this.f4920j.clear();
                ArrayList arrayList = this.f4920j;
                Object obj3 = aVar.g().get(intValue);
                t9.i.d(obj3);
                arrayList.addAll((Collection) obj3);
                j4(f10, this.f4920j, z10);
                return;
            }
            L4(intValue);
            return;
        }
        i4(f10);
    }

    public final void C5() {
        if (this.f4932r) {
            if (((AnimatorFrameLayout) x3(R$id.mLayoutChannelList)).getVisibility() == 0) {
                F4();
                return;
            }
            int i10 = R$id.mLiveControlPanelLandscape;
            if (t9.i.b(((AutoHideRelativeLayout) x3(i10)).getTag(), Boolean.TRUE)) {
                ((AutoHideRelativeLayout) x3(i10)).setTag(Boolean.FALSE);
                ((AutoHideRelativeLayout) x3(i10)).delayHide();
            } else if (((AutoHideRelativeLayout) x3(i10)).getVisibility() == 0) {
                ((AutoHideRelativeLayout) x3(i10)).setVisibility(8);
            } else {
                ((AutoHideRelativeLayout) x3(i10)).setVisibility(0);
                d5();
                e5();
            }
        } else if (!Y3()) {
            ((AutoHideRelativeLayout) x3(R$id.mLiveControlPanelPortrait)).setVisibility(8);
        } else {
            int i11 = R$id.mLiveControlPanelPortrait;
            if (((AutoHideRelativeLayout) x3(i11)).getVisibility() == 0) {
                ((AutoHideRelativeLayout) x3(i11)).setVisibility(8);
            } else {
                ((AutoHideRelativeLayout) x3(i11)).setVisibility(0);
            }
        }
    }

    public final void D5(int i10) {
        String str;
        String str2;
        if (!s6.a.f18777a.a().s()) {
            return;
        }
        int i11 = R$id.mIvPortQuality;
        ((ImageView) x3(i11)).setVisibility(i10);
        ((AutoLinearLayout) x3(R$id.mLlQuality)).setVisibility(i10);
        if (i10 != 0) {
            return;
        }
        l6.g0 g0Var = this.f4938x;
        String str3 = null;
        if (g0Var == null) {
            t9.i.w("mLivePlayPresenter");
            g0Var = null;
        }
        o6.a v10 = g0Var.v();
        if (v10 != null) {
            str = v10.c();
        } else {
            str = null;
        }
        if (t9.i.b(str, o6.c.c().c())) {
            ((ImageView) x3(i11)).setImageResource(R.drawable.ic_quality_480p_portrait);
            ((ImageView) x3(R$id.mIvLandQuality)).setImageResource(R.drawable.ic_quality_480p);
            return;
        }
        l6.g0 g0Var2 = this.f4938x;
        if (g0Var2 == null) {
            t9.i.w("mLivePlayPresenter");
            g0Var2 = null;
        }
        o6.a v11 = g0Var2.v();
        if (v11 != null) {
            str2 = v11.c();
        } else {
            str2 = null;
        }
        if (t9.i.b(str2, o6.c.b().c())) {
            ((ImageView) x3(i11)).setImageResource(R.drawable.ic_quality_720p_portrait);
            ((ImageView) x3(R$id.mIvLandQuality)).setImageResource(R.drawable.ic_quality_720p);
            return;
        }
        l6.g0 g0Var3 = this.f4938x;
        if (g0Var3 == null) {
            t9.i.w("mLivePlayPresenter");
            g0Var3 = null;
        }
        o6.a v12 = g0Var3.v();
        if (v12 != null) {
            str3 = v12.c();
        }
        if (t9.i.b(str3, o6.c.a().c())) {
            ((ImageView) x3(i11)).setImageResource(R.drawable.ic_quality_1080p_portrait);
            ((ImageView) x3(R$id.mIvLandQuality)).setImageResource(R.drawable.ic_quality_1080p);
        }
    }

    public final void E4() {
        View view;
        Window window;
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        if (view != null) {
            view.setSystemUiVisibility(q.a.f10527g);
        }
    }

    public final void E5() {
        q5.j jVar = f4910o0;
        boolean z10 = false;
        if (jVar != null && jVar.n()) {
            z10 = true;
        }
        if (z10 && !this.f4932r) {
            int i10 = R$id.mImageShare;
            if (((ImageView) x3(i10)).getVisibility() == 0) {
                ((ImageView) x3(i10)).post(new Runnable() { // from class: b6.s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        r1.F5(r1.this);
                    }
                });
            }
        }
    }

    @Override // o8.a
    public void F1() {
    }

    public final void F4() {
        ((AnimatorFrameLayout) x3(R$id.mLayoutChannelList)).setVisibility(8);
        Disposable disposable = this.f4933s;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // o8.a
    public void G0(long j10) {
    }

    public final void G4() {
    }

    public final void G5() {
        AudioManager audioManager = this.f4929o;
        AudioManager audioManager2 = null;
        if (audioManager == null) {
            t9.i.w("manager");
            audioManager = null;
        }
        if (audioManager.getStreamVolume(3) != 0) {
            int i10 = R$id.mIconSilence;
            ((ImageView) x3(i10)).setTag(Boolean.TRUE);
            ((ImageView) x3(i10)).setImageResource(R.drawable.ic_live_volume_off);
            AudioManager audioManager3 = this.f4929o;
            if (audioManager3 == null) {
                t9.i.w("manager");
                audioManager3 = null;
            }
            this.f4930p = audioManager3.getStreamVolume(3);
            AudioManager audioManager4 = this.f4929o;
            if (audioManager4 == null) {
                t9.i.w("manager");
            } else {
                audioManager2 = audioManager4;
            }
            audioManager2.setStreamVolume(3, 0, 16);
            return;
        }
        int i11 = R$id.mIconSilence;
        ((ImageView) x3(i11)).setTag(Boolean.FALSE);
        ((ImageView) x3(i11)).setImageResource(R.drawable.ic_live_volume_on);
        AudioManager audioManager5 = this.f4929o;
        if (audioManager5 == null) {
            t9.i.w("manager");
        } else {
            audioManager2 = audioManager5;
        }
        audioManager2.setStreamVolume(3, this.f4930p, 0);
    }

    @Override // o8.a
    public void H1() {
    }

    @Override // o8.a
    public void H2() {
    }

    public final void H4() {
        q5.j jVar = f4910o0;
        boolean z10 = false;
        if (jVar != null && jVar.i()) {
            z10 = true;
        }
        if (z10) {
            N5(this, null, 1, null);
        }
        androidx.fragment.app.e activity = getActivity();
        t9.i.d(activity);
        f4910o0 = new q5.j(activity, new l());
        androidx.fragment.app.e activity2 = getActivity();
        t9.i.d(activity2);
        i5(new m(activity2));
        p4().c();
    }

    public final void H5() {
        Disposable disposable;
        Disposable disposable2 = this.B;
        if (disposable2 != null) {
            t9.i.d(disposable2);
            if (!disposable2.isDisposed() && (disposable = this.B) != null) {
                disposable.dispose();
            }
        }
        Observable<Long> intervalRange = Observable.intervalRange(0L, 45L, 0L, 2L, TimeUnit.SECONDS);
        final f0 f0Var = f0.f4957a;
        intervalRange.filter(new Predicate() { // from class: b6.a1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean I5;
                I5 = r1.I5(s9.l.this, obj);
                return I5;
            }
        }).compose(O2()).compose(com.mobile.brasiltv.utils.p0.a()).subscribe(new g0());
    }

    @Override // o8.a
    public void I1(Bitmap bitmap) {
        t9.i.g(bitmap, "bitmap");
    }

    public final boolean I4() {
        if (((AutoLinearLayout) x3(R$id.llCastContainer)).getVisibility() != 0 && ((AutoLinearLayout) x3(R$id.llSwitchContainer)).getVisibility() != 0 && !com.mobile.brasiltv.utils.h.f8694a.o()) {
            return false;
        }
        return true;
    }

    public final boolean J4() {
        return this.f4932r;
    }

    public final void J5() {
        q5.j jVar;
        if (((AutoLinearLayout) x3(R$id.llSwitchContainer)).getVisibility() != 0 && ((AutoLinearLayout) x3(R$id.llCastContainer)).getVisibility() != 0 && (jVar = f4910o0) != null) {
            jVar.e();
        }
    }

    @Override // o8.a
    public void K0() {
    }

    public final boolean K4() {
        return this.f4937w;
    }

    public final void K5() {
        String str;
        ((TitanVideoView) x3(R$id.mVideoViewLive)).D();
        l6.g0 g0Var = null;
        if (this.Y != 0) {
            Context context = getContext();
            Channel channel = this.f4922k;
            if (channel != null) {
                str = channel.getName();
            } else {
                str = null;
            }
            com.mobile.brasiltv.utils.i1.A(context, str, this.Y);
        }
        this.Y = 0L;
        l6.g0 g0Var2 = this.f4938x;
        if (g0Var2 == null) {
            t9.i.w("mLivePlayPresenter");
        } else {
            g0Var = g0Var2;
        }
        if (g0Var.v() == null) {
            c2.d dVar = c2.d.f5311a;
            Channel channel2 = this.f4922k;
            String str2 = (channel2 == null || (str2 = channel2.getChannelCode()) == null) ? "" : "";
            Channel channel3 = this.f4922k;
            String str3 = (channel3 == null || (str3 = channel3.getName()) == null) ? "" : "";
            String str4 = na.e.f17342b;
            t9.i.f(str4, "dcsMark");
            dVar.g(str2, str3, str4, com.mobile.brasiltv.utils.y.f8771a.h(), "", "EC21", AgooConstants.REPORT_MESSAGE_NULL, "apk");
            Context context2 = getContext();
            if (context2 != null) {
                com.mobile.brasiltv.utils.x.f8754a.w(context2, new h0());
            }
        } else if (r5.i.f18523a.I()) {
            O3();
        } else {
            H5();
        }
    }

    @Override // z5.c.d
    public void L0() {
    }

    @Override // z5.c.d
    public void L1(int i10) {
        x4(i10);
    }

    public final void L4(int i10) {
        w6.i b10 = w6.i.f19214g.b();
        com.mobile.brasiltv.utils.n0 n0Var = com.mobile.brasiltv.utils.n0.f8733a;
        Context context = getContext();
        t9.i.d(context);
        String f10 = com.mobile.brasiltv.utils.n0.f(n0Var, context, "DATA_VERSION" + i10, null, 4, null);
        Context context2 = getContext();
        t9.i.d(context2);
        Observable compose = b10.z1(i10, f10, com.mobile.brasiltv.utils.n0.f(n0Var, context2, "EXPIRE_TIME" + i10, null, 4, null)).compose(O2());
        final n nVar = new n(i10);
        compose.doOnNext(new Consumer() { // from class: b6.u0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                r1.M4(s9.l.this, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new o(i10));
    }

    public final void L5() {
        boolean z10;
        boolean z11 = true;
        if (this.D.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            com.mobile.brasiltv.utils.h hVar = com.mobile.brasiltv.utils.h.f8694a;
            if (hVar.a().length() <= 0) {
                z11 = false;
            }
            if (z11 && !t9.i.b(this.D, hVar.a())) {
                if (t9.i.b(this.D, hVar.k())) {
                    com.mobile.brasiltv.utils.g gVar = com.mobile.brasiltv.utils.g.f8651a;
                    gVar.w(null);
                    if (hVar.t()) {
                        gVar.G();
                    }
                } else if (t9.i.b(this.D, hVar.l())) {
                    this.C.s();
                    this.C.o();
                    this.C.r();
                }
            }
        }
    }

    public final void M5(Boolean bool) {
        q5.j jVar = f4910o0;
        if (jVar != null) {
            if (t9.i.b(bool, Boolean.TRUE) && !jVar.l()) {
                jVar.s();
            } else if (t9.i.b(bool, Boolean.FALSE) && !jVar.n()) {
                jVar.u();
            }
        }
        q5.j jVar2 = f4910o0;
        if (jVar2 != null) {
            jVar2.b();
        }
    }

    @Override // z5.c.e
    public void N1(long j10, long j11) {
        int i10 = R$id.mTvCastState;
        Context context = getContext();
        t9.i.d(context);
        ((TextView) x3(i10)).setText(context.getResources().getString(R.string.cast_status_casting));
        Context context2 = getContext();
        t9.i.d(context2);
        ((TextView) x3(i10)).setTextColor(context2.getResources().getColor(R.color.color_fffefe));
        ((TextView) x3(R$id.mTvPleaseWait)).setVisibility(8);
    }

    public final void N4() {
        Disposable disposable = this.f4934t;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable<Long> observeOn = Observable.timer(5L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread());
        final p pVar = new p();
        Consumer<? super Long> consumer = new Consumer() { // from class: b6.g1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                r1.O4(s9.l.this, obj);
            }
        };
        final q qVar = q.f4978a;
        this.f4934t = observeOn.subscribe(consumer, new Consumer() { // from class: b6.h1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                r1.P4(s9.l.this, obj);
            }
        });
    }

    @Override // o8.a
    public void O1() {
    }

    public final void O3() {
        l6.g0 g0Var = this.f4938x;
        if (g0Var == null) {
            t9.i.w("mLivePlayPresenter");
            g0Var = null;
        }
        f.a.a(g0Var, this.f4922k, null, 2, null);
    }

    public final void O5() {
        if (((AutoLinearLayout) x3(R$id.llCastContainer)).getVisibility() == 0 || ((AutoLinearLayout) x3(R$id.llSwitchContainer)).getVisibility() == 0 || com.mobile.brasiltv.utils.h.f8694a.o()) {
            ((TitanVideoView) x3(R$id.mVideoViewLive)).D();
        }
    }

    public final String P3(String str) {
        return this.F + "&cast=" + str;
    }

    public final void P5() {
        TitanVideoView titanVideoView;
        String str;
        if (this.Y != 0) {
            Context context = getContext();
            Channel channel = this.f4922k;
            if (channel != null) {
                str = channel.getName();
            } else {
                str = null;
            }
            com.mobile.brasiltv.utils.i1.A(context, str, this.Y);
        }
        if (!I4() && (titanVideoView = (TitanVideoView) x3(R$id.mVideoViewLive)) != null) {
            titanVideoView.D();
        }
    }

    public final void Q4(float f10) {
        int i10 = R$id.mLiveControlPanelLandscape;
        if (((AutoHideRelativeLayout) x3(i10)).getVisibility() == 8) {
            ((AutoHideRelativeLayout) x3(i10)).setVisibility(0);
            d5();
            e5();
        }
        ((AutoHideRelativeLayout) x3(i10)).setTag(Boolean.TRUE);
        ((AutoHideRelativeLayout) x3(i10)).delayHide();
        androidx.fragment.app.e activity = getActivity();
        t9.i.d(activity);
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        float r42 = r4() + f10;
        if (r42 > 1.0f) {
            r42 = 1.0f;
        } else if (r42 < 0.0f) {
            r42 = 0.0f;
        }
        MainAty.A.l(r42);
        attributes.screenBrightness = r42;
        androidx.fragment.app.e activity2 = getActivity();
        t9.i.d(activity2);
        activity2.getWindow().setAttributes(attributes);
        ((ProgressBar) x3(R$id.mPbBrightness)).setProgress((int) (r42 * 100));
    }

    public final void Q5() {
        Media media;
        String str;
        String str2;
        String str3;
        String str4;
        String buss;
        String lang;
        List<Media> medias;
        if (com.mobile.brasiltv.utils.b0.K(this.F)) {
            xa.c.c().j(new CastToCloseOtherPlayEvent("LIVE", false));
            com.mobile.brasiltv.utils.h hVar = com.mobile.brasiltv.utils.h.f8694a;
            if (t9.i.b(hVar.a(), hVar.k())) {
                Program program = this.J;
                if (program != null && (medias = program.getMedias()) != null) {
                    media = medias.get(0);
                } else {
                    media = null;
                }
                if (this.Q) {
                    str = P3("dlna");
                } else {
                    str = this.F;
                }
                String str5 = str;
                com.mobile.brasiltv.utils.g gVar = com.mobile.brasiltv.utils.g.f8651a;
                Program program2 = this.J;
                String str6 = (program2 == null || (str6 = program2.getMedia()) == null) ? "" : "";
                Program program3 = this.J;
                String str7 = (program3 == null || (str7 = program3.getName()) == null) ? "" : "";
                Program program4 = this.J;
                String str8 = (program4 == null || (str8 = program4.getTitle()) == null) ? "" : "";
                Program program5 = this.J;
                String str9 = (program5 == null || (str9 = program5.getEpisode()) == null) ? "" : "";
                Program program6 = this.J;
                String str10 = (program6 == null || (str10 = program6.getBuss()) == null) ? "" : "";
                String str11 = (media == null || (str11 = media.getFormat()) == null) ? "" : "";
                String str12 = (media == null || (str12 = media.getVcodec()) == null) ? "" : "";
                String str13 = (media == null || (str13 = media.getQuality()) == null) ? "" : "";
                if (media == null || (lang = media.getLang()) == null) {
                    str2 = "";
                } else {
                    str2 = lang;
                }
                Program program7 = this.J;
                if (program7 == null || (buss = program7.getBuss()) == null) {
                    str3 = "";
                } else {
                    str3 = buss;
                }
                String str14 = this.S;
                if (str14 == null) {
                    str4 = "";
                } else {
                    str4 = str14;
                }
                gVar.E(str5, str6, str7, str8, str9, str10, str11, str12, str13, str2, str3, 0L, str4, this.Q);
                U3(this, false, false, 2, null);
            }
        }
    }

    public final void R5() {
        l6.g0 g0Var = this.f4938x;
        g5.j0 j0Var = null;
        if (g0Var == null) {
            t9.i.w("mLivePlayPresenter");
            g0Var = null;
        }
        ArrayList u10 = g0Var.u();
        g5.j0 j0Var2 = this.f4926m;
        if (j0Var2 == null) {
            t9.i.w("adapterChannel");
            j0Var2 = null;
        }
        j0Var2.d(true);
        g5.j0 j0Var3 = this.f4926m;
        if (j0Var3 == null) {
            t9.i.w("adapterChannel");
            j0Var3 = null;
        }
        j0Var3.getData().clear();
        g5.j0 j0Var4 = this.f4926m;
        if (j0Var4 == null) {
            t9.i.w("adapterChannel");
            j0Var4 = null;
        }
        j0Var4.getData().addAll(u10);
        g5.j0 j0Var5 = this.f4926m;
        if (j0Var5 == null) {
            t9.i.w("adapterChannel");
        } else {
            j0Var = j0Var5;
        }
        j0Var.notifyDataSetChanged();
        this.f4920j.clear();
        this.f4920j.addAll(u10);
        String f10 = b6.z.f5049u.f();
        if (f10 == null) {
            f10 = "";
        }
        k4(this, f10, this.f4920j, false, 4, null);
    }

    public final void S4(MotionEvent motionEvent) {
        int i10 = R$id.mLiveControlPanelLandscape;
        int i11 = 0;
        if (((AutoHideRelativeLayout) x3(i10)).getVisibility() == 8) {
            ((AutoHideRelativeLayout) x3(i10)).setVisibility(0);
            d5();
            e5();
        }
        ((AutoHideRelativeLayout) x3(i10)).setTag(Boolean.TRUE);
        ((AutoHideRelativeLayout) x3(i10)).delayHide();
        Float f10 = this.f4923k0;
        if (f10 == null) {
            this.f4923k0 = Float.valueOf(motionEvent.getRawY());
            return;
        }
        t9.i.d(f10);
        float e10 = p4().e() * ((f10.floatValue() - motionEvent.getRawY()) / AutoUtils.getPercentHeightSize(280));
        float d10 = p4().d() + e10;
        int d11 = p4().d() + ((int) e10);
        if (d11 > p4().e()) {
            i11 = p4().e();
        } else if (d11 >= 0) {
            i11 = d11;
        }
        if (d10 > p4().e()) {
            d10 = p4().e();
        } else if (d10 < 0.0f) {
            d10 = 0.0f;
        }
        if (Math.abs(e10) >= 1.0f) {
            this.f4923k0 = Float.valueOf(motionEvent.getRawY());
            p4().g(i11);
        }
        ((ProgressBar) x3(R$id.mPbVolume)).setProgress((int) ((100 * d10) / p4().e()));
    }

    public final boolean S5(View view, MotionEvent motionEvent, GestureDetector gestureDetector) {
        if (this.f4936v) {
            return false;
        }
        return gestureDetector.onTouchEvent(motionEvent);
    }

    @Override // k5.a
    public void T2() {
    }

    public final void T3(boolean z10, boolean z11) {
        String str;
        String str2;
        com.mobile.brasiltv.utils.h hVar = com.mobile.brasiltv.utils.h.f8694a;
        boolean b10 = t9.i.b(hVar.a(), hVar.k());
        if (z11) {
            ((TextView) x3(R$id.mTvCastErrorHint)).setVisibility(8);
            ((AutoLinearLayout) x3(R$id.llCastContainer)).setVisibility(8);
            ((AutoHideRelativeLayout) x3(R$id.mLiveControlPanelPortrait)).setVisibility(8);
            q5.j jVar = f4910o0;
            if (jVar != null) {
                jVar.c();
            }
            int i10 = R$id.llSwitchContainer;
            Context context = getContext();
            t9.i.d(context);
            ((AutoLinearLayout) x3(i10)).setBackgroundColor(context.getResources().getColor(R.color.color_1a1a1a));
            this.D = hVar.a();
            if (!b10) {
                ((AutoLinearLayout) x3(i10)).setVisibility(0);
                Context context2 = getContext();
                t9.i.d(context2);
                ((TextView) x3(R$id.mTvSwitchTips)).setText(context2.getResources().getString(R.string.cast_content_not_support_google));
                return;
            }
            Q5();
            return;
        }
        String str3 = null;
        if (z10) {
            ((TextView) x3(R$id.mTvCastErrorHint)).setVisibility(8);
            ((AutoLinearLayout) x3(R$id.llSwitchContainer)).setVisibility(8);
            ((AutoLinearLayout) x3(R$id.llCastContainer)).setVisibility(8);
            q5.j jVar2 = f4910o0;
            if (jVar2 != null) {
                jVar2.f();
            }
            if (!Y3()) {
                ((AutoHideRelativeLayout) x3(R$id.mLiveControlPanelPortrait)).setVisibility(8);
            } else if (this.f4932r) {
                ((AutoHideRelativeLayout) x3(R$id.mLiveControlPanelPortrait)).setVisibility(8);
            } else {
                ((AutoHideRelativeLayout) x3(R$id.mLiveControlPanelPortrait)).setVisibility(0);
            }
            if (b10) {
                com.mobile.brasiltv.utils.g.f8651a.w(null);
                return;
            } else {
                this.C.o();
                return;
            }
        }
        ((TextView) x3(R$id.mTvCastErrorHint)).setVisibility(8);
        ((AutoLinearLayout) x3(R$id.llSwitchContainer)).setVisibility(8);
        ((AutoLinearLayout) x3(R$id.llCastContainer)).setVisibility(0);
        ((AutoHideRelativeLayout) x3(R$id.mLiveControlPanelPortrait)).setVisibility(8);
        q5.j jVar3 = f4910o0;
        if (jVar3 != null) {
            jVar3.c();
        }
        int i11 = R$id.mTvCastState;
        Context context3 = getContext();
        t9.i.d(context3);
        ((TextView) x3(i11)).setText(context3.getResources().getString(R.string.cast_status_prepare));
        Context context4 = getContext();
        t9.i.d(context4);
        ((TextView) x3(i11)).setTextColor(context4.getResources().getColor(R.color.color_fffefe));
        ((TextView) x3(R$id.mTvPleaseWait)).setVisibility(0);
        ((TextView) x3(R$id.mTvCastRecommendHint)).setVisibility(4);
        c5();
        l6.g0 g0Var = this.f4938x;
        if (g0Var == null) {
            t9.i.w("mLivePlayPresenter");
            g0Var = null;
        }
        o6.a v10 = g0Var.v();
        if (v10 != null) {
            str = v10.c();
        } else {
            str = null;
        }
        if (t9.i.b(str, o6.c.c().c())) {
            ((ImageView) x3(R$id.mIvCastQuality)).setImageResource(R.mipmap.icon_cast_definition_480);
        } else {
            l6.g0 g0Var2 = this.f4938x;
            if (g0Var2 == null) {
                t9.i.w("mLivePlayPresenter");
                g0Var2 = null;
            }
            o6.a v11 = g0Var2.v();
            if (v11 != null) {
                str2 = v11.c();
            } else {
                str2 = null;
            }
            if (t9.i.b(str2, o6.c.b().c())) {
                ((ImageView) x3(R$id.mIvCastQuality)).setImageResource(R.mipmap.icon_cast_definition_720);
            } else {
                l6.g0 g0Var3 = this.f4938x;
                if (g0Var3 == null) {
                    t9.i.w("mLivePlayPresenter");
                    g0Var3 = null;
                }
                o6.a v12 = g0Var3.v();
                if (v12 != null) {
                    str3 = v12.c();
                }
                if (t9.i.b(str3, o6.c.a().c())) {
                    ((ImageView) x3(R$id.mIvCastQuality)).setImageResource(R.mipmap.icon_cast_definition_1080);
                }
            }
        }
        if (b10) {
            com.mobile.brasiltv.utils.g.f8651a.w(this.f4925l0);
        } else {
            this.C.e(this);
        }
    }

    public final boolean T4(boolean z10, boolean z11) {
        Channel channel;
        com.mobile.brasiltv.utils.h hVar = com.mobile.brasiltv.utils.h.f8694a;
        if (!hVar.o() && !this.O) {
            T3(false, false);
        } else if (hVar.o() && hVar.s()) {
            return false;
        } else {
            if (!hVar.p()) {
                ((AutoLinearLayout) x3(R$id.llCastContainer)).setVisibility(8);
                ((RelativeLayout) x3(R$id.mBufferView)).setVisibility(0);
                if (!z10 && z11 && r5.i.f18523a.I() && (channel = this.f4922k) != null) {
                    t9.i.d(channel);
                    l6.g0 g0Var = this.f4938x;
                    if (g0Var == null) {
                        t9.i.w("mLivePlayPresenter");
                        g0Var = null;
                    }
                    W4(channel, g0Var.y());
                }
                return false;
            }
        }
        hVar.x(false);
        return false;
    }

    public final boolean T5() {
        if (!MainAty.A.f()) {
            return true;
        }
        if (this.A == null) {
            Context context = getContext();
            t9.i.d(context);
            g6.d dVar = new g6.d(context);
            this.A = dVar;
            dVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: b6.f1
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    r1.U5(r1.this, dialogInterface);
                }
            });
        }
        g6.d dVar2 = this.A;
        if (dVar2 != null) {
            dVar2.h(true);
        }
        g6.d dVar3 = this.A;
        if (dVar3 != null) {
            dVar3.show();
            return false;
        }
        return false;
    }

    @Override // z5.c.d
    public void U() {
    }

    @Override // k5.a
    public void U2() {
        super.U2();
        M5(Boolean.FALSE);
        ((TitanVideoView) x3(R$id.mVideoViewLive)).setKeepScreenOn(false);
    }

    public final void U4() {
        Channel channel = this.W;
        if (channel == null) {
            com.mobile.brasiltv.utils.f1.f8649a.w(R.string.live_no_previous);
        } else {
            t9.i.d(channel);
            if (t9.i.b(channel.getRestricted(), "1") && t9.i.b(w6.i.f19214g.A(), "0")) {
                this.W = null;
                com.mobile.brasiltv.utils.f1.f8649a.w(R.string.live_no_previous);
            } else {
                D4(this, "", this.X + 1, false, 4, null);
                Channel channel2 = this.W;
                t9.i.d(channel2);
                t4(channel2, 0, true);
            }
        }
        com.mobile.brasiltv.utils.i1.n(getContext());
    }

    @Override // k5.a
    public void V2() {
        super.V2();
        J5();
        ((TitanVideoView) x3(R$id.mVideoViewLive)).setKeepScreenOn(true);
        if (!Y3()) {
            ((AutoHideRelativeLayout) x3(R$id.mLiveControlPanelPortrait)).setVisibility(8);
            return;
        }
        ((AutoHideRelativeLayout) x3(R$id.mLiveControlPanelPortrait)).setVisibility(0);
        E5();
    }

    public final void V3(int i10, int i11, int i12, int i13) {
        X3(this.f4932r);
        int i14 = R$id.mVideoContainer;
        ((RatioFrameLayout) x3(i14)).setRatioEnable(!this.f4932r);
        ((RatioFrameLayout) x3(i14)).setLayoutParams(new FrameLayout.LayoutParams(i10, i11));
        Fragment parentFragment = getParentFragment();
        t9.i.e(parentFragment, "null cannot be cast to non-null type com.mobile.brasiltv.fragment.LiveFrag");
        FrameLayout H3 = ((b6.z) parentFragment).H3();
        t9.i.e(H3, "null cannot be cast to non-null type com.mobile.brasiltv.view.RatioFrameLayout");
        RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) H3;
        ratioFrameLayout.setRatioEnable(!this.f4932r);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i12, i13);
        if (!this.f4932r) {
            layoutParams.topMargin = AutoUtils.getPercentHeightSize(123);
        }
        ratioFrameLayout.setLayoutParams(layoutParams);
        ((TitanVideoView) x3(R$id.mVideoViewLive)).requestLayout();
    }

    public final void V4(ArrayList arrayList, int i10) {
        this.f4920j = arrayList;
        g5.j0 j0Var = this.f4926m;
        g5.j0 j0Var2 = null;
        if (j0Var == null) {
            t9.i.w("adapterChannel");
            j0Var = null;
        }
        j0Var.getData().clear();
        g5.j0 j0Var3 = this.f4926m;
        if (j0Var3 == null) {
            t9.i.w("adapterChannel");
            j0Var3 = null;
        }
        j0Var3.notifyDataSetChanged();
        g5.j0 j0Var4 = this.f4926m;
        if (j0Var4 == null) {
            t9.i.w("adapterChannel");
            j0Var4 = null;
        }
        j0Var4.getData().addAll(arrayList);
        g5.j0 j0Var5 = this.f4926m;
        if (j0Var5 == null) {
            t9.i.w("adapterChannel");
        } else {
            j0Var2 = j0Var5;
        }
        j0Var2.c(i10);
    }

    public final void W3(boolean z10) {
        Window window;
        if (z10) {
            androidx.fragment.app.e activity = getActivity();
            t9.i.d(activity);
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.flags = 1024 | attributes.flags;
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null) {
                window = activity2.getWindow();
            } else {
                window = null;
            }
            if (window != null) {
                window.setAttributes(attributes);
                return;
            }
            return;
        }
        androidx.fragment.app.e activity3 = getActivity();
        t9.i.d(activity3);
        activity3.getWindow().addFlags(1024);
        androidx.fragment.app.e activity4 = getActivity();
        t9.i.d(activity4);
        WindowManager.LayoutParams attributes2 = activity4.getWindow().getAttributes();
        attributes2.flags &= -1025;
        androidx.fragment.app.e activity5 = getActivity();
        t9.i.d(activity5);
        activity5.getWindow().setAttributes(attributes2);
        androidx.fragment.app.e activity6 = getActivity();
        t9.i.d(activity6);
        activity6.getWindow().clearFlags(1024);
        this.f4936v = false;
        ((AutoFrameLayout) x3(R$id.mFlLocked)).setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W4(mobile.com.requestframe.utils.response.Channel r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.r1.W4(mobile.com.requestframe.utils.response.Channel, boolean):void");
    }

    @Override // b6.f
    public void X2() {
        this.f4927m0.clear();
    }

    public final void X3(boolean z10) {
        if (z10) {
            E4();
        } else {
            q5();
        }
    }

    public final void X4() {
        String c10;
        w6.i b10 = w6.i.f19214g.b();
        Channel channel = this.f4922k;
        String str = "";
        String str2 = (channel == null || (str2 = channel.getName()) == null) ? "" : "";
        String obj = ((TextView) x3(R$id.mTvCastDevice)).getText().toString();
        String a10 = com.mobile.brasiltv.utils.h.f8694a.a();
        l6.g0 g0Var = this.f4938x;
        if (g0Var == null) {
            t9.i.w("mLivePlayPresenter");
            g0Var = null;
        }
        o6.a v10 = g0Var.v();
        if (v10 != null && (c10 = v10.c()) != null) {
            str = c10;
        }
        b10.s2(str2, obj, a10, str).subscribe(new u());
    }

    public final boolean Y3() {
        String str;
        if (t9.i.b(w6.i.f19214g.I(), "3")) {
            Channel channel = this.f4922k;
            if (channel != null) {
                str = channel.getRestricted();
            } else {
                str = null;
            }
            if (t9.i.b(str, "1")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void Y4() {
    }

    @Override // o8.a
    public void Z() {
    }

    @Override // j6.g
    public String Z0() {
        return this.E;
    }

    public final String Z3(Program program, o6.a aVar, boolean z10) {
        boolean z11;
        if (aVar == null) {
            return null;
        }
        String str = null;
        for (Media media : program.getMedias()) {
            if (t9.i.b(media.getQuality(), aVar.c())) {
                str = media.getName();
            }
        }
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            if (t9.i.b(aVar.c(), o6.c.c().c())) {
                Context context = getContext();
                if (context != null) {
                    com.mobile.brasiltv.utils.x.f8754a.w(context, new e());
                }
            } else if (t9.i.b(aVar.c(), o6.c.b().c())) {
                u5(this, false, false, 2, null);
            } else if (t9.i.b(aVar.c(), o6.c.a().c())) {
                t5(true, z10);
            }
        }
        return str;
    }

    public final void Z4(List list, int i10) {
        t9.i.g(list, "channelList");
        z.a aVar = b6.z.f5049u;
        aVar.g().put(i10, list);
        if (this.f4918i == i10) {
            g5.j0 j0Var = this.f4926m;
            g5.j0 j0Var2 = null;
            if (j0Var == null) {
                t9.i.w("adapterChannel");
                j0Var = null;
            }
            j0Var.getData().addAll(list);
            g5.j0 j0Var3 = this.f4926m;
            if (j0Var3 == null) {
                t9.i.w("adapterChannel");
            } else {
                j0Var2 = j0Var3;
            }
            j0Var2.notifyDataSetChanged();
            String f10 = aVar.f();
            if (f10 == null) {
                f10 = "";
            }
            k4(this, f10, (ArrayList) list, false, 4, null);
        }
    }

    public final void a5() {
        q5.j jVar = f4910o0;
        if (jVar != null) {
            jVar.q();
        }
    }

    @xa.j
    public final void alreadyQueryFav(AlreadyQueryFavEvent alreadyQueryFavEvent) {
        t9.i.g(alreadyQueryFavEvent, "event");
        Channel channel = this.f4922k;
        if (channel != null) {
            d6.a aVar = d6.a.f12650a;
            t9.i.d(channel);
            boolean g10 = aVar.g(channel);
            Channel channel2 = this.f4922k;
            t9.i.d(channel2);
            y5(g10, channel2.getChannelCode(), false);
        }
    }

    @Override // z5.c.d
    public void b0() {
    }

    @Override // o8.a
    public void b1() {
    }

    public final void b4() {
        if (!this.f4924l && !ga.a.c(getContext())) {
            ((TitanVideoView) x3(R$id.mVideoViewLive)).D();
            ((AutoLinearLayout) x3(R$id.mLayoutMobileNotify)).setVisibility(0);
            ((TextView) x3(R$id.mTextPlayNotify)).setText(getResources().getString(R.string.mobile_net_play));
            ((ImageView) x3(R$id.mPlayIcon)).setVisibility(0);
            ((TextView) x3(R$id.mTextToDo)).setText(getResources().getString(R.string.click_continue));
            ((TextView) x3(R$id.mTextNetNotify)).setVisibility(8);
        }
    }

    public final void b5() {
        Channel channel = this.f4922k;
        if (channel == null) {
            return;
        }
        d6.a aVar = d6.a.f12650a;
        t9.i.d(channel);
        if (aVar.l(channel.getChannelCode())) {
            return;
        }
        Channel channel2 = this.f4922k;
        t9.i.d(channel2);
        aVar.f(channel2.getChannelCode());
        Channel channel3 = this.f4922k;
        t9.i.d(channel3);
        if (aVar.g(channel3)) {
            Channel channel4 = this.f4922k;
            t9.i.d(channel4);
            aVar.h(channel4);
            return;
        }
        Channel channel5 = this.f4922k;
        t9.i.d(channel5);
        aVar.e(channel5);
    }

    @Override // z5.c.d
    public void c2() {
        xa.c.c().j(new CastPlaySuccessEvent("LIVE"));
        int i10 = R$id.mTvCastState;
        Context context = getContext();
        t9.i.d(context);
        ((TextView) x3(i10)).setText(context.getResources().getString(R.string.cast_status_casting));
        Context context2 = getContext();
        t9.i.d(context2);
        ((TextView) x3(i10)).setTextColor(context2.getResources().getColor(R.color.color_fffefe));
        ((TextView) x3(R$id.mTvPleaseWait)).setVisibility(8);
        ((TextView) x3(R$id.mTvCastRecommendHint)).setVisibility(4);
        c5();
    }

    public final boolean c4() {
        d6.b bVar = d6.b.f12660a;
        if (bVar.a() && (!bVar.c() || bVar.b() || bVar.d())) {
            return true;
        }
        Context context = getContext();
        if (context != null) {
            new BindEmailOrPhoneNotification(context).show();
            return false;
        }
        return false;
    }

    public final void c5() {
        CastDevice castDevice;
        String friendlyName;
        String friendly_name;
        com.mobile.brasiltv.utils.h hVar = com.mobile.brasiltv.utils.h.f8694a;
        String str = "";
        if (t9.i.b(hVar.a(), hVar.k())) {
            int i10 = R$id.mTvCastDevice;
            TextView textView = (TextView) x3(i10);
            Device g10 = com.mobile.brasiltv.utils.g.f8651a.g();
            if (g10 != null && (friendly_name = g10.getFriendly_name()) != null) {
                str = friendly_name;
            }
            textView.setText(str);
            ((TextView) x3(i10)).append("-DLNA");
            return;
        }
        int i11 = R$id.mTvCastDevice;
        TextView textView2 = (TextView) x3(i11);
        CastSession i12 = this.C.i();
        if (i12 != null && (castDevice = i12.getCastDevice()) != null && (friendlyName = castDevice.getFriendlyName()) != null) {
            str = friendlyName;
        }
        textView2.setText(str);
        ((TextView) x3(i11)).append("-ChromeCast");
    }

    @xa.j(threadMode = ThreadMode.MAIN)
    public final void castToCloseOtherPlay(CastToCloseOtherPlayEvent castToCloseOtherPlayEvent) {
        t9.i.g(castToCloseOtherPlayEvent, "event");
        if (t9.i.b(castToCloseOtherPlayEvent.getFromType(), "VOD") && com.mobile.brasiltv.utils.h.f8694a.s()) {
            U3(this, true, false, 2, null);
        }
    }

    @xa.j
    public final void castToPlay(CastToPlayEvent castToPlayEvent) {
        Media media;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String buss;
        String lang;
        String quality;
        String vcodec;
        String format;
        String buss2;
        String episode;
        String title;
        String name;
        String media2;
        List<Media> medias;
        androidx.fragment.app.e activity;
        t9.i.g(castToPlayEvent, "event");
        if (t9.i.b(castToPlayEvent.getFromType(), "LIVE") && (activity = getActivity()) != null) {
            activity.runOnUiThread(new Runnable() { // from class: b6.j1
                @Override // java.lang.Runnable
                public final void run() {
                    r1.S3(r1.this);
                }
            });
        }
        StringBuilder sb = new StringBuilder();
        sb.append("isReceivePrepareCast:");
        sb.append(this.O);
        sb.append(";isToastCastError:");
        sb.append(this.L);
        sb.append(";castErrorMsg:");
        sb.append(this.M);
        sb.append(";\t   mCastLiveUrl:");
        sb.append(this.F);
        if (this.O && !this.L && com.mobile.brasiltv.utils.b0.K(this.M)) {
            Integer num = this.N;
            if (num != null) {
                int intValue = num.intValue();
                String str13 = this.M;
                if (str13 == null) {
                    str13 = "";
                }
                s5(intValue, str13);
            }
            this.M = "";
        }
        Program program = this.J;
        if (program != null && (medias = program.getMedias()) != null) {
            media = medias.get(0);
        } else {
            media = null;
        }
        if (t9.i.b(castToPlayEvent.getFromType(), "LIVE") && com.mobile.brasiltv.utils.b0.K(this.F) && this.O) {
            this.K = false;
            L5();
            com.mobile.brasiltv.utils.g gVar = com.mobile.brasiltv.utils.g.f8651a;
            gVar.x(castToPlayEvent.getFromType());
            if (com.mobile.brasiltv.utils.b0.K(this.F)) {
                if (this.Q) {
                    str = P3("dlna");
                } else {
                    str = this.F;
                }
                String str14 = str;
                Program program2 = this.J;
                if (program2 == null || (media2 = program2.getMedia()) == null) {
                    str2 = "";
                } else {
                    str2 = media2;
                }
                Program program3 = this.J;
                if (program3 == null || (name = program3.getName()) == null) {
                    str3 = "";
                } else {
                    str3 = name;
                }
                Program program4 = this.J;
                if (program4 == null || (title = program4.getTitle()) == null) {
                    str4 = "";
                } else {
                    str4 = title;
                }
                Program program5 = this.J;
                if (program5 == null || (episode = program5.getEpisode()) == null) {
                    str5 = "";
                } else {
                    str5 = episode;
                }
                Program program6 = this.J;
                if (program6 == null || (buss2 = program6.getBuss()) == null) {
                    str6 = "";
                } else {
                    str6 = buss2;
                }
                if (media == null || (format = media.getFormat()) == null) {
                    str7 = "";
                } else {
                    str7 = format;
                }
                if (media == null || (vcodec = media.getVcodec()) == null) {
                    str8 = "";
                } else {
                    str8 = vcodec;
                }
                if (media == null || (quality = media.getQuality()) == null) {
                    str9 = "";
                } else {
                    str9 = quality;
                }
                if (media == null || (lang = media.getLang()) == null) {
                    str10 = "";
                } else {
                    str10 = lang;
                }
                Program program7 = this.J;
                if (program7 == null || (buss = program7.getBuss()) == null) {
                    str11 = "";
                } else {
                    str11 = buss;
                }
                String str15 = this.S;
                if (str15 == null) {
                    str12 = "";
                } else {
                    str12 = str15;
                }
                gVar.E(str14, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, 0L, str12, this.Q);
                this.D = com.mobile.brasiltv.utils.h.f8694a.k();
            }
        } else if (!this.O) {
            this.K = true;
        }
    }

    @xa.j
    public final void checkPwdSuccess(CheckPwdSuccessEvent checkPwdSuccessEvent) {
        boolean z10;
        g6.d dVar;
        t9.i.g(checkPwdSuccessEvent, "event");
        boolean z11 = false;
        MainAty.A.o(false);
        z.a aVar = b6.z.f5049u;
        ChildColumnList a10 = aVar.a();
        if (a10 != null && this.f4918i == a10.getId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            g6.d dVar2 = this.A;
            if (dVar2 != null && dVar2.isShowing()) {
                z11 = true;
            }
            if (z11 && (dVar = this.A) != null) {
                dVar.cancel();
            }
            if (aVar.g().indexOfKey(this.f4918i) >= 0) {
                g5.j0 j0Var = this.f4926m;
                g5.j0 j0Var2 = null;
                if (j0Var == null) {
                    t9.i.w("adapterChannel");
                    j0Var = null;
                }
                List data = j0Var.getData();
                Object obj = aVar.g().get(this.f4918i);
                t9.i.d(obj);
                data.addAll((Collection) obj);
                g5.j0 j0Var3 = this.f4926m;
                if (j0Var3 == null) {
                    t9.i.w("adapterChannel");
                } else {
                    j0Var2 = j0Var3;
                }
                j0Var2.notifyDataSetChanged();
                this.f4920j.clear();
                ArrayList arrayList = this.f4920j;
                Object obj2 = aVar.g().get(this.f4918i);
                t9.i.d(obj2);
                arrayList.addAll((Collection) obj2);
                String f10 = aVar.f();
                if (f10 == null) {
                    f10 = "";
                }
                k4(this, f10, this.f4920j, false, 4, null);
                return;
            }
            L4(this.f4918i);
        }
    }

    @Override // o8.a
    public void d1(long j10) {
        com.mobile.brasiltv.utils.h hVar = com.mobile.brasiltv.utils.h.f8694a;
        if (hVar.o() && hVar.t()) {
            com.mobile.brasiltv.utils.g.f8651a.G();
        }
        ((TitanVideoView) x3(R$id.mVideoViewLive)).C();
        this.F = "";
        hVar.v(false);
        this.O = true;
        this.N = Integer.valueOf((int) j10);
        Context context = getContext();
        if (context != null) {
            com.mobile.brasiltv.utils.x.f8754a.w(context, new d(context, j10));
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: b6.i1
                @Override // java.lang.Runnable
                public final void run() {
                    r1.R3(r1.this);
                }
            });
        }
    }

    public final void d4() {
        this.f4936v = true;
        q5.j jVar = f4910o0;
        if (jVar != null) {
            jVar.t();
        }
        ((AutoFrameLayout) x3(R$id.mFlLocked)).setVisibility(0);
        N4();
        ((AutoHideRelativeLayout) x3(R$id.mLiveControlPanelLandscape)).setVisibility(8);
    }

    public final void d5() {
        ((ProgressBar) x3(R$id.mPbBrightness)).setProgress((int) (r4() * 100));
    }

    @xa.j(threadMode = ThreadMode.MAIN)
    public final void disConnectEvent(CastToCloseFloatViewEvent castToCloseFloatViewEvent) {
        t9.i.g(castToCloseFloatViewEvent, "event");
        if (((AutoLinearLayout) x3(R$id.llSwitchContainer)).getVisibility() == 0) {
            U3(this, true, false, 2, null);
        }
    }

    @xa.j
    public final void disableFullScreen(FullScreenEvent fullScreenEvent) {
        t9.i.g(fullScreenEvent, "event");
        if (fullScreenEvent.getDisable()) {
            M5(Boolean.FALSE);
        } else {
            J5();
        }
    }

    @Override // z5.c.d
    public void e0() {
    }

    public final void e4() {
        this.f4936v = false;
        q5.j jVar = f4910o0;
        if (jVar != null) {
            jVar.x();
        }
        Disposable disposable = this.f4934t;
        if (disposable != null) {
            disposable.dispose();
        }
        ((AutoFrameLayout) x3(R$id.mFlLocked)).setVisibility(8);
        ((AutoHideRelativeLayout) x3(R$id.mLiveControlPanelLandscape)).setVisibility(0);
        d5();
        e5();
    }

    public final void e5() {
        ((ProgressBar) x3(R$id.mPbVolume)).setProgress((p4().d() * 100) / p4().e());
    }

    public final void f4() {
        Disposable disposable;
        Disposable disposable2 = this.f4933s;
        boolean z10 = false;
        if (disposable2 != null && !disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = this.f4933s) != null) {
            disposable.dispose();
        }
        Observable<Long> timer = Observable.timer(5000L, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread());
        final f fVar = new f();
        Consumer<? super Long> consumer = new Consumer() { // from class: b6.y0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                r1.g4(s9.l.this, obj);
            }
        };
        final g gVar = g.f4958a;
        this.f4933s = timer.subscribe(consumer, new Consumer() { // from class: b6.z0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                r1.h4(s9.l.this, obj);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        if (r1 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
        if (r1 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
        r3 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f5() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.r1.f5():void");
    }

    @Override // o8.a
    public d8.d g1(List list) {
        t9.i.g(list, "audioTrackList");
        return null;
    }

    public final void g5() {
        final GestureDetector gestureDetector = new GestureDetector(getActivity(), new v());
        ((RatioFrameLayout) x3(R$id.mVideoContainer)).setOnTouchListener(new View.OnTouchListener() { // from class: b6.q1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean h52;
                h52 = r1.h5(r1.this, gestureDetector, view, motionEvent);
                return h52;
            }
        });
    }

    @xa.j
    public final void googleCastToPlay(GoogleCastToPlayEvent googleCastToPlayEvent) {
        t9.i.g(googleCastToPlayEvent, "event");
        if (t9.i.b(googleCastToPlayEvent.getFromType(), "LIVE") && this.f4922k != null && com.mobile.brasiltv.utils.b0.K(this.F)) {
            this.K = false;
            L5();
            this.C.j(P3("google_cast"), 0, 0L, q4());
            z5.c cVar = this.C;
            Channel channel = this.f4922k;
            t9.i.d(channel);
            String channelCode = channel.getChannelCode();
            Channel channel2 = this.f4922k;
            t9.i.d(channel2);
            cVar.l(this, channelCode, channel2.getName(), this.G, "live", this.H, this.I, "");
            this.D = com.mobile.brasiltv.utils.h.f8694a.l();
            U3(this, false, false, 2, null);
        }
    }

    public final void i4(String str) {
        t9.i.g(str, "channelCode");
        Observable just = Observable.just(this.f4920j);
        final j jVar = new j(str);
        Observable compose = just.flatMap(new Function() { // from class: b6.b1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource n42;
                n42 = r1.n4(s9.l.this, obj);
                return n42;
            }
        }).compose(com.mobile.brasiltv.utils.p0.a());
        final k kVar = new k();
        compose.subscribe(new Consumer() { // from class: b6.c1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                r1.o4(s9.l.this, obj);
            }
        });
    }

    public final void i5(b8.b bVar) {
        t9.i.g(bVar, "<set-?>");
        this.f4919i0 = bVar;
    }

    public final void j4(String str, ArrayList arrayList, boolean z10) {
        t9.i.g(str, "channelCode");
        t9.i.g(arrayList, "channelList");
        Observable just = Observable.just(arrayList);
        final h hVar = new h(str);
        Observable compose = just.flatMap(new Function() { // from class: b6.w0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource l42;
                l42 = r1.l4(s9.l.this, obj);
                return l42;
            }
        }).compose(com.mobile.brasiltv.utils.p0.a());
        final i iVar = new i(z10);
        compose.subscribe(new Consumer() { // from class: b6.x0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                r1.m4(s9.l.this, obj);
            }
        });
    }

    public final void j5() {
        Resources resources;
        ((RatioFrameLayout) x3(R$id.mVideoContainer)).setOnClickListener(this);
        ((ImageView) x3(R$id.mIconSilence)).setOnClickListener(this);
        ((ImageView) x3(R$id.mIconFullscreen)).setOnClickListener(this);
        ((ImageView) x3(R$id.mIconSave)).setOnClickListener(this);
        ((ImageView) x3(R$id.mIvFavPort)).setOnClickListener(this);
        ((ImageView) x3(R$id.mIconBack)).setOnClickListener(this);
        ((AutoLinearLayout) x3(R$id.mLlChannelList)).setOnClickListener(this);
        ((AutoLinearLayout) x3(R$id.mLlPrevious)).setOnClickListener(this);
        ((AutoLinearLayout) x3(R$id.mLlLock)).setOnClickListener(this);
        ((AutoLinearLayout) x3(R$id.mLlQuality)).setOnClickListener(this);
        ((AutoFrameLayout) x3(R$id.mFlLocked)).setOnClickListener(this);
        ((AnimatorFrameLayout) x3(R$id.mLayoutChannelList)).setOnVisibilityListener(this);
        ((ImageView) x3(R$id.mIvPortQuality)).setOnClickListener(this);
        ImageView imageView = (ImageView) x3(R$id.mIconCast);
        t9.i.f(imageView, "mIconCast");
        com.mobile.brasiltv.utils.b0.P(imageView, this);
        ImageView imageView2 = (ImageView) x3(R$id.mIconCastPort);
        t9.i.f(imageView2, "mIconCastPort");
        com.mobile.brasiltv.utils.b0.P(imageView2, this);
        ((ImageView) x3(R$id.mIvCastClose)).setOnClickListener(new View.OnClickListener() { // from class: b6.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.n5(r1.this, view);
            }
        });
        ((ImageView) x3(R$id.mIvCastSwitchDevice)).setOnClickListener(new View.OnClickListener() { // from class: b6.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.o5(r1.this, view);
            }
        });
        ((ImageView) x3(R$id.mIvCastFeedback)).setOnClickListener(new View.OnClickListener() { // from class: b6.m1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.p5(r1.this, view);
            }
        });
        ((TextView) x3(R$id.tvConfirm)).setOnClickListener(new View.OnClickListener() { // from class: b6.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.k5(view);
            }
        });
        int i10 = R$id.mRecyclerSort;
        ((KoocanRecyclerView) x3(i10)).addOnItemTouchListener(new x());
        int i11 = R$id.mRecyclerChannel;
        ((KoocanRecyclerView) x3(i11)).addOnItemTouchListener(new y());
        g5.j0 j0Var = this.f4926m;
        if (j0Var == null) {
            t9.i.w("adapterChannel");
            j0Var = null;
        }
        j0Var.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() { // from class: b6.o1
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
            public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                r1.l5(r1.this, baseQuickAdapter, view, i12);
            }
        });
        ((KoocanRecyclerView) x3(i10)).addOnItemTouchListener(this.f4915g0);
        ((KoocanRecyclerView) x3(i11)).addOnItemTouchListener(this.f4915g0);
        ((TextView) x3(R$id.mTextToDo)).setOnClickListener(this);
        ((TextView) x3(R$id.mTextToDo2)).setOnClickListener(this);
        ((TitanVideoView) x3(R$id.mVideoViewLive)).setPlayerListener(this);
        int i12 = R$id.mTvCastRecommendHint;
        TextView textView = (TextView) x3(i12);
        Context context = getContext();
        textView.setText(Html.fromHtml((context == null || (resources = context.getResources()) == null || (r2 = resources.getString(R.string.cast_recommend_hint)) == null) ? "" : ""));
        ((TextView) x3(i12)).setOnClickListener(new View.OnClickListener() { // from class: b6.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.m5(r1.this, view);
            }
        });
        ((ImageView) x3(R$id.mImageLandFeedback)).setOnClickListener(this);
        ((ImageView) x3(R$id.mImageFeedback)).setOnClickListener(this);
        ((ImageView) x3(R$id.mImageLandShare)).setOnClickListener(this);
        ((ImageView) x3(R$id.mImageShare)).setOnClickListener(this);
        ((ImageView) x3(R$id.mDebugSwitch)).setOnClickListener(this);
        ((ImageView) x3(R$id.mDebugSwitch_lands)).setOnClickListener(this);
    }

    @Override // o8.a
    public void l0() {
    }

    @Override // o8.a
    public void m(String str, String str2, long j10) {
        t9.i.g(str, "adName");
        t9.i.g(str2, "path");
    }

    @Override // o8.a
    public void m2() {
        ((RelativeLayout) x3(R$id.mBufferView)).setVisibility(8);
        O5();
    }

    @Override // o8.a
    public void n2() {
        ((RelativeLayout) x3(R$id.mBufferView)).setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        g5.o0 o0Var = new g5.o0();
        this.f4928n = o0Var;
        o0Var.getData().addAll(this.f4914g);
        int i10 = R$id.mRecyclerSort;
        ((KoocanRecyclerView) x3(i10)).setLayoutManager(new LinearLayoutManagerWrapper(getContext()));
        KoocanRecyclerView koocanRecyclerView = (KoocanRecyclerView) x3(i10);
        g5.o0 o0Var2 = this.f4928n;
        g5.j0 j0Var = null;
        if (o0Var2 == null) {
            t9.i.w("adapterSort");
            o0Var2 = null;
        }
        koocanRecyclerView.setAdapter(o0Var2);
        Context context = getContext();
        t9.i.d(context);
        this.f4926m = new g5.j0(context);
        int i11 = R$id.mRecyclerChannel;
        ((KoocanRecyclerView) x3(i11)).setLayoutManager(new LinearLayoutManagerWrapper(getContext()));
        KoocanRecyclerView koocanRecyclerView2 = (KoocanRecyclerView) x3(i11);
        g5.j0 j0Var2 = this.f4926m;
        if (j0Var2 == null) {
            t9.i.w("adapterChannel");
        } else {
            j0Var = j0Var2;
        }
        koocanRecyclerView2.setAdapter(j0Var);
        j5();
        ((ImageView) x3(R$id.mIconSilence)).setTag(Boolean.FALSE);
        Context context2 = getContext();
        t9.i.d(context2);
        Object systemService = context2.getSystemService("audio");
        t9.i.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f4929o = (AudioManager) systemService;
        this.f4938x = new l6.g0(this, this);
        xa.c.c().o(this);
        H4();
        g5();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean b10;
        boolean b11;
        boolean b12;
        boolean b13;
        String str;
        String str2;
        Program program;
        Program program2;
        TitanVideoView titanVideoView;
        t9.i.g(view, "v");
        if (t9.i.b(view, (ImageView) x3(R$id.mIconSilence))) {
            G5();
        } else if (t9.i.b(view, (ImageView) x3(R$id.mIconFullscreen))) {
            a5();
        } else if (t9.i.b(view, (RatioFrameLayout) x3(R$id.mVideoContainer))) {
            if (!this.f4936v) {
                C5();
                return;
            }
            int i10 = R$id.mFlLocked;
            if (((AutoFrameLayout) x3(i10)).getVisibility() == 0) {
                Disposable disposable = this.f4934t;
                if (disposable != null) {
                    disposable.dispose();
                }
                ((AutoFrameLayout) x3(i10)).setVisibility(8);
                return;
            }
            N4();
            ((AutoFrameLayout) x3(i10)).setVisibility(0);
        } else {
            boolean z10 = true;
            if (t9.i.b(view, (ImageView) x3(R$id.mIconSave))) {
                b10 = true;
            } else {
                b10 = t9.i.b(view, (ImageView) x3(R$id.mIvFavPort));
            }
            if (b10) {
                b5();
            } else if (t9.i.b(view, (AutoLinearLayout) x3(R$id.mLlChannelList))) {
                w5();
            } else if (t9.i.b(view, (ImageView) x3(R$id.mIconBack))) {
                a5();
            } else if (t9.i.b(view, (AutoLinearLayout) x3(R$id.mLlLock))) {
                if (!this.f4936v) {
                    d4();
                }
            } else if (t9.i.b(view, (AutoFrameLayout) x3(R$id.mFlLocked))) {
                if (this.f4936v) {
                    e4();
                }
            } else if (t9.i.b(view, (AutoLinearLayout) x3(R$id.mLlPrevious))) {
                U4();
            } else if (t9.i.b(view, (TextView) x3(R$id.mTextToDo))) {
                y4();
            } else if (t9.i.b(view, (TextView) x3(R$id.mTextToDo2))) {
                com.mobile.brasiltv.utils.b0.a0(this, AccountBindAty.class);
            } else {
                if (t9.i.b(view, (ImageView) x3(R$id.mIconCast))) {
                    b11 = true;
                } else {
                    b11 = t9.i.b(view, (ImageView) x3(R$id.mIconCastPort));
                }
                String str3 = null;
                if (b11) {
                    if (getActivity() == null) {
                        return;
                    }
                    a.C0074a c0074a = b8.a.f5079a;
                    androidx.fragment.app.e activity = getActivity();
                    t9.i.d(activity);
                    if (!c0074a.c(activity)) {
                        v5();
                    } else {
                        int i11 = R$id.mVideoViewLive;
                        n8.b titanContext = ((TitanVideoView) x3(i11)).getTitanContext();
                        if (titanContext != null) {
                            program = titanContext.h();
                        } else {
                            program = null;
                        }
                        if (program != null) {
                            ((TitanVideoView) x3(i11)).D();
                        }
                        n8.b titanContext2 = ((TitanVideoView) x3(i11)).getTitanContext();
                        if (titanContext2 != null) {
                            program2 = titanContext2.a();
                        } else {
                            program2 = null;
                        }
                        if (program2 != null && (titanVideoView = (TitanVideoView) x3(i11)) != null) {
                            titanVideoView.C();
                        }
                        Program program3 = this.J;
                        if (program3 != null) {
                            TitanVideoView titanVideoView2 = (TitanVideoView) x3(i11);
                            Program program4 = this.J;
                            titanVideoView2.v(program3, (program4 == null || (r2 = program4.getBuss()) == null) ? "" : "");
                        }
                        this.O = false;
                        xa.c.c().j(new CastToCloseOtherPlayEvent("LIVE", false, 2, null));
                        com.mobile.brasiltv.utils.b0.b0(this, CastByNativeDeviceAty.class, t.f4981a);
                    }
                    androidx.fragment.app.e activity2 = getActivity();
                    t9.i.d(activity2);
                    com.mobile.brasiltv.utils.i1.g(activity2, "EVENT_CAST_LIVE_CLICK");
                    return;
                }
                if (t9.i.b(view, (ImageView) x3(R$id.mImageFeedback))) {
                    b12 = true;
                } else {
                    b12 = t9.i.b(view, (ImageView) x3(R$id.mImageLandFeedback));
                }
                if (b12) {
                    FeedBackDialog.Companion companion = FeedBackDialog.Companion;
                    androidx.fragment.app.e activity3 = getActivity();
                    t9.i.d(activity3);
                    boolean z11 = this.f4932r;
                    Channel channel = this.f4922k;
                    if (channel != null) {
                        str2 = channel.getAlias();
                    } else {
                        str2 = null;
                    }
                    Channel channel2 = this.f4922k;
                    if (channel2 != null) {
                        str3 = channel2.getName();
                    }
                    CommonDialog feedBackDialog = companion.getFeedBackDialog(activity3, z11, 2, com.mobile.brasiltv.utils.b0.e(str2, str3));
                    this.f4931q = feedBackDialog;
                    if (feedBackDialog != null) {
                        feedBackDialog.show();
                    }
                    CommonDialog commonDialog = this.f4931q;
                    if (commonDialog != null) {
                        commonDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: b6.d1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                r1.R4(r1.this, dialogInterface);
                            }
                        });
                        return;
                    }
                    return;
                }
                if (t9.i.b(view, (ImageView) x3(R$id.mDebugSwitch))) {
                    b13 = true;
                } else {
                    b13 = t9.i.b(view, (ImageView) x3(R$id.mDebugSwitch_lands));
                }
                if (!b13) {
                    int i12 = R$id.mImageShare;
                    if (!t9.i.b(view, (ImageView) x3(i12))) {
                        z10 = t9.i.b(view, (ImageView) x3(R$id.mImageLandShare));
                    }
                    if (z10) {
                        Context context = getContext();
                        if (t9.i.b(view, (ImageView) x3(i12))) {
                            str = "liveDetail";
                        } else {
                            str = "liveFullScreen";
                        }
                        com.mobile.brasiltv.utils.i1.I(context, str);
                        com.mobile.brasiltv.utils.b0.k0(this, w6.i.f19214g.C() + "/#/shareApp", false, true, false, 8, null);
                    }
                }
            }
        }
    }

    @Override // o8.a
    public void onCompletion() {
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        t9.i.g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if (!getUserVisibleHint() && configuration.orientation == 2) {
            return;
        }
        CommonDialog commonDialog = this.f4931q;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
        PopupWindow popupWindow = this.f4917h0;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        if (configuration.orientation == 1) {
            this.f4932r = false;
            Disposable disposable = this.f4934t;
            if (disposable != null) {
                disposable.dispose();
            }
            ((AutoFrameLayout) x3(R$id.mFlLocked)).setVisibility(8);
            V3(-1, com.mobile.brasiltv.utils.s0.a(getContext(), 203.0f), -1, com.mobile.brasiltv.utils.s0.a(getContext(), 203.0f));
            xa.c c10 = xa.c.c();
            String f10 = b6.z.f5049u.f();
            t9.i.d(f10);
            c10.j(new UpdateHighLightEvent(f10));
            ((AutoHideRelativeLayout) x3(R$id.mLiveControlPanelLandscape)).setVisibility(8);
            this.f4936v = false;
            W3(this.f4932r);
            ((AnimatorFrameLayout) x3(R$id.mLayoutChannelList)).setVisibility(8);
            E5();
            return;
        }
        this.f4932r = true;
        z5();
        Channel channel = this.f4922k;
        if (channel != null) {
            y5(d6.a.f12650a.g(channel), channel.getChannelCode(), false);
        }
        V3(-1, -1, -1, -1);
        ((AutoHideRelativeLayout) x3(R$id.mLiveControlPanelPortrait)).setVisibility(8);
        W3(this.f4932r);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t9.i.g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.frag_live_play, viewGroup, false);
    }

    @Override // u8.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        xa.c.c().r(this);
        M5(Boolean.FALSE);
        if (this.f4919i0 != null) {
            b8.b.b(p4(), false, 1, null);
        }
    }

    @Override // b6.f, u8.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        W2(false);
        ((TitanVideoView) x3(R$id.mVideoViewLive)).D();
        if (com.mobile.brasiltv.utils.h.f8694a.t()) {
            com.mobile.brasiltv.utils.g.f8651a.G();
        }
        G4();
        X2();
    }

    @Override // com.mobile.brasiltv.view.KoocanRecyclerView.OnVisibility
    public void onVisibility(int i10, View view) {
        if (i10 == 0) {
            ((AutoHideRelativeLayout) x3(R$id.mLiveControlPanelLandscape)).setVisibility(8);
            if (t9.i.b((AnimatorFrameLayout) x3(R$id.mLayoutChannelList), view)) {
                return;
            }
            int i11 = R$id.mLiveControl;
            ((AutoRelativeLayout) x3(i11)).setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            ((AutoRelativeLayout) x3(i11)).setAlpha(0.75f);
            return;
        }
        int i12 = R$id.mLiveControl;
        ((AutoRelativeLayout) x3(i12)).setBackgroundColor(0);
        ((AutoRelativeLayout) x3(i12)).setAlpha(1.0f);
    }

    @Override // o8.a
    public void p1() {
    }

    public final b8.b p4() {
        b8.b bVar = this.f4919i0;
        if (bVar != null) {
            return bVar;
        }
        t9.i.w("mVoiceHelper");
        return null;
    }

    @Override // o8.a
    public void q0(Status status) {
        t9.i.g(status, Constant.KEY_STATUS);
        String play_url = status.getPlay_url();
        t9.i.f(play_url, "status.play_url");
        this.F = play_url;
        this.Q = status.isUrl_modified();
        this.S = status.getHost();
        if (this.M != null) {
            this.M = "";
        }
        this.O = true;
        ((TitanVideoView) x3(R$id.mVideoViewLive)).C();
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: b6.e1
                @Override // java.lang.Runnable
                public final void run() {
                    r1.Q3(r1.this);
                }
            });
        }
    }

    public final MediaMetadata q4() {
        MediaMetadata mediaMetadata = new MediaMetadata(1);
        Channel channel = this.f4922k;
        t9.i.d(channel);
        String alias = channel.getAlias();
        Channel channel2 = this.f4922k;
        t9.i.d(channel2);
        mediaMetadata.putString(MediaMetadata.KEY_TITLE, com.mobile.brasiltv.utils.b0.e(alias, channel2.getName()));
        mediaMetadata.putString(MediaMetadata.KEY_SUBTITLE, "");
        Channel channel3 = this.f4922k;
        t9.i.d(channel3);
        if (com.mobile.brasiltv.utils.b0.H(channel3.getPosterUrl())) {
            Channel channel4 = this.f4922k;
            t9.i.d(channel4);
            mediaMetadata.addImage(new WebImage(Uri.parse(channel4.getPosterUrl())));
        }
        return mediaMetadata;
    }

    public final void q5() {
        View view;
        Window window;
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        if (view != null) {
            view.setSystemUiVisibility(0);
        }
        androidx.fragment.app.e activity2 = getActivity();
        if (activity2 != null) {
            n5.a.f17268a.h(activity2);
        }
    }

    @Override // o8.a
    public void r1(long j10) {
    }

    public final float r4() {
        boolean z10;
        androidx.fragment.app.e activity = getActivity();
        t9.i.d(activity);
        int i10 = 0;
        if (activity.getWindow().getAttributes().screenBrightness == -1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                androidx.fragment.app.e activity2 = getActivity();
                t9.i.d(activity2);
                i10 = Settings.System.getInt(activity2.getContentResolver(), "screen_brightness");
            } catch (Settings.SettingNotFoundException e10) {
                e10.printStackTrace();
            }
            Resources system = Resources.getSystem();
            return i10 / system.getInteger(system.getIdentifier("config_screenBrightnessSettingMaximum", "integer", "android"));
        }
        androidx.fragment.app.e activity3 = getActivity();
        t9.i.d(activity3);
        return activity3.getWindow().getAttributes().screenBrightness;
    }

    public final void r5(boolean z10) {
        int i10;
        s6.a aVar = s6.a.f18777a;
        if (!aVar.a().p() || !aVar.a().o()) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ((ImageView) x3(R$id.mIconCast)).setVisibility(i10);
        ((ImageView) x3(R$id.mIconCastPort)).setVisibility(i10);
    }

    @xa.j
    public final void readyForPlay(UpdateChannelEvent updateChannelEvent) {
        int i10;
        t9.i.g(updateChannelEvent, "event");
        int position = updateChannelEvent.getPosition();
        Object clone = updateChannelEvent.getListChannel().clone();
        t9.i.e(clone, "null cannot be cast to non-null type java.util.ArrayList<mobile.com.requestframe.utils.response.Channel>{ kotlin.collections.TypeAliasesKt.ArrayList<mobile.com.requestframe.utils.response.Channel> }");
        ArrayList arrayList = (ArrayList) clone;
        Object obj = arrayList.get(position);
        t9.i.f(obj, "listChannel[position]");
        Channel channel = (Channel) obj;
        this.E = updateChannelEvent.getTdcFrom();
        this.W = this.f4922k;
        this.X = updateChannelEvent.getPreviousColumnIndex();
        boolean z10 = false;
        r5(false);
        D5(8);
        x5(false);
        ((AutoLinearLayout) x3(R$id.mLayoutMobileNotify)).setVisibility(8);
        ChildColumnList e10 = b6.z.f5049u.e();
        if (e10 != null) {
            i10 = e10.getId();
        } else {
            i10 = 0;
        }
        if (i10 == updateChannelEvent.getCategoryCode()) {
            z10 = true;
        }
        W4(channel, z10);
        V4(arrayList, position);
    }

    @xa.j
    public final void readyForPlayFav(ReadyPlayFavEvent readyPlayFavEvent) {
        t9.i.g(readyPlayFavEvent, "event");
        int position = readyPlayFavEvent.getPosition();
        ArrayList<Channel> listChannel = readyPlayFavEvent.getListChannel();
        Channel channel = listChannel.get(position);
        t9.i.f(channel, "listChannel[position]");
        Channel channel2 = channel;
        z.a aVar = b6.z.f5049u;
        if (aVar.b().get(channel2.getChannelCode()) != null) {
            Object obj = aVar.b().get(channel2.getChannelCode());
            t9.i.d(obj);
            channel2 = (Channel) obj;
        }
        this.E = "fav";
        this.W = this.f4922k;
        this.X = readyPlayFavEvent.getPreviousColumnIndex();
        ((AutoLinearLayout) x3(R$id.mLayoutMobileNotify)).setVisibility(8);
        ((RelativeLayout) x3(R$id.mBufferView)).setVisibility(0);
        D5(8);
        W4(channel2, false);
        V4(listChannel, position);
    }

    @xa.j
    public final void refreshEPGMessage(RefreshEPGEvent refreshEPGEvent) {
        t9.i.g(refreshEPGEvent, "event");
        Channel channel = this.f4922k;
        if (channel != null) {
            r0.a aVar = r0.A;
            if (aVar.d().containsKey(channel.getChannelCode())) {
                Object obj = aVar.d().get(channel.getChannelCode());
                t9.i.d(obj);
                ((TextView) x3(R$id.tvProgramName)).setText(((EpgResultData) obj).getTitle());
            }
        }
    }

    public String s4() {
        String simpleName = r1.class.getSimpleName();
        t9.i.f(simpleName, "javaClass.simpleName");
        return simpleName;
    }

    public final void s5(int i10, String str) {
        t9.i.g(str, "extra");
        xa.c.c().j(new CastToCloseFloatViewEvent());
        if (com.mobile.brasiltv.utils.b0.K(str)) {
            ((TextView) x3(R$id.mTvCastRecommendHint)).setVisibility(8);
            int i11 = R$id.mTvCastErrorHint;
            ((TextView) x3(i11)).setText(str);
            ((TextView) x3(i11)).setVisibility(0);
        } else {
            ((TextView) x3(R$id.mTvCastRecommendHint)).setVisibility(0);
            ((TextView) x3(R$id.mTvCastErrorHint)).setVisibility(8);
        }
        int i12 = R$id.mTvCastState;
        Context context = getContext();
        t9.i.d(context);
        ((TextView) x3(i12)).setText(context.getResources().getString(R.string.cast_status_casting_failed));
        StringBuilder sb = new StringBuilder();
        sb.append(ASCIIPropertyListParser.ARRAY_BEGIN_TOKEN);
        sb.append(i10);
        sb.append(ASCIIPropertyListParser.ARRAY_END_TOKEN);
        ((TextView) x3(i12)).append(sb.toString());
        Context context2 = getContext();
        t9.i.d(context2);
        ((TextView) x3(i12)).setTextColor(context2.getResources().getColor(R.color.color_f72f2f));
        ((TextView) x3(R$id.mTvPleaseWait)).setVisibility(8);
    }

    @xa.j
    public final void showNoNetNotify(NetworkEvent networkEvent) {
        t9.i.g(networkEvent, "event");
        if (NetworkEvent.NetState.NO_NET == networkEvent.getMState() && isVisible() && ((TitanVideoView) x3(R$id.mVideoViewLive)).s()) {
            com.mobile.brasiltv.utils.f1.f8649a.t(R.string.net_remind_net_break);
        } else if (this.f4924l && isVisible() && isResumed()) {
            TitanVideoView titanVideoView = (TitanVideoView) x3(R$id.mVideoViewLive);
            t9.i.d(titanVideoView);
            titanVideoView.post(new Runnable() { // from class: b6.v0
                @Override // java.lang.Runnable
                public final void run() {
                    r1.B5(r1.this);
                }
            });
        }
    }

    @Override // o8.a
    public void t0() {
    }

    public final void t4(Channel channel, int i10, boolean z10) {
        String str;
        int i11;
        String channelCode = channel.getChannelCode();
        Channel channel2 = this.f4922k;
        g5.j0 j0Var = null;
        if (channel2 != null) {
            str = channel2.getChannelCode();
        } else {
            str = null;
        }
        if (t9.i.b(channelCode, str)) {
            return;
        }
        this.W = this.f4922k;
        com.mobile.brasiltv.utils.n0 n0Var = com.mobile.brasiltv.utils.n0.f8733a;
        androidx.fragment.app.e activity = getActivity();
        t9.i.d(activity);
        boolean z11 = false;
        this.X = n0Var.d(activity, "live_last_play_column_index", 0);
        androidx.fragment.app.e activity2 = getActivity();
        t9.i.d(activity2);
        n0Var.i(activity2, "live_last_play_column_index", this.f4916h - 1);
        i.c cVar = w6.i.f19214g;
        if (t9.i.b(cVar.e(), "1") && (t9.i.b(cVar.I(), "1") || t9.i.b(cVar.I(), "2"))) {
            androidx.fragment.app.e activity3 = getActivity();
            t9.i.d(activity3);
            n0Var.g(activity3, "live_first_play_free_column", false);
        }
        ((AutoLinearLayout) x3(R$id.mLayoutMobileNotify)).setVisibility(8);
        f4();
        r5(false);
        D5(8);
        x5(false);
        if (z10) {
            String channelCode2 = channel.getChannelCode();
            g5.j0 j0Var2 = this.f4926m;
            if (j0Var2 == null) {
                t9.i.w("adapterChannel");
            } else {
                j0Var = j0Var2;
            }
            List data = j0Var.getData();
            t9.i.e(data, "null cannot be cast to non-null type java.util.ArrayList<mobile.com.requestframe.utils.response.Channel>{ kotlin.collections.TypeAliasesKt.ArrayList<mobile.com.requestframe.utils.response.Channel> }");
            k4(this, channelCode2, (ArrayList) data, false, 4, null);
        } else {
            g5.j0 j0Var3 = this.f4926m;
            if (j0Var3 == null) {
                t9.i.w("adapterChannel");
            } else {
                j0Var = j0Var3;
            }
            j0Var.c(i10);
        }
        z.a aVar = b6.z.f5049u;
        ChildColumnList e10 = aVar.e();
        if (e10 != null) {
            i11 = e10.getId();
        } else {
            i11 = 0;
        }
        if (i11 == this.f4918i) {
            z11 = true;
        }
        String str2 = "";
        if (com.mobile.brasiltv.utils.b0.I(aVar.d())) {
            ArrayList d10 = aVar.d();
            t9.i.d(d10);
            int size = d10.size();
            int i12 = this.f4916h;
            if (size > i12 - 1) {
                if (i12 == 0) {
                    str2 = "fav";
                } else {
                    ArrayList d11 = aVar.d();
                    t9.i.d(d11);
                    String alias = ((ChildColumnList) d11.get(this.f4916h - 1)).getAlias();
                    if (alias != null) {
                        str2 = alias;
                    }
                }
            }
        }
        this.E = str2;
        W4(channel, z11);
    }

    public final void t5(boolean z10, boolean z11) {
        String string;
        String str;
        if (getActivity() == null) {
            return;
        }
        if (z11) {
            androidx.fragment.app.e activity = getActivity();
            t9.i.d(activity);
            String string2 = getString(R.string.package_premium_cast_plan_tips);
            t9.i.f(string2, "getString(R.string.package_premium_cast_plan_tips)");
            new CommTipsDialog(activity, string2, getString(R.string.cast_service_plan), getString(R.string.cast_purchase), null, null, new z(), null, false, 256, null).show();
            return;
        }
        if (z10) {
            string = getString(R.string.package_premium_service_plan_tips);
        } else {
            string = getString(R.string.cast_service_plan_tips);
        }
        String str2 = string;
        t9.i.f(str2, "if (isFHD) {\n           …_plan_tips)\n            }");
        boolean p10 = s6.a.f18777a.a().p();
        androidx.fragment.app.e activity2 = getActivity();
        t9.i.d(activity2);
        String string3 = getString(R.string.cast_service_plan);
        String string4 = getString(R.string.cast_purchase);
        String str3 = null;
        if (p10) {
            str = getString(R.string.try_epurchasing);
        } else {
            str = null;
        }
        if (p10) {
            str3 = getString(R.string.cast_service_tips);
        }
        new CommTipsDialog(activity2, str2, string3, string4, str, str3, new a0(), new b0(p10, this), false, 256, null).show();
    }

    @Override // o8.a
    public void u(int i10) {
        Context context = getContext();
        if (context != null) {
            com.mobile.brasiltv.utils.x.f8754a.w(context, new d0(context, i10, this));
        }
    }

    @xa.j
    public final void updateFavStatus(UpdateFavStatusEvent updateFavStatusEvent) {
        t9.i.g(updateFavStatusEvent, "event");
        y5(updateFavStatusEvent.isFav(), updateFavStatusEvent.getChannelCode(), true);
    }

    @xa.j
    public final void updateFullScreenSort(UpdateFullScreenSortEvent updateFullScreenSortEvent) {
        boolean z10;
        t9.i.g(updateFullScreenSortEvent, "event");
        this.f4912f.clear();
        this.f4914g.clear();
        z.a aVar = b6.z.f5049u;
        if (com.mobile.brasiltv.utils.b0.I(aVar.d())) {
            ArrayList<ChildColumnList> d10 = aVar.d();
            t9.i.d(d10);
            for (ChildColumnList childColumnList : d10) {
                this.f4912f.add(Integer.valueOf(childColumnList.getId()));
                if (!com.mobile.brasiltv.utils.f0.b()) {
                    String alias = childColumnList.getAlias();
                    if (alias != null && alias.length() != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        ArrayList arrayList = this.f4914g;
                        String alias2 = childColumnList.getAlias();
                        t9.i.d(alias2);
                        arrayList.add(alias2);
                    }
                }
                this.f4914g.add(childColumnList.getName());
            }
        }
        ArrayList arrayList2 = this.f4914g;
        Context context = getContext();
        t9.i.d(context);
        arrayList2.add(0, context.getResources().getString(R.string.live_fav));
        g5.o0 o0Var = this.f4928n;
        g5.o0 o0Var2 = null;
        if (o0Var == null) {
            t9.i.w("adapterSort");
            o0Var = null;
        }
        o0Var.getData().clear();
        g5.o0 o0Var3 = this.f4928n;
        if (o0Var3 == null) {
            t9.i.w("adapterSort");
            o0Var3 = null;
        }
        o0Var3.getData().addAll(this.f4914g);
        g5.o0 o0Var4 = this.f4928n;
        if (o0Var4 == null) {
            t9.i.w("adapterSort");
        } else {
            o0Var2 = o0Var4;
        }
        o0Var2.notifyDataSetChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    @xa.j(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateRestrict(com.mobile.brasiltv.bean.event.UpdateRestrictEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            t9.i.g(r5, r0)
            w6.i$c r0 = w6.i.f19214g
            java.lang.String r0 = r0.e()
            java.lang.String r1 = "1"
            boolean r0 = t9.i.b(r0, r1)
            if (r0 == 0) goto Lee
            b6.z$a r0 = b6.z.f5049u
            java.util.ArrayList r1 = r0.d()
            if (r1 == 0) goto Lee
            boolean r1 = com.mobile.brasiltv.utils.f0.b()
            if (r1 != 0) goto L49
            mobile.com.requestframe.utils.response.ChildColumnList r1 = r0.a()
            t9.i.d(r1)
            java.lang.String r1 = r1.getAlias()
            if (r1 == 0) goto L37
            int r1 = r1.length()
            if (r1 != 0) goto L35
            goto L37
        L35:
            r1 = 0
            goto L38
        L37:
            r1 = 1
        L38:
            if (r1 != 0) goto L49
            mobile.com.requestframe.utils.response.ChildColumnList r1 = r0.a()
            t9.i.d(r1)
            java.lang.String r1 = r1.getAlias()
            t9.i.d(r1)
            goto L54
        L49:
            mobile.com.requestframe.utils.response.ChildColumnList r1 = r0.a()
            t9.i.d(r1)
            java.lang.String r1 = r1.getName()
        L54:
            java.lang.String r5 = r5.getStatus()
            java.lang.String r2 = "0"
            boolean r5 = t9.i.b(r5, r2)
            r2 = 0
            java.lang.String r3 = "adapterSort"
            if (r5 == 0) goto La9
            java.util.ArrayList r5 = r4.f4914g
            r5.remove(r1)
            java.util.ArrayList r5 = r4.f4912f
            mobile.com.requestframe.utils.response.ChildColumnList r0 = r0.a()
            t9.i.d(r0)
            int r0 = r0.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.remove(r0)
            g5.o0 r5 = r4.f4928n
            if (r5 != 0) goto L84
            t9.i.w(r3)
            r5 = r2
        L84:
            java.util.List r5 = r5.getData()
            r5.clear()
            g5.o0 r5 = r4.f4928n
            if (r5 != 0) goto L93
            t9.i.w(r3)
            r5 = r2
        L93:
            java.util.List r5 = r5.getData()
            java.util.ArrayList r0 = r4.f4914g
            r5.addAll(r0)
            g5.o0 r5 = r4.f4928n
            if (r5 != 0) goto La4
            t9.i.w(r3)
            goto La5
        La4:
            r2 = r5
        La5:
            r2.notifyDataSetChanged()
            goto Lee
        La9:
            java.util.ArrayList r5 = r4.f4914g
            r5.add(r1)
            java.util.ArrayList r5 = r4.f4912f
            mobile.com.requestframe.utils.response.ChildColumnList r0 = r0.a()
            t9.i.d(r0)
            int r0 = r0.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            g5.o0 r5 = r4.f4928n
            if (r5 != 0) goto Lca
            t9.i.w(r3)
            r5 = r2
        Lca:
            java.util.List r5 = r5.getData()
            r5.clear()
            g5.o0 r5 = r4.f4928n
            if (r5 != 0) goto Ld9
            t9.i.w(r3)
            r5 = r2
        Ld9:
            java.util.List r5 = r5.getData()
            java.util.ArrayList r0 = r4.f4914g
            r5.addAll(r0)
            g5.o0 r5 = r4.f4928n
            if (r5 != 0) goto Lea
            t9.i.w(r3)
            goto Leb
        Lea:
            r2 = r5
        Leb:
            r2.notifyDataSetChanged()
        Lee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.r1.updateRestrict(com.mobile.brasiltv.bean.event.UpdateRestrictEvent):void");
    }

    @xa.j
    public final void userIdentityChange(UserIdentityChangeEvent userIdentityChangeEvent) {
        t9.i.g(userIdentityChangeEvent, "event");
        l6.g0 g0Var = null;
        if (t9.i.b(w6.i.f19214g.I(), "1")) {
            l6.g0 g0Var2 = this.f4938x;
            if (g0Var2 == null) {
                t9.i.w("mLivePlayPresenter");
                g0Var2 = null;
            }
            g0Var2.w().clear();
        } else {
            l6.g0 g0Var3 = this.f4938x;
            if (g0Var3 == null) {
                t9.i.w("mLivePlayPresenter");
                g0Var3 = null;
            }
            g0Var3.u();
        }
        this.W = null;
        this.f4922k = null;
        l6.g0 g0Var4 = this.f4938x;
        if (g0Var4 == null) {
            t9.i.w("mLivePlayPresenter");
        } else {
            g0Var = g0Var4;
        }
        g0Var.s();
        f5();
    }

    public final void v4(Channel channel, int i10) {
        d6.a aVar = d6.a.f12650a;
        if (aVar.l(channel.getChannelCode())) {
            return;
        }
        aVar.f(channel.getChannelCode());
        g5.j0 j0Var = this.f4926m;
        if (j0Var == null) {
            t9.i.w("adapterChannel");
            j0Var = null;
        }
        j0Var.e(channel.getChannelCode(), i10);
        aVar.h(channel);
    }

    public final void v5() {
        if (getActivity() == null) {
            return;
        }
        androidx.fragment.app.e activity = getActivity();
        t9.i.d(activity);
        String string = getString(R.string.cast_wifi_not_connect_tips);
        t9.i.f(string, "getString(R.string.cast_wifi_not_connect_tips)");
        new CommTipsDialog(activity, string, getString(R.string.cast), getString(R.string.cast_wifi_setting), null, null, new c0(), null, false, 432, null).show();
    }

    @Override // o8.a
    public boolean w1() {
        return false;
    }

    public final void w4() {
        int i10 = R$id.mLayoutChannelList;
        if (((AnimatorFrameLayout) x3(i10)).getVisibility() == 0) {
            ((AnimatorFrameLayout) x3(i10)).setVisibility(8);
            return;
        }
        q5.j jVar = f4910o0;
        if (jVar != null) {
            jVar.g();
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            com.mobile.brasiltv.utils.b0.N(activity);
        }
    }

    public final void w5() {
        f4();
        int i10 = R$id.mLayoutChannelList;
        if (((AnimatorFrameLayout) x3(i10)).getVisibility() == 0) {
            F4();
            return;
        }
        g5.o0 o0Var = this.f4928n;
        if (o0Var == null) {
            t9.i.w("adapterSort");
            o0Var = null;
        }
        if (o0Var.getData().size() == 0) {
            return;
        }
        ((AnimatorFrameLayout) x3(i10)).setVisibility(0);
        com.mobile.brasiltv.utils.n0 n0Var = com.mobile.brasiltv.utils.n0.f8733a;
        Context context = getContext();
        t9.i.d(context);
        int d10 = n0Var.d(context, "live_last_play_column_index", 0);
        if (d10 == -1) {
            ((KoocanRecyclerView) x3(R$id.mRecyclerSort)).scrollToPosition(0);
        } else {
            ((KoocanRecyclerView) x3(R$id.mRecyclerSort)).scrollToPosition(d10 + 1);
        }
        C4("", d10 + 1, true);
    }

    public View x3(int i10) {
        View findViewById;
        Map map = this.f4927m0;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view == null) {
            View view2 = getView();
            if (view2 == null || (findViewById = view2.findViewById(i10)) == null) {
                return null;
            }
            map.put(Integer.valueOf(i10), findViewById);
            return findViewById;
        }
        return view;
    }

    public final void x4(int i10) {
        if (i10 != 3) {
            if (i10 == 4) {
                int i11 = R$id.mTvCastState;
                Context context = getContext();
                t9.i.d(context);
                ((TextView) x3(i11)).setText(context.getResources().getString(R.string.cast_status_casting_failed));
                ((TextView) x3(i11)).append("(4)");
                Context context2 = getContext();
                t9.i.d(context2);
                ((TextView) x3(i11)).setTextColor(context2.getResources().getColor(R.color.color_f72f2f));
                ((TextView) x3(R$id.mTvPleaseWait)).setVisibility(8);
                ((TextView) x3(R$id.mTvCastRecommendHint)).setVisibility(0);
                X4();
                return;
            }
            return;
        }
        int i12 = R$id.mTvCastState;
        Context context3 = getContext();
        t9.i.d(context3);
        ((TextView) x3(i12)).setText(context3.getResources().getString(R.string.cast_status_casting));
        Context context4 = getContext();
        t9.i.d(context4);
        ((TextView) x3(i12)).setTextColor(context4.getResources().getColor(R.color.color_fffefe));
        ((TextView) x3(R$id.mTvPleaseWait)).setVisibility(8);
        ((TextView) x3(R$id.mTvCastRecommendHint)).setVisibility(4);
        c5();
    }

    public final void x5(boolean z10) {
        String str;
        if (z10) {
            Channel channel = this.f4922k;
            if (channel != null) {
                str = channel.getRestricted();
            } else {
                str = null;
            }
            if (t9.i.b(str, "0")) {
                ((ImageView) x3(R$id.mIconSave)).setVisibility(0);
                ((ImageView) x3(R$id.mIvFavPort)).setVisibility(0);
                this.Z = z10;
                z5();
            }
        }
        ((ImageView) x3(R$id.mIconSave)).setVisibility(8);
        ((ImageView) x3(R$id.mIvFavPort)).setVisibility(8);
        this.Z = z10;
        z5();
    }

    public final void y4() {
        Program program;
        Channel channel;
        CharSequence text = ((TextView) x3(R$id.mTextToDo)).getText();
        boolean z10 = true;
        if (t9.i.b(text, getResources().getString(R.string.click_continue))) {
            ((AutoLinearLayout) x3(R$id.mLayoutMobileNotify)).setVisibility(8);
            this.f4924l = true;
            n8.b titanContext = ((TitanVideoView) x3(R$id.mVideoViewLive)).getTitanContext();
            l6.g0 g0Var = null;
            if (titanContext != null) {
                program = titanContext.h();
            } else {
                program = null;
            }
            if (r5.i.f18523a.I() && (channel = this.f4922k) != null && program == null) {
                t9.i.d(channel);
                l6.g0 g0Var2 = this.f4938x;
                if (g0Var2 == null) {
                    t9.i.w("mLivePlayPresenter");
                } else {
                    g0Var = g0Var2;
                }
                W4(channel, g0Var.y());
            }
        } else if (t9.i.b(text, getResources().getString(R.string.login))) {
            com.mobile.brasiltv.utils.b0.a0(this, LoginAty.class);
        } else if (t9.i.b(text, getResources().getString(R.string.bind_now))) {
            com.mobile.brasiltv.utils.b0.a0(this, AccountBindAty.class);
        } else if (t9.i.b(text, getResources().getString(R.string.be_a_vip))) {
            i.c cVar = w6.i.f19214g;
            if (cVar.g().length() <= 0) {
                z10 = false;
            }
            if (z10) {
                com.mobile.brasiltv.utils.b0.k0(this, cVar.g(), false, true, false, 8, null);
            }
        }
    }

    public final void y5(boolean z10, String str, boolean z11) {
        Channel channel = this.f4922k;
        if (channel != null) {
            t9.i.d(channel);
            if (t9.i.b(channel.getChannelCode(), str)) {
                this.f4939y = z10;
                if (z10) {
                    int i10 = R$id.mIconSave;
                    ((ImageView) x3(i10)).setVisibility(0);
                    int i11 = R$id.mIvFavPort;
                    ((ImageView) x3(i11)).setVisibility(0);
                    ((ImageView) x3(i10)).setImageResource(R.drawable.ic_live_fav);
                    ((ImageView) x3(i11)).setImageResource(R.drawable.ic_live_fav);
                    if (z11) {
                        Context context = getContext();
                        Context context2 = getContext();
                        t9.i.d(context2);
                        Context b10 = com.mobile.brasiltv.utils.b.b(context, new com.mobile.brasiltv.utils.c(context2).c());
                        f1.a aVar = com.mobile.brasiltv.utils.f1.f8649a;
                        String string = b10.getString(R.string.add_fav_success);
                        t9.i.f(string, "ctx.getString(R.string.add_fav_success)");
                        aVar.x(string);
                    }
                } else {
                    ((ImageView) x3(R$id.mIconSave)).setImageResource(R.drawable.ic_live_not_fav);
                    ((ImageView) x3(R$id.mIvFavPort)).setImageResource(R.drawable.ic_live_not_fav);
                }
            }
        }
        if (!z10 && this.f4916h == 0) {
            R5();
        }
    }

    @Override // o8.a
    public void z() {
        r5(true);
        if (this.f4937w && isResumed()) {
            com.mobile.brasiltv.utils.b0.U(this, "live info video rendering start, start");
            ((RelativeLayout) x3(R$id.mBufferView)).setVisibility(8);
            b4();
        } else {
            com.mobile.brasiltv.utils.b0.U(this, "live info video rendering start, but not visible, stop");
            ((TitanVideoView) x3(R$id.mVideoViewLive)).D();
        }
        O5();
    }

    @Override // j6.g
    public void z0(String str) {
        t9.i.g(str, "toastMsg");
        com.mobile.brasiltv.utils.f1.f8649a.x(str);
    }

    public final void z4() {
        this.f4937w = false;
        if (Q2()) {
            U2();
            ((TitanVideoView) x3(R$id.mVideoViewLive)).D();
            Disposable disposable = this.f4934t;
            if (disposable != null) {
                disposable.dispose();
            }
            Disposable disposable2 = this.f4933s;
            if (disposable2 != null) {
                disposable2.dispose();
            }
        }
    }

    public final void z5() {
        if (this.f4932r && this.Z && !this.f4913f0) {
            this.f4913f0 = true;
            ((ImageView) x3(R$id.mImageLandFeedback)).postDelayed(new Runnable() { // from class: b6.t0
                @Override // java.lang.Runnable
                public final void run() {
                    r1.A5(r1.this);
                }
            }, 20L);
        }
    }
}
