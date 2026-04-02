package d3;

import android.util.Base64;
import c3.C0629a;
import com.google.android.gms.common.internal.I;
import f3.AbstractC0989b;
import f3.AbstractC0990c;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* renamed from: d3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0897b {
    public static final void d(StringBuilder sb, C0896a c0896a, Object obj) {
        int i7 = c0896a.f10301b;
        if (i7 != 11) {
            if (i7 == 7) {
                sb.append("\"");
                sb.append(AbstractC0990c.a((String) obj));
                sb.append("\"");
                return;
            }
            sb.append(obj);
            return;
        }
        Class cls = c0896a.f10298Y;
        I.i(cls);
        sb.append(((AbstractC0897b) cls.cast(obj)).toString());
    }

    public static final Object zaD(C0896a c0896a, Object obj) {
        C0629a c0629a = c0896a.f10306f0;
        if (c0629a != null) {
            String str = (String) c0629a.f8369c.get(((Integer) obj).intValue());
            if (str == null && c0629a.f8368b.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
            return str;
        }
        return obj;
    }

    public final void a(C0896a c0896a, Object obj) {
        int i7 = c0896a.f10303d;
        C0629a c0629a = c0896a.f10306f0;
        I.i(c0629a);
        HashMap hashMap = c0629a.f8368b;
        Integer num = (Integer) hashMap.get((String) obj);
        if (num == null) {
            num = (Integer) hashMap.get("gms_unknown");
        }
        I.i(num);
        String str = c0896a.f;
        switch (i7) {
            case 0:
                setIntegerInternal(c0896a, str, num.intValue());
                return;
            case 1:
                zaf(c0896a, str, (BigInteger) num);
                return;
            case 2:
                setLongInternal(c0896a, str, ((Long) num).longValue());
                return;
            case 3:
            default:
                throw new IllegalStateException(io.flutter.plugins.pathprovider.b.e(i7, "Unsupported type for conversion: "));
            case 4:
                zan(c0896a, str, ((Double) num).doubleValue());
                return;
            case 5:
                zab(c0896a, str, (BigDecimal) num);
                return;
            case 6:
                setBooleanInternal(c0896a, str, ((Boolean) num).booleanValue());
                return;
            case 7:
                setStringInternal(c0896a, str, (String) num);
                return;
            case 8:
            case 9:
                setDecodedBytesInternal(c0896a, str, (byte[]) num);
                return;
        }
    }

    public <T extends AbstractC0897b> void addConcreteTypeArrayInternal(C0896a c0896a, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends AbstractC0897b> void addConcreteTypeInternal(C0896a c0896a, String str, T t7) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, C0896a> getFieldMappings();

    public Object getFieldValue(C0896a c0896a) {
        boolean z7;
        String str = c0896a.f;
        if (c0896a.f10298Y != null) {
            if (getValueObject(str) == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                try {
                    return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
                } catch (Exception e7) {
                    throw new RuntimeException(e7);
                }
            }
            throw new IllegalStateException("Concrete field shouldn't be value object: " + c0896a.f);
        }
        return getValueObject(str);
    }

    public abstract Object getValueObject(String str);

    public boolean isFieldSet(C0896a c0896a) {
        if (c0896a.f10303d == 11) {
            if (c0896a.f10304e) {
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            }
            throw new UnsupportedOperationException("Concrete types not supported");
        }
        return isPrimitiveFieldSet(c0896a.f);
    }

    public abstract boolean isPrimitiveFieldSet(String str);

    public void setBooleanInternal(C0896a c0896a, String str, boolean z7) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(C0896a c0896a, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(C0896a c0896a, String str, int i7) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(C0896a c0896a, String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(C0896a c0896a, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(C0896a c0896a, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(C0896a c0896a, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        Map<String, C0896a> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            C0896a c0896a = fieldMappings.get(str);
            if (isFieldSet(c0896a)) {
                Object zaD = zaD(c0896a, getFieldValue(c0896a));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (zaD == null) {
                    sb.append("null");
                } else {
                    switch (c0896a.f10303d) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) zaD, 0));
                            sb.append("\"");
                            continue;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) zaD, 10));
                            sb.append("\"");
                            continue;
                        case 10:
                            AbstractC0989b.e(sb, (HashMap) zaD);
                            continue;
                        default:
                            if (c0896a.f10302c) {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i7 = 0; i7 < size; i7++) {
                                    if (i7 > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i7);
                                    if (obj != null) {
                                        d(sb, c0896a, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                d(sb, c0896a, zaD);
                                continue;
                            }
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public final void zaA(C0896a c0896a, String str) {
        if (c0896a.f10306f0 != null) {
            a(c0896a, str);
        } else {
            setStringInternal(c0896a, c0896a.f, str);
        }
    }

    public final void zaB(C0896a c0896a, Map map) {
        if (c0896a.f10306f0 != null) {
            a(c0896a, map);
        } else {
            setStringMapInternal(c0896a, c0896a.f, map);
        }
    }

    public final void zaC(C0896a c0896a, ArrayList arrayList) {
        if (c0896a.f10306f0 != null) {
            a(c0896a, arrayList);
        } else {
            setStringsInternal(c0896a, c0896a.f, arrayList);
        }
    }

    public final void zaa(C0896a c0896a, BigDecimal bigDecimal) {
        if (c0896a.f10306f0 != null) {
            a(c0896a, bigDecimal);
        } else {
            zab(c0896a, c0896a.f, bigDecimal);
        }
    }

    public void zab(C0896a c0896a, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(C0896a c0896a, ArrayList arrayList) {
        if (c0896a.f10306f0 != null) {
            a(c0896a, arrayList);
        } else {
            zad(c0896a, c0896a.f, arrayList);
        }
    }

    public void zad(C0896a c0896a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(C0896a c0896a, BigInteger bigInteger) {
        if (c0896a.f10306f0 != null) {
            a(c0896a, bigInteger);
        } else {
            zaf(c0896a, c0896a.f, bigInteger);
        }
    }

    public void zaf(C0896a c0896a, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(C0896a c0896a, ArrayList arrayList) {
        if (c0896a.f10306f0 != null) {
            a(c0896a, arrayList);
        } else {
            zah(c0896a, c0896a.f, arrayList);
        }
    }

    public void zah(C0896a c0896a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(C0896a c0896a, boolean z7) {
        if (c0896a.f10306f0 != null) {
            a(c0896a, Boolean.valueOf(z7));
        } else {
            setBooleanInternal(c0896a, c0896a.f, z7);
        }
    }

    public final void zaj(C0896a c0896a, ArrayList arrayList) {
        if (c0896a.f10306f0 != null) {
            a(c0896a, arrayList);
        } else {
            zak(c0896a, c0896a.f, arrayList);
        }
    }

    public void zak(C0896a c0896a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(C0896a c0896a, byte[] bArr) {
        if (c0896a.f10306f0 != null) {
            a(c0896a, bArr);
        } else {
            setDecodedBytesInternal(c0896a, c0896a.f, bArr);
        }
    }

    public final void zam(C0896a c0896a, double d7) {
        if (c0896a.f10306f0 != null) {
            a(c0896a, Double.valueOf(d7));
        } else {
            zan(c0896a, c0896a.f, d7);
        }
    }

    public void zan(C0896a c0896a, String str, double d7) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(C0896a c0896a, ArrayList arrayList) {
        if (c0896a.f10306f0 != null) {
            a(c0896a, arrayList);
        } else {
            zap(c0896a, c0896a.f, arrayList);
        }
    }

    public void zap(C0896a c0896a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(C0896a c0896a, float f) {
        if (c0896a.f10306f0 != null) {
            a(c0896a, Float.valueOf(f));
        } else {
            zar(c0896a, c0896a.f, f);
        }
    }

    public void zar(C0896a c0896a, String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(C0896a c0896a, ArrayList arrayList) {
        if (c0896a.f10306f0 != null) {
            a(c0896a, arrayList);
        } else {
            zat(c0896a, c0896a.f, arrayList);
        }
    }

    public void zat(C0896a c0896a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(C0896a c0896a, int i7) {
        if (c0896a.f10306f0 != null) {
            a(c0896a, Integer.valueOf(i7));
        } else {
            setIntegerInternal(c0896a, c0896a.f, i7);
        }
    }

    public final void zav(C0896a c0896a, ArrayList arrayList) {
        if (c0896a.f10306f0 != null) {
            a(c0896a, arrayList);
        } else {
            zaw(c0896a, c0896a.f, arrayList);
        }
    }

    public void zaw(C0896a c0896a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(C0896a c0896a, long j) {
        if (c0896a.f10306f0 != null) {
            a(c0896a, Long.valueOf(j));
        } else {
            setLongInternal(c0896a, c0896a.f, j);
        }
    }

    public final void zay(C0896a c0896a, ArrayList arrayList) {
        if (c0896a.f10306f0 != null) {
            a(c0896a, arrayList);
        } else {
            zaz(c0896a, c0896a.f, arrayList);
        }
    }

    public void zaz(C0896a c0896a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }
}
