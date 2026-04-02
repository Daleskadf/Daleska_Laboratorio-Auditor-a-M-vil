package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.IntegrityTokenRequest;
/* loaded from: classes.dex */
final class am extends IntegrityTokenRequest.Builder {

    /* renamed from: a  reason: collision with root package name */
    private String f9500a;

    /* renamed from: b  reason: collision with root package name */
    private Long f9501b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f9500a;
        if (str != null) {
            return new ao(str, this.f9501b, null, null);
        }
        throw new IllegalStateException("Missing required properties: nonce");
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.f9501b = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str != null) {
            this.f9500a = str;
            return this;
        }
        throw new NullPointerException("Null nonce");
    }
}
