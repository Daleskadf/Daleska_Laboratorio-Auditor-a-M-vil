package J2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class l extends SQLiteOpenHelper {

    /* renamed from: c  reason: collision with root package name */
    public static final List f2419c = Arrays.asList(j.f2414b, j.f2415c, j.f2416d, j.f2417e);

    /* renamed from: a  reason: collision with root package name */
    public final int f2420a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2421b;

    public l(int i7, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i7);
        this.f2421b = false;
        this.f2420a = i7;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        List list = f2419c;
        if (i8 <= list.size()) {
            while (i7 < i8) {
                ((k) list.get(i7)).a(sQLiteDatabase);
                i7++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i7 + " to " + i8 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f2421b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f2421b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, this.f2420a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        if (!this.f2421b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i8);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f2421b) {
            onConfigure(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        if (!this.f2421b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i7, i8);
    }
}
