package u4;

import android.util.Size;
import java.util.Comparator;
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16018a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f16018a) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        }
    }
}
