package K5;

import D.AbstractC0059i;
import H0.C0126f;
import android.app.ActivityOptions;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.firestore.Z;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.tika.utils.StringUtils;
import p.C1608t;
import p4.P;
import t.AbstractC1799a;
import t.AbstractC1800b;
import t.AbstractC1801c;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2697a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2698b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2699c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2700d;

    /* renamed from: e  reason: collision with root package name */
    public Object f2701e;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, boolean z7, int i7) {
        this.f2697a = i7;
        this.f2699c = obj;
        this.f2700d = obj2;
        this.f2701e = obj3;
        this.f2698b = z7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p4.P, java.lang.Object] */
    public void a(Object obj, String str) {
        ?? obj2 = new Object();
        ((P) this.f2701e).f15212c = obj2;
        this.f2701e = obj2;
        obj2.f15210a = obj;
        obj2.f15211b = str;
    }

    public void b(String str, long j) {
        d(str, String.valueOf(j));
    }

    public void c(String str, boolean z7) {
        d(str, String.valueOf(z7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p4.P, java.lang.Object] */
    public void d(String str, String str2) {
        ?? obj = new Object();
        ((P) this.f2701e).f15212c = obj;
        this.f2701e = obj;
        obj.f15210a = str2;
        obj.f15211b = str;
    }

    public C1608t e() {
        Bundle bundle;
        Intent intent = (Intent) this.f2699c;
        Bundle bundle2 = null;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle3 = new Bundle();
            bundle3.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle3);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f2698b);
        ((Z) this.f2700d).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 24) {
            String a7 = AbstractC1800b.a();
            if (!TextUtils.isEmpty(a7)) {
                if (intent.hasExtra("com.android.browser.headers")) {
                    bundle = intent.getBundleExtra("com.android.browser.headers");
                } else {
                    bundle = new Bundle();
                }
                if (!bundle.containsKey("Accept-Language")) {
                    bundle.putString("Accept-Language", a7);
                    intent.putExtra("com.android.browser.headers", bundle);
                }
            }
        }
        if (i7 >= 34) {
            if (((ActivityOptions) this.f2701e) == null) {
                this.f2701e = AbstractC1799a.a();
            }
            AbstractC1801c.a((ActivityOptions) this.f2701e, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f2701e;
        if (activityOptions != null) {
            bundle2 = activityOptions.toBundle();
        }
        return new C1608t(8, intent, bundle2);
    }

    public boolean f(C0126f c0126f, H0.r rVar) {
        boolean canBeSpatialized;
        boolean equals = "audio/eac3-joc".equals(rVar.f1886m);
        int i7 = rVar.f1865A;
        if (equals && i7 == 16) {
            i7 = 12;
        }
        int s7 = K0.x.s(i7);
        if (s7 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(s7);
        int i8 = rVar.f1866B;
        if (i8 != -1) {
            channelMask.setSampleRate(i8);
        }
        canBeSpatialized = ((Spatializer) this.f2699c).canBeSpatialized((AudioAttributes) c0126f.a().f4b, channelMask.build());
        return canBeSpatialized;
    }

    public void g(c cVar, boolean z7) {
        c cVar2;
        c cVar3 = (c) this.f2699c;
        if (cVar3 == cVar && z7 == this.f2698b) {
            return;
        }
        if (cVar == null && cVar3 == null) {
            this.f2698b = z7;
            return;
        }
        int i7 = b.f2696a[cVar.ordinal()];
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3 && i7 != 4 && i7 != 5) {
                cVar2 = null;
            } else {
                cVar2 = cVar;
            }
        } else if (z7) {
            cVar2 = c.RESUMED;
        } else {
            cVar2 = c.INACTIVE;
        }
        this.f2699c = cVar;
        this.f2698b = z7;
        if (cVar2 == ((c) this.f2700d)) {
            return;
        }
        ((E.e) this.f2701e).f0("AppLifecycleState." + cVar2.name().toLowerCase(Locale.ROOT), null);
        this.f2700d = cVar2;
    }

    public void h(Runnable runnable, Executor executor) {
        synchronized (this.f2699c) {
            try {
                if (this.f2698b) {
                    ((ArrayDeque) this.f2700d).add(new e5.t(runnable, executor));
                    return;
                }
                this.f2698b = true;
                j(runnable, executor);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i() {
        synchronized (this.f2699c) {
            try {
                if (((ArrayDeque) this.f2700d).isEmpty()) {
                    this.f2698b = false;
                    return;
                }
                e5.t tVar = (e5.t) ((ArrayDeque) this.f2700d).remove();
                j(tVar.f10920b, tVar.f10919a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(new H.h(20, this, runnable));
        } catch (RejectedExecutionException unused) {
            i();
        }
    }

    public String toString() {
        switch (this.f2697a) {
            case 3:
                StringBuilder sb = new StringBuilder("DatabaseInfo(databaseId:");
                sb.append((q4.f) this.f2699c);
                sb.append(" host:");
                return AbstractC0059i.D(sb, (String) this.f2701e, ")");
            case 6:
                boolean z7 = this.f2698b;
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f2699c);
                sb2.append('{');
                String str = StringUtils.EMPTY;
                for (P p7 = (P) ((P) this.f2700d).f15212c; p7 != null; p7 = (P) p7.f15212c) {
                    Object obj = p7.f15210a;
                    if ((p7 instanceof z3.j) || obj != null || !z7) {
                        sb2.append(str);
                        String str2 = (String) p7.f15211b;
                        if (str2 != null) {
                            sb2.append(str2);
                            sb2.append('=');
                        }
                        if (obj != null && obj.getClass().isArray()) {
                            String deepToString = Arrays.deepToString(new Object[]{obj});
                            sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                        } else {
                            sb2.append(obj);
                        }
                        str = ", ";
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public d(int i7) {
        this.f2697a = i7;
        switch (i7) {
            case 5:
                this.f2699c = new Intent("android.intent.action.VIEW");
                this.f2700d = new Z(22);
                this.f2698b = true;
                return;
            default:
                this.f2699c = new Object();
                this.f2700d = new ArrayDeque();
                this.f2701e = new AtomicReference();
                return;
        }
    }

    public d(D5.b bVar) {
        this.f2697a = 0;
        E.e eVar = new E.e(bVar, "flutter/lifecycle", L5.z.f3050b, null, 4);
        this.f2699c = null;
        this.f2700d = null;
        this.f2698b = true;
        this.f2701e = eVar;
    }

    public d(String str) {
        this.f2697a = 6;
        Object obj = new Object();
        this.f2700d = obj;
        this.f2701e = obj;
        this.f2698b = false;
        this.f2699c = str;
    }

    public d(Spatializer spatializer) {
        int immersiveAudioLevel;
        this.f2697a = 2;
        this.f2699c = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.f2698b = immersiveAudioLevel != 0;
    }
}
