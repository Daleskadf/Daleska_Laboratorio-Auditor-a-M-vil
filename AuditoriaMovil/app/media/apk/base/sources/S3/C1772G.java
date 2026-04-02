package s3;

import A3.K;
import H0.C0134n;
import H0.C0135o;
import H0.H;
import H0.Q;
import H4.e1;
import H4.p1;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import org.apache.tika.utils.XMLReaderUtils;
import y1.C2034b;
/* renamed from: s3.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1772G implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15589a;

    public /* synthetic */ C1772G(int i7) {
        this.f15589a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f15589a) {
            case 0:
                int T7 = j3.f.T(parcel);
                ArrayList arrayList = new ArrayList();
                float f = 0.0f;
                ArrayList arrayList2 = null;
                int i7 = 0;
                int i8 = 0;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                int i9 = 0;
                float f4 = 0.0f;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < T7) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            arrayList3 = j3.f.p(parcel, readInt, LatLng.CREATOR);
                            break;
                        case 3:
                            ClassLoader classLoader = C1772G.class.getClassLoader();
                            int Q7 = j3.f.Q(readInt, parcel);
                            int dataPosition = parcel.dataPosition();
                            if (Q7 != 0) {
                                parcel.readList(arrayList, classLoader);
                                parcel.setDataPosition(dataPosition + Q7);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            f = j3.f.J(readInt, parcel);
                            break;
                        case 5:
                            i7 = j3.f.M(readInt, parcel);
                            break;
                        case 6:
                            i8 = j3.f.M(readInt, parcel);
                            break;
                        case 7:
                            f4 = j3.f.J(readInt, parcel);
                            break;
                        case '\b':
                            z7 = j3.f.F(readInt, parcel);
                            break;
                        case '\t':
                            z8 = j3.f.F(readInt, parcel);
                            break;
                        case '\n':
                            z9 = j3.f.F(readInt, parcel);
                            break;
                        case 11:
                            i9 = j3.f.M(readInt, parcel);
                            break;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            arrayList2 = j3.f.p(parcel, readInt, C1788p.CREATOR);
                            break;
                        default:
                            j3.f.S(readInt, parcel);
                            break;
                    }
                }
                j3.f.s(T7, parcel);
                return new t(arrayList3, arrayList, f, i7, i8, f4, z7, z8, z9, i9, arrayList2);
            case 1:
                return new A1.a(parcel);
            case 2:
                return new A1.b(parcel);
            case 3:
                return new A1.c(parcel);
            case 4:
                return new A1.d(parcel);
            case 5:
                return new A1.e(parcel);
            case 6:
                return new A1.f(parcel);
            case 7:
                return new A1.k(parcel);
            case 8:
                return new A1.l(parcel);
            case 9:
                return new A1.m(parcel);
            case 10:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new A1.n(readString, readString2, K.q(createStringArray));
            case 11:
                return new A1.o(parcel);
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return new B1.a(parcel);
            case 13:
                ArrayList arrayList4 = new ArrayList();
                parcel.readList(arrayList4, B1.b.class.getClassLoader());
                return new B1.c(arrayList4);
            case 14:
                return new B1.b(parcel.readInt(), parcel.readLong(), parcel.readLong());
            case 15:
                return new B1.d(parcel);
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                return new C1.a(parcel);
            case 17:
                return new C1.e(parcel);
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new Object();
            case 19:
                return new C1.i(parcel);
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new C1.j(parcel.readLong(), parcel.readLong());
            case 21:
                return new C2034b(parcel);
            case 22:
                return new C0135o(parcel);
            case 23:
                return new C0134n(parcel);
            case 24:
                return new H(parcel);
            case 25:
                return new Q(parcel);
            case 26:
                return new L0.a(parcel);
            case 27:
                return new L0.b(parcel);
            case 28:
                return new L0.c(parcel);
            default:
                int T8 = j3.f.T(parcel);
                String str = null;
                String str2 = null;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                long j = 0;
                while (parcel.dataPosition() < T8) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i10 = j3.f.M(readInt2, parcel);
                            break;
                        case 2:
                            j = j3.f.O(readInt2, parcel);
                            break;
                        case 3:
                            str = j3.f.l(readInt2, parcel);
                            break;
                        case 4:
                            i11 = j3.f.M(readInt2, parcel);
                            break;
                        case 5:
                            i12 = j3.f.M(readInt2, parcel);
                            break;
                        case 6:
                            str2 = j3.f.l(readInt2, parcel);
                            break;
                        default:
                            j3.f.S(readInt2, parcel);
                            break;
                    }
                }
                j3.f.s(T8, parcel);
                return new N2.a(i10, j, str, i11, i12, str2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f15589a) {
            case 0:
                return new t[i7];
            case 1:
                return new A1.a[i7];
            case 2:
                return new A1.b[i7];
            case 3:
                return new A1.c[i7];
            case 4:
                return new A1.d[i7];
            case 5:
                return new A1.e[i7];
            case 6:
                return new A1.f[i7];
            case 7:
                return new A1.k[i7];
            case 8:
                return new A1.l[i7];
            case 9:
                return new A1.m[i7];
            case 10:
                return new A1.n[i7];
            case 11:
                return new A1.o[i7];
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return new B1.a[i7];
            case 13:
                return new B1.c[i7];
            case 14:
                return new B1.b[i7];
            case 15:
                return new B1.d[i7];
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                return new C1.a[i7];
            case 17:
                return new C1.e[i7];
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new C1.f[i7];
            case 19:
                return new C1.i[i7];
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new C1.j[i7];
            case 21:
                return new D1.a[i7];
            case 22:
                return new C0135o[i7];
            case 23:
                return new C0134n[i7];
            case 24:
                return new H[i7];
            case 25:
                return new Q[i7];
            case 26:
                return new L0.a[i7];
            case 27:
                return new L0.b[i7];
            case 28:
                return new L0.c[i7];
            default:
                return new N2.a[i7];
        }
    }
}
