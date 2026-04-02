package a2;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.libraries.barhopper.RecognitionOptions;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f6942a;

    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(RecognitionOptions.QR_CODE).build();
        f6942a = new Object();
    }
}
