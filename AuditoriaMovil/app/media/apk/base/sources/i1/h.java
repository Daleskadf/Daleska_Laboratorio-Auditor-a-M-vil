package i1;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f11414a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11415b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11416c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11417d;

    public h(int i7, int i8, int i9, int i10) {
        this.f11414a = i7;
        this.f11415b = i8;
        this.f11416c = i9;
        this.f11417d = i10;
    }

    public final boolean a(int i7) {
        if (i7 == 1) {
            if (this.f11414a - this.f11415b <= 1) {
                return false;
            }
        } else if (this.f11416c - this.f11417d <= 1) {
            return false;
        }
        return true;
    }
}
