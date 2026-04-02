package o1;

import A3.AbstractC0021t;
import A3.E;
import A3.K;
import A3.e0;
import D.AbstractC0059i;
import H0.C0137q;
import H0.I;
import H0.r;
import K0.q;
import K0.x;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class f implements InterfaceC1548a {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f14550a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14551b;

    public f(int i7, e0 e0Var) {
        this.f14551b = i7;
        this.f14550a = e0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i7, q qVar) {
        String str;
        int i8;
        String str2;
        InterfaceC1548a cVar;
        int i9;
        int i10 = 4;
        AbstractC0021t.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i11 = qVar.f2515c;
        int i12 = 0;
        int i13 = -2;
        int i14 = 0;
        while (qVar.a() > 8) {
            int j = qVar.j();
            int j8 = qVar.f2514b + qVar.j();
            qVar.F(j8);
            if (j == 1414744396) {
                cVar = b(qVar.j(), qVar);
            } else {
                g gVar = null;
                switch (j) {
                    case 1718776947:
                        if (i13 == 2) {
                            qVar.H(i10);
                            int j9 = qVar.j();
                            int j10 = qVar.j();
                            qVar.H(i10);
                            int j11 = qVar.j();
                            switch (j11) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                AbstractC0059i.J("Ignoring track with unsupported compression ", j11, "StreamFormatChunk");
                            } else {
                                C0137q c0137q = new C0137q();
                                c0137q.f1856r = j9;
                                c0137q.f1857s = j10;
                                c0137q.g(str2);
                                gVar = new g(new r(c0137q));
                            }
                        } else if (i13 == 1) {
                            int n7 = qVar.n();
                            if (n7 == 1) {
                                str = "audio/raw";
                            } else if (n7 != 85) {
                                if (n7 == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (n7 != 8192) {
                                    if (n7 != 8193) {
                                        str = null;
                                    } else {
                                        str = "audio/vnd.dts";
                                    }
                                } else {
                                    str = "audio/ac3";
                                }
                            } else {
                                str = "audio/mpeg";
                            }
                            if (str == null) {
                                AbstractC0059i.J("Ignoring track with unsupported format tag ", n7, "StreamFormatChunk");
                            } else {
                                int n8 = qVar.n();
                                int j12 = qVar.j();
                                qVar.H(6);
                                int A7 = x.A(qVar.n());
                                if (qVar.a() > 0) {
                                    i8 = qVar.n();
                                } else {
                                    i8 = i12;
                                }
                                byte[] bArr = new byte[i8];
                                qVar.f(bArr, i12, i8);
                                C0137q c0137q2 = new C0137q();
                                c0137q2.f1850l = I.l(str);
                                c0137q2.f1864z = n8;
                                c0137q2.f1832A = j12;
                                if ("audio/raw".equals(str) && A7 != 0) {
                                    c0137q2.f1833B = A7;
                                }
                                if ("audio/mp4a-latm".equals(str) && i8 > 0) {
                                    c0137q2.f1853o = K.u(bArr);
                                }
                                gVar = new g(new r(c0137q2));
                            }
                        } else {
                            K0.a.A("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + x.F(i13));
                        }
                        cVar = gVar;
                        break;
                    case 1751742049:
                        int j13 = qVar.j();
                        qVar.H(8);
                        int j14 = qVar.j();
                        int j15 = qVar.j();
                        qVar.H(i10);
                        qVar.j();
                        qVar.H(12);
                        cVar = new c(j13, j14, j15);
                        break;
                    case 1752331379:
                        int j16 = qVar.j();
                        qVar.H(12);
                        qVar.j();
                        int j17 = qVar.j();
                        int j18 = qVar.j();
                        qVar.H(i10);
                        int j19 = qVar.j();
                        int j20 = qVar.j();
                        qVar.H(8);
                        cVar = new d(j16, j17, j18, j19, j20);
                        break;
                    case 1852994675:
                        cVar = new h(qVar.s(qVar.a(), z3.h.f16886c));
                        break;
                    default:
                        cVar = gVar;
                        break;
                }
            }
            if (cVar != null) {
                if (cVar.getType() == 1752331379) {
                    int i15 = ((d) cVar).f14535a;
                    if (i15 != 1935960438) {
                        if (i15 != 1935963489) {
                            if (i15 != 1937012852) {
                                K0.a.A("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i15));
                                i9 = -1;
                            } else {
                                i9 = 3;
                            }
                            i13 = i9;
                        } else {
                            i13 = 1;
                        }
                    } else {
                        i13 = 2;
                    }
                }
                int i16 = i14 + 1;
                if (objArr.length < i16) {
                    objArr = Arrays.copyOf(objArr, E.e(objArr.length, i16));
                }
                objArr[i14] = cVar;
                i14 = i16;
            }
            qVar.G(j8);
            qVar.F(i11);
            i10 = 4;
            i12 = 0;
        }
        return new f(i7, K.n(i14, objArr));
    }

    public final InterfaceC1548a a(Class cls) {
        A3.I listIterator = this.f14550a.listIterator(0);
        while (listIterator.hasNext()) {
            InterfaceC1548a interfaceC1548a = (InterfaceC1548a) listIterator.next();
            if (interfaceC1548a.getClass() == cls) {
                return interfaceC1548a;
            }
        }
        return null;
    }

    @Override // o1.InterfaceC1548a
    public final int getType() {
        return this.f14551b;
    }
}
