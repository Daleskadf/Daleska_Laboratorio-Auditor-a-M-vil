package io.grpc.okhttp.internal;

import java.io.IOException;
/* loaded from: classes.dex */
public enum m {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    
    private final String protocol;

    m(String str) {
        this.protocol = str;
    }

    public static m a(String str) {
        m mVar = HTTP_1_0;
        if (str.equals(mVar.protocol)) {
            return mVar;
        }
        m mVar2 = HTTP_1_1;
        if (str.equals(mVar2.protocol)) {
            return mVar2;
        }
        m mVar3 = HTTP_2;
        if (str.equals(mVar3.protocol)) {
            return mVar3;
        }
        m mVar4 = SPDY_3;
        if (str.equals(mVar4.protocol)) {
            return mVar4;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.protocol;
    }
}
