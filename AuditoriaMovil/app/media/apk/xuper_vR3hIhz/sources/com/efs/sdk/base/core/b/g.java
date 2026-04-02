package com.efs.sdk.base.core.b;

import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.http.HttpResponse;
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private LogDto f6089a;

    /* renamed from: b  reason: collision with root package name */
    private d f6090b;

    /* renamed from: c  reason: collision with root package name */
    private String f6091c;

    public g(LogDto logDto, d dVar, String str) {
        this.f6089a = logDto;
        this.f6090b = dVar;
        this.f6091c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpResponse httpResponse;
        int httpCode;
        d dVar;
        LogDto logDto = this.f6089a;
        if (logDto != null && (dVar = this.f6090b) != null) {
            httpResponse = dVar.a(logDto, true);
        } else {
            httpResponse = new HttpResponse();
        }
        e a10 = e.a();
        String str = this.f6091c;
        if (httpResponse.succ) {
            httpCode = 0;
        } else {
            httpCode = httpResponse.getHttpCode();
        }
        a10.b(str, httpCode);
        this.f6091c = null;
        this.f6090b = null;
    }
}
