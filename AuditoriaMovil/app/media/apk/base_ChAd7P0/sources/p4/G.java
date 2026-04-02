package p4;

import android.database.Cursor;
import java.util.HashMap;
import q4.C1709b;
import q4.C1710c;
/* loaded from: classes.dex */
public final /* synthetic */ class G implements u4.g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15177a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15178b;

    public /* synthetic */ G(Object obj, int i7) {
        this.f15177a = i7;
        this.f15178b = obj;
    }

    @Override // u4.g
    public final void accept(Object obj) {
        Object obj2 = this.f15178b;
        switch (this.f15177a) {
            case 0:
                Cursor cursor = (Cursor) obj;
                ((HashMap) obj2).put(Integer.valueOf(cursor.getInt(0)), new C1710c(cursor.getLong(1), new C1709b(new q4.q(new U3.p(cursor.getInt(3), cursor.getLong(2))), new q4.h(G.i.v(cursor.getString(4))), cursor.getInt(5))));
                return;
            case 1:
                Boolean[] boolArr = (Boolean[]) obj2;
                try {
                    if ("BUILD_OVERLAYS".equals(((Cursor) obj).getString(0))) {
                        boolArr[0] = Boolean.TRUE;
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e7) {
                    m5.d.g("SQLitePersistence.DataMigration failed to parse: %s", e7);
                    throw null;
                }
            default:
                Cursor cursor2 = (Cursor) obj;
                V v6 = (V) obj2;
                v6.getClass();
                v6.f15232c = cursor2.getInt(0);
                v6.f15233d = cursor2.getInt(1);
                v6.f15234e = new q4.q(new U3.p(cursor2.getInt(3), cursor2.getLong(2)));
                v6.f = cursor2.getLong(4);
                return;
        }
    }
}
