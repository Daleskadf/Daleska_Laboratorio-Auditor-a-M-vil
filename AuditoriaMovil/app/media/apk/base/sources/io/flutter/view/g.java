package io.flutter.view;

import com.google.android.libraries.barhopper.RecognitionOptions;
/* loaded from: classes.dex */
public enum g {
    TAP(1),
    LONG_PRESS(2),
    SCROLL_LEFT(4),
    SCROLL_RIGHT(8),
    SCROLL_UP(16),
    SCROLL_DOWN(32),
    INCREASE(64),
    DECREASE(RecognitionOptions.ITF),
    SHOW_ON_SCREEN(RecognitionOptions.QR_CODE),
    MOVE_CURSOR_FORWARD_BY_CHARACTER(RecognitionOptions.UPC_A),
    MOVE_CURSOR_BACKWARD_BY_CHARACTER(RecognitionOptions.UPC_E),
    SET_SELECTION(RecognitionOptions.PDF417),
    COPY(RecognitionOptions.AZTEC),
    CUT(8192),
    PASTE(16384),
    DID_GAIN_ACCESSIBILITY_FOCUS(RecognitionOptions.TEZ_CODE),
    DID_LOSE_ACCESSIBILITY_FOCUS(65536),
    CUSTOM_ACTION(131072),
    DISMISS(262144),
    MOVE_CURSOR_FORWARD_BY_WORD(524288),
    MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
    SET_TEXT(2097152),
    FOCUS(4194304),
    SCROLL_TO_OFFSET(8388608);
    
    public final int value;

    g(int i7) {
        this.value = i7;
    }
}
