package io.flutter.plugins.firebase.storage;

import H4.W;
import H4.e1;
import io.flutter.plugins.googlemaps.C1190x;
import io.flutter.plugins.googlemaps.r0;
import io.flutter.plugins.googlemaps.w0;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class g implements w0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11994a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f11995b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ A.f f11996c;

    public /* synthetic */ g(ArrayList arrayList, A.f fVar, int i7) {
        this.f11994a = i7;
        this.f11995b = arrayList;
        this.f11996c = fVar;
    }

    @Override // io.flutter.plugins.googlemaps.w0
    public void a(Object obj) {
        switch (this.f11994a) {
            case 0:
                ArrayList arrayList = this.f11995b;
                arrayList.add(0, (j) obj);
                this.f11996c.h(arrayList);
                return;
            case 1:
                Void r32 = (Void) obj;
                ArrayList arrayList2 = this.f11995b;
                arrayList2.add(0, null);
                this.f11996c.h(arrayList2);
                return;
            case 2:
                ArrayList arrayList3 = this.f11995b;
                arrayList3.add(0, (String) obj);
                this.f11996c.h(arrayList3);
                return;
            case 3:
                ArrayList arrayList4 = this.f11995b;
                arrayList4.add(0, (j) obj);
                this.f11996c.h(arrayList4);
                return;
            case 4:
                ArrayList arrayList5 = this.f11995b;
                arrayList5.add(0, (l) obj);
                this.f11996c.h(arrayList5);
                return;
            case 5:
            default:
                ArrayList arrayList6 = this.f11995b;
                arrayList6.add(0, (Boolean) obj);
                this.f11996c.h(arrayList6);
                return;
            case 6:
                ArrayList arrayList7 = this.f11995b;
                arrayList7.add(0, (byte[]) obj);
                this.f11996c.h(arrayList7);
                return;
            case 7:
                ArrayList arrayList8 = this.f11995b;
                arrayList8.add(0, (r0) obj);
                this.f11996c.h(arrayList8);
                return;
            case 8:
                ArrayList arrayList9 = this.f11995b;
                arrayList9.add(0, (io.flutter.plugins.googlesignin.j) obj);
                this.f11996c.h(arrayList9);
                return;
            case 9:
                ArrayList arrayList10 = this.f11995b;
                arrayList10.add(0, (io.flutter.plugins.googlesignin.j) obj);
                this.f11996c.h(arrayList10);
                return;
            case 10:
                ArrayList arrayList11 = this.f11995b;
                arrayList11.add(0, (String) obj);
                this.f11996c.h(arrayList11);
                return;
        }
    }

    @Override // io.flutter.plugins.googlemaps.w0
    public void b(C1190x c1190x) {
        switch (this.f11994a) {
            case 6:
                this.f11996c.h(android.support.v4.media.session.a.H(c1190x));
                return;
            default:
                this.f11996c.h(android.support.v4.media.session.a.H(c1190x));
                return;
        }
    }

    public void c(i iVar) {
        switch (this.f11994a) {
            case 0:
                this.f11996c.h(W.M(iVar));
                return;
            case 1:
                this.f11996c.h(W.M(iVar));
                return;
            case 2:
                this.f11996c.h(W.M(iVar));
                return;
            case 3:
                this.f11996c.h(W.M(iVar));
                return;
            default:
                this.f11996c.h(W.M(iVar));
                return;
        }
    }

    public void d(io.flutter.plugins.googlesignin.e eVar) {
        switch (this.f11994a) {
            case 8:
                this.f11996c.h(f7.a.r0(eVar));
                return;
            case 9:
                this.f11996c.h(f7.a.r0(eVar));
                return;
            case 10:
                this.f11996c.h(f7.a.r0(eVar));
                return;
            case 11:
                this.f11996c.h(f7.a.r0(eVar));
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                this.f11996c.h(f7.a.r0(eVar));
                return;
            default:
                this.f11996c.h(f7.a.r0(eVar));
                return;
        }
    }

    public void e(RuntimeException runtimeException) {
        switch (this.f11994a) {
            case 14:
                this.f11996c.h(j3.f.U(runtimeException));
                return;
            case 15:
                this.f11996c.h(j3.f.U(runtimeException));
                return;
            default:
                this.f11996c.h(j3.f.U(runtimeException));
                return;
        }
    }

    public void f() {
        switch (this.f11994a) {
            case 5:
                ArrayList arrayList = this.f11995b;
                arrayList.add(0, null);
                this.f11996c.h(arrayList);
                return;
            case 11:
                ArrayList arrayList2 = this.f11995b;
                arrayList2.add(0, null);
                this.f11996c.h(arrayList2);
                return;
            default:
                ArrayList arrayList3 = this.f11995b;
                arrayList3.add(0, null);
                this.f11996c.h(arrayList3);
                return;
        }
    }

    public void g(ArrayList arrayList) {
        switch (this.f11994a) {
            case 14:
                ArrayList arrayList2 = this.f11995b;
                arrayList2.add(0, arrayList);
                this.f11996c.h(arrayList2);
                return;
            case 15:
                ArrayList arrayList3 = this.f11995b;
                arrayList3.add(0, arrayList);
                this.f11996c.h(arrayList3);
                return;
            default:
                ArrayList arrayList4 = this.f11995b;
                arrayList4.add(0, arrayList);
                this.f11996c.h(arrayList4);
                return;
        }
    }
}
