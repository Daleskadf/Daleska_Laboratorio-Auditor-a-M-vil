package r;

import java.util.Iterator;
/* renamed from: r.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1719d extends AbstractC1720e implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public C1718c f15403a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15404b = true;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f15405c;

    public C1719d(f fVar) {
        this.f15405c = fVar;
    }

    @Override // r.AbstractC1720e
    public final void a(C1718c c1718c) {
        boolean z7;
        C1718c c1718c2 = this.f15403a;
        if (c1718c == c1718c2) {
            C1718c c1718c3 = c1718c2.f15402d;
            this.f15403a = c1718c3;
            if (c1718c3 == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.f15404b = z7;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15404b) {
            if (this.f15405c.f15406a == null) {
                return false;
            }
            return true;
        }
        C1718c c1718c = this.f15403a;
        if (c1718c == null || c1718c.f15401c == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1718c c1718c;
        if (this.f15404b) {
            this.f15404b = false;
            this.f15403a = this.f15405c.f15406a;
        } else {
            C1718c c1718c2 = this.f15403a;
            if (c1718c2 != null) {
                c1718c = c1718c2.f15401c;
            } else {
                c1718c = null;
            }
            this.f15403a = c1718c;
        }
        return this.f15403a;
    }
}
