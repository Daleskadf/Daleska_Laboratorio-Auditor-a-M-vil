package p4;

import O0.d0;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import b3.C0585f;
import g1.C1006c;
import java.util.ArrayList;
import java.util.HashMap;
import q4.C1708a;
import q4.C1710c;
import t4.EnumC1827g;
import t4.RunnableC1822b;
/* loaded from: classes.dex */
public final /* synthetic */ class H implements u4.g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15179a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15180b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f15181c;

    public /* synthetic */ H(int i7, Object obj, Object obj2) {
        this.f15179a = i7;
        this.f15180b = obj;
        this.f15181c = obj2;
    }

    @Override // u4.g
    public final void accept(Object obj) {
        C1710c c1710c;
        switch (this.f15179a) {
            case 0:
                HashMap hashMap = (HashMap) this.f15181c;
                Cursor cursor = (Cursor) obj;
                I i7 = (I) this.f15180b;
                i7.getClass();
                try {
                    int i8 = cursor.getInt(0);
                    String string = cursor.getString(1);
                    C0585f c0585f = i7.f15187b;
                    F4.i z7 = F4.i.z(cursor.getBlob(2));
                    c0585f.getClass();
                    ArrayList D4 = C0585f.D(z7);
                    if (hashMap.containsKey(Integer.valueOf(i8))) {
                        c1710c = (C1710c) hashMap.get(Integer.valueOf(i8));
                    } else {
                        c1710c = C1708a.f15337e;
                    }
                    i7.i(new C1708a(i8, string, D4, c1710c));
                    return;
                } catch (com.google.protobuf.X e7) {
                    m5.d.g("Failed to decode index: " + e7, new Object[0]);
                    throw null;
                }
            case 1:
                q4.p pVar = (q4.p) obj;
                if (((C1006c) this.f15180b).x(pVar)) {
                    String f = pVar.f();
                    SQLiteStatement sQLiteStatement = (SQLiteStatement) this.f15181c;
                    sQLiteStatement.clearBindings();
                    sQLiteStatement.bindString(1, f);
                    sQLiteStatement.bindString(2, G.i.x((q4.p) pVar.k()));
                    sQLiteStatement.execute();
                    return;
                }
                return;
            default:
                d0 d0Var = (d0) this.f15180b;
                d0Var.getClass();
                ((u4.e) this.f15181c).a(new RunnableC1822b(4, d0Var, (EnumC1827g) obj));
                return;
        }
    }
}
