package A;

import A3.C0025x;
import B5.S;
import D.AbstractC0059i;
import F3.t;
import H0.AbstractC0123c;
import H0.AbstractC0125e;
import H0.C0126f;
import H0.C0130j;
import H0.J;
import L5.p;
import L5.q;
import L5.r;
import L5.z;
import M0.x;
import Y1.K;
import Y1.s;
import a1.w;
import a1.y;
import android.media.AudioAttributes;
import android.media.MediaCodec;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.core.impl.EnumC0520w;
import b4.G;
import c6.I0;
import c6.InterfaceC0669g1;
import c6.Z0;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.InterfaceC0756e;
import com.google.android.gms.internal.p002firebaseauthapi.zzahs;
import com.google.android.gms.internal.p002firebaseauthapi.zzahy;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import m1.F;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.XMLReaderUtils;
import z.AbstractC2038a;
/* loaded from: classes.dex */
public final class c implements L5.d, U.j, I6.d, J1.d, p, S3.i, X0.k, K, i1.i, Continuation, I0, InterfaceC0669g1, com.dexterous.flutterlocalnotifications.i, InterfaceC0756e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f3a = i7;
        this.f4b = obj;
    }

    public static c m(byte[] bArr, t tVar) {
        if (tVar != null) {
            return new c(T3.a.a(bArr), 15);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    @Override // com.dexterous.flutterlocalnotifications.i
    public void A() {
        ((q) this.f4b).b(null, "permissionRequestInProgress", "Another permission request is already in progress");
    }

    @Override // S3.i
    public Object B(String str) {
        return ((S3.k) this.f4b).g(str, null);
    }

    @Override // Y1.K
    public View C(int i7) {
        return ((s) this.f4b).o(i7);
    }

    @Override // Y1.K
    public int D() {
        return ((s) this.f4b).u();
    }

    @Override // i1.i
    public /* bridge */ /* synthetic */ void E(i1.k kVar, long j, long j8, boolean z7) {
        w wVar = (w) kVar;
    }

    @Override // Y1.K
    public int I(View view) {
        ((s) this.f4b).getClass();
        return view.getBottom() + ((Y1.t) view.getLayoutParams()).f6691a.bottom + ((ViewGroup.MarginLayoutParams) ((Y1.t) view.getLayoutParams())).bottomMargin;
    }

    @Override // J1.d
    public List M(long j) {
        if (j >= 0) {
            return (List) this.f4b;
        }
        return Collections.emptyList();
    }

    @Override // X0.k
    public void a(Bundle bundle) {
        ((MediaCodec) this.f4b).setParameters(bundle);
    }

    @Override // Y1.K
    public int b() {
        s sVar = (s) this.f4b;
        return sVar.f6690g - sVar.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Type inference failed for: r7v4, types: [p6.i, w6.p] */
    @Override // I6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c0(I6.e r7, n6.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof I6.a
            if (r0 == 0) goto L13
            r0 = r8
            I6.a r0 = (I6.a) r0
            int r1 = r0.f2224d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2224d = r1
            goto L18
        L13:
            I6.a r0 = new I6.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f2222b
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.f2224d
            l6.j r3 = l6.j.f13876a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            J6.n r7 = r0.f2221a
            org.slf4j.helpers.i.M(r8)     // Catch: java.lang.Throwable -> L2b
            goto L55
        L2b:
            r8 = move-exception
            goto L5f
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            org.slf4j.helpers.i.M(r8)
            J6.n r8 = new J6.n
            n6.i r2 = r0.getContext()
            r8.<init>(r7, r2)
            r0.f2221a = r8     // Catch: java.lang.Throwable -> L5d
            r0.f2224d = r4     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r6.f4b     // Catch: java.lang.Throwable -> L5d
            p6.i r7 = (p6.i) r7     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L5d
            if (r7 != r1) goto L50
            goto L51
        L50:
            r7 = r3
        L51:
            if (r7 != r1) goto L54
            return r1
        L54:
            r7 = r8
        L55:
            r7.releaseIntercepted()
            return r3
        L59:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L5f
        L5d:
            r7 = move-exception
            goto L59
        L5f:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: A.c.c0(I6.e, n6.d):java.lang.Object");
    }

    @Override // X0.k
    public void d(int i7, N0.b bVar, long j, int i8) {
        ((MediaCodec) this.f4b).queueSecureInputBuffer(i7, 0, bVar.f3344i, j, i8);
    }

    @Override // X0.k
    public void e(int i7, int i8, long j, int i9) {
        ((MediaCodec) this.f4b).queueInputBuffer(i7, 0, i8, j, i9);
    }

    @Override // J1.d
    public int e0() {
        return 1;
    }

    @Override // c6.I0
    public void f() {
        ((AtomicLong) this.f4b).getAndAdd(1L);
    }

    @Override // J1.d
    public int g(long j) {
        if (j < 0) {
            return 0;
        }
        return -1;
    }

    public void h(int i7, int i8, m1.l lVar) {
        E1.c cVar;
        E1.c cVar2;
        E1.c cVar3;
        long j;
        int i9;
        int i10;
        int i11;
        int i12;
        E1.d dVar = (E1.d) this.f4b;
        SparseArray sparseArray = dVar.f1030c;
        int i13 = 4;
        int i14 = 0;
        int i15 = 1;
        if (i7 != 161 && i7 != 163) {
            if (i7 != 165) {
                if (i7 != 16877) {
                    if (i7 != 16981) {
                        if (i7 != 18402) {
                            if (i7 != 21419) {
                                if (i7 != 25506) {
                                    if (i7 == 30322) {
                                        dVar.d(i7);
                                        E1.c cVar4 = dVar.f1050w;
                                        byte[] bArr = new byte[i8];
                                        cVar4.f991w = bArr;
                                        lVar.f(bArr, 0, i8, false);
                                        return;
                                    }
                                    throw J.a(null, "Unexpected id: " + i7);
                                }
                                dVar.d(i7);
                                E1.c cVar5 = dVar.f1050w;
                                byte[] bArr2 = new byte[i8];
                                cVar5.f979k = bArr2;
                                lVar.f(bArr2, 0, i8, false);
                                return;
                            }
                            K0.q qVar = dVar.f1038k;
                            Arrays.fill(qVar.f2513a, (byte) 0);
                            lVar.f(qVar.f2513a, 4 - i8, i8, false);
                            qVar.G(0);
                            dVar.f1052y = (int) qVar.w();
                            return;
                        }
                        byte[] bArr3 = new byte[i8];
                        lVar.f(bArr3, 0, i8, false);
                        dVar.d(i7);
                        dVar.f1050w.j = new F(1, bArr3, 0, 0);
                        return;
                    }
                    dVar.d(i7);
                    E1.c cVar6 = dVar.f1050w;
                    byte[] bArr4 = new byte[i8];
                    cVar6.f978i = bArr4;
                    lVar.f(bArr4, 0, i8, false);
                    return;
                }
                dVar.d(i7);
                E1.c cVar7 = dVar.f1050w;
                int i16 = cVar7.f976g;
                if (i16 != 1685485123 && i16 != 1685480259) {
                    lVar.m(i8);
                    return;
                }
                byte[] bArr5 = new byte[i8];
                cVar7.f959O = bArr5;
                lVar.f(bArr5, 0, i8, false);
                return;
            } else if (dVar.f1009I == 2) {
                E1.c cVar8 = (E1.c) sparseArray.get(dVar.f1015O);
                if (dVar.f1018R == 4 && "V_VP9".equals(cVar8.f972b)) {
                    K0.q qVar2 = dVar.f1043p;
                    qVar2.D(i8);
                    lVar.f(qVar2.f2513a, 0, i8, false);
                    return;
                }
                lVar.m(i8);
                return;
            } else {
                return;
            }
        }
        int i17 = dVar.f1009I;
        K0.q qVar3 = dVar.f1037i;
        if (i17 == 0) {
            E1.e eVar = dVar.f1029b;
            dVar.f1015O = (int) eVar.c(lVar, false, true, 8);
            dVar.f1016P = eVar.f1057c;
            dVar.f1011K = -9223372036854775807L;
            dVar.f1009I = 1;
            qVar3.D(0);
        }
        E1.c cVar9 = (E1.c) sparseArray.get(dVar.f1015O);
        if (cVar9 == null) {
            lVar.m(i8 - dVar.f1016P);
            dVar.f1009I = 0;
            return;
        }
        cVar9.f969Y.getClass();
        if (dVar.f1009I == 1) {
            dVar.k(lVar, 3);
            int i18 = (qVar3.f2513a[2] & 6) >> 1;
            byte b5 = ForkServer.ERROR;
            if (i18 == 0) {
                dVar.f1013M = 1;
                int[] iArr = dVar.f1014N;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.f1014N = iArr;
                iArr[0] = (i8 - dVar.f1016P) - 3;
            } else {
                dVar.k(lVar, 4);
                int i19 = (qVar3.f2513a[3] & 255) + 1;
                dVar.f1013M = i19;
                int[] iArr2 = dVar.f1014N;
                if (iArr2 == null) {
                    iArr2 = new int[i19];
                } else if (iArr2.length < i19) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i19)];
                }
                dVar.f1014N = iArr2;
                if (i18 == 2) {
                    int i20 = dVar.f1013M;
                    Arrays.fill(iArr2, 0, i20, ((i8 - dVar.f1016P) - 4) / i20);
                } else if (i18 == 1) {
                    int i21 = 0;
                    int i22 = 0;
                    while (true) {
                        i9 = dVar.f1013M - 1;
                        if (i21 >= i9) {
                            break;
                        }
                        dVar.f1014N[i21] = 0;
                        while (true) {
                            i10 = i13 + 1;
                            dVar.k(lVar, i10);
                            int i23 = qVar3.f2513a[i13] & ForkServer.ERROR;
                            int[] iArr3 = dVar.f1014N;
                            i11 = iArr3[i21] + i23;
                            iArr3[i21] = i11;
                            if (i23 != 255) {
                                break;
                            }
                            i13 = i10;
                        }
                        i22 += i11;
                        i21++;
                        i13 = i10;
                    }
                    dVar.f1014N[i9] = ((i8 - dVar.f1016P) - i13) - i22;
                } else if (i18 == 3) {
                    int i24 = 0;
                    int i25 = 0;
                    while (true) {
                        int i26 = dVar.f1013M - i15;
                        if (i24 < i26) {
                            dVar.f1014N[i24] = i14;
                            int i27 = i13 + 1;
                            dVar.k(lVar, i27);
                            if (qVar3.f2513a[i13] != 0) {
                                int i28 = i14;
                                while (true) {
                                    if (i28 < 8) {
                                        int i29 = i15 << (7 - i28);
                                        if ((qVar3.f2513a[i13] & i29) != 0) {
                                            int i30 = i27 + i28;
                                            dVar.k(lVar, i30);
                                            E1.c cVar10 = cVar9;
                                            j = qVar3.f2513a[i13] & b5 & (~i29);
                                            while (i27 < i30) {
                                                j = (j << 8) | (qVar3.f2513a[i27] & ForkServer.ERROR);
                                                i27++;
                                                cVar10 = cVar10;
                                            }
                                            cVar3 = cVar10;
                                            if (i24 > 0) {
                                                j -= (1 << ((i28 * 7) + 6)) - 1;
                                            }
                                            i13 = i30;
                                        } else {
                                            i28++;
                                            b5 = ForkServer.ERROR;
                                            i15 = 1;
                                        }
                                    } else {
                                        cVar3 = cVar9;
                                        j = 0;
                                        i13 = i27;
                                        break;
                                    }
                                }
                                if (j < -2147483648L || j > 2147483647L) {
                                    break;
                                }
                                int i31 = (int) j;
                                int[] iArr4 = dVar.f1014N;
                                if (i24 != 0) {
                                    i31 += iArr4[i24 - 1];
                                }
                                iArr4[i24] = i31;
                                i25 += i31;
                                i24++;
                                cVar9 = cVar3;
                                b5 = ForkServer.ERROR;
                                i14 = 0;
                                i15 = 1;
                            } else {
                                throw J.a(null, "No valid varint length mask found");
                            }
                        } else {
                            cVar2 = cVar9;
                            dVar.f1014N[i26] = ((i8 - dVar.f1016P) - i13) - i25;
                            break;
                        }
                    }
                    throw J.a(null, "EBML lacing sample size out of range.");
                } else {
                    throw J.a(null, "Unexpected lacing value: " + i18);
                }
            }
            cVar2 = cVar9;
            byte[] bArr6 = qVar3.f2513a;
            dVar.f1010J = dVar.m((bArr6[1] & ForkServer.ERROR) | (bArr6[0] << 8)) + dVar.f1004D;
            cVar = cVar2;
            if (cVar.f974d != 2 && (i7 != 163 || (qVar3.f2513a[2] & 128) != 128)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            dVar.f1017Q = i12;
            dVar.f1009I = 2;
            dVar.f1012L = 0;
        } else {
            cVar = cVar9;
        }
        if (i7 == 163) {
            while (true) {
                int i32 = dVar.f1012L;
                if (i32 < dVar.f1013M) {
                    dVar.h(cVar, ((dVar.f1012L * cVar.f975e) / PipesIterator.DEFAULT_QUEUE_SIZE) + dVar.f1010J, dVar.f1017Q, dVar.n(lVar, cVar, dVar.f1014N[i32], false), 0);
                    dVar.f1012L++;
                    cVar = cVar;
                } else {
                    dVar.f1009I = 0;
                    return;
                }
            }
        } else {
            E1.c cVar11 = cVar;
            while (true) {
                int i33 = dVar.f1012L;
                if (i33 < dVar.f1013M) {
                    int[] iArr5 = dVar.f1014N;
                    iArr5[i33] = dVar.n(lVar, cVar11, iArr5[i33], true);
                    dVar.f1012L++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // U.j
    public Object i(U.i iVar) {
        boolean z7;
        H.d dVar = (H.d) this.f4b;
        if (dVar.f1616b == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.g("The result can only set once!", z7);
        dVar.f1616b = iVar;
        return "FutureChain[" + dVar + "]";
    }

    @Override // i1.i
    public /* bridge */ /* synthetic */ void j(i1.k kVar, long j, long j8) {
        w wVar = (w) kVar;
    }

    @Override // Y1.K
    public int k(View view) {
        ((s) this.f4b).getClass();
        return (view.getTop() - ((Y1.t) view.getLayoutParams()).f6691a.top) - ((ViewGroup.MarginLayoutParams) ((Y1.t) view.getLayoutParams())).topMargin;
    }

    @Override // L5.d
    public void l(ByteBuffer byteBuffer, D5.f fVar) {
        z.f3050b.getClass();
        z.c(byteBuffer);
        ((D5.b) this.f4b).getClass();
    }

    public void n(int i7, long j) {
        E1.d dVar = (E1.d) this.f4b;
        dVar.getClass();
        if (i7 != 20529) {
            if (i7 != 20530) {
                boolean z7 = false;
                switch (i7) {
                    case 131:
                        dVar.d(i7);
                        dVar.f1050w.f974d = (int) j;
                        return;
                    case 136:
                        dVar.d(i7);
                        E1.c cVar = dVar.f1050w;
                        if (j == 1) {
                            z7 = true;
                        }
                        cVar.f967W = z7;
                        return;
                    case 155:
                        dVar.f1011K = dVar.m(j);
                        return;
                    case 159:
                        dVar.d(i7);
                        dVar.f1050w.f960P = (int) j;
                        return;
                    case 176:
                        dVar.d(i7);
                        dVar.f1050w.f981m = (int) j;
                        return;
                    case 179:
                        dVar.b(i7);
                        dVar.f1005E.c(dVar.m(j));
                        return;
                    case 186:
                        dVar.d(i7);
                        dVar.f1050w.f982n = (int) j;
                        return;
                    case 215:
                        dVar.d(i7);
                        dVar.f1050w.f973c = (int) j;
                        return;
                    case 231:
                        dVar.f1004D = dVar.m(j);
                        return;
                    case 238:
                        dVar.f1018R = (int) j;
                        return;
                    case 241:
                        if (!dVar.f1007G) {
                            dVar.b(i7);
                            dVar.f1006F.c(j);
                            dVar.f1007G = true;
                            return;
                        }
                        return;
                    case 251:
                        dVar.f1019S = true;
                        return;
                    case 16871:
                        dVar.d(i7);
                        dVar.f1050w.f976g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw J.a(null, "ContentCompAlgo " + j + " not supported");
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw J.a(null, "DocTypeReadVersion " + j + " not supported");
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw J.a(null, "EBMLReadVersion " + j + " not supported");
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw J.a(null, "ContentEncAlgo " + j + " not supported");
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw J.a(null, "AESSettingsCipherMode " + j + " not supported");
                        }
                        return;
                    case 21420:
                        dVar.f1053z = j + dVar.f1046s;
                        return;
                    case 21432:
                        int i8 = (int) j;
                        dVar.d(i7);
                        if (i8 != 0) {
                            if (i8 != 1) {
                                if (i8 != 3) {
                                    if (i8 == 15) {
                                        dVar.f1050w.f992x = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f1050w.f992x = 1;
                                return;
                            }
                            dVar.f1050w.f992x = 2;
                            return;
                        }
                        dVar.f1050w.f992x = 0;
                        return;
                    case 21680:
                        dVar.d(i7);
                        dVar.f1050w.f984p = (int) j;
                        return;
                    case 21682:
                        dVar.d(i7);
                        dVar.f1050w.f986r = (int) j;
                        return;
                    case 21690:
                        dVar.d(i7);
                        dVar.f1050w.f985q = (int) j;
                        return;
                    case 21930:
                        dVar.d(i7);
                        E1.c cVar2 = dVar.f1050w;
                        if (j == 1) {
                            z7 = true;
                        }
                        cVar2.f966V = z7;
                        return;
                    case 21938:
                        dVar.d(i7);
                        E1.c cVar3 = dVar.f1050w;
                        cVar3.f993y = true;
                        cVar3.f983o = (int) j;
                        return;
                    case 21998:
                        dVar.d(i7);
                        dVar.f1050w.f = (int) j;
                        return;
                    case 22186:
                        dVar.d(i7);
                        dVar.f1050w.f963S = j;
                        return;
                    case 22203:
                        dVar.d(i7);
                        dVar.f1050w.f964T = j;
                        return;
                    case 25188:
                        dVar.d(i7);
                        dVar.f1050w.f961Q = (int) j;
                        return;
                    case 30114:
                        dVar.f1020T = j;
                        return;
                    case 30321:
                        dVar.d(i7);
                        int i9 = (int) j;
                        if (i9 != 0) {
                            if (i9 != 1) {
                                if (i9 != 2) {
                                    if (i9 == 3) {
                                        dVar.f1050w.f987s = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f1050w.f987s = 2;
                                return;
                            }
                            dVar.f1050w.f987s = 1;
                            return;
                        }
                        dVar.f1050w.f987s = 0;
                        return;
                    case 2352003:
                        dVar.d(i7);
                        dVar.f1050w.f975e = (int) j;
                        return;
                    case 2807729:
                        dVar.f1047t = j;
                        return;
                    default:
                        switch (i7) {
                            case 21945:
                                dVar.d(i7);
                                int i10 = (int) j;
                                if (i10 != 1) {
                                    if (i10 == 2) {
                                        dVar.f1050w.f946B = 1;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f1050w.f946B = 2;
                                return;
                            case 21946:
                                dVar.d(i7);
                                int g3 = C0130j.g((int) j);
                                if (g3 != -1) {
                                    dVar.f1050w.f945A = g3;
                                    return;
                                }
                                return;
                            case 21947:
                                dVar.d(i7);
                                dVar.f1050w.f993y = true;
                                int f = C0130j.f((int) j);
                                if (f != -1) {
                                    dVar.f1050w.f994z = f;
                                    return;
                                }
                                return;
                            case 21948:
                                dVar.d(i7);
                                dVar.f1050w.f947C = (int) j;
                                return;
                            case 21949:
                                dVar.d(i7);
                                dVar.f1050w.f948D = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw J.a(null, "ContentEncodingScope " + j + " not supported");
            }
        } else if (j == 0) {
        } else {
            throw J.a(null, "ContentEncodingOrder " + j + " not supported");
        }
    }

    public void o(String str) {
        P6.f fVar = ((P6.e) this.f4b).f4077d;
        x xVar = fVar.f4080b;
        xVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("error", str);
        hashMap.put("job", Integer.valueOf(fVar.f4084g));
        ((r) xVar.f3211c).a("onHtmlError", hashMap, null);
    }

    @Override // L5.p
    public void onMethodCall(L5.o oVar, q qVar) {
        switch (this.f3a) {
            case 11:
                f fVar = (f) this.f4b;
                if (((O5.a) fVar.f11c) != null) {
                    String str = oVar.f3038a;
                    Object obj = oVar.f3039b;
                    str.getClass();
                    if (!str.equals("ProcessText.processTextAction")) {
                        if (!str.equals("ProcessText.queryTextActions")) {
                            ((K5.r) qVar).c();
                            return;
                        }
                        try {
                            ((K5.r) qVar).a(((O5.a) fVar.f11c).b());
                            return;
                        } catch (IllegalStateException e7) {
                            ((K5.r) qVar).b(null, "error", e7.getMessage());
                            return;
                        }
                    }
                    try {
                        ArrayList arrayList = (ArrayList) obj;
                        boolean booleanValue = ((Boolean) arrayList.get(2)).booleanValue();
                        ((O5.a) fVar.f11c).a((String) arrayList.get(0), (String) arrayList.get(1), booleanValue, (K5.r) qVar);
                        return;
                    } catch (IllegalStateException e8) {
                        ((K5.r) qVar).b(null, "error", e8.getMessage());
                        return;
                    }
                }
                return;
            default:
                A4.c cVar = (A4.c) this.f4b;
                if (((io.flutter.plugin.editing.g) cVar.f218b) != null) {
                    String str2 = oVar.f3038a;
                    Object obj2 = oVar.f3039b;
                    str2.getClass();
                    if (!str2.equals("SpellCheck.initiateSpellCheck")) {
                        ((K5.r) qVar).c();
                        return;
                    }
                    try {
                        ArrayList arrayList2 = (ArrayList) obj2;
                        ((io.flutter.plugin.editing.g) cVar.f218b).a((String) arrayList2.get(0), (String) arrayList2.get(1), (K5.r) qVar);
                        return;
                    } catch (IllegalStateException e9) {
                        ((K5.r) qVar).b(null, "error", e9.getMessage());
                        return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [E1.c, java.lang.Object] */
    public void p(int i7, long j, long j8) {
        E1.d dVar = (E1.d) this.f4b;
        K0.a.k(dVar.f1033d0);
        if (i7 != 160) {
            if (i7 != 174) {
                if (i7 != 187) {
                    if (i7 != 19899) {
                        if (i7 != 20533) {
                            if (i7 != 21968) {
                                if (i7 != 408125543) {
                                    if (i7 != 475249515) {
                                        if (i7 == 524531317 && !dVar.f1051x) {
                                            if (dVar.f1032d && dVar.f1002B != -1) {
                                                dVar.f1001A = true;
                                                return;
                                            }
                                            dVar.f1033d0.x(new m1.s(dVar.f1049v));
                                            dVar.f1051x = true;
                                            return;
                                        }
                                        return;
                                    }
                                    dVar.f1005E = new S(2, (byte) 0);
                                    dVar.f1006F = new S(2, (byte) 0);
                                    return;
                                }
                                long j9 = dVar.f1046s;
                                if (j9 != -1 && j9 != j) {
                                    throw J.a(null, "Multiple Segment elements not supported");
                                }
                                dVar.f1046s = j;
                                dVar.f1045r = j8;
                                return;
                            }
                            dVar.d(i7);
                            dVar.f1050w.f993y = true;
                            return;
                        }
                        dVar.d(i7);
                        dVar.f1050w.f977h = true;
                        return;
                    }
                    dVar.f1052y = -1;
                    dVar.f1053z = -1L;
                    return;
                }
                dVar.f1007G = false;
                return;
            }
            ?? obj = new Object();
            obj.f981m = -1;
            obj.f982n = -1;
            obj.f983o = -1;
            obj.f984p = -1;
            obj.f985q = -1;
            obj.f986r = 0;
            obj.f987s = -1;
            obj.f988t = 0.0f;
            obj.f989u = 0.0f;
            obj.f990v = 0.0f;
            obj.f991w = null;
            obj.f992x = -1;
            obj.f993y = false;
            obj.f994z = -1;
            obj.f945A = -1;
            obj.f946B = -1;
            obj.f947C = PipesIterator.DEFAULT_QUEUE_SIZE;
            obj.f948D = 200;
            obj.f949E = -1.0f;
            obj.f950F = -1.0f;
            obj.f951G = -1.0f;
            obj.f952H = -1.0f;
            obj.f953I = -1.0f;
            obj.f954J = -1.0f;
            obj.f955K = -1.0f;
            obj.f956L = -1.0f;
            obj.f957M = -1.0f;
            obj.f958N = -1.0f;
            obj.f960P = 1;
            obj.f961Q = -1;
            obj.f962R = 8000;
            obj.f963S = 0L;
            obj.f964T = 0L;
            obj.f967W = true;
            obj.f968X = "eng";
            dVar.f1050w = obj;
            return;
        }
        dVar.f1019S = false;
        dVar.f1020T = 0L;
    }

    public void q(boolean z7) {
        Z0 z02 = (Z0) this.f4b;
        z02.f8702d0.u(z02.f8680H, z7);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            I.i(exception);
            return Tasks.forException(exception);
        }
        zzahs zzahsVar = (zzahs) task.getResult();
        if (zzahsVar instanceof zzahy) {
            zzahy zzahyVar = (zzahy) zzahsVar;
            String zzf = zzahyVar.zzf();
            I.e(zzf);
            String zze = zzahyVar.zze();
            I.e(zze);
            int zzc = zzahyVar.zzc();
            int zzb = zzahyVar.zzb();
            long zzd = zzahyVar.zzd();
            String zza = zzahyVar.zza();
            I.e(zza);
            return Tasks.forResult(new G(zzf, zze, zzc, zzb, zzd, zza, (FirebaseAuth) this.f4b));
        }
        throw new IllegalArgumentException(AbstractC0059i.M("Response should be an instance of StartTotpMfaEnrollmentResponse but was ", zzahsVar.getClass().getName(), "."));
    }

    public String toString() {
        switch (this.f3a) {
            case 23:
                StringBuilder sb = new StringBuilder("[Result: <");
                sb.append("Value: " + ((EnumC0520w) this.f4b));
                sb.append(">]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.dexterous.flutterlocalnotifications.i
    public void v(boolean z7) {
        ((q) this.f4b).a(Boolean.valueOf(z7));
    }

    @Override // J1.d
    public long x(int i7) {
        boolean z7;
        if (i7 == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        return 0L;
    }

    @Override // i1.i
    public T1.e y(i1.k kVar, long j, long j8, IOException iOException, int i7) {
        w wVar = (w) kVar;
        if (!((y) this.f4b).f) {
            x xVar = ((y) this.f4b).f6920a;
        }
        return i1.n.f11428e;
    }

    public c(D5.b bVar) {
        this.f3a = 10;
        new r(bVar, "flutter/mousecursor", L5.y.f3047b, null).b(new m(this, 9));
    }

    public c(int i7) {
        this.f3a = i7;
        switch (i7) {
            case 1:
                this.f4b = C0025x.a();
                return;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return;
            case 25:
                this.f4b = new AtomicLong();
                return;
            default:
                this.f4b = (ExtraSupportedSurfaceCombinationsQuirk) AbstractC2038a.f16621a.a0(ExtraSupportedSurfaceCombinationsQuirk.class);
                return;
        }
    }

    public c(C0126f c0126f) {
        this.f3a = 6;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c0126f.f1798a).setFlags(0).setUsage(1);
        int i7 = K0.x.f2529a;
        if (i7 >= 29) {
            AbstractC0123c.a(usage, 1);
        }
        if (i7 >= 32) {
            AbstractC0125e.a(usage, 0);
        }
        this.f4b = usage.build();
    }

    public c(L5.f fVar) {
        this.f3a = 9;
        this.f4b = new E.e(fVar, "flutter/keyevent", L5.l.f3036a, null, 4);
    }

    @Override // X0.k
    public void c() {
    }

    @Override // X0.k
    public void flush() {
    }

    @Override // X0.k
    public void shutdown() {
    }

    @Override // X0.k
    public void start() {
    }

    public c(w6.p pVar) {
        this.f3a = 7;
        this.f4b = (p6.i) pVar;
    }
}
