package com.efs.sdk.net.a.a;

import java.io.InputStream;
/* loaded from: classes.dex */
public interface f {

    /* loaded from: classes.dex */
    public interface a {
        String a(int i10);

        String b(int i10);

        int e();
    }

    /* loaded from: classes.dex */
    public interface b extends c {
        String b();

        String c();

        byte[] d();
    }

    /* loaded from: classes.dex */
    public interface c extends a {
        String a();
    }

    /* loaded from: classes.dex */
    public interface d extends e {
    }

    /* loaded from: classes.dex */
    public interface e extends a {
        String a();

        int b();
    }

    InputStream a(String str, String str2, String str3, InputStream inputStream);

    void a();

    void a(b bVar);

    void a(d dVar);

    String b();
}
