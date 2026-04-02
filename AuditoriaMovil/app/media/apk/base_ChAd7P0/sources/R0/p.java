package R0;

import K0.x;
import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
import w1.C1950b;
/* loaded from: classes.dex */
public final class p implements Handler.Callback {

    /* renamed from: X  reason: collision with root package name */
    public boolean f4629X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f4630Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f4631Z;

    /* renamed from: a  reason: collision with root package name */
    public final i1.e f4632a;

    /* renamed from: b  reason: collision with root package name */
    public final A4.c f4633b;
    public S0.c f;

    /* renamed from: e  reason: collision with root package name */
    public final TreeMap f4636e = new TreeMap();

    /* renamed from: d  reason: collision with root package name */
    public final Handler f4635d = x.n(this);

    /* renamed from: c  reason: collision with root package name */
    public final C1950b f4634c = new C1950b(1);

    public p(S0.c cVar, A4.c cVar2, i1.e eVar) {
        this.f = cVar;
        this.f4633b = cVar2;
        this.f4632a = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f4631Z) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        n nVar = (n) message.obj;
        long j = nVar.f4622a;
        TreeMap treeMap = this.f4636e;
        long j8 = nVar.f4623b;
        Long l8 = (Long) treeMap.get(Long.valueOf(j8));
        if (l8 == null) {
            treeMap.put(Long.valueOf(j8), Long.valueOf(j));
        } else if (l8.longValue() > j) {
            treeMap.put(Long.valueOf(j8), Long.valueOf(j));
        }
        return true;
    }
}
