package c6;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import g1.C1006c;
import java.io.File;
import o.C1541e;
import o.MenuC1545i;
import o.View$OnKeyListenerC1542f;
import org.json.JSONException;
import t5.AbstractC1829a;
import t5.C1832d;
import t5.C1839k;
/* renamed from: c6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0649a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8729a;

    /* renamed from: b  reason: collision with root package name */
    public Object f8730b;

    /* renamed from: c  reason: collision with root package name */
    public Object f8731c;

    /* renamed from: d  reason: collision with root package name */
    public Object f8732d;

    /* renamed from: e  reason: collision with root package name */
    public Object f8733e;

    public /* synthetic */ RunnableC0649a() {
        this.f8729a = 4;
    }

    private final void a() {
        synchronized (((n2) this.f8733e)) {
            try {
                if (((l2) this.f8730b).f8905b == 0) {
                    ((m2) this.f8731c).r(this.f8732d);
                    ((n2) this.f8733e).f8932a.remove((m2) this.f8731c);
                    if (((n2) this.f8733e).f8932a.isEmpty()) {
                        ((n2) this.f8733e).f8934c.shutdown();
                        ((n2) this.f8733e).f8934c = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8729a) {
            case 0:
                ((AbstractC0652b) this.f8733e).b((a6.o0) this.f8730b, (EnumC0714w) this.f8731c, (a6.e0) this.f8732d);
                return;
            case 1:
                ((InterfaceC0717x) ((Q) this.f8733e).f8565b).O((a6.o0) this.f8730b, (EnumC0714w) this.f8731c, (a6.e0) this.f8732d);
                return;
            case 2:
                N0 n02 = (N0) this.f8733e;
                n02.f8545z = true;
                n02.f8540u.O((a6.o0) this.f8730b, (EnumC0714w) this.f8731c, (a6.e0) this.f8732d);
                return;
            case 3:
                a();
                return;
            case 4:
                com.google.firebase.storage.m mVar = (com.google.firebase.storage.m) this.f8730b;
                C4.a aVar = new C4.a(mVar.b(), mVar.f9931b.f9900a, 1);
                ((B4.e) this.f8733e).b(aVar, true);
                boolean l8 = aVar.l();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f8731c;
                if (l8) {
                    try {
                        this.f8732d = new A.l(aVar.i(), mVar).c();
                    } catch (JSONException e7) {
                        Log.e("GetMetadataTask", "Unable to parse resulting metadata. " + aVar.f, e7);
                        taskCompletionSource.setException(com.google.firebase.storage.i.b(0, e7));
                        return;
                    }
                }
                if (taskCompletionSource != null) {
                    aVar.a((com.google.firebase.storage.j) this.f8732d, taskCompletionSource);
                    return;
                }
                return;
            case 5:
                C1541e c1541e = (C1541e) this.f8730b;
                if (c1541e != null) {
                    C1006c c1006c = (C1006c) this.f8733e;
                    ((View$OnKeyListenerC1542f) c1006c.f11091a).f14434u0 = true;
                    c1541e.f14410b.c(false);
                    ((View$OnKeyListenerC1542f) c1006c.f11091a).f14434u0 = false;
                }
                o.j jVar = (o.j) this.f8731c;
                if (jVar.isEnabled() && jVar.hasSubMenu()) {
                    ((MenuC1545i) this.f8732d).p(jVar, null, 4);
                    return;
                }
                return;
            default:
                synchronized (C1839k.f) {
                    C1832d c1832d = (C1832d) this.f8730b;
                    if (c1832d != null) {
                        C1839k.a((C1839k) this.f8733e, c1832d);
                    }
                    try {
                        if (AbstractC1829a.b(C1839k.f15899X)) {
                            Log.d("Sqflite", "delete database " + ((String) this.f8731c));
                        }
                        SQLiteDatabase.deleteDatabase(new File((String) this.f8731c));
                    } catch (Exception e8) {
                        Log.e("Sqflite", "error " + e8 + " while closing database " + C1839k.f15906f0);
                    }
                }
                ((K5.r) this.f8732d).a(null);
                return;
        }
    }

    public /* synthetic */ RunnableC0649a(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f8729a = i7;
        this.f8733e = obj;
        this.f8730b = obj2;
        this.f8731c = obj3;
        this.f8732d = obj4;
    }
}
