package com.adobe.air.wand.view;

import android.content.res.Configuration;
import android.graphics.Bitmap;
/* loaded from: classes.dex */
public interface WandView {

    /* loaded from: classes.dex */
    public interface Listener {
        String getConnectionToken();

        void onLoadCompanion(Configuration configuration) throws Exception;
    }

    void drawImage(Bitmap bitmap) throws Exception;

    TouchSensor getTouchSensor();

    void loadCompanionView() throws Exception;

    void loadDefaultView() throws Exception;

    void registerListener(Listener listener) throws Exception;

    void setScreenOrientation(ScreenOrientation screenOrientation) throws Exception;

    void unregisterListener();

    void updateConnectionToken(String str);

    /* loaded from: classes.dex */
    public enum ScreenOrientation {
        LANDSCAPE("LANDSCAPE"),
        PORTRAIT("PORTRAIT"),
        REVERSE_LANDSCAPE("REVERSE_LANDSCAPE"),
        REVERSE_PORTRAIT("REVERSE_PORTRAIT"),
        AUTO("AUTO"),
        INHERIT("INHERIT");
        
        private final String mOrientation;

        ScreenOrientation(String str) {
            this.mOrientation = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mOrientation;
        }

        public static ScreenOrientation getScreenOrientation(String str) throws Exception {
            ScreenOrientation screenOrientation = LANDSCAPE;
            if (screenOrientation.toString().equals(str)) {
                return screenOrientation;
            }
            ScreenOrientation screenOrientation2 = PORTRAIT;
            if (screenOrientation2.toString().equals(str)) {
                return screenOrientation2;
            }
            ScreenOrientation screenOrientation3 = REVERSE_LANDSCAPE;
            if (screenOrientation3.toString().equals(str)) {
                return screenOrientation3;
            }
            ScreenOrientation screenOrientation4 = REVERSE_PORTRAIT;
            if (screenOrientation4.toString().equals(str)) {
                return screenOrientation4;
            }
            ScreenOrientation screenOrientation5 = AUTO;
            if (screenOrientation5.toString().equals(str)) {
                return screenOrientation5;
            }
            ScreenOrientation screenOrientation6 = INHERIT;
            if (screenOrientation6.toString().equals(str)) {
                return screenOrientation6;
            }
            throw new Exception("Unspported screen orientation");
        }
    }
}
