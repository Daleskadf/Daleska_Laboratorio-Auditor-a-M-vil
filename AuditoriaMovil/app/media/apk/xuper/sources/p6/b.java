package p6;

import android.content.Context;
import com.mobile.brasiltv.utils.x;
import com.msandroid.mobile.R;
import com.umeng.analytics.pro.f;
import t9.i;
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f18069a = new b();

    public final String a(Context context, int i10) {
        i.g(context, f.X);
        if (i10 != 8) {
            if (i10 != 9) {
                if (i10 != 21) {
                    switch (i10) {
                        case 11:
                            return "EC11-" + x.f8754a.y(context, R.string.failed_play_consult_dealer);
                        case 12:
                            return "EC12-" + x.f8754a.y(context, R.string.failed_play_consult_dealer);
                        case 13:
                            return "EC13-" + context.getString(R.string.network_poor);
                        default:
                            return "";
                    }
                }
                return "EC21-" + x.f8754a.y(context, R.string.failed_play_consult_dealer);
            }
            return "EC9-" + context.getString(R.string.failed_play_change_back);
        }
        return "EC8-" + context.getString(R.string.failed_play_exit_retry);
    }
}
