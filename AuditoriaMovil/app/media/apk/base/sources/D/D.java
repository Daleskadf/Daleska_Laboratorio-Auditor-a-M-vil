package D;
/* loaded from: classes.dex */
public final class D {

    /* renamed from: c  reason: collision with root package name */
    public static final D f606c = new D(0, 0);

    /* renamed from: d  reason: collision with root package name */
    public static final D f607d = new D(1, 8);

    /* renamed from: e  reason: collision with root package name */
    public static final D f608e = new D(3, 10);
    public static final D f = new D(4, 10);

    /* renamed from: g  reason: collision with root package name */
    public static final D f609g = new D(5, 10);

    /* renamed from: h  reason: collision with root package name */
    public static final D f610h = new D(6, 10);

    /* renamed from: i  reason: collision with root package name */
    public static final D f611i = new D(6, 8);

    /* renamed from: a  reason: collision with root package name */
    public final int f612a;

    /* renamed from: b  reason: collision with root package name */
    public final int f613b;

    public D(int i7, int i8) {
        this.f612a = i7;
        this.f613b = i8;
    }

    public final boolean a() {
        if (b() && this.f612a != 1 && this.f613b == 10) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        int i7 = this.f612a;
        if (i7 != 0 && i7 != 2 && this.f613b != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d7 = (D) obj;
        if (this.f612a == d7.f612a && this.f613b == d7.f613b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f612a ^ 1000003) * 1000003) ^ this.f613b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.f612a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return AbstractC0059i.B(sb, this.f613b, "}");
    }
}
