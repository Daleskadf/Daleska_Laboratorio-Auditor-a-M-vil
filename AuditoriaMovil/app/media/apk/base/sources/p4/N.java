package p4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import b3.C0585f;
import p.C1608t;
/* loaded from: classes.dex */
public final class N extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public final C0585f f15206a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15207b;

    public N(Context context, C0585f c0585f, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 17);
        this.f15206a = c0585f;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f15207b = true;
        sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f15207b) {
            onConfigure(sQLiteDatabase);
        }
        new C1608t(6, sQLiteDatabase, this.f15206a).p0(0);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        if (!this.f15207b) {
            onConfigure(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f15207b) {
            onConfigure(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        if (!this.f15207b) {
            onConfigure(sQLiteDatabase);
        }
        new C1608t(6, sQLiteDatabase, this.f15206a).p0(i7);
    }
}
