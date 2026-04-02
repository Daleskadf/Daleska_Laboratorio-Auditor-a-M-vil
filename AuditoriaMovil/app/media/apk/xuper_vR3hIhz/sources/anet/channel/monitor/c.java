package anet.channel.monitor;

import anet.channel.status.NetworkStatusHelper;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f4025a;

    public c(b bVar) {
        this.f4025a = bVar;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        e eVar;
        eVar = this.f4025a.f4023n;
        eVar.a();
        b.f4015f = 0L;
        this.f4025a.d();
    }
}
