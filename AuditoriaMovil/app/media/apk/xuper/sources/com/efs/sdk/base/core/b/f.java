package com.efs.sdk.base.core.b;

import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.http.HttpResponse;
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private LogDto f6086a;

    /* renamed from: b  reason: collision with root package name */
    private d f6087b;

    /* renamed from: c  reason: collision with root package name */
    private String f6088c;

    public f(LogDto logDto, d dVar, String str) {
        this.f6086a = logDto;
        this.f6087b = dVar;
        this.f6088c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpResponse httpResponse;
        int httpCode;
        d dVar;
        LogDto logDto = this.f6086a;
        if (logDto != null && (dVar = this.f6087b) != null) {
            httpResponse = dVar.a(logDto, true);
        } else {
            httpResponse = new HttpResponse();
        }
        e a10 = e.a();
        String str = this.f6088c;
        if (httpResponse.succ) {
            httpCode = 0;
        } else {
            httpCode = httpResponse.getHttpCode();
        }
        a10.a(str, httpCode);
        this.f6088c = null;
        this.f6087b = null;
    }
}
