package z0;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class N extends androidx.lifecycle.U {

    /* renamed from: h  reason: collision with root package name */
    public static final com.google.firebase.firestore.Z f16689h = new com.google.firebase.firestore.Z(24);

    /* renamed from: e  reason: collision with root package name */
    public final boolean f16693e;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f16690b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f16691c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f16692d = new HashMap();
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16694g = false;

    public N(boolean z7) {
        this.f16693e = z7;
    }

    @Override // androidx.lifecycle.U
    public final void b() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public final void c(String str, boolean z7) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str, z7);
    }

    public final void d(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v, boolean z7) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC2061v);
        }
        e(abstractComponentCallbacksC2061v.f16830e, z7);
    }

    public final void e(String str, boolean z7) {
        HashMap hashMap = this.f16691c;
        N n7 = (N) hashMap.get(str);
        if (n7 != null) {
            if (z7) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(n7.f16691c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    n7.c((String) it.next(), true);
                }
            }
            n7.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f16692d;
        androidx.lifecycle.X x7 = (androidx.lifecycle.X) hashMap2.get(str);
        if (x7 != null) {
            x7.a();
            hashMap2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || N.class != obj.getClass()) {
            return false;
        }
        N n7 = (N) obj;
        if (this.f16690b.equals(n7.f16690b) && this.f16691c.equals(n7.f16691c) && this.f16692d.equals(n7.f16692d)) {
            return true;
        }
        return false;
    }

    public final void f(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        if (this.f16694g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f16690b.remove(abstractComponentCallbacksC2061v.f16830e) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC2061v);
        }
    }

    public final int hashCode() {
        int hashCode = this.f16691c.hashCode();
        return this.f16692d.hashCode() + ((hashCode + (this.f16690b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f16690b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f16691c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f16692d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
