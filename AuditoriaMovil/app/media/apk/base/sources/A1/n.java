package A1;

import A3.K;
import A3.e0;
import H0.E;
import H4.e1;
import H4.p1;
import K0.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import org.apache.tika.utils.XMLReaderUtils;
import s3.C1772G;
/* loaded from: classes.dex */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new C1772G(10);

    /* renamed from: b  reason: collision with root package name */
    public final String f73b;

    /* renamed from: c  reason: collision with root package name */
    public final K f74c;

    public n(String str, String str2, e0 e0Var) {
        super(str);
        K0.a.e(!e0Var.isEmpty());
        this.f73b = str2;
        K p7 = K.p(e0Var);
        this.f74c = p7;
        String str3 = (String) p7.get(0);
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // A1.i, H0.G
    public final void c(E e7) {
        char c8;
        Integer num;
        int i7;
        byte b5;
        Long valueOf;
        byte b7;
        Integer num2;
        byte b8 = 10;
        String str = this.f62a;
        str.getClass();
        K k2 = this.f74c;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c8 = 7;
                    break;
                }
                c8 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c8 = '\b';
                    break;
                }
                c8 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c8 = '\t';
                    break;
                }
                c8 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c8 = '\n';
                    break;
                }
                c8 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c8 = 11;
                    break;
                }
                c8 = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c8 = '\f';
                    break;
                }
                c8 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c8 = '\r';
                    break;
                }
                c8 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c8 = 14;
                    break;
                }
                c8 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c8 = 15;
                    break;
                }
                c8 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c8 = 16;
                    break;
                }
                c8 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c8 = 17;
                    break;
                }
                c8 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c8 = 18;
                    break;
                }
                c8 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c8 = 19;
                    break;
                }
                c8 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c8 = 20;
                    break;
                }
                c8 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c8 = 21;
                    break;
                }
                c8 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c8 = 22;
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        try {
            switch (c8) {
                case 0:
                case '\n':
                    e7.f1650c = (CharSequence) k2.get(0);
                    return;
                case 1:
                case 11:
                    e7.f1664s = (CharSequence) k2.get(0);
                    return;
                case 2:
                case '\r':
                    String str2 = (String) k2.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    e7.d(Integer.valueOf(parseInt));
                    e7.c(Integer.valueOf(parseInt2));
                    return;
                case 3:
                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    e7.f1649b = (CharSequence) k2.get(0);
                    return;
                case 4:
                case 19:
                    e7.f1651d = (CharSequence) k2.get(0);
                    return;
                case 5:
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    e7.f1665t = (CharSequence) k2.get(0);
                    return;
                case 6:
                case 21:
                    String[] W7 = x.W((String) k2.get(0), "/");
                    int parseInt3 = Integer.parseInt(W7[0]);
                    if (W7.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(W7[1]));
                    } else {
                        num = null;
                    }
                    e7.f1654h = Integer.valueOf(parseInt3);
                    e7.f1655i = num;
                    return;
                case 7:
                case 17:
                    e7.f1648a = (CharSequence) k2.get(0);
                    return;
                case '\b':
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    e7.f1663r = (CharSequence) k2.get(0);
                    return;
                case '\t':
                case 22:
                    e7.e(Integer.valueOf(Integer.parseInt((String) k2.get(0))));
                    return;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    String str3 = (String) k2.get(0);
                    str3.getClass();
                    if (!str3.isEmpty()) {
                        if (str3.charAt(0) == '-') {
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        if (i7 != str3.length()) {
                            int i8 = i7 + 1;
                            char charAt = str3.charAt(i7);
                            if (charAt < 128) {
                                b5 = D3.c.f863a[charAt];
                            } else {
                                byte[] bArr = D3.c.f863a;
                                b5 = -1;
                            }
                            if (b5 >= 0 && b5 < 10) {
                                long j = -b5;
                                long j8 = 10;
                                long j9 = Long.MIN_VALUE / j8;
                                while (true) {
                                    if (i8 < str3.length()) {
                                        int i9 = i8 + 1;
                                        char charAt2 = str3.charAt(i8);
                                        if (charAt2 < 128) {
                                            b7 = D3.c.f863a[charAt2];
                                        } else {
                                            byte[] bArr2 = D3.c.f863a;
                                            b7 = -1;
                                        }
                                        if (b7 >= 0 && b7 < b8 && j >= j9) {
                                            long j10 = j * j8;
                                            long j11 = b7;
                                            if (j10 >= j11 - Long.MIN_VALUE) {
                                                j = j10 - j11;
                                                i8 = i9;
                                                b8 = 10;
                                            }
                                        }
                                    } else if (i7 != 0) {
                                        valueOf = Long.valueOf(j);
                                    } else if (j != Long.MIN_VALUE) {
                                        valueOf = Long.valueOf(-j);
                                    }
                                }
                            }
                        }
                    }
                    valueOf = null;
                    if (valueOf != null && valueOf.longValue() == valueOf.intValue()) {
                        num2 = Integer.valueOf(valueOf.intValue());
                    } else {
                        num2 = null;
                    }
                    if (num2 == null) {
                        e7.b((CharSequence) k2.get(0));
                        return;
                    }
                    String a7 = j.a(num2.intValue());
                    if (a7 != null) {
                        e7.b(a7);
                        return;
                    }
                    return;
                case 14:
                    ArrayList a8 = a((String) k2.get(0));
                    int size = a8.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                e7.c((Integer) a8.get(2));
                            } else {
                                return;
                            }
                        }
                        e7.d((Integer) a8.get(1));
                    }
                    e7.e((Integer) a8.get(0));
                    return;
                case 15:
                    ArrayList a9 = a((String) k2.get(0));
                    int size2 = a9.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                e7.f1662q = (Integer) a9.get(2);
                            } else {
                                return;
                            }
                        }
                        e7.f1661p = (Integer) a9.get(1);
                    }
                    e7.f1660o = (Integer) a9.get(0);
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (x.a(this.f62a, nVar.f62a) && x.a(this.f73b, nVar.f73b) && this.f74c.equals(nVar.f74c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (this.f62a.hashCode() + 527) * 31;
        String str = this.f73b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return this.f74c.hashCode() + ((hashCode + i7) * 31);
    }

    @Override // A1.i
    public final String toString() {
        return this.f62a + ": description=" + this.f73b + ": values=" + this.f74c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f62a);
        parcel.writeString(this.f73b);
        parcel.writeStringArray((String[]) this.f74c.toArray(new String[0]));
    }
}
