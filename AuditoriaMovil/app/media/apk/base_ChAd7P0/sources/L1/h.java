package L1;

import A3.I;
import A3.K;
import A3.e0;
import D.AbstractC0059i;
import H4.p1;
import J1.k;
import J1.l;
import K0.p;
import K0.q;
import K0.x;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.utils.XMLReaderUtils;
/* loaded from: classes.dex */
public final class h implements l {

    /* renamed from: Y  reason: collision with root package name */
    public static final byte[] f2898Y = {0, 7, 8, 15};

    /* renamed from: Z  reason: collision with root package name */
    public static final byte[] f2899Z = {0, 119, -120, -1};

    /* renamed from: e0  reason: collision with root package name */
    public static final byte[] f2900e0 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: X  reason: collision with root package name */
    public Bitmap f2901X;

    /* renamed from: a  reason: collision with root package name */
    public final Paint f2902a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f2903b;

    /* renamed from: c  reason: collision with root package name */
    public final Canvas f2904c;

    /* renamed from: d  reason: collision with root package name */
    public final b f2905d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2906e;
    public final g f;

    public h(List list) {
        q qVar = new q((byte[]) list.get(0));
        int A7 = qVar.A();
        int A8 = qVar.A();
        Paint paint = new Paint();
        this.f2902a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f2903b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f2904c = new Canvas();
        this.f2905d = new b(719, 575, 0, 719, 0, 575);
        this.f2906e = new a(0, new int[]{0, -1, -16777216, -8421505}, c(), d());
        this.f = new g(A7, A8);
    }

    public static byte[] b(int i7, int i8, p pVar) {
        byte[] bArr = new byte[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            bArr[i9] = (byte) pVar.i(i8);
        }
        return bArr;
    }

