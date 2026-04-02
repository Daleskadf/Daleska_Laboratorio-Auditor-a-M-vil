package com.google.firebase.appcheck.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.internal.util.Logger;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
/* loaded from: classes3.dex */
public class StorageHelper {
    static final String PREFS_TEMPLATE = "com.google.firebase.appcheck.store.%s";
    static final String TOKEN_KEY = "com.google.firebase.appcheck.APP_CHECK_TOKEN";
    static final String TOKEN_TYPE_KEY = "com.google.firebase.appcheck.TOKEN_TYPE";
    private static final Logger logger = new Logger("StorageHelper");
    private Lazy<SharedPreferences> sharedPreferences;

    /* loaded from: classes3.dex */
    enum TokenType {
        DEFAULT_APP_CHECK_TOKEN,
        UNKNOWN_APP_CHECK_TOKEN
    }

    public StorageHelper(final Context context, String str) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        final String format = String.format(PREFS_TEMPLATE, str);
        this.sharedPreferences = new Lazy<>(new Provider() { // from class: com.google.firebase.appcheck.internal.StorageHelper$$ExternalSyntheticLambda0
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                Object sharedPreferences;
                sharedPreferences = context.getSharedPreferences(format, 0);
                return sharedPreferences;
            }
        });
    }

    public void saveAppCheckToken(AppCheckToken appCheckToken) {
        if (appCheckToken instanceof DefaultAppCheckToken) {
            this.sharedPreferences.get().edit().putString(TOKEN_KEY, ((DefaultAppCheckToken) appCheckToken).serializeTokenToString()).putString(TOKEN_TYPE_KEY, TokenType.DEFAULT_APP_CHECK_TOKEN.name()).apply();
        } else {
            this.sharedPreferences.get().edit().putString(TOKEN_KEY, appCheckToken.getToken()).putString(TOKEN_TYPE_KEY, TokenType.UNKNOWN_APP_CHECK_TOKEN.name()).apply();
        }
    }

    public AppCheckToken retrieveAppCheckToken() {
        String string = this.sharedPreferences.get().getString(TOKEN_TYPE_KEY, null);
        String string2 = this.sharedPreferences.get().getString(TOKEN_KEY, null);
        if (string != null && string2 != null) {
            try {
                int i = AnonymousClass1.$SwitchMap$com$google$firebase$appcheck$internal$StorageHelper$TokenType[TokenType.valueOf(string).ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        return DefaultAppCheckToken.constructFromRawToken(string2);
                    }
                    logger.e("Reached unreachable section in #retrieveAppCheckToken()");
                    return null;
                }
                return DefaultAppCheckToken.deserializeTokenFromJsonString(string2);
            } catch (IllegalArgumentException e) {
                Logger logger2 = logger;
                logger2.e("Failed to parse TokenType of stored token  with type [" + string + "] with exception: " + e.getMessage());
                clearSharedPrefs();
            }
        }
        return null;
    }

    /* renamed from: com.google.firebase.appcheck.internal.StorageHelper$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$appcheck$internal$StorageHelper$TokenType;

        static {
            int[] iArr = new int[TokenType.values().length];
            $SwitchMap$com$google$firebase$appcheck$internal$StorageHelper$TokenType = iArr;
            try {
                iArr[TokenType.DEFAULT_APP_CHECK_TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$appcheck$internal$StorageHelper$TokenType[TokenType.UNKNOWN_APP_CHECK_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearSharedPrefs() {
        this.sharedPreferences.get().edit().remove(TOKEN_KEY).remove(TOKEN_TYPE_KEY).apply();
    }
}
