package com.google.firebase.firestore;
/* loaded from: classes.dex */
public final class K {

    /* renamed from: e  reason: collision with root package name */
    public X f9768e;
    public final boolean f = false;

    /* renamed from: a  reason: collision with root package name */
    public String f9764a = "firestore.googleapis.com";

    /* renamed from: b  reason: collision with root package name */
    public boolean f9765b = true;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9766c = true;

    /* renamed from: d  reason: collision with root package name */
    public final long f9767d = 104857600;

    public final L a() {
        if (!this.f9765b && this.f9764a.equals("firestore.googleapis.com")) {
            throw new IllegalStateException("You can't set the 'sslEnabled' setting unless you also set a non-default 'host'.");
        }
        return new L(this);
    }

    public final void b(X x7) {
        if (!this.f) {
            if (!(x7 instanceof Y) && !(x7 instanceof b0)) {
                throw new IllegalArgumentException("Only MemoryCacheSettings and PersistentCacheSettings are accepted");
            }
            this.f9768e = x7;
            return;
        }
        throw new IllegalStateException("Deprecated setPersistenceEnabled() or setCacheSizeBytes() is already used, remove those first.");
    }
}
