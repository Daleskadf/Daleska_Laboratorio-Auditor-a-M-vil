package t5;

import D.AbstractC0059i;
import K5.r;
import L5.o;
import android.database.Cursor;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import u5.C1873a;
import u5.C1874b;
/* renamed from: t5.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1837i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15888a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f15889b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r f15890c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C1832d f15891d;

    public /* synthetic */ RunnableC1837i(o oVar, r rVar, C1832d c1832d, int i7) {
        this.f15888a = i7;
        this.f15889b = oVar;
        this.f15890c = rVar;
        this.f15891d = c1832d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c8;
        o oVar = this.f15889b;
        r rVar = this.f15890c;
        final C1832d c1832d = this.f15891d;
        switch (this.f15888a) {
            case 0:
                HashMap hashMap = C1839k.f15902c;
                final C1874b c1874b = new C1874b(oVar, rVar);
                c1832d.l(c1874b, new Runnable() { // from class: t5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        Boolean bool;
                        boolean z7;
                        switch (r3) {
                            case 0:
                                C1832d c1832d2 = c1832d;
                                C1874b c1874b2 = c1874b;
                                o oVar2 = c1874b2.f16024e0;
                                Integer num = (Integer) oVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(oVar2.a("cancel"));
                                if (AbstractC1829a.b(c1832d2.f15870d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c1832d2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    if (equals) {
                                        str = " cancel";
                                    } else {
                                        str = " next";
                                    }
                                    sb.append(str);
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap2 = c1832d2.f15872g;
                                C1836h c1836h = null;
                                if (equals) {
                                    C1836h c1836h2 = (C1836h) hashMap2.get(num);
                                    if (c1836h2 != null) {
                                        c1832d2.b(c1836h2);
                                    }
                                    c1874b2.f(null);
                                    return;
                                }
                                C1836h c1836h3 = (C1836h) hashMap2.get(num);
                                boolean z8 = false;
                                try {
                                    try {
                                        if (c1836h3 != null) {
                                            Cursor cursor = c1836h3.f15887c;
                                            HashMap c9 = C1832d.c(cursor, Integer.valueOf(c1836h3.f15886b));
                                            if (!cursor.isLast() && !cursor.isAfterLast()) {
                                                z8 = true;
                                            }
                                            if (z8) {
                                                c9.put("cursorId", num);
                                            }
                                            c1874b2.f(c9);
                                            if (!z8) {
                                                c1832d2.b(c1836h3);
                                                return;
                                            }
                                            return;
                                        }
                                        throw new IllegalStateException("Cursor " + intValue + " not found");
                                    } catch (Exception e7) {
                                        c1832d2.i(e7, c1874b2);
                                        if (c1836h3 != null) {
                                            c1832d2.b(c1836h3);
                                        } else {
                                            c1836h = c1836h3;
                                        }
                                        if (0 == 0 && c1836h != null) {
                                            c1832d2.b(c1836h);
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && c1836h3 != null) {
                                        c1832d2.b(c1836h3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c1832d.e(c1874b);
                                return;
                            case 2:
                                c1832d.f(c1874b);
                                return;
                            case 3:
                                c1832d.d(c1874b);
                                return;
                            default:
                                C1832d c1832d3 = c1832d;
                                F.f fVar = c1874b;
                                Object p7 = fVar.p("inTransaction");
                                if (p7 instanceof Boolean) {
                                    bool = (Boolean) p7;
                                } else {
                                    bool = null;
                                }
                                if (Boolean.TRUE.equals(bool) && fVar.v() && ((Integer) fVar.p("transactionId")) == null) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    int i7 = c1832d3.f15875k + 1;
                                    c1832d3.f15875k = i7;
                                    c1832d3.f15876l = Integer.valueOf(i7);
                                }
                                if (!c1832d3.g(fVar)) {
                                    if (z7) {
                                        c1832d3.f15876l = null;
                                        return;
                                    }
                                    return;
                                } else if (z7) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("transactionId", c1832d3.f15876l);
                                    fVar.f(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c1832d3.f15876l = null;
                                    }
                                    fVar.f(null);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                HashMap hashMap2 = C1839k.f15902c;
                final C1874b c1874b2 = new C1874b(oVar, rVar);
                c1832d.l(c1874b2, new Runnable() { // from class: t5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        Boolean bool;
                        boolean z7;
                        switch (r3) {
                            case 0:
                                C1832d c1832d2 = c1832d;
                                C1874b c1874b22 = c1874b2;
                                o oVar2 = c1874b22.f16024e0;
                                Integer num = (Integer) oVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(oVar2.a("cancel"));
                                if (AbstractC1829a.b(c1832d2.f15870d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c1832d2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    if (equals) {
                                        str = " cancel";
                                    } else {
                                        str = " next";
                                    }
                                    sb.append(str);
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = c1832d2.f15872g;
                                C1836h c1836h = null;
                                if (equals) {
                                    C1836h c1836h2 = (C1836h) hashMap22.get(num);
                                    if (c1836h2 != null) {
                                        c1832d2.b(c1836h2);
                                    }
                                    c1874b22.f(null);
                                    return;
                                }
                                C1836h c1836h3 = (C1836h) hashMap22.get(num);
                                boolean z8 = false;
                                try {
                                    try {
                                        if (c1836h3 != null) {
                                            Cursor cursor = c1836h3.f15887c;
                                            HashMap c9 = C1832d.c(cursor, Integer.valueOf(c1836h3.f15886b));
                                            if (!cursor.isLast() && !cursor.isAfterLast()) {
                                                z8 = true;
                                            }
                                            if (z8) {
                                                c9.put("cursorId", num);
                                            }
                                            c1874b22.f(c9);
                                            if (!z8) {
                                                c1832d2.b(c1836h3);
                                                return;
                                            }
                                            return;
                                        }
                                        throw new IllegalStateException("Cursor " + intValue + " not found");
                                    } catch (Exception e7) {
                                        c1832d2.i(e7, c1874b22);
                                        if (c1836h3 != null) {
                                            c1832d2.b(c1836h3);
                                        } else {
                                            c1836h = c1836h3;
                                        }
                                        if (0 == 0 && c1836h != null) {
                                            c1832d2.b(c1836h);
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && c1836h3 != null) {
                                        c1832d2.b(c1836h3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c1832d.e(c1874b2);
                                return;
                            case 2:
                                c1832d.f(c1874b2);
                                return;
                            case 3:
                                c1832d.d(c1874b2);
                                return;
                            default:
                                C1832d c1832d3 = c1832d;
                                F.f fVar = c1874b2;
                                Object p7 = fVar.p("inTransaction");
                                if (p7 instanceof Boolean) {
                                    bool = (Boolean) p7;
                                } else {
                                    bool = null;
                                }
                                if (Boolean.TRUE.equals(bool) && fVar.v() && ((Integer) fVar.p("transactionId")) == null) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    int i7 = c1832d3.f15875k + 1;
                                    c1832d3.f15875k = i7;
                                    c1832d3.f15876l = Integer.valueOf(i7);
                                }
                                if (!c1832d3.g(fVar)) {
                                    if (z7) {
                                        c1832d3.f15876l = null;
                                        return;
                                    }
                                    return;
                                } else if (z7) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("transactionId", c1832d3.f15876l);
                                    fVar.f(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c1832d3.f15876l = null;
                                    }
                                    fVar.f(null);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 2:
                HashMap hashMap3 = C1839k.f15902c;
                final C1874b c1874b3 = new C1874b(oVar, rVar);
                c1832d.l(c1874b3, new Runnable() { // from class: t5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        Boolean bool;
                        boolean z7;
                        switch (r3) {
                            case 0:
                                C1832d c1832d2 = c1832d;
                                C1874b c1874b22 = c1874b3;
                                o oVar2 = c1874b22.f16024e0;
                                Integer num = (Integer) oVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(oVar2.a("cancel"));
                                if (AbstractC1829a.b(c1832d2.f15870d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c1832d2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    if (equals) {
                                        str = " cancel";
                                    } else {
                                        str = " next";
                                    }
                                    sb.append(str);
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = c1832d2.f15872g;
                                C1836h c1836h = null;
                                if (equals) {
                                    C1836h c1836h2 = (C1836h) hashMap22.get(num);
                                    if (c1836h2 != null) {
                                        c1832d2.b(c1836h2);
                                    }
                                    c1874b22.f(null);
                                    return;
                                }
                                C1836h c1836h3 = (C1836h) hashMap22.get(num);
                                boolean z8 = false;
                                try {
                                    try {
                                        if (c1836h3 != null) {
                                            Cursor cursor = c1836h3.f15887c;
                                            HashMap c9 = C1832d.c(cursor, Integer.valueOf(c1836h3.f15886b));
                                            if (!cursor.isLast() && !cursor.isAfterLast()) {
                                                z8 = true;
                                            }
                                            if (z8) {
                                                c9.put("cursorId", num);
                                            }
                                            c1874b22.f(c9);
                                            if (!z8) {
                                                c1832d2.b(c1836h3);
                                                return;
                                            }
                                            return;
                                        }
                                        throw new IllegalStateException("Cursor " + intValue + " not found");
                                    } catch (Exception e7) {
                                        c1832d2.i(e7, c1874b22);
                                        if (c1836h3 != null) {
                                            c1832d2.b(c1836h3);
                                        } else {
                                            c1836h = c1836h3;
                                        }
                                        if (0 == 0 && c1836h != null) {
                                            c1832d2.b(c1836h);
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && c1836h3 != null) {
                                        c1832d2.b(c1836h3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c1832d.e(c1874b3);
                                return;
                            case 2:
                                c1832d.f(c1874b3);
                                return;
                            case 3:
                                c1832d.d(c1874b3);
                                return;
                            default:
                                C1832d c1832d3 = c1832d;
                                F.f fVar = c1874b3;
                                Object p7 = fVar.p("inTransaction");
                                if (p7 instanceof Boolean) {
                                    bool = (Boolean) p7;
                                } else {
                                    bool = null;
                                }
                                if (Boolean.TRUE.equals(bool) && fVar.v() && ((Integer) fVar.p("transactionId")) == null) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    int i7 = c1832d3.f15875k + 1;
                                    c1832d3.f15875k = i7;
                                    c1832d3.f15876l = Integer.valueOf(i7);
                                }
                                if (!c1832d3.g(fVar)) {
                                    if (z7) {
                                        c1832d3.f15876l = null;
                                        return;
                                    }
                                    return;
                                } else if (z7) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", c1832d3.f15876l);
                                    fVar.f(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c1832d3.f15876l = null;
                                    }
                                    fVar.f(null);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 3:
                HashMap hashMap4 = C1839k.f15902c;
                try {
                    c1832d.f15874i.setLocale(Locale.forLanguageTag((String) oVar.a("locale")));
                    rVar.a(null);
                    return;
                } catch (Exception e7) {
                    rVar.b(null, "sqlite_error", "Error calling setLocale: " + e7.getMessage());
                    return;
                }
            case 4:
                HashMap hashMap5 = C1839k.f15902c;
                final C1874b c1874b4 = new C1874b(oVar, rVar);
                c1832d.l(c1874b4, new Runnable() { // from class: t5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        Boolean bool;
                        boolean z7;
                        switch (r3) {
                            case 0:
                                C1832d c1832d2 = c1832d;
                                C1874b c1874b22 = c1874b4;
                                o oVar2 = c1874b22.f16024e0;
                                Integer num = (Integer) oVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(oVar2.a("cancel"));
                                if (AbstractC1829a.b(c1832d2.f15870d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c1832d2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    if (equals) {
                                        str = " cancel";
                                    } else {
                                        str = " next";
                                    }
                                    sb.append(str);
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = c1832d2.f15872g;
                                C1836h c1836h = null;
                                if (equals) {
                                    C1836h c1836h2 = (C1836h) hashMap22.get(num);
                                    if (c1836h2 != null) {
                                        c1832d2.b(c1836h2);
                                    }
                                    c1874b22.f(null);
                                    return;
                                }
                                C1836h c1836h3 = (C1836h) hashMap22.get(num);
                                boolean z8 = false;
                                try {
                                    try {
                                        if (c1836h3 != null) {
                                            Cursor cursor = c1836h3.f15887c;
                                            HashMap c9 = C1832d.c(cursor, Integer.valueOf(c1836h3.f15886b));
                                            if (!cursor.isLast() && !cursor.isAfterLast()) {
                                                z8 = true;
                                            }
                                            if (z8) {
                                                c9.put("cursorId", num);
                                            }
                                            c1874b22.f(c9);
                                            if (!z8) {
                                                c1832d2.b(c1836h3);
                                                return;
                                            }
                                            return;
                                        }
                                        throw new IllegalStateException("Cursor " + intValue + " not found");
                                    } catch (Exception e72) {
                                        c1832d2.i(e72, c1874b22);
                                        if (c1836h3 != null) {
                                            c1832d2.b(c1836h3);
                                        } else {
                                            c1836h = c1836h3;
                                        }
                                        if (0 == 0 && c1836h != null) {
                                            c1832d2.b(c1836h);
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && c1836h3 != null) {
                                        c1832d2.b(c1836h3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c1832d.e(c1874b4);
                                return;
                            case 2:
                                c1832d.f(c1874b4);
                                return;
                            case 3:
                                c1832d.d(c1874b4);
                                return;
                            default:
                                C1832d c1832d3 = c1832d;
                                F.f fVar = c1874b4;
                                Object p7 = fVar.p("inTransaction");
                                if (p7 instanceof Boolean) {
                                    bool = (Boolean) p7;
                                } else {
                                    bool = null;
                                }
                                if (Boolean.TRUE.equals(bool) && fVar.v() && ((Integer) fVar.p("transactionId")) == null) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    int i7 = c1832d3.f15875k + 1;
                                    c1832d3.f15875k = i7;
                                    c1832d3.f15876l = Integer.valueOf(i7);
                                }
                                if (!c1832d3.g(fVar)) {
                                    if (z7) {
                                        c1832d3.f15876l = null;
                                        return;
                                    }
                                    return;
                                } else if (z7) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", c1832d3.f15876l);
                                    fVar.f(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c1832d3.f15876l = null;
                                    }
                                    fVar.f(null);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 5:
                HashMap hashMap6 = C1839k.f15902c;
                final C1874b c1874b5 = new C1874b(oVar, rVar);
                c1832d.l(c1874b5, new Runnable() { // from class: t5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        Boolean bool;
                        boolean z7;
                        switch (r3) {
                            case 0:
                                C1832d c1832d2 = c1832d;
                                C1874b c1874b22 = c1874b5;
                                o oVar2 = c1874b22.f16024e0;
                                Integer num = (Integer) oVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(oVar2.a("cancel"));
                                if (AbstractC1829a.b(c1832d2.f15870d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c1832d2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    if (equals) {
                                        str = " cancel";
                                    } else {
                                        str = " next";
                                    }
                                    sb.append(str);
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = c1832d2.f15872g;
                                C1836h c1836h = null;
                                if (equals) {
                                    C1836h c1836h2 = (C1836h) hashMap22.get(num);
                                    if (c1836h2 != null) {
                                        c1832d2.b(c1836h2);
                                    }
                                    c1874b22.f(null);
                                    return;
                                }
                                C1836h c1836h3 = (C1836h) hashMap22.get(num);
                                boolean z8 = false;
                                try {
                                    try {
                                        if (c1836h3 != null) {
                                            Cursor cursor = c1836h3.f15887c;
                                            HashMap c9 = C1832d.c(cursor, Integer.valueOf(c1836h3.f15886b));
                                            if (!cursor.isLast() && !cursor.isAfterLast()) {
                                                z8 = true;
                                            }
                                            if (z8) {
                                                c9.put("cursorId", num);
                                            }
                                            c1874b22.f(c9);
                                            if (!z8) {
                                                c1832d2.b(c1836h3);
                                                return;
                                            }
                                            return;
                                        }
                                        throw new IllegalStateException("Cursor " + intValue + " not found");
                                    } catch (Exception e72) {
                                        c1832d2.i(e72, c1874b22);
                                        if (c1836h3 != null) {
                                            c1832d2.b(c1836h3);
                                        } else {
                                            c1836h = c1836h3;
                                        }
                                        if (0 == 0 && c1836h != null) {
                                            c1832d2.b(c1836h);
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && c1836h3 != null) {
                                        c1832d2.b(c1836h3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c1832d.e(c1874b5);
                                return;
                            case 2:
                                c1832d.f(c1874b5);
                                return;
                            case 3:
                                c1832d.d(c1874b5);
                                return;
                            default:
                                C1832d c1832d3 = c1832d;
                                F.f fVar = c1874b5;
                                Object p7 = fVar.p("inTransaction");
                                if (p7 instanceof Boolean) {
                                    bool = (Boolean) p7;
                                } else {
                                    bool = null;
                                }
                                if (Boolean.TRUE.equals(bool) && fVar.v() && ((Integer) fVar.p("transactionId")) == null) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    int i7 = c1832d3.f15875k + 1;
                                    c1832d3.f15875k = i7;
                                    c1832d3.f15876l = Integer.valueOf(i7);
                                }
                                if (!c1832d3.g(fVar)) {
                                    if (z7) {
                                        c1832d3.f15876l = null;
                                        return;
                                    }
                                    return;
                                } else if (z7) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", c1832d3.f15876l);
                                    fVar.f(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c1832d3.f15876l = null;
                                    }
                                    fVar.f(null);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                HashMap hashMap7 = C1839k.f15902c;
                boolean equals = Boolean.TRUE.equals(oVar.a("noResult"));
                boolean equals2 = Boolean.TRUE.equals(oVar.a("continueOnError"));
                ArrayList arrayList = new ArrayList();
                for (Map map : (List) oVar.a("operations")) {
                    C1873a c1873a = new C1873a(map, equals);
                    String r7 = c1873a.r();
                    r7.getClass();
                    E.e eVar = c1873a.f16021e0;
                    switch (r7.hashCode()) {
                        case -1319569547:
                            if (r7.equals("execute")) {
                                c8 = 0;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -1183792455:
                            if (r7.equals("insert")) {
                                c8 = 1;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -838846263:
                            if (r7.equals("update")) {
                                c8 = 2;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 107944136:
                            if (r7.equals("query")) {
                                c8 = 3;
                                break;
                            }
                            c8 = 65535;
                            break;
                        default:
                            c8 = 65535;
                            break;
                    }
                    switch (c8) {
                        case 0:
                            if (!c1832d.g(c1873a)) {
                                if (equals2) {
                                    c1873a.H(arrayList);
                                    break;
                                } else {
                                    rVar.b((HashMap) eVar.f923e, (String) eVar.f921c, (String) eVar.f922d);
                                    return;
                                }
                            } else {
                                c1873a.f(null);
                                c1873a.I(arrayList);
                                break;
                            }
                        case 1:
                            if (c1832d.d(c1873a)) {
                                c1873a.I(arrayList);
                                break;
                            } else if (equals2) {
                                c1873a.H(arrayList);
                                break;
                            } else {
                                rVar.b((HashMap) eVar.f923e, (String) eVar.f921c, (String) eVar.f922d);
                                return;
                            }
                        case 2:
                            if (c1832d.f(c1873a)) {
                                c1873a.I(arrayList);
                                break;
                            } else if (equals2) {
                                c1873a.H(arrayList);
                                break;
                            } else {
                                rVar.b((HashMap) eVar.f923e, (String) eVar.f921c, (String) eVar.f922d);
                                return;
                            }
                        case 3:
                            if (c1832d.e(c1873a)) {
                                c1873a.I(arrayList);
                                break;
                            } else if (equals2) {
                                c1873a.H(arrayList);
                                break;
                            } else {
                                rVar.b((HashMap) eVar.f923e, (String) eVar.f921c, (String) eVar.f922d);
                                return;
                            }
                        default:
                            rVar.b(null, "bad_param", AbstractC0059i.M("Batch method '", r7, "' not supported"));
                            return;
                    }
                }
                if (equals) {
                    rVar.a(null);
                    return;
                } else {
                    rVar.a(arrayList);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC1837i(o oVar, C1832d c1832d, r rVar) {
        this.f15888a = 3;
        this.f15889b = oVar;
        this.f15891d = c1832d;
        this.f15890c = rVar;
    }

    public /* synthetic */ RunnableC1837i(C1832d c1832d, o oVar, r rVar) {
        this.f15888a = 6;
        this.f15891d = c1832d;
        this.f15889b = oVar;
        this.f15890c = rVar;
    }
}
