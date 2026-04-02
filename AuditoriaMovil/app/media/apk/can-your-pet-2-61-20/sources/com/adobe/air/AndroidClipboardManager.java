package com.adobe.air;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
/* loaded from: classes.dex */
public class AndroidClipboardManager {
    Context _ctx;
    ClipboardManager _mgr;

    public AndroidClipboardManager(Context context) {
        this._ctx = context;
        this._mgr = (ClipboardManager) context.getSystemService("clipboard");
    }

    public void clearClipboard() {
        this._mgr.clearPrimaryClip();
    }

    public void setText(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0) {
            this._mgr.setPrimaryClip(ClipData.newPlainText("Copied text", charSequence));
        } else if (Build.VERSION.SDK_INT >= 28) {
            clearClipboard();
        } else {
            this._mgr.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }

    public CharSequence getText() {
        ClipData primaryClip = this._mgr.getPrimaryClip();
        CharSequence charSequence = null;
        if (primaryClip != null) {
            while (charSequence == null && primaryClip.getItemCount() > 0) {
                charSequence = primaryClip.getItemAt(0).coerceToText(this._ctx);
            }
        }
        return charSequence;
    }

    public boolean hasText() {
        ClipDescription primaryClipDescription = this._mgr.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/plain");
        }
        return false;
    }
}
