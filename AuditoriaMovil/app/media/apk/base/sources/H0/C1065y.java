package h0;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.example.appecoactivate.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* renamed from: h0.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1065y {

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayList f11210d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f11211a;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray f11212b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference f11213c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f11211a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a7 = a(viewGroup.getChildAt(childCount));
                    if (a7 != null) {
                        return a7;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }
}
