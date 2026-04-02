package io.flutter.view;

import com.google.android.libraries.barhopper.RecognitionOptions;
/* loaded from: classes.dex */
public enum i {
    HAS_CHECKED_STATE(1),
    IS_CHECKED(2),
    IS_SELECTED(4),
    IS_BUTTON(8),
    IS_TEXT_FIELD(16),
    IS_FOCUSED(32),
    HAS_ENABLED_STATE(64),
    IS_ENABLED(RecognitionOptions.ITF),
    IS_IN_MUTUALLY_EXCLUSIVE_GROUP(RecognitionOptions.QR_CODE),
    IS_HEADER(RecognitionOptions.UPC_A),
    IS_OBSCURED(RecognitionOptions.UPC_E),
    SCOPES_ROUTE(RecognitionOptions.PDF417),
    NAMES_ROUTE(RecognitionOptions.AZTEC),
    IS_HIDDEN(8192),
    IS_IMAGE(16384),
    IS_LIVE_REGION(RecognitionOptions.TEZ_CODE),
    HAS_TOGGLED_STATE(65536),
    IS_TOGGLED(131072),
    HAS_IMPLICIT_SCROLLING(262144),
    IS_MULTILINE(524288),
    IS_READ_ONLY(1048576),
    IS_FOCUSABLE(2097152),
    IS_LINK(4194304),
    IS_SLIDER(8388608),
    IS_KEYBOARD_KEY(16777216),
    IS_CHECK_STATE_MIXED(33554432),
    HAS_EXPANDED_STATE(67108864),
    IS_EXPANDED(134217728),
    HAS_SELECTED_STATE(268435456);
    
    final int value;

    i(int i7) {
        this.value = i7;
    }
}
