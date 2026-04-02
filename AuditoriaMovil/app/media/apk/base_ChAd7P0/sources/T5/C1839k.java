package t5;

import A3.N;
import H4.e1;
import L5.o;
import L5.p;
import L5.q;
import L5.r;
import L5.y;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import c6.RunnableC0649a;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import u5.C1874b;
/* renamed from: t5.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1839k implements H5.b, p {

    /* renamed from: Y  reason: collision with root package name */
    public static String f15900Y;

    /* renamed from: g0  reason: collision with root package name */
    public static InterfaceC1835g f15907g0;

    /* renamed from: a  reason: collision with root package name */
    public Context f15908a;

    /* renamed from: b  reason: collision with root package name */
    public r f15909b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f15902c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f15903d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final Object f15904e = new Object();
    public static final Object f = new Object();

    /* renamed from: X  reason: collision with root package name */
    public static int f15899X = 0;

    /* renamed from: Z  reason: collision with root package name */
    public static int f15901Z = 0;

    /* renamed from: e0  reason: collision with root package name */
    public static int f15905e0 = 1;

    /* renamed from: f0  reason: collision with root package name */
    public static int f15906f0 = 0;

    public static void a(C1839k c1839k, C1832d c1832d) {
        c1839k.getClass();
        try {
            if (AbstractC1829a.a(c1832d.f15870d)) {
                Log.d("Sqflite", c1832d.h() + "closing database ");
            }
            c1832d.a();
        } catch (Exception e7) {
            Log.e("Sqflite", "error " + e7 + " while closing database " + f15906f0);
        }
        synchronized (f15904e) {
            try {
                if (f15903d.isEmpty() && f15907g0 != null) {
                    if (AbstractC1829a.a(c1832d.f15870d)) {
                        Log.d("Sqflite", c1832d.h() + "stopping thread");
                    }
                    f15907g0.b();
                    f15907g0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C1832d b(o oVar, K5.r rVar) {
        Integer num = (Integer) oVar.a("id");
        int intValue = num.intValue();
        C1832d c1832d = (C1832d) f15903d.get(num);
        if (c1832d != null) {
            return c1832d;
        }
        rVar.b(null, "sqlite_error", "database_closed " + intValue);
        return null;
    }

    public static HashMap c(int i7, boolean z7, boolean z8) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i7));
        if (z7) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z8) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    public final void d(o oVar, K5.r rVar) {
        Integer num = (Integer) oVar.a("id");
        int intValue = num.intValue();
        C1832d b5 = b(oVar, rVar);
        if (b5 == null) {
            return;
        }
        if (AbstractC1829a.a(b5.f15870d)) {
            Log.d("Sqflite", b5.h() + "closing " + intValue + StringUtils.SPACE + b5.f15868b);
        }
        String str = b5.f15868b;
        synchronized (f15904e) {
            try {
                f15903d.remove(num);
                if (b5.f15867a) {
                    f15902c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f15907g0.a(b5, new H2.a(this, b5, rVar, 12));
    }

    public final void e(o oVar, K5.r rVar) {
        C1832d c1832d;
        C1832d c1832d2;
        String str;
        String str2 = (String) oVar.a("path");
        synchronized (f15904e) {
            try {
                if (AbstractC1829a.b(f15899X)) {
                    Log.d("Sqflite", "Look for " + str2 + " in " + f15902c.keySet());
                }
                HashMap hashMap = f15902c;
                Integer num = (Integer) hashMap.get(str2);
                if (num != null) {
                    HashMap hashMap2 = f15903d;
                    c1832d = (C1832d) hashMap2.get(num);
                    if (c1832d != null && c1832d.f15874i.isOpen()) {
                        if (AbstractC1829a.b(f15899X)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(c1832d.h());
                            sb.append("found single instance ");
                            if (c1832d.j()) {
                                str = "(in transaction) ";
                            } else {
                                str = StringUtils.EMPTY;
                            }
                            sb.append(str);
                            sb.append(num);
                            sb.append(StringUtils.SPACE);
                            sb.append(str2);
                            Log.d("Sqflite", sb.toString());
                        }
                        hashMap2.remove(num);
                        hashMap.remove(str2);
                        c1832d2 = c1832d;
                    }
                }
                c1832d = null;
                c1832d2 = c1832d;
            } catch (Throwable th) {
                throw th;
            }
        }
        RunnableC0649a runnableC0649a = new RunnableC0649a(this, c1832d2, str2, rVar, 6);
        InterfaceC1835g interfaceC1835g = f15907g0;
        if (interfaceC1835g != null) {
            interfaceC1835g.a(c1832d2, runnableC0649a);
        } else {
            runnableC0649a.run();
        }
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
        this.f15908a = aVar.f2029a;
        y yVar = y.f3047b;
        L5.f fVar = aVar.f2030b;
        r rVar = new r(fVar, "com.tekartik.sqflite", yVar, fVar.f());
        this.f15909b = rVar;
        rVar.b(this);
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
        this.f15908a = null;
        this.f15909b.b(null);
        this.f15909b = null;
    }

    @Override // L5.p
    public final void onMethodCall(final o oVar, q qVar) {
        boolean z7;
        final int i7;
        InterfaceC1835g yVar;
        C1832d c1832d;
        String str;
        String str2 = oVar.f3038a;
        str2.getClass();
        final boolean z8 = false;
        char c8 = 65535;
        switch (str2.hashCode()) {
            case -1319569547:
                if (str2.equals("execute")) {
                    c8 = 0;
                    break;
                }
                break;
            case -1253581933:
                if (str2.equals("closeDatabase")) {
                    c8 = 1;
                    break;
                }
                break;
            case -1249474914:
                if (str2.equals("options")) {
                    c8 = 2;
                    break;
                }
                break;
            case -1183792455:
                if (str2.equals("insert")) {
                    c8 = 3;
                    break;
                }
                break;
            case -838846263:
                if (str2.equals("update")) {
                    c8 = 4;
                    break;
                }
                break;
            case -396289107:
                if (str2.equals("androidSetLocale")) {
                    c8 = 5;
                    break;
                }
                break;
            case -263511994:
                if (str2.equals("deleteDatabase")) {
                    c8 = 6;
                    break;
                }
                break;
            case -198450538:
                if (str2.equals("debugMode")) {
                    c8 = 7;
                    break;
                }
                break;
            case -17190427:
                if (str2.equals("openDatabase")) {
                    c8 = '\b';
                    break;
                }
                break;
            case 93509434:
                if (str2.equals("batch")) {
                    c8 = '\t';
                    break;
                }
                break;
            case 95458899:
                if (str2.equals("debug")) {
                    c8 = '\n';
                    break;
                }
                break;
            case 107944136:
                if (str2.equals("query")) {
                    c8 = 11;
                    break;
                }
                break;
            case 956410295:
                if (str2.equals("databaseExists")) {
                    c8 = '\f';
                    break;
                }
                break;
            case 1193546321:
                if (str2.equals("queryCursorNext")) {
                    c8 = '\r';
                    break;
                }
                break;
            case 1385449135:
                if (str2.equals("getPlatformVersion")) {
                    c8 = 14;
                    break;
                }
                break;
            case 1863829223:
                if (str2.equals("getDatabasesPath")) {
                    c8 = 15;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                K5.r rVar = (K5.r) qVar;
                C1832d b5 = b(oVar, rVar);
                if (b5 != null) {
                    f15907g0.a(b5, new RunnableC1837i(oVar, rVar, b5, 4));
                    return;
                }
                return;
            case 1:
                d(oVar, (K5.r) qVar);
                return;
            case 2:
                Object a7 = oVar.a("androidThreadPriority");
                if (a7 != null) {
                    f15901Z = ((Integer) a7).intValue();
                }
                Object a8 = oVar.a("androidThreadCount");
                if (a8 != null && !a8.equals(Integer.valueOf(f15905e0))) {
                    f15905e0 = ((Integer) a8).intValue();
                    InterfaceC1835g interfaceC1835g = f15907g0;
                    if (interfaceC1835g != null) {
                        interfaceC1835g.b();
                        f15907g0 = null;
                    }
                }
                Integer num = (Integer) oVar.a("logLevel");
                if (num != null) {
                    f15899X = num.intValue();
                }
                ((K5.r) qVar).a(null);
                return;
            case 3:
                K5.r rVar2 = (K5.r) qVar;
                C1832d b7 = b(oVar, rVar2);
                if (b7 != null) {
                    f15907g0.a(b7, new RunnableC1837i(oVar, rVar2, b7, 1));
                    return;
                }
                return;
            case 4:
                K5.r rVar3 = (K5.r) qVar;
                C1832d b8 = b(oVar, rVar3);
                if (b8 != null) {
                    f15907g0.a(b8, new RunnableC1837i(oVar, rVar3, b8, 5));
                    return;
                }
                return;
            case 5:
                K5.r rVar4 = (K5.r) qVar;
                C1832d b9 = b(oVar, rVar4);
                if (b9 != null) {
                    f15907g0.a(b9, new RunnableC1837i(oVar, b9, rVar4));
                    return;
                }
                return;
            case 6:
                e(oVar, (K5.r) qVar);
                return;
            case 7:
                boolean equals = Boolean.TRUE.equals(oVar.f3039b);
                if (equals) {
                    if (equals) {
                        f15899X = 1;
                    }
                } else {
                    f15899X = 0;
                }
                ((K5.r) qVar).a(null);
                return;
            case '\b':
                final String str3 = (String) oVar.a("path");
                final Boolean bool = (Boolean) oVar.a("readOnly");
                if (str3 != null && !str3.equals(":memory:")) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (!Boolean.FALSE.equals(oVar.a("singleInstance")) && !z7) {
                    z8 = true;
                }
                if (z8) {
                    synchronized (f15904e) {
                        try {
                            if (AbstractC1829a.b(f15899X)) {
                                Log.d("Sqflite", "Look for " + str3 + " in " + f15902c.keySet());
                            }
                            Integer num2 = (Integer) f15902c.get(str3);
                            if (num2 != null && (c1832d = (C1832d) f15903d.get(num2)) != null) {
                                if (!c1832d.f15874i.isOpen()) {
                                    if (AbstractC1829a.b(f15899X)) {
                                        Log.d("Sqflite", c1832d.h() + "single instance database of " + str3 + " not opened");
                                    }
                                } else {
                                    if (AbstractC1829a.b(f15899X)) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(c1832d.h());
                                        sb.append("re-opened single instance ");
                                        if (c1832d.j()) {
                                            str = "(in transaction) ";
                                        } else {
                                            str = StringUtils.EMPTY;
                                        }
                                        sb.append(str);
                                        sb.append(num2);
                                        sb.append(StringUtils.SPACE);
                                        sb.append(str3);
                                        Log.d("Sqflite", sb.toString());
                                    }
                                    ((K5.r) qVar).a(c(num2.intValue(), true, c1832d.j()));
                                    return;
                                }
                            }
                        } finally {
                        }
                    }
                }
                Object obj = f15904e;
                synchronized (obj) {
                    i7 = f15906f0 + 1;
                    f15906f0 = i7;
                }
                final C1832d c1832d2 = new C1832d(this.f15908a, str3, i7, z8, f15899X);
                synchronized (obj) {
                    try {
                        if (f15907g0 == null) {
                            int i8 = f15905e0;
                            int i9 = f15901Z;
                            if (i8 == 1) {
                                yVar = new N(i9, 14);
                            } else {
                                yVar = new Y1.y(i8, i9);
                            }
                            f15907g0 = yVar;
                            yVar.start();
                            if (AbstractC1829a.a(c1832d2.f15870d)) {
                                Log.d("Sqflite", c1832d2.h() + "starting worker pool with priority " + f15901Z);
                            }
                        }
                        c1832d2.f15873h = f15907g0;
                        if (AbstractC1829a.a(c1832d2.f15870d)) {
                            Log.d("Sqflite", c1832d2.h() + "opened " + i7 + StringUtils.SPACE + str3);
                        }
                        final K5.r rVar5 = (K5.r) qVar;
                        final boolean z9 = z7;
                        f15907g0.a(c1832d2, new Runnable() { // from class: t5.j
                            /* JADX WARN: Type inference failed for: r0v17, types: [android.database.DatabaseErrorHandler, java.lang.Object] */
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10 = z9;
                                String str4 = str3;
                                K5.r rVar6 = rVar5;
                                Boolean bool2 = bool;
                                C1832d c1832d3 = c1832d2;
                                o oVar2 = oVar;
                                boolean z11 = z8;
                                int i10 = i7;
                                synchronized (C1839k.f) {
                                    if (!z10) {
                                        File file = new File(new File(str4).getParent());
                                        if (!file.exists() && !file.mkdirs() && !file.exists()) {
                                            rVar6.b(null, "sqlite_error", "open_failed " + str4);
                                            return;
                                        }
                                    }
                                    try {
                                        if (Boolean.TRUE.equals(bool2)) {
                                            c1832d3.f15874i = SQLiteDatabase.openDatabase(c1832d3.f15868b, null, 1, new Object());
                                        } else {
                                            c1832d3.k();
                                        }
                                        synchronized (C1839k.f15904e) {
                                            if (z11) {
                                                C1839k.f15902c.put(str4, Integer.valueOf(i10));
                                            }
                                            C1839k.f15903d.put(Integer.valueOf(i10), c1832d3);
                                        }
                                        if (AbstractC1829a.a(c1832d3.f15870d)) {
                                            Log.d("Sqflite", c1832d3.h() + "opened " + i10 + StringUtils.SPACE + str4);
                                        }
                                        rVar6.a(C1839k.c(i10, false, false));
                                    } catch (Exception e7) {
                                        c1832d3.i(e7, new C1874b(oVar2, rVar6));
                                    }
                                }
                            }
                        });
                    } finally {
                    }
                }
                return;
            case '\t':
                K5.r rVar6 = (K5.r) qVar;
                C1832d b10 = b(oVar, rVar6);
                if (b10 != null) {
                    f15907g0.a(b10, new RunnableC1837i(b10, oVar, rVar6));
                    return;
                }
                return;
            case '\n':
                HashMap hashMap = new HashMap();
                if ("get".equals((String) oVar.a("cmd"))) {
                    int i10 = f15899X;
                    if (i10 > 0) {
                        hashMap.put("logLevel", Integer.valueOf(i10));
                    }
                    HashMap hashMap2 = f15903d;
                    if (!hashMap2.isEmpty()) {
                        HashMap hashMap3 = new HashMap();
                        for (Map.Entry entry : hashMap2.entrySet()) {
                            C1832d c1832d3 = (C1832d) entry.getValue();
                            HashMap hashMap4 = new HashMap();
                            hashMap4.put("path", c1832d3.f15868b);
                            hashMap4.put("singleInstance", Boolean.valueOf(c1832d3.f15867a));
                            int i11 = c1832d3.f15870d;
                            if (i11 > 0) {
                                hashMap4.put("logLevel", Integer.valueOf(i11));
                            }
                            hashMap3.put(((Integer) entry.getKey()).toString(), hashMap4);
                        }
                        hashMap.put("databases", hashMap3);
                    }
                }
                ((K5.r) qVar).a(hashMap);
                return;
            case 11:
                K5.r rVar7 = (K5.r) qVar;
                C1832d b11 = b(oVar, rVar7);
                if (b11 != null) {
                    f15907g0.a(b11, new RunnableC1837i(oVar, rVar7, b11, 2));
                    return;
                }
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                try {
                    z8 = new File((String) oVar.a("path")).exists();
                } catch (Exception unused) {
                }
                ((K5.r) qVar).a(Boolean.valueOf(z8));
                return;
            case '\r':
                K5.r rVar8 = (K5.r) qVar;
                C1832d b12 = b(oVar, rVar8);
                if (b12 != null) {
                    f15907g0.a(b12, new RunnableC1837i(oVar, rVar8, b12, 0));
                    return;
                }
                return;
            case 14:
                ((K5.r) qVar).a("Android " + Build.VERSION.RELEASE);
                return;
            case 15:
                if (f15900Y == null) {
                    f15900Y = this.f15908a.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                ((K5.r) qVar).a(f15900Y);
                return;
            default:
                ((K5.r) qVar).c();
                return;
        }
    }
}
