package anet.channel;

import anet.channel.SessionRequest;
import anet.channel.entity.EventCb;
import anet.channel.util.ALog;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f implements EventCb {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SessionRequest.IConnCb f3975a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f3976b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SessionRequest f3977c;

    public f(SessionRequest sessionRequest, SessionRequest.IConnCb iConnCb, long j10) {
        this.f3977c = sessionRequest;
        this.f3975a = iConnCb;
        this.f3976b = j10;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i10, anet.channel.entity.b bVar) {
        int i11;
        String str;
        if (session == null) {
            return;
        }
        if (bVar == null) {
            i11 = 0;
        } else {
            i11 = bVar.f3970b;
        }
        if (bVar == null) {
            str = "";
        } else {
            str = bVar.f3971c;
        }
        if (i10 != 2) {
            if (i10 != 256) {
                if (i10 == 512) {
                    ALog.d("awcn.SessionRequest", null, session.f3827p, "Session", session, "EventType", Integer.valueOf(i10), "Event", bVar);
                    this.f3977c.a(session, 0, (String) null);
                    this.f3975a.onSuccess(session, this.f3976b);
                    return;
                }
                return;
            }
            ALog.d("awcn.SessionRequest", null, session.f3827p, "Session", session, "EventType", Integer.valueOf(i10), "Event", bVar);
            this.f3975a.onFailed(session, this.f3976b, i10, i11);
            return;
        }
        ALog.d("awcn.SessionRequest", null, session.f3827p, "Session", session, "EventType", Integer.valueOf(i10), "Event", bVar);
        this.f3977c.a(session, i11, str);
        SessionRequest sessionRequest = this.f3977c;
        if (sessionRequest.f3851b.c(sessionRequest, session)) {
            this.f3975a.onDisConnect(session, this.f3976b, i10);
        } else {
            this.f3975a.onFailed(session, this.f3976b, i10, i11);
        }
    }
}
