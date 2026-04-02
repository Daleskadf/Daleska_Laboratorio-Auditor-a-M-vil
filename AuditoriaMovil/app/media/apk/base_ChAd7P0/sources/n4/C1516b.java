package n4;

import com.google.firebase.firestore.InterfaceC0816s;
import java.util.concurrent.Executor;
/* renamed from: n4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1516b implements InterfaceC0816s {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f14330a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0816s f14331b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f14332c = false;

    public C1516b(Executor executor, InterfaceC0816s interfaceC0816s) {
        this.f14330a = executor;
        this.f14331b = interfaceC0816s;
    }

    @Override // com.google.firebase.firestore.InterfaceC0816s
    public final void a(Object obj, com.google.firebase.firestore.J j) {
        this.f14330a.execute(new A.h(this, obj, j, 21));
    }
}
