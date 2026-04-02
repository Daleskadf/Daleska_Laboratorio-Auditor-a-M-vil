package io.flutter.plugins.googlemaps;

import android.os.RemoteException;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class x0 implements y0 {

    /* renamed from: a  reason: collision with root package name */
    public final s3.s f12303a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12304b;

    /* renamed from: c  reason: collision with root package name */
    public final float f12305c;

    public x0(s3.s sVar, boolean z7, float f) {
        this.f12303a = sVar;
        this.f12305c = f;
        try {
            this.f12304b = sVar.f15653a.zzk();
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.y0, io.flutter.plugins.googlemaps.A0
    public final void a(float f) {
        s3.s sVar = this.f12303a;
        sVar.getClass();
        try {
            sVar.f15653a.zzA(f);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.y0, io.flutter.plugins.googlemaps.A0
    public final void b(boolean z7) {
        try {
            this.f12303a.f15653a.zzp(z7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.y0
    public final void c(int i7) {
        s3.s sVar = this.f12303a;
        sVar.getClass();
        try {
            sVar.f15653a.zzu(i7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.y0, io.flutter.plugins.googlemaps.A0
    public final void d(boolean z7) {
        s3.s sVar = this.f12303a;
        sVar.getClass();
        try {
            sVar.f15653a.zzr(z7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.y0, io.flutter.plugins.googlemaps.A0
    public final void e(ArrayList arrayList) {
        try {
            this.f12303a.f15653a.zzt(arrayList);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.y0
    public final void f(int i7) {
        s3.s sVar = this.f12303a;
        sVar.getClass();
        try {
            sVar.f15653a.zzq(i7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.y0
    public final void g(float f) {
        float f4 = f * this.f12305c;
        s3.s sVar = this.f12303a;
        sVar.getClass();
        try {
            sVar.f15653a.zzx(f4);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.y0
    public final void l(ArrayList arrayList) {
        try {
            this.f12303a.f15653a.zzs(arrayList);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.y0, io.flutter.plugins.googlemaps.A0
    public final void setVisible(boolean z7) {
        s3.s sVar = this.f12303a;
        sVar.getClass();
        try {
            sVar.f15653a.zzz(z7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
