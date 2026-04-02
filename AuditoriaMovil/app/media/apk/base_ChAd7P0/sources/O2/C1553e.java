package o2;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.internal.k;
import w6.l;
/* renamed from: o2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1553e extends k implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final C1553e f14557a = new k(1);

    @Override // w6.l
    /* renamed from: a */
    public final Boolean invoke(SidecarDisplayFeature require) {
        boolean z7;
        kotlin.jvm.internal.j.e(require, "$this$require");
        if (require.getRect().left != 0 && require.getRect().top != 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        return Boolean.valueOf(z7);
    }
}
