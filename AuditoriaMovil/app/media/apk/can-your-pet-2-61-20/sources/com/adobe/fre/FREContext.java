package com.adobe.fre;

import android.app.Activity;
import android.content.res.Resources;
import android.view.Surface;
import java.util.Map;
import java.util.concurrent.Semaphore;
/* loaded from: classes.dex */
public abstract class FREContext {
    private long m_objectPointer;

    private native void registerFunction(long j, String str, FREFunction fREFunction);

    private native void registerFunctionCount(long j, int i);

    public native void dispatchStatusEventAsync(String str, String str2) throws IllegalArgumentException, IllegalStateException;

    public abstract void dispose();

    public native FREObject getActionScriptData() throws FREWrongThreadException, IllegalStateException;

    public native Activity getActivity() throws IllegalStateException;

    public abstract Map<String, FREFunction> getFunctions();

    public native int getResourceId(String str) throws IllegalArgumentException, Resources.NotFoundException, IllegalStateException;

    public native Surface getSurfaceFromVideoTexture(FREObject fREObject) throws IllegalArgumentException;

    public native void setActionScriptData(FREObject fREObject) throws FREWrongThreadException, IllegalArgumentException, IllegalStateException;

    public native void setVideoTextureDimensions(FREObject fREObject, int i, int i2) throws IllegalArgumentException;

    protected void VisitFunctions(long j) {
        Map<String, FREFunction> functions = getFunctions();
        registerFunctionCount(j, functions.size());
        for (Map.Entry<String, FREFunction> entry : functions.entrySet()) {
            registerFunction(j, entry.getKey(), entry.getValue());
        }
    }

    public FREObject callFunctionInMainThread(final FREFunction fREFunction, FREObject[] fREObjectArr) {
        final FREObject[] fREObjectArr2 = new FREObject[1];
        try {
            final Semaphore semaphore = new Semaphore(1);
            semaphore.acquire();
            try {
                Activity activity = getActivity();
                final FREObject[] fREObjectArr3 = new FREObject[fREObjectArr.length];
                for (int i = 0; i < fREObjectArr.length; i++) {
                    fREObjectArr3[i] = fREObjectArr[i];
                }
                activity.runOnUiThread(new Runnable() { // from class: com.adobe.fre.FREContext.1
                    @Override // java.lang.Runnable
                    public void run() {
                        fREObjectArr2[0] = fREFunction.call(this, fREObjectArr3);
                        semaphore.release();
                    }
                });
            } catch (Exception unused) {
            }
            semaphore.acquire();
            semaphore.release();
        } catch (Exception unused2) {
        }
        return fREObjectArr2[0];
    }
}
