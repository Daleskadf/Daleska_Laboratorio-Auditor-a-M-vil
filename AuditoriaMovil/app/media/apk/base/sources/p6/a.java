package P6;

import L5.q;
import android.print.PrintDocumentInfo;
/* loaded from: classes.dex */
public final class a implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f4064a;

    public a(f fVar) {
        this.f4064a = fVar;
    }

    @Override // L5.q
    public final void a(Object obj) {
        boolean z7 = obj instanceof byte[];
        f fVar = this.f4064a;
        if (z7) {
            fVar.f4082d = (byte[]) obj;
            fVar.f.onLayoutFinished(new PrintDocumentInfo.Builder(fVar.f4083e).setContentType(0).build(), true);
            return;
        }
        fVar.a("Unknown data received");
    }

    @Override // L5.q
    public final void b(Object obj, String str, String str2) {
        this.f4064a.a(str2);
    }

    @Override // L5.q
    public final void c() {
        this.f4064a.a("notImplemented");
    }
}
