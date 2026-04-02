package I4;

import j$.util.Objects;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
/* loaded from: classes.dex */
public final class u extends q {

    /* renamed from: a  reason: collision with root package name */
    public final Serializable f2220a;

    public u(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f2220a = bool;
    }

    public static boolean m(u uVar) {
        Serializable serializable = uVar.f2220a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        if (!(number instanceof BigInteger) && !(number instanceof Long) && !(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            return false;
        }
        return true;
    }

    @Override // I4.q
    public final boolean e() {
        Serializable serializable = this.f2220a;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(h());
    }

    public final boolean equals(Object obj) {
        BigDecimal j;
        BigDecimal j8;
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        Serializable serializable = this.f2220a;
        Serializable serializable2 = uVar.f2220a;
        if (serializable == null) {
            if (serializable2 == null) {
                return true;
            }
            return false;
        } else if (m(this) && m(uVar)) {
            if (!(serializable instanceof BigInteger) && !(serializable2 instanceof BigInteger)) {
                if (l().longValue() == uVar.l().longValue()) {
                    return true;
                }
                return false;
            }
            return i().equals(uVar.i());
        } else if ((serializable instanceof Number) && (serializable2 instanceof Number)) {
            if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
                if (serializable instanceof BigDecimal) {
                    j = (BigDecimal) serializable;
                } else {
                    j = K4.d.j(h());
                }
                if (serializable2 instanceof BigDecimal) {
                    j8 = (BigDecimal) serializable2;
                } else {
                    j8 = K4.d.j(uVar.h());
                }
                if (j.compareTo(j8) == 0) {
                    return true;
                }
                return false;
            }
            double k2 = k();
            double k8 = uVar.k();
            if (k2 == k8) {
                return true;
            }
            if (Double.isNaN(k2) && Double.isNaN(k8)) {
                return true;
            }
            return false;
        } else {
            return serializable.equals(serializable2);
        }
    }

    @Override // I4.q
    public final String h() {
        Serializable serializable = this.f2220a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return l().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f2220a;
        if (serializable == null) {
            return 31;
        }
        if (m(this)) {
            doubleToLongBits = l().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(l().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final BigInteger i() {
        Serializable serializable = this.f2220a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m(this)) {
            return BigInteger.valueOf(l().longValue());
        }
        String h8 = h();
        K4.d.d(h8);
        return new BigInteger(h8);
    }

    public final double k() {
        if (this.f2220a instanceof Number) {
            return l().doubleValue();
        }
        return Double.parseDouble(h());
    }

    public final Number l() {
        Serializable serializable = this.f2220a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new K4.j((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public u(Number number) {
        Objects.requireNonNull(number);
        this.f2220a = number;
    }

    public u(String str) {
        Objects.requireNonNull(str);
        this.f2220a = str;
    }
}
