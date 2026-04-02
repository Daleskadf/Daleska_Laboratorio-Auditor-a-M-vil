package t4;

import H4.C0174n;
import H4.EnumC0172m;
import a6.AbstractC0471A;
import a6.AbstractC0479h;
import a6.e0;
import a6.o0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.I;
import com.google.firebase.firestore.J;
import com.google.protobuf.AbstractC0828a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import p.C1608t;
/* loaded from: classes.dex */
public final class o extends AbstractC0471A {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15822a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15823b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f15824c;

    public o(E.e eVar, AbstractC0479h abstractC0479h) {
        this.f15823b = eVar;
        this.f15824c = abstractC0479h;
    }

    @Override // a6.AbstractC0471A
    public final void g(o0 o0Var, e0 e0Var) {
        Object obj = this.f15823b;
        switch (this.f15822a) {
            case 0:
                E.e eVar = (E.e) obj;
                boolean e7 = o0Var.e();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) eVar.f922d;
                if (e7) {
                    taskCompletionSource.trySetResult(Collections.emptyList());
                    return;
                }
                J h8 = u4.u.h(o0Var);
                if (h8.f9763a == I.UNAUTHENTICATED) {
                    p pVar = ((i) eVar.f923e).f15806c;
                    pVar.f15829b.C();
                    pVar.f15830c.B();
                }
                taskCompletionSource.trySetException(h8);
                return;
            default:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj;
                if (o0Var.e()) {
                    if (!taskCompletionSource2.getTask().isComplete()) {
                        taskCompletionSource2.setException(new J("Received onClose with status OK, but no message.", I.INTERNAL));
                        return;
                    }
                    return;
                }
                ((p) this.f15824c).getClass();
                HashSet hashSet = i.f15803d;
                Throwable th = o0Var.f7185c;
                if (th instanceof SSLHandshakeException) {
                    th.getMessage().contains("no ciphers available");
                }
                taskCompletionSource2.setException(u4.u.h(o0Var));
                return;
        }
    }

    @Override // a6.AbstractC0471A
    public final void i(AbstractC0828a abstractC0828a) {
        q4.n h8;
        switch (this.f15822a) {
            case 0:
                E.e eVar = (E.e) this.f15823b;
                ArrayList arrayList = (ArrayList) eVar.f920b;
                arrayList.add((C0174n) abstractC0828a);
                int size = arrayList.size();
                List<q4.h> list = (List) eVar.f921c;
                if (size == list.size()) {
                    HashMap hashMap = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0174n c0174n = (C0174n) it.next();
                        C1608t c1608t = ((i) eVar.f923e).f15804a;
                        EnumC0172m z7 = c0174n.z();
                        EnumC0172m enumC0172m = EnumC0172m.FOUND;
                        if (z7.equals(enumC0172m)) {
                            m5.d.i("Tried to deserialize a found document from a missing document.", c0174n.z().equals(enumC0172m), new Object[0]);
                            q4.h y2 = c1608t.y(c0174n.w().A());
                            q4.o e7 = q4.o.e(c0174n.w().z());
                            q4.q D4 = C1608t.D(c0174n.w().B());
                            m5.d.i("Got a document response with no snapshot version", !D4.equals(q4.q.f15370b), new Object[0]);
                            h8 = new q4.n(y2);
                            h8.a(D4, e7);
                        } else {
                            EnumC0172m z8 = c0174n.z();
                            EnumC0172m enumC0172m2 = EnumC0172m.MISSING;
                            if (z8.equals(enumC0172m2)) {
                                m5.d.i("Tried to deserialize a missing document from a found document.", c0174n.z().equals(enumC0172m2), new Object[0]);
                                q4.h y3 = c1608t.y(c0174n.x());
                                q4.q D7 = C1608t.D(c0174n.y());
                                m5.d.i("Got a no document response with no snapshot version", !D7.equals(q4.q.f15370b), new Object[0]);
                                h8 = q4.n.h(y3, D7);
                            } else {
                                throw new IllegalArgumentException("Unknown result case: " + c0174n.z());
                            }
                        }
                        hashMap.put(h8.f15362a, h8);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (q4.h hVar : list) {
                        arrayList2.add((q4.n) hashMap.get(hVar));
                    }
                    ((TaskCompletionSource) eVar.f922d).trySetResult(arrayList2);
                }
                ((AbstractC0479h) this.f15824c).c(1);
                return;
            default:
                ((TaskCompletionSource) this.f15823b).setResult(abstractC0828a);
                return;
        }
    }

    public o(p pVar, TaskCompletionSource taskCompletionSource) {
        this.f15824c = pVar;
        this.f15823b = taskCompletionSource;
    }
}
