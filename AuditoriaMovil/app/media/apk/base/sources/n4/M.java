package n4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class M {

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadPoolExecutor f14310g;

    /* renamed from: a  reason: collision with root package name */
    public final t4.i f14311a;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14314d;

    /* renamed from: e  reason: collision with root package name */
    public com.google.firebase.firestore.J f14315e;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f14312b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f14313c = new ArrayList();
    public final HashSet f = new HashSet();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f14310g = threadPoolExecutor;
    }

    public M(t4.i iVar) {
        this.f14311a = iVar;
    }

    public final r4.m a(q4.h hVar) {
        q4.q qVar = (q4.q) this.f14312b.get(hVar);
        if (!this.f.contains(hVar) && qVar != null) {
            if (qVar.equals(q4.q.f15370b)) {
                return r4.m.a(false);
            }
            return new r4.m(qVar, null);
        }
        return r4.m.f15508c;
    }

    public final r4.m b(q4.h hVar) {
        q4.q qVar = (q4.q) this.f14312b.get(hVar);
        if (!this.f.contains(hVar) && qVar != null) {
            if (!qVar.equals(q4.q.f15370b)) {
                return new r4.m(qVar, null);
            }
            throw new com.google.firebase.firestore.J("Can't update a document that doesn't exist.", com.google.firebase.firestore.I.INVALID_ARGUMENT);
        }
        return r4.m.a(true);
    }
}
