package f6;
/* renamed from: f6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0995b {

    /* renamed from: a  reason: collision with root package name */
    public final String f11069a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11070b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11071c;

    public C0995b(C0994a c0994a) {
        int i7;
        String str = c0994a.f11066b;
        this.f11069a = c0994a.f11067c;
        int i8 = c0994a.f11068d;
        if (i8 == -1) {
            if (str.equals("http")) {
                i7 = 80;
            } else if (str.equals("https")) {
                i7 = 443;
            } else {
                i8 = -1;
            }
            i8 = i7;
        }
        this.f11070b = i8;
        this.f11071c = c0994a.toString();
    }

    public static int a(char c8) {
        if (c8 >= '0' && c8 <= '9') {
            return c8 - '0';
        }
        if (c8 >= 'a' && c8 <= 'f') {
            return c8 - 'W';
        }
        if (c8 >= 'A' && c8 <= 'F') {
            return c8 - '7';
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0995b) && ((C0995b) obj).f11071c.equals(this.f11071c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11071c.hashCode();
    }

    public final String toString() {
        return this.f11071c;
    }
}
