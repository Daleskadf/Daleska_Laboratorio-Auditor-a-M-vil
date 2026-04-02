package K4;
/* loaded from: classes.dex */
public final class j extends Number {

    /* renamed from: a  reason: collision with root package name */
    public final String f2663a;

    public j(String str) {
        this.f2663a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f2663a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.f2663a.equals(((j) obj).f2663a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f2663a);
    }

    public final int hashCode() {
        return this.f2663a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f2663a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return d.j(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f2663a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return d.j(str).longValue();
        }
    }

    public final String toString() {
        return this.f2663a;
    }
}
