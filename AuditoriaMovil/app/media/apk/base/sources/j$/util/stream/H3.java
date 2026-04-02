package j$.util.stream;
/* loaded from: classes2.dex */
final class H3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Runnable f13064a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Runnable f13065b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H3(Runnable runnable, Runnable runnable2) {
        this.f13064a = runnable;
        this.f13065b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f13065b;
        try {
            this.f13064a.run();
            runnable.run();
        } catch (Throwable th) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
