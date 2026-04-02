package I4;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class o extends q implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2217a = new ArrayList();

    @Override // I4.q
    public final boolean e() {
        return i().e();
    }

    public final boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof o) || !((o) obj).f2217a.equals(this.f2217a))) {
            return false;
        }
        return true;
    }

    @Override // I4.q
    public final String h() {
        return i().h();
    }

    public final int hashCode() {
        return this.f2217a.hashCode();
    }

    public final q i() {
        ArrayList arrayList = this.f2217a;
        int size = arrayList.size();
        if (size == 1) {
            return (q) arrayList.get(0);
        }
        throw new IllegalStateException(io.flutter.plugins.pathprovider.b.e(size, "Array must have size 1, but has size "));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f2217a.iterator();
    }
}
