package p4;

import android.database.Cursor;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
/* loaded from: classes.dex */
public final /* synthetic */ class L implements u4.g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15201a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15202b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Cloneable f15203c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f15204d;

    public /* synthetic */ L(Object obj, Cloneable cloneable, Object obj2, int i7) {
        this.f15201a = i7;
        this.f15202b = obj;
        this.f15203c = cloneable;
        this.f15204d = obj2;
    }

    @Override // u4.g
    public final void accept(Object obj) {
        Object obj2 = this.f15204d;
        Cloneable cloneable = this.f15203c;
        Object obj3 = this.f15202b;
        Cursor cursor = (Cursor) obj;
        switch (this.f15201a) {
            case 0:
                h1.t tVar = (h1.t) obj3;
                tVar.getClass();
                int i7 = cursor.getInt(0);
                HashSet hashSet = (HashSet) cloneable;
                if (!hashSet.contains(Integer.valueOf(i7))) {
                    hashSet.add(Integer.valueOf(i7));
                    ((ArrayList) obj2).add(tVar.m(cursor.getBlob(1), i7));
                    return;
                }
                return;
            default:
                V v6 = (V) obj3;
                v6.getClass();
                int i8 = cursor.getInt(0);
                if (((SparseArray) cloneable).get(i8) == null) {
                    v6.e(i8);
                    v6.f15230a.Q("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i8));
                    v6.f--;
                    int[] iArr = (int[]) obj2;
                    iArr[0] = iArr[0] + 1;
                    return;
                }
                return;
        }
    }
}
