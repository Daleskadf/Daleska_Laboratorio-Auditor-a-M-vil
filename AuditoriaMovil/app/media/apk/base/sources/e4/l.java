package e4;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class l implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    public final long f10883a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10884b;

    public l(int i7) {
        int i8 = i7 + 1;
        int floor = (int) Math.floor(Math.log(i8) / Math.log(2.0d));
        this.f10884b = floor;
        this.f10883a = (((long) Math.pow(2.0d, floor)) - 1) & i8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a(this);
    }
}
