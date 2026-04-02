package O0;

import H0.C0126f;
import android.content.Context;
import android.os.Looper;
import org.apache.tika.utils.StringUtils;
/* renamed from: O0.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254p {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3810a;

    /* renamed from: b  reason: collision with root package name */
    public final K0.s f3811b;

    /* renamed from: c  reason: collision with root package name */
    public final C0252n f3812c;

    /* renamed from: d  reason: collision with root package name */
    public z3.o f3813d;

    /* renamed from: e  reason: collision with root package name */
    public final C0252n f3814e;
    public final C0252n f;

    /* renamed from: g  reason: collision with root package name */
    public final Looper f3815g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3816h;

    /* renamed from: i  reason: collision with root package name */
    public final C0126f f3817i;
    public final int j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f3818k;

    /* renamed from: l  reason: collision with root package name */
    public final l0 f3819l;

    /* renamed from: m  reason: collision with root package name */
    public final C0246h f3820m;

    /* renamed from: n  reason: collision with root package name */
    public final long f3821n;

    /* renamed from: o  reason: collision with root package name */
    public final long f3822o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f3823p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3824q;

    /* renamed from: r  reason: collision with root package name */
    public final String f3825r;

    public C0254p(Context context) {
        C0252n c0252n = new C0252n(context, 0);
        C0252n c0252n2 = new C0252n(context, 1);
        C0252n c0252n3 = new C0252n(context, 2);
        C0252n c0252n4 = new C0252n(context, 3);
        context.getClass();
        this.f3810a = context;
        this.f3812c = c0252n;
        this.f3813d = c0252n2;
        this.f3814e = c0252n3;
        this.f = c0252n4;
        int i7 = K0.x.f2529a;
        Looper myLooper = Looper.myLooper();
        this.f3815g = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f3817i = C0126f.f1797c;
        this.j = 1;
        this.f3818k = true;
        this.f3819l = l0.f3797c;
        this.f3820m = new C0246h(K0.x.M(20L), K0.x.M(500L));
        this.f3811b = K0.s.f2519a;
        this.f3821n = 500L;
        this.f3822o = 2000L;
        this.f3823p = true;
        this.f3825r = StringUtils.EMPTY;
        this.f3816h = -1000;
    }
}
