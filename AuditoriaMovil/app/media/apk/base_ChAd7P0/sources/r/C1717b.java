package r;

import java.util.Iterator;
/* renamed from: r.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1717b extends AbstractC1720e implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public C1718c f15396a;

    /* renamed from: b  reason: collision with root package name */
    public C1718c f15397b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f15398c;

    public C1717b(C1718c c1718c, C1718c c1718c2, int i7) {
        this.f15398c = i7;
        this.f15396a = c1718c2;
        this.f15397b = c1718c;
    }

    @Override // r.AbstractC1720e
    public final void a(C1718c c1718c) {
        C1718c c1718c2;
        C1718c c1718c3 = null;
        if (this.f15396a == c1718c && c1718c == this.f15397b) {
            this.f15397b = null;
            this.f15396a = null;
        }
        C1718c c1718c4 = this.f15396a;
        if (c1718c4 == c1718c) {
            switch (this.f15398c) {
                case 0:
                    c1718c2 = c1718c4.f15402d;
                    break;
                default:
                    c1718c2 = c1718c4.f15401c;
                    break;
            }
            this.f15396a = c1718c2;
        }
        C1718c c1718c5 = this.f15397b;
        if (c1718c5 == c1718c) {
            C1718c c1718c6 = this.f15396a;
            if (c1718c5 != c1718c6 && c1718c6 != null) {
                c1718c3 = b(c1718c5);
            }
            this.f15397b = c1718c3;
        }
    }

    public final C1718c b(C1718c c1718c) {
        switch (this.f15398c) {
            case 0:
                return c1718c.f15401c;
            default:
                return c1718c.f15402d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15397b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1718c c1718c;
        C1718c c1718c2 = this.f15397b;
        C1718c c1718c3 = this.f15396a;
        if (c1718c2 != c1718c3 && c1718c3 != null) {
            c1718c = b(c1718c2);
        } else {
            c1718c = null;
        }
        this.f15397b = c1718c;
        return c1718c2;
    }
}
