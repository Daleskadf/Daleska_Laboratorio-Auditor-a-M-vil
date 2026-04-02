package com.adobe.air.wand.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.adobe.air.R;
import com.adobe.air.wand.view.WandView;
/* loaded from: classes.dex */
public class WandViewFlipper extends ViewFlipper implements WandView {
    private static final String ACTIVE_WIFI_ASSIST_MESSAGE = "Enter this PIN in the desktop game and press 'Connect'";
    private static final String DEFAULT_VIEW_FONT_ASSET = "AdobeClean-Light.ttf";
    private static final String INACTIVE_WIFI_ASSIST_MESSAGE = "Connect this device to WiFi to get the pairing PIN";
    private static final String LOG_TAG = "WandViewFlipper";
    private static final String PIN_TITLE = "PIN : ";
    private static final String TITLE_DESCRIPTION_STRING = "Use this device as a Wireless Gamepad";
    private CompanionView mCompanionView;
    private View mCompanionViewHolder;
    private int mCurrentViewIndex;
    private View mDefaultView;
    private WandView.Listener mListener;
    private TouchSensor mTouchSensor;

    /* JADX INFO: Access modifiers changed from: private */
    public static String getTokenDesc(boolean z) {
        return z ? ACTIVE_WIFI_ASSIST_MESSAGE : INACTIVE_WIFI_ASSIST_MESSAGE;
    }

    public WandViewFlipper(Context context) {
        super(context);
        this.mCurrentViewIndex = 0;
        this.mDefaultView = null;
        this.mCompanionViewHolder = null;
        this.mCompanionView = null;
        this.mTouchSensor = null;
        this.mListener = null;
        initView(context);
    }

