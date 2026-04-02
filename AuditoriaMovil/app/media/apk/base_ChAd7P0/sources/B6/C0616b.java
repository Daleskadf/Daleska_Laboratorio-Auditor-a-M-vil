package b6;

import E.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* renamed from: b6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616b extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8310a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8311b = false;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f8312c;

    public /* synthetic */ C0616b(Object obj, int i7) {
        this.f8310a = i7;
        this.f8312c = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z7;
        switch (this.f8310a) {
            case 0:
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z8 = this.f8311b;
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                this.f8311b = z7;
                if (z7 && !z8) {
                    ((C0617c) this.f8312c).f8313d.t();
                    return;
                }
                return;
            default:
                e eVar = (e) this.f8312c;
                boolean M7 = eVar.M();
                if (eVar.M() && !this.f8311b) {
                    eVar.U(true);
                } else if (!M7 && this.f8311b) {
                    eVar.U(false);
                }
                this.f8311b = M7;
                return;
        }
    }
}
