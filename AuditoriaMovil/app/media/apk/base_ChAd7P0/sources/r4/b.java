package R4;

import S4.e;
import T4.f;
import T4.g;
import android.os.AsyncTask;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes.dex */
public final class b extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f4767a;

    public b(c cVar) {
        this.f4767a = cVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Float[] fArr = (Float[]) objArr;
        e eVar = this.f4767a.f4774d;
        ((ReentrantReadWriteLock) eVar.f229a).writeLock().lock();
        try {
            return eVar.f5273b.y(fArr[0].floatValue());
        } finally {
            eVar.s();
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Set set = (Set) obj;
        g gVar = this.f4767a.f4775e.f5379o;
        synchronized (gVar) {
            gVar.f5363b = new f(gVar.f5364c, set);
        }
        gVar.sendEmptyMessage(0);
    }
}
