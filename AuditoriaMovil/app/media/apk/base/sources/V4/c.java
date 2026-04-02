package v4;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
import org.apache.tika.utils.StringUtils;
import w4.InterfaceC1956b;
/* loaded from: classes.dex */
public final class c implements e, g {

    /* renamed from: a  reason: collision with root package name */
    public final X3.e f16058a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f16059b;

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC1956b f16060c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f16061d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f16062e;

    public c(Context context, String str, Set set, InterfaceC1956b interfaceC1956b, Executor executor) {
        this.f16058a = new X3.e(1, context, str);
        this.f16061d = set;
        this.f16062e = executor;
        this.f16060c = interfaceC1956b;
        this.f16059b = context;
    }

    public final Task a() {
        boolean z7;
        if (Build.VERSION.SDK_INT >= 24) {
            z7 = X.a.g(this.f16059b);
        } else {
            z7 = true;
        }
        if (!z7) {
            return Tasks.forResult(StringUtils.EMPTY);
        }
        return Tasks.call(this.f16062e, new b(this, 0));
    }

    public final void b() {
        boolean z7;
        if (this.f16061d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z7 = X.a.g(this.f16059b);
        } else {
            z7 = true;
        }
        if (!z7) {
            Tasks.forResult(null);
            return;
        }
        Tasks.call(this.f16062e, new b(this, 1));
    }
}
