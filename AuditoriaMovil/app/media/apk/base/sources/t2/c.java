package t2;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import x5.C2010l;
import x5.C2011m;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15719a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15720b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f15719a = i7;
        this.f15720b = obj;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception e7) {
        switch (this.f15719a) {
            case 0:
                Log.e("Geolocator", "Error trying to get last the last known GPS location");
                ((K5.m) this.f15720b).a(s2.b.errorWhileAcquiringPosition);
                return;
            case 1:
                C2010l this$0 = (C2010l) this.f15720b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(e7, "e");
                String localizedMessage = e7.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = e7.toString();
                }
                this$0.f16534d.invoke(localizedMessage);
                return;
            default:
                C2011m c2011m = (C2011m) this.f15720b;
                kotlin.jvm.internal.j.e(e7, "e");
                String localizedMessage2 = e7.getLocalizedMessage();
                if (localizedMessage2 == null) {
                    localizedMessage2 = e7.toString();
                }
                c2011m.invoke(localizedMessage2);
                return;
        }
    }
}
