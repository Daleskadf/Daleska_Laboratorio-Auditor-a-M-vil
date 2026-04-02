package n2;

import androidx.window.extensions.layout.WindowLayoutInfo;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import w6.l;
/* renamed from: n2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1463b extends i implements l {
    public C1463b(C1467f c1467f) {
        super(1, c1467f, C1467f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        WindowLayoutInfo p02 = (WindowLayoutInfo) obj;
        j.e(p02, "p0");
        ((C1467f) this.receiver).accept(p02);
        return l6.j.f13876a;
    }
}
