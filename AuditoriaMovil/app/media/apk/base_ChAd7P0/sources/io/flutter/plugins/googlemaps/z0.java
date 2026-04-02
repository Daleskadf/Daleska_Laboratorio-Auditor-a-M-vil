package io.flutter.plugins.googlemaps;

import android.os.RemoteException;
import java.util.ArrayList;
import s3.C1776d;
/* loaded from: classes.dex */
public final class z0 implements A0 {

    /* renamed from: a  reason: collision with root package name */
    public final s3.u f12310a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12311b;

    /* renamed from: c  reason: collision with root package name */
    public final float f12312c;

    public z0(s3.u uVar, boolean z7, float f) {
        this.f12310a = uVar;
        this.f12312c = f;
        try {
            this.f12311b = uVar.f15664a.zzl();
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.A0
    public final void a(float f) {
        s3.u uVar = this.f12310a;
        uVar.getClass();
        try {
            uVar.f15664a.zzC(f);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.A0
    public final void b(boolean z7) {
        try {
            this.f12310a.f15664a.zzq(z7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.A0
    public final void d(boolean z7) {
        s3.u uVar = this.f12310a;
        uVar.getClass();
        try {
            uVar.f15664a.zzt(z7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.A0
    public final void e(ArrayList arrayList) {
        try {
            this.f12310a.f15664a.zzw(arrayList);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.A0
    public final void h(int i7) {
        s3.u uVar = this.f12310a;
        uVar.getClass();
        try {
            uVar.f15664a.zzu(i7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.A0
    public final void i(float f) {
        float f4 = f * this.f12312c;
        s3.u uVar = this.f12310a;
        uVar.getClass();
        try {
            uVar.f15664a.zzB(f4);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.A0
    public final void j(C1776d c1776d) {
        try {
            this.f12310a.f15664a.zzs(c1776d);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.A0
    public final void k(ArrayList arrayList) {
        try {
            this.f12310a.f15664a.zzv(arrayList);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.A0
    public final void o(int i7) {
        s3.u uVar = this.f12310a;
        uVar.getClass();
        try {
            uVar.f15664a.zzr(i7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.A0
    public final void p(C1776d c1776d) {
        try {
            this.f12310a.f15664a.zzy(c1776d);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.A0
    public final void setVisible(boolean z7) {
        s3.u uVar = this.f12310a;
        uVar.getClass();
        try {
            uVar.f15664a.zzA(z7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
