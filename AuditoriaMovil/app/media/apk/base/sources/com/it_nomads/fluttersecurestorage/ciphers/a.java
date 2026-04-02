package com.it_nomads.fluttersecurestorage.ciphers;

import X5.L;
/* loaded from: classes.dex */
public enum a {
    RSA_ECB_PKCS1Padding(new L(27), 1),
    RSA_ECB_OAEPwithSHA_256andMGF1Padding(new L(28), 23);
    
    final b keyCipher;
    final int minVersionCode;

    a(b bVar, int i7) {
        this.keyCipher = bVar;
        this.minVersionCode = i7;
    }
}
