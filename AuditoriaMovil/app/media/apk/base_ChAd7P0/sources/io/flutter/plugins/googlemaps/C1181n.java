package io.flutter.plugins.googlemaps;

import a1.C0415A;
import androidx.lifecycle.AbstractC0564p;
/* renamed from: io.flutter.plugins.googlemaps.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1181n implements H5.b, I5.a {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC0564p f12240a;

    @Override // I5.a
    public final void onAttachedToActivity(I5.b bVar) {
        this.f12240a = ((C5.d) bVar).f572b.getLifecycle();
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
        aVar.f2032d.i("plugins.flutter.dev/google_maps_android", new C1178k(aVar.f2030b, aVar.f2029a, new C0415A(this)));
    }

    @Override // I5.a
    public final void onDetachedFromActivity() {
        this.f12240a = null;
    }

    @Override // I5.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f12240a = null;
    }

    @Override // I5.a
    public final void onReattachedToActivityForConfigChanges(I5.b bVar) {
        onAttachedToActivity(bVar);
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
    }
}
