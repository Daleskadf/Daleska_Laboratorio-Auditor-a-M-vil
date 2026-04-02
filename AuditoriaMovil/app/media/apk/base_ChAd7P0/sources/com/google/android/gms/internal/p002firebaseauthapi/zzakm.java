package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakm  reason: invalid package */
/* loaded from: classes.dex */
public class zzakm extends IOException {
    private boolean zza;

    public zzakm(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static zzakp zza() {
        return new zzakp("Protocol message tag had invalid wire type.");
    }

    public static zzakm zzb() {
        return new zzakm("Protocol message end-group tag did not match expected tag.");
    }

    public static zzakm zzc() {
        return new zzakm("Protocol message contained an invalid tag (zero).");
    }

    public static zzakm zzd() {
        return new zzakm("Protocol message had invalid UTF-8.");
    }

    public static zzakm zze() {
        return new zzakm("CodedInputStream encountered a malformed varint.");
    }

    public static zzakm zzf() {
        return new zzakm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzakm zzg() {
        return new zzakm("Failed to parse the message.");
    }

    public static zzakm zzh() {
        return new zzakm("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static zzakm zzi() {
        return new zzakm("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static zzakm zzj() {
        return new zzakm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void zzk() {
        this.zza = true;
    }

    public final boolean zzl() {
        return this.zza;
    }

    public zzakm(String str) {
        super(str);
    }
}
