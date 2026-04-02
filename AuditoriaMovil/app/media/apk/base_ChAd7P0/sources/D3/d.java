package d3;

import F6.C0110x;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import c3.C0629a;
import com.google.android.gms.common.internal.I;
import f3.AbstractC0989b;
import f3.AbstractC0990c;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class d extends AbstractC0898c {
    public static final Parcelable.Creator<d> CREATOR = new android.support.v4.media.session.b(17);

    /* renamed from: X  reason: collision with root package name */
    public int f10307X;

    /* renamed from: a  reason: collision with root package name */
    public final int f10308a;

    /* renamed from: b  reason: collision with root package name */
    public final Parcel f10309b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10310c;

    /* renamed from: d  reason: collision with root package name */
    public final h f10311d;

    /* renamed from: e  reason: collision with root package name */
    public final String f10312e;
    public int f;

    public d(int i7, Parcel parcel, h hVar) {
        String str;
        this.f10308a = i7;
        I.i(parcel);
        this.f10309b = parcel;
        this.f10310c = 2;
        this.f10311d = hVar;
        if (hVar == null) {
            str = null;
        } else {
            str = hVar.f10321c;
        }
        this.f10312e = str;
        this.f = 2;
    }

    public static void g(StringBuilder sb, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((C0896a) entry.getValue()).f10297X, entry);
        }
        sb.append('{');
        int T7 = j3.f.T(parcel);
        boolean z7 = false;
        while (parcel.dataPosition() < T7) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) readInt);
            if (entry2 != null) {
                if (z7) {
                    sb.append(",");
                }
                C0896a c0896a = (C0896a) entry2.getValue();
                sb.append("\"");
                sb.append((String) entry2.getKey());
                sb.append("\":");
                C0629a c0629a = c0896a.f10306f0;
                BigInteger bigInteger = null;
                BigInteger bigInteger2 = null;
                Parcel[] parcelArr = null;
                boolean[] zArr = null;
                BigDecimal[] bigDecimalArr = null;
                double[] dArr = null;
                long[] jArr = null;
                BigInteger[] bigIntegerArr = null;
                Parcel obtain = null;
                String str = null;
                String str2 = null;
                int i7 = c0896a.f10303d;
                if (c0629a != null) {
                    switch (i7) {
                        case 0:
                            j(sb, c0896a, AbstractC0897b.zaD(c0896a, Integer.valueOf(j3.f.M(readInt, parcel))));
                            break;
                        case 1:
                            int Q7 = j3.f.Q(readInt, parcel);
                            int dataPosition = parcel.dataPosition();
                            if (Q7 != 0) {
                                byte[] createByteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition + Q7);
                                bigInteger2 = new BigInteger(createByteArray);
                            }
                            j(sb, c0896a, AbstractC0897b.zaD(c0896a, bigInteger2));
                            break;
                        case 2:
                            j(sb, c0896a, AbstractC0897b.zaD(c0896a, Long.valueOf(j3.f.O(readInt, parcel))));
                            break;
                        case 3:
                            j(sb, c0896a, AbstractC0897b.zaD(c0896a, Float.valueOf(j3.f.J(readInt, parcel))));
                            break;
                        case 4:
                            j(sb, c0896a, AbstractC0897b.zaD(c0896a, Double.valueOf(j3.f.H(readInt, parcel))));
                            break;
                        case 5:
                            j(sb, c0896a, AbstractC0897b.zaD(c0896a, j3.f.d(readInt, parcel)));
                            break;
                        case 6:
                            j(sb, c0896a, AbstractC0897b.zaD(c0896a, Boolean.valueOf(j3.f.F(readInt, parcel))));
                            break;
                        case 7:
                            j(sb, c0896a, AbstractC0897b.zaD(c0896a, j3.f.l(readInt, parcel)));
                            break;
                        case 8:
                        case 9:
                            j(sb, c0896a, AbstractC0897b.zaD(c0896a, j3.f.f(readInt, parcel)));
                            break;
                        case 10:
                            Bundle e7 = j3.f.e(readInt, parcel);
                            HashMap hashMap = new HashMap();
                            for (String str3 : e7.keySet()) {
                                String string = e7.getString(str3);
                                I.i(string);
                                hashMap.put(str3, string);
                            }
                            j(sb, c0896a, AbstractC0897b.zaD(c0896a, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "Unknown field out type = "));
                    }
                } else {
                    boolean z8 = c0896a.f10304e;
                    String str4 = c0896a.f10299Z;
                    if (z8) {
                        sb.append("[");
                        switch (i7) {
                            case 0:
                                int[] j = j3.f.j(readInt, parcel);
                                int length = j.length;
                                for (int i8 = 0; i8 < length; i8++) {
                                    if (i8 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(j[i8]);
                                }
                                break;
                            case 1:
                                int Q8 = j3.f.Q(readInt, parcel);
                                int dataPosition2 = parcel.dataPosition();
                                if (Q8 != 0) {
                                    int readInt2 = parcel.readInt();
                                    bigIntegerArr = new BigInteger[readInt2];
                                    for (int i9 = 0; i9 < readInt2; i9++) {
                                        bigIntegerArr[i9] = new BigInteger(parcel.createByteArray());
                                    }
                                    parcel.setDataPosition(dataPosition2 + Q8);
                                }
                                int length2 = bigIntegerArr.length;
                                for (int i10 = 0; i10 < length2; i10++) {
                                    if (i10 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(bigIntegerArr[i10]);
                                }
                                break;
                            case 2:
                                int Q9 = j3.f.Q(readInt, parcel);
                                int dataPosition3 = parcel.dataPosition();
                                if (Q9 != 0) {
                                    jArr = parcel.createLongArray();
                                    parcel.setDataPosition(dataPosition3 + Q9);
                                }
                                int length3 = jArr.length;
                                for (int i11 = 0; i11 < length3; i11++) {
                                    if (i11 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(jArr[i11]);
                                }
                                break;
                            case 3:
                                float[] i12 = j3.f.i(readInt, parcel);
                                int length4 = i12.length;
                                for (int i13 = 0; i13 < length4; i13++) {
                                    if (i13 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(i12[i13]);
                                }
                                break;
                            case 4:
                                int Q10 = j3.f.Q(readInt, parcel);
                                int dataPosition4 = parcel.dataPosition();
                                if (Q10 != 0) {
                                    dArr = parcel.createDoubleArray();
                                    parcel.setDataPosition(dataPosition4 + Q10);
                                }
                                int length5 = dArr.length;
                                for (int i14 = 0; i14 < length5; i14++) {
                                    if (i14 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(dArr[i14]);
                                }
                                break;
                            case 5:
                                int Q11 = j3.f.Q(readInt, parcel);
                                int dataPosition5 = parcel.dataPosition();
                                if (Q11 != 0) {
                                    int readInt3 = parcel.readInt();
                                    bigDecimalArr = new BigDecimal[readInt3];
                                    for (int i15 = 0; i15 < readInt3; i15++) {
                                        byte[] createByteArray2 = parcel.createByteArray();
                                        bigDecimalArr[i15] = new BigDecimal(new BigInteger(createByteArray2), parcel.readInt());
                                    }
                                    parcel.setDataPosition(dataPosition5 + Q11);
                                }
                                int length6 = bigDecimalArr.length;
                                for (int i16 = 0; i16 < length6; i16++) {
                                    if (i16 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(bigDecimalArr[i16]);
                                }
                                break;
                            case 6:
                                int Q12 = j3.f.Q(readInt, parcel);
                                int dataPosition6 = parcel.dataPosition();
                                if (Q12 != 0) {
                                    zArr = parcel.createBooleanArray();
                                    parcel.setDataPosition(dataPosition6 + Q12);
                                }
                                int length7 = zArr.length;
                                for (int i17 = 0; i17 < length7; i17++) {
                                    if (i17 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(zArr[i17]);
                                }
                                break;
                            case 7:
                                String[] m7 = j3.f.m(readInt, parcel);
                                int length8 = m7.length;
                                for (int i18 = 0; i18 < length8; i18++) {
                                    if (i18 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(m7[i18]);
                                    sb.append("\"");
                                }
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                int Q13 = j3.f.Q(readInt, parcel);
                                int dataPosition7 = parcel.dataPosition();
                                if (Q13 != 0) {
                                    int readInt4 = parcel.readInt();
                                    Parcel[] parcelArr2 = new Parcel[readInt4];
                                    for (int i19 = 0; i19 < readInt4; i19++) {
                                        int readInt5 = parcel.readInt();
                                        if (readInt5 != 0) {
                                            int dataPosition8 = parcel.dataPosition();
                                            Parcel obtain2 = Parcel.obtain();
                                            obtain2.appendFrom(parcel, dataPosition8, readInt5);
                                            parcelArr2[i19] = obtain2;
                                            parcel.setDataPosition(dataPosition8 + readInt5);
                                        } else {
                                            parcelArr2[i19] = null;
                                        }
                                    }
                                    parcel.setDataPosition(dataPosition7 + Q13);
                                    parcelArr = parcelArr2;
                                }
                                int length9 = parcelArr.length;
                                for (int i20 = 0; i20 < length9; i20++) {
                                    if (i20 > 0) {
                                        sb.append(",");
                                    }
                                    parcelArr[i20].setDataPosition(0);
                                    I.i(str4);
                                    I.i(c0896a.f10305e0);
                                    Map map2 = (Map) c0896a.f10305e0.f10320b.get(str4);
                                    I.i(map2);
                                    g(sb, map2, parcelArr[i20]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        sb.append("]");
                    } else {
                        switch (i7) {
                            case 0:
                                sb.append(j3.f.M(readInt, parcel));
                                break;
                            case 1:
                                int Q14 = j3.f.Q(readInt, parcel);
                                int dataPosition9 = parcel.dataPosition();
                                if (Q14 != 0) {
                                    byte[] createByteArray3 = parcel.createByteArray();
                                    parcel.setDataPosition(dataPosition9 + Q14);
                                    bigInteger = new BigInteger(createByteArray3);
                                }
                                sb.append(bigInteger);
                                break;
                            case 2:
                                sb.append(j3.f.O(readInt, parcel));
                                break;
                            case 3:
                                sb.append(j3.f.J(readInt, parcel));
                                break;
                            case 4:
                                sb.append(j3.f.H(readInt, parcel));
                                break;
                            case 5:
                                sb.append(j3.f.d(readInt, parcel));
                                break;
                            case 6:
                                sb.append(j3.f.F(readInt, parcel));
                                break;
                            case 7:
                                String l8 = j3.f.l(readInt, parcel);
                                sb.append("\"");
                                sb.append(AbstractC0990c.a(l8));
                                sb.append("\"");
                                break;
                            case 8:
                                byte[] f = j3.f.f(readInt, parcel);
                                sb.append("\"");
                                if (f != null) {
                                    str2 = Base64.encodeToString(f, 0);
                                }
                                sb.append(str2);
                                sb.append("\"");
                                break;
                            case 9:
                                byte[] f4 = j3.f.f(readInt, parcel);
                                sb.append("\"");
                                if (f4 != null) {
                                    str = Base64.encodeToString(f4, 10);
                                }
                                sb.append(str);
                                sb.append("\"");
                                break;
                            case 10:
                                Bundle e8 = j3.f.e(readInt, parcel);
                                Set<String> keySet = e8.keySet();
                                sb.append("{");
                                boolean z9 = true;
                                for (String str5 : keySet) {
                                    if (!z9) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(str5);
                                    sb.append("\":\"");
                                    sb.append(AbstractC0990c.a(e8.getString(str5)));
                                    sb.append("\"");
                                    z9 = false;
                                }
                                sb.append("}");
                                break;
                            case 11:
                                int Q15 = j3.f.Q(readInt, parcel);
                                int dataPosition10 = parcel.dataPosition();
                                if (Q15 != 0) {
                                    obtain = Parcel.obtain();
                                    obtain.appendFrom(parcel, dataPosition10, Q15);
                                    parcel.setDataPosition(dataPosition10 + Q15);
                                }
                                obtain.setDataPosition(0);
                                I.i(str4);
                                I.i(c0896a.f10305e0);
                                Map map3 = (Map) c0896a.f10305e0.f10320b.get(str4);
                                I.i(map3);
                                g(sb, map3, obtain);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                }
                z7 = true;
            }
        }
        if (parcel.dataPosition() == T7) {
            sb.append('}');
            return;
        }
        throw new C0110x(io.flutter.plugins.pathprovider.b.e(T7, "Overread allowed size end="), parcel);
    }

    public static final void i(StringBuilder sb, int i7, Object obj) {
        String str = null;
        switch (i7) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                I.i(obj);
                sb.append(AbstractC0990c.a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                byte[] bArr = (byte[]) obj;
                if (bArr != null) {
                    str = Base64.encodeToString(bArr, 0);
                }
                sb.append(str);
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                byte[] bArr2 = (byte[]) obj;
                if (bArr2 != null) {
                    str = Base64.encodeToString(bArr2, 10);
                }
                sb.append(str);
                sb.append("\"");
                return;
            case 10:
                I.i(obj);
                AbstractC0989b.e(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "Unknown type = "));
        }
    }

    public static final void j(StringBuilder sb, C0896a c0896a, Object obj) {
        boolean z7 = c0896a.f10302c;
        int i7 = c0896a.f10301b;
        if (z7) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (i8 != 0) {
                    sb.append(",");
                }
                i(sb, i7, arrayList.get(i8));
            }
            sb.append("]");
            return;
        }
        i(sb, i7, obj);
    }

    @Override // d3.AbstractC0897b
    public final void addConcreteTypeArrayInternal(C0896a c0896a, String str, ArrayList arrayList) {
        f(c0896a);
        ArrayList arrayList2 = new ArrayList();
        I.i(arrayList);
        arrayList.size();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList2.add(((d) ((AbstractC0897b) arrayList.get(i7))).e());
        }
        int i8 = c0896a.f10297X;
        Parcel parcel = this.f10309b;
        int G2 = m5.d.G(i8, parcel);
        int size2 = arrayList2.size();
        parcel.writeInt(size2);
        for (int i9 = 0; i9 < size2; i9++) {
            Parcel parcel2 = (Parcel) arrayList2.get(i9);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        m5.d.J(G2, parcel);
    }

    @Override // d3.AbstractC0897b
    public final void addConcreteTypeInternal(C0896a c0896a, String str, AbstractC0897b abstractC0897b) {
        f(c0896a);
        Parcel e7 = ((d) abstractC0897b).e();
        Parcel parcel = this.f10309b;
        int i7 = c0896a.f10297X;
        if (e7 == null) {
            m5.d.K(parcel, i7, 0);
            return;
        }
        int G2 = m5.d.G(i7, parcel);
        parcel.appendFrom(e7, 0, e7.dataSize());
        m5.d.J(G2, parcel);
    }

    public final Parcel e() {
        int i7 = this.f;
        Parcel parcel = this.f10309b;
        if (i7 != 0) {
            if (i7 == 1) {
                m5.d.J(this.f10307X, parcel);
                this.f = 2;
            }
        } else {
            int G2 = m5.d.G(20293, parcel);
            this.f10307X = G2;
            m5.d.J(G2, parcel);
            this.f = 2;
        }
        return parcel;
    }

    public final void f(C0896a c0896a) {
        if (c0896a.f10297X != -1) {
            Parcel parcel = this.f10309b;
            if (parcel != null) {
                int i7 = this.f;
                if (i7 != 0) {
                    if (i7 == 1) {
                        return;
                    }
                    throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                }
                this.f10307X = m5.d.G(20293, parcel);
                this.f = 1;
                return;
            }
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
    }

    @Override // d3.AbstractC0897b
    public final Map getFieldMappings() {
        h hVar = this.f10311d;
        if (hVar == null) {
            return null;
        }
        String str = this.f10312e;
        I.i(str);
        return (Map) hVar.f10320b.get(str);
    }

    @Override // d3.AbstractC0898c, d3.AbstractC0897b
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // d3.AbstractC0898c, d3.AbstractC0897b
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // d3.AbstractC0897b
    public final void setBooleanInternal(C0896a c0896a, String str, boolean z7) {
        f(c0896a);
        Parcel parcel = this.f10309b;
        m5.d.K(parcel, c0896a.f10297X, 4);
        parcel.writeInt(z7 ? 1 : 0);
    }

    @Override // d3.AbstractC0897b
    public final void setDecodedBytesInternal(C0896a c0896a, String str, byte[] bArr) {
        f(c0896a);
        m5.d.r(this.f10309b, c0896a.f10297X, bArr, true);
    }

    @Override // d3.AbstractC0897b
    public final void setIntegerInternal(C0896a c0896a, String str, int i7) {
        f(c0896a);
        Parcel parcel = this.f10309b;
        m5.d.K(parcel, c0896a.f10297X, 4);
        parcel.writeInt(i7);
    }

    @Override // d3.AbstractC0897b
    public final void setLongInternal(C0896a c0896a, String str, long j) {
        f(c0896a);
        Parcel parcel = this.f10309b;
        m5.d.K(parcel, c0896a.f10297X, 8);
        parcel.writeLong(j);
    }

    @Override // d3.AbstractC0897b
    public final void setStringInternal(C0896a c0896a, String str, String str2) {
        f(c0896a);
        m5.d.B(this.f10309b, c0896a.f10297X, str2, true);
    }

    @Override // d3.AbstractC0897b
    public final void setStringMapInternal(C0896a c0896a, String str, Map map) {
        f(c0896a);
        Bundle bundle = new Bundle();
        I.i(map);
        for (String str2 : map.keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        m5.d.q(this.f10309b, c0896a.f10297X, bundle, true);
    }

    @Override // d3.AbstractC0897b
    public final void setStringsInternal(C0896a c0896a, String str, ArrayList arrayList) {
        f(c0896a);
        I.i(arrayList);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i7 = 0; i7 < size; i7++) {
            strArr[i7] = (String) arrayList.get(i7);
        }
        m5.d.C(this.f10309b, c0896a.f10297X, strArr, true);
    }

    @Override // d3.AbstractC0897b
    public final String toString() {
        h hVar = this.f10311d;
        I.j(hVar, "Cannot convert to JSON on client side.");
        Parcel e7 = e();
        e7.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.f10312e;
        I.i(str);
        Map map = (Map) hVar.f10320b.get(str);
        I.i(map);
        g(sb, map, e7);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        h hVar;
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f10308a);
        Parcel e7 = e();
        if (e7 != null) {
            int G7 = m5.d.G(2, parcel);
            parcel.appendFrom(e7, 0, e7.dataSize());
            m5.d.J(G7, parcel);
        }
        if (this.f10310c != 0) {
            hVar = this.f10311d;
        } else {
            hVar = null;
        }
        m5.d.A(parcel, 3, hVar, i7, false);
        m5.d.J(G2, parcel);
    }

    @Override // d3.AbstractC0897b
    public final void zab(C0896a c0896a, String str, BigDecimal bigDecimal) {
        f(c0896a);
        Parcel parcel = this.f10309b;
        int i7 = c0896a.f10297X;
        if (bigDecimal == null) {
            m5.d.K(parcel, i7, 0);
            return;
        }
        int G2 = m5.d.G(i7, parcel);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        m5.d.J(G2, parcel);
    }

    @Override // d3.AbstractC0897b
    public final void zad(C0896a c0896a, String str, ArrayList arrayList) {
        f(c0896a);
        I.i(arrayList);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i7 = 0; i7 < size; i7++) {
            bigDecimalArr[i7] = (BigDecimal) arrayList.get(i7);
        }
        int i8 = c0896a.f10297X;
        Parcel parcel = this.f10309b;
        int G2 = m5.d.G(i8, parcel);
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeByteArray(bigDecimalArr[i9].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i9].scale());
        }
        m5.d.J(G2, parcel);
    }

    @Override // d3.AbstractC0897b
    public final void zaf(C0896a c0896a, String str, BigInteger bigInteger) {
        f(c0896a);
        Parcel parcel = this.f10309b;
        int i7 = c0896a.f10297X;
        if (bigInteger == null) {
            m5.d.K(parcel, i7, 0);
            return;
        }
        int G2 = m5.d.G(i7, parcel);
        parcel.writeByteArray(bigInteger.toByteArray());
        m5.d.J(G2, parcel);
    }

    @Override // d3.AbstractC0897b
    public final void zah(C0896a c0896a, String str, ArrayList arrayList) {
        f(c0896a);
        I.i(arrayList);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i7 = 0; i7 < size; i7++) {
            bigIntegerArr[i7] = (BigInteger) arrayList.get(i7);
        }
        int i8 = c0896a.f10297X;
        Parcel parcel = this.f10309b;
        int G2 = m5.d.G(i8, parcel);
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeByteArray(bigIntegerArr[i9].toByteArray());
        }
        m5.d.J(G2, parcel);
    }

    @Override // d3.AbstractC0897b
    public final void zak(C0896a c0896a, String str, ArrayList arrayList) {
        f(c0896a);
        I.i(arrayList);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i7 = 0; i7 < size; i7++) {
            zArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue();
        }
        int i8 = c0896a.f10297X;
        Parcel parcel = this.f10309b;
        int G2 = m5.d.G(i8, parcel);
        parcel.writeBooleanArray(zArr);
        m5.d.J(G2, parcel);
    }

    @Override // d3.AbstractC0897b
    public final void zan(C0896a c0896a, String str, double d7) {
        f(c0896a);
        Parcel parcel = this.f10309b;
        m5.d.K(parcel, c0896a.f10297X, 8);
        parcel.writeDouble(d7);
    }

    @Override // d3.AbstractC0897b
    public final void zap(C0896a c0896a, String str, ArrayList arrayList) {
        f(c0896a);
        I.i(arrayList);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i7 = 0; i7 < size; i7++) {
            dArr[i7] = ((Double) arrayList.get(i7)).doubleValue();
        }
        int i8 = c0896a.f10297X;
        Parcel parcel = this.f10309b;
        int G2 = m5.d.G(i8, parcel);
        parcel.writeDoubleArray(dArr);
        m5.d.J(G2, parcel);
    }

    @Override // d3.AbstractC0897b
    public final void zar(C0896a c0896a, String str, float f) {
        f(c0896a);
        Parcel parcel = this.f10309b;
        m5.d.K(parcel, c0896a.f10297X, 4);
        parcel.writeFloat(f);
    }

    @Override // d3.AbstractC0897b
    public final void zat(C0896a c0896a, String str, ArrayList arrayList) {
        f(c0896a);
        I.i(arrayList);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            fArr[i7] = ((Float) arrayList.get(i7)).floatValue();
        }
        m5.d.t(this.f10309b, c0896a.f10297X, fArr, true);
    }

    @Override // d3.AbstractC0897b
    public final void zaw(C0896a c0896a, String str, ArrayList arrayList) {
        f(c0896a);
        I.i(arrayList);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        m5.d.x(this.f10309b, c0896a.f10297X, iArr, true);
    }

    @Override // d3.AbstractC0897b
    public final void zaz(C0896a c0896a, String str, ArrayList arrayList) {
        f(c0896a);
        I.i(arrayList);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i7 = 0; i7 < size; i7++) {
            jArr[i7] = ((Long) arrayList.get(i7)).longValue();
        }
        int i8 = c0896a.f10297X;
        Parcel parcel = this.f10309b;
        int G2 = m5.d.G(i8, parcel);
        parcel.writeLongArray(jArr);
        m5.d.J(G2, parcel);
    }
}
