package com.umeng.message.proguard;

import com.umeng.message.proguard.db;
/* loaded from: classes3.dex */
public final class df implements bx {

    /* renamed from: a */
    public bw f11878a;

    /* renamed from: b */
    public bw f11879b;

    /* renamed from: c */
    public bw f11880c;

    /* renamed from: d */
    private final by f11881d;

    /* renamed from: e */
    private boolean f11882e;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private static final df f11883a = new df((byte) 0);

        public static /* synthetic */ df a() {
            return f11883a;
        }
    }

    public /* synthetic */ df(byte b10) {
        this();
    }

    public final void a() {
        if (this.f11882e) {
            return;
        }
        this.f11882e = true;
        bz.a().a(dg.b());
    }

    private df() {
        db dbVar;
        this.f11882e = false;
        dbVar = db.a.f11862a;
        this.f11881d = dbVar;
        dx.b();
    }
}
