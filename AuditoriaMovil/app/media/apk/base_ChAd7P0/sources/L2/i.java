package l2;

import B5.C0050x;
import android.content.Context;
import java.io.File;
import m2.InterfaceC1435a;
import s0.C1751b;
import w6.InterfaceC1959a;
/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.k implements InterfaceC1959a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13833a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13834b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13835c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i7, Object obj, Object obj2) {
        super(0);
        this.f13833a = i7;
        this.f13834b = obj;
        this.f13835c = obj2;
    }

    @Override // w6.InterfaceC1959a
    public final Object invoke() {
        switch (this.f13833a) {
            case 0:
                ((InterfaceC1435a) ((b) this.f13834b).f13820b).a((C0050x) this.f13835c);
                return l6.j.f13876a;
            default:
                ((C1751b) this.f13835c).getClass();
                String fileName = "FlutterSharedPreferences".concat(".preferences_pb");
                kotlin.jvm.internal.j.e(fileName, "fileName");
                return new File(((Context) this.f13834b).getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
        }
    }
}
