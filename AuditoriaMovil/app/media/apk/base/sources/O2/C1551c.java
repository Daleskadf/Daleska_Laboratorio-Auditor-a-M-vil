package o2;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.internal.k;
import w6.l;
/* renamed from: o2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1551c extends k implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final C1551c f14555a = new k(1);

    @Override // w6.l
    /* renamed from: a */
    public final Boolean invoke(SidecarDisplayFeature require) {
        boolean z7;
        kotlin.jvm.internal.j.e(require, "$this$require");
        if (require.getRect().width() == 0 && require.getRect().height() == 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        return Boolean.valueOf(z7);
    }
}
