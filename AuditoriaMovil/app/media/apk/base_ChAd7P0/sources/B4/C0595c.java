package b4;

import H4.e1;
import a4.C0448A;
import a4.C0451D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzagw;
import java.util.ArrayList;
/* renamed from: b4.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0595c implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8237a;

    public /* synthetic */ C0595c(int i7) {
        this.f8237a = i7;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [b4.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [b4.k, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z7;
        switch (this.f8237a) {
            case 0:
                int T7 = j3.f.T(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                boolean z8 = false;
                while (parcel.dataPosition() < T7) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            str = j3.f.l(readInt, parcel);
                            break;
                        case 2:
                            str2 = j3.f.l(readInt, parcel);
                            break;
                        case 3:
                            str5 = j3.f.l(readInt, parcel);
                            break;
                        case 4:
                            str4 = j3.f.l(readInt, parcel);
                            break;
                        case 5:
                            str3 = j3.f.l(readInt, parcel);
                            break;
                        case 6:
                            str6 = j3.f.l(readInt, parcel);
                            break;
                        case 7:
                            z8 = j3.f.F(readInt, parcel);
                            break;
                        case '\b':
                            str7 = j3.f.l(readInt, parcel);
                            break;
                        default:
                            j3.f.S(readInt, parcel);
                            break;
                    }
                }
                j3.f.s(T7, parcel);
                return new C0596d(str, str2, str3, str4, str5, str6, z8, str7);
            case 1:
                int T8 = j3.f.T(parcel);
                z zVar = null;
                ArrayList arrayList = null;
                zzagw zzagwVar = null;
                C0596d c0596d = null;
                String str8 = null;
                String str9 = null;
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                String str10 = null;
                Boolean bool = null;
                C0600h c0600h = null;
                boolean z9 = false;
                a4.K k2 = null;
                while (parcel.dataPosition() < T8) {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList4 = arrayList;
                    switch ((char) readInt2) {
                        case 1:
                            zzagwVar = (zzagw) j3.f.k(parcel, readInt2, zzagw.CREATOR);
                            break;
                        case 2:
                            c0596d = (C0596d) j3.f.k(parcel, readInt2, C0596d.CREATOR);
                            break;
                        case 3:
                            str8 = j3.f.l(readInt2, parcel);
                            break;
                        case 4:
                            str9 = j3.f.l(readInt2, parcel);
                            break;
                        case 5:
                            arrayList2 = j3.f.p(parcel, readInt2, C0596d.CREATOR);
                            break;
                        case 6:
                            arrayList3 = j3.f.n(readInt2, parcel);
                            break;
                        case 7:
                            str10 = j3.f.l(readInt2, parcel);
                            break;
                        case '\b':
                            int Q7 = j3.f.Q(readInt2, parcel);
                            if (Q7 == 0) {
                                bool = null;
                                break;
                            } else {
                                j3.f.g0(parcel, Q7, 4);
                                if (parcel.readInt() != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                bool = Boolean.valueOf(z7);
                                break;
                            }
                        case '\t':
                            c0600h = (C0600h) j3.f.k(parcel, readInt2, C0600h.CREATOR);
                            break;
                        case '\n':
                            z9 = j3.f.F(readInt2, parcel);
                            break;
                        case 11:
                            k2 = (a4.K) j3.f.k(parcel, readInt2, a4.K.CREATOR);
                            break;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            zVar = (z) j3.f.k(parcel, readInt2, z.CREATOR);
                            break;
                        case '\r':
                            arrayList = j3.f.p(parcel, readInt2, a4.J.CREATOR);
                            continue;
                        default:
                            j3.f.S(readInt2, parcel);
                            break;
                    }
                    arrayList = arrayList4;
                }
                j3.f.s(T8, parcel);
                ?? obj = new Object();
                obj.f8253a = zzagwVar;
                obj.f8254b = c0596d;
                obj.f8255c = str8;
                obj.f8256d = str9;
                obj.f8257e = arrayList2;
                obj.f = arrayList3;
                obj.f8250X = str10;
                obj.f8251Y = bool;
                obj.f8252Z = c0600h;
                obj.f8258e0 = z9;
                obj.f8259f0 = k2;
                obj.f8260g0 = zVar;
                obj.f8261h0 = arrayList;
                return obj;
            case 2:
                int T9 = j3.f.T(parcel);
                long j = 0;
                long j8 = 0;
                while (parcel.dataPosition() < T9) {
                    int readInt3 = parcel.readInt();
                    char c8 = (char) readInt3;
                    if (c8 != 1) {
                        if (c8 != 2) {
                            j3.f.S(readInt3, parcel);
                        } else {
                            j8 = j3.f.O(readInt3, parcel);
                        }
                    } else {
                        j = j3.f.O(readInt3, parcel);
                    }
                }
                j3.f.s(T9, parcel);
                return new C0600h(j, j8);
            case 3:
                int T10 = j3.f.T(parcel);
                ArrayList arrayList5 = null;
                C0603k c0603k = null;
                String str11 = null;
                a4.K k8 = null;
                C0599g c0599g = null;
                ArrayList arrayList6 = null;
                while (parcel.dataPosition() < T10) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            arrayList5 = j3.f.p(parcel, readInt4, C0448A.CREATOR);
                            break;
                        case 2:
                            c0603k = (C0603k) j3.f.k(parcel, readInt4, C0603k.CREATOR);
                            break;
                        case 3:
                            str11 = j3.f.l(readInt4, parcel);
                            break;
                        case 4:
                            k8 = (a4.K) j3.f.k(parcel, readInt4, a4.K.CREATOR);
                            break;
                        case 5:
                            c0599g = (C0599g) j3.f.k(parcel, readInt4, C0599g.CREATOR);
                            break;
                        case 6:
                            arrayList6 = j3.f.p(parcel, readInt4, C0451D.CREATOR);
                            break;
                        default:
                            j3.f.S(readInt4, parcel);
                            break;
                    }
                }
                j3.f.s(T10, parcel);
                return new C0602j(arrayList5, c0603k, str11, k8, c0599g, arrayList6);
            case 4:
                int T11 = j3.f.T(parcel);
                String str12 = null;
                String str13 = null;
                ArrayList arrayList7 = null;
                ArrayList arrayList8 = null;
                C0599g c0599g2 = null;
                while (parcel.dataPosition() < T11) {
                    int readInt5 = parcel.readInt();
                    char c9 = (char) readInt5;
                    if (c9 != 1) {
                        if (c9 != 2) {
                            if (c9 != 3) {
                                if (c9 != 4) {
                                    if (c9 != 5) {
                                        j3.f.S(readInt5, parcel);
                                    } else {
                                        c0599g2 = (C0599g) j3.f.k(parcel, readInt5, C0599g.CREATOR);
                                    }
                                } else {
                                    arrayList8 = j3.f.p(parcel, readInt5, C0451D.CREATOR);
                                }
                            } else {
                                arrayList7 = j3.f.p(parcel, readInt5, C0448A.CREATOR);
                            }
                        } else {
                            str13 = j3.f.l(readInt5, parcel);
                        }
                    } else {
                        str12 = j3.f.l(readInt5, parcel);
                    }
                }
                j3.f.s(T11, parcel);
                ?? obj2 = new Object();
                obj2.f8270a = str12;
                obj2.f8271b = str13;
                obj2.f8272c = arrayList7;
                obj2.f8273d = arrayList8;
                obj2.f8274e = c0599g2;
                return obj2;
            case 5:
                int T12 = j3.f.T(parcel);
                ArrayList arrayList9 = null;
                ArrayList arrayList10 = null;
                while (parcel.dataPosition() < T12) {
                    int readInt6 = parcel.readInt();
                    char c10 = (char) readInt6;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            j3.f.S(readInt6, parcel);
                        } else {
                            arrayList10 = j3.f.p(parcel, readInt6, C0451D.CREATOR);
                        }
                    } else {
                        arrayList9 = j3.f.p(parcel, readInt6, C0448A.CREATOR);
                    }
                }
                j3.f.s(T12, parcel);
                return new z(arrayList9, arrayList10);
            case 6:
                int T13 = j3.f.T(parcel);
                String str14 = null;
                boolean z10 = false;
                String str15 = null;
                while (parcel.dataPosition() < T13) {
                    int readInt7 = parcel.readInt();
                    char c11 = (char) readInt7;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                j3.f.S(readInt7, parcel);
                            } else {
                                z10 = j3.f.F(readInt7, parcel);
                            }
                        } else {
                            str15 = j3.f.l(readInt7, parcel);
                        }
                    } else {
                        str14 = j3.f.l(readInt7, parcel);
                    }
                }
                j3.f.s(T13, parcel);
                return new V(str14, str15, z10);
            default:
                int T14 = j3.f.T(parcel);
                C0599g c0599g3 = null;
                V v6 = null;
                a4.K k9 = null;
                while (parcel.dataPosition() < T14) {
                    int readInt8 = parcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                j3.f.S(readInt8, parcel);
                            } else {
                                k9 = (a4.K) j3.f.k(parcel, readInt8, a4.K.CREATOR);
                            }
                        } else {
                            v6 = (V) j3.f.k(parcel, readInt8, V.CREATOR);
                        }
                    } else {
                        c0599g3 = (C0599g) j3.f.k(parcel, readInt8, C0599g.CREATOR);
                    }
                }
                j3.f.s(T14, parcel);
                return new W(c0599g3, v6, k9);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f8237a) {
            case 0:
                return new C0596d[i7];
            case 1:
                return new C0599g[i7];
            case 2:
                return new C0600h[i7];
            case 3:
                return new C0602j[i7];
            case 4:
                return new C0603k[i7];
            case 5:
                return new z[i7];
            case 6:
                return new V[i7];
            default:
                return new W[i7];
        }
    }
}