    public WandViewFlipper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCurrentViewIndex = 0;
        this.mDefaultView = null;
        this.mCompanionViewHolder = null;
        this.mCompanionView = null;
        this.mTouchSensor = null;
        this.mListener = null;
        initView(context);
    }

    private void initView(Context context) {
        this.mListener = null;
        try {
            setKeepScreenOn(true);
            LayoutInflater from = LayoutInflater.from(context);
            this.mDefaultView = from.inflate(R.layout.wand_default, (ViewGroup) null);
            this.mCompanionViewHolder = from.inflate(R.layout.wand_companion, (ViewGroup) null);
            this.mDefaultView.getBackground().setDither(true);
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), DEFAULT_VIEW_FONT_ASSET);
            ((TextView) this.mDefaultView.findViewById(R.id.title_string)).setTypeface(createFromAsset);
            ((TextView) this.mDefaultView.findViewById(R.id.token_string)).setTypeface(createFromAsset);
            ((TextView) this.mDefaultView.findViewById(R.id.token_desc)).setTypeface(createFromAsset);
            TextView textView = (TextView) this.mDefaultView.findViewById(R.id.title_desc);
            textView.setTypeface(createFromAsset);
            textView.setText(TITLE_DESCRIPTION_STRING);
            addView(this.mDefaultView, 0);
            addView(this.mCompanionViewHolder, 1);
            CompanionView companionView = (CompanionView) this.mCompanionViewHolder.findViewById(R.id.companion_view);
            this.mCompanionView = companionView;
            this.mTouchSensor = companionView.getTouchSensor();
            this.mCurrentViewIndex = 0;
        } catch (Exception unused) {
        }
    }

    /* renamed from: com.adobe.air.wand.view.WandViewFlipper$5  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$adobe$air$wand$view$WandView$ScreenOrientation;

        static {
            int[] iArr = new int[WandView.ScreenOrientation.values().length];
            $SwitchMap$com$adobe$air$wand$view$WandView$ScreenOrientation = iArr;
            try {
                iArr[WandView.ScreenOrientation.LANDSCAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$adobe$air$wand$view$WandView$ScreenOrientation[WandView.ScreenOrientation.PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$adobe$air$wand$view$WandView$ScreenOrientation[WandView.ScreenOrientation.REVERSE_PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$adobe$air$wand$view$WandView$ScreenOrientation[WandView.ScreenOrientation.REVERSE_LANDSCAPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.adobe.air.wand.view.WandView
    public void setScreenOrientation(WandView.ScreenOrientation screenOrientation) throws Exception {
        int i = AnonymousClass5.$SwitchMap$com$adobe$air$wand$view$WandView$ScreenOrientation[screenOrientation.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            i2 = i != 3 ? i != 4 ? -1 : 8 : 9;
        }
        Activity activity = (Activity) getContext();
        if (activity == null) {
            throw new IllegalArgumentException("Wand cannot find activity while loading companion.");
        }
        activity.setRequestedOrientation(i2);
    }

    @Override // com.adobe.air.wand.view.WandView
    public void drawImage(Bitmap bitmap) throws Exception {
        if (this.mCurrentViewIndex == 0) {
            throw new Exception("Companion view is not yet loaded.");
        }
        final ImageView imageView = (ImageView) this.mCompanionViewHolder.findViewById(R.id.skin);
        final Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, imageView.getWidth(), (bitmap.getHeight() * imageView.getWidth()) / bitmap.getWidth(), true);
        if (createScaledBitmap != bitmap) {
            bitmap.recycle();
        }
        int height = imageView.getHeight();
        int height2 = createScaledBitmap.getHeight();
        if (height2 > height) {
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, 0, height2 - height, imageView.getWidth(), imageView.getHeight());
            if (createBitmap != createScaledBitmap) {
                createScaledBitmap.recycle();
            }
            createScaledBitmap = createBitmap;
        }
        ((Activity) getContext()).runOnUiThread(new Runnable() { // from class: com.adobe.air.wand.view.WandViewFlipper.1
            @Override // java.lang.Runnable
            public void run() {
                imageView.setImageBitmap(createScaledBitmap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getTokenString(String str) {
        return PIN_TITLE + str;
    }

    @Override // com.adobe.air.wand.view.WandView
    public void loadDefaultView() throws Exception {
        ((Activity) getContext()).runOnUiThread(new Runnable() { // from class: com.adobe.air.wand.view.WandViewFlipper.2
            @Override // java.lang.Runnable
            public void run() {
                ((ImageView) WandViewFlipper.this.mCompanionViewHolder.findViewById(R.id.skin)).setImageResource(R.color.transparent);
                WandViewFlipper.this.mCurrentViewIndex = 0;
                String connectionToken = WandViewFlipper.this.mListener != null ? WandViewFlipper.this.mListener.getConnectionToken() : "";
                if (!connectionToken.equals("")) {
                    connectionToken = WandViewFlipper.getTokenString(connectionToken);
                }
                ((TextView) WandViewFlipper.this.mDefaultView.findViewById(R.id.token_string)).setText(connectionToken);
                ((TextView) WandViewFlipper.this.mDefaultView.findViewById(R.id.token_desc)).setText(WandViewFlipper.getTokenDesc(!WandViewFlipper.this.mListener.getConnectionToken().equals("")));
                WandViewFlipper wandViewFlipper = WandViewFlipper.this;
                wandViewFlipper.setDisplayedChild(wandViewFlipper.mCurrentViewIndex);
            }
        });
    }

    @Override // com.adobe.air.wand.view.WandView
    public void loadCompanionView() throws Exception {
        if (this.mCurrentViewIndex == 1) {
            return;
        }
        this.mCurrentViewIndex = 1;
        ((Activity) getContext()).runOnUiThread(new Runnable() { // from class: com.adobe.air.wand.view.WandViewFlipper.3
            @Override // java.lang.Runnable
            public void run() {
                WandViewFlipper wandViewFlipper = WandViewFlipper.this;
                wandViewFlipper.setDisplayedChild(wandViewFlipper.mCurrentViewIndex);
                try {
                    if (WandViewFlipper.this.mListener != null) {
                        WandViewFlipper.this.mListener.onLoadCompanion(((Activity) WandViewFlipper.this.getContext()).getResources().getConfiguration());
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    @Override // com.adobe.air.wand.view.WandView
    public void registerListener(WandView.Listener listener) throws Exception {
        if (this.mListener != null) {
            throw new Exception("View listener is already registered");
        }
        if (listener == null) {
            throw new Exception("Invalid view listener");
        }
        this.mListener = listener;
    }

    @Override // com.adobe.air.wand.view.WandView
    public void unregisterListener() {
        this.mListener = null;
    }

    @Override // com.adobe.air.wand.view.WandView
    public void updateConnectionToken(final String str) {
        if (this.mCurrentViewIndex == 1) {
            return;
        }
        ((Activity) getContext()).runOnUiThread(new Runnable() { // from class: com.adobe.air.wand.view.WandViewFlipper.4
            @Override // java.lang.Runnable
            public void run() {
                ((TextView) WandViewFlipper.this.mDefaultView.findViewById(R.id.token_string)).setText(!str.equals("") ? WandViewFlipper.getTokenString(str) : "");
                ((TextView) WandViewFlipper.this.mDefaultView.findViewById(R.id.token_desc)).setText(WandViewFlipper.getTokenDesc(!str.equals("")));
            }
        });
    }

    @Override // com.adobe.air.wand.view.WandView
    public TouchSensor getTouchSensor() {
        return this.mTouchSensor;
    }
}
