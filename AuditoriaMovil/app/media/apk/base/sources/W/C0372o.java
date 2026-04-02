package W;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
/* renamed from: W.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372o {

    /* renamed from: B  reason: collision with root package name */
    public String f6050B;

    /* renamed from: C  reason: collision with root package name */
    public String f6051C;

    /* renamed from: D  reason: collision with root package name */
    public long f6052D;

    /* renamed from: F  reason: collision with root package name */
    public final boolean f6054F;

    /* renamed from: G  reason: collision with root package name */
    public final Notification f6055G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f6056H;

    /* renamed from: I  reason: collision with root package name */
    public final ArrayList f6057I;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6058a;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f6062e;
    public CharSequence f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f6063g;

    /* renamed from: h  reason: collision with root package name */
    public PendingIntent f6064h;

    /* renamed from: i  reason: collision with root package name */
    public IconCompat f6065i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public int f6066k;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6068m;

    /* renamed from: n  reason: collision with root package name */
    public C f6069n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f6070o;

    /* renamed from: p  reason: collision with root package name */
    public int f6071p;

    /* renamed from: q  reason: collision with root package name */
    public int f6072q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6073r;

    /* renamed from: s  reason: collision with root package name */
    public String f6074s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6075t;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6077v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f6078w;

    /* renamed from: x  reason: collision with root package name */
    public String f6079x;

    /* renamed from: y  reason: collision with root package name */
    public Bundle f6080y;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f6059b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f6060c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f6061d = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public boolean f6067l = true;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6076u = false;

    /* renamed from: z  reason: collision with root package name */
    public int f6081z = 0;

    /* renamed from: A  reason: collision with root package name */
    public int f6049A = 0;

    /* renamed from: E  reason: collision with root package name */
    public int f6053E = 0;

    public C0372o(Context context, String str) {
        Notification notification = new Notification();
        this.f6055G = notification;
        this.f6058a = context;
        this.f6050B = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f6066k = 0;
        this.f6057I = new ArrayList();
        this.f6054F = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final Notification a() {
        Notification build;
        Bundle bundle;
        B.a aVar = new B.a(this);
        C0372o c0372o = (C0372o) aVar.f226d;
        C c8 = c0372o.f6069n;
        if (c8 != null) {
            c8.b(aVar);
        }
        if (c8 != null) {
            c8.e();
        }
        int i7 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) aVar.f225c;
        if (i7 >= 26) {
            build = builder.build();
        } else {
            int i8 = aVar.f223a;
            if (i7 >= 24) {
                build = builder.build();
                if (i8 != 0) {
                    if (build.getGroup() != null && (build.flags & RecognitionOptions.UPC_A) != 0 && i8 == 2) {
                        B.a.g(build);
                    }
                    if (build.getGroup() != null && (build.flags & RecognitionOptions.UPC_A) == 0 && i8 == 1) {
                        B.a.g(build);
                    }
                }
            } else {
                builder.setExtras((Bundle) aVar.f227e);
                build = builder.build();
                if (i8 != 0) {
                    if (build.getGroup() != null && (build.flags & RecognitionOptions.UPC_A) != 0 && i8 == 2) {
                        B.a.g(build);
                    }
                    if (build.getGroup() != null && (build.flags & RecognitionOptions.UPC_A) == 0 && i8 == 1) {
                        B.a.g(build);
                    }
                }
            }
        }
        if (c8 != null) {
            c8.d();
        }
        if (c8 != null) {
            c0372o.f6069n.f();
        }
        if (c8 != null && (bundle = build.extras) != null) {
            c8.a(bundle);
        }
        return build;
    }

    public final void c(int i7, boolean z7) {
        Notification notification = this.f6055G;
        if (z7) {
            notification.flags = i7 | notification.flags;
            return;
        }
        notification.flags = (~i7) & notification.flags;
    }

    public final void d(C c8) {
        if (this.f6069n != c8) {
            this.f6069n = c8;
            if (c8 != null && c8.f5991a != this) {
                c8.f5991a = this;
                d(c8);
            }
        }
    }
}
