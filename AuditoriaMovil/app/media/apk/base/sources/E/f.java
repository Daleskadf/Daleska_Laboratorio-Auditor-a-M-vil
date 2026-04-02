package E;

import D.AbstractC0059i;
import D.F;
import D.G;
import D.e0;
import D.n0;
import android.util.Log;
import androidx.camera.core.impl.T;
import h3.AbstractC1079a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class f implements F {

    /* renamed from: b  reason: collision with root package name */
    public e f925b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f926c;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque f924a = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    public boolean f927d = false;

    public f(e0 e0Var) {
        AbstractC1079a.e();
        this.f926c = new ArrayList();
    }

    @Override // D.F
    public final void a(G g3) {
        j3.f.C().execute(new C.b(this, 4));
    }

    public final void b() {
        AbstractC1079a.e();
        new Exception("Camera is closed.", null);
        ArrayDeque arrayDeque = this.f924a;
        Iterator it = arrayDeque.iterator();
        if (!it.hasNext()) {
            arrayDeque.clear();
            Iterator it2 = new ArrayList(this.f926c).iterator();
            if (!it2.hasNext()) {
                return;
            }
            AbstractC0059i.I(it2.next());
            throw null;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public final void c() {
        boolean z7;
        int E4;
        AbstractC1079a.e();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (this.f927d) {
            Log.d("TakePictureManager", "The class is paused.");
            return;
        }
        e eVar = this.f925b;
        eVar.getClass();
        AbstractC1079a.e();
        A.f fVar = (A.f) eVar.f921c;
        fVar.getClass();
        AbstractC1079a.e();
        if (((n0) fVar.f10b) != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.g("The ImageReader is not initialized.", z7);
        n0 n0Var = (n0) fVar.f10b;
        synchronized (n0Var.f754c) {
            E4 = ((T) n0Var.f755d).E() - n0Var.f752a;
        }
        if (E4 == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
        } else if (this.f924a.poll() == null) {
            Log.d("TakePictureManager", "No new request.");
        } else {
            throw new ClassCastException();
        }
    }
}
