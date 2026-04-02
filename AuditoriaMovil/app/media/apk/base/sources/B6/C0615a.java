package b6;

import E.e;
import android.net.ConnectivityManager;
import android.net.Network;
/* renamed from: b6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0615a extends ConnectivityManager.NetworkCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8308a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8309b;

    public /* synthetic */ C0615a(Object obj, int i7) {
        this.f8308a = i7;
        this.f8309b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.f8308a) {
            case 0:
                ((C0617c) this.f8309b).f8313d.t();
                return;
            default:
                ((e) this.f8309b).U(true);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z7) {
        switch (this.f8308a) {
            case 0:
                if (!z7) {
                    ((C0617c) this.f8309b).f8313d.t();
                    return;
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z7);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        switch (this.f8308a) {
            case 1:
                ((e) this.f8309b).U(false);
                return;
            default:
                super.onLost(network);
                return;
        }
    }
}
