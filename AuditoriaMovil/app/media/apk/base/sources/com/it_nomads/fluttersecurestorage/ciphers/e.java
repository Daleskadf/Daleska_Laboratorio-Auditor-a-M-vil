package com.it_nomads.fluttersecurestorage.ciphers;

import X5.L;
/* loaded from: classes.dex */
public enum e {
    AES_CBC_PKCS7Padding(new L(29), 1),
    AES_GCM_NoPadding(new d(0), 23);
    
    final int minVersionCode;
    final g storageCipher;

    e(g gVar, int i7) {
        this.storageCipher = gVar;
        this.minVersionCode = i7;
    }
}
