package I0;

import A3.e0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f2123a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f2124b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer[] f2125c = new ByteBuffer[0];

    /* renamed from: d  reason: collision with root package name */
    public boolean f2126d;

    public a(e0 e0Var) {
        this.f2123a = e0Var;
        b bVar = b.f2127e;
        this.f2126d = false;
    }

    public final b a(b bVar) {
        if (!bVar.equals(b.f2127e)) {
            int i7 = 0;
            while (true) {
                e0 e0Var = this.f2123a;
                if (i7 < e0Var.size()) {
                    d dVar = (d) e0Var.get(i7);
                    b f = dVar.f(bVar);
                    if (dVar.isActive()) {
                        K0.a.j(!f.equals(b.f2127e));
                        bVar = f;
                    }
                    i7++;
                } else {
                    return bVar;
                }
            }
        } else {
            throw new c(bVar);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f2124b;
        arrayList.clear();
        this.f2126d = false;
        int i7 = 0;
        while (true) {
            e0 e0Var = this.f2123a;
            if (i7 >= e0Var.size()) {
                break;
            }
            d dVar = (d) e0Var.get(i7);
            dVar.flush();
            if (dVar.isActive()) {
                arrayList.add(dVar);
            }
            i7++;
        }
        this.f2125c = new ByteBuffer[arrayList.size()];
        for (int i8 = 0; i8 <= c(); i8++) {
            this.f2125c[i8] = ((d) arrayList.get(i8)).b();
        }
    }

    public final int c() {
        return this.f2125c.length - 1;
    }

    public final boolean d() {
        if (this.f2126d && ((d) this.f2124b.get(c())).d() && !this.f2125c[c()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        return !this.f2124b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        e0 e0Var = this.f2123a;
        if (e0Var.size() != aVar.f2123a.size()) {
            return false;
        }
        for (int i7 = 0; i7 < e0Var.size(); i7++) {
            if (e0Var.get(i7) != aVar.f2123a.get(i7)) {
                return false;
            }
        }
        return true;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z7;
        ByteBuffer byteBuffer2;
        boolean z8;
        for (boolean z9 = true; z9; z9 = z7) {
            z7 = false;
            for (int i7 = 0; i7 <= c(); i7++) {
                if (!this.f2125c[i7].hasRemaining()) {
                    ArrayList arrayList = this.f2124b;
                    d dVar = (d) arrayList.get(i7);
                    if (dVar.d()) {
                        if (!this.f2125c[i7].hasRemaining() && i7 < c()) {
                            ((d) arrayList.get(i7 + 1)).c();
                        }
                    } else {
                        if (i7 > 0) {
                            byteBuffer2 = this.f2125c[i7 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = d.f2132a;
                        }
                        dVar.e(byteBuffer2);
                        this.f2125c[i7] = dVar.b();
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.f2125c[i7].hasRemaining()) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        z7 |= z8;
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return this.f2123a.hashCode();
    }
}
