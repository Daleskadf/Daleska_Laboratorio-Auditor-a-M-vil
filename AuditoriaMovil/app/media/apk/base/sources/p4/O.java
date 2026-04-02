package p4;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.List;
import t5.C1840l;
/* loaded from: classes.dex */
public final /* synthetic */ class O implements SQLiteDatabase.CursorFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15208a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15209b;

    public /* synthetic */ O(Object obj, int i7) {
        this.f15208a = i7;
        this.f15209b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        long j;
        switch (this.f15208a) {
            case 0:
                Q.N(sQLiteQuery, (Object[]) this.f15209b);
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                List list = ((C1840l) this.f15209b).f15911b;
                if (list != null) {
                    int size = list.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object a7 = C1840l.a(list.get(i7));
                        int i8 = i7 + 1;
                        if (a7 == null) {
                            sQLiteQuery.bindNull(i8);
                        } else if (a7 instanceof byte[]) {
                            sQLiteQuery.bindBlob(i8, (byte[]) a7);
                        } else if (a7 instanceof Double) {
                            sQLiteQuery.bindDouble(i8, ((Double) a7).doubleValue());
                        } else if (a7 instanceof Integer) {
                            sQLiteQuery.bindLong(i8, ((Integer) a7).intValue());
                        } else if (a7 instanceof Long) {
                            sQLiteQuery.bindLong(i8, ((Long) a7).longValue());
                        } else if (a7 instanceof String) {
                            sQLiteQuery.bindString(i8, (String) a7);
                        } else if (a7 instanceof Boolean) {
                            if (((Boolean) a7).booleanValue()) {
                                j = 1;
                            } else {
                                j = 0;
                            }
                            sQLiteQuery.bindLong(i8, j);
                        } else {
                            throw new IllegalArgumentException("Could not bind " + a7 + " from index " + i7 + ": Supported types are null, byte[], double, long, boolean and String");
                        }
                        i7 = i8;
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
