package K1;

import D.AbstractC0059i;
import H4.e1;
import K0.p;
import K0.q;
import android.text.SpannableStringBuilder;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: h  reason: collision with root package name */
    public final q f2611h = new q();

    /* renamed from: i  reason: collision with root package name */
    public final p f2612i = new p();
    public int j = -1;

    /* renamed from: k  reason: collision with root package name */
    public final int f2613k;

    /* renamed from: l  reason: collision with root package name */
    public final f[] f2614l;

    /* renamed from: m  reason: collision with root package name */
    public f f2615m;

    /* renamed from: n  reason: collision with root package name */
    public List f2616n;

    /* renamed from: o  reason: collision with root package name */
    public List f2617o;

    /* renamed from: p  reason: collision with root package name */
    public p f2618p;

    /* renamed from: q  reason: collision with root package name */
    public int f2619q;

    public g(int i7, List list) {
        this.f2613k = i7 == -1 ? 1 : i7;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b5 = ((byte[]) list.get(0))[0];
        }
        this.f2614l = new f[8];
        for (int i8 = 0; i8 < 8; i8++) {
            this.f2614l[i8] = new f();
        }
        this.f2615m = this.f2614l[0];
    }

    @Override // K1.i
    public final A.c f() {
        List list = this.f2616n;
        this.f2617o = list;
        list.getClass();
        return new A.c(list, 8);
    }

    @Override // K1.i, N0.c
    public final void flush() {
        super.flush();
        this.f2616n = null;
        this.f2617o = null;
        this.f2619q = 0;
        this.f2615m = this.f2614l[0];
        l();
        this.f2618p = null;
    }

    @Override // K1.i
    public final void g(h hVar) {
        boolean z7;
        ByteBuffer byteBuffer = hVar.f3350e;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        q qVar = this.f2611h;
        qVar.E(array, limit);
        while (qVar.a() >= 3) {
            int u7 = qVar.u();
            int i7 = u7 & 3;
            boolean z8 = false;
            if ((u7 & 4) == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            byte u8 = (byte) qVar.u();
            byte u9 = (byte) qVar.u();
            if (i7 == 2 || i7 == 3) {
                if (z7) {
                    if (i7 == 3) {
                        j();
                        int i8 = (u8 & 192) >> 6;
                        int i9 = this.j;
                        if (i9 != -1 && i8 != (i9 + 1) % 4) {
                            l();
                            K0.a.A("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i8);
                        }
                        this.j = i8;
                        int i10 = u8 & 63;
                        if (i10 == 0) {
                            i10 = 64;
                        }
                        p pVar = new p(i8, i10);
                        this.f2618p = pVar;
                        pVar.f2510e = 1;
                        pVar.f2509d[0] = u9;
                    } else {
                        if (i7 == 2) {
                            z8 = true;
                        }
                        K0.a.e(z8);
                        p pVar2 = this.f2618p;
                        if (pVar2 == null) {
                            K0.a.n("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = pVar2.f2509d;
                            int i11 = pVar2.f2510e;
                            int i12 = i11 + 1;
                            pVar2.f2510e = i12;
                            bArr[i11] = u8;
                            pVar2.f2510e = i11 + 2;
                            bArr[i12] = u9;
                        }
                    }
                    p pVar3 = this.f2618p;
                    if (pVar3.f2510e == (pVar3.f2508c * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // K1.i
    public final boolean i() {
        if (this.f2616n != this.f2617o) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j() {
        int i7;
        int i8;
        boolean z7;
        char c8;
        int i9;
        f fVar;
        p pVar = this.f2618p;
        if (pVar == null) {
            return;
        }
        int i10 = 2;
        if (pVar.f2510e != (pVar.f2508c * 2) - 1) {
            K0.a.m("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f2618p.f2508c * 2) - 1) + ", but current index is " + this.f2618p.f2510e + " (sequence number " + this.f2618p.f2507b + ");");
        }
        p pVar2 = this.f2618p;
        byte[] bArr = pVar2.f2509d;
        int i11 = pVar2.f2510e;
        p pVar3 = this.f2612i;
        pVar3.p(bArr, i11);
        boolean z8 = false;
        while (true) {
            if (pVar3.b() > 0) {
                int i12 = 3;
                int i13 = pVar3.i(3);
                int i14 = pVar3.i(5);
                if (i13 == 7) {
                    pVar3.t(i10);
                    i13 = pVar3.i(6);
                    if (i13 < 7) {
                        AbstractC0059i.J("Invalid extended service number: ", i13, "Cea708Decoder");
                    }
                }
                if (i14 == 0) {
                    if (i13 != 0) {
                        K0.a.A("Cea708Decoder", "serviceNumber is non-zero (" + i13 + ") when blockSize is 0");
                    }
                } else if (i13 != this.f2613k) {
                    pVar3.u(i14);
                } else {
                    int g3 = (i14 * 8) + pVar3.g();
                    while (pVar3.g() < g3) {
                        int i15 = pVar3.i(8);
                        if (i15 != 16) {
                            if (i15 <= 31) {
                                if (i15 != 0) {
                                    if (i15 != i12) {
                                        if (i15 != 8) {
                                            switch (i15) {
                                                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                                                    l();
                                                    break;
                                                case 13:
                                                    this.f2615m.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (i15 >= 17 && i15 <= 23) {
                                                        K0.a.A("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i15);
                                                        pVar3.t(8);
                                                        break;
                                                    } else if (i15 >= 24 && i15 <= 31) {
                                                        K0.a.A("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i15);
                                                        pVar3.t(16);
                                                        break;
                                                    } else {
                                                        AbstractC0059i.J("Invalid C0 command: ", i15, "Cea708Decoder");
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f2615m.f2593b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f2616n = k();
                                    }
                                }
                                i9 = i10;
                                i7 = i12;
                                i8 = g3;
                            } else if (i15 <= 127) {
                                if (i15 == 127) {
                                    this.f2615m.a((char) 9835);
                                } else {
                                    this.f2615m.a((char) (i15 & 255));
                                }
                                i9 = i10;
                                i7 = i12;
                                i8 = g3;
                                z8 = true;
                            } else {
                                if (i15 <= 159) {
                                    f[] fVarArr = this.f2614l;
                                    switch (i15) {
                                        case RecognitionOptions.ITF /* 128 */:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i7 = i12;
                                            i8 = g3;
                                            z7 = true;
                                            int i16 = i15 - 128;
                                            if (this.f2619q != i16) {
                                                this.f2619q = i16;
                                                this.f2615m = fVarArr[i16];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            i7 = i12;
                                            i8 = g3;
                                            z7 = true;
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (pVar3.h()) {
                                                    f fVar2 = fVarArr[8 - i17];
                                                    fVar2.f2592a.clear();
                                                    fVar2.f2593b.clear();
                                                    fVar2.f2604o = -1;
                                                    fVar2.f2605p = -1;
                                                    fVar2.f2606q = -1;
                                                    fVar2.f2608s = -1;
                                                    fVar2.f2610u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i7 = i12;
                                            i8 = g3;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (pVar3.h()) {
                                                    fVarArr[8 - i18].f2595d = true;
                                                }
                                            }
                                            z7 = true;
                                            break;
                                        case 138:
                                            i7 = i12;
                                            i8 = g3;
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (pVar3.h()) {
                                                    fVarArr[8 - i19].f2595d = false;
                                                }
                                            }
                                            z7 = true;
                                            break;
                                        case 139:
                                            i7 = i12;
                                            i8 = g3;
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (pVar3.h()) {
                                                    fVarArr[8 - i20].f2595d = !fVar.f2595d;
                                                }
                                            }
                                            z7 = true;
                                            break;
                                        case 140:
                                            i7 = i12;
                                            i8 = g3;
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (pVar3.h()) {
                                                    fVarArr[8 - i21].d();
                                                }
                                            }
                                            z7 = true;
                                            break;
                                        case 141:
                                            i7 = i12;
                                            i8 = g3;
                                            pVar3.t(8);
                                            z7 = true;
                                            break;
                                        case 142:
                                            i7 = i12;
                                            i8 = g3;
                                            z7 = true;
                                            break;
                                        case 143:
                                            i7 = i12;
                                            i8 = g3;
                                            l();
                                            z7 = true;
                                            break;
                                        case 144:
                                            i8 = g3;
                                            if (!this.f2615m.f2594c) {
                                                pVar3.t(16);
                                                i7 = 3;
                                                z7 = true;
                                                break;
                                            } else {
                                                pVar3.i(4);
                                                pVar3.i(2);
                                                pVar3.i(2);
                                                boolean h8 = pVar3.h();
                                                boolean h9 = pVar3.h();
                                                i7 = 3;
                                                pVar3.i(3);
                                                pVar3.i(3);
                                                this.f2615m.e(h8, h9);
                                                z7 = true;
                                            }
                                        case 145:
                                            i8 = g3;
                                            if (!this.f2615m.f2594c) {
                                                pVar3.t(24);
                                            } else {
                                                int c9 = f.c(pVar3.i(2), pVar3.i(2), pVar3.i(2), pVar3.i(2));
                                                int c10 = f.c(pVar3.i(2), pVar3.i(2), pVar3.i(2), pVar3.i(2));
                                                pVar3.t(2);
                                                f.c(pVar3.i(2), pVar3.i(2), pVar3.i(2), 0);
                                                this.f2615m.f(c9, c10);
                                            }
                                            i7 = 3;
                                            z7 = true;
                                            break;
                                        case 146:
                                            i8 = g3;
                                            if (!this.f2615m.f2594c) {
                                                pVar3.t(16);
                                            } else {
                                                pVar3.t(4);
                                                int i22 = pVar3.i(4);
                                                pVar3.t(2);
                                                pVar3.i(6);
                                                f fVar3 = this.f2615m;
                                                if (fVar3.f2610u != i22) {
                                                    fVar3.a('\n');
                                                }
                                                fVar3.f2610u = i22;
                                            }
                                            i7 = 3;
                                            z7 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            AbstractC0059i.J("Invalid C1 command: ", i15, "Cea708Decoder");
                                            i7 = i12;
                                            i8 = g3;
                                            z7 = true;
                                            break;
                                        case 151:
                                            i8 = g3;
                                            if (!this.f2615m.f2594c) {
                                                pVar3.t(32);
                                            } else {
                                                int c11 = f.c(pVar3.i(2), pVar3.i(2), pVar3.i(2), pVar3.i(2));
                                                pVar3.i(2);
                                                f.c(pVar3.i(2), pVar3.i(2), pVar3.i(2), 0);
                                                pVar3.h();
                                                pVar3.h();
                                                pVar3.i(2);
                                                pVar3.i(2);
                                                int i23 = pVar3.i(2);
                                                pVar3.t(8);
                                                f fVar4 = this.f2615m;
                                                fVar4.f2603n = c11;
                                                fVar4.f2600k = i23;
                                            }
                                            i7 = 3;
                                            z7 = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i24 = i15 - 152;
                                            f fVar5 = fVarArr[i24];
                                            pVar3.t(i10);
                                            boolean h10 = pVar3.h();
                                            pVar3.t(i10);
                                            int i25 = pVar3.i(i12);
                                            boolean h11 = pVar3.h();
                                            int i26 = pVar3.i(7);
                                            int i27 = pVar3.i(8);
                                            int i28 = pVar3.i(4);
                                            int i29 = pVar3.i(4);
                                            pVar3.t(i10);
                                            pVar3.t(6);
                                            pVar3.t(i10);
                                            int i30 = pVar3.i(3);
                                            i8 = g3;
                                            int i31 = pVar3.i(3);
                                            fVar5.f2594c = true;
                                            fVar5.f2595d = h10;
                                            fVar5.f2596e = i25;
                                            fVar5.f = h11;
                                            fVar5.f2597g = i26;
                                            fVar5.f2598h = i27;
                                            fVar5.f2599i = i28;
                                            int i32 = i29 + 1;
                                            if (fVar5.j != i32) {
                                                fVar5.j = i32;
                                                while (true) {
                                                    ArrayList arrayList = fVar5.f2592a;
                                                    if (arrayList.size() >= fVar5.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i30 != 0 && fVar5.f2601l != i30) {
                                                fVar5.f2601l = i30;
                                                int i33 = i30 - 1;
                                                int i34 = f.f2583B[i33];
                                                boolean z9 = f.f2582A[i33];
                                                int i35 = f.f2590y[i33];
                                                int i36 = f.f2591z[i33];
                                                int i37 = f.f2589x[i33];
                                                fVar5.f2603n = i34;
                                                fVar5.f2600k = i37;
                                            }
                                            if (i31 != 0 && fVar5.f2602m != i31) {
                                                fVar5.f2602m = i31;
                                                int i38 = i31 - 1;
                                                int i39 = f.f2585D[i38];
                                                int i40 = f.f2584C[i38];
                                                fVar5.e(false, false);
                                                fVar5.f(f.f2587v, f.f2586E[i38]);
                                            }
                                            if (this.f2619q != i24) {
                                                this.f2619q = i24;
                                                this.f2615m = fVarArr[i24];
                                            }
                                            i7 = 3;
                                            z7 = true;
                                            break;
                                    }
                                } else {
                                    i7 = i12;
                                    i8 = g3;
                                    z7 = true;
                                    if (i15 <= 255) {
                                        this.f2615m.a((char) (i15 & 255));
                                    } else {
                                        AbstractC0059i.J("Invalid base command: ", i15, "Cea708Decoder");
                                        i9 = 2;
                                        c8 = 7;
                                    }
                                }
                                z8 = z7;
                                i9 = 2;
                                c8 = 7;
                            }
                            z7 = true;
                            c8 = 7;
                        } else {
                            i7 = i12;
                            i8 = g3;
                            z7 = true;
                            int i41 = pVar3.i(8);
                            if (i41 <= 31) {
                                c8 = 7;
                                if (i41 > 7) {
                                    if (i41 <= 15) {
                                        pVar3.t(8);
                                    } else if (i41 <= 23) {
                                        pVar3.t(16);
                                    } else if (i41 <= 31) {
                                        pVar3.t(24);
                                    }
                                }
                            } else {
                                c8 = 7;
                                if (i41 <= 127) {
                                    if (i41 != 32) {
                                        if (i41 != 33) {
                                            if (i41 != 37) {
                                                if (i41 != 42) {
                                                    if (i41 != 44) {
                                                        if (i41 != 63) {
                                                            if (i41 != 57) {
                                                                if (i41 != 58) {
                                                                    if (i41 != 60) {
                                                                        if (i41 != 61) {
                                                                            switch (i41) {
                                                                                case 48:
                                                                                    this.f2615m.a((char) 9608);
                                                                                    break;
                                                                                case 49:
                                                                                    this.f2615m.a((char) 8216);
                                                                                    break;
                                                                                case 50:
                                                                                    this.f2615m.a((char) 8217);
                                                                                    break;
                                                                                case 51:
                                                                                    this.f2615m.a((char) 8220);
                                                                                    break;
                                                                                case 52:
                                                                                    this.f2615m.a((char) 8221);
                                                                                    break;
                                                                                case 53:
                                                                                    this.f2615m.a((char) 8226);
                                                                                    break;
                                                                                default:
                                                                                    switch (i41) {
                                                                                        case 118:
                                                                                            this.f2615m.a((char) 8539);
                                                                                            break;
                                                                                        case 119:
                                                                                            this.f2615m.a((char) 8540);
                                                                                            break;
                                                                                        case 120:
                                                                                            this.f2615m.a((char) 8541);
                                                                                            break;
                                                                                        case 121:
                                                                                            this.f2615m.a((char) 8542);
                                                                                            break;
                                                                                        case 122:
                                                                                            this.f2615m.a((char) 9474);
                                                                                            break;
                                                                                        case 123:
                                                                                            this.f2615m.a((char) 9488);
                                                                                            break;
                                                                                        case 124:
                                                                                            this.f2615m.a((char) 9492);
                                                                                            break;
                                                                                        case 125:
                                                                                            this.f2615m.a((char) 9472);
                                                                                            break;
                                                                                        case 126:
                                                                                            this.f2615m.a((char) 9496);
                                                                                            break;
                                                                                        case 127:
                                                                                            this.f2615m.a((char) 9484);
                                                                                            break;
                                                                                        default:
                                                                                            AbstractC0059i.J("Invalid G2 character: ", i41, "Cea708Decoder");
                                                                                            break;
                                                                                    }
                                                                            }
                                                                        } else {
                                                                            this.f2615m.a((char) 8480);
                                                                        }
                                                                    } else {
                                                                        this.f2615m.a((char) 339);
                                                                    }
                                                                } else {
                                                                    this.f2615m.a((char) 353);
                                                                }
                                                            } else {
                                                                this.f2615m.a((char) 8482);
                                                            }
                                                        } else {
                                                            this.f2615m.a((char) 376);
                                                        }
                                                    } else {
                                                        this.f2615m.a((char) 338);
                                                    }
                                                } else {
                                                    this.f2615m.a((char) 352);
                                                }
                                            } else {
                                                this.f2615m.a((char) 8230);
                                            }
                                        } else {
                                            this.f2615m.a((char) 160);
                                        }
                                    } else {
                                        this.f2615m.a(' ');
                                    }
                                    z8 = true;
                                } else if (i41 <= 159) {
                                    if (i41 <= 135) {
                                        pVar3.t(32);
                                    } else if (i41 <= 143) {
                                        pVar3.t(40);
                                    } else if (i41 <= 159) {
                                        i9 = 2;
                                        pVar3.t(2);
                                        pVar3.t(pVar3.i(6) * 8);
                                    }
                                } else {
                                    i9 = 2;
                                    if (i41 <= 255) {
                                        if (i41 == 160) {
                                            this.f2615m.a((char) 13252);
                                        } else {
                                            AbstractC0059i.J("Invalid G3 character: ", i41, "Cea708Decoder");
                                            this.f2615m.a('_');
                                        }
                                        z8 = true;
                                    } else {
                                        AbstractC0059i.J("Invalid extended command: ", i41, "Cea708Decoder");
                                    }
                                }
                            }
                            i9 = 2;
                        }
                        i12 = i7;
                        g3 = i8;
                        i10 = i9;
                    }
                }
            }
        }
        if (z8) {
            this.f2616n = k();
        }
        this.f2618p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.g.k():java.util.List");
    }

    public final void l() {
        for (int i7 = 0; i7 < 8; i7++) {
            this.f2614l[i7].d();
        }
    }
}
