package io.flutter.plugins.googlemaps;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzr;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import s3.C1774b;
import s3.C1782j;
/* renamed from: io.flutter.plugins.googlemaps.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1182o implements InterfaceC1183p {

    /* renamed from: a  reason: collision with root package name */
    public final C1782j f12241a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12242b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12243c;

    public C1182o(C1782j c1782j, boolean z7) {
        this.f12241a = c1782j;
        try {
            this.f12242b = c1782j.f15608a.zzm();
            this.f12243c = z7;
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1183p
    public final void a(float f) {
        C1782j c1782j = this.f12241a;
        c1782j.getClass();
        try {
            c1782j.f15608a.zzy(f);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1183p
    public final void b(float f) {
        C1782j c1782j = this.f12241a;
        c1782j.getClass();
        try {
            c1782j.f15608a.zzw(f);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1183p
    public final void c(float f, float f4) {
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1183p
    public final void g(boolean z7) {
        C1782j c1782j = this.f12241a;
        c1782j.getClass();
        try {
            c1782j.f15608a.zzp(z7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1183p
    public final void h(C1774b c1774b) {
        C1782j c1782j = this.f12241a;
        try {
            c1782j.f15608a.zzs(c1774b.f15590a);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1183p
    public final void j(LatLng latLng, Float f, Float f4) {
        zzr zzrVar = this.f12241a.f15608a;
        try {
            zzrVar.zzt(latLng);
            if (f4 == null) {
                try {
                    zzrVar.zzq(f.floatValue());
                    return;
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            }
            try {
                zzrVar.zzr(f.floatValue(), f4.floatValue());
            } catch (RemoteException e8) {
                throw new RuntimeException(e8);
            }
        } catch (RemoteException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1183p
    public final void q(LatLngBounds latLngBounds) {
        try {
            this.f12241a.f15608a.zzu(latLngBounds);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1183p
    public final void setVisible(boolean z7) {
        C1782j c1782j = this.f12241a;
        c1782j.getClass();
        try {
            c1782j.f15608a.zzx(z7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1183p
    public final void x(float f) {
        C1782j c1782j = this.f12241a;
        c1782j.getClass();
        try {
            c1782j.f15608a.zzo(f);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
