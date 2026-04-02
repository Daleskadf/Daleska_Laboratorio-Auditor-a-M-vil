package com.distriqt.extension.firebase;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class FirebaseExtension implements FREExtension {
    public static FREContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        FirebaseContext firebaseContext = new FirebaseContext();
        context = firebaseContext;
        return firebaseContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context = null;
    }
}
