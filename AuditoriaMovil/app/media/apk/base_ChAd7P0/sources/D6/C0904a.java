package d6;

import c6.AbstractRunnableC0645F;
import j6.AbstractC1371b;
import j6.C1370a;
/* renamed from: d6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0904a extends AbstractRunnableC0645F {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f10355c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0906c f10356d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0904a(C0906c c0906c, int i7) {
        super(c0906c, 1);
        this.f10355c = i7;
        switch (i7) {
            case 1:
                this.f10356d = c0906c;
                super(c0906c, 1);
                AbstractC1371b.b();
                return;
            default:
                this.f10356d = c0906c;
                AbstractC1371b.b();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [Q6.e, java.lang.Object] */
    private final void c() {
        C0906c c0906c;
        int i7;
        ?? obj = new Object();
        AbstractC1371b.c();
        try {
            C1370a c1370a = AbstractC1371b.f13458a;
            c1370a.getClass();
            synchronized (this.f10356d.f10362a) {
                Q6.e eVar = this.f10356d.f10363b;
                obj.l(eVar, eVar.a());
                c0906c = this.f10356d;
                c0906c.f = false;
                i7 = c0906c.f10370h0;
            }
            c0906c.f10361Z.l(obj, obj.f4462b);
            synchronized (this.f10356d.f10362a) {
                this.f10356d.f10370h0 -= i7;
            }
            c1370a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1371b.f13458a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Q6.e, java.lang.Object] */
    @Override // c6.AbstractRunnableC0645F
    public final void a() {
        C0906c c0906c;
        switch (this.f10355c) {
            case 0:
                c();
                return;
            default:
                ?? obj = new Object();
                AbstractC1371b.c();
                try {
                    C1370a c1370a = AbstractC1371b.f13458a;
                    c1370a.getClass();
                    synchronized (this.f10356d.f10362a) {
                        Q6.e eVar = this.f10356d.f10363b;
                        obj.l(eVar, eVar.f4462b);
                        c0906c = this.f10356d;
                        c0906c.f10359X = false;
                    }
                    c0906c.f10361Z.l(obj, obj.f4462b);
                    this.f10356d.f10361Z.flush();
                    c1370a.getClass();
                    return;
                } catch (Throwable th) {
                    try {
                        AbstractC1371b.f13458a.getClass();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
        }
    }
}
