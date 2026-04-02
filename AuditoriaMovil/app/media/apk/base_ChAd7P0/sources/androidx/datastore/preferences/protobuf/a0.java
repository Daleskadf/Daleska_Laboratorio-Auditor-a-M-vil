package androidx.datastore.preferences.protobuf;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0547y f7789a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7790b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f7791c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7792d;

    public a0(AbstractC0547y abstractC0547y, String str, Object[] objArr) {
        this.f7789a = abstractC0547y;
        this.f7790b = str;
        this.f7791c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f7792d = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i8 = 1;
        int i9 = 13;
        while (true) {
            int i10 = i8 + 1;
            char charAt2 = str.charAt(i8);
            if (charAt2 >= 55296) {
                i7 |= (charAt2 & 8191) << i9;
                i9 += 13;
                i8 = i10;
            } else {
                this.f7792d = i7 | (charAt2 << i9);
                return;
            }
        }
    }

    public final AbstractC0524a a() {
        return this.f7789a;
    }

    public final Object[] b() {
        return this.f7791c;
    }

    public final String c() {
        return this.f7790b;
    }

    public final W d() {
        int i7 = this.f7792d;
        if ((i7 & 1) != 0) {
            return W.PROTO2;
        }
        if ((i7 & 4) == 4) {
            return W.EDITIONS;
        }
        return W.PROTO3;
    }
}
