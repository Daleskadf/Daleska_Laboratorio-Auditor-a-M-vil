package com.it_nomads.fluttersecurestorage.ciphers;

import R1.j;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
/* loaded from: classes.dex */
public final class h extends j {
    @Override // R1.j
    public final String q0() {
        return "VGhpcyBpcyB0aGUga2V5IGZvcihBIHNlY3XyZZBzdG9yYWdlIEFFUyBLZXkK";
    }

    @Override // R1.j
    public final Cipher r0() {
        return Cipher.getInstance("AES/GCM/NoPadding");
    }

    @Override // R1.j
    public final int w0() {
        return 12;
    }

    @Override // R1.j
    public final AlgorithmParameterSpec y0(byte[] bArr) {
        return new GCMParameterSpec(RecognitionOptions.ITF, bArr);
    }
}
