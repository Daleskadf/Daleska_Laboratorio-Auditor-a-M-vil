package q5;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.Settings;
import android.view.OrientationEventListener;
/* loaded from: classes3.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public Activity f18219a;

    /* renamed from: b  reason: collision with root package name */
    public e f18220b;

    /* renamed from: c  reason: collision with root package name */
    public c f18221c;

    /* renamed from: d  reason: collision with root package name */
    public int f18222d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18223e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18224f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18225g;

    /* loaded from: classes3.dex */
    public static final class a extends e {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f18227b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, Activity activity) {
            super(activity);
            this.f18227b = dVar;
        }

        @Override // q5.j.e
        public void a() {
            if (j.this.h().getResources().getConfiguration().orientation == 2) {
                j.this.v(true);
            }
            if (j.this.k() && j.this.j() && j.this.h().getResources().getConfiguration().orientation == 1) {
                j.this.r();
                d dVar = this.f18227b;
                if (dVar != null) {
                    dVar.b();
                }
            }
        }

        @Override // q5.j.e
        public void b() {
            if (j.this.h().getResources().getConfiguration().orientation == 1) {
                j.this.v(true);
            }
            if (j.this.k() && j.this.j() && j.this.h().getResources().getConfiguration().orientation == 2) {
                j.this.r();
                d dVar = this.f18227b;
                if (dVar != null) {
                    dVar.a();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ContentResolver contentResolver) {
            super(contentResolver, "accelerometer_rotation");
            t9.i.f(contentResolver, "contentResolver");
        }

        @Override // q5.j.c
        public void a() {
            j jVar = j.this;
            jVar.w(jVar.o());
        }

        @Override // q5.j.c
        public void b() {
            j jVar = j.this;
            jVar.w(jVar.o());
            if (j.this.k()) {
                j.this.r();
            } else {
                j.this.u();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class c extends ContentObserver {

        /* renamed from: a  reason: collision with root package name */
        public final String f18229a;

        /* renamed from: b  reason: collision with root package name */
        public ContentResolver f18230b;

        /* renamed from: c  reason: collision with root package name */
        public String f18231c;

        /* renamed from: d  reason: collision with root package name */
        public Uri f18232d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f18233e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ContentResolver contentResolver, String str) {
            super(null);
            t9.i.g(contentResolver, "contentResolver");
            t9.i.g(str, "action");
            this.f18229a = "DataObserver";
            this.f18230b = contentResolver;
            this.f18231c = str;
        }

        public abstract void a();

        public abstract void b();

        public final void c() {
            a();
            if (this.f18233e) {
                return;
            }
            this.f18233e = true;
            String str = this.f18231c;
            if (str != null) {
                this.f18230b.registerContentObserver(Settings.System.getUriFor(str), false, this);
                return;
            }
            Uri uri = this.f18232d;
            if (uri != null) {
                ContentResolver contentResolver = this.f18230b;
                t9.i.d(uri);
                contentResolver.registerContentObserver(uri, false, this);
            }
        }

        public final void d() {
            if (!this.f18233e) {
                return;
            }
            this.f18233e = false;
            this.f18230b.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            super.onChange(z10);
            b();
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a();

        void b();
    }

    /* loaded from: classes3.dex */
    public static abstract class e extends OrientationEventListener {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(context);
            t9.i.g(context, com.umeng.analytics.pro.f.X);
        }

        public abstract void a();

        public abstract void b();

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13 = true;
            if (i10 >= 0 && i10 < 31) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && i10 < 330) {
                if (150 <= i10 && i10 < 211) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    if (90 <= i10 && i10 < 121) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        if (!((240 > i10 || i10 >= 301) ? false : false)) {
                            return;
                        }
                    }
                    a();
                    return;
                }
            }
            b();
        }
    }

    public j(Activity activity, d dVar) {
        t9.i.g(activity, "activity");
        this.f18219a = activity;
        this.f18222d = 1;
        this.f18224f = o();
        this.f18222d = this.f18219a.getRequestedOrientation();
        this.f18220b = new a(dVar, this.f18219a);
        this.f18221c = new b(this.f18219a.getContentResolver());
    }

    public final void a() {
        this.f18225g = false;
        this.f18220b.disable();
        this.f18221c.d();
    }

    public final void b() {
        this.f18219a.setRequestedOrientation(this.f18222d);
        a();
    }

    public final void c() {
        this.f18219a.getResources().getConfiguration().orientation = 1;
        this.f18219a.setRequestedOrientation(this.f18222d);
        a();
    }

    public final void d() {
        this.f18225g = true;
        this.f18220b.enable();
        this.f18221c.c();
    }

    public final void e() {
        d();
    }

    public final void f() {
        r();
        d();
    }

    public final void g() {
        if (l() || this.f18219a.getResources().getConfiguration().orientation == 2) {
            u();
            d();
        }
    }

    public final Activity h() {
        return this.f18219a;
    }

    public final boolean i() {
        return this.f18225g;
    }

    public final boolean j() {
        return this.f18223e;
    }

    public final boolean k() {
        return this.f18224f;
    }

    public final boolean l() {
        if (this.f18219a.getRequestedOrientation() != 0 && this.f18219a.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        if (this.f18219a.getRequestedOrientation() == 14) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (this.f18219a.getRequestedOrientation() == 1 || this.f18219a.getRequestedOrientation() == 7 || this.f18219a.getResources().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (Settings.System.getInt(this.f18219a.getContentResolver(), "accelerometer_rotation", 0) != 1) {
            return false;
        }
        return true;
    }

    public final void p(s9.a aVar) {
        t9.i.g(aVar, "callback");
        if (!l() && this.f18219a.getResources().getConfiguration().orientation != 2) {
            aVar.invoke();
            this.f18219a.finish();
            return;
        }
        u();
        d();
    }

    public final void q() {
        if (n()) {
            s();
        } else {
            u();
        }
    }

    public final void r() {
        this.f18219a.setRequestedOrientation(4);
    }

    public final void s() {
        this.f18219a.getResources().getConfiguration().orientation = 2;
        this.f18219a.setRequestedOrientation(0);
        this.f18223e = false;
    }

    public final void t() {
        this.f18219a.setRequestedOrientation(14);
        a();
    }

    public final void u() {
        this.f18219a.getResources().getConfiguration().orientation = 1;
        this.f18219a.setRequestedOrientation(1);
        this.f18223e = false;
    }

    public final void v(boolean z10) {
        this.f18223e = z10;
    }

    public final void w(boolean z10) {
        this.f18224f = z10;
    }

    public final void x() {
        d();
        r();
    }

    public /* synthetic */ j(Activity activity, d dVar, int i10, t9.g gVar) {
        this(activity, (i10 & 2) != 0 ? null : dVar);
    }
}
