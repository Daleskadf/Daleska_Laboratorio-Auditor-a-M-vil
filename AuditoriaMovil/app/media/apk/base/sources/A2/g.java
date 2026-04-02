package a2;

import android.security.keystore.KeyGenParameterSpec;
/* loaded from: classes.dex */
public abstract class g {
    public static String a(KeyGenParameterSpec keyGenParameterSpec) {
        return keyGenParameterSpec.getKeystoreAlias();
    }
}
