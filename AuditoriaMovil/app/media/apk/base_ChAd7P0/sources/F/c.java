package F;

import android.util.Size;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1096a;

    public c(boolean z7) {
        this.f1096a = z7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        if (this.f1096a) {
            return signum * (-1);
        }
        return signum;
    }
}
