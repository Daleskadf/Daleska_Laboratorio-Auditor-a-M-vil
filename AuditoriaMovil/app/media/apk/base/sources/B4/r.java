package b4;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public final class r implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8286a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8287b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f8288c;

    public /* synthetic */ r(TaskCompletionSource taskCompletionSource, Context context, int i7) {
        this.f8286a = i7;
        this.f8287b = taskCompletionSource;
        this.f8288c = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        switch (this.f8286a) {
            case 0:
                this.f8287b.setResult((W) obj);
                A.l.r(this.f8288c);
                return;
            case 1:
                this.f8287b.setResult((W) obj);
                A.l.r(this.f8288c);
                return;
            default:
                this.f8287b.setResult((W) obj);
                A.l.r(this.f8288c);
                return;
        }
    }
}
