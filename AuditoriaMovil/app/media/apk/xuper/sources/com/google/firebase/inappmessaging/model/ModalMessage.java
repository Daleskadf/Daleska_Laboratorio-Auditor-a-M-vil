package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
import java.util.Map;
import javax.annotation.Nullable;
/* loaded from: classes2.dex */
public class ModalMessage extends InAppMessage {
    @Nullable
    private final Action action;
    private final String backgroundHexColor;
    @Nullable
    private final Text body;
    @Nullable
    private final ImageData imageData;
    private final Text title;

    /* loaded from: classes2.dex */
    public static class Builder {
        @Nullable
        Action action;
        @Nullable
        String backgroundHexColor;
        @Nullable
        Text body;
        @Nullable
        ImageData imageData;
        @Nullable
        Text title;

        public ModalMessage build(CampaignMetadata campaignMetadata, @Nullable Map<String, String> map) {
            if (this.title != null) {
                Action action = this.action;
                if (action != null && action.getButton() == null) {
                    throw new IllegalArgumentException("Modal model action must be null or have a button");
                }
                if (!TextUtils.isEmpty(this.backgroundHexColor)) {
                    return new ModalMessage(campaignMetadata, this.title, this.body, this.imageData, this.action, this.backgroundHexColor, map);
                }
                throw new IllegalArgumentException("Modal model must have a background color");
            }
            throw new IllegalArgumentException("Modal model must have a title");
        }

        public Builder setAction(@Nullable Action action) {
            this.action = action;
            return this;
        }

        public Builder setBackgroundHexColor(@Nullable String str) {
            this.backgroundHexColor = str;
            return this;
        }

        public Builder setBody(@Nullable Text text) {
            this.body = text;
            return this;
        }

        public Builder setImageData(@Nullable ImageData imageData) {
            this.imageData = imageData;
            return this;
        }

        public Builder setTitle(@Nullable Text text) {
            this.title = text;
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
        if (!(obj instanceof ModalMessage)) {
            return false;
        }
        ModalMessage modalMessage = (ModalMessage) obj;
        if (hashCode() != modalMessage.hashCode()) {
            return false;
        }
        Text text = this.body;
        if ((text == null && modalMessage.body != null) || (text != null && !text.equals(modalMessage.body))) {
            return false;
        }
        Action action = this.action;
        if ((action == null && modalMessage.action != null) || (action != null && !action.equals(modalMessage.action))) {
            return false;
        }
        ImageData imageData = this.imageData;
        if ((imageData != null || modalMessage.imageData == null) && ((imageData == null || imageData.equals(modalMessage.imageData)) && this.title.equals(modalMessage.title) && this.backgroundHexColor.equals(modalMessage.backgroundHexColor))) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.inappmessaging.model.InAppMessage
    @Nullable
    public Action getAction() {
        return this.action;
    }

    @Override // com.google.firebase.inappmessaging.model.InAppMessage
    public String getBackgroundHexColor() {
        return this.backgroundHexColor;
    }

    @Override // com.google.firebase.inappmessaging.model.InAppMessage
    @Nullable
    public Text getBody() {
        return this.body;
    }

    @Override // com.google.firebase.inappmessaging.model.InAppMessage
    @Nullable
    public ImageData getImageData() {
        return this.imageData;
    }

    @Override // com.google.firebase.inappmessaging.model.InAppMessage
    public Text getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i10;
        int i11;
        Text text = this.body;
        int i12 = 0;
        if (text != null) {
            i10 = text.hashCode();
        } else {
            i10 = 0;
        }
        Action action = this.action;
        if (action != null) {
            i11 = action.hashCode();
        } else {
            i11 = 0;
        }
        ImageData imageData = this.imageData;
        if (imageData != null) {
            i12 = imageData.hashCode();
        }
        return this.title.hashCode() + i10 + this.backgroundHexColor.hashCode() + i11 + i12;
    }

    private ModalMessage(CampaignMetadata campaignMetadata, Text text, @Nullable Text text2, @Nullable ImageData imageData, @Nullable Action action, String str, @Nullable Map<String, String> map) {
        super(campaignMetadata, MessageType.MODAL, map);
        this.title = text;
        this.body = text2;
        this.imageData = imageData;
        this.action = action;
        this.backgroundHexColor = str;
    }
}
