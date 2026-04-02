package p4;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import b3.C0585f;
import p.C1608t;
/* loaded from: classes.dex */
public final /* synthetic */ class U implements u4.g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15228a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1608t f15229b;

    public /* synthetic */ U(C1608t c1608t, int i7) {
        this.f15228a = i7;
        this.f15229b = c1608t;
    }

    @Override // u4.g
    public final void accept(Object obj) {
        boolean z7;
        C1608t c1608t = this.f15229b;
        int i7 = this.f15228a;
        Cursor cursor = (Cursor) obj;
        c1608t.getClass();
        switch (i7) {
            case 0:
                int i8 = cursor.getInt(0);
                try {
                    s4.k M7 = s4.k.M(cursor.getBlob(1));
                    com.google.protobuf.G g3 = (com.google.protobuf.G) M7.j(com.google.protobuf.I.NEW_BUILDER);
                    if (!g3.f10005a.equals(M7)) {
                        g3.d();
                        com.google.protobuf.G.e(g3.f10006b, M7);
                    }
                    s4.i iVar = (s4.i) g3;
                    iVar.d();
                    s4.k.y((s4.k) iVar.f10006b);
                    ((SQLiteDatabase) c1608t.f14880b).execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((s4.k) iVar.b()).d(), Integer.valueOf(i8)});
                    return;
                } catch (com.google.protobuf.X unused) {
                    m5.d.g("Failed to decode Query data for target %s", Integer.valueOf(i8));
                    throw null;
                }
            case 1:
                int i9 = cursor.getInt(0);
                try {
                    ((SQLiteDatabase) c1608t.f14880b).execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{((C0585f) c1608t.f14881c).G(s4.k.M(cursor.getBlob(1))).f15235a.b(), Integer.valueOf(i9)});
                    return;
                } catch (com.google.protobuf.X unused2) {
                    m5.d.g("Failed to decode Query data for target %s", Integer.valueOf(i9));
                    throw null;
                }
            default:
                String string = cursor.getString(0);
                O o7 = new O(new Object[]{string, Long.valueOf(cursor.getLong(1))}, 0);
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) c1608t.f14880b;
                Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(o7, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?", null, null);
                while (rawQueryWithFactory.moveToNext()) {
                    try {
                        int i10 = rawQueryWithFactory.getInt(0);
                        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
                        compileStatement.bindString(1, string);
                        compileStatement.bindLong(2, i10);
                        if (compileStatement.executeUpdateDelete() != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        m5.d.i("Mutation batch (%s, %d) did not exist", z7, string, Integer.valueOf(i10));
                        sQLiteDatabase.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{string, Integer.valueOf(i10)});
                    } catch (Throwable th) {
                        if (rawQueryWithFactory != null) {
                            try {
                                rawQueryWithFactory.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                rawQueryWithFactory.close();
                return;
        }
    }
}
