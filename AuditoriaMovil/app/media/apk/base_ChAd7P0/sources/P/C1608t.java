package p;

import B5.AbstractActivityC0032e;
import D.AbstractC0059i;
import D.C0056f;
import D.C0057g;
import D.EnumC0071v;
import H4.B1;
import H4.C0158f;
import H4.C0160g;
import H4.C0167j0;
import H4.C0171l0;
import H4.C0195y;
import H4.C0197z;
import H4.c1;
import H4.d1;
import H4.e1;
import H4.o1;
import H4.p1;
import H4.r1;
import H4.t1;
import W.AbstractC0359b;
import W.C0365h;
import W.C0372o;
import a1.C0415A;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.PendingIntent;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.animation.Animation;
import androidx.camera.core.impl.EnumC0512n;
import androidx.camera.core.impl.EnumC0513o;
import androidx.camera.core.impl.EnumC0514p;
import androidx.camera.core.impl.EnumC0520w;
import androidx.camera.core.impl.InterfaceC0515q;
import b3.C0585f;
import c5.C0639a;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzal;
import com.google.android.gms.internal.maps.zzam;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import e0.C0927b;
import f5.C0993a;
import g1.C1006c;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j6.C1372c;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import n4.AbstractC1530p;
import n4.C1513B;
import n4.C1517c;
import n4.C1519e;
import n4.C1529o;
import n4.EnumC1512A;
import n4.EnumC1514C;
import n4.EnumC1518d;
import n4.EnumC1528n;
import org.apache.tika.utils.StringUtils;
import p4.C1673c;
import p4.InterfaceC1671a;
import p4.InterfaceC1677g;
import q4.C1709b;
import r3.C1738b;
import r3.C1739c;
import r3.C1742f;
import r4.AbstractC1746c;
import r4.C1744a;
import r4.C1745b;
import s3.C1766A;
import s3.C1767B;
import u0.C1847c;
import u0.C1856l;
import u0.C1862r;
import v0.C1879a;
import v2.C1883b;
import w.AbstractC1898H;
import w.C1910U;
import w.C1930o;
import w.C1932q;
import w.C1936u;
import w0.C1942a;
import x.C1967a;
import x.C1973g;
import x1.C1985a;
import y.C2027g;
import y.C2028h;
import z0.AbstractActivityC2064y;
import z0.AbstractComponentCallbacksC2061v;
/* renamed from: p.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1608t implements p4.C, InterfaceC1671a, L5.p, InterfaceC0515q, H.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14879a;

    /* renamed from: b  reason: collision with root package name */
    public Object f14880b;

    /* renamed from: c  reason: collision with root package name */
    public Object f14881c;

    public /* synthetic */ C1608t(int i7, Object obj, Object obj2) {
        this.f14879a = i7;
        this.f14880b = obj;
        this.f14881c = obj2;
    }

    public static r4.j B(B1 b12, q4.q qVar) {
        q4.q D4 = D(b12.x());
        if (!q4.q.f15370b.equals(D4)) {
            qVar = D4;
        }
        int w2 = b12.w();
        ArrayList arrayList = new ArrayList(w2);
        for (int i7 = 0; i7 < w2; i7++) {
            arrayList.add(b12.v(i7));
        }
        return new r4.j(qVar, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static n4.L C(java.lang.String r13, H4.X0 r14) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1608t.C(java.lang.String, H4.X0):n4.L");
    }

    public static q4.q D(com.google.protobuf.N0 n02) {
        if (n02.z() == 0 && n02.y() == 0) {
            return q4.q.f15370b;
        }
        return new q4.q(new U3.p(n02.y(), n02.z()));
    }

    public static boolean E(Editable editable, KeyEvent keyEvent, boolean z7) {
        C1862r[] c1862rArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c1862rArr = (C1862r[]) editable.getSpans(selectionStart, selectionEnd, C1862r.class)) != null && c1862rArr.length > 0) {
            for (C1862r c1862r : c1862rArr) {
                int spanStart = editable.getSpanStart(c1862r);
                int spanEnd = editable.getSpanEnd(c1862r);
                if ((z7 && spanStart == selectionStart) || ((!z7 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static H4.Q0 U(AbstractC1530p abstractC1530p) {
        H4.G0 g02;
        H4.V0 v02;
        H4.V0 v03;
        H4.K0 k02;
        if (abstractC1530p instanceof C1529o) {
            C1529o c1529o = (C1529o) abstractC1530p;
            EnumC1528n enumC1528n = c1529o.f14349a;
            EnumC1528n enumC1528n2 = EnumC1528n.EQUAL;
            q4.k kVar = c1529o.f14351c;
            p1 p1Var = c1529o.f14350b;
            if (enumC1528n == enumC1528n2 || enumC1528n == EnumC1528n.NOT_EQUAL) {
                H4.U0 A7 = H4.W0.A();
                H4.M0 y2 = H4.N0.y();
                String c8 = kVar.c();
                y2.d();
                H4.N0.v((H4.N0) y2.f10006b, c8);
                A7.d();
                H4.W0.w((H4.W0) A7.f10006b, (H4.N0) y2.b());
                p1 p1Var2 = q4.s.f15373a;
                if (p1Var != null && Double.isNaN(p1Var.K())) {
                    if (enumC1528n == enumC1528n2) {
                        v03 = H4.V0.IS_NAN;
                    } else {
                        v03 = H4.V0.IS_NOT_NAN;
                    }
                    A7.d();
                    H4.W0.v((H4.W0) A7.f10006b, v03);
                    H4.O0 D4 = H4.Q0.D();
                    D4.d();
                    H4.Q0.w((H4.Q0) D4.f10006b, (H4.W0) A7.b());
                    return (H4.Q0) D4.b();
                } else if (p1Var != null && p1Var.R() == o1.NULL_VALUE) {
                    if (enumC1528n == enumC1528n2) {
                        v02 = H4.V0.IS_NULL;
                    } else {
                        v02 = H4.V0.IS_NOT_NULL;
                    }
                    A7.d();
                    H4.W0.v((H4.W0) A7.f10006b, v02);
                    H4.O0 D7 = H4.Q0.D();
                    D7.d();
                    H4.Q0.w((H4.Q0) D7.f10006b, (H4.W0) A7.b());
                    return (H4.Q0) D7.b();
                }
            }
            H4.J0 C7 = H4.L0.C();
            H4.M0 y3 = H4.N0.y();
            String c9 = kVar.c();
            y3.d();
            H4.N0.v((H4.N0) y3.f10006b, c9);
            C7.d();
            H4.L0.v((H4.L0) C7.f10006b, (H4.N0) y3.b());
            switch (t4.r.f15843i[enumC1528n.ordinal()]) {
                case 1:
                    k02 = H4.K0.LESS_THAN;
                    break;
                case 2:
                    k02 = H4.K0.LESS_THAN_OR_EQUAL;
                    break;
                case 3:
                    k02 = H4.K0.EQUAL;
                    break;
                case 4:
                    k02 = H4.K0.NOT_EQUAL;
                    break;
                case 5:
                    k02 = H4.K0.GREATER_THAN;
                    break;
                case 6:
                    k02 = H4.K0.GREATER_THAN_OR_EQUAL;
                    break;
                case 7:
                    k02 = H4.K0.ARRAY_CONTAINS;
                    break;
                case 8:
                    k02 = H4.K0.IN;
                    break;
                case 9:
                    k02 = H4.K0.ARRAY_CONTAINS_ANY;
                    break;
                case 10:
                    k02 = H4.K0.NOT_IN;
                    break;
                default:
                    m5.d.g("Unknown operator %d", enumC1528n);
                    throw null;
            }
            C7.d();
            H4.L0.w((H4.L0) C7.f10006b, k02);
            C7.d();
            H4.L0.x((H4.L0) C7.f10006b, p1Var);
            H4.O0 D8 = H4.Q0.D();
            D8.d();
            H4.Q0.v((H4.Q0) D8.f10006b, (H4.L0) C7.b());
            return (H4.Q0) D8.b();
        } else if (abstractC1530p instanceof C1519e) {
            C1519e c1519e = (C1519e) abstractC1530p;
            ArrayList arrayList = new ArrayList(DesugarCollections.unmodifiableList(c1519e.f14335a).size());
            for (AbstractC1530p abstractC1530p2 : DesugarCollections.unmodifiableList(c1519e.f14335a)) {
                arrayList.add(U(abstractC1530p2));
            }
            if (arrayList.size() == 1) {
                return (H4.Q0) arrayList.get(0);
            }
            H4.F0 A8 = H4.H0.A();
            int i7 = t4.r.f15840e[c1519e.f14336b.ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    g02 = H4.G0.OR;
                } else {
                    m5.d.g("Unrecognized composite filter type.", new Object[0]);
                    throw null;
                }
            } else {
                g02 = H4.G0.AND;
            }
            A8.d();
            H4.H0.v((H4.H0) A8.f10006b, g02);
            A8.d();
            H4.H0.w((H4.H0) A8.f10006b, arrayList);
            H4.O0 D9 = H4.Q0.D();
            D9.d();
            H4.Q0.x((H4.Q0) D9.f10006b, (H4.H0) A8.b());
            return (H4.Q0) D9.b();
        } else {
            m5.d.g("Unrecognized filter type %s", abstractC1530p.toString());
            throw null;
        }
    }

    public static String Y(q4.f fVar, q4.p pVar) {
        q4.e eVar;
        List asList = Arrays.asList("projects", fVar.f15352a, "databases", fVar.f15353b);
        q4.p pVar2 = q4.p.f15369b;
        if (asList.isEmpty()) {
            eVar = q4.p.f15369b;
        } else {
            eVar = new q4.e(asList);
        }
        return ((q4.p) ((q4.p) eVar.a("documents")).b(pVar)).c();
    }

    public static com.google.protobuf.N0 Z(U3.p pVar) {
        com.google.protobuf.M0 A7 = com.google.protobuf.N0.A();
        A7.f(pVar.f5765a);
        A7.d();
        com.google.protobuf.N0.w((com.google.protobuf.N0) A7.f10006b, pVar.f5766b);
        return (com.google.protobuf.N0) A7.b();
    }

    public static q4.p a0(q4.p pVar) {
        boolean z7;
        if (pVar.f15351a.size() > 4 && pVar.g(4).equals("documents")) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Tried to deserialize invalid key %s", z7, pVar);
        return (q4.p) pVar.j();
    }

    public static boolean i0(q4.p pVar) {
        if (pVar.f15351a.size() < 4 || !pVar.g(0).equals("projects") || !pVar.g(2).equals("databases")) {
            return false;
        }
        return true;
    }

    public static C1608t j0(char c8) {
        return new C1608t(new C0415A(new z3.d(c8)), z3.f.f16881b);
    }

    public static void u(CameraDevice cameraDevice, y.u uVar) {
        cameraDevice.getClass();
        y.t tVar = uVar.f16601a;
        tVar.c().getClass();
        List<C2028h> d7 = tVar.d();
        if (d7 != null) {
            if (tVar.g() != null) {
                String id = cameraDevice.getId();
                for (C2028h c2028h : d7) {
                    String d8 = c2028h.f16578a.d();
                    if (d8 != null && !d8.isEmpty()) {
                        org.slf4j.helpers.i.O("CameraDeviceCompat", io.flutter.plugins.pathprovider.b.j("Camera ", id, ": Camera doesn't support physicalCameraId ", d8, ". Ignoring."));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Invalid executor");
        }
        throw new IllegalArgumentException("Invalid output configurations");
    }

    public static ArrayList v0(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2028h) it.next()).f16578a.e());
        }
        return arrayList;
    }

    public static AbstractC1530p x(H4.Q0 q0) {
        EnumC1518d enumC1518d;
        EnumC1528n enumC1528n;
        int i7 = t4.r.f15841g[q0.B().ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    H4.W0 C7 = q0.C();
                    q4.k l8 = q4.k.l(C7.y().x());
                    int i8 = t4.r.f15842h[C7.z().ordinal()];
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                if (i8 == 4) {
                                    return C1529o.e(l8, EnumC1528n.NOT_EQUAL, q4.s.f15374b);
                                }
                                m5.d.g("Unrecognized UnaryFilter.operator %d", C7.z());
                                throw null;
                            }
                            return C1529o.e(l8, EnumC1528n.NOT_EQUAL, q4.s.f15373a);
                        }
                        return C1529o.e(l8, EnumC1528n.EQUAL, q4.s.f15374b);
                    }
                    return C1529o.e(l8, EnumC1528n.EQUAL, q4.s.f15373a);
                }
                m5.d.g("Unrecognized Filter.filterType %d", q0.B());
                throw null;
            }
            H4.L0 A7 = q0.A();
            q4.k l9 = q4.k.l(A7.z().x());
            H4.K0 A8 = A7.A();
            switch (t4.r.j[A8.ordinal()]) {
                case 1:
                    enumC1528n = EnumC1528n.LESS_THAN;
                    break;
                case 2:
                    enumC1528n = EnumC1528n.LESS_THAN_OR_EQUAL;
                    break;
                case 3:
                    enumC1528n = EnumC1528n.EQUAL;
                    break;
                case 4:
                    enumC1528n = EnumC1528n.NOT_EQUAL;
                    break;
                case 5:
                    enumC1528n = EnumC1528n.GREATER_THAN_OR_EQUAL;
                    break;
                case 6:
                    enumC1528n = EnumC1528n.GREATER_THAN;
                    break;
                case 7:
                    enumC1528n = EnumC1528n.ARRAY_CONTAINS;
                    break;
                case 8:
                    enumC1528n = EnumC1528n.IN;
                    break;
                case 9:
                    enumC1528n = EnumC1528n.ARRAY_CONTAINS_ANY;
                    break;
                case 10:
                    enumC1528n = EnumC1528n.NOT_IN;
                    break;
                default:
                    m5.d.g("Unhandled FieldFilter.operator %d", A8);
                    throw null;
            }
            return C1529o.e(l9, enumC1528n, A7.B());
        }
        H4.H0 y2 = q0.y();
        ArrayList arrayList = new ArrayList();
        for (H4.Q0 q02 : y2.y()) {
            arrayList.add(x(q02));
        }
        int i9 = t4.r.f[y2.z().ordinal()];
        if (i9 != 1) {
            if (i9 == 2) {
                enumC1518d = EnumC1518d.OR;
            } else {
                m5.d.g("Only AND and OR composite filter types are supported.", new Object[0]);
                throw null;
            }
        } else {
            enumC1518d = EnumC1518d.AND;
        }
        return new C1519e(arrayList, enumC1518d);
    }

    public r4.h A(t1 t1Var) {
        r4.m mVar;
        boolean z7;
        r4.g gVar;
        if (t1Var.J()) {
            C0171l0 B7 = t1Var.B();
            int i7 = t4.r.f15837b[B7.x().ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        mVar = r4.m.f15508c;
                    } else {
                        m5.d.g("Unknown precondition", new Object[0]);
                        throw null;
                    }
                } else {
                    mVar = r4.m.a(B7.z());
                }
            } else {
                mVar = new r4.m(D(B7.A()), null);
            }
        } else {
            mVar = r4.m.f15508c;
        }
        r4.m mVar2 = mVar;
        ArrayList arrayList = new ArrayList();
        for (H4.S s7 : t1Var.H()) {
            int i8 = t4.r.f15838c[s7.F().ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4) {
                            gVar = new r4.g(q4.k.l(s7.B()), new r4.k(s7.C()));
                        } else {
                            m5.d.g("Unknown FieldTransform proto: %s", s7);
                            throw null;
                        }
                    } else {
                        gVar = new r4.g(q4.k.l(s7.B()), new AbstractC1746c(s7.D().a()));
                    }
                } else {
                    gVar = new r4.g(q4.k.l(s7.B()), new AbstractC1746c(s7.A().a()));
                }
            } else {
                if (s7.E() == H4.P.REQUEST_TIME) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                m5.d.i("Unknown transform setToServerValue: %s", z7, s7.E());
                gVar = new r4.g(q4.k.l(s7.B()), r4.n.f15511a);
            }
            arrayList.add(gVar);
        }
        int i9 = t4.r.f15836a[t1Var.D().ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    return new r4.h(y(t1Var.I()), mVar2);
                }
                m5.d.g("Unknown mutation operation: %d", t1Var.D());
                throw null;
            }
            return new r4.h(y(t1Var.C()), mVar2);
        } else if (t1Var.M()) {
            q4.h y2 = y(t1Var.F().A());
            q4.o e7 = q4.o.e(t1Var.F().z());
            H4.K G2 = t1Var.G();
            int y3 = G2.y();
            HashSet hashSet = new HashSet(y3);
            for (int i10 = 0; i10 < y3; i10++) {
                hashSet.add(q4.k.l(G2.x(i10)));
            }
            return new r4.l(y2, e7, new r4.f(hashSet), mVar2, arrayList);
        } else {
            return new r4.o(y(t1Var.F().A()), q4.o.e(t1Var.F().z()), mVar2, arrayList);
        }
    }

    public void F(AbstractComponentCallbacksC2061v f, boolean z7) {
        kotlin.jvm.internal.j.e(f, "f");
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = ((z0.L) this.f14880b).f16679x;
        if (abstractComponentCallbacksC2061v != null) {
            abstractComponentCallbacksC2061v.n().f16669n.F(f, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14881c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z7) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void G(AbstractComponentCallbacksC2061v f, boolean z7) {
        kotlin.jvm.internal.j.e(f, "f");
        z0.L l8 = (z0.L) this.f14880b;
        AbstractActivityC2064y abstractActivityC2064y = l8.f16677v.f16857e;
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = l8.f16679x;
        if (abstractComponentCallbacksC2061v != null) {
            abstractComponentCallbacksC2061v.n().f16669n.G(f, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14881c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z7) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void H(AbstractComponentCallbacksC2061v f, boolean z7) {
        kotlin.jvm.internal.j.e(f, "f");
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = ((z0.L) this.f14880b).f16679x;
        if (abstractComponentCallbacksC2061v != null) {
            abstractComponentCallbacksC2061v.n().f16669n.H(f, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14881c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z7) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void I(AbstractComponentCallbacksC2061v f, boolean z7) {
        kotlin.jvm.internal.j.e(f, "f");
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = ((z0.L) this.f14880b).f16679x;
        if (abstractComponentCallbacksC2061v != null) {
            abstractComponentCallbacksC2061v.n().f16669n.I(f, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14881c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z7) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void J(AbstractComponentCallbacksC2061v f, boolean z7) {
        kotlin.jvm.internal.j.e(f, "f");
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = ((z0.L) this.f14880b).f16679x;
        if (abstractComponentCallbacksC2061v != null) {
            abstractComponentCallbacksC2061v.n().f16669n.J(f, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14881c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z7) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void K(AbstractComponentCallbacksC2061v f, boolean z7) {
        kotlin.jvm.internal.j.e(f, "f");
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = ((z0.L) this.f14880b).f16679x;
        if (abstractComponentCallbacksC2061v != null) {
            abstractComponentCallbacksC2061v.n().f16669n.K(f, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14881c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z7) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void L(AbstractComponentCallbacksC2061v f, boolean z7) {
        kotlin.jvm.internal.j.e(f, "f");
        z0.L l8 = (z0.L) this.f14880b;
        AbstractActivityC2064y abstractActivityC2064y = l8.f16677v.f16857e;
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = l8.f16679x;
        if (abstractComponentCallbacksC2061v != null) {
            abstractComponentCallbacksC2061v.n().f16669n.L(f, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14881c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z7) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void M(AbstractComponentCallbacksC2061v f, boolean z7) {
        kotlin.jvm.internal.j.e(f, "f");
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = ((z0.L) this.f14880b).f16679x;
        if (abstractComponentCallbacksC2061v != null) {
            abstractComponentCallbacksC2061v.n().f16669n.M(f, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14881c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z7) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void N(AbstractComponentCallbacksC2061v f, boolean z7) {
        kotlin.jvm.internal.j.e(f, "f");
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = ((z0.L) this.f14880b).f16679x;
        if (abstractComponentCallbacksC2061v != null) {
            abstractComponentCallbacksC2061v.n().f16669n.N(f, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14881c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z7) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void O(AbstractComponentCallbacksC2061v f, Bundle bundle, boolean z7) {
        kotlin.jvm.internal.j.e(f, "f");
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = ((z0.L) this.f14880b).f16679x;
        if (abstractComponentCallbacksC2061v != null) {
            abstractComponentCallbacksC2061v.n().f16669n.O(f, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14881c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z7) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void P(AbstractComponentCallbacksC2061v f, boolean z7) {
        kotlin.jvm.internal.j.e(f, "f");
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = ((z0.L) this.f14880b).f16679x;
        if (abstractComponentCallbacksC2061v != null) {
            abstractComponentCallbacksC2061v.n().f16669n.P(f, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14881c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z7) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void Q(AbstractComponentCallbacksC2061v f, boolean z7) {
        kotlin.jvm.internal.j.e(f, "f");
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = ((z0.L) this.f14880b).f16679x;
        if (abstractComponentCallbacksC2061v != null) {
            abstractComponentCallbacksC2061v.n().f16669n.Q(f, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14881c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z7) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void R(AbstractComponentCallbacksC2061v f, boolean z7) {
        kotlin.jvm.internal.j.e(f, "f");
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = ((z0.L) this.f14880b).f16679x;
        if (abstractComponentCallbacksC2061v != null) {
            abstractComponentCallbacksC2061v.n().f16669n.R(f, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14881c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z7) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void S() {
        p4.U u7 = new p4.U(this, 0);
        Cursor rawQuery = ((SQLiteDatabase) this.f14880b).rawQuery("SELECT target_id, target_proto FROM targets", null);
        while (rawQuery.moveToNext()) {
            try {
                u7.accept(rawQuery);
            } catch (Throwable th) {
                if (rawQuery != null) {
                    try {
                        rawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        rawQuery.close();
    }

    public byte[] T(C1985a c1985a) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f14880b;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.f14881c;
        try {
            dataOutputStream.writeBytes(c1985a.f16492a);
            dataOutputStream.writeByte(0);
            String str = c1985a.f16493b;
            if (str == null) {
                str = StringUtils.EMPTY;
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(c1985a.f16494c);
            dataOutputStream.writeLong(c1985a.f16495d);
            dataOutputStream.write(c1985a.f16496e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    public String V(q4.h hVar) {
        return Y((q4.f) this.f14880b, hVar.f15357a);
    }

    public t1 W(r4.h hVar) {
        boolean z7;
        C0171l0 c0171l0;
        com.google.protobuf.J b5;
        r1 N7 = t1.N();
        if (hVar instanceof r4.o) {
            q4.h hVar2 = hVar.f15496a;
            q4.o oVar = ((r4.o) hVar).f15512d;
            H4.B C7 = H4.D.C();
            String V7 = V(hVar2);
            C7.d();
            H4.D.v((H4.D) C7.f10006b, V7);
            Map y2 = oVar.b().N().y();
            C7.d();
            H4.D.w((H4.D) C7.f10006b).putAll(y2);
            N7.d();
            t1.x((t1) N7.f10006b, (H4.D) C7.b());
        } else if (hVar instanceof r4.l) {
            q4.h hVar3 = hVar.f15496a;
            q4.o oVar2 = ((r4.l) hVar).f15506d;
            H4.B C8 = H4.D.C();
            String V8 = V(hVar3);
            C8.d();
            H4.D.v((H4.D) C8.f10006b, V8);
            Map y3 = oVar2.b().N().y();
            C8.d();
            H4.D.w((H4.D) C8.f10006b).putAll(y3);
            N7.d();
            t1.x((t1) N7.f10006b, (H4.D) C8.b());
            H4.J z8 = H4.K.z();
            Iterator it = ((r4.l) hVar).f15507e.f15493a.iterator();
            while (it.hasNext()) {
                String c8 = ((q4.k) it.next()).c();
                z8.d();
                H4.K.v((H4.K) z8.f10006b, c8);
            }
            N7.d();
            t1.v((t1) N7.f10006b, (H4.K) z8.b());
        } else if (hVar instanceof r4.e) {
            String V9 = V(hVar.f15496a);
            N7.d();
            t1.z((t1) N7.f10006b, V9);
        } else if (hVar instanceof r4.q) {
            String V10 = V(hVar.f15496a);
            N7.d();
            t1.A((t1) N7.f10006b, V10);
        } else {
            m5.d.g("unknown mutation type %s", hVar.getClass());
            throw null;
        }
        for (r4.g gVar : hVar.f15498c) {
            r4.p pVar = gVar.f15495b;
            boolean z9 = pVar instanceof r4.n;
            q4.k kVar = gVar.f15494a;
            if (z9) {
                H4.O G2 = H4.S.G();
                String c9 = kVar.c();
                G2.d();
                H4.S.w((H4.S) G2.f10006b, c9);
                H4.P p7 = H4.P.REQUEST_TIME;
                G2.d();
                H4.S.y((H4.S) G2.f10006b, p7);
                b5 = G2.b();
            } else if (pVar instanceof C1745b) {
                H4.O G7 = H4.S.G();
                String c10 = kVar.c();
                G7.d();
                H4.S.w((H4.S) G7.f10006b, c10);
                C0158f B7 = C0160g.B();
                B7.d();
                C0160g.w((C0160g) B7.f10006b, ((C1745b) pVar).f15489a);
                G7.d();
                H4.S.v((H4.S) G7.f10006b, (C0160g) B7.b());
                b5 = G7.b();
            } else if (pVar instanceof C1744a) {
                H4.O G8 = H4.S.G();
                String c11 = kVar.c();
                G8.d();
                H4.S.w((H4.S) G8.f10006b, c11);
                C0158f B8 = C0160g.B();
                B8.d();
                C0160g.w((C0160g) B8.f10006b, ((C1744a) pVar).f15489a);
                G8.d();
                H4.S.x((H4.S) G8.f10006b, (C0160g) B8.b());
                b5 = G8.b();
            } else if (pVar instanceof r4.k) {
                H4.O G9 = H4.S.G();
                String c12 = kVar.c();
                G9.d();
                H4.S.w((H4.S) G9.f10006b, c12);
                p1 p1Var = ((r4.k) pVar).f15505a;
                G9.d();
                H4.S.z((H4.S) G9.f10006b, p1Var);
                b5 = G9.b();
            } else {
                m5.d.g("Unknown transform: %s", pVar);
                throw null;
            }
            N7.d();
            t1.w((t1) N7.f10006b, (H4.S) b5);
        }
        r4.m mVar = hVar.f15497b;
        q4.q qVar = mVar.f15509a;
        Boolean bool = mVar.f15510b;
        if (qVar != null || bool != null) {
            if (qVar == null && bool == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            m5.d.i("Can't serialize an empty precondition", true ^ z7, new Object[0]);
            C0167j0 B9 = C0171l0.B();
            q4.q qVar2 = mVar.f15509a;
            if (qVar2 != null) {
                com.google.protobuf.N0 Z6 = Z(qVar2.f15371a);
                B9.d();
                C0171l0.w((C0171l0) B9.f10006b, Z6);
                c0171l0 = (C0171l0) B9.b();
            } else if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                B9.d();
                C0171l0.v((C0171l0) B9.f10006b, booleanValue);
                c0171l0 = (C0171l0) B9.b();
            } else {
                m5.d.g("Unknown Precondition", new Object[0]);
                throw null;
            }
            N7.d();
            t1.y((t1) N7.f10006b, c0171l0);
        }
        return (t1) N7.b();
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.lang.Iterable] */
    public d1 X(n4.L l8) {
        boolean z7;
        boolean z8;
        c1 A7 = d1.A();
        H4.C0 O7 = H4.X0.O();
        q4.p pVar = l8.f14306d;
        q4.f fVar = (q4.f) this.f14880b;
        String str = l8.f14307e;
        if (str != null) {
            if (pVar.f15351a.size() % 2 == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            m5.d.i("Collection Group queries should be within a document path or root.", z8, new Object[0]);
            String Y3 = Y(fVar, pVar);
            A7.d();
            d1.w((d1) A7.f10006b, Y3);
            H4.D0 z9 = H4.E0.z();
            z9.d();
            H4.E0.v((H4.E0) z9.f10006b, str);
            z9.d();
            H4.E0.w((H4.E0) z9.f10006b);
            O7.d();
            H4.X0.v((H4.X0) O7.f10006b, (H4.E0) z9.b());
        } else {
            if (pVar.f15351a.size() % 2 != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            m5.d.i("Document queries with filters are not supported.", z7, new Object[0]);
            String Y7 = Y(fVar, (q4.p) pVar.k());
            A7.d();
            d1.w((d1) A7.f10006b, Y7);
            H4.D0 z10 = H4.E0.z();
            String f = pVar.f();
            z10.d();
            H4.E0.v((H4.E0) z10.f10006b, f);
            O7.d();
            H4.X0.v((H4.X0) O7.f10006b, (H4.E0) z10.b());
        }
        List list = l8.f14305c;
        if (list.size() > 0) {
            H4.Q0 U7 = U(new C1519e(list, EnumC1518d.AND));
            O7.d();
            H4.X0.w((H4.X0) O7.f10006b, U7);
        }
        for (C1513B c1513b : l8.f14304b) {
            H4.R0 z11 = H4.S0.z();
            if (c1513b.f14267a.equals(EnumC1512A.ASCENDING)) {
                H4.I0 i02 = H4.I0.ASCENDING;
                z11.d();
                H4.S0.w((H4.S0) z11.f10006b, i02);
            } else {
                H4.I0 i03 = H4.I0.DESCENDING;
                z11.d();
                H4.S0.w((H4.S0) z11.f10006b, i03);
            }
            H4.M0 y2 = H4.N0.y();
            String c8 = c1513b.f14268b.c();
            y2.d();
            H4.N0.v((H4.N0) y2.f10006b, c8);
            z11.d();
            H4.S0.v((H4.S0) z11.f10006b, (H4.N0) y2.b());
            O7.d();
            H4.X0.x((H4.X0) O7.f10006b, (H4.S0) z11.b());
        }
        if (l8.e()) {
            com.google.protobuf.L y3 = com.google.protobuf.M.y();
            y3.d();
            com.google.protobuf.M.v((com.google.protobuf.M) y3.f10006b, (int) l8.f);
            O7.d();
            H4.X0.A((H4.X0) O7.f10006b, (com.google.protobuf.M) y3.b());
        }
        C1517c c1517c = l8.f14308g;
        if (c1517c != null) {
            C0195y z12 = C0197z.z();
            ?? r42 = c1517c.f14334b;
            z12.d();
            C0197z.v((C0197z) z12.f10006b, r42);
            z12.d();
            C0197z.w((C0197z) z12.f10006b, c1517c.f14333a);
            O7.d();
            H4.X0.y((H4.X0) O7.f10006b, (C0197z) z12.b());
        }
        C1517c c1517c2 = l8.f14309h;
        if (c1517c2 != null) {
            C0195y z13 = C0197z.z();
            ?? r32 = c1517c2.f14334b;
            z13.d();
            C0197z.v((C0197z) z13.f10006b, r32);
            z13.d();
            C0197z.w((C0197z) z13.f10006b, !c1517c2.f14333a);
            O7.d();
            H4.X0.z((H4.X0) O7.f10006b, (C0197z) z13.b());
        }
        A7.d();
        d1.v((d1) A7.f10006b, (H4.X0) O7.b());
        return (d1) A7.b();
    }

    @Override // androidx.camera.core.impl.InterfaceC0515q
    public androidx.camera.core.impl.u0 a() {
        return (androidx.camera.core.impl.u0) this.f14880b;
    }

    @Override // androidx.camera.core.impl.InterfaceC0515q
    public long b() {
        Long l8 = (Long) ((TotalCaptureResult) this.f14881c).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l8 == null) {
            return -1L;
        }
        return l8.longValue();
    }

    public CameraCharacteristics b0(String str) {
        try {
            return ((CameraManager) this.f14880b).getCameraCharacteristics(str);
        } catch (CameraAccessException e7) {
            throw new C1967a(e7);
        }
    }

    @Override // p4.C
    public void c(ArrayList arrayList) {
        boolean z7;
        if (((InterfaceC1677g) this.f14881c) != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("setIndexManager() not called", z7, new Object[0]);
        e4.c cVar = q4.g.f15354a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q4.h hVar = (q4.h) it.next();
            this.f14880b = ((e4.c) this.f14880b).o(hVar);
            cVar = cVar.m(hVar, q4.n.h(hVar, q4.q.f15370b));
        }
        ((InterfaceC1677g) this.f14881c).u(cVar);
    }

    public CameraPosition c0() {
        try {
            C1742f c1742f = (C1742f) this.f14880b;
            Parcel zzJ = c1742f.zzJ(1, c1742f.zza());
            CameraPosition cameraPosition = (CameraPosition) zzc.zza(zzJ, CameraPosition.CREATOR);
            zzJ.recycle();
            return cameraPosition;
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // p4.InterfaceC1671a
    public void d(m4.i iVar) {
        G4.c cVar;
        m4.h hVar = iVar.f14047b;
        d1 X7 = ((C1608t) ((C0585f) this.f14881c).f8171b).X(hVar.f14044a);
        G4.b B7 = G4.d.B();
        if (hVar.f14045b.equals(EnumC1514C.LIMIT_TO_FIRST)) {
            cVar = G4.c.FIRST;
        } else {
            cVar = G4.c.LAST;
        }
        B7.d();
        G4.d.x((G4.d) B7.f10006b, cVar);
        String y2 = X7.y();
        B7.d();
        G4.d.v((G4.d) B7.f10006b, y2);
        H4.X0 z7 = X7.z();
        B7.d();
        G4.d.w((G4.d) B7.f10006b, z7);
        U3.p pVar = iVar.f14048c.f15371a;
        ((p4.Q) this.f14880b).Q("INSERT OR REPLACE INTO named_queries (name, read_time_seconds, read_time_nanos, bundled_query_proto) VALUES (?, ?, ?, ?)", iVar.f14046a, Long.valueOf(pVar.f5765a), Integer.valueOf(pVar.f5766b), ((G4.d) B7.b()).d());
    }

    public Set d0() {
        return Collections.emptySet();
    }

    @Override // p4.InterfaceC1671a
    public m4.e e(String str) {
        p4.P R7 = ((p4.Q) this.f14880b).R("SELECT schema_version, create_time_seconds, create_time_nanos, total_documents,  total_bytes FROM bundles WHERE bundle_id = ?");
        R7.a(str);
        return (m4.e) R7.d(new K4.e(str, 19));
    }

    public C1006c e0() {
        zza zzaVar;
        try {
            C1742f c1742f = (C1742f) this.f14880b;
            Parcel zzJ = c1742f.zzJ(26, c1742f.zza());
            IBinder readStrongBinder = zzJ.readStrongBinder();
            if (readStrongBinder == null) {
                zzaVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                if (queryLocalInterface instanceof C1738b) {
                    zzaVar = (C1738b) queryLocalInterface;
                } else {
                    zzaVar = new zza(readStrongBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
                }
            }
            zzJ.recycle();
            return new C1006c(zzaVar);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // p4.InterfaceC1671a
    public m4.i f(String str) {
        p4.P R7 = ((p4.Q) this.f14880b).R("SELECT read_time_seconds, read_time_nanos, bundled_query_proto FROM named_queries WHERE name = ?");
        R7.a(str);
        return (m4.i) R7.d(new A4.d(str, 22, this));
    }

    public C0927b f0() {
        zza zzaVar;
        try {
            if (((C0927b) this.f14881c) == null) {
                C1742f c1742f = (C1742f) this.f14880b;
                Parcel zzJ = c1742f.zzJ(25, c1742f.zza());
                IBinder readStrongBinder = zzJ.readStrongBinder();
                if (readStrongBinder == null) {
                    zzaVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (queryLocalInterface instanceof C1739c) {
                        zzaVar = (C1739c) queryLocalInterface;
                    } else {
                        zzaVar = new zza(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    }
                }
                zzJ.recycle();
                this.f14881c = new C0927b(zzaVar);
            }
            return (C0927b) this.f14881c;
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0515q
    public EnumC0512n g() {
        Integer num = (Integer) ((TotalCaptureResult) this.f14881c).get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC0512n.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            if (intValue != 5) {
                                org.slf4j.helpers.i.t("C2CameraCaptureResult", "Undefined ae state: " + num);
                                return EnumC0512n.UNKNOWN;
                            }
                        } else {
                            return EnumC0512n.FLASH_REQUIRED;
                        }
                    } else {
                        return EnumC0512n.LOCKED;
                    }
                } else {
                    return EnumC0512n.CONVERGED;
                }
            }
            return EnumC0512n.SEARCHING;
        }
        return EnumC0512n.INACTIVE;
    }

    public boolean g0(CharSequence charSequence, int i7, int i8, C1856l c1856l) {
        int i9;
        if (c1856l.f15935c == 0) {
            C1847c c1847c = (C1847c) this.f14881c;
            C1879a c8 = c1856l.c();
            int a7 = c8.a(8);
            if (a7 != 0) {
                ((ByteBuffer) c8.f11209d).getShort(a7 + c8.f11206a);
            }
            c1847c.getClass();
            ThreadLocal threadLocal = C1847c.f15913b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i7 < i8) {
                sb.append(charSequence.charAt(i7));
                i7++;
            }
            TextPaint textPaint = c1847c.f15914a;
            String sb2 = sb.toString();
            int i10 = Z.d.f6713a;
            if (textPaint.hasGlyph(sb2)) {
                i9 = 2;
            } else {
                i9 = 1;
            }
            c1856l.f15935c = i9;
        }
        if (c1856l.f15935c == 2) {
            return true;
        }
        return false;
    }

    @Override // p4.C
    public void h(q4.n nVar, q4.q qVar) {
        boolean z7;
        if (((InterfaceC1677g) this.f14881c) != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("setIndexManager() not called", z7, new Object[0]);
        m5.d.i("Cannot add document to the RemoteDocumentCache with a read time of zero", !qVar.equals(q4.q.f15370b), new Object[0]);
        q4.n f = nVar.f();
        f.f15365d = qVar;
        q4.h hVar = nVar.f15362a;
        this.f14880b = ((e4.c) this.f14880b).m(hVar, f);
        ((InterfaceC1677g) this.f14881c).o(hVar.d());
    }

    public void h0(String[] strArr, Runnable runnable) {
        String sb;
        String D4 = AbstractC0059i.D(new StringBuilder("["), TextUtils.join(", ", strArr), "]");
        boolean z7 = false;
        for (int i7 = 0; i7 < strArr.length; i7++) {
            String str = strArr[i7];
            boolean u02 = u0(str);
            if (i7 == 0) {
                z7 = u02;
            } else if (u02 != z7) {
                String M7 = AbstractC0059i.M("Expected all of ", D4, " to either exist or not, but ");
                if (z7) {
                    StringBuilder l8 = androidx.datastore.preferences.protobuf.Y.l(M7);
                    l8.append(strArr[0]);
                    l8.append(" exists and ");
                    l8.append(str);
                    l8.append(" does not");
                    sb = l8.toString();
                } else {
                    StringBuilder l9 = androidx.datastore.preferences.protobuf.Y.l(M7);
                    l9.append(strArr[0]);
                    l9.append(" does not exist and ");
                    l9.append(str);
                    l9.append(" does");
                    sb = l9.toString();
                }
                throw new IllegalStateException(sb);
            }
        }
        if (!z7) {
            runnable.run();
        } else {
            u4.q.a("SQLiteSchema", AbstractC0059i.M("Skipping migration because all of ", D4, " already exist"), new Object[0]);
        }
    }

    @Override // p4.C
    public HashMap i(n4.D d7, C1709b c1709b, Set set, B5.L l8) {
        HashMap hashMap = new HashMap();
        q4.p pVar = d7.f;
        Iterator n7 = ((e4.c) this.f14880b).n(new q4.h((q4.p) pVar.a(StringUtils.EMPTY)));
        while (n7.hasNext()) {
            Map.Entry entry = (Map.Entry) n7.next();
            q4.n nVar = (q4.n) entry.getValue();
            q4.h hVar = (q4.h) entry.getKey();
            if (!pVar.i(hVar.f15357a)) {
                break;
            } else if (hVar.f15357a.f15351a.size() <= pVar.f15351a.size() + 1 && C1709b.b(nVar).compareTo(c1709b) > 0) {
                q4.h hVar2 = nVar.f15362a;
                if (set.contains(hVar2) || d7.g(nVar)) {
                    hashMap.put(hVar2, nVar.f());
                }
            }
        }
        return hashMap;
    }

    @Override // p4.C
    public q4.n j(q4.h hVar) {
        q4.n nVar = (q4.n) ((e4.c) this.f14880b).f(hVar);
        if (nVar != null) {
            return nVar.f();
        }
        return q4.n.g(hVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0515q
    public EnumC0514p k() {
        Integer num = (Integer) ((TotalCaptureResult) this.f14881c).get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC0514p.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        org.slf4j.helpers.i.t("C2CameraCaptureResult", "Undefined awb state: " + num);
                        return EnumC0514p.UNKNOWN;
                    }
                    return EnumC0514p.LOCKED;
                }
                return EnumC0514p.CONVERGED;
            }
            return EnumC0514p.METERING;
        }
        return EnumC0514p.INACTIVE;
    }

    public void k0(String str) {
        A.l lVar = (A.l) this.f14880b;
        lVar.f25a = false;
        lVar.f26b = null;
        ((C0585f) this.f14881c).K(str);
    }

    @Override // p4.C
    public void l(InterfaceC1677g interfaceC1677g) {
        this.f14881c = interfaceC1677g;
    }

    public void l0(String str, G.k kVar, CameraDevice.StateCallback stateCallback) {
        kVar.getClass();
        stateCallback.getClass();
        try {
            ((CameraManager) this.f14880b).openCamera(str, new C1930o(kVar, stateCallback), (Handler) ((C1608t) this.f14881c).f14881c);
        } catch (CameraAccessException e7) {
            throw new C1967a(e7);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0515q
    public CaptureResult m() {
        return (TotalCaptureResult) this.f14881c;
    }

    public e4.e m0(int i7) {
        e4.d f = ((e4.e) this.f14881c).f(new C1673c(q4.h.b(), i7));
        e4.e eVar = q4.h.f15356c;
        while (((Iterator) f.f10875b).hasNext()) {
            C1673c c1673c = (C1673c) f.next();
            if (c1673c.f15245b != i7) {
                break;
            }
            eVar = eVar.e(c1673c.f15244a);
        }
        return eVar;
    }

    @Override // androidx.camera.core.impl.InterfaceC0515q
    public EnumC0513o n() {
        Integer num = (Integer) ((TotalCaptureResult) this.f14881c).get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC0513o.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return EnumC0513o.INACTIVE;
            case 1:
            case 3:
                return EnumC0513o.SCANNING;
            case 2:
                return EnumC0513o.PASSIVE_FOCUSED;
            case 4:
                return EnumC0513o.LOCKED_FOCUSED;
            case 5:
                return EnumC0513o.LOCKED_NOT_FOCUSED;
            case 6:
                return EnumC0513o.PASSIVE_NOT_FOCUSED;
            default:
                org.slf4j.helpers.i.t("C2CameraCaptureResult", "Undefined af state: " + num);
                return EnumC0513o.UNKNOWN;
        }
    }

    public void n0(G.k kVar, C1932q c1932q) {
        x.o oVar;
        C1608t c1608t = (C1608t) this.f14881c;
        synchronized (((HashMap) c1608t.f14880b)) {
            try {
                oVar = (x.o) ((HashMap) c1608t.f14880b).get(c1932q);
                if (oVar == null) {
                    oVar = new x.o(kVar, c1932q);
                    ((HashMap) c1608t.f14880b).put(c1932q, oVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ((CameraManager) this.f14880b).registerAvailabilityCallback(oVar, (Handler) c1608t.f14881c);
    }

    @Override // p4.C
    public Map o(String str, C1709b c1709b, int i7) {
        throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
    }

    public e4.e o0(int i7) {
        e4.d f = ((e4.e) this.f14881c).f(new C1673c(q4.h.b(), i7));
        e4.e eVar = q4.h.f15356c;
        while (((Iterator) f.f10875b).hasNext()) {
            C1673c c1673c = (C1673c) f.next();
            if (c1673c.f15245b != i7) {
                break;
            }
            eVar = eVar.e(c1673c.f15244a);
            this.f14880b = ((e4.e) this.f14880b).h(c1673c);
            this.f14881c = ((e4.e) this.f14881c).h(c1673c);
        }
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // L5.p
    public void onMethodCall(L5.o call, L5.q qVar) {
        int i7;
        boolean isLocationEnabled;
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        switch (this.f14879a) {
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                String str = call.f3038a;
                str.getClass();
                Context context = (Context) this.f14880b;
                C1883b c1883b = (C1883b) this.f14881c;
                Object obj = call.f3039b;
                char c8 = 65535;
                switch (str.hashCode()) {
                    case -1544053025:
                        if (str.equals("checkServiceStatus")) {
                            c8 = 0;
                            break;
                        }
                        break;
                    case -1017315255:
                        if (str.equals("shouldShowRequestPermissionRationale")) {
                            c8 = 1;
                            break;
                        }
                        break;
                    case -576207927:
                        if (str.equals("checkPermissionStatus")) {
                            c8 = 2;
                            break;
                        }
                        break;
                    case 347240634:
                        if (str.equals("openAppSettings")) {
                            c8 = 3;
                            break;
                        }
                        break;
                    case 1669188213:
                        if (str.equals("requestPermissions")) {
                            c8 = 4;
                            break;
                        }
                        break;
                }
                switch (c8) {
                    case 0:
                        int parseInt = Integer.parseInt(obj.toString());
                        if (context == null) {
                            Log.d("permissions_handler", "Context cannot be null.");
                            ((K5.r) qVar).b(null, "PermissionHandler.ServiceManager", "Android context cannot be null.");
                            return;
                        } else if (parseInt != 3 && parseInt != 4 && parseInt != 5) {
                            if (parseInt == 21) {
                                ((K5.r) qVar).a(Integer.valueOf(((BluetoothManager) context.getSystemService("bluetooth")).getAdapter().isEnabled() ? 1 : 0));
                                return;
                            } else if (parseInt == 8) {
                                PackageManager packageManager = context.getPackageManager();
                                if (!packageManager.hasSystemFeature("android.hardware.telephony")) {
                                    ((K5.r) qVar).a(2);
                                    return;
                                }
                                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                                if (telephonyManager != null && telephonyManager.getPhoneType() != 0) {
                                    Intent intent = new Intent("android.intent.action.CALL");
                                    intent.setData(Uri.parse("tel:123123"));
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        of = PackageManager.ResolveInfoFlags.of(0L);
                                        queryIntentActivities = packageManager.queryIntentActivities(intent, of);
                                    } else {
                                        queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                                    }
                                    if (queryIntentActivities.isEmpty()) {
                                        ((K5.r) qVar).a(2);
                                        return;
                                    } else if (telephonyManager.getSimState() != 5) {
                                        ((K5.r) qVar).a(0);
                                        return;
                                    } else {
                                        ((K5.r) qVar).a(1);
                                        return;
                                    }
                                }
                                ((K5.r) qVar).a(2);
                                return;
                            } else if (parseInt == 16) {
                                ((K5.r) qVar).a(1);
                                return;
                            } else {
                                ((K5.r) qVar).a(2);
                                return;
                            }
                        } else {
                            if (Build.VERSION.SDK_INT >= 28) {
                                LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
                                if (locationManager != null) {
                                    isLocationEnabled = locationManager.isLocationEnabled();
                                    i7 = isLocationEnabled;
                                }
                                i7 = 0;
                            } else {
                                try {
                                    if (Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0) {
                                        i7 = 1;
                                    }
                                } catch (Settings.SettingNotFoundException e7) {
                                    e7.printStackTrace();
                                }
                                i7 = 0;
                            }
                            ((K5.r) qVar).a(Integer.valueOf(i7));
                            return;
                        }
                    case 1:
                        int parseInt2 = Integer.parseInt(obj.toString());
                        AbstractActivityC0032e abstractActivityC0032e = c1883b.f16037c;
                        if (abstractActivityC0032e == null) {
                            Log.d("permissions_handler", "Unable to detect current Activity.");
                            ((K5.r) qVar).b(null, "PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
                            return;
                        }
                        ArrayList p7 = android.support.v4.media.session.a.p(abstractActivityC0032e, parseInt2);
                        if (p7 == null) {
                            Log.d("permissions_handler", "No android specific permissions needed for: " + parseInt2);
                            ((K5.r) qVar).a(Boolean.FALSE);
                            return;
                        } else if (p7.isEmpty()) {
                            Log.d("permissions_handler", "No permissions found in manifest for: " + parseInt2 + " no need to show request rationale");
                            ((K5.r) qVar).a(Boolean.FALSE);
                            return;
                        } else {
                            ((K5.r) qVar).a(Boolean.valueOf(AbstractC0359b.b(c1883b.f16037c, (String) p7.get(0))));
                            return;
                        }
                    case 2:
                        ((K5.r) qVar).a(Integer.valueOf(c1883b.a(Integer.parseInt(obj.toString()))));
                        return;
                    case 3:
                        if (context == null) {
                            Log.d("permissions_handler", "Context cannot be null.");
                            ((K5.r) qVar).b(null, "PermissionHandler.AppSettingsManager", "Android context cannot be null.");
                            return;
                        }
                        try {
                            Intent intent2 = new Intent();
                            intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent2.addCategory("android.intent.category.DEFAULT");
                            intent2.setData(Uri.parse("package:" + context.getPackageName()));
                            intent2.addFlags(268435456);
                            intent2.addFlags(1073741824);
                            intent2.addFlags(8388608);
                            context.startActivity(intent2);
                            ((K5.r) qVar).a(Boolean.TRUE);
                            return;
                        } catch (Exception unused) {
                            ((K5.r) qVar).a(Boolean.FALSE);
                            return;
                        }
                    case 4:
                        List<Integer> list = (List) obj;
                        K5.r rVar = (K5.r) qVar;
                        K5.m mVar = new K5.m(rVar, 5);
                        if (c1883b.f16038d > 0) {
                            rVar.b(null, "PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).");
                            return;
                        } else if (c1883b.f16037c == null) {
                            Log.d("permissions_handler", "Unable to detect current Activity.");
                            rVar.b(null, "PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
                            return;
                        } else {
                            c1883b.f16036b = mVar;
                            c1883b.f16039e = new HashMap();
                            c1883b.f16038d = 0;
                            ArrayList arrayList = new ArrayList();
                            for (Integer num : list) {
                                if (c1883b.a(num.intValue()) == 1) {
                                    if (!c1883b.f16039e.containsKey(num)) {
                                        c1883b.f16039e.put(num, 1);
                                    }
                                } else {
                                    ArrayList p8 = android.support.v4.media.session.a.p(c1883b.f16037c, num.intValue());
                                    if (p8 != null && !p8.isEmpty()) {
                                        int i8 = Build.VERSION.SDK_INT;
                                        if (num.intValue() == 16) {
                                            c1883b.c(209, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                                        } else if (i8 >= 30 && num.intValue() == 22) {
                                            c1883b.c(210, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                                        } else if (num.intValue() == 23) {
                                            c1883b.c(211, "android.settings.action.MANAGE_OVERLAY_PERMISSION");
                                        } else if (i8 >= 26 && num.intValue() == 24) {
                                            c1883b.c(212, "android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                                        } else if (num.intValue() == 27) {
                                            c1883b.c(213, "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
                                        } else if (i8 >= 31 && num.intValue() == 34) {
                                            c1883b.c(214, "android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                                        } else if (num.intValue() != 37 && num.intValue() != 0) {
                                            arrayList.addAll(p8);
                                            c1883b.f16038d = p8.size() + c1883b.f16038d;
                                        } else if (c1883b.b()) {
                                            arrayList.add("android.permission.WRITE_CALENDAR");
                                            arrayList.add("android.permission.READ_CALENDAR");
                                            c1883b.f16038d += 2;
                                        } else {
                                            c1883b.f16039e.put(num, 0);
                                        }
                                    } else if (!c1883b.f16039e.containsKey(num)) {
                                        c1883b.f16039e.put(num, 0);
                                        if (num.intValue() == 22 && Build.VERSION.SDK_INT < 30) {
                                            c1883b.f16039e.put(num, 2);
                                        } else {
                                            c1883b.f16039e.put(num, 0);
                                        }
                                    }
                                }
                            }
                            if (arrayList.size() > 0) {
                                AbstractC0359b.a(c1883b.f16037c, (String[]) arrayList.toArray(new String[0]), 24);
                            }
                            K5.m mVar2 = c1883b.f16036b;
                            if (mVar2 != null && c1883b.f16038d == 0) {
                                mVar2.f2706b.a(c1883b.f16039e);
                                return;
                            }
                            return;
                        }
                    default:
                        ((K5.r) qVar).c();
                        return;
                }
            default:
                kotlin.jvm.internal.j.e(call, "call");
                Object obj2 = call.f3039b;
                if (obj2 instanceof Map) {
                    w5.c cVar = (w5.c) this.f14881c;
                    cVar.getClass();
                    AtomicBoolean atomicBoolean = cVar.f16373b;
                    if (atomicBoolean.compareAndSet(true, false)) {
                        SharePlusPendingIntent.f10503a = StringUtils.EMPTY;
                        atomicBoolean.set(false);
                        cVar.f16372a = (K5.r) qVar;
                    } else {
                        K5.r rVar2 = cVar.f16372a;
                        if (rVar2 != null) {
                            rVar2.a("dev.fluttercommunity.plus/share/unavailable");
                        }
                        SharePlusPendingIntent.f10503a = StringUtils.EMPTY;
                        atomicBoolean.set(false);
                        cVar.f16372a = (K5.r) qVar;
                    }
                    try {
                        if (kotlin.jvm.internal.j.a(call.f3038a, "share")) {
                            kotlin.jvm.internal.j.b(obj2);
                            ((F3.o) this.f14880b).v((Map) obj2);
                            return;
                        }
                        ((K5.r) qVar).c();
                        return;
                    } catch (Throwable th) {
                        cVar.f16373b.set(true);
                        cVar.f16372a = null;
                        ((K5.r) qVar).b(th, "Share failed", th.getMessage());
                        return;
                    }
                }
                throw new IllegalArgumentException("Map arguments expected");
        }
    }

    @Override // H.c
    public void onSuccess(Object obj) {
        Void r12 = (Void) obj;
        ((Surface) this.f14880b).release();
        ((SurfaceTexture) this.f14881c).release();
    }

    @Override // p4.C
    public HashMap p(Iterable iterable) {
        HashMap hashMap = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            q4.h hVar = (q4.h) it.next();
            hashMap.put(hVar, j(hVar));
        }
        return hashMap;
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r11v0 ??, r11v2 ??, r11v4 ??, r11v3 ??, r11v6 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.tryToFixIncompatiblePrimitives(TypeInferenceVisitor.java:884)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:109)
        */
    public void p0(int r26) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1608t.p0(int):void");
    }

    @Override // p4.InterfaceC1671a
    public void q(m4.e eVar) {
        Integer valueOf = Integer.valueOf(eVar.f14031b);
        U3.p pVar = eVar.f14032c.f15371a;
        ((p4.Q) this.f14880b).Q("INSERT OR REPLACE INTO bundles (bundle_id, schema_version, create_time_seconds, create_time_nanos, total_documents, total_bytes) VALUES (?, ?, ?, ?, ?, ?)", eVar.f14030a, valueOf, Long.valueOf(pVar.f5765a), Integer.valueOf(pVar.f5766b), Integer.valueOf(eVar.f14033d), Long.valueOf(eVar.f14034e));
    }

    public int q0(CaptureRequest captureRequest, G.k kVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f14880b).setRepeatingRequest(captureRequest, new A.k(kVar, captureCallback), (Handler) ((C0927b) this.f14881c).f10587a);
    }

    public C1766A r(C1767B c1767b) {
        try {
            C1742f c1742f = (C1742f) this.f14880b;
            Parcel zza = c1742f.zza();
            zzc.zzd(zza, c1767b);
            Parcel zzJ = c1742f.zzJ(13, zza);
            zzam zzb = zzal.zzb(zzJ.readStrongBinder());
            zzJ.recycle();
            if (zzb != null) {
                return new C1766A(zzb);
            }
            return null;
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public void r0(boolean z7) {
        try {
            C1742f c1742f = (C1742f) this.f14880b;
            Parcel zza = c1742f.zza();
            int i7 = zzc.zza;
            zza.writeInt(z7 ? 1 : 0);
            c1742f.zzc(18, zza);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public void s() {
        p4.P p7 = (p4.P) this.f14880b;
        if (p7 != null) {
            ((AtomicBoolean) p7.f15211b).set(true);
            ((ScheduledFuture) p7.f15210a).cancel(true);
        }
        this.f14880b = null;
    }

    public List s0(CharSequence charSequence) {
        charSequence.getClass();
        z3.m mVar = new z3.m((C0415A) this.f14881c, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (mVar.hasNext()) {
            arrayList.add((String) mVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public int t(ArrayList arrayList, G.k kVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f14880b).captureBurst(arrayList, new A.k(kVar, captureCallback), (Handler) ((C0927b) this.f14881c).f10587a);
    }

    public boolean t0(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = ((SQLiteDatabase) this.f14880b).rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursor.getColumnIndex("name");
            while (cursor.moveToNext()) {
                arrayList.add(cursor.getString(columnIndex));
            }
            cursor.close();
            if (arrayList.indexOf(str2) != -1) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public boolean u0(String str) {
        Cursor rawQueryWithFactory = ((SQLiteDatabase) this.f14880b).rawQueryWithFactory(new p4.O(new Object[]{str}, 0), "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?", null, null);
        try {
            boolean z7 = !rawQueryWithFactory.moveToFirst();
            rawQueryWithFactory.close();
            return !z7;
        } catch (Throwable th) {
            if (rawQueryWithFactory != null) {
                try {
                    rawQueryWithFactory.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean v(q4.h hVar) {
        e4.d f = ((e4.e) this.f14880b).f(new C1673c(hVar, 0));
        if (!((Iterator) f.f10875b).hasNext()) {
            return false;
        }
        return ((C1673c) f.next()).f15244a.equals(hVar);
    }

    public void w(y.u uVar) {
        CameraDevice cameraDevice = (CameraDevice) this.f14880b;
        u(cameraDevice, uVar);
        y.t tVar = uVar.f16601a;
        C1973g c1973g = new C1973g(tVar.g(), tVar.c());
        ArrayList v02 = v0(tVar.d());
        C1006c c1006c = (C1006c) this.f14881c;
        c1006c.getClass();
        C2027g f = tVar.f();
        Handler handler = (Handler) c1006c.f11091a;
        try {
            if (f != null) {
                InputConfiguration inputConfiguration = f.f16577a.f16576a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSession(inputConfiguration, v02, c1973g, handler);
            } else if (tVar.b() == 1) {
                cameraDevice.createConstrainedHighSpeedCaptureSession(v02, c1973g, handler);
            } else {
                try {
                    cameraDevice.createCaptureSession(v02, c1973g, handler);
                } catch (CameraAccessException e7) {
                    throw new C1967a(e7);
                }
            }
        } catch (CameraAccessException e8) {
            throw new C1967a(e8);
        }
    }

    public void w0(CameraManager.AvailabilityCallback availabilityCallback) {
        x.o oVar;
        if (availabilityCallback != null) {
            C1608t c1608t = (C1608t) this.f14881c;
            synchronized (((HashMap) c1608t.f14880b)) {
                oVar = (x.o) ((HashMap) c1608t.f14880b).remove(availabilityCallback);
            }
        } else {
            oVar = null;
        }
        if (oVar != null) {
            oVar.a();
        }
        ((CameraManager) this.f14880b).unregisterAvailabilityCallback(oVar);
    }

    public void x0(C0365h c0365h, boolean z7) {
        PendingIntent pendingIntent;
        int i7;
        S0.t tVar = (S0.t) c0365h.f6035g;
        String str = tVar.f4912b;
        Context context = (Context) this.f14880b;
        int identifier = context.getResources().getIdentifier(str, tVar.f4913c, context.getPackageName());
        if (identifier == 0) {
            context.getResources().getIdentifier("ic_launcher.png", "mipmap", context.getPackageName());
        }
        C0372o c0372o = (C0372o) this.f14881c;
        c0372o.getClass();
        c0372o.f6062e = C0372o.b((String) c0365h.f6033d);
        c0372o.f6055G.icon = identifier;
        c0372o.f = C0372o.b((String) c0365h.f6034e);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setPackage(null);
            launchIntentForPackage.setFlags(270532608);
            if (Build.VERSION.SDK_INT > 23) {
                i7 = 201326592;
            } else {
                i7 = 134217728;
            }
            pendingIntent = PendingIntent.getActivity(context, 0, launchIntentForPackage, i7);
        } else {
            pendingIntent = null;
        }
        c0372o.f6063g = pendingIntent;
        c0372o.c(2, c0365h.f6032c);
        this.f14881c = c0372o;
        Integer num = (Integer) c0365h.f6036h;
        if (num != null) {
            c0372o.f6081z = num.intValue();
            this.f14881c = c0372o;
        }
        if (z7) {
            new W.L(context).c(null, 75415, ((C0372o) this.f14881c).a());
        }
    }

    public q4.h y(String str) {
        q4.p l8 = q4.p.l(str);
        m5.d.i("Tried to deserialize invalid key %s", i0(l8), l8);
        String g3 = l8.g(1);
        q4.f fVar = (q4.f) this.f14880b;
        m5.d.i("Tried to deserialize key from different project.", g3.equals(fVar.f15352a), new Object[0]);
        m5.d.i("Tried to deserialize key from different database.", l8.g(3).equals(fVar.f15353b), new Object[0]);
        return new q4.h(a0(l8));
    }

    public void y0(EnumC0520w enumC0520w, C0057g c0057g) {
        C0056f c0056f;
        switch (AbstractC1898H.f16074a[enumC0520w.ordinal()]) {
            case 1:
                androidx.camera.core.impl.B b5 = (androidx.camera.core.impl.B) this.f14880b;
                synchronized (b5.f7526b) {
                    Iterator it = b5.f7529e.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((androidx.camera.core.impl.A) ((Map.Entry) it.next()).getValue()).f7521a == EnumC0520w.CLOSING) {
                                c0056f = new C0056f(EnumC0071v.OPENING, null);
                            }
                        } else {
                            c0056f = new C0056f(EnumC0071v.PENDING_OPEN, null);
                        }
                    }
                }
                break;
            case 2:
                c0056f = new C0056f(EnumC0071v.OPENING, c0057g);
                break;
            case 3:
            case 4:
                c0056f = new C0056f(EnumC0071v.OPEN, c0057g);
                break;
            case 5:
            case 6:
                c0056f = new C0056f(EnumC0071v.CLOSING, c0057g);
                break;
            case 7:
            case 8:
                c0056f = new C0056f(EnumC0071v.CLOSED, c0057g);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + enumC0520w);
        }
        org.slf4j.helpers.i.l("CameraStateMachine", "New public camera state " + c0056f + " from " + enumC0520w + " and " + c0057g);
        if (!Objects.equals((C0056f) ((androidx.lifecycle.C) this.f14881c).d(), c0056f)) {
            org.slf4j.helpers.i.l("CameraStateMachine", "Publishing new public camera state " + c0056f);
            ((androidx.lifecycle.C) this.f14881c).i(c0056f);
        }
    }

    @Override // H.c
    public void z(Throwable th) {
        throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
    }

    public /* synthetic */ C1608t(int i7, boolean z7) {
        this.f14879a = i7;
    }

    public C1608t(C1742f c1742f) {
        this.f14879a = 7;
        new HashMap();
        new HashMap();
        com.google.android.gms.common.internal.I.i(c1742f);
        this.f14880b = c1742f;
    }

    public C1608t(F3.o oVar, w5.c manager) {
        this.f14879a = 19;
        kotlin.jvm.internal.j.e(manager, "manager");
        this.f14880b = oVar;
        this.f14881c = manager;
    }

    public C1608t(Context context, C0639a c0639a, C1883b c1883b, com.google.firebase.firestore.Z z7) {
        this.f14879a = 12;
        this.f14880b = context;
        this.f14881c = c1883b;
    }

    public C1608t(z0.L fragmentManager) {
        this.f14879a = 27;
        kotlin.jvm.internal.j.e(fragmentManager, "fragmentManager");
        this.f14880b = fragmentManager;
        this.f14881c = new CopyOnWriteArrayList();
    }

    public C1608t(Context context, C0365h c0365h) {
        this.f14879a = 9;
        this.f14880b = context;
        C0372o c0372o = new C0372o(context, "geolocator_channel_01");
        c0372o.f6066k = 1;
        this.f14881c = c0372o;
        x0(c0365h, false);
    }

    public C1608t(CameraCaptureSession cameraCaptureSession, C0927b c0927b) {
        this.f14879a = 20;
        cameraCaptureSession.getClass();
        this.f14880b = cameraCaptureSession;
        this.f14881c = c0927b;
    }

    public C1608t(CameraDevice cameraDevice, C1006c c1006c) {
        this.f14879a = 21;
        cameraDevice.getClass();
        this.f14880b = cameraDevice;
        this.f14881c = c1006c;
    }

    public C1608t(androidx.camera.core.impl.B b5) {
        this.f14879a = 16;
        this.f14880b = b5;
        androidx.lifecycle.C c8 = new androidx.lifecycle.C();
        this.f14881c = c8;
        c8.i(new C0056f(EnumC0071v.CLOSED, null));
    }

    public C1608t(Context context, C1608t c1608t) {
        this.f14879a = 23;
        this.f14880b = (CameraManager) context.getSystemService("camera");
        this.f14881c = c1608t;
    }

    public C1608t(int i7) {
        this.f14879a = i7;
        switch (i7) {
            case 24:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(RecognitionOptions.UPC_A);
                this.f14880b = byteArrayOutputStream;
                this.f14881c = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                this.f14880b = new e4.e(Collections.emptyList(), C1673c.f15242c);
                this.f14881c = new e4.e(Collections.emptyList(), C1673c.f15243d);
                return;
        }
    }

    public C1608t(Context context, Object obj, LinkedHashSet linkedHashSet) {
        x.p a7;
        this.f14879a = 15;
        C1372c c1372c = new C1372c(23);
        this.f14880b = new HashMap();
        this.f14881c = c1372c;
        if (obj instanceof x.p) {
            a7 = (x.p) obj;
        } else {
            a7 = x.p.a(context, F.f.q());
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ((HashMap) this.f14880b).put(str, new C1910U(context, str, a7, (C1372c) this.f14881c));
        }
    }

    public C1608t(q4.f fVar) {
        this.f14879a = 10;
        this.f14880b = fVar;
        List asList = Arrays.asList("projects", fVar.f15352a, "databases", fVar.f15353b);
        q4.p pVar = q4.p.f15369b;
        this.f14881c = (asList.isEmpty() ? q4.p.f15369b : new q4.e(asList)).c();
    }

    public C1608t(E.e eVar, C0993a c0993a, C1847c c1847c) {
        this.f14879a = 11;
        this.f14880b = eVar;
        this.f14881c = c1847c;
    }

    public C1608t(C0415A c0415a, z3.e eVar) {
        this.f14879a = 29;
        this.f14881c = c0415a;
        this.f14880b = eVar;
    }

    public C1608t(Handler handler) {
        this.f14879a = 22;
        this.f14880b = new HashMap();
        this.f14881c = handler;
    }

    public C1608t(Animation animation) {
        this.f14879a = 26;
        this.f14880b = animation;
        this.f14881c = null;
    }

    public C1608t(Animator animator) {
        this.f14879a = 26;
        this.f14880b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f14881c = animatorSet;
        animatorSet.play(animator);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.text.Editable$Factory, w0.a] */
    public C1608t(AbstractC1595m abstractC1595m) {
        this.f14879a = 18;
        this.f14880b = abstractC1595m;
        w0.h hVar = new w0.h(abstractC1595m);
        this.f14881c = hVar;
        abstractC1595m.addTextChangedListener(hVar);
        if (C1942a.f16314b == null) {
            synchronized (C1942a.f16313a) {
                try {
                    if (C1942a.f16314b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            C1942a.f16315c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C1942a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C1942a.f16314b = factory;
                    }
                } finally {
                }
            }
        }
        abstractC1595m.setEditableFactory(C1942a.f16314b);
    }

    public C1608t(C1936u c1936u) {
        this.f14879a = 14;
        this.f14881c = c1936u;
        this.f14880b = null;
    }
}
