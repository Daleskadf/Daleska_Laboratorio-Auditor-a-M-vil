package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.MessagesProto;
import com.google.firebase.inappmessaging.model.Button;
/* loaded from: classes2.dex */
public class Action {
    private final String actionUrl;
    private final Button button;

    /* loaded from: classes2.dex */
    public static class Builder {
        private String actionUrl;
        private Button button;

        public Action build() {
            return new Action(this.actionUrl, this.button);
        }

        public Builder setActionUrl(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.actionUrl = str;
            }
            return this;
        }

        public Builder setButton(Button button) {
            this.button = button;
            return this;
        }

        public Builder setButton(MessagesProto.Button button) {
            Button.Builder builder = new Button.Builder();
            builder.setButtonHexColor(button.getButtonHexColor());
            builder.setText(button.getText());
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        if (hashCode() != action.hashCode()) {
            return false;
        }
        String str = this.actionUrl;
        if ((str == null && action.actionUrl != null) || (str != null && !str.equals(action.actionUrl))) {
            return false;
        }
        Button button = this.button;
        if ((button == null && action.button == null) || (button != null && button.equals(action.button))) {
            return true;
        }
        return false;
    }

    public String getActionUrl() {
        return this.actionUrl;
    }

    public Button getButton() {
        return this.button;
    }

    public int hashCode() {
        int i10;
        String str = this.actionUrl;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        Button button = this.button;
        if (button != null) {
            i11 = button.hashCode();
        }
        return i10 + i11;
    }

    private Action(String str, Button button) {
        this.actionUrl = str;
        this.button = button;
    }
}
