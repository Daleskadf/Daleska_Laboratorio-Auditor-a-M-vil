package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.Auth;
/* loaded from: classes.dex */
public final class CredentialsOptions extends Auth.AuthCredentialsOptions {
    public static final CredentialsOptions DEFAULT = (CredentialsOptions) new Builder().zzc();

    /* loaded from: classes.dex */
    public static final class Builder extends Auth.AuthCredentialsOptions.Builder {
        @Override // com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder
        /* renamed from: build */
        public final CredentialsOptions zzc() {
            return new CredentialsOptions(this);
        }

        @Override // com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder
        public final Builder forceEnableSaveDialog() {
            this.zzn = Boolean.TRUE;
            return this;
        }
    }

    private CredentialsOptions(Builder builder) {
        super(builder);
    }
}
