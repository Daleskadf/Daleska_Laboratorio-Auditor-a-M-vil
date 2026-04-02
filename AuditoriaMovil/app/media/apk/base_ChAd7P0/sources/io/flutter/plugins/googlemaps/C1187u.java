package io.flutter.plugins.googlemaps;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import java.lang.ref.WeakReference;
import s3.C1774b;
import s3.C1786n;
/* renamed from: io.flutter.plugins.googlemaps.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1187u implements InterfaceC1188v {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f12283a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12284b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12285c;

    public C1187u(C1786n c1786n, boolean z7) {
        this.f12283a = new WeakReference(c1786n);
        this.f12285c = z7;
        this.f12284b = c1786n.a();
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void a(float f) {
        C1786n c1786n = (C1786n) this.f12283a.get();
        if (c1786n == null) {
            return;
        }
        try {
            c1786n.f15625a.zzC(f);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void b(boolean z7) {
        if (((C1786n) this.f12283a.get()) == null) {
            return;
        }
        this.f12285c = z7;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void c(float f, float f4) {
        C1786n c1786n = (C1786n) this.f12283a.get();
        if (c1786n == null) {
            return;
        }
        try {
            c1786n.f15625a.zzq(f, f4);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void d(float f) {
        C1786n c1786n = (C1786n) this.f12283a.get();
        if (c1786n == null) {
            return;
        }
        try {
            c1786n.f15625a.zzp(f);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void e(boolean z7) {
        C1786n c1786n = (C1786n) this.f12283a.get();
        if (c1786n == null) {
            return;
        }
        try {
            c1786n.f15625a.zzr(z7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void f(boolean z7) {
        C1786n c1786n = (C1786n) this.f12283a.get();
        if (c1786n == null) {
            return;
        }
        try {
            c1786n.f15625a.zzs(z7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void g(float f, float f4) {
        C1786n c1786n = (C1786n) this.f12283a.get();
        if (c1786n == null) {
            return;
        }
        try {
            c1786n.f15625a.zzv(f, f4);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void h(float f) {
        C1786n c1786n = (C1786n) this.f12283a.get();
        if (c1786n == null) {
            return;
        }
        try {
            c1786n.f15625a.zzx(f);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void i(LatLng latLng) {
        C1786n c1786n = (C1786n) this.f12283a.get();
        if (c1786n == null) {
            return;
        }
        c1786n.c(latLng);
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void j(String str, String str2) {
        C1786n c1786n = (C1786n) this.f12283a.get();
        if (c1786n == null) {
            return;
        }
        c1786n.d(str);
        try {
            c1786n.f15625a.zzy(str2);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void k(C1774b c1774b) {
        C1786n c1786n = (C1786n) this.f12283a.get();
        if (c1786n == null) {
            return;
        }
        try {
            c1786n.f15625a.zzt(c1774b.f15590a);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void setVisible(boolean z7) {
        C1786n c1786n = (C1786n) this.f12283a.get();
        if (c1786n == null) {
            return;
        }
        try {
            c1786n.f15625a.zzB(z7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
