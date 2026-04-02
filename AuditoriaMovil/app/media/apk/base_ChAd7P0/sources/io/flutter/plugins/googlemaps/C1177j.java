package io.flutter.plugins.googlemaps;

import a.AbstractC0412a;
import a1.C0415A;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0564p;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0568u;
import b3.C0585f;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzr;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import e0.C0927b;
import g1.C1006c;
import i3.InterfaceC1109a;
import j$.util.Objects;
import j6.C1372c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p.C1608t;
import q3.InterfaceC1707a;
import r3.C1738b;
import r3.C1739c;
import r3.C1742f;
import r3.C1743g;
import s3.C1766A;
import s3.C1782j;
import s3.C1785m;
import s3.C1786n;
/* renamed from: io.flutter.plugins.googlemaps.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1177j implements DefaultLifecycleObserver, InterfaceC1180m, io.flutter.plugin.platform.g, InterfaceC1707a, q3.b, q3.d, q3.e {

    /* renamed from: A0  reason: collision with root package name */
    public List f12179A0;

    /* renamed from: B0  reason: collision with root package name */
    public List f12180B0;

    /* renamed from: C0  reason: collision with root package name */
    public List f12181C0;

    /* renamed from: D0  reason: collision with root package name */
    public List f12182D0;

    /* renamed from: E0  reason: collision with root package name */
    public List f12183E0;

    /* renamed from: F0  reason: collision with root package name */
    public String f12184F0;

    /* renamed from: G0  reason: collision with root package name */
    public boolean f12185G0;

    /* renamed from: H0  reason: collision with root package name */
    public ArrayList f12186H0;

    /* renamed from: a  reason: collision with root package name */
    public final int f12190a;

    /* renamed from: b  reason: collision with root package name */
    public final a6.t0 f12191b;

    /* renamed from: c  reason: collision with root package name */
    public final L5.f f12192c;

    /* renamed from: d  reason: collision with root package name */
    public final GoogleMapOptions f12193d;

    /* renamed from: e  reason: collision with root package name */
    public q3.f f12194e;
    public C1608t f;

    /* renamed from: j0  reason: collision with root package name */
    public final float f12200j0;

    /* renamed from: k0  reason: collision with root package name */
    public io.flutter.plugins.firebase.storage.g f12201k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Context f12202l0;

    /* renamed from: m0  reason: collision with root package name */
    public final C0415A f12203m0;

    /* renamed from: n0  reason: collision with root package name */
    public final C1189w f12204n0;

    /* renamed from: o0  reason: collision with root package name */
    public final C1173f f12205o0;

    /* renamed from: p0  reason: collision with root package name */
    public final C1169d f12206p0;
    public final B0 q0;

    /* renamed from: r0  reason: collision with root package name */
    public final C1169d f12207r0;

    /* renamed from: s0  reason: collision with root package name */
    public final U4.b f12208s0;

    /* renamed from: t0  reason: collision with root package name */
    public final R1.j f12209t0;

    /* renamed from: u0  reason: collision with root package name */
    public final C1184q f12210u0;

    /* renamed from: v0  reason: collision with root package name */
    public U4.b f12211v0;

    /* renamed from: w0  reason: collision with root package name */
    public U4.a f12212w0;

    /* renamed from: x0  reason: collision with root package name */
    public List f12213x0;

    /* renamed from: y0  reason: collision with root package name */
    public List f12214y0;

    /* renamed from: z0  reason: collision with root package name */
    public List f12215z0;

    /* renamed from: X  reason: collision with root package name */
    public boolean f12187X = false;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f12188Y = false;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f12189Z = false;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f12195e0 = true;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f12196f0 = true;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f12197g0 = false;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f12198h0 = true;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f12199i0 = false;

    public C1177j(int i7, Context context, L5.f fVar, C0415A c0415a, GoogleMapOptions googleMapOptions) {
        this.f12190a = i7;
        this.f12202l0 = context;
        this.f12193d = googleMapOptions;
        this.f12194e = new q3.f(context, googleMapOptions);
        float f = context.getResources().getDisplayMetrics().density;
        this.f12200j0 = f;
        this.f12192c = fVar;
        a6.t0 t0Var = new a6.t0(fVar, Integer.toString(i7));
        this.f12191b = t0Var;
        androidx.datastore.preferences.protobuf.Y.B(fVar, Integer.toString(i7), this);
        androidx.datastore.preferences.protobuf.Y.C(fVar, Integer.toString(i7), this);
        AssetManager assets = context.getAssets();
        this.f12203m0 = c0415a;
        C1173f c1173f = new C1173f(t0Var, context);
        this.f12205o0 = c1173f;
        this.f12204n0 = new C1189w(t0Var, c1173f, assets, f, new C1372c(18));
        this.f12206p0 = new C1169d(t0Var, f, 1);
        this.q0 = new B0(t0Var, assets, f);
        this.f12207r0 = new C1169d(t0Var, f, 0);
        this.f12208s0 = new U4.b();
        this.f12209t0 = new R1.j(t0Var);
        this.f12210u0 = new C1184q(t0Var, assets, f);
    }

    public static TextureView D(ViewGroup viewGroup) {
        TextureView D4;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt instanceof TextureView) {
                return (TextureView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (D4 = D((ViewGroup) childAt)) != null) {
                return D4;
            }
        }
        return null;
    }

    @Override // q3.InterfaceC1707a
    public final void A() {
        this.f12205o0.A();
        t2.i iVar = new t2.i(18);
        StringBuilder sb = new StringBuilder("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onCameraIdle");
        a6.t0 t0Var = this.f12191b;
        sb.append((String) t0Var.f7210c);
        String sb2 = sb.toString();
        new E.e((L5.f) t0Var.f7209b, sb2, A.f12030d, null, 4).f0(null, new K4.e(iVar, sb2, 5));
    }

    public final void B(K k2, Long l8) {
        if (this.f != null) {
            InterfaceC1109a interfaceC1109a = (InterfaceC1109a) AbstractC0412a.b(k2, this.f12200j0).f8171b;
            if (l8 != null) {
                C1608t c1608t = this.f;
                int intValue = l8.intValue();
                c1608t.getClass();
                try {
                    C1742f c1742f = (C1742f) c1608t.f14880b;
                    Parcel zza = c1742f.zza();
                    zzc.zze(zza, interfaceC1109a);
                    zza.writeInt(intValue);
                    zzc.zze(zza, null);
                    c1742f.zzc(7, zza);
                    return;
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            }
            C1608t c1608t2 = this.f;
            c1608t2.getClass();
            try {
                C1742f c1742f2 = (C1742f) c1608t2.f14880b;
                Parcel zza2 = c1742f2.zza();
                zzc.zze(zza2, interfaceC1109a);
                c1742f2.zzc(5, zza2);
                return;
            } catch (RemoteException e8) {
                throw new RuntimeException(e8);
            }
        }
        throw new C1190x(null, "GoogleMap uninitialized", "animateCamera called prior to map initialization");
    }

    public final void C() {
        q3.f fVar = this.f12194e;
        if (fVar == null) {
            return;
        }
        q3.k kVar = fVar.f15322a;
        p4.P p7 = (p4.P) kVar.f15330b;
        if (p7 != null) {
            try {
                C1743g c1743g = (C1743g) p7.f15211b;
                c1743g.zzc(5, c1743g.zza());
            } catch (RemoteException e7) {
                throw new RuntimeException(e7);
            }
        } else {
            while (!((LinkedList) kVar.f15332d).isEmpty() && ((i3.f) ((LinkedList) kVar.f15332d).getLast()).a() >= 1) {
                ((LinkedList) kVar.f15332d).removeLast();
            }
        }
        this.f12194e = null;
    }

    public final ArrayList E(String str) {
        C1173f c1173f = this.f12205o0;
        R4.c cVar = (R4.c) c1173f.f12130b.get(str);
        if (cVar != null) {
            Set<R4.a> y2 = cVar.f4774d.f5273b.y(c1173f.f12133e.c0().f9460b);
            ArrayList arrayList = new ArrayList(y2.size());
            for (R4.a aVar : y2) {
                arrayList.add(AbstractC0412a.e(str, aVar));
            }
            return arrayList;
        }
        throw new C1190x(null, "Invalid clusterManagerId", io.flutter.plugins.pathprovider.b.h("getClusters called with invalid clusterManagerId:", str));
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [io.flutter.plugins.googlemaps.G, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [io.flutter.plugins.googlemaps.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [io.flutter.plugins.googlemaps.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [io.flutter.plugins.googlemaps.Z, java.lang.Object] */
    public final C1166b0 F(String str) {
        C1782j c1782j;
        boolean z7;
        g0 F7;
        double d7;
        C1184q c1184q = this.f12210u0;
        C1182o c1182o = (C1182o) c1184q.f12254a.get(str);
        f0 f0Var = null;
        if (c1182o == null) {
            c1782j = null;
        } else {
            c1782j = c1182o.f12241a;
        }
        if (c1782j == null) {
            return null;
        }
        zzr zzrVar = c1782j.f15608a;
        C1182o c1182o2 = (C1182o) c1184q.f12254a.get(str);
        if (c1182o2 == null) {
            z7 = false;
        } else {
            z7 = c1182o2.f12243c;
        }
        Double valueOf = Double.valueOf(1.0d);
        h0 h0Var = h0.NONE;
        ?? obj = new Object();
        obj.f12055a = new byte[]{0};
        if (h0Var != null) {
            obj.f12056b = h0Var;
            obj.f12057c = valueOf;
            obj.f12058d = null;
            obj.f12059e = null;
            ?? obj2 = new Object();
            obj2.f12031a = obj;
            try {
                Double valueOf2 = Double.valueOf(zzrVar.zzg());
                try {
                    Double valueOf3 = Double.valueOf(zzrVar.zze());
                    try {
                        Double valueOf4 = Double.valueOf(zzrVar.zzd());
                        try {
                            Double valueOf5 = Double.valueOf(zzrVar.zzf());
                            try {
                                Long valueOf6 = Long.valueOf(zzrVar.zzh());
                                try {
                                    Boolean valueOf7 = Boolean.valueOf(zzrVar.zzB());
                                    try {
                                        Boolean valueOf8 = Boolean.valueOf(zzrVar.zzA());
                                        if (z7) {
                                            try {
                                                F7 = AbstractC0412a.F(zzrVar.zzl());
                                            } catch (RemoteException e7) {
                                                throw new RuntimeException(e7);
                                            }
                                        } else {
                                            try {
                                                f0Var = AbstractC0412a.H(zzrVar.zzk());
                                                F7 = null;
                                            } catch (RemoteException e8) {
                                                throw new RuntimeException(e8);
                                            }
                                        }
                                        try {
                                            LatLng zzk = zzrVar.zzk();
                                            try {
                                                LatLngBounds zzl = zzrVar.zzl();
                                                LatLng latLng = zzl.f9466b;
                                                double d8 = latLng.f9463a;
                                                LatLng latLng2 = zzl.f9465a;
                                                double d9 = latLng2.f9463a;
                                                double d10 = 1.0d - ((zzk.f9463a - d9) / (d8 - d9));
                                                double d11 = latLng2.f9464b;
                                                double d12 = latLng.f9464b;
                                                if (d11 <= d12) {
                                                    d7 = d12 - d11;
                                                } else {
                                                    d7 = 360.0d - (d11 - d12);
                                                }
                                                double d13 = zzk.f9464b;
                                                if (d13 < d11) {
                                                    d13 += 360.0d;
                                                }
                                                Double valueOf9 = Double.valueOf((d13 - d11) / d7);
                                                Double valueOf10 = Double.valueOf(d10);
                                                ?? obj3 = new Object();
                                                obj3.f12095a = valueOf9;
                                                obj3.f12096b = valueOf10;
                                                ?? obj4 = new Object();
                                                if (str != null) {
                                                    obj4.f12108a = str;
                                                    obj4.f12109b = obj2;
                                                    obj4.f12110c = f0Var;
                                                    obj4.f12111d = F7;
                                                    obj4.f12112e = valueOf2;
                                                    obj4.f = valueOf3;
                                                    obj4.f12113g = obj3;
                                                    obj4.f12114h = valueOf5;
                                                    obj4.f12115i = valueOf4;
                                                    obj4.j = valueOf6;
                                                    obj4.f12116k = valueOf7;
                                                    obj4.f12117l = valueOf8;
                                                    return obj4;
                                                }
                                                throw new IllegalStateException("Nonnull field \"groundOverlayId\" is null.");
                                            } catch (RemoteException e9) {
                                                throw new RuntimeException(e9);
                                            }
                                        } catch (RemoteException e10) {
                                            throw new RuntimeException(e10);
                                        }
                                    } catch (RemoteException e11) {
                                        throw new RuntimeException(e11);
                                    }
                                } catch (RemoteException e12) {
                                    throw new RuntimeException(e12);
                                }
                            } catch (RemoteException e13) {
                                throw new RuntimeException(e13);
                            }
                        } catch (RemoteException e14) {
                            throw new RuntimeException(e14);
                        }
                    } catch (RemoteException e15) {
                        throw new RuntimeException(e15);
                    }
                } catch (RemoteException e16) {
                    throw new RuntimeException(e16);
                }
            } catch (RemoteException e17) {
                throw new RuntimeException(e17);
            }
        }
        throw new IllegalStateException("Nonnull field \"bitmapScaling\" is null.");
    }

    public final f0 G(o0 o0Var) {
        C1608t c1608t = this.f;
        if (c1608t != null) {
            C1006c e02 = c1608t.e0();
            Point point = new Point(o0Var.f12244a.intValue(), o0Var.f12245b.intValue());
            try {
                C1738b c1738b = (C1738b) e02.f11091a;
                i3.b bVar = new i3.b(point);
                Parcel zza = c1738b.zza();
                zzc.zze(zza, bVar);
                Parcel zzJ = c1738b.zzJ(1, zza);
                LatLng latLng = (LatLng) zzc.zza(zzJ, LatLng.CREATOR);
                zzJ.recycle();
                return AbstractC0412a.H(latLng);
            } catch (RemoteException e7) {
                throw new RuntimeException(e7);
            }
        }
        throw new C1190x(null, "GoogleMap uninitialized", "getLatLng called prior to map initialization");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [io.flutter.plugins.googlemaps.o0, java.lang.Object] */
    public final o0 H(f0 f0Var) {
        C1608t c1608t = this.f;
        if (c1608t != null) {
            C1006c e02 = c1608t.e0();
            LatLng G2 = AbstractC0412a.G(f0Var);
            try {
                C1738b c1738b = (C1738b) e02.f11091a;
                Parcel zza = c1738b.zza();
                zzc.zzd(zza, G2);
                Parcel zzJ = c1738b.zzJ(2, zza);
                InterfaceC1109a b5 = i3.b.b(zzJ.readStrongBinder());
                zzJ.recycle();
                Point point = (Point) i3.b.c(b5);
                Long valueOf = Long.valueOf(point.x);
                Long valueOf2 = Long.valueOf(point.y);
                ?? obj = new Object();
                obj.f12244a = valueOf;
                obj.f12245b = valueOf2;
                return obj;
            } catch (RemoteException e7) {
                throw new RuntimeException(e7);
            }
        }
        throw new C1190x(null, "GoogleMap uninitialized", "getScreenCoordinate called prior to map initialization");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Type inference failed for: r3v0, types: [io.flutter.plugins.googlemaps.t0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.flutter.plugins.googlemaps.t0 I(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            R1.j r1 = r4.f12209t0
            if (r5 != 0) goto La
            r1.getClass()
        L8:
            r5 = r0
            goto L19
        La:
            java.lang.Object r1 = r1.f4682b
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r5 = r1.get(r5)
            io.flutter.plugins.googlemaps.C0 r5 = (io.flutter.plugins.googlemaps.C0) r5
            if (r5 != 0) goto L17
            goto L8
        L17:
            s3.A r5 = r5.f12039a
        L19:
            if (r5 != 0) goto L1c
            return r0
        L1c:
            com.google.android.gms.internal.maps.zzam r5 = r5.f15575a
            boolean r0 = r5.zzo()     // Catch: android.os.RemoteException -> L63
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            float r1 = r5.zzd()     // Catch: android.os.RemoteException -> L5c
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            float r2 = r5.zze()     // Catch: android.os.RemoteException -> L55
            double r2 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            boolean r5 = r5.zzp()     // Catch: android.os.RemoteException -> L4e
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            io.flutter.plugins.googlemaps.t0 r3 = new io.flutter.plugins.googlemaps.t0
            r3.<init>()
            r3.f12279a = r5
            r3.f12280b = r0
            r3.f12281c = r1
            r3.f12282d = r2
            return r3
        L4e:
            r5 = move-exception
            F6.x r0 = new F6.x
            r0.<init>(r5)
            throw r0
        L55:
            r5 = move-exception
            F6.x r0 = new F6.x
            r0.<init>(r5)
            throw r0
        L5c:
            r5 = move-exception
            F6.x r0 = new F6.x
            r0.<init>(r5)
            throw r0
        L63:
            r5 = move-exception
            F6.x r0 = new F6.x
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemaps.C1177j.I(java.lang.String):io.flutter.plugins.googlemaps.t0");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [io.flutter.plugins.googlemaps.v0, java.lang.Object] */
    public final v0 J() {
        C1608t c1608t = this.f;
        Objects.requireNonNull(c1608t);
        try {
            C1742f c1742f = (C1742f) c1608t.f14880b;
            Parcel zzJ = c1742f.zzJ(3, c1742f.zza());
            float readFloat = zzJ.readFloat();
            zzJ.recycle();
            Double valueOf = Double.valueOf(readFloat);
            C1608t c1608t2 = this.f;
            Objects.requireNonNull(c1608t2);
            try {
                C1742f c1742f2 = (C1742f) c1608t2.f14880b;
                Parcel zzJ2 = c1742f2.zzJ(2, c1742f2.zza());
                float readFloat2 = zzJ2.readFloat();
                zzJ2.recycle();
                Double valueOf2 = Double.valueOf(readFloat2);
                ?? obj = new Object();
                obj.f12291a = valueOf;
                obj.f12292b = valueOf2;
                return obj;
            } catch (RemoteException e7) {
                throw new RuntimeException(e7);
            }
        } catch (RemoteException e8) {
            throw new RuntimeException(e8);
        }
    }

    public final void K(String str) {
        C1187u c1187u = (C1187u) this.f12204n0.f12294b.get(str);
        if (c1187u != null) {
            C1786n c1786n = (C1786n) c1187u.f12283a.get();
            if (c1786n != null) {
                try {
                    c1786n.f15625a.zzn();
                    return;
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            }
            return;
        }
        throw new C1190x(null, "Invalid markerId", "hideInfoWindow called with invalid markerId");
    }

    public final void L(K k2) {
        C1608t c1608t = this.f;
        if (c1608t != null) {
            C0585f b5 = AbstractC0412a.b(k2, this.f12200j0);
            c1608t.getClass();
            try {
                C1742f c1742f = (C1742f) c1608t.f14880b;
                Parcel zza = c1742f.zza();
                zzc.zze(zza, (InterfaceC1109a) b5.f8171b);
                c1742f.zzc(4, zza);
                return;
            } catch (RemoteException e7) {
                throw new RuntimeException(e7);
            }
        }
        throw new C1190x(null, "GoogleMap uninitialized", "moveCamera called prior to map initialization");
    }

    public final void M(C1177j c1177j) {
        if (this.f == null) {
            Log.v("GoogleMapController", "Controller was disposed before GoogleMap was ready.");
            return;
        }
        C1173f c1173f = this.f12205o0;
        c1173f.f = c1177j;
        for (Map.Entry entry : c1173f.f12130b.entrySet()) {
            R4.c cVar = (R4.c) entry.getValue();
            C1177j c1177j2 = c1173f.f;
            cVar.f4777f0 = c1173f;
            T4.h hVar = cVar.f4775e;
            hVar.f5380p = c1173f;
            cVar.f4776e0 = c1177j2;
            hVar.f5381q = c1177j2;
        }
    }

    public final void N(C1177j c1177j) {
        C1608t c1608t = this.f;
        if (c1608t == null) {
            Log.v("GoogleMapController", "Controller was disposed before GoogleMap was ready.");
            return;
        }
        C1742f c1742f = (C1742f) c1608t.f14880b;
        try {
            if (c1177j == null) {
                Parcel zza = c1742f.zza();
                zzc.zze(zza, null);
                c1742f.zzc(96, zza);
            } else {
                q3.j jVar = new q3.j(c1177j, 6);
                Parcel zza2 = c1742f.zza();
                zzc.zze(zza2, jVar);
                c1742f.zzc(96, zza2);
            }
            C1742f c1742f2 = (C1742f) this.f.f14880b;
            try {
                if (c1177j == null) {
                    Parcel zza3 = c1742f2.zza();
                    zzc.zze(zza3, null);
                    c1742f2.zzc(97, zza3);
                } else {
                    q3.j jVar2 = new q3.j(c1177j, 7);
                    Parcel zza4 = c1742f2.zza();
                    zzc.zze(zza4, jVar2);
                    c1742f2.zzc(97, zza4);
                }
                C1742f c1742f3 = (C1742f) this.f.f14880b;
                try {
                    if (c1177j == null) {
                        Parcel zza5 = c1742f3.zza();
                        zzc.zze(zza5, null);
                        c1742f3.zzc(99, zza5);
                    } else {
                        q3.j jVar3 = new q3.j(c1177j, 8);
                        Parcel zza6 = c1742f3.zza();
                        zzc.zze(zza6, jVar3);
                        c1742f3.zzc(99, zza6);
                    }
                    C1742f c1742f4 = (C1742f) this.f.f14880b;
                    try {
                        if (c1177j == null) {
                            Parcel zza7 = c1742f4.zza();
                            zzc.zze(zza7, null);
                            c1742f4.zzc(85, zza7);
                        } else {
                            q3.j jVar4 = new q3.j(c1177j, 4);
                            Parcel zza8 = c1742f4.zza();
                            zzc.zze(zza8, jVar4);
                            c1742f4.zzc(85, zza8);
                        }
                        C1742f c1742f5 = (C1742f) this.f.f14880b;
                        try {
                            if (c1177j == null) {
                                Parcel zza9 = c1742f5.zza();
                                zzc.zze(zza9, null);
                                c1742f5.zzc(87, zza9);
                            } else {
                                q3.j jVar5 = new q3.j(c1177j, 5);
                                Parcel zza10 = c1742f5.zza();
                                zzc.zze(zza10, jVar5);
                                c1742f5.zzc(87, zza10);
                            }
                            C1742f c1742f6 = (C1742f) this.f.f14880b;
                            try {
                                if (c1177j == null) {
                                    Parcel zza11 = c1742f6.zza();
                                    zzc.zze(zza11, null);
                                    c1742f6.zzc(89, zza11);
                                } else {
                                    q3.j jVar6 = new q3.j(c1177j, 3);
                                    Parcel zza12 = c1742f6.zza();
                                    zzc.zze(zza12, jVar6);
                                    c1742f6.zzc(89, zza12);
                                }
                                C1742f c1742f7 = (C1742f) this.f.f14880b;
                                try {
                                    if (c1177j == null) {
                                        Parcel zza13 = c1742f7.zza();
                                        zzc.zze(zza13, null);
                                        c1742f7.zzc(28, zza13);
                                    } else {
                                        q3.j jVar7 = new q3.j(c1177j, 9);
                                        Parcel zza14 = c1742f7.zza();
                                        zzc.zze(zza14, jVar7);
                                        c1742f7.zzc(28, zza14);
                                    }
                                    C1742f c1742f8 = (C1742f) this.f.f14880b;
                                    try {
                                        if (c1177j == null) {
                                            Parcel zza15 = c1742f8.zza();
                                            zzc.zze(zza15, null);
                                            c1742f8.zzc(29, zza15);
                                        } else {
                                            q3.j jVar8 = new q3.j(c1177j, 0);
                                            Parcel zza16 = c1742f8.zza();
                                            zzc.zze(zza16, jVar8);
                                            c1742f8.zzc(29, zza16);
                                        }
                                        C1742f c1742f9 = (C1742f) this.f.f14880b;
                                        try {
                                            if (c1177j == null) {
                                                Parcel zza17 = c1742f9.zza();
                                                zzc.zze(zza17, null);
                                                c1742f9.zzc(83, zza17);
                                                return;
                                            }
                                            q3.j jVar9 = new q3.j(c1177j, 2);
                                            Parcel zza18 = c1742f9.zza();
                                            zzc.zze(zza18, jVar9);
                                            c1742f9.zzc(83, zza18);
                                        } catch (RemoteException e7) {
                                            throw new RuntimeException(e7);
                                        }
                                    } catch (RemoteException e8) {
                                        throw new RuntimeException(e8);
                                    }
                                } catch (RemoteException e9) {
                                    throw new RuntimeException(e9);
                                }
                            } catch (RemoteException e10) {
                                throw new RuntimeException(e10);
                            }
                        } catch (RemoteException e11) {
                            throw new RuntimeException(e11);
                        }
                    } catch (RemoteException e12) {
                        throw new RuntimeException(e12);
                    }
                } catch (RemoteException e13) {
                    throw new RuntimeException(e13);
                }
            } catch (RemoteException e14) {
                throw new RuntimeException(e14);
            }
        } catch (RemoteException e15) {
            throw new RuntimeException(e15);
        }
    }

    public final void O(List list, List list2, List list3) {
        HashMap hashMap;
        C1169d c1169d = this.f12207r0;
        c1169d.a(list);
        Iterator it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = c1169d.f12119a;
            if (!hasNext) {
                break;
            }
            W w2 = (W) it.next();
            C1165b c1165b = (C1165b) hashMap.get(w2.f12089i);
            if (c1165b != null) {
                AbstractC0412a.w(w2, c1165b);
            }
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            C1165b c1165b2 = (C1165b) hashMap.remove((String) it2.next());
            if (c1165b2 != null) {
                try {
                    c1165b2.f12105a.f15595a.zzn();
                    c1169d.f12120b.remove(c1165b2.f12106b);
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
    }

    public final void P(List list, List list2) {
        C1173f c1173f = this.f12205o0;
        c1173f.a(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            R4.c cVar = (R4.c) c1173f.f12130b.remove((String) it.next());
            if (cVar != null) {
                cVar.f4777f0 = null;
                T4.h hVar = cVar.f4775e;
                hVar.f5380p = null;
                cVar.f4776e0 = null;
                hVar.f5381q = null;
                S4.e eVar = cVar.f4774d;
                ((ReentrantReadWriteLock) eVar.f229a).writeLock().lock();
                try {
                    eVar.x();
                    eVar.s();
                    cVar.a();
                } catch (Throwable th) {
                    eVar.s();
                    throw th;
                }
            }
        }
    }

    public final void Q(List list, List list2, List list3) {
        HashMap hashMap;
        C1184q c1184q = this.f12210u0;
        c1184q.a(list);
        Iterator it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = c1184q.f12254a;
            if (!hasNext) {
                break;
            }
            C1166b0 c1166b0 = (C1166b0) it.next();
            C1182o c1182o = (C1182o) hashMap.get(c1166b0.f12108a);
            if (c1182o != null) {
                AbstractC0412a.x(c1166b0, c1182o, c1184q.f12258e, c1184q.f, c1184q.f12259g);
            }
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            C1182o c1182o2 = (C1182o) hashMap.get(str);
            if (c1182o2 != null) {
                try {
                    c1182o2.f12241a.f15608a.zzn();
                    hashMap.remove(str);
                    c1184q.f12255b.remove(c1182o2.f12242b);
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
    }

    public final void R(List list, List list2, List list3) {
        HashMap hashMap;
        r rVar;
        U4.b bVar = this.f12208s0;
        bVar.b(list);
        Iterator it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = bVar.f5773a;
            if (!hasNext) {
                break;
            }
            Map map = ((C1168c0) it.next()).f12118a;
            if (map != null && (rVar = (r) hashMap.get((String) map.get("heatmapId"))) != null) {
                AbstractC0412a.y(map, rVar);
                C1766A c1766a = rVar.f12271b;
                c1766a.getClass();
                try {
                    c1766a.f15575a.zzh();
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            r rVar2 = (r) hashMap.remove(str);
            if (rVar2 != null) {
                C1766A c1766a2 = rVar2.f12271b;
                c1766a2.getClass();
                try {
                    c1766a2.f15575a.zzi();
                    hashMap.remove(str);
                } catch (RemoteException e8) {
                    throw new RuntimeException(e8);
                }
            }
        }
    }

    public final boolean S(String str) {
        C1785m c1785m;
        if (str != null && !str.isEmpty()) {
            c1785m = new C1785m(str);
        } else {
            c1785m = null;
        }
        C1608t c1608t = this.f;
        Objects.requireNonNull(c1608t);
        try {
            C1742f c1742f = (C1742f) c1608t.f14880b;
            Parcel zza = c1742f.zza();
            zzc.zzd(zza, c1785m);
            Parcel zzJ = c1742f.zzJ(91, zza);
            boolean zzf = zzc.zzf(zzJ);
            zzJ.recycle();
            this.f12185G0 = zzf;
            return zzf;
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final void T(List list, List list2, List list3) {
        C1189w c1189w = this.f12204n0;
        c1189w.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c1189w.a((l0) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            l0 l0Var = (l0) it2.next();
            String str = l0Var.f12236l;
            C1186t c1186t = (C1186t) c1189w.f12293a.get(str);
            if (c1186t != null) {
                if (!Objects.equals(l0Var.f12237m, c1186t.f12276b)) {
                    c1189w.c(str);
                    c1189w.a(l0Var);
                } else {
                    AssetManager assetManager = c1189w.f12298g;
                    float f = c1189w.f12299h;
                    C1372c c1372c = c1189w.f12300i;
                    AbstractC0412a.A(l0Var, c1186t, assetManager, f, c1372c);
                    C1187u c1187u = (C1187u) c1189w.f12294b.get(str);
                    if (c1187u != null) {
                        AbstractC0412a.A(l0Var, c1187u, assetManager, f, c1372c);
                    }
                }
            }
        }
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            c1189w.c((String) it3.next());
        }
    }

    public final void U() {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        Context context = this.f12202l0;
        if (context.checkPermission("android.permission.ACCESS_FINE_LOCATION", myPid, myUid) != 0 && context.checkPermission("android.permission.ACCESS_COARSE_LOCATION", Process.myPid(), Process.myUid()) != 0) {
            Log.e("GoogleMapController", "Cannot enable MyLocation layer as location permissions are not granted");
            return;
        }
        C1608t c1608t = this.f;
        boolean z7 = this.f12188Y;
        c1608t.getClass();
        try {
            C1742f c1742f = (C1742f) c1608t.f14880b;
            Parcel zza = c1742f.zza();
            int i7 = zzc.zza;
            zza.writeInt(z7 ? 1 : 0);
            c1742f.zzc(22, zza);
            C0927b f02 = this.f.f0();
            boolean z8 = this.f12189Z;
            f02.getClass();
            try {
                C1739c c1739c = (C1739c) f02.f10587a;
                Parcel zza2 = c1739c.zza();
                zza2.writeInt(z8 ? 1 : 0);
                c1739c.zzc(3, zza2);
            } catch (RemoteException e7) {
                throw new RuntimeException(e7);
            }
        } catch (RemoteException e8) {
            throw new RuntimeException(e8);
        }
    }

    public final void V(List list, List list2, List list3) {
        HashMap hashMap;
        C1169d c1169d = this.f12206p0;
        c1169d.b(list);
        Iterator it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = c1169d.f12119a;
            if (!hasNext) {
                break;
            }
            p0 p0Var = (p0) it.next();
            x0 x0Var = (x0) hashMap.get(p0Var.f12246a);
            if (x0Var != null) {
                AbstractC0412a.B(p0Var, x0Var);
            }
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            x0 x0Var2 = (x0) hashMap.remove((String) it2.next());
            if (x0Var2 != null) {
                try {
                    x0Var2.f12303a.f15653a.zzo();
                    c1169d.f12120b.remove(x0Var2.f12304b);
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
    }

    @Override // q3.b
    public final void W(C1786n c1786n) {
        String a7 = c1786n.a();
        C1189w c1189w = this.f12204n0;
        String str = (String) c1189w.f12295c.get(a7);
        if (str != null) {
            t2.i iVar = new t2.i(18);
            StringBuilder sb = new StringBuilder("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onInfoWindowTap");
            a6.t0 t0Var = c1189w.f12296d;
            sb.append((String) t0Var.f7210c);
            String sb2 = sb.toString();
            new E.e((L5.f) t0Var.f7209b, sb2, A.f12030d, null, 4).f0(new ArrayList(Collections.singletonList(str)), new K4.e(iVar, sb2, 7));
        }
    }

    public final void X(List list, List list2, List list3) {
        HashMap hashMap;
        B0 b0 = this.q0;
        b0.a(list);
        Iterator it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = b0.f12032a;
            if (!hasNext) {
                break;
            }
            q0 q0Var = (q0) it.next();
            z0 z0Var = (z0) hashMap.get(q0Var.f12260a);
            if (z0Var != null) {
                AbstractC0412a.C(q0Var, z0Var, b0.f, b0.f12036e);
            }
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            z0 z0Var2 = (z0) hashMap.remove((String) it2.next());
            if (z0Var2 != null) {
                try {
                    z0Var2.f12310a.f15664a.zzp();
                    b0.f12033b.remove(z0Var2.f12311b);
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
    }

    public final void Y(List list, List list2, List list3) {
        HashMap hashMap;
        C0 c02;
        R1.j jVar = this.f12209t0;
        jVar.f0(list);
        Iterator it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = (HashMap) jVar.f4682b;
            if (!hasNext) {
                break;
            }
            u0 u0Var = (u0) it.next();
            C0 c03 = (C0) hashMap.get(u0Var.f12286a);
            if (c03 != null) {
                AbstractC0412a.D(u0Var, c03);
            }
        }
        if (list3 != null) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (str != null && (c02 = (C0) hashMap.get(str)) != null) {
                    C1766A c1766a = c02.f12039a;
                    c1766a.getClass();
                    try {
                        c1766a.f15575a.zzi();
                        hashMap.remove(str);
                    } catch (RemoteException e7) {
                        throw new RuntimeException(e7);
                    }
                }
            }
        }
    }

    @Override // io.flutter.plugin.platform.g
    public final void a() {
        if (this.f12199i0) {
            return;
        }
        this.f12199i0 = true;
        int i7 = this.f12190a;
        String num = Integer.toString(i7);
        L5.f fVar = this.f12192c;
        androidx.datastore.preferences.protobuf.Y.B(fVar, num, null);
        androidx.datastore.preferences.protobuf.Y.C(fVar, Integer.toString(i7), null);
        N(null);
        if (this.f == null) {
            Log.v("GoogleMapController", "Controller was disposed before GoogleMap was ready.");
        } else {
            U4.a aVar = this.f12212w0;
            aVar.f5771e = null;
            aVar.f = null;
            aVar.f5769c = null;
        }
        M(null);
        if (this.f == null) {
            Log.v("GoogleMapController", "Controller was disposed before GoogleMap was ready.");
        } else {
            this.f12205o0.f12128X = null;
        }
        C();
        AbstractC0564p abstractC0564p = ((C1181n) this.f12203m0.f6744a).f12240a;
        if (abstractC0564p != null) {
            abstractC0564p.b(this);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void b(int i7) {
        C1608t c1608t = this.f;
        c1608t.getClass();
        try {
            C1742f c1742f = (C1742f) c1608t.f14880b;
            Parcel zza = c1742f.zza();
            zza.writeInt(i7);
            c1742f.zzc(16, zza);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void c(float f, float f4, float f8, float f9) {
        C1608t c1608t = this.f;
        if (c1608t != null) {
            float f10 = this.f12200j0;
            int i7 = (int) (f4 * f10);
            int i8 = (int) (f * f10);
            int i9 = (int) (f9 * f10);
            int i10 = (int) (f8 * f10);
            try {
                C1742f c1742f = (C1742f) c1608t.f14880b;
                Parcel zza = c1742f.zza();
                zza.writeInt(i7);
                zza.writeInt(i8);
                zza.writeInt(i9);
                zza.writeInt(i10);
                c1742f.zzc(39, zza);
                return;
            } catch (RemoteException e7) {
                throw new RuntimeException(e7);
            }
        }
        ArrayList arrayList = this.f12186H0;
        if (arrayList == null) {
            this.f12186H0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        this.f12186H0.add(Float.valueOf(f));
        this.f12186H0.add(Float.valueOf(f4));
        this.f12186H0.add(Float.valueOf(f8));
        this.f12186H0.add(Float.valueOf(f9));
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void d(boolean z7) {
        this.f12198h0 = z7;
    }

    @Override // q3.d
    public final boolean e(C1786n c1786n) {
        String a7 = c1786n.a();
        C1189w c1189w = this.f12204n0;
        String str = (String) c1189w.f12295c.get(a7);
        if (str == null) {
            return false;
        }
        return c1189w.b(str);
    }

    @Override // q3.e
    public final void f(C1786n c1786n) {
        String a7 = c1786n.a();
        LatLng b5 = c1786n.b();
        C1189w c1189w = this.f12204n0;
        String str = (String) c1189w.f12295c.get(a7);
        if (str != null) {
            f0 H7 = AbstractC0412a.H(b5);
            t2.i iVar = new t2.i(18);
            StringBuilder sb = new StringBuilder("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onMarkerDragEnd");
            a6.t0 t0Var = c1189w.f12296d;
            sb.append((String) t0Var.f7210c);
            String sb2 = sb.toString();
            new E.e((L5.f) t0Var.f7209b, sb2, A.f12030d, null, 4).f0(new ArrayList(Arrays.asList(str, H7)), new K4.e(iVar, sb2, 4));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void g(InterfaceC0568u interfaceC0568u) {
        if (this.f12199i0) {
            return;
        }
        this.f12194e.a(null);
    }

    @Override // io.flutter.plugin.platform.g
    public final View getView() {
        return this.f12194e;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void h(boolean z7) {
        this.f12196f0 = z7;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void i(boolean z7) {
        if (this.f12189Z == z7) {
            return;
        }
        this.f12189Z = z7;
        if (this.f != null) {
            U();
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void k(boolean z7) {
        C0927b f02 = this.f.f0();
        f02.getClass();
        try {
            C1739c c1739c = (C1739c) f02.f10587a;
            Parcel zza = c1739c.zza();
            int i7 = zzc.zza;
            zza.writeInt(z7 ? 1 : 0);
            c1739c.zzc(2, zza);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void l(boolean z7) {
        C0927b f02 = this.f.f0();
        f02.getClass();
        try {
            C1739c c1739c = (C1739c) f02.f10587a;
            Parcel zza = c1739c.zza();
            int i7 = zzc.zza;
            zza.writeInt(z7 ? 1 : 0);
            c1739c.zzc(18, zza);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void m(boolean z7) {
        this.f12187X = z7;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void n(boolean z7) {
        C0927b f02 = this.f.f0();
        f02.getClass();
        try {
            C1739c c1739c = (C1739c) f02.f10587a;
            Parcel zza = c1739c.zza();
            int i7 = zzc.zza;
            zza.writeInt(z7 ? 1 : 0);
            c1739c.zzc(4, zza);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void o(boolean z7) {
        this.f12193d.f9450f0 = Boolean.valueOf(z7);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC0568u interfaceC0568u) {
        interfaceC0568u.h().b(this);
        if (this.f12199i0) {
            return;
        }
        C();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(InterfaceC0568u interfaceC0568u) {
        if (this.f12199i0) {
            return;
        }
        q3.k kVar = this.f12194e.f15322a;
        kVar.getClass();
        kVar.k(null, new i3.e(kVar, 1));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC0568u interfaceC0568u) {
        if (this.f12199i0) {
            return;
        }
        q3.k kVar = this.f12194e.f15322a;
        kVar.getClass();
        kVar.k(null, new i3.e(kVar, 1));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC0568u interfaceC0568u) {
        if (this.f12199i0) {
            return;
        }
        q3.k kVar = this.f12194e.f15322a;
        kVar.getClass();
        kVar.k(null, new i3.e(kVar, 0));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC0568u interfaceC0568u) {
        if (this.f12199i0) {
            return;
        }
        q3.k kVar = this.f12194e.f15322a;
        p4.P p7 = (p4.P) kVar.f15330b;
        if (p7 != null) {
            try {
                C1743g c1743g = (C1743g) p7.f15211b;
                c1743g.zzc(13, c1743g.zza());
                return;
            } catch (RemoteException e7) {
                throw new RuntimeException(e7);
            }
        }
        while (!((LinkedList) kVar.f15332d).isEmpty() && ((i3.f) ((LinkedList) kVar.f15332d).getLast()).a() >= 4) {
            ((LinkedList) kVar.f15332d).removeLast();
        }
    }

    @Override // q3.e
    public final void p(C1786n c1786n) {
        String a7 = c1786n.a();
        LatLng b5 = c1786n.b();
        C1189w c1189w = this.f12204n0;
        String str = (String) c1189w.f12295c.get(a7);
        if (str != null) {
            f0 H7 = AbstractC0412a.H(b5);
            t2.i iVar = new t2.i(18);
            StringBuilder sb = new StringBuilder("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onMarkerDrag");
            a6.t0 t0Var = c1189w.f12296d;
            sb.append((String) t0Var.f7210c);
            String sb2 = sb.toString();
            new E.e((L5.f) t0Var.f7209b, sb2, A.f12030d, null, 4).f0(new ArrayList(Arrays.asList(str, H7)), new K4.e(iVar, sb2, 17));
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void q(LatLngBounds latLngBounds) {
        C1608t c1608t = this.f;
        c1608t.getClass();
        try {
            C1742f c1742f = (C1742f) c1608t.f14880b;
            Parcel zza = c1742f.zza();
            zzc.zzd(zza, latLngBounds);
            c1742f.zzc(95, zza);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void r(boolean z7) {
        C0927b f02 = this.f.f0();
        f02.getClass();
        try {
            C1739c c1739c = (C1739c) f02.f10587a;
            Parcel zza = c1739c.zza();
            int i7 = zzc.zza;
            zza.writeInt(z7 ? 1 : 0);
            c1739c.zzc(6, zza);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void s(boolean z7) {
        if (this.f12188Y == z7) {
            return;
        }
        this.f12188Y = z7;
        if (this.f != null) {
            U();
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void t(boolean z7) {
        C0927b f02 = this.f.f0();
        f02.getClass();
        try {
            C1739c c1739c = (C1739c) f02.f10587a;
            Parcel zza = c1739c.zza();
            int i7 = zzc.zza;
            zza.writeInt(z7 ? 1 : 0);
            c1739c.zzc(5, zza);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void u(String str) {
        if (this.f == null) {
            this.f12184F0 = str;
        } else {
            S(str);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void v(boolean z7) {
        if (this.f12195e0 == z7) {
            return;
        }
        this.f12195e0 = z7;
        C1608t c1608t = this.f;
        if (c1608t != null) {
            C0927b f02 = c1608t.f0();
            f02.getClass();
            try {
                C1739c c1739c = (C1739c) f02.f10587a;
                Parcel zza = c1739c.zza();
                int i7 = zzc.zza;
                zza.writeInt(z7 ? 1 : 0);
                c1739c.zzc(1, zza);
            } catch (RemoteException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void w(Float f, Float f4) {
        C1608t c1608t = this.f;
        c1608t.getClass();
        try {
            C1742f c1742f = (C1742f) c1608t.f14880b;
            c1742f.zzc(94, c1742f.zza());
            if (f != null) {
                C1608t c1608t2 = this.f;
                float floatValue = f.floatValue();
                c1608t2.getClass();
                try {
                    C1742f c1742f2 = (C1742f) c1608t2.f14880b;
                    Parcel zza = c1742f2.zza();
                    zza.writeFloat(floatValue);
                    c1742f2.zzc(92, zza);
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            }
            if (f4 != null) {
                C1608t c1608t3 = this.f;
                float floatValue2 = f4.floatValue();
                c1608t3.getClass();
                try {
                    C1742f c1742f3 = (C1742f) c1608t3.f14880b;
                    Parcel zza2 = c1742f3.zza();
                    zza2.writeFloat(floatValue2);
                    c1742f3.zzc(93, zza2);
                } catch (RemoteException e8) {
                    throw new RuntimeException(e8);
                }
            }
        } catch (RemoteException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void x(boolean z7) {
        this.f12197g0 = z7;
        C1608t c1608t = this.f;
        if (c1608t == null) {
            return;
        }
        c1608t.r0(z7);
    }

    @Override // q3.e
    public final void y(C1786n c1786n) {
        String a7 = c1786n.a();
        LatLng b5 = c1786n.b();
        C1189w c1189w = this.f12204n0;
        String str = (String) c1189w.f12295c.get(a7);
        if (str != null) {
            f0 H7 = AbstractC0412a.H(b5);
            t2.i iVar = new t2.i(18);
            StringBuilder sb = new StringBuilder("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onMarkerDragStart");
            a6.t0 t0Var = c1189w.f12296d;
            sb.append((String) t0Var.f7210c);
            String sb2 = sb.toString();
            new E.e((L5.f) t0Var.f7209b, sb2, A.f12030d, null, 4).f0(new ArrayList(Arrays.asList(str, H7)), new K4.e(iVar, sb2, 13));
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void z(boolean z7) {
        C0927b f02 = this.f.f0();
        f02.getClass();
        try {
            C1739c c1739c = (C1739c) f02.f10587a;
            Parcel zza = c1739c.zza();
            int i7 = zzc.zza;
            zza.writeInt(z7 ? 1 : 0);
            c1739c.zzc(7, zza);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
