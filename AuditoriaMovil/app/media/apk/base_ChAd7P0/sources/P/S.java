package p;

import android.widget.AbsListView;
/* loaded from: classes.dex */
public abstract class S {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z7) {
        absListView.setSelectedChildViewEnabled(z7);
    }
}
