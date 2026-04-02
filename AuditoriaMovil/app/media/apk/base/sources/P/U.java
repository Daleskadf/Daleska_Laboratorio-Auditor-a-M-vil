package p;

import android.widget.AbsListView;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f14720a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e7) {
            e7.printStackTrace();
        }
        f14720a = field;
    }
}
