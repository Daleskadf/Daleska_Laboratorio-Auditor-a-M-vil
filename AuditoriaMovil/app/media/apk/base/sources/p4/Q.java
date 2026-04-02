package p4;

import D.AbstractC0059i;
import H0.C0140u;
import a1.C0415A;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteProgram;
import b3.C0585f;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import l4.C1422f;
import org.apache.tika.utils.StringUtils;
import p.C1608t;
import t4.C1820H;
/* loaded from: classes.dex */
public final class Q extends H4.W {

    /* renamed from: g  reason: collision with root package name */
    public final N f15213g;

    /* renamed from: h  reason: collision with root package name */
    public final C0585f f15214h;

    /* renamed from: i  reason: collision with root package name */
    public final V f15215i;
    public final C1608t j;

    /* renamed from: k  reason: collision with root package name */
    public final P f15216k;

    /* renamed from: l  reason: collision with root package name */
    public final K f15217l;

    /* renamed from: m  reason: collision with root package name */
    public final M f15218m;

    /* renamed from: n  reason: collision with root package name */
    public SQLiteDatabase f15219n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f15220o;

    public Q(Context context, String str, q4.f fVar, C0585f c0585f, C0140u c0140u) {
        N n7 = new N(context, c0585f, P(str, fVar));
        this.f15218m = new M(this);
        this.f15213g = n7;
        this.f15214h = c0585f;
        this.f15215i = new V(this, c0585f);
        this.j = new C1608t(5, this, c0585f);
        this.f15216k = new P(this, c0585f);
        this.f15217l = new K(this, c0140u);
    }

    public static void N(SQLiteProgram sQLiteProgram, Object[] objArr) {
        for (int i7 = 0; i7 < objArr.length; i7++) {
            Object obj = objArr[i7];
            if (obj == null) {
                sQLiteProgram.bindNull(i7 + 1);
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(i7 + 1, (String) obj);
            } else if (obj instanceof Integer) {
                sQLiteProgram.bindLong(i7 + 1, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                sQLiteProgram.bindLong(i7 + 1, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                sQLiteProgram.bindDouble(i7 + 1, ((Double) obj).doubleValue());
            } else if (obj instanceof byte[]) {
                sQLiteProgram.bindBlob(i7 + 1, (byte[]) obj);
            } else {
                m5.d.g("Unknown argument %s of type %s", obj, obj.getClass());
                throw null;
            }
        }
    }

    public static void O(Context context, q4.f fVar, String str) {
        String path = context.getDatabasePath(P(str, fVar)).getPath();
        String z7 = AbstractC0059i.z(path, "-journal");
        String z8 = AbstractC0059i.z(path, "-wal");
        File file = new File(path);
        File file2 = new File(z7);
        File file3 = new File(z8);
        try {
            org.slf4j.helpers.i.o(file);
            org.slf4j.helpers.i.o(file2);
            org.slf4j.helpers.i.o(file3);
        } catch (IOException e7) {
            throw new com.google.firebase.firestore.J("Failed to clear persistence." + e7, com.google.firebase.firestore.I.UNKNOWN);
        }
    }

    public static String P(String str, q4.f fVar) {
        try {
            return "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(fVar.f15352a, "utf-8") + "." + URLEncoder.encode(fVar.f15353b, "utf-8");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // H4.W
    public final Object F(String str, u4.r rVar) {
        u4.q.a("W", "Starting transaction: %s", str);
        this.f15219n.beginTransactionWithListener(this.f15218m);
        try {
            Object obj = rVar.get();
            this.f15219n.setTransactionSuccessful();
            return obj;
        } finally {
            this.f15219n.endTransaction();
        }
    }

    @Override // H4.W
    public final void G(String str, Runnable runnable) {
        u4.q.a("W", "Starting transaction: %s", str);
        this.f15219n.beginTransactionWithListener(this.f15218m);
        try {
            runnable.run();
            this.f15219n.setTransactionSuccessful();
        } finally {
            this.f15219n.endTransaction();
        }
    }

    @Override // H4.W
    public final void J() {
        m5.d.i("SQLitePersistence shutdown without start!", this.f15220o, new Object[0]);
        this.f15220o = false;
        this.f15219n.close();
        this.f15219n = null;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, H0.u] */
    @Override // H4.W
    public final void K() {
        boolean z7;
        boolean z8 = true;
        m5.d.i("SQLitePersistence double-started!", !this.f15220o, new Object[0]);
        this.f15220o = true;
        try {
            this.f15219n = this.f15213g.getWritableDatabase();
            V v6 = this.f15215i;
            P R7 = v6.f15230a.R("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1");
            G g3 = new G(v6, 2);
            Cursor s7 = R7.s();
            try {
                if (s7.moveToFirst()) {
                    g3.accept(s7);
                    s7.close();
                    z7 = true;
                } else {
                    s7.close();
                    z7 = false;
                }
                if (!z7) {
                    z8 = false;
                }
                m5.d.i("Missing target_globals entry", z8, new Object[0]);
                long j = v6.f15233d;
                K k2 = this.f15217l;
                k2.getClass();
                ?? obj = new Object();
                obj.f1902a = j;
                k2.f15197b = obj;
            } catch (Throwable th) {
                if (s7 != null) {
                    try {
                        s7.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteDatabaseLockedException e7) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e7);
        }
    }

    public final void Q(String str, Object... objArr) {
        this.f15219n.execSQL(str, objArr);
    }

    public final P R(String str) {
        return new P(this.f15219n, str);
    }

    @Override // H4.W
    public final InterfaceC1671a l() {
        return this.j;
    }

    @Override // H4.W
    public final InterfaceC1672b p(C1422f c1422f) {
        return new R1.j(this, this.f15214h, c1422f);
    }

    @Override // H4.W
    public final InterfaceC1677g q(C1422f c1422f) {
        return new I(this, this.f15214h, c1422f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p4.x, h1.t] */
    @Override // H4.W
    public final InterfaceC1693x r(C1422f c1422f, InterfaceC1677g interfaceC1677g) {
        C0585f c0585f = this.f15214h;
        ?? obj = new Object();
        obj.f11318b = this;
        obj.f11319c = c0585f;
        String str = c1422f.f13857a;
        if (str == null) {
            str = StringUtils.EMPTY;
        }
        obj.f11321e = str;
        obj.f = C1820H.f15774v;
        obj.f11320d = interfaceC1677g;
        return obj;
    }

    @Override // H4.W
    public final InterfaceC1694y s() {
        return new C0415A(this);
    }

    @Override // H4.W
    public final B t() {
        return this.f15217l;
    }

    @Override // H4.W
    public final C u() {
        return this.f15216k;
    }

    @Override // H4.W
    public final X w() {
        return this.f15215i;
    }

    @Override // H4.W
    public final boolean y() {
        return this.f15220o;
    }
}
