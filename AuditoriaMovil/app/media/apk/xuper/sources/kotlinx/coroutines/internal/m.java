package kotlinx.coroutines.internal;
/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f15755a = new y("CONDITION_FALSE");

    /* renamed from: b  reason: collision with root package name */
    public static final Object f15756b = new y("LIST_EMPTY");

    public static final Object a() {
        return f15755a;
    }

    public static final n b(Object obj) {
        v vVar;
        n nVar;
        if (obj instanceof v) {
            vVar = (v) obj;
        } else {
            vVar = null;
        }
        if (vVar == null || (nVar = vVar.f15778a) == null) {
            return (n) obj;
        }
        return nVar;
    }
}
