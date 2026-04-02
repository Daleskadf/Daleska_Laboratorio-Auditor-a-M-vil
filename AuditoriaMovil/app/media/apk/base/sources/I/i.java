package I;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final i f2109a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2110b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public boolean f2111c;

    public i(i iVar) {
        this.f2109a = iVar;
    }

    public final void a() {
        l6.j jVar;
        synchronized (this.f2110b) {
            try {
                if (this.f2111c) {
                    i iVar = this.f2109a;
                    if (iVar != null) {
                        iVar.a();
                        jVar = l6.j.f13876a;
                    } else {
                        jVar = null;
                    }
                    if (jVar == null) {
                        org.slf4j.helpers.i.t("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    org.slf4j.helpers.i.O("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.f2111c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f2110b) {
        }
    }
}
