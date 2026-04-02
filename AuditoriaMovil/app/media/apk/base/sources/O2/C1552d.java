package o2;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.internal.k;
import w6.l;
/* renamed from: o2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1552d extends k implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final C1552d f14556a = new k(1);

    @Override // w6.l
    /* renamed from: a */
    public final Boolean invoke(SidecarDisplayFeature require) {
        kotlin.jvm.internal.j.e(require, "$this$require");
        boolean z7 = true;
        if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
            z7 = false;
        }
        return Boolean.valueOf(z7);
    }
}
