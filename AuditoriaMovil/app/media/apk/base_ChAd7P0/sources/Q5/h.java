package Q5;

import java.util.HashMap;
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4438a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ L5.h f4439b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ HashMap f4440c;

    public /* synthetic */ h(L5.h hVar, HashMap hashMap, int i7) {
        this.f4438a = i7;
        this.f4439b = hVar;
        this.f4440c = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4438a) {
            case 0:
                L5.h hVar = this.f4439b;
                hVar.c(this.f4440c);
                hVar.a();
                return;
            default:
                this.f4439b.c(this.f4440c);
                return;
        }
    }
}
