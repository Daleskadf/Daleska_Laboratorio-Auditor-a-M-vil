package d4;
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10340a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f10341b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Runnable f10342c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ A.c f10343d;

    public /* synthetic */ e(f fVar, Runnable runnable, A.c cVar, int i7) {
        this.f10340a = i7;
        this.f10341b = fVar;
        this.f10342c = runnable;
        this.f10343d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10340a) {
            case 0:
                f fVar = this.f10341b;
                fVar.getClass();
                final A.c cVar = this.f10343d;
                final Runnable runnable = this.f10342c;
                fVar.f10344a.execute(new Runnable() { // from class: d4.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) cVar.f4b).k(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e8) {
                                    ((h) cVar.f4b).k(e8);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) cVar.f4b;
                                try {
                                    runnable2.run();
                                    hVar.j(null);
                                    return;
                                } catch (Exception e9) {
                                    hVar.k(e9);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                f fVar2 = this.f10341b;
                fVar2.getClass();
                final A.c cVar2 = this.f10343d;
                final Runnable runnable2 = this.f10342c;
                fVar2.f10344a.execute(new Runnable() { // from class: d4.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) cVar2.f4b).k(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e8) {
                                    ((h) cVar2.f4b).k(e8);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) cVar2.f4b;
                                try {
                                    runnable22.run();
                                    hVar.j(null);
                                    return;
                                } catch (Exception e9) {
                                    hVar.k(e9);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                f fVar3 = this.f10341b;
                fVar3.getClass();
                final A.c cVar3 = this.f10343d;
                final Runnable runnable3 = this.f10342c;
                fVar3.f10344a.execute(new Runnable() { // from class: d4.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) cVar3.f4b).k(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e8) {
                                    ((h) cVar3.f4b).k(e8);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) cVar3.f4b;
                                try {
                                    runnable22.run();
                                    hVar.j(null);
                                    return;
                                } catch (Exception e9) {
                                    hVar.k(e9);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
