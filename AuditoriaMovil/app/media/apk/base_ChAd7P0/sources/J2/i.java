package J2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class i implements c, K2.c {

    /* renamed from: e  reason: collision with root package name */
    public static final A2.b f2409e = new A2.b("proto");

    /* renamed from: a  reason: collision with root package name */
    public final l f2410a;

    /* renamed from: b  reason: collision with root package name */
    public final L2.a f2411b;

    /* renamed from: c  reason: collision with root package name */
    public final L2.a f2412c;

    /* renamed from: d  reason: collision with root package name */
    public final a f2413d;

    public i(L2.a aVar, L2.a aVar2, a aVar3, l lVar) {
        this.f2410a = lVar;
        this.f2411b = aVar;
        this.f2412c = aVar2;
        this.f2413d = aVar3;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, D2.b bVar) {
        Long valueOf;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(bVar.f835a, String.valueOf(M2.a.a(bVar.f837c))));
        byte[] bArr = bVar.f836b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            if (!query.moveToNext()) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(query.getLong(0));
            }
            return valueOf;
        } finally {
            query.close();
        }
    }

    public static String g(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f2397a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object j(Cursor cursor, g gVar) {
        try {
            return gVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        l lVar = this.f2410a;
        lVar.getClass();
        L2.a aVar = this.f2412c;
        long o7 = aVar.o();
        while (true) {
            try {
                return lVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e7) {
                if (aVar.o() < this.f2413d.f2394c + o7) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e7);
                }
            }
        }
    }

    public final Object c(g gVar) {
        SQLiteDatabase a7 = a();
        a7.beginTransaction();
        try {
            Object apply = gVar.apply(a7);
            a7.setTransactionSuccessful();
            return apply;
        } finally {
            a7.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2410a.close();
    }

    public final Object d(K2.b bVar) {
        SQLiteDatabase a7 = a();
        L2.a aVar = this.f2412c;
        long o7 = aVar.o();
        while (true) {
            try {
                a7.beginTransaction();
                try {
                    Object w2 = bVar.w();
                    a7.setTransactionSuccessful();
                    return w2;
                } finally {
                    a7.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e7) {
                if (aVar.o() < this.f2413d.f2394c + o7) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e7);
                }
            }
        }
    }
}
