package com.adobe.air;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.adobe.air.AndroidActivityWrapper;
import com.adobe.air.Entrypoints;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class AndroidStageText implements Entrypoints.AsyncEntryHandler {
    private static final String LOG_TAG = "AndroidStageText";
    private Activity _act = AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity();
    private AndroidStageTextAsync _stageText;

    private native void dispatchChangeEvent(long j);

    private native void dispatchCompleteEvent(long j);

    private native void dispatchFocusIn(long j, int i);

    private native void dispatchFocusOut(long j, int i);

    private native boolean handleKeyEvent(long j, int i, int i2);

    private native void invokeSoftKeyboard(long j);

    public AndroidStageText(boolean z) {
        this._stageText = new AndroidStageTextAsync(z, this);
    }

    public void setInternalReference(long j) {
        this._stageText.setInternalReference(j);
    }

    public void destroyInternals() {
        final AndroidStageTextAsync androidStageTextAsync = this._stageText;
        if (androidStageTextAsync == null) {
            return;
        }
        androidStageTextAsync.destroyInternals();
        this._stageText = null;
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.1
            @Override // java.lang.Runnable
            public void run() {
                androidStageTextAsync.removeFromStage();
            }
        });
    }

    public void addToStage(final AIRWindowSurfaceView aIRWindowSurfaceView) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.2
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.addToStage(aIRWindowSurfaceView);
                }
            }
        });
    }

    public void removeFromStage() {
        final AndroidStageTextAsync androidStageTextAsync = this._stageText;
        if (androidStageTextAsync == null) {
            return;
        }
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.3
            @Override // java.lang.Runnable
            public void run() {
                androidStageTextAsync.removeFromStage();
            }
        });
    }

    public void setVisibility(final boolean z) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.4
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setVisibility(z);
                }
            }
        });
    }

    public long updateViewBoundsWithKeyboard(int i) {
        return this._stageText.updateViewBoundsWithKeyboard(i);
    }

    public void resetGlobalBounds() {
        this._stageText.resetGlobalBounds();
    }

    public void adjustViewBounds(final double d, final double d2, final double d3, final double d4, final double d5) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.5
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.adjustViewBounds(d, d2, d3, d4, d5);
                }
            }
        });
    }

    public void setClipBounds(final double d, final double d2, final double d3, final double d4) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.6
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setClipBounds(d, d2, d3, d4);
                }
            }
        });
    }

    public void removeClip() {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.7
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.removeClip();
                }
            }
        });
    }

    public void setText(final String str) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.8
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setText(str);
                }
            }
        });
    }

    public boolean isContextValid() {
        return this._stageText.isContextValid();
    }

    public String getText() {
        return this._stageText.getText();
    }

    public void setKeyboardType(final int i) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.9
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setKeyboardType(i);
                }
            }
        });
    }

    public int getKeyboardType() {
        return this._stageText.getKeyboardType();
    }

    public void setContentType(String str) {
        this._stageText.setContentType(str);
    }

    public String getContentType() {
        return this._stageText.getContentType();
    }

    public void setDisplayAsPassword(final boolean z) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.10
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setDisplayAsPassword(z);
                }
            }
        });
    }

    public void setEditable(final boolean z) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.11
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setEditable(z);
                }
            }
        });
    }

    public void setDisableInteraction(final boolean z) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.12
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setDisableInteraction(z);
                }
            }
        });
    }

    public void setTextColor(final int i, final int i2, final int i3, final int i4) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.13
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setTextColor(i, i2, i3, i4);
                }
            }
        });
    }

    public int getTextColor() {
        return this._stageText.getTextColor();
    }

    public void setBackgroundColor(final int i, final int i2, final int i3, final int i4) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.14
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setBackgroundColor(i, i2, i3, i4);
                }
            }
        });
    }

    public int getBackgroundColor() {
        return this._stageText.getBackgroundColor();
    }

    public void setBackground(final boolean z) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.15
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setBackground(z);
                }
            }
        });
    }

    public void setBorderColor(final int i, final int i2, final int i3, final int i4) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.16
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setBorderColor(i, i2, i3, i4);
                }
            }
        });
    }

    public int getBorderColor() {
        return this._stageText.getBorderColor();
    }

    public void setBorder(final boolean z) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.17
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setBorder(z);
                }
            }
        });
    }

    public void setAutoCapitalize(final int i) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.18
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setAutoCapitalize(i);
                }
            }
        });
    }

    public int getAutoCapitalize() {
        return this._stageText.getAutoCapitalize();
    }

    public void setAutoCorrect(final boolean z) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.19
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setAutoCorrect(z);
                }
            }
        });
    }

    public int getReturnKeyLabel() {
        return this._stageText.getReturnKeyLabel();
    }

    public void setReturnKeyLabel(final int i) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.20
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setReturnKeyLabel(i);
                }
            }
        });
    }

    public String getRestrict() {
        return this._stageText.getRestrict();
    }

    public void clearRestrict() {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.21
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.clearRestrict();
                }
            }
        });
    }

    public void setRestrict(final String str) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.22
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setRestrict(str);
                }
            }
        });
    }

    public int getMaxChars() {
        return this._stageText.getMaxChars();
    }

    public void setMaxChars(final int i) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.23
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setMaxChars(i);
                }
            }
        });
    }

    public String getLocale() {
        return this._stageText.getLocale();
    }

    public void setLocale(final String str) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.24
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setLocale(str);
                }
            }
        });
    }

    public boolean getPreventDefault() {
        return this._stageText.getPreventDefault();
    }

    public void setPreventDefault(final boolean z) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.25
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setPreventDefault(z);
                }
            }
        });
    }

    public int getAlign() {
        return this._stageText.getAlign();
    }

    public void setAlign(final int i) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.26
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setAlign(i);
                }
            }
        });
    }

    public void setFontSize(final int i) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.27
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setFontSize(i);
                }
            }
        });
    }

    public int getFontSize() {
        return this._stageText.getFontSize();
    }

    public void setBold(final boolean z) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.28
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setBold(z);
                }
            }
        });
    }

    public void setItalic(final boolean z) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.29
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setItalic(z);
                }
            }
        });
    }

    public void setFontFamily(final String str) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.30
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.setFontFamily(str);
                }
            }
        });
    }

    public void updateTypeface() {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.31
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.updateTypeface();
                }
            }
        });
    }

    public void assignFocus() {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.32
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.assignFocus();
                }
            }
        });
    }

    public void clearFocus() {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.33
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.clearFocus();
                }
            }
        });
    }

    public void selectRange(final int i, final int i2) {
        this._act.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidStageText.34
            @Override // java.lang.Runnable
            public void run() {
                AndroidStageTextAsync androidStageTextAsync = AndroidStageText.this._stageText;
                if (androidStageTextAsync != null) {
                    androidStageTextAsync.selectRange(i, i2);
                }
            }
        });
    }

    public int getSelectionAnchorIndex() {
        return this._stageText.getSelectionAnchorIndex();
    }

    public int getSelectionActiveIndex() {
        return this._stageText.getSelectionActiveIndex();
    }

    public Bitmap captureSnapshot(int i, int i2) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return this._stageText.captureSnapshot(i, i2);
        }
        Log.w("AdobeAIR", "Attempting to capture snapshot of StageText whilst running in a background thread");
        return null;
    }

    @Override // com.adobe.air.Entrypoints.AsyncEntryHandler
    public boolean wrapperInvokeMethod(Method method, Object obj) {
        Boolean bool;
        if (this._stageText == null) {
            return false;
        }
        try {
            Object[] objArr = (Object[]) obj;
            if (obj == null) {
                bool = method.invoke(this, new Object[0]);
            } else {
                int length = objArr.length;
                if (length == 1) {
                    bool = method.invoke(this, objArr[0]);
                } else if (length == 2) {
                    bool = method.invoke(this, objArr[0], objArr[1]);
                } else if (length != 3) {
                    bool = length != 4 ? method.invoke(this, obj) : method.invoke(this, objArr[0], objArr[1], objArr[2], objArr[3]);
                } else {
                    bool = method.invoke(this, objArr[0], objArr[1], objArr[2]);
                }
            }
        } catch (Exception e) {
            Log.e("AdobeAIR", "Exception when invoking stagetext method asynchronously: " + e.toString());
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public void sendDispatchFocusIn(long j, int i) {
        if (j == 0) {
            return;
        }
        Handler asyncHandler = Entrypoints.getAsyncHandler();
        if (asyncHandler == null) {
            dispatchFocusIn(j, i);
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = customHandler.ACTIVITY_WRAPPER_MSG_ID;
            obtain.obj = new AndroidActivityWrapper.AsyncEntryDetails(this, getClass().getDeclaredMethod("dispatchFocusIn", Long.TYPE, Integer.TYPE), new Object[]{Long.valueOf(j), Integer.valueOf(i)});
            asyncHandler.sendMessage(obtain);
        } catch (NoSuchMethodException e) {
            Log.e("AdobeAIR", "No such method for focus in event: " + e.toString());
        }
    }

    public void sendDispatchFocusOut(long j, int i) {
        if (j == 0) {
            return;
        }
        Handler asyncHandler = Entrypoints.getAsyncHandler();
        if (asyncHandler == null) {
            dispatchFocusOut(j, i);
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = customHandler.ACTIVITY_WRAPPER_MSG_ID;
            obtain.obj = new AndroidActivityWrapper.AsyncEntryDetails(this, getClass().getDeclaredMethod("dispatchFocusOut", Long.TYPE, Integer.TYPE), new Object[]{Long.valueOf(j), Integer.valueOf(i)});
            asyncHandler.sendMessage(obtain);
        } catch (NoSuchMethodException e) {
            Log.e("AdobeAIR", "No such method for focus out event: " + e.toString());
        }
    }

    public void sendDispatchChangeEvent(long j) {
        if (j == 0) {
            return;
        }
        Handler asyncHandler = Entrypoints.getAsyncHandler();
        if (asyncHandler == null) {
            dispatchChangeEvent(j);
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = customHandler.ACTIVITY_WRAPPER_MSG_ID;
            obtain.obj = new AndroidActivityWrapper.AsyncEntryDetails(this, getClass().getDeclaredMethod("dispatchChangeEvent", Long.TYPE), new Object[]{Long.valueOf(j)});
            asyncHandler.sendMessage(obtain);
        } catch (NoSuchMethodException e) {
            Log.e("AdobeAIR", "No such method for change event: " + e.toString());
        }
    }

    public void sendDispatchCompleteEvent(long j) {
        if (j == 0) {
            return;
        }
        Handler asyncHandler = Entrypoints.getAsyncHandler();
        if (asyncHandler == null) {
            dispatchCompleteEvent(j);
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = customHandler.ACTIVITY_WRAPPER_MSG_ID;
            obtain.obj = new AndroidActivityWrapper.AsyncEntryDetails(this, getClass().getDeclaredMethod("dispatchCompleteEvent", Long.TYPE), new Object[]{Long.valueOf(j)});
            asyncHandler.sendMessage(obtain);
        } catch (NoSuchMethodException e) {
            Log.e("AdobeAIR", "No such method for complete event: " + e.toString());
        }
    }

    public void sendInvokeSoftKeyboard(long j) {
        if (j == 0) {
            return;
        }
        Handler asyncHandler = Entrypoints.getAsyncHandler();
        if (asyncHandler == null) {
            invokeSoftKeyboard(j);
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = customHandler.ACTIVITY_WRAPPER_MSG_ID;
            obtain.obj = new AndroidActivityWrapper.AsyncEntryDetails(this, getClass().getDeclaredMethod("invokeSoftKeyboard", Long.TYPE), new Object[]{Long.valueOf(j)});
            asyncHandler.sendMessage(obtain);
        } catch (NoSuchMethodException e) {
            Log.e("AdobeAIR", "No such method for invoke softkeyboard: " + e.toString());
        }
    }

    public boolean sendHandleKeyEvent(long j, int i, int i2) {
        if (j == 0) {
            return false;
        }
        Handler asyncHandler = Entrypoints.getAsyncHandler();
        if (asyncHandler == null) {
            return handleKeyEvent(j, i, i2);
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = customHandler.ACTIVITY_WRAPPER_MSG_ID;
            obtain.obj = new AndroidActivityWrapper.AsyncEntryDetails(this, getClass().getDeclaredMethod("handleKeyEvent", Long.TYPE, Integer.TYPE, Integer.TYPE), new Object[]{Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)});
            asyncHandler.sendMessage(obtain);
        } catch (NoSuchMethodException e) {
            Log.e("AdobeAIR", "No such method for handle key event: " + e.toString());
        }
        return false;
    }
}
