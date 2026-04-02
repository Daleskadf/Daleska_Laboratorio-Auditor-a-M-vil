package com.adobe.air;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.adobe.air.AndroidActivityWrapper;
import com.adobe.air.wand.view.CompanionView;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class AndroidWebViewAsync implements AndroidActivityWrapper.StateChangeCallback {
    private static final int ERROR_OTHER = 0;
    private static final int ERROR_PROTOCOL_UNSUPPORTED = 3229;
    private static final int FOCUS_DOWN = 3;
    private static final int FOCUS_NONE = 1;
    private static final int FOCUS_UP = 2;
    private static final String LOG_TAG = "AndroidWebView";
    private AndroidWebView _host;
    private AIRWindowSurfaceView mAIRSurface;
    private WebViewCustomView mCustomViewHolder;
    private RelativeLayout mLayout;
    private AndroidWebViewImpl mView;
    private Rect mBounds = null;
    private Rect mGlobalBounds = null;
    private String mUrl = null;
    private Context mContext = AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity();

    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
    public void onConfigurationChanged(Configuration configuration) {
    }

    /* loaded from: classes.dex */
    public class WebViewCustomView {
        private WebChromeClient.CustomViewCallback mCallback;
        private FrameLayout mCustomViewHolder;

        public WebViewCustomView() {
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (this.mCallback != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            this.mCallback = customViewCallback;
            View view2 = AndroidActivityWrapper.GetAndroidActivityWrapper().getView();
            view2.setVisibility(8);
            RelativeLayout overlaysLayout = AndroidActivityWrapper.GetAndroidActivityWrapper().getOverlaysLayout(false);
            if (overlaysLayout != null) {
                overlaysLayout.setVisibility(8);
            }
            FrameLayout frameLayout = new FrameLayout(AndroidWebViewAsync.this.mContext) { // from class: com.adobe.air.AndroidWebViewAsync.WebViewCustomView.1
                @Override // android.view.ViewGroup, android.view.View
                public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                    if (super.dispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 4) {
                        WebViewCustomView.this.onHideCustomView();
                        return true;
                    }
                    return false;
                }
            };
            this.mCustomViewHolder = frameLayout;
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            ((ViewGroup) view2.getParent()).addView(this.mCustomViewHolder, new FrameLayout.LayoutParams(-1, -1));
            this.mCustomViewHolder.addView(view, new FrameLayout.LayoutParams(-1, -1, 17));
            this.mCustomViewHolder.bringToFront();
            this.mCustomViewHolder.requestFocus();
        }

        public void onHideCustomView() {
            if (this.mCallback == null || this.mCustomViewHolder == null) {
                return;
            }
            AndroidActivityWrapper.GetAndroidActivityWrapper().getView().setVisibility(0);
            RelativeLayout overlaysLayout = AndroidActivityWrapper.GetAndroidActivityWrapper().getOverlaysLayout(false);
            if (overlaysLayout != null) {
                overlaysLayout.setVisibility(0);
            }
            ((ViewGroup) this.mCustomViewHolder.getParent()).removeView(this.mCustomViewHolder);
            this.mCustomViewHolder = null;
            this.mCallback.onCustomViewHidden();
            this.mCallback = null;
        }
    }

    /* loaded from: classes.dex */
    public class AndroidWebViewImpl extends WebView {
        private int mLastFocusDirection;
        private View m_focusedChildView;
        private boolean m_hasFocus;
        private boolean m_inRequestChildFocus;

        public AndroidWebViewImpl(Context context) {
            super(context);
            this.m_inRequestChildFocus = false;
            this.m_focusedChildView = null;
            this.m_hasFocus = false;
            this.mLastFocusDirection = 0;
        }

        public AndroidWebViewImpl(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.m_inRequestChildFocus = false;
            this.m_focusedChildView = null;
            this.m_hasFocus = false;
            this.mLastFocusDirection = 0;
        }

        public AndroidWebViewImpl(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.m_inRequestChildFocus = false;
            this.m_focusedChildView = null;
            this.m_hasFocus = false;
            this.mLastFocusDirection = 0;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (!this.m_hasFocus) {
                requestFocus();
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void requestChildFocus(View view, View view2) {
            this.m_inRequestChildFocus = true;
            if (!this.m_hasFocus) {
                setRealFocus(true);
            }
            try {
                this.m_focusedChildView = view;
                super.requestChildFocus(view, view2);
            } finally {
                this.m_inRequestChildFocus = false;
            }
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void clearChildFocus(View view) {
            this.m_inRequestChildFocus = true;
            try {
                super.clearChildFocus(view);
            } finally {
                this.m_inRequestChildFocus = false;
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            View view = this.m_focusedChildView;
            if (view != null) {
                view.clearFocus();
                if (AutoCompleteTextView.class.isInstance(this.m_focusedChildView)) {
                    AndroidWebViewAsync.this.mView.removeView(this.m_focusedChildView);
                }
                this.m_focusedChildView = null;
                setRealFocus(false);
                return;
            }
            super.clearFocus();
        }

        private void setRealFocus(boolean z) {
            super.onFocusChanged(z, 0, new Rect());
            invalidate();
            dispatchFocusEvent(z, 0);
        }

        public boolean isInTextEditingMode() {
            return this.m_hasFocus && !(this.m_focusedChildView == null && getChildCount() == 0);
        }

        private void dispatchFocusEvent(boolean z, int i) {
            if (this.m_hasFocus == z) {
                return;
            }
            this.m_hasFocus = z;
            AndroidWebViewAsync androidWebViewAsync = AndroidWebViewAsync.this;
            if (androidWebViewAsync.getHost().internalReference() == 0) {
                return;
            }
            if (AndroidWebViewAsync.this.mAIRSurface != null) {
                AndroidWebViewAsync.this.mAIRSurface.updateFocusedStageWebView(androidWebViewAsync.getHost(), this.m_hasFocus);
            }
            int i2 = 2;
            if ((i & 2) == 2) {
                i2 = 3;
            } else if ((i & 1) != 1) {
                i2 = 1;
            }
            if (z) {
                androidWebViewAsync.getHost().dispatchFocusInJ(i2);
            } else {
                androidWebViewAsync.getHost().dispatchFocusOutJ(i2);
            }
        }

        @Override // android.webkit.WebView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            if (this.m_inRequestChildFocus && this.m_focusedChildView != null && this.m_hasFocus) {
                return;
            }
            if (i == 0) {
                i = this.mLastFocusDirection;
            }
            this.mLastFocusDirection = 0;
            dispatchFocusEvent(z, i);
        }

        @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            int i;
            boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
            if (!dispatchKeyEvent && keyEvent.getAction() == 0) {
                if (keyEvent.getKeyCode() == 19) {
                    i = 33;
                } else {
                    i = keyEvent.getKeyCode() == 20 ? 130 : 0;
                }
                if (i != 0) {
                    AndroidWebViewAsync androidWebViewAsync = AndroidWebViewAsync.this;
                    this.mLastFocusDirection = i;
                    androidWebViewAsync.setStageFocus(i);
                    return true;
                }
            }
            return !dispatchKeyEvent ? AndroidWebViewAsync.this.mAIRSurface.dispatchKeyEvent(keyEvent) : dispatchKeyEvent;
        }
    }

    public AndroidWebView getHost() {
        return this._host;
    }

    public AndroidWebViewAsync(AndroidWebView androidWebView) {
        this._host = androidWebView;
        AndroidWebViewImpl androidWebViewImpl = new AndroidWebViewImpl(this.mContext);
        this.mView = androidWebViewImpl;
        WebSettings settings = androidWebViewImpl.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setNeedInitialFocus(true);
        boolean webContentsDebuggingEnabled = AndroidActivityWrapper.GetAndroidActivityWrapper().getWebContentsDebuggingEnabled();
        if (webContentsDebuggingEnabled) {
            AndroidWebViewImpl.setWebContentsDebuggingEnabled(webContentsDebuggingEnabled);
        }
        if (AndroidActivityWrapper.GetAndroidActivityWrapper().getWebViewAllowFileAccess()) {
            settings.setAllowFileAccess(true);
        }
        settings.setAllowUniversalAccessFromFileURLs(true);
        this.mView.setScrollbarFadingEnabled(true);
        this.mView.setScrollBarStyle(CompanionView.kTouchMetaStateIsPen);
        this.mView.setWebChromeClient(new WebChromeClient() { // from class: com.adobe.air.AndroidWebViewAsync.1
            private ValueCallback<Uri> mUploadMessage;

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                if (AndroidWebViewAsync.this.mCustomViewHolder == null) {
                    AndroidWebViewAsync androidWebViewAsync = AndroidWebViewAsync.this;
                    androidWebViewAsync.mCustomViewHolder = new WebViewCustomView();
                }
                AndroidWebViewAsync.this.mCustomViewHolder.onShowCustomView(view, customViewCallback);
            }

            @Override // android.webkit.WebChromeClient
            public void onHideCustomView() {
                if (AndroidWebViewAsync.this.mCustomViewHolder != null) {
                    AndroidWebViewAsync.this.mCustomViewHolder.onHideCustomView();
                }
            }

            public void openFileChooser(ValueCallback<Uri> valueCallback) {
                if (this.mUploadMessage != null) {
                    return;
                }
                this.mUploadMessage = valueCallback;
                final AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
                GetAndroidActivityWrapper.addActivityResultListener(new AndroidActivityWrapper.ActivityResultCallback() { // from class: com.adobe.air.AndroidWebViewAsync.1.1
                    @Override // com.adobe.air.AndroidActivityWrapper.ActivityResultCallback
                    public void onActivityResult(int i, int i2, Intent intent) {
                        if (i != 5) {
                            return;
                        }
                        if (AnonymousClass1.this.mUploadMessage != null) {
                            AnonymousClass1.this.mUploadMessage.onReceiveValue((intent == null || i2 != -1) ? null : intent.getData());
                            AnonymousClass1.this.mUploadMessage = null;
                        }
                        GetAndroidActivityWrapper.removeActivityResultListener(this);
                    }
                });
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("*/*");
                GetAndroidActivityWrapper.getActivity().startActivityForResult(Intent.createChooser(intent, ""), 5);
            }
        });
        Thread.currentThread();
        Looper.getMainLooper().getThread();
        this.mView.setWebViewClient(new WebViewClient() { // from class: com.adobe.air.AndroidWebViewAsync.2
            private String mUrl = null;
            private String mLastPageStartedUrl = null;
            private boolean mNoCompleteForUrl = false;

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                this.mUrl = str;
                this.mLastPageStartedUrl = str;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                boolean onLocationChanging = this.onLocationChanging(str);
                this.mNoCompleteForUrl = onLocationChanging;
                return onLocationChanging;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                if (str != null && this.mNoCompleteForUrl) {
                    this.mNoCompleteForUrl = false;
                    return;
                }
                this.mUrl = str;
                this.mNoCompleteForUrl = false;
                this.onLoadComplete(str);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
                if (this.mUrl == null || sslError.getCertificate() == null) {
                    return;
                }
                final String str = this.mUrl;
                new Thread() { // from class: com.adobe.air.AndroidWebViewAsync.2.1
                    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
                    @Override // java.lang.Thread, java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public void run() {
                        /*
                            r3 = this;
                            android.net.http.SslError r0 = r2
                            android.net.http.SslCertificate r0 = r0.getCertificate()
                            if (r0 == 0) goto L26
                            com.adobe.air.SSLSecurityDialog r0 = new com.adobe.air.SSLSecurityDialog
                            r0.<init>()
                            java.lang.String r1 = r3
                            android.net.http.SslError r2 = r2
                            android.net.http.SslCertificate r2 = r2.getCertificate()
                            r0.show(r1, r2)
                            java.lang.String r0 = r0.getUserAction()
                            java.lang.String r1 = "session"
                            boolean r0 = r0.equals(r1)
                            if (r0 == 0) goto L26
                            r0 = 1
                            goto L27
                        L26:
                            r0 = 0
                        L27:
                            if (r0 == 0) goto L2f
                            android.webkit.SslErrorHandler r0 = r4
                            r0.proceed()
                            goto L34
                        L2f:
                            android.webkit.SslErrorHandler r0 = r4
                            r0.cancel()
                        L34:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.AndroidWebViewAsync.AnonymousClass2.AnonymousClass1.run():void");
                    }
                }.start();
            }

            @Override // android.webkit.WebViewClient
            public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
                String str2 = this.mLastPageStartedUrl;
                if (str2 == null || !str2.equals(str)) {
                    return;
                }
                this.onLocationChange(str);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                this.mNoCompleteForUrl = true;
                if (i == -10) {
                    AndroidWebViewAsync androidWebViewAsync = this;
                    androidWebViewAsync.onLoadError(str2, "[" + i + "] " + str + ": " + str2, AndroidWebViewAsync.ERROR_PROTOCOL_UNSUPPORTED);
                    return;
                }
                AndroidWebViewAsync androidWebViewAsync2 = this;
                androidWebViewAsync2.onLoadError(str2, "[" + i + "] " + str + ": " + str2, 0);
            }
        });
    }

    public void enableLocalDomStorage() {
        this.mView.getSettings().setDomStorageEnabled(true);
    }

    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
    public void onActivityStateChanged(AndroidActivityWrapper.ActivityState activityState) {
        WebViewCustomView webViewCustomView;
        try {
            Method method = WebView.class.getMethod("isPaused", new Class[0]);
            Method method2 = WebView.class.getMethod("onResume", new Class[0]);
            Method method3 = WebView.class.getMethod("onPause", new Class[0]);
            boolean booleanValue = ((Boolean) method.invoke(this.mView, new Object[0])).booleanValue();
            int i = AnonymousClass5.$SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[activityState.ordinal()];
            if (i != 1) {
                if (i == 2 && !booleanValue) {
                    this.mView.pauseTimers();
                    method3.invoke(this.mView, new Object[0]);
                }
            } else if (booleanValue) {
                method2.invoke(this.mView, new Object[0]);
                this.mView.resumeTimers();
            }
        } catch (Exception unused) {
        }
        int i2 = AnonymousClass5.$SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[activityState.ordinal()];
        if (i2 == 3) {
            if (this.mCustomViewHolder == null) {
                this.mCustomViewHolder = new WebViewCustomView();
            }
        } else if (i2 == 4 && (webViewCustomView = this.mCustomViewHolder) != null) {
            webViewCustomView.onHideCustomView();
            this.mCustomViewHolder = null;
        }
    }

    /* renamed from: com.adobe.air.AndroidWebViewAsync$5  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState;

        static {
            int[] iArr = new int[AndroidActivityWrapper.ActivityState.values().length];
            $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState = iArr;
            try {
                iArr[AndroidActivityWrapper.ActivityState.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.DESTROYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public void destroyInternals() {
        removedFromStage();
        this.mView.destroy();
        this.mView = null;
    }

    public void stop() {
        this.mView.stopLoading();
    }

    public void reload() {
        this.mView.reload();
    }

    public void setMediaPlaybackRequiresUserAction(boolean z) {
        this.mView.getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    public boolean getMediaPlaybackRequiresUserAction() {
        return this.mView.getSettings().getMediaPlaybackRequiresUserGesture();
    }

    public void goBack() {
        this.mView.goBack();
    }

    public void goForward() {
        this.mView.goForward();
    }

    public boolean canGoBack() {
        return this.mView.canGoBack();
    }

    public boolean canGoForward() {
        return this.mView.canGoForward();
    }

    public void addedToStage(AIRWindowSurfaceView aIRWindowSurfaceView) {
        if (this.mLayout != null) {
            removedFromStage();
        }
        Thread.currentThread();
        Looper.getMainLooper().getThread();
        this.mAIRSurface = aIRWindowSurfaceView;
        final AndroidActivityWrapper activityWrapper = aIRWindowSurfaceView.getActivityWrapper();
        activityWrapper.addActivityStateChangeListner(this);
        activityWrapper.getActivity().runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebViewAsync.3
            @Override // java.lang.Runnable
            public void run() {
                Thread.currentThread();
                Looper.getMainLooper().getThread();
                AndroidWebViewAsync.this.mLayout = activityWrapper.getOverlaysLayout(true);
                AndroidWebViewAsync.this.mLayout.addView(AndroidWebViewAsync.this.mView, new RelativeLayout.LayoutParams(0, 0));
            }
        });
    }

    public void removedFromStage() {
        RelativeLayout relativeLayout = this.mLayout;
        if (relativeLayout != null) {
            relativeLayout.removeView(this.mView);
            this.mLayout = null;
            AndroidActivityWrapper activityWrapper = this.mAIRSurface.getActivityWrapper();
            activityWrapper.didRemoveOverlay();
            activityWrapper.removeActivityStateChangeListner(this);
            this.mAIRSurface.updateFocusedStageWebView(getHost(), false);
        }
        this.mAIRSurface = null;
    }

    public void setVisibility(boolean z) {
        int i = z ? 0 : 4;
        if (this.mView.getVisibility() != i) {
            this.mView.setVisibility(i);
        }
    }

    public long updateViewBoundsWithKeyboard(int i) {
        this.mGlobalBounds = this.mBounds;
        int i2 = 0;
        if (this.mAIRSurface != null && isInTextEditingMode()) {
            Rect rect = new Rect(0, 0, this.mAIRSurface.getVisibleBoundWidth(), this.mAIRSurface.getVisibleBoundHeight());
            if (!rect.contains(this.mBounds)) {
                int min = Math.min(Math.max(0, this.mBounds.top), i);
                int min2 = Math.min(Math.max(0, this.mBounds.bottom), i);
                if (min == min2 || (i2 = min2 - rect.bottom) <= 0) {
                    return 0L;
                }
                if (i2 > min) {
                    Rect rect2 = new Rect(this.mBounds);
                    this.mGlobalBounds = rect2;
                    rect2.bottom = rect.bottom + min;
                    i2 = min;
                }
            }
        }
        refreshGlobalBounds();
        return i2;
    }

    public void resetGlobalBounds() {
        this.mGlobalBounds = this.mBounds;
        refreshGlobalBounds();
    }

    private void refreshGlobalBounds() {
        AndroidWebViewImpl androidWebViewImpl = this.mView;
        if (androidWebViewImpl == null) {
            return;
        }
        androidWebViewImpl.post(new Runnable() { // from class: com.adobe.air.AndroidWebViewAsync.4
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebViewAsync.this.mView == null) {
                    return;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AndroidWebViewAsync.this.mGlobalBounds.width(), AndroidWebViewAsync.this.mGlobalBounds.height());
                layoutParams.leftMargin = AndroidWebViewAsync.this.mGlobalBounds.left;
                layoutParams.topMargin = AndroidWebViewAsync.this.mGlobalBounds.top;
                AndroidWebViewAsync.this.mView.setLayoutParams(layoutParams);
                AndroidWebViewAsync.this.mView.requestLayout();
            }
        });
    }

    public void adjustViewBounds(double d, double d2, double d3, double d4) {
        Rect rect = new Rect((int) d, (int) d2, (int) (d + d3), (int) (d2 + d4));
        this.mBounds = rect;
        this.mGlobalBounds = rect;
        refreshGlobalBounds();
    }

    public void loadString(String str, String str2) {
        try {
            byte[] bytes = str.getBytes("utf-8");
            if (!(bytes.length >= 3 && bytes[0] == 239 && bytes[1] == 187 && bytes[2] == 191)) {
                byte[] bArr = new byte[bytes.length + 3];
                System.arraycopy(bytes, 0, bArr, 3, bytes.length);
                bArr[0] = -17;
                bArr[1] = -69;
                bArr[2] = -65;
                bytes = bArr;
            }
            this.mView.loadData(Base64.encodeToString(bytes, 0, bytes.length, 2), "text/html", "base64");
        } catch (UnsupportedEncodingException unused) {
        }
    }

    public void loadURL(String str) {
        if (str == null) {
            return;
        }
        this.mView.loadUrl(str);
    }

    public boolean onLocationChange(String str) {
        if (getHost().internalReference() == 0) {
            return true;
        }
        this.mUrl = str;
        return getHost().dispatchLocationChangeJ();
    }

    private String decodeURL(String str) {
        try {
            return new String(URLUtil.decode(str.getBytes()));
        } catch (IllegalArgumentException unused) {
            return str;
        }
    }

    public boolean onLocationChanging(String str) {
        if (getHost().internalReference() == 0) {
            return true;
        }
        return getHost().dispatchLocationChangingJ(str);
    }

    public void onLoadComplete(String str) {
        if (getHost().internalReference() == 0) {
            return;
        }
        this.mUrl = str;
        getHost().dispatchLoadCompleteJ();
    }

    public void onLoadError(String str, String str2, int i) {
        if (getHost().internalReference() == 0) {
            return;
        }
        this.mUrl = str;
        getHost().dispatchLoadErrorJ(str2, i);
    }

    public String getCurrentLocation() {
        String str = this.mUrl;
        return str == null ? "about:blank" : decodeURL(str);
    }

    public String getPageTitle() {
        String title = this.mView.getTitle();
        return title == null ? "" : title;
    }

    public void assignFocus(int i) {
        if (i == 1) {
            this.mView.requestFocus();
        } else if (i == 2) {
            this.mView.pageUp(true);
            this.mView.requestFocus(33);
        } else if (i != 3) {
        } else {
            this.mView.pageDown(true);
            this.mView.requestFocus(130);
        }
    }

    public void clearFocus() {
        this.mView.clearFocus();
        this.mAIRSurface.requestFocus();
    }

    public void setStageFocus(int i) {
        this.mView.clearFocus();
        this.mAIRSurface.requestFocus(i);
    }

    public Bitmap captureSnapshot(int i, int i2) {
        if (i < 0 || i2 < 0) {
            return null;
        }
        if (i == 0 && i2 == 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-this.mView.getScrollX(), -this.mView.getScrollY());
        boolean isHorizontalScrollBarEnabled = this.mView.isHorizontalScrollBarEnabled();
        boolean isVerticalScrollBarEnabled = this.mView.isVerticalScrollBarEnabled();
        this.mView.setHorizontalScrollBarEnabled(false);
        this.mView.setVerticalScrollBarEnabled(false);
        try {
            this.mView.draw(canvas);
        } catch (Exception unused) {
            Picture capturePicture = this.mView.capturePicture();
            float scale = this.mView.getScale();
            canvas.scale(scale, scale);
            capturePicture.draw(canvas);
        }
        this.mView.setHorizontalScrollBarEnabled(isHorizontalScrollBarEnabled);
        this.mView.setVerticalScrollBarEnabled(isVerticalScrollBarEnabled);
        return createBitmap;
    }

    public boolean isInTextEditingMode() {
        return this.mView.isInTextEditingMode();
    }
}
