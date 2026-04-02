package e5;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
/* loaded from: classes.dex */
public final /* synthetic */ class s implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10918a;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.f10918a) {
            case 0:
                Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
                return;
            default:
                Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
                return;
        }
    }
}
