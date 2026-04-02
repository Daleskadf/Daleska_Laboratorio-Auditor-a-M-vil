package A3;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class T extends t0 {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f114b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public Object f115a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f115a != f114b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f115a;
        Object obj2 = f114b;
        if (obj != obj2) {
            this.f115a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
