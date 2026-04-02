package C;

import G.k;
import U.i;
import U.j;
import X5.E;
import a.AbstractC0412a;
import w.C1925j;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f414a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f415b;

    public /* synthetic */ c(e eVar, int i7) {
        this.f414a = i7;
        this.f415b = eVar;
    }

    @Override // U.j
    public final Object i(final i iVar) {
        switch (this.f414a) {
            case 0:
                final e eVar = this.f415b;
                eVar.getClass();
                ((k) eVar.f423e).execute(new Runnable() { // from class: C.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case 0:
                                i iVar2 = iVar;
                                e eVar2 = eVar;
                                eVar2.f421c = true;
                                Exception exc = new Exception("Camera2CameraControl was updated with new options.");
                                i iVar3 = (i) eVar2.f425h;
                                if (iVar3 != null) {
                                    iVar3.b(exc);
                                    eVar2.f425h = null;
                                }
                                eVar2.f425h = iVar2;
                                if (eVar2.f420b) {
                                    C1925j c1925j = (C1925j) eVar2.f422d;
                                    c1925j.getClass();
                                    H.i.d(AbstractC0412a.s(new E(c1925j, 24))).a(new b(eVar2, 0), (k) eVar2.f423e);
                                    eVar2.f421c = false;
                                    return;
                                }
                                return;
                            default:
                                i iVar4 = iVar;
                                e eVar3 = eVar;
                                eVar3.f421c = true;
                                Exception exc2 = new Exception("Camera2CameraControl was updated with new options.");
                                i iVar5 = (i) eVar3.f425h;
                                if (iVar5 != null) {
                                    iVar5.b(exc2);
                                    eVar3.f425h = null;
                                }
                                eVar3.f425h = iVar4;
                                if (eVar3.f420b) {
                                    C1925j c1925j2 = (C1925j) eVar3.f422d;
                                    c1925j2.getClass();
                                    H.i.d(AbstractC0412a.s(new E(c1925j2, 24))).a(new b(eVar3, 0), (k) eVar3.f423e);
                                    eVar3.f421c = false;
                                    return;
                                }
                                return;
                        }
                    }
                });
                return "addCaptureRequestOptions";
            default:
                final e eVar2 = this.f415b;
                eVar2.getClass();
                ((k) eVar2.f423e).execute(new Runnable() { // from class: C.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case 0:
                                i iVar2 = iVar;
                                e eVar22 = eVar2;
                                eVar22.f421c = true;
                                Exception exc = new Exception("Camera2CameraControl was updated with new options.");
                                i iVar3 = (i) eVar22.f425h;
                                if (iVar3 != null) {
                                    iVar3.b(exc);
                                    eVar22.f425h = null;
                                }
                                eVar22.f425h = iVar2;
                                if (eVar22.f420b) {
                                    C1925j c1925j = (C1925j) eVar22.f422d;
                                    c1925j.getClass();
                                    H.i.d(AbstractC0412a.s(new E(c1925j, 24))).a(new b(eVar22, 0), (k) eVar22.f423e);
                                    eVar22.f421c = false;
                                    return;
                                }
                                return;
                            default:
                                i iVar4 = iVar;
                                e eVar3 = eVar2;
                                eVar3.f421c = true;
                                Exception exc2 = new Exception("Camera2CameraControl was updated with new options.");
                                i iVar5 = (i) eVar3.f425h;
                                if (iVar5 != null) {
                                    iVar5.b(exc2);
                                    eVar3.f425h = null;
                                }
                                eVar3.f425h = iVar4;
                                if (eVar3.f420b) {
                                    C1925j c1925j2 = (C1925j) eVar3.f422d;
                                    c1925j2.getClass();
                                    H.i.d(AbstractC0412a.s(new E(c1925j2, 24))).a(new b(eVar3, 0), (k) eVar3.f423e);
                                    eVar3.f421c = false;
                                    return;
                                }
                                return;
                        }
                    }
                });
                return "clearCaptureRequestOptions";
        }
    }
}
