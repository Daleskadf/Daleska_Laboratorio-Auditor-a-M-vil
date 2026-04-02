package U5;

import D.AbstractC0059i;
import R1.j;
import android.util.Log;
/* loaded from: classes.dex */
public final class f implements H5.b, I5.a {

    /* renamed from: a  reason: collision with root package name */
    public j f5783a;

    @Override // I5.a
    public final void onAttachedToActivity(I5.b bVar) {
        j jVar = this.f5783a;
        if (jVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            jVar.f4684d = ((C5.d) bVar).f571a;
        }
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
        j jVar = new j(aVar.f2029a);
        this.f5783a = jVar;
        AbstractC0059i.Q(aVar.f2030b, jVar);
    }

    @Override // I5.a
    public final void onDetachedFromActivity() {
        j jVar = this.f5783a;
        if (jVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            jVar.f4684d = null;
        }
    }

    @Override // I5.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
        if (this.f5783a == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        AbstractC0059i.Q(aVar.f2030b, null);
        this.f5783a = null;
    }

    @Override // I5.a
    public final void onReattachedToActivityForConfigChanges(I5.b bVar) {
        onAttachedToActivity(bVar);
    }
}
