package io.flutter.plugins.googlemaps;

import android.os.RemoteException;
import s3.C1766A;
/* loaded from: classes.dex */
public final class C0 implements D0 {

    /* renamed from: a  reason: collision with root package name */
    public final C1766A f12039a;

    public C0(C1766A c1766a) {
        this.f12039a = c1766a;
    }

    @Override // io.flutter.plugins.googlemaps.D0
    public final void a(float f) {
        C1766A c1766a = this.f12039a;
        c1766a.getClass();
        try {
            c1766a.f15575a.zzm(f);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.D0
    public final void b(float f) {
        C1766A c1766a = this.f12039a;
        c1766a.getClass();
        try {
            c1766a.f15575a.zzk(f);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.D0
    public final void i(boolean z7) {
        C1766A c1766a = this.f12039a;
        c1766a.getClass();
        try {
            c1766a.f15575a.zzj(z7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.D0
    public final void setVisible(boolean z7) {
        C1766A c1766a = this.f12039a;
        c1766a.getClass();
        try {
            c1766a.f15575a.zzl(z7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
