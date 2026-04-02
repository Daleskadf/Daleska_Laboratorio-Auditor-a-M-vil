package t5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import c1.RunnableC0626c;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p4.O;
import u5.C1874b;
import u5.C1876d;
/* renamed from: t5.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1832d {

    /* renamed from: n  reason: collision with root package name */
    public static Boolean f15866n;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15867a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15868b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15869c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15870d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f15871e;

    /* renamed from: h  reason: collision with root package name */
    public InterfaceC1835g f15873h;

    /* renamed from: i  reason: collision with root package name */
    public SQLiteDatabase f15874i;

    /* renamed from: l  reason: collision with root package name */
    public Integer f15876l;
    public final ArrayList f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f15872g = new HashMap();
    public int j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f15875k = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f15877m = 0;

    public C1832d(Context context, String str, int i7, boolean z7, int i8) {
        this.f15871e = context;
        this.f15868b = str;
        this.f15867a = z7;
        this.f15869c = i7;
        this.f15870d = i8;
    }

    public static HashMap c(Cursor cursor, Integer num) {
        Object valueOf;
        HashMap hashMap = null;
        ArrayList arrayList = null;
        int i7 = 0;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                arrayList = new ArrayList();
                hashMap = new HashMap();
                i7 = cursor.getColumnCount();
                hashMap.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap.put("rows", arrayList);
            }
            ArrayList arrayList2 = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                int type = cursor.getType(i8);
                if (type != 1) {
                    if (type != 2) {
                        if (type != 3) {
                            if (type != 4) {
                                valueOf = null;
                            } else {
                                valueOf = cursor.getBlob(i8);
                            }
                        } else {
                            valueOf = cursor.getString(i8);
                        }
                    } else {
                        valueOf = Double.valueOf(cursor.getDouble(i8));
                    }
                } else {
                    valueOf = Long.valueOf(cursor.getLong(i8));
                }
                arrayList2.add(valueOf);
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        if (hashMap == null) {
            return new HashMap();
        }
        return hashMap;
    }

    public final void a() {
        HashMap hashMap = this.f15872g;
        if (!hashMap.isEmpty() && AbstractC1829a.a(this.f15870d)) {
            Log.d("Sqflite", h() + hashMap.size() + " cursor(s) are left opened");
        }
        this.f15874i.close();
    }

    public final void b(C1836h c1836h) {
        try {
            int i7 = c1836h.f15885a;
            if (AbstractC1829a.b(this.f15870d)) {
                Log.d("Sqflite", h() + "closing cursor " + i7);
            }
            this.f15872g.remove(Integer.valueOf(i7));
            c1836h.f15887c.close();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(F.f r11) {
        /*
            r10 = this;
            boolean r0 = r10.g(r11)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r11.s()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L14
            r11.f(r2)
            return r3
        L14:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r10.f15874i     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L9b
            int r5 = r0.getCount()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r5 <= 0) goto L9b
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r5 == 0) goto L9b
            int r5 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            int r6 = r10.f15870d
            if (r5 != 0) goto L6b
            boolean r5 = t5.AbstractC1829a.a(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r5 == 0) goto L64
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r5.<init>()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r6 = r10.h()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r5.append(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            long r6 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r5.append(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            android.util.Log.d(r4, r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            goto L64
        L5f:
            r11 = move-exception
            r2 = r0
            goto Lcb
        L62:
            r2 = move-exception
            goto Lc2
        L64:
            r11.f(r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r0.close()
            return r3
        L6b:
            long r7 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            boolean r2 = t5.AbstractC1829a.a(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r2 == 0) goto L90
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r2.<init>()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r5 = r10.h()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r2.append(r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r5 = "inserted "
            r2.append(r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r2.append(r7)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            android.util.Log.d(r4, r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
        L90:
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r11.f(r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r0.close()
            return r3
        L9b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r5.<init>()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r6 = r10.h()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r5.append(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            android.util.Log.e(r4, r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r11.f(r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r0 == 0) goto Lbb
            r0.close()
        Lbb:
            return r3
        Lbc:
            r11 = move-exception
            goto Lcb
        Lbe:
            r0 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
        Lc2:
            r10.i(r2, r11)     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto Lca
            r0.close()
        Lca:
            return r1
        Lcb:
            if (r2 == 0) goto Ld0
            r2.close()
        Ld0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.C1832d.d(F.f):boolean");
    }

    public final boolean e(F.f fVar) {
        Cursor cursor;
        Integer num = (Integer) fVar.p("cursorPageSize");
        String str = (String) fVar.p("sql");
        C1840l c1840l = new C1840l(str, (List) fVar.p("arguments"));
        if (AbstractC1829a.a(this.f15870d)) {
            Log.d("Sqflite", h() + c1840l);
        }
        C1836h c1836h = null;
        try {
            cursor = this.f15874i.rawQueryWithFactory(new O(c1840l, 1), str, AbstractC1829a.f15862a, null);
            try {
                try {
                    HashMap c8 = c(cursor, num);
                    if (num != null && !cursor.isLast() && !cursor.isAfterLast()) {
                        int i7 = this.f15877m + 1;
                        this.f15877m = i7;
                        c8.put("cursorId", Integer.valueOf(i7));
                        C1836h c1836h2 = new C1836h(i7, num.intValue(), cursor);
                        try {
                            this.f15872g.put(Integer.valueOf(i7), c1836h2);
                            c1836h = c1836h2;
                        } catch (Exception e7) {
                            e = e7;
                            c1836h = c1836h2;
                            i(e, fVar);
                            if (c1836h != null) {
                                b(c1836h);
                            }
                            if (c1836h == null && cursor != null) {
                                cursor.close();
                                return false;
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            c1836h = c1836h2;
                            if (c1836h == null && cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    fVar.f(c8);
                    if (c1836h == null) {
                        cursor.close();
                    }
                    return true;
                } catch (Exception e8) {
                    e = e8;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e9) {
            e = e9;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public final boolean f(F.f fVar) {
        if (!g(fVar)) {
            return false;
        }
        Cursor cursor = null;
        try {
            if (fVar.s()) {
                fVar.f(null);
                return true;
            }
            try {
                Cursor rawQuery = this.f15874i.rawQuery("SELECT changes()", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                            int i7 = rawQuery.getInt(0);
                            if (AbstractC1829a.a(this.f15870d)) {
                                Log.d("Sqflite", h() + "changed " + i7);
                            }
                            fVar.f(Integer.valueOf(i7));
                            rawQuery.close();
                            return true;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        cursor = rawQuery;
                        i(e, fVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e("Sqflite", h() + "fail to read changes for Update/Delete");
                fVar.f(null);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return true;
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean g(F.f fVar) {
        Boolean bool;
        String str = (String) fVar.p("sql");
        C1840l c1840l = new C1840l(str, (List) fVar.p("arguments"));
        if (AbstractC1829a.a(this.f15870d)) {
            Log.d("Sqflite", h() + c1840l);
        }
        Object p7 = fVar.p("inTransaction");
        if (p7 instanceof Boolean) {
            bool = (Boolean) p7;
        } else {
            bool = null;
        }
        try {
            SQLiteDatabase sQLiteDatabase = this.f15874i;
            ArrayList arrayList = new ArrayList();
            List<Object> list = c1840l.f15911b;
            if (list != null) {
                for (Object obj : list) {
                    arrayList.add(C1840l.a(obj));
                }
            }
            sQLiteDatabase.execSQL(str, arrayList.toArray(new Object[0]));
            synchronized (this) {
                if (Boolean.TRUE.equals(bool)) {
                    this.j++;
                } else if (Boolean.FALSE.equals(bool)) {
                    this.j--;
                }
            }
            return true;
        } catch (Exception e7) {
            i(e7, fVar);
            return false;
        }
    }

    public final String h() {
        StringBuilder sb = new StringBuilder("[");
        Thread currentThread = Thread.currentThread();
        sb.append(this.f15869c + "," + currentThread.getName() + "(" + currentThread.getId() + ")");
        sb.append("] ");
        return sb.toString();
    }

    public final void i(Exception exc, F.f fVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            fVar.j("open_failed " + this.f15868b, null);
        } else if (exc instanceof SQLException) {
            String message = exc.getMessage();
            String str = (String) fVar.p("sql");
            Collection collection = (List) fVar.p("arguments");
            if (collection == null) {
                collection = new ArrayList();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sql", str);
            hashMap.put("arguments", collection);
            fVar.j(message, hashMap);
        } else {
            String message2 = exc.getMessage();
            String str2 = (String) fVar.p("sql");
            Collection collection2 = (List) fVar.p("arguments");
            if (collection2 == null) {
                collection2 = new ArrayList();
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("sql", str2);
            hashMap2.put("arguments", collection2);
            fVar.j(message2, hashMap2);
        }
    }

    public final synchronized boolean j() {
        boolean z7;
        if (this.j > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        return z7;
    }

    public final void k() {
        int i7;
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of;
        if (f15866n == null) {
            Context context = this.f15871e;
            boolean z7 = false;
            try {
                String packageName = context.getPackageName();
                if (Build.VERSION.SDK_INT >= 33) {
                    PackageManager packageManager = context.getPackageManager();
                    of = PackageManager.ApplicationInfoFlags.of(128L);
                    applicationInfo = packageManager.getApplicationInfo(packageName, of);
                } else {
                    applicationInfo = context.getPackageManager().getApplicationInfo(packageName, RecognitionOptions.ITF);
                }
                if (applicationInfo.metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false)) {
                    z7 = true;
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            f15866n = Boolean.valueOf(z7);
            if (z7 && AbstractC1829a.b(this.f15870d)) {
                Log.d("Sqflite", h() + "[sqflite] WAL enabled");
            }
        }
        if (f15866n.booleanValue()) {
            i7 = 805306368;
        } else {
            i7 = 268435456;
        }
        this.f15874i = SQLiteDatabase.openDatabase(this.f15868b, null, i7);
    }

    public final void l(C1874b c1874b, Runnable runnable) {
        Integer num = (Integer) c1874b.p("transactionId");
        Integer num2 = this.f15876l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f;
        if (num != null && (num.equals(num2) || num.intValue() == -1)) {
            runnable.run();
            if (this.f15876l == null && !arrayList.isEmpty()) {
                this.f15873h.a(this, new RunnableC0626c(this, 19));
                return;
            }
            return;
        }
        arrayList.add(new C1876d(runnable));
    }
}
