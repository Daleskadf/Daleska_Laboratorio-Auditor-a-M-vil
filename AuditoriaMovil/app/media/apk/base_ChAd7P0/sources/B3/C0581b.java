package b3;

import java.util.Comparator;
/* renamed from: b3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0581b implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ C0581b f8169a = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        W2.d dVar = (W2.d) obj;
        W2.d dVar2 = (W2.d) obj2;
        if (!dVar.f6166a.equals(dVar2.f6166a)) {
            return dVar.f6166a.compareTo(dVar2.f6166a);
        }
        return (dVar.k() > dVar2.k() ? 1 : (dVar.k() == dVar2.k() ? 0 : -1));
    }
}
