package i2;

import android.text.TextUtils;
import java.util.List;
/* loaded from: classes.dex */
public abstract class g {
    public static final boolean a(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            return false;
        }
        return true;
    }

    public static final boolean b(List list) {
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }
}