    public static int[] c() {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i12 = 1; i12 < 16; i12++) {
            if (i12 < 8) {
                if ((i12 & 1) != 0) {
                    i9 = 255;
                } else {
                    i9 = 0;
                }
                if ((i12 & 2) != 0) {
                    i10 = 255;
                } else {
                    i10 = 0;
                }
                if ((i12 & 4) != 0) {
                    i11 = 255;
                } else {
                    i11 = 0;
                }
                iArr[i12] = e(255, i9, i10, i11);
            } else {
                int i13 = 127;
                if ((i12 & 1) != 0) {
                    i7 = 127;
                } else {
                    i7 = 0;
                }
                if ((i12 & 2) != 0) {
                    i8 = 127;
                } else {
                    i8 = 0;
                }
                if ((i12 & 4) == 0) {
                    i13 = 0;
                }
                iArr[i12] = e(255, i7, i8, i13);
            }
        }
        return iArr;
    }

    public static int[] d() {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int[] iArr = new int[RecognitionOptions.QR_CODE];
        iArr[0] = 0;
        for (int i25 = 0; i25 < 256; i25++) {
            int i26 = 255;
            if (i25 < 8) {
                if ((i25 & 1) != 0) {
                    i23 = 255;
                } else {
                    i23 = 0;
                }
                if ((i25 & 2) != 0) {
                    i24 = 255;
                } else {
                    i24 = 0;
                }
                if ((i25 & 4) == 0) {
                    i26 = 0;
                }
                iArr[i25] = e(63, i23, i24, i26);
            } else {
                int i27 = i25 & 136;
                int i28 = 170;
                int i29 = 85;
                if (i27 != 0) {
                    if (i27 != 8) {
                        int i30 = 43;
                        if (i27 != 128) {
                            if (i27 == 136) {
                                if ((i25 & 1) != 0) {
                                    i19 = 43;
                                } else {
                                    i19 = 0;
                                }
                                if ((i25 & 16) != 0) {
                                    i20 = 85;
                                } else {
                                    i20 = 0;
                                }
                                int i31 = i19 + i20;
                                if ((i25 & 2) != 0) {
                                    i21 = 43;
                                } else {
                                    i21 = 0;
                                }
                                if ((i25 & 32) != 0) {
                                    i22 = 85;
                                } else {
                                    i22 = 0;
                                }
                                int i32 = i21 + i22;
                                if ((i25 & 4) == 0) {
                                    i30 = 0;
                                }
                                if ((i25 & 64) == 0) {
                                    i29 = 0;
                                }
                                iArr[i25] = e(255, i31, i32, i30 + i29);
                            }
                        } else {
                            if ((i25 & 1) != 0) {
                                i15 = 43;
                            } else {
                                i15 = 0;
                            }
                            int i33 = i15 + 127;
                            if ((i25 & 16) != 0) {
                                i16 = 85;
                            } else {
                                i16 = 0;
                            }
                            int i34 = i33 + i16;
                            if ((i25 & 2) != 0) {
                                i17 = 43;
                            } else {
                                i17 = 0;
                            }
                            int i35 = i17 + 127;
                            if ((i25 & 32) != 0) {
                                i18 = 85;
                            } else {
                                i18 = 0;
                            }
                            int i36 = i35 + i18;
                            if ((i25 & 4) == 0) {
                                i30 = 0;
                            }
                            int i37 = i30 + 127;
                            if ((i25 & 64) == 0) {
                                i29 = 0;
                            }
                            iArr[i25] = e(255, i34, i36, i37 + i29);
                        }
                    } else {
                        if ((i25 & 1) != 0) {
                            i11 = 85;
                        } else {
                            i11 = 0;
                        }
                        if ((i25 & 16) != 0) {
                            i12 = 170;
                        } else {
                            i12 = 0;
                        }
                        int i38 = i11 + i12;
                        if ((i25 & 2) != 0) {
                            i13 = 85;
                        } else {
                            i13 = 0;
                        }
                        if ((i25 & 32) != 0) {
                            i14 = 170;
                        } else {
                            i14 = 0;
                        }
                        int i39 = i13 + i14;
                        if ((i25 & 4) == 0) {
                            i29 = 0;
                        }
                        if ((i25 & 64) == 0) {
                            i28 = 0;
                        }
                        iArr[i25] = e(127, i38, i39, i29 + i28);
                    }
                } else {
                    if ((i25 & 1) != 0) {
                        i7 = 85;
                    } else {
                        i7 = 0;
                    }
                    if ((i25 & 16) != 0) {
                        i8 = 170;
                    } else {
                        i8 = 0;
                    }
                    int i40 = i7 + i8;
                    if ((i25 & 2) != 0) {
                        i9 = 85;
                    } else {
                        i9 = 0;
                    }
                    if ((i25 & 32) != 0) {
                        i10 = 170;
                    } else {
                        i10 = 0;
                    }
                    int i41 = i9 + i10;
                    if ((i25 & 4) == 0) {
                        i29 = 0;
                    }
                    if ((i25 & 64) == 0) {
                        i28 = 0;
                    }
                    iArr[i25] = e(255, i40, i41, i29 + i28);
                }
            }
        }
        return iArr;
    }

    public static int e(int i7, int i8, int i9, int i10) {
        return (i7 << 24) | (i8 << 16) | (i9 << 8) | i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0224 A[LOOP:3: B:89:0x0172->B:118:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.h.f(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a h(p pVar, int i7) {
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 8;
        int i14 = pVar.i(8);
        pVar.t(8);
        int i15 = 2;
        int i16 = i7 - 2;
        int i17 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] c8 = c();
        int[] d7 = d();
        while (i16 > 0) {
            int i18 = pVar.i(i13);
            int i19 = pVar.i(i13);
            if ((i19 & RecognitionOptions.ITF) != 0) {
                iArr = iArr2;
            } else if ((i19 & 64) != 0) {
                iArr = c8;
            } else {
                iArr = d7;
            }
            if ((i19 & 1) != 0) {
                i11 = pVar.i(i13);
                i12 = pVar.i(i13);
                i8 = pVar.i(i13);
                i10 = pVar.i(i13);
                i9 = i16 - 6;
            } else {
                int i20 = pVar.i(4) << 4;
                i8 = pVar.i(4) << 4;
                i9 = i16 - 4;
                i10 = pVar.i(i15) << 6;
                i11 = pVar.i(6) << i15;
                i12 = i20;
            }
            if (i11 == 0) {
                i12 = i17;
                i8 = i12;
                i10 = 255;
            }
            double d8 = i11;
            double d9 = i12 - 128;
            double d10 = i8 - 128;
            iArr[i18] = e((byte) (255 - (i10 & 255)), x.j((int) ((1.402d * d9) + d8), 0, 255), x.j((int) ((d8 - (0.34414d * d10)) - (d9 * 0.71414d)), 0, 255), x.j((int) ((d10 * 1.772d) + d8), 0, 255));
            i16 = i9;
            i17 = 0;
            i14 = i14;
            d7 = d7;
            i13 = 8;
            i15 = 2;
        }
        return new a(i14, iArr2, c8, d7);
    }

    public static c i(p pVar) {
        byte[] bArr;
        int i7 = pVar.i(16);
        pVar.t(4);
        int i8 = pVar.i(2);
        boolean h8 = pVar.h();
        pVar.t(1);
        byte[] bArr2 = x.f;
        if (i8 == 1) {
            pVar.t(pVar.i(8) * 16);
        } else if (i8 == 0) {
            int i9 = pVar.i(16);
            int i10 = pVar.i(16);
            if (i9 > 0) {
                bArr2 = new byte[i9];
                pVar.l(bArr2, i9);
            }
            if (i10 > 0) {
                bArr = new byte[i10];
                pVar.l(bArr, i10);
                return new c(i7, h8, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(i7, h8, bArr2, bArr);
    }

    @Override // J1.l
    public final void a() {
        g gVar = this.f;
        gVar.f2892c.clear();
        gVar.f2893d.clear();
        gVar.f2894e.clear();
        gVar.f.clear();
        gVar.f2895g.clear();
        gVar.f2896h = null;
        gVar.f2897i = null;
    }

    @Override // J1.l
    public final /* synthetic */ J1.d g(byte[] bArr, int i7, int i8) {
        return AbstractC0059i.o(this, bArr, i8);
    }

    @Override // J1.l
    public final void l(byte[] bArr, int i7, int i8, k kVar, K0.c cVar) {
        g gVar;
        J1.a aVar;
        int i9;
        char c8;
        int i10;
        b bVar;
        ArrayList arrayList;
        int i11;
        g gVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        e eVar;
        Paint paint;
        int[] iArr;
        e eVar2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = 8;
        p pVar = new p(bArr, i7 + i8);
        pVar.q(i7);
        while (true) {
            int b5 = pVar.b();
            gVar = this.f;
            if (b5 >= 48 && pVar.i(i21) == 15) {
                int i22 = pVar.i(i21);
                int i23 = 16;
                int i24 = pVar.i(16);
                int i25 = pVar.i(16);
                int f = pVar.f() + i25;
                if (i25 * 8 > pVar.b()) {
                    K0.a.A("DvbParser", "Data field length exceeds limit");
                    pVar.t(pVar.b());
                } else {
                    switch (i22) {
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            if (i24 == gVar.f2890a) {
                                G1.h hVar = gVar.f2897i;
                                pVar.i(i21);
                                int i26 = pVar.i(4);
                                int i27 = pVar.i(2);
                                pVar.t(2);
                                int i28 = i25 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i28 > 0) {
                                    int i29 = pVar.i(i21);
                                    pVar.t(i21);
                                    i28 -= 6;
                                    sparseArray.put(i29, new d(pVar.i(16), pVar.i(16)));
                                    i21 = 8;
                                }
                                G1.h hVar2 = new G1.h(i26, i27, sparseArray);
                                if (i27 != 0) {
                                    gVar.f2897i = hVar2;
                                    gVar.f2892c.clear();
                                    gVar.f2893d.clear();
                                    gVar.f2894e.clear();
                                    break;
                                } else if (hVar != null && hVar.f1372a != i26) {
                                    gVar.f2897i = hVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            G1.h hVar3 = gVar.f2897i;
                            if (i24 == gVar.f2890a && hVar3 != null) {
                                int i30 = pVar.i(i21);
                                pVar.t(4);
                                boolean h8 = pVar.h();
                                pVar.t(3);
                                int i31 = pVar.i(16);
                                int i32 = pVar.i(16);
                                pVar.i(3);
                                int i33 = pVar.i(3);
                                pVar.t(2);
                                int i34 = pVar.i(i21);
                                int i35 = pVar.i(i21);
                                int i36 = pVar.i(4);
                                int i37 = pVar.i(2);
                                pVar.t(2);
                                int i38 = i25 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i38 > 0) {
                                    int i39 = pVar.i(i23);
                                    int i40 = pVar.i(2);
                                    pVar.i(2);
                                    int i41 = pVar.i(12);
                                    pVar.t(4);
                                    int i42 = pVar.i(12);
                                    int i43 = i38 - 6;
                                    if (i40 != 1 && i40 != 2) {
                                        i38 = i43;
                                    } else {
                                        pVar.i(i21);
                                        pVar.i(i21);
                                        i38 -= 8;
                                    }
                                    sparseArray2.put(i39, new f(i41, i42));
                                    i23 = 16;
                                }
                                e eVar3 = new e(i30, h8, i31, i32, i33, i34, i35, i36, i37, sparseArray2);
                                SparseArray sparseArray3 = gVar.f2892c;
                                if (hVar3.f1373b == 0 && (eVar2 = (e) sparseArray3.get(i30)) != null) {
                                    int i44 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = eVar2.j;
                                        if (i44 < sparseArray4.size()) {
                                            eVar3.j.put(sparseArray4.keyAt(i44), (f) sparseArray4.valueAt(i44));
                                            i44++;
                                        }
                                    }
                                }
                                sparseArray3.put(eVar3.f2880a, eVar3);
                                break;
                            }
                            break;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            if (i24 == gVar.f2890a) {
                                a h9 = h(pVar, i25);
                                gVar.f2893d.put(h9.f2865a, h9);
                                break;
                            } else if (i24 == gVar.f2891b) {
                                a h10 = h(pVar, i25);
                                gVar.f.put(h10.f2865a, h10);
                                break;
                            }
                            break;
                        case 19:
                            if (i24 == gVar.f2890a) {
                                c i45 = i(pVar);
                                gVar.f2894e.put(i45.f2874a, i45);
                                break;
                            } else if (i24 == gVar.f2891b) {
                                c i46 = i(pVar);
                                gVar.f2895g.put(i46.f2874a, i46);
                                break;
                            }
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            if (i24 == gVar.f2890a) {
                                pVar.t(4);
                                boolean h11 = pVar.h();
                                pVar.t(3);
                                int i47 = pVar.i(16);
                                int i48 = pVar.i(16);
                                if (h11) {
                                    int i49 = pVar.i(16);
                                    int i50 = pVar.i(16);
                                    int i51 = pVar.i(16);
                                    i17 = i50;
                                    i18 = pVar.i(16);
                                    i20 = i51;
                                    i19 = i49;
                                } else {
                                    i17 = i47;
                                    i18 = i48;
                                    i19 = 0;
                                    i20 = 0;
                                }
                                gVar.f2896h = new b(i47, i48, i19, i17, i20, i18);
                                break;
                            }
                            break;
                    }
                    pVar.u(f - pVar.f());
                }
                i21 = 8;
            }
        }
        G1.h hVar4 = gVar.f2897i;
        if (hVar4 == null) {
            I i52 = K.f98b;
            aVar = new J1.a(e0.f138e, -9223372036854775807L, -9223372036854775807L);
        } else {
            b bVar2 = gVar.f2896h;
            if (bVar2 == null) {
                bVar2 = this.f2905d;
            }
            Bitmap bitmap = this.f2901X;
            Canvas canvas = this.f2904c;
            if (bitmap == null || bVar2.f2869a + 1 != bitmap.getWidth() || bVar2.f2870b + 1 != this.f2901X.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(bVar2.f2869a + 1, bVar2.f2870b + 1, Bitmap.Config.ARGB_8888);
                this.f2901X = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            int i53 = 0;
            while (true) {
                SparseArray sparseArray5 = (SparseArray) hVar4.f1374c;
                if (i53 < sparseArray5.size()) {
                    canvas.save();
                    d dVar = (d) sparseArray5.valueAt(i53);
                    e eVar4 = (e) gVar.f2892c.get(sparseArray5.keyAt(i53));
                    int i54 = dVar.f2878a + bVar2.f2871c;
                    int i55 = dVar.f2879b + bVar2.f2873e;
                    int min = Math.min(eVar4.f2882c + i54, bVar2.f2872d);
                    int i56 = eVar4.f2883d;
                    int i57 = i55 + i56;
                    canvas.clipRect(i54, i55, min, Math.min(i57, bVar2.f));
                    SparseArray sparseArray6 = gVar.f2893d;
                    int i58 = eVar4.f;
                    a aVar2 = (a) sparseArray6.get(i58);
                    if (aVar2 == null && (aVar2 = (a) gVar.f.get(i58)) == null) {
                        aVar2 = this.f2906e;
                    }
                    int i59 = 0;
                    while (true) {
                        SparseArray sparseArray7 = eVar4.j;
                        if (i59 < sparseArray7.size()) {
                            int keyAt = sparseArray7.keyAt(i59);
                            f fVar = (f) sparseArray7.valueAt(i59);
                            G1.h hVar5 = hVar4;
                            c cVar2 = (c) gVar.f2894e.get(keyAt);
                            if (cVar2 == null) {
                                cVar2 = (c) gVar.f2895g.get(keyAt);
                            }
                            if (cVar2 != null) {
                                if (cVar2.f2875b) {
                                    paint = null;
                                } else {
                                    paint = this.f2902a;
                                }
                                gVar2 = gVar;
                                int i60 = fVar.f2888a + i54;
                                int i61 = fVar.f2889b + i55;
                                i11 = i53;
                                int i62 = eVar4.f2884e;
                                int i63 = i59;
                                if (i62 == 3) {
                                    iArr = aVar2.f2868d;
                                } else if (i62 == 2) {
                                    iArr = aVar2.f2867c;
                                } else {
                                    iArr = aVar2.f2866b;
                                }
                                int[] iArr2 = iArr;
                                i12 = i63;
                                arrayList = arrayList2;
                                bVar = bVar2;
                                i14 = i56;
                                i13 = i57;
                                i16 = i54;
                                i15 = i55;
                                eVar = eVar4;
                                Paint paint2 = paint;
                                f(cVar2.f2876c, iArr2, i62, i60, i61, paint2, canvas);
                                f(cVar2.f2877d, iArr2, i62, i60, i61 + 1, paint2, canvas);
                            } else {
                                bVar = bVar2;
                                arrayList = arrayList2;
                                i11 = i53;
                                gVar2 = gVar;
                                i12 = i59;
                                i13 = i57;
                                i14 = i56;
                                i15 = i55;
                                i16 = i54;
                                eVar = eVar4;
                            }
                            i59 = i12 + 1;
                            eVar4 = eVar;
                            i54 = i16;
                            hVar4 = hVar5;
                            gVar = gVar2;
                            i53 = i11;
                            bVar2 = bVar;
                            i56 = i14;
                            i57 = i13;
                            i55 = i15;
                            arrayList2 = arrayList;
                        } else {
                            G1.h hVar6 = hVar4;
                            b bVar3 = bVar2;
                            ArrayList arrayList3 = arrayList2;
                            int i64 = i53;
                            g gVar3 = gVar;
                            int i65 = i57;
                            int i66 = i56;
                            int i67 = i55;
                            int i68 = i54;
                            e eVar5 = eVar4;
                            boolean z7 = eVar5.f2881b;
                            int i69 = eVar5.f2882c;
                            if (z7) {
                                int i70 = eVar5.f2884e;
                                if (i70 == 3) {
                                    i10 = aVar2.f2868d[eVar5.f2885g];
                                    c8 = 2;
                                } else {
                                    c8 = 2;
                                    if (i70 == 2) {
                                        i10 = aVar2.f2867c[eVar5.f2886h];
                                    } else {
                                        i10 = aVar2.f2866b[eVar5.f2887i];
                                    }
                                }
                                Paint paint3 = this.f2903b;
                                paint3.setColor(i10);
                                i9 = i67;
                                canvas.drawRect(i68, i9, i68 + i69, i65, paint3);
                            } else {
                                i9 = i67;
                                c8 = 2;
                            }
                            Bitmap createBitmap2 = Bitmap.createBitmap(this.f2901X, i68, i9, i69, i66);
                            float f4 = bVar3.f2869a;
                            float f8 = bVar3.f2870b;
                            arrayList3.add(new J0.b(null, null, null, createBitmap2, i9 / f8, 0, 0, i68 / f4, 0, Integer.MIN_VALUE, -3.4028235E38f, i69 / f4, i66 / f8, false, -16777216, Integer.MIN_VALUE, 0.0f));
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            gVar = gVar3;
                            i53 = i64 + 1;
                            hVar4 = hVar6;
                            arrayList2 = arrayList3;
                            bVar2 = bVar3;
                        }
                    }
                } else {
                    aVar = new J1.a(arrayList2, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        cVar.accept(aVar);
    }

    @Override // J1.l
    public final int m() {
        return 2;
    }
}
