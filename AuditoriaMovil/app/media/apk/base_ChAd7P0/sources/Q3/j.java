package q3;

import a.AbstractC0412a;
import a6.t0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.TextureView;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzaf;
import com.google.android.gms.internal.maps.zzag;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzaj;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzk;
import com.google.android.gms.internal.maps.zzl;
import com.google.android.gms.internal.maps.zzq;
import com.google.android.gms.internal.maps.zzr;
import com.google.android.gms.maps.model.LatLng;
import io.flutter.plugins.googlemaps.A;
import io.flutter.plugins.googlemaps.B0;
import io.flutter.plugins.googlemaps.C1165b;
import io.flutter.plugins.googlemaps.C1169d;
import io.flutter.plugins.googlemaps.C1173f;
import io.flutter.plugins.googlemaps.C1177j;
import io.flutter.plugins.googlemaps.C1184q;
import io.flutter.plugins.googlemaps.C1189w;
import io.flutter.plugins.googlemaps.TextureView$SurfaceTextureListenerC1176i;
import io.flutter.plugins.googlemaps.f0;
import io.flutter.plugins.googlemaps.l0;
import io.flutter.plugins.googlemaps.x0;
import io.flutter.plugins.googlemaps.z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p.C1608t;
import r3.C1742f;
/* loaded from: classes.dex */
public final class j extends zzb {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15327a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1177j f15328b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C1177j c1177j, int i7) {
        super("com.google.android.gms.maps.internal.IOnMapLongClickListener");
        this.f15327a = i7;
        switch (i7) {
            case 1:
                this.f15328b = c1177j;
                super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                return;
            case 2:
                this.f15328b = c1177j;
                super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
                return;
            case 3:
                this.f15328b = c1177j;
                super("com.google.android.gms.maps.internal.IOnCircleClickListener");
                return;
            case 4:
                this.f15328b = c1177j;
                super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
                return;
            case 5:
                this.f15328b = c1177j;
                super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
                return;
            case 6:
                this.f15328b = c1177j;
                super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
                return;
            case 7:
                this.f15328b = c1177j;
                super("com.google.android.gms.maps.internal.IOnCameraMoveListener");
                return;
            case 8:
                this.f15328b = c1177j;
                super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
                return;
            case 9:
                this.f15328b = c1177j;
                super("com.google.android.gms.maps.internal.IOnMapClickListener");
                return;
            default:
                this.f15328b = c1177j;
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        C1742f c1742f;
        switch (this.f15327a) {
            case 0:
                if (i7 == 1) {
                    zzc.zzc(parcel);
                    C1177j c1177j = this.f15328b;
                    c1177j.getClass();
                    f0 H7 = AbstractC0412a.H((LatLng) zzc.zza(parcel, LatLng.CREATOR));
                    t2.i iVar = new t2.i(18);
                    StringBuilder sb = new StringBuilder("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onLongPress");
                    t0 t0Var = c1177j.f12191b;
                    sb.append((String) t0Var.f7210c);
                    String sb2 = sb.toString();
                    new E.e((L5.f) t0Var.f7209b, sb2, A.f12030d, null, 4).f0(new ArrayList(Collections.singletonList(H7)), new K4.e(iVar, sb2, 10));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 1:
                if (i7 != 1) {
                    return false;
                }
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c1742f = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (queryLocalInterface instanceof C1742f) {
                        c1742f = (C1742f) queryLocalInterface;
                    } else {
                        c1742f = new zza(readStrongBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    }
                }
                zzc.zzc(parcel);
                C1608t c1608t = new C1608t(c1742f);
                C1177j c1177j2 = this.f15328b;
                c1177j2.f = c1608t;
                boolean z7 = c1177j2.f12196f0;
                try {
                    C1742f c1742f2 = (C1742f) c1608t.f14880b;
                    Parcel zza = c1742f2.zza();
                    zza.writeInt(z7 ? 1 : 0);
                    Parcel zzJ = c1742f2.zzJ(20, zza);
                    zzc.zzf(zzJ);
                    zzJ.recycle();
                    c1177j2.f.r0(c1177j2.f12197g0);
                    C1608t c1608t2 = c1177j2.f;
                    boolean z8 = c1177j2.f12198h0;
                    c1608t2.getClass();
                    try {
                        C1742f c1742f3 = (C1742f) c1608t2.f14880b;
                        Parcel zza2 = c1742f3.zza();
                        zza2.writeInt(z8 ? 1 : 0);
                        c1742f3.zzc(41, zza2);
                        f fVar = c1177j2.f12194e;
                        if (fVar != null) {
                            TextureView D4 = C1177j.D(fVar);
                            if (D4 == null) {
                                Log.i("GoogleMapController", "No TextureView found. Likely using the LEGACY renderer.");
                            } else {
                                Log.i("GoogleMapController", "Installing custom TextureView driven invalidator.");
                                D4.setSurfaceTextureListener(new TextureView$SurfaceTextureListenerC1176i(D4.getSurfaceTextureListener(), c1177j2.f12194e));
                            }
                        }
                        io.flutter.plugins.firebase.storage.g gVar = c1177j2.f12201k0;
                        if (gVar != null) {
                            gVar.f();
                            c1177j2.f12201k0 = null;
                        }
                        c1177j2.N(c1177j2);
                        U4.b bVar = new U4.b(c1608t);
                        c1177j2.f12211v0 = bVar;
                        c1177j2.f12212w0 = new U4.a(bVar);
                        c1177j2.U();
                        U4.a aVar = c1177j2.f12212w0;
                        C1189w c1189w = c1177j2.f12204n0;
                        c1189w.f12297e = aVar;
                        U4.b bVar2 = c1177j2.f12211v0;
                        C1173f c1173f = c1177j2.f12205o0;
                        c1173f.f12132d = bVar2;
                        c1173f.f12133e = c1608t;
                        C1169d c1169d = c1177j2.f12206p0;
                        c1169d.f12123e = c1608t;
                        B0 b0 = c1177j2.q0;
                        b0.f12035d = c1608t;
                        C1169d c1169d2 = c1177j2.f12207r0;
                        c1169d2.f12123e = c1608t;
                        U4.b bVar3 = c1177j2.f12208s0;
                        bVar3.f5774b = c1608t;
                        R1.j jVar = c1177j2.f12209t0;
                        jVar.f4684d = c1608t;
                        C1184q c1184q = c1177j2.f12210u0;
                        c1184q.f12257d = c1608t;
                        if (c1177j2.f == null) {
                            Log.v("GoogleMapController", "Controller was disposed before GoogleMap was ready.");
                        } else {
                            aVar.f5771e = c1177j2;
                            aVar.f = c1177j2;
                            aVar.f5769c = c1177j2;
                        }
                        c1177j2.M(c1177j2);
                        if (c1177j2.f == null) {
                            Log.v("GoogleMapController", "Controller was disposed before GoogleMap was ready.");
                        } else {
                            c1173f.f12128X = c1177j2;
                        }
                        List list = c1177j2.f12214y0;
                        if (list != null) {
                            c1173f.a(list);
                        }
                        List<l0> list2 = c1177j2.f12213x0;
                        if (list2 != null) {
                            c1189w.getClass();
                            for (l0 l0Var : list2) {
                                c1189w.a(l0Var);
                            }
                        }
                        List list3 = c1177j2.f12215z0;
                        if (list3 != null) {
                            c1169d.b(list3);
                        }
                        List list4 = c1177j2.f12179A0;
                        if (list4 != null) {
                            b0.a(list4);
                        }
                        List list5 = c1177j2.f12180B0;
                        if (list5 != null) {
                            c1169d2.a(list5);
                        }
                        List list6 = c1177j2.f12181C0;
                        if (list6 != null) {
                            bVar3.b(list6);
                        }
                        List list7 = c1177j2.f12182D0;
                        if (list7 != null) {
                            jVar.f0(list7);
                        }
                        List list8 = c1177j2.f12183E0;
                        if (list8 != null) {
                            c1184q.a(list8);
                        }
                        ArrayList arrayList = c1177j2.f12186H0;
                        if (arrayList != null && arrayList.size() == 4) {
                            c1177j2.c(((Float) c1177j2.f12186H0.get(0)).floatValue(), ((Float) c1177j2.f12186H0.get(1)).floatValue(), ((Float) c1177j2.f12186H0.get(2)).floatValue(), ((Float) c1177j2.f12186H0.get(3)).floatValue());
                        }
                        String str = c1177j2.f12184F0;
                        if (str != null) {
                            c1177j2.S(str);
                            c1177j2.f12184F0 = null;
                        }
                        parcel2.writeNoException();
                        return true;
                    } catch (RemoteException e7) {
                        throw new RuntimeException(e7);
                    }
                } catch (RemoteException e8) {
                    throw new RuntimeException(e8);
                }
            case 2:
                if (i7 == 1) {
                    zzr zzb = zzq.zzb(parcel.readStrongBinder());
                    zzc.zzc(parcel);
                    I.i(zzb);
                    C1177j c1177j3 = this.f15328b;
                    c1177j3.getClass();
                    try {
                        String zzm = zzb.zzm();
                        C1184q c1184q2 = c1177j3.f12210u0;
                        String str2 = (String) c1184q2.f12255b.get(zzm);
                        if (str2 != null) {
                            t2.i iVar2 = new t2.i(18);
                            StringBuilder sb3 = new StringBuilder("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onGroundOverlayTap");
                            t0 t0Var2 = c1184q2.f12256c;
                            sb3.append((String) t0Var2.f7210c);
                            String sb4 = sb3.toString();
                            new E.e((L5.f) t0Var2.f7209b, sb4, A.f12030d, null, 4).f0(new ArrayList(Collections.singletonList(str2)), new K4.e(iVar2, sb4, 8));
                        }
                        parcel2.writeNoException();
                        return true;
                    } catch (RemoteException e9) {
                        throw new RuntimeException(e9);
                    }
                }
                return false;
            case 3:
                if (i7 == 1) {
                    zzl zzb2 = zzk.zzb(parcel.readStrongBinder());
                    zzc.zzc(parcel);
                    I.i(zzb2);
                    C1177j c1177j4 = this.f15328b;
                    c1177j4.getClass();
                    try {
                        String zzl = zzb2.zzl();
                        C1169d c1169d3 = c1177j4.f12207r0;
                        String str3 = (String) c1169d3.f12120b.get(zzl);
                        if (str3 != null) {
                            t2.i iVar3 = new t2.i(18);
                            StringBuilder sb5 = new StringBuilder("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onCircleTap");
                            t0 t0Var3 = c1169d3.f12121c;
                            sb5.append((String) t0Var3.f7210c);
                            String sb6 = sb5.toString();
                            new E.e((L5.f) t0Var3.f7209b, sb6, A.f12030d, null, 4).f0(new ArrayList(Collections.singletonList(str3)), new K4.e(iVar3, sb6, 6));
                            C1165b c1165b = (C1165b) c1169d3.f12119a.get(str3);
                        }
                        parcel2.writeNoException();
                        return true;
                    } catch (RemoteException e10) {
                        throw new RuntimeException(e10);
                    }
                }
                return false;
            case 4:
                if (i7 == 1) {
                    zzag zzb3 = zzaf.zzb(parcel.readStrongBinder());
                    zzc.zzc(parcel);
                    I.i(zzb3);
                    C1177j c1177j5 = this.f15328b;
                    c1177j5.getClass();
                    try {
                        String zzk = zzb3.zzk();
                        C1169d c1169d4 = c1177j5.f12206p0;
                        String str4 = (String) c1169d4.f12120b.get(zzk);
                        if (str4 != null) {
                            t2.i iVar4 = new t2.i(18);
                            StringBuilder sb7 = new StringBuilder("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onPolygonTap");
                            t0 t0Var4 = c1169d4.f12121c;
                            sb7.append((String) t0Var4.f7210c);
                            String sb8 = sb7.toString();
                            new E.e((L5.f) t0Var4.f7209b, sb8, A.f12030d, null, 4).f0(new ArrayList(Collections.singletonList(str4)), new K4.e(iVar4, sb8, 18));
                            x0 x0Var = (x0) c1169d4.f12119a.get(str4);
                        }
                        parcel2.writeNoException();
                        return true;
                    } catch (RemoteException e11) {
                        throw new RuntimeException(e11);
                    }
                }
                return false;
            case 5:
                if (i7 == 1) {
                    zzaj zzb4 = zzai.zzb(parcel.readStrongBinder());
                    zzc.zzc(parcel);
                    I.i(zzb4);
                    C1177j c1177j6 = this.f15328b;
                    c1177j6.getClass();
                    try {
                        String zzl2 = zzb4.zzl();
                        B0 b02 = c1177j6.q0;
                        String str5 = (String) b02.f12033b.get(zzl2);
                        if (str5 != null) {
                            t2.i iVar5 = new t2.i(18);
                            StringBuilder sb9 = new StringBuilder("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onPolylineTap");
                            t0 t0Var5 = b02.f12034c;
                            sb9.append((String) t0Var5.f7210c);
                            String sb10 = sb9.toString();
                            new E.e((L5.f) t0Var5.f7209b, sb10, A.f12030d, null, 4).f0(new ArrayList(Collections.singletonList(str5)), new K4.e(iVar5, sb10, 11));
                            z0 z0Var = (z0) b02.f12032a.get(str5);
                        }
                        parcel2.writeNoException();
                        return true;
                    } catch (RemoteException e12) {
                        throw new RuntimeException(e12);
                    }
                }
                return false;
            case 6:
                if (i7 == 1) {
                    parcel.readInt();
                    zzc.zzc(parcel);
                    t2.i iVar6 = new t2.i(18);
                    StringBuilder sb11 = new StringBuilder("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onCameraMoveStarted");
                    t0 t0Var6 = this.f15328b.f12191b;
                    sb11.append((String) t0Var6.f7210c);
                    String sb12 = sb11.toString();
                    new E.e((L5.f) t0Var6.f7209b, sb12, A.f12030d, null, 4).f0(null, new K4.e(iVar6, sb12, 14));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 7:
                if (i7 == 1) {
                    C1177j c1177j7 = this.f15328b;
                    if (c1177j7.f12187X) {
                        io.flutter.plugins.googlemaps.I a7 = AbstractC0412a.a(c1177j7.f.c0());
                        t2.i iVar7 = new t2.i(18);
                        StringBuilder sb13 = new StringBuilder("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onCameraMove");
                        t0 t0Var7 = c1177j7.f12191b;
                        sb13.append((String) t0Var7.f7210c);
                        String sb14 = sb13.toString();
                        new E.e((L5.f) t0Var7.f7209b, sb14, A.f12030d, null, 4).f0(new ArrayList(Collections.singletonList(a7)), new K4.e(iVar7, sb14, 12));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 8:
                if (i7 == 1) {
                    this.f15328b.A();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            default:
                if (i7 == 1) {
                    zzc.zzc(parcel);
                    C1177j c1177j8 = this.f15328b;
                    c1177j8.getClass();
                    f0 H8 = AbstractC0412a.H((LatLng) zzc.zza(parcel, LatLng.CREATOR));
                    t2.i iVar8 = new t2.i(18);
                    StringBuilder sb15 = new StringBuilder("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onTap");
                    t0 t0Var8 = c1177j8.f12191b;
                    sb15.append((String) t0Var8.f7210c);
                    String sb16 = sb15.toString();
                    new E.e((L5.f) t0Var8.f7209b, sb16, A.f12030d, null, 4).f0(new ArrayList(Collections.singletonList(H8)), new K4.e(iVar8, sb16, 15));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
        }
    }
}
