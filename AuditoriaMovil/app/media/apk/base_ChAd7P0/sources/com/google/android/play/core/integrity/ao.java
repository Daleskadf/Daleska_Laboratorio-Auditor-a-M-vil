package com.google.android.play.core.integrity;
/* loaded from: classes.dex */
final class ao extends IntegrityTokenRequest {

    /* renamed from: a  reason: collision with root package name */
    private final String f9502a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f9503b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f9504c = null;

    public /* synthetic */ ao(String str, Long l8, Object obj, an anVar) {
        this.f9502a = str;
        this.f9503b = l8;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f9503b;
    }

    public final boolean equals(Object obj) {
        boolean z7;
        Long l8;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f9502a.equals(integrityTokenRequest.nonce()) && ((l8 = this.f9503b) != null ? l8.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                z7 = true;
                if (!(obj instanceof ao) && a()) {
                    ao aoVar = (ao) obj;
                    if (!z7) {
                        return false;
                    }
                    Object obj2 = aoVar.f9504c;
                    return true;
                }
                return z7;
            }
        }
        z7 = false;
        if (!(obj instanceof ao)) {
        }
        return z7;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f9502a.hashCode() ^ 1000003;
        Long l8 = this.f9503b;
        if (l8 == null) {
            hashCode = 0;
        } else {
            hashCode = l8.hashCode();
        }
        int i7 = (hashCode2 * 1000003) ^ hashCode;
        if (a()) {
            return i7 * 1000003;
        }
        return i7;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f9502a;
    }

    public final String toString() {
        String str = "IntegrityTokenRequest{nonce=" + this.f9502a + ", cloudProjectNumber=" + this.f9503b;
        if (a()) {
            str = str.concat(", network=null");
        }
        return str.concat("}");
    }
}
