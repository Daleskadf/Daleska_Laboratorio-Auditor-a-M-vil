package U2;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ d f5729b = new d(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5730a;

    public /* synthetic */ d(int i7) {
        this.f5730a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5730a) {
            case 0:
                return ((Scope) obj).f9148b.compareTo(((Scope) obj2).f9148b);
            default:
                return ((Scope) obj).f9148b.compareTo(((Scope) obj2).f9148b);
        }
    }
}
