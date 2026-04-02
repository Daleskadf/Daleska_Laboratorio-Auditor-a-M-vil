package w3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import r2.ServiceConnectionC1733b;
/* renamed from: w3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1953b extends z {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ IBinder f16340X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC1733b f16341Y;

    public C1953b(ServiceConnectionC1733b serviceConnectionC1733b, IBinder iBinder) {
        this.f16341Y = serviceConnectionC1733b;
        this.f16340X = iBinder;
    }

    @Override // w3.z
    public final void b() {
        ServiceConnectionC1733b serviceConnectionC1733b = this.f16341Y;
        d dVar = (d) serviceConnectionC1733b.f15461b;
        dVar.f16356n = (IInterface) ((d) serviceConnectionC1733b.f15461b).f16352i.a(this.f16340X);
        y yVar = dVar.f16346b;
        yVar.b("linkToDeath", new Object[0]);
        try {
            dVar.f16356n.asBinder().linkToDeath(dVar.f16353k, 0);
        } catch (RemoteException e7) {
            yVar.a(e7, "linkToDeath failed", new Object[0]);
        }
        dVar.f16350g = false;
        Iterator it = dVar.f16348d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        dVar.f16348d.clear();
    }
}
