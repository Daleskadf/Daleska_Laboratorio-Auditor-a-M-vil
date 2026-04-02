package h0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
/* renamed from: h0.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1052l {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC1051k f11197a;

    /* JADX WARN: Type inference failed for: r3v1, types: [h0.k, java.lang.Object] */
    public C1052l(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f11197a = new C1050j(nestedScrollView);
        } else {
            this.f11197a = new Object();
        }
    }
}
