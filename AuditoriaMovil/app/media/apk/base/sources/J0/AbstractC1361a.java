package j0;

import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;
/* renamed from: j0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1361a {
    public static void a(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static void b(EditorInfo editorInfo) {
        editorInfo.setStylusHandwritingEnabled(true);
    }
}
