package com.it_nomads.fluttersecurestorage.ciphers;

import a6.t0;
import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.security.auth.x500.X500Principal;
/* loaded from: classes.dex */
public final class c extends t0 {
    @Override // a6.t0
    public final AlgorithmParameterSpec A() {
        return new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
    }

    @Override // a6.t0
    public final Cipher G() {
        return Cipher.getInstance("RSA/ECB/OAEPPadding", "AndroidKeyStoreBCWorkaround");
    }

    @Override // a6.t0
    public final KeyGenParameterSpec S(Calendar calendar, Calendar calendar2) {
        String str = (String) this.f7209b;
        return new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal(io.flutter.plugins.pathprovider.b.h("CN=", str))).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("OAEPPadding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }

    @Override // a6.t0
    public final String r() {
        return ((Context) this.f7210c).getPackageName() + ".FlutterSecureStoragePluginKeyOAEP";
    }
}
