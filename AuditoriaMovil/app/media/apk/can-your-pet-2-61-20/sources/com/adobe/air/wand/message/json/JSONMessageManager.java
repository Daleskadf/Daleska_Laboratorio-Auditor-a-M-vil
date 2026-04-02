package com.adobe.air.wand.message.json;

import androidx.core.app.NotificationCompat;
import com.adobe.air.wand.message.Message;
import com.adobe.air.wand.message.MessageDataArray;
import com.adobe.air.wand.message.MessageDataObject;
import com.adobe.air.wand.message.MessageManager;
import com.adobe.air.wand.message.Notification;
import com.adobe.air.wand.message.Request;
import com.adobe.air.wand.message.Response;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class JSONMessageManager extends MessageManager {
    @Override // com.adobe.air.wand.message.MessageManager
    public MessageDataObject createDataObject() {
        return new JSONMessageDataObject();
    }

    @Override // com.adobe.air.wand.message.MessageManager
    public MessageDataArray createDataArray() {
        return new JSONMessageDataArray();
    }

    @Override // com.adobe.air.wand.message.MessageManager
    public String serializeMessage(Message message) throws Exception {
        return createJSONMessage(message).toString();
    }

    @Override // com.adobe.air.wand.message.MessageManager
    public Message deserializeWandMessage(String str) throws Exception {
        return createWandMessage(new JSONObject(str));
    }

    @Override // com.adobe.air.wand.message.MessageManager
    public Request createWandRequest(String str, String str2, MessageDataArray messageDataArray) throws Exception {
        Request.Header header = new Request.Header(str, str2, System.currentTimeMillis());
        if (messageDataArray == null) {
            messageDataArray = new JSONMessageDataArray();
        }
        return new Request(header, new Request.Data(messageDataArray));
    }

    @Override // com.adobe.air.wand.message.MessageManager
    public Response createWandResponse(String str, String str2, MessageDataObject messageDataObject, Response.Status status) throws Exception {
        Response.Header header = new Response.Header(str, str2, System.currentTimeMillis(), status);
        if (messageDataObject == null) {
            messageDataObject = new JSONMessageDataObject();
        }
        return new Response(header, new Response.Data(messageDataObject));
    }

    @Override // com.adobe.air.wand.message.MessageManager
    public Notification createWandNotification(String str, MessageDataObject messageDataObject) throws Exception {
        Notification.Header header = new Notification.Header(str, System.currentTimeMillis());
        if (messageDataObject == null) {
            messageDataObject = new JSONMessageDataObject();
        }
        return new Notification(header, new Notification.Data(messageDataObject));
    }

    private static Message createWandMessage(JSONObject jSONObject) throws Exception {
        Message message;
        Message notification;
        Response.Status status;
        synchronized (jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("header");
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            String string = jSONObject2.getString("title");
            String string2 = jSONObject2.getString("type");
            long j = jSONObject2.getLong("timestamp");
            if (string2.equals(Message.Type.REQUEST.toString())) {
                message = new Request(new Request.Header(string, jSONObject2.getString("taskID"), j), new Request.Data(new JSONMessageDataArray(jSONObject3.getJSONArray("arguments"))));
            } else {
                if (string2.equals(Message.Type.RESPONSE.toString())) {
                    String string3 = jSONObject2.getString("taskID");
                    String string4 = jSONObject2.getString(NotificationCompat.CATEGORY_STATUS);
                    if (string4.equals(Response.Status.SUCCESS.toString())) {
                        status = Response.Status.SUCCESS;
                    } else if (string4.equals(Response.Status.ERROR.toString())) {
                        status = Response.Status.ERROR;
                    } else {
                        throw new Exception("Unable to fetch Response status");
                    }
                    Response.Status status2 = status;
                    notification = new Response(new Response.Header(string, string3, j, status2), new Response.Data(new JSONMessageDataObject(jSONObject3.getJSONObject("result"))));
                } else if (string2.equals(Message.Type.NOTIFICATION.toString())) {
                    notification = new Notification(new Notification.Header(string, j), new Notification.Data(new JSONMessageDataObject(jSONObject3.getJSONObject("notification"))));
                } else {
                    message = null;
                }
                message = notification;
            }
        }
        return message;
    }

    private static JSONObject createJSONMessage(Message message) throws Exception {
        Response.Header header;
        JSONObject jSONObject;
        synchronized (message) {
            Message.Type type = message.getHeader().getType();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            int i = AnonymousClass1.$SwitchMap$com$adobe$air$wand$message$Message$Type[type.ordinal()];
            if (i == 1) {
                Request.Header header2 = (Request.Header) message.getHeader();
                jSONObject2.put("taskID", header2.getTaskID());
                jSONObject3.put("arguments", ((JSONMessageDataArray) ((Request.Data) message.getData()).getArguments()).mJSONArray);
                header = header2;
            } else if (i == 2) {
                Response.Header header3 = (Response.Header) message.getHeader();
                jSONObject2.put(NotificationCompat.CATEGORY_STATUS, header3.getStatus().toString());
                jSONObject2.put("taskID", header3.getTaskID());
                jSONObject3.put("result", ((JSONMessageDataObject) ((Response.Data) message.getData()).getResult()).mJSONObject);
                header = header3;
            } else if (i == 3) {
                jSONObject3.put("notification", ((JSONMessageDataObject) ((Notification.Data) message.getData()).getNotification()).mJSONObject);
                header = (Notification.Header) message.getHeader();
            } else {
                throw new Exception("Unsupported message type");
            }
            jSONObject2.put("title", header.getTitle());
            jSONObject2.put("type", header.getType().toString());
            jSONObject2.put("timestamp", header.getTimestamp());
            jSONObject = new JSONObject();
            jSONObject.put("header", jSONObject2);
            jSONObject.put("data", jSONObject3);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adobe.air.wand.message.json.JSONMessageManager$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$adobe$air$wand$message$Message$Type;

        static {
            int[] iArr = new int[Message.Type.values().length];
            $SwitchMap$com$adobe$air$wand$message$Message$Type = iArr;
            try {
                iArr[Message.Type.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$adobe$air$wand$message$Message$Type[Message.Type.RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$adobe$air$wand$message$Message$Type[Message.Type.NOTIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
