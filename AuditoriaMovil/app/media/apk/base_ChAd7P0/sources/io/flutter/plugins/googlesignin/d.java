package io.flutter.plugins.googlesignin;

import androidx.datastore.preferences.protobuf.Y;
/* loaded from: classes.dex */
public class d implements H5.b, I5.a {

    /* renamed from: a  reason: collision with root package name */
    public c f12321a;

    /* renamed from: b  reason: collision with root package name */
    public L5.f f12322b;

    /* renamed from: c  reason: collision with root package name */
    public I5.b f12323c;

    @Override // I5.a
    public final void onAttachedToActivity(I5.b bVar) {
        this.f12323c = bVar;
        C5.d dVar = (C5.d) bVar;
        dVar.a(this.f12321a);
        this.f12321a.f12317b = dVar.f571a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [v4.d, java.lang.Object] */
    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
        L5.f fVar = aVar.f2030b;
        ?? obj = new Object();
        this.f12322b = fVar;
        c cVar = new c(aVar.f2029a, obj);
        this.f12321a = cVar;
        Y.z(fVar, cVar);
    }

    @Override // I5.a
    public final void onDetachedFromActivity() {
        ((C5.d) this.f12323c).d(this.f12321a);
        this.f12321a.f12317b = null;
        this.f12323c = null;
    }

    @Override // I5.a
    public final void onDetachedFromActivityForConfigChanges() {
        ((C5.d) this.f12323c).d(this.f12321a);
        this.f12321a.f12317b = null;
        this.f12323c = null;
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
        this.f12321a = null;
        L5.f fVar = this.f12322b;
        if (fVar != null) {
            Y.z(fVar, null);
            this.f12322b = null;
        }
    }

    @Override // I5.a
    public final void onReattachedToActivityForConfigChanges(I5.b bVar) {
        this.f12323c = bVar;
        C5.d dVar = (C5.d) bVar;
        dVar.a(this.f12321a);
        this.f12321a.f12317b = dVar.f571a;
    }
}
