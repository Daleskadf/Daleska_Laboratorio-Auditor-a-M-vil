package io.flutter.plugins.googlemaps;

import H4.e1;
import H4.p1;
import a.AbstractC0412a;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.libraries.barhopper.RecognitionOptions;
import e0.C0927b;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.tika.utils.XMLReaderUtils;
import p.C1608t;
import r3.C1739c;
import r3.C1742f;
import s3.C1766A;
import s3.C1786n;
/* renamed from: io.flutter.plugins.googlemaps.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1191y implements L5.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12306a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1177j f12307b;

    public /* synthetic */ C1191y(C1177j c1177j, int i7) {
        this.f12306a = i7;
        this.f12307b = c1177j;
    }

    @Override // L5.b
    public final void j(Object obj, A.f fVar) {
        C1608t c1608t;
        C1608t c1608t2;
        C1187u c1187u;
        C1187u c1187u2;
        boolean zzH;
        C1608t c1608t3;
        C0927b f02;
        C0927b f03;
        C0927b f04;
        switch (this.f12306a) {
            case 0:
                io.flutter.plugins.firebase.storage.g gVar = new io.flutter.plugins.firebase.storage.g(new ArrayList(), fVar, 5);
                C1177j c1177j = this.f12307b;
                if (c1177j.f == null) {
                    c1177j.f12201k0 = gVar;
                    return;
                } else {
                    gVar.f();
                    return;
                }
            case 1:
                C1177j c1177j2 = this.f12307b;
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(0, Boolean.valueOf(c1177j2.S((String) ((ArrayList) obj).get(0))));
                } catch (Throwable th) {
                    arrayList = android.support.v4.media.session.a.H(th);
                }
                fVar.h(arrayList);
                return;
            case 2:
                C1177j c1177j3 = this.f12307b;
                ArrayList arrayList2 = new ArrayList();
                i0 i0Var = (i0) ((ArrayList) obj).get(0);
                try {
                    c1177j3.getClass();
                    AbstractC0412a.z(i0Var, c1177j3);
                    arrayList2.add(0, null);
                } catch (Throwable th2) {
                    arrayList2 = android.support.v4.media.session.a.H(th2);
                }
                fVar.h(arrayList2);
                return;
            case 3:
                C1177j c1177j4 = this.f12307b;
                ArrayList arrayList3 = new ArrayList();
                try {
                    arrayList3.add(0, Boolean.valueOf(c1177j4.f12185G0));
                } catch (Throwable th3) {
                    arrayList3 = android.support.v4.media.session.a.H(th3);
                }
                fVar.h(arrayList3);
                return;
            case 4:
                C1177j c1177j5 = this.f12307b;
                ArrayList arrayList4 = new ArrayList();
                String str = (String) ((ArrayList) obj).get(0);
                try {
                    R1.j jVar = c1177j5.f12209t0;
                    if (str == null) {
                        jVar.getClass();
                    } else {
                        C0 c02 = (C0) ((HashMap) jVar.f4682b).get(str);
                        if (c02 != null) {
                            C1766A c1766a = c02.f12039a;
                            c1766a.getClass();
                            try {
                                c1766a.f15575a.zzh();
                            } catch (RemoteException e7) {
                                throw new RuntimeException(e7);
                            }
                        }
                    }
                    arrayList4.add(0, null);
                } catch (Throwable th4) {
                    arrayList4 = android.support.v4.media.session.a.H(th4);
                }
                fVar.h(arrayList4);
                return;
            case 5:
                io.flutter.plugins.firebase.storage.g gVar2 = new io.flutter.plugins.firebase.storage.g(new ArrayList(), fVar, 6);
                C1608t c1608t4 = this.f12307b.f;
                if (c1608t4 == null) {
                    gVar2.b(new C1190x(null, "GoogleMap uninitialized", "takeSnapshot"));
                    return;
                }
                X5.E e8 = new X5.E(gVar2, 13);
                try {
                    C1742f c1742f = (C1742f) c1608t4.f14880b;
                    q3.i iVar = new q3.i(e8);
                    Parcel zza = c1742f.zza();
                    zzc.zze(zza, iVar);
                    zzc.zze(zza, null);
                    c1742f.zzc(38, zza);
                    return;
                } catch (RemoteException e9) {
                    throw new RuntimeException(e9);
                }
            case 6:
                C1177j c1177j6 = this.f12307b;
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = (ArrayList) obj;
                try {
                    c1177j6.O((List) arrayList6.get(0), (List) arrayList6.get(1), (List) arrayList6.get(2));
                    arrayList5.add(0, null);
                } catch (Throwable th5) {
                    arrayList5 = android.support.v4.media.session.a.H(th5);
                }
                fVar.h(arrayList5);
                return;
            case 7:
                C1177j c1177j7 = this.f12307b;
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = (ArrayList) obj;
                try {
                    c1177j7.R((List) arrayList8.get(0), (List) arrayList8.get(1), (List) arrayList8.get(2));
                    arrayList7.add(0, null);
                } catch (Throwable th6) {
                    arrayList7 = android.support.v4.media.session.a.H(th6);
                }
                fVar.h(arrayList7);
                return;
            case 8:
                C1177j c1177j8 = this.f12307b;
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = (ArrayList) obj;
                try {
                    c1177j8.P((List) arrayList10.get(0), (List) arrayList10.get(1));
                    arrayList9.add(0, null);
                } catch (Throwable th7) {
                    arrayList9 = android.support.v4.media.session.a.H(th7);
                }
                fVar.h(arrayList9);
                return;
            case 9:
                C1177j c1177j9 = this.f12307b;
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = (ArrayList) obj;
                try {
                    c1177j9.T((List) arrayList12.get(0), (List) arrayList12.get(1), (List) arrayList12.get(2));
                    arrayList11.add(0, null);
                } catch (Throwable th8) {
                    arrayList11 = android.support.v4.media.session.a.H(th8);
                }
                fVar.h(arrayList11);
                return;
            case 10:
                C1177j c1177j10 = this.f12307b;
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = (ArrayList) obj;
                try {
                    c1177j10.V((List) arrayList14.get(0), (List) arrayList14.get(1), (List) arrayList14.get(2));
                    arrayList13.add(0, null);
                } catch (Throwable th9) {
                    arrayList13 = android.support.v4.media.session.a.H(th9);
                }
                fVar.h(arrayList13);
                return;
            case 11:
                C1177j c1177j11 = this.f12307b;
                ArrayList arrayList15 = new ArrayList();
                try {
                    arrayList15.add(0, c1177j11.H((f0) ((ArrayList) obj).get(0)));
                } catch (Throwable th10) {
                    arrayList15 = android.support.v4.media.session.a.H(th10);
                }
                fVar.h(arrayList15);
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                C1177j c1177j12 = this.f12307b;
                ArrayList arrayList16 = new ArrayList();
                ArrayList arrayList17 = (ArrayList) obj;
                try {
                    c1177j12.X((List) arrayList17.get(0), (List) arrayList17.get(1), (List) arrayList17.get(2));
                    arrayList16.add(0, null);
                } catch (Throwable th11) {
                    arrayList16 = android.support.v4.media.session.a.H(th11);
                }
                fVar.h(arrayList16);
                return;
            case 13:
                C1177j c1177j13 = this.f12307b;
                ArrayList arrayList18 = new ArrayList();
                ArrayList arrayList19 = (ArrayList) obj;
                try {
                    c1177j13.Y((List) arrayList19.get(0), (List) arrayList19.get(1), (List) arrayList19.get(2));
                    arrayList18.add(0, null);
                } catch (Throwable th12) {
                    arrayList18 = android.support.v4.media.session.a.H(th12);
                }
                fVar.h(arrayList18);
                return;
            case 14:
                C1177j c1177j14 = this.f12307b;
                ArrayList arrayList20 = new ArrayList();
                ArrayList arrayList21 = (ArrayList) obj;
                try {
                    c1177j14.Q((List) arrayList21.get(0), (List) arrayList21.get(1), (List) arrayList21.get(2));
                    arrayList20.add(0, null);
                } catch (Throwable th13) {
                    arrayList20 = android.support.v4.media.session.a.H(th13);
                }
                fVar.h(arrayList20);
                return;
            case 15:
                C1177j c1177j15 = this.f12307b;
                ArrayList arrayList22 = new ArrayList();
                try {
                    arrayList22.add(0, c1177j15.G((o0) ((ArrayList) obj).get(0)));
                } catch (Throwable th14) {
                    arrayList22 = android.support.v4.media.session.a.H(th14);
                }
                fVar.h(arrayList22);
                return;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                C1177j c1177j16 = this.f12307b;
                ArrayList arrayList23 = new ArrayList();
                try {
                    c1608t = c1177j16.f;
                } catch (Throwable th15) {
                    arrayList23 = android.support.v4.media.session.a.H(th15);
                }
                if (c1608t != null) {
                    arrayList23.add(0, AbstractC0412a.F(c1608t.e0().D().f15586e));
                    fVar.h(arrayList23);
                    return;
                }
                throw new C1190x(null, "GoogleMap uninitialized", "getVisibleRegion called prior to map initialization");
            case 17:
                C1177j c1177j17 = this.f12307b;
                ArrayList arrayList24 = new ArrayList();
                try {
                    c1177j17.L((K) ((ArrayList) obj).get(0));
                    arrayList24.add(0, null);
                } catch (Throwable th16) {
                    arrayList24 = android.support.v4.media.session.a.H(th16);
                }
                fVar.h(arrayList24);
                return;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                C1177j c1177j18 = this.f12307b;
                ArrayList arrayList25 = new ArrayList();
                ArrayList arrayList26 = (ArrayList) obj;
                try {
                    c1177j18.B((K) arrayList26.get(0), (Long) arrayList26.get(1));
                    arrayList25.add(0, null);
                } catch (Throwable th17) {
                    arrayList25 = android.support.v4.media.session.a.H(th17);
                }
                fVar.h(arrayList25);
                return;
            case 19:
                C1177j c1177j19 = this.f12307b;
                ArrayList arrayList27 = new ArrayList();
                try {
                } catch (Throwable th18) {
                    arrayList27 = android.support.v4.media.session.a.H(th18);
                }
                if (c1177j19.f != null) {
                    arrayList27.add(0, Double.valueOf(c1608t2.c0().f9460b));
                    fVar.h(arrayList27);
                    return;
                }
                throw new C1190x(null, "GoogleMap uninitialized", "getZoomLevel called prior to map initialization");
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                C1177j c1177j20 = this.f12307b;
                ArrayList arrayList28 = new ArrayList();
                try {
                    c1187u = (C1187u) c1177j20.f12204n0.f12294b.get((String) ((ArrayList) obj).get(0));
                } catch (Throwable th19) {
                    arrayList28 = android.support.v4.media.session.a.H(th19);
                }
                if (c1187u != null) {
                    C1786n c1786n = (C1786n) c1187u.f12283a.get();
                    if (c1786n != null) {
                        try {
                            c1786n.f15625a.zzD();
                        } catch (RemoteException e10) {
                            throw new RuntimeException(e10);
                        }
                    }
                    arrayList28.add(0, null);
                    fVar.h(arrayList28);
                    return;
                }
                throw new C1190x(null, "Invalid markerId", "showInfoWindow called with invalid markerId");
            case 21:
                C1177j c1177j21 = this.f12307b;
                ArrayList arrayList29 = new ArrayList();
                try {
                    c1177j21.K((String) ((ArrayList) obj).get(0));
                    arrayList29.add(0, null);
                } catch (Throwable th20) {
                    arrayList29 = android.support.v4.media.session.a.H(th20);
                }
                fVar.h(arrayList29);
                return;
            case 22:
                C1177j c1177j22 = this.f12307b;
                ArrayList arrayList30 = new ArrayList();
                try {
                    c1187u2 = (C1187u) c1177j22.f12204n0.f12294b.get((String) ((ArrayList) obj).get(0));
                } catch (Throwable th21) {
                    arrayList30 = android.support.v4.media.session.a.H(th21);
                }
                if (c1187u2 != null) {
                    C1786n c1786n2 = (C1786n) c1187u2.f12283a.get();
                    if (c1786n2 == null) {
                        zzH = false;
                    } else {
                        try {
                            zzH = c1786n2.f15625a.zzH();
                        } catch (RemoteException e11) {
                            throw new RuntimeException(e11);
                        }
                    }
                    arrayList30.add(0, Boolean.valueOf(zzH));
                    fVar.h(arrayList30);
                    return;
                }
                throw new C1190x(null, "Invalid markerId", "isInfoWindowShown called with invalid markerId");
            case 23:
                C1177j c1177j23 = this.f12307b;
                ArrayList arrayList31 = new ArrayList();
                try {
                    c1608t3 = c1177j23.f;
                    Objects.requireNonNull(c1608t3);
                } catch (Throwable th22) {
                    arrayList31 = android.support.v4.media.session.a.H(th22);
                }
                try {
                    C1742f c1742f2 = (C1742f) c1608t3.f14880b;
                    Parcel zzJ = c1742f2.zzJ(40, c1742f2.zza());
                    boolean zzf = zzc.zzf(zzJ);
                    zzJ.recycle();
                    arrayList31.add(0, Boolean.valueOf(zzf));
                    fVar.h(arrayList31);
                    return;
                } catch (RemoteException e12) {
                    throw new RuntimeException(e12);
                }
            case 24:
                C1177j c1177j24 = this.f12307b;
                ArrayList arrayList32 = new ArrayList();
                try {
                    C1608t c1608t5 = c1177j24.f;
                    Objects.requireNonNull(c1608t5);
                    C0927b f05 = c1608t5.f0();
                    f05.getClass();
                    try {
                        C1739c c1739c = (C1739c) f05.f10587a;
                        Parcel zzJ2 = c1739c.zzJ(14, c1739c.zza());
                        boolean zzf2 = zzc.zzf(zzJ2);
                        zzJ2.recycle();
                        arrayList32.add(0, Boolean.valueOf(zzf2));
                    } catch (RemoteException e13) {
                        throw new RuntimeException(e13);
                    }
                } catch (Throwable th23) {
                    arrayList32 = android.support.v4.media.session.a.H(th23);
                }
                fVar.h(arrayList32);
                return;
            case 25:
                C1177j c1177j25 = this.f12307b;
                ArrayList arrayList33 = new ArrayList();
                try {
                    C1608t c1608t6 = c1177j25.f;
                    Objects.requireNonNull(c1608t6);
                    C0927b f06 = c1608t6.f0();
                    f06.getClass();
                    try {
                        C1739c c1739c2 = (C1739c) f06.f10587a;
                        Parcel zzJ3 = c1739c2.zzJ(13, c1739c2.zza());
                        boolean zzf3 = zzc.zzf(zzJ3);
                        zzJ3.recycle();
                        arrayList33.add(0, Boolean.valueOf(zzf3));
                    } catch (RemoteException e14) {
                        throw new RuntimeException(e14);
                    }
                } catch (Throwable th24) {
                    arrayList33 = android.support.v4.media.session.a.H(th24);
                }
                fVar.h(arrayList33);
                return;
            case 26:
                C1177j c1177j26 = this.f12307b;
                ArrayList arrayList34 = new ArrayList();
                try {
                    C1608t c1608t7 = c1177j26.f;
                    Objects.requireNonNull(c1608t7);
                    f02 = c1608t7.f0();
                    f02.getClass();
                } catch (Throwable th25) {
                    arrayList34 = android.support.v4.media.session.a.H(th25);
                }
                try {
                    C1739c c1739c3 = (C1739c) f02.f10587a;
                    Parcel zzJ4 = c1739c3.zzJ(10, c1739c3.zza());
                    boolean zzf4 = zzc.zzf(zzJ4);
                    zzJ4.recycle();
                    arrayList34.add(0, Boolean.valueOf(zzf4));
                    fVar.h(arrayList34);
                    return;
                } catch (RemoteException e15) {
                    throw new RuntimeException(e15);
                }
            case 27:
                C1177j c1177j27 = this.f12307b;
                ArrayList arrayList35 = new ArrayList();
                try {
                    arrayList35.add(0, c1177j27.f12193d.f9450f0);
                } catch (Throwable th26) {
                    arrayList35 = android.support.v4.media.session.a.H(th26);
                }
                fVar.h(arrayList35);
                return;
            case 28:
                C1177j c1177j28 = this.f12307b;
                ArrayList arrayList36 = new ArrayList();
                try {
                    C1608t c1608t8 = c1177j28.f;
                    Objects.requireNonNull(c1608t8);
                    f03 = c1608t8.f0();
                    f03.getClass();
                } catch (Throwable th27) {
                    arrayList36 = android.support.v4.media.session.a.H(th27);
                }
                try {
                    C1739c c1739c4 = (C1739c) f03.f10587a;
                    Parcel zzJ5 = c1739c4.zzJ(19, c1739c4.zza());
                    boolean zzf5 = zzc.zzf(zzJ5);
                    zzJ5.recycle();
                    arrayList36.add(0, Boolean.valueOf(zzf5));
                    fVar.h(arrayList36);
                    return;
                } catch (RemoteException e16) {
                    throw new RuntimeException(e16);
                }
            default:
                C1177j c1177j29 = this.f12307b;
                ArrayList arrayList37 = new ArrayList();
                try {
                    C1608t c1608t9 = c1177j29.f;
                    Objects.requireNonNull(c1608t9);
                    f04 = c1608t9.f0();
                    f04.getClass();
                } catch (Throwable th28) {
                    arrayList37 = android.support.v4.media.session.a.H(th28);
                }
                try {
                    C1739c c1739c5 = (C1739c) f04.f10587a;
                    Parcel zzJ6 = c1739c5.zzJ(11, c1739c5.zza());
                    boolean zzf6 = zzc.zzf(zzJ6);
                    zzJ6.recycle();
                    arrayList37.add(0, Boolean.valueOf(zzf6));
                    fVar.h(arrayList37);
                    return;
                } catch (RemoteException e17) {
                    throw new RuntimeException(e17);
                }
        }
    }
}
