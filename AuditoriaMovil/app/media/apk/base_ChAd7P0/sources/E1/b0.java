package e1;

import A3.e0;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: d  reason: collision with root package name */
    public static final b0 f10779d = new b0(new H0.W[0]);

    /* renamed from: a  reason: collision with root package name */
    public final int f10780a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f10781b;

    /* renamed from: c  reason: collision with root package name */
    public int f10782c;

    static {
        K0.x.H(0);
    }

    public b0(H0.W... wArr) {
        this.f10781b = A3.K.q(wArr);
        this.f10780a = wArr.length;
        int i7 = 0;
        while (true) {
            e0 e0Var = this.f10781b;
            if (i7 < e0Var.size()) {
                int i8 = i7 + 1;
                for (int i9 = i8; i9 < e0Var.size(); i9++) {
                    if (((H0.W) e0Var.get(i7)).equals(e0Var.get(i9))) {
                        K0.a.o("TrackGroupArray", StringUtils.EMPTY, new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i7 = i8;
            } else {
                return;
            }
        }
    }

    public final H0.W a(int i7) {
        return (H0.W) this.f10781b.get(i7);
    }

    public final int b(H0.W w2) {
        int indexOf = this.f10781b.indexOf(w2);
        if (indexOf < 0) {
            return -1;
        }
        return indexOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f10780a == b0Var.f10780a && this.f10781b.equals(b0Var.f10781b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f10782c == 0) {
            this.f10782c = this.f10781b.hashCode();
        }
        return this.f10782c;
    }
}
