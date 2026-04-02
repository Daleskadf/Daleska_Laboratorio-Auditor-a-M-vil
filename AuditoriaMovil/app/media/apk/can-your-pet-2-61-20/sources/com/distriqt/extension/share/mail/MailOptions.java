package com.distriqt.extension.share.mail;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
/* loaded from: classes.dex */
public class MailOptions implements Parcelable {
    public static final Parcelable.Creator<MailOptions> CREATOR = new Parcelable.Creator<MailOptions>() { // from class: com.distriqt.extension.share.mail.MailOptions.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MailOptions createFromParcel(Parcel parcel) {
            return new MailOptions(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MailOptions[] newArray(int i) {
            return new MailOptions[i];
        }
    };
    private ArrayList<MessageAttachment> attachments;
    private String[] bccRecipients;
    private String body;
    private String[] ccRecipients;
    private boolean isHtml;
    private String[] recipients;
    private String subject;
    private String title;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MailOptions() {
        this.title = "Send Mail...";
        this.isHtml = false;
        this.recipients = new String[0];
        this.ccRecipients = new String[0];
        this.bccRecipients = new String[0];
        this.attachments = new ArrayList<>();
    }

    protected MailOptions(Parcel parcel) {
        this.title = "Send Mail...";
        this.isHtml = false;
        this.title = parcel.readString();
        this.subject = parcel.readString();
        this.body = parcel.readString();
        this.recipients = parcel.createStringArray();
        this.ccRecipients = parcel.createStringArray();
        this.bccRecipients = parcel.createStringArray();
        this.isHtml = parcel.readInt() == 1;
        try {
            this.attachments = new ArrayList<>();
            JSONArray jSONArray = new JSONArray(parcel.readString());
            for (int i = 0; i < jSONArray.length(); i++) {
                MessageAttachment fromJSON = MessageAttachment.fromJSON(jSONArray.getJSONObject(i));
                if (fromJSON != null) {
                    this.attachments.add(fromJSON);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subject);
        parcel.writeString(this.body);
        parcel.writeStringArray(this.recipients);
        parcel.writeStringArray(this.ccRecipients);
        parcel.writeStringArray(this.bccRecipients);
        parcel.writeInt(this.isHtml ? 1 : 0);
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<MessageAttachment> it = this.attachments.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toJSON());
            }
            parcel.writeString(jSONArray.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String str) {
        this.subject = str;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public String[] getRecipients() {
        return this.recipients;
    }

    public void setRecipients(String[] strArr) {
        this.recipients = strArr;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String[] getCcRecipients() {
        return this.ccRecipients;
    }

    public void setCcRecipients(String[] strArr) {
        this.ccRecipients = strArr;
    }

    public String[] getBccRecipients() {
        return this.bccRecipients;
    }

    public void setBccRecipients(String[] strArr) {
        this.bccRecipients = strArr;
    }

    public boolean isHtml() {
        return this.isHtml;
    }

    public void setHtml(boolean z) {
        this.isHtml = z;
    }

    public ArrayList<MessageAttachment> getAttachments() {
        return this.attachments;
    }

    public void setAttachments(ArrayList<MessageAttachment> arrayList) {
        this.attachments = arrayList;
    }
}
