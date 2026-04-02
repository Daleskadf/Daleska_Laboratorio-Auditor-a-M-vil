package f6;
/* renamed from: f6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0994a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11065a = 0;

    /* renamed from: b  reason: collision with root package name */
    public String f11066b;

    /* renamed from: c  reason: collision with root package name */
    public String f11067c;

    /* renamed from: d  reason: collision with root package name */
    public int f11068d;

    public /* synthetic */ C0994a() {
    }

    public String toString() {
        switch (this.f11065a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f11066b);
                sb.append("://");
                int i7 = -1;
                if (this.f11067c.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f11067c);
                    sb.append(']');
                } else {
                    sb.append(this.f11067c);
                }
                int i8 = this.f11068d;
                if (i8 == -1) {
                    String str = this.f11066b;
                    if (str.equals("http")) {
                        i8 = 80;
                    } else if (str.equals("https")) {
                        i8 = 443;
                    } else {
                        i8 = -1;
                    }
                }
                String str2 = this.f11066b;
                if (str2.equals("http")) {
                    i7 = 80;
                } else if (str2.equals("https")) {
                    i7 = 443;
                }
                if (i8 != i7) {
                    sb.append(':');
                    sb.append(i8);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0994a(String str, String str2, int i7) {
        this.f11066b = str;
        this.f11067c = str2;
        this.f11068d = i7;
    }
}
