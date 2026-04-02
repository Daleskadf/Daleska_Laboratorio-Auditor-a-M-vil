package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.InterfaceC0755d;
import com.google.android.gms.common.internal.InterfaceC0756e;
import com.google.android.gms.common.internal.InterfaceC0766o;
import java.util.Set;
/* loaded from: classes.dex */
public interface g extends b {
    void connect(InterfaceC0755d interfaceC0755d);

    void disconnect();

    void disconnect(String str);

    W2.d[] getAvailableFeatures();

    String getEndpointPackageName();

    String getLastDisconnectMessage();

    int getMinApkVersion();

    void getRemoteService(InterfaceC0766o interfaceC0766o, Set set);

    Set getScopesForConnectionlessNonSignIn();

    boolean isConnected();

    boolean isConnecting();

    void onUserSignOut(InterfaceC0756e interfaceC0756e);

    boolean requiresGooglePlayServices();

    boolean requiresSignIn();
}
