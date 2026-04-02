package com.adobe.air.wand.connection;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.view.PointerIconCompat;
import androidx.work.WorkRequest;
import com.adobe.air.wand.Version;
import com.adobe.air.wand.connection.Connection;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.nio.channels.CancelledKeyException;
import java.util.Enumeration;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.util.InetAddressUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class WandWebSocket implements Connection {
    private static final String CONNECT_PING_URL = "http://dh8vjmvwgc27o.cloudfront.net/AIRGamepad/connect_ping.txt";
    private static final String LOG_TAG = "WandWebSocket";
    private static final String WEBSOCKET_PROTOCOL = "WEBSOCKET";
    private Activity mActivity;
    private Timer mHandshakeTimer;
    private final String OPEN_SYNCHRONIZER = "OPEN_SYNCHRONIZER";
    private final String HANDSHAKE_SYNCHRONIZER = "HANDSHAKE_SYNCHRONIZER";
    private Connection.Listener mConnectionListener = null;
    private WebSocket mConnection = null;
    private boolean mAllowIncomingConnection = false;
    private String mConnectionToken = null;
    private String mLocalID = null;
    private Handshake mHandshake = null;
    private WandSocketServer mWandSocketServer = null;
    private boolean mIsDisposed = false;

    private int getPreferredPort() {
        return 1234;
    }

    private int getUnsignedByte(byte b) {
        return b >= 0 ? b : b + 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class Handshake {
        private static final String APPLICATION_URL = "applicationURL";
        private static final String DESTINATION_ID = "destinationID";
        private static final String PROTOCOL = "protocol";
        private static final String PUBLISHER = "publisher";
        private static final String SOURCE_ID = "sourceID";
        private static final String STATUS = "status";
        private static final String STATUS_SUCCESS = "SUCCESS";
        public static final int TIMEOUT_MILLISECONDS = 30000;
        private static final String VERSION = "version";
        private String mProtocol = WandWebSocket.WEBSOCKET_PROTOCOL;
        private String mVersion = null;
        private String mSourceID = null;
        private String mDestinationID = null;
        private String mPublisher = null;
        private String mApplicationURL = null;

        public String getProtocol() {
            return this.mProtocol;
        }

        public String getVersion() {
            return this.mVersion;
        }

        public String getSourceID() {
            return this.mSourceID;
        }

        public String getDestinationID() {
            return this.mDestinationID;
        }

        public String getPublisher() {
            return this.mPublisher;
        }

        public String getApplicationURL() {
            return this.mApplicationURL;
        }

        private Handshake() {
        }

        public static Handshake parse(String str) throws Exception {
            JSONObject jSONObject = new JSONObject(str);
            Handshake handshake = new Handshake();
            handshake.mProtocol = jSONObject.getString(PROTOCOL);
            handshake.mVersion = jSONObject.getString(VERSION);
            handshake.mSourceID = jSONObject.getString(SOURCE_ID);
            handshake.mDestinationID = jSONObject.getString(DESTINATION_ID);
            if (jSONObject.has(PUBLISHER)) {
                handshake.mPublisher = jSONObject.getString(PUBLISHER);
            }
            if (jSONObject.has(APPLICATION_URL)) {
                handshake.mApplicationURL = jSONObject.getString(APPLICATION_URL);
            }
            return handshake;
        }

        public String getSuccessResponse(String str) throws Exception {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PROTOCOL, WandWebSocket.WEBSOCKET_PROTOCOL);
            jSONObject.put(VERSION, this.mVersion);
            jSONObject.put(SOURCE_ID, str);
            jSONObject.put(DESTINATION_ID, this.mSourceID);
            jSONObject.put("status", STATUS_SUCCESS);
            if (Version.isGreaterThanEqualTo(this.mVersion, "1.1.0")) {
                jSONObject.put(PUBLISHER, this.mPublisher);
                jSONObject.put(APPLICATION_URL, this.mApplicationURL);
            }
            return jSONObject.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class WandSocketServer extends WebSocketServer {
        private boolean mHasStartedServer;

        public WandSocketServer(InetSocketAddress inetSocketAddress) throws UnknownHostException {
            super(inetSocketAddress);
            this.mHasStartedServer = false;
        }

        public void start() {
            if (this.mHasStartedServer) {
                return;
            }
            super.start();
            this.mHasStartedServer = true;
        }

        public void stop() throws IOException, InterruptedException {
            if (this.mHasStartedServer) {
                try {
                    super.stop();
                } catch (CancelledKeyException unused) {
                }
                this.mHasStartedServer = false;
                if (WandWebSocket.this.mWandSocketServer != null) {
                    if (WandWebSocket.this.mConnection != null) {
                        WandWebSocket.this.forceCloseConnection();
                    }
                    WandWebSocket.this.mWandSocketServer = null;
                    try {
                        WandWebSocket.this.startSocketServer();
                    } catch (Exception unused2) {
                    }
                }
            }
        }

        public void onOpen(WebSocket webSocket, ClientHandshake clientHandshake) {
            synchronized ("OPEN_SYNCHRONIZER") {
                if (WandWebSocket.this.mAllowIncomingConnection && WandWebSocket.this.mConnection == null) {
                    WandWebSocket.this.mConnection = webSocket;
                    scheduleHandshakeTimer();
                    return;
                }
                webSocket.close((int) PointerIconCompat.TYPE_HELP, "AIR Gamepad is already connected");
            }
        }

        private void scheduleHandshakeTimer() {
            try {
                WandWebSocket.this.mHandshakeTimer.schedule(new TimerTask() { // from class: com.adobe.air.wand.connection.WandWebSocket.WandSocketServer.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        synchronized ("OPEN_SYNCHRONIZER") {
                            if (WandWebSocket.this.mConnection == null) {
                                return;
                            }
                            synchronized ("HANDSHAKE_SYNCHRONIZER") {
                                if (WandWebSocket.this.mHandshake != null) {
                                    return;
                                }
                                WandWebSocket.this.mConnection.close((int) PointerIconCompat.TYPE_HELP, "AIR Gamepad handshake timedout");
                            }
                        }
                    }
                }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
            } catch (Exception unused) {
            }
        }

        public void onClose(WebSocket webSocket, int i, String str, boolean z) {
            synchronized ("OPEN_SYNCHRONIZER") {
                if (WandWebSocket.this.mConnection == webSocket) {
                    WandWebSocket.this.mConnection = null;
                    synchronized ("HANDSHAKE_SYNCHRONIZER") {
                        if (WandWebSocket.this.mHandshake != null) {
                            WandWebSocket.this.mHandshake = null;
                            if (WandWebSocket.this.mConnectionListener != null) {
                                WandWebSocket.this.mConnectionListener.onConnectionClose();
                            }
                        }
                    }
                }
            }
        }

        public void onMessage(WebSocket webSocket, String str) {
            Handshake handshake;
            synchronized ("OPEN_SYNCHRONIZER") {
                if (webSocket != WandWebSocket.this.mConnection) {
                    return;
                }
                synchronized ("HANDSHAKE_SYNCHRONIZER") {
                    if (WandWebSocket.this.mHandshake != null) {
                        if (str.equals("NO_OP")) {
                            return;
                        }
                        if (WandWebSocket.this.mConnectionListener != null) {
                            WandWebSocket.this.mConnectionListener.onReceive(str);
                        }
                        return;
                    }
                    String str2 = "";
                    try {
                        try {
                            handshake = Handshake.parse(str);
                            WandWebSocket.this.validateHandshake(handshake);
                        } catch (Exception e) {
                            str2 = e.getMessage();
                            handshake = null;
                        }
                        if (handshake != null) {
                            WandWebSocket.this.mHandshake = handshake;
                            try {
                                if (WandWebSocket.this.mConnectionListener != null) {
                                    WandWebSocket.this.mConnectionListener.onConnectionOpen(handshake.getVersion());
                                }
                            } catch (Exception unused) {
                                WandWebSocket.this.mHandshake = null;
                            }
                            return;
                        }
                        webSocket.close((int) PointerIconCompat.TYPE_HELP, "Invalid AIR Gamepad handshake : " + str2);
                    } catch (Exception unused2) {
                        throw new Exception("Unable to parse the handshake");
                    }
                }
            }
        }

        public void onError(WebSocket webSocket, Exception exc) {
            if (WandWebSocket.this.mConnection == null || WandWebSocket.this.mConnection == webSocket || webSocket == null) {
                return;
            }
            try {
                webSocket.close((int) PointerIconCompat.TYPE_HELP, "AIR Gamepad is already connected");
            } catch (Exception unused) {
            }
        }
    }

    public WandWebSocket(Activity activity) throws UnknownHostException {
        this.mHandshakeTimer = null;
        this.mActivity = activity;
        this.mHandshakeTimer = new Timer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSocketServer() throws Exception {
        if (this.mWandSocketServer == null) {
            WandSocketServer wandSocketServer = new WandSocketServer(new InetSocketAddress(getLocalIpAddress(), getPreferredPort()));
            this.mWandSocketServer = wandSocketServer;
            wandSocketServer.start();
        }
    }

    private void stopSocketServer() {
        WandSocketServer wandSocketServer = this.mWandSocketServer;
        this.mWandSocketServer = null;
        if (wandSocketServer != null) {
            try {
                wandSocketServer.stop();
            } catch (Exception unused) {
            }
        }
    }

    private String constructLocalID() throws Exception {
        InetAddress localIpAddress = getLocalIpAddress();
        if (localIpAddress == null) {
            return null;
        }
        byte[] address = localIpAddress.getAddress();
        return Long.toString((getUnsignedByte(address[3]) * 1) + (getUnsignedByte(address[2]) * 256) + (getUnsignedByte(address[1]) * PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) + (getUnsignedByte(address[0]) * 16777216), 32).toUpperCase();
    }

    @Override // com.adobe.air.wand.connection.Connection
    public void connect() throws Exception {
        if (this.mIsDisposed) {
            throw new Exception("Connection has been disposed");
        }
        if (this.mAllowIncomingConnection) {
            throw new Exception("Connection is already established");
        }
        this.mAllowIncomingConnection = true;
        if (this.mWandSocketServer == null) {
            startSocketServer();
        }
        String constructLocalID = constructLocalID();
        this.mLocalID = constructLocalID;
        this.mConnectionToken = constructLocalID;
        Connection.Listener listener = this.mConnectionListener;
        if (listener != null) {
            listener.updateConnectionToken(getConnectionToken());
        }
        Connection.Listener listener2 = this.mConnectionListener;
        if (listener2 != null) {
            listener2.onConnectSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void forceCloseConnection() {
        WebSocket webSocket = this.mConnection;
        this.mWandSocketServer.onClose(webSocket, PointerIconCompat.TYPE_CONTEXT_MENU, "AIR Gamepad has closed", false);
        webSocket.close((int) PointerIconCompat.TYPE_CONTEXT_MENU, "AIR Gamepad has closed");
    }

    @Override // com.adobe.air.wand.connection.Connection
    public void disconnect() throws Exception {
        if (this.mIsDisposed) {
            throw new Exception("Connection has been disposed");
        }
        if (!this.mAllowIncomingConnection) {
            throw new Exception("Connection is not established");
        }
        if (this.mConnection != null) {
            forceCloseConnection();
        }
        stopSocketServer();
        this.mAllowIncomingConnection = false;
        Connection.Listener listener = this.mConnectionListener;
        if (listener != null) {
            listener.onDisconnectSuccess();
        }
    }

    @Override // com.adobe.air.wand.connection.Connection
    public String getConnectionToken() throws Exception {
        if (this.mIsDisposed) {
            throw new Exception("Connection has been disposed");
        }
        if (!this.mAllowIncomingConnection) {
            throw new Exception("Connection is not established");
        }
        String str = this.mConnectionToken;
        return str == null ? "" : str;
    }

    @Override // com.adobe.air.wand.connection.Connection
    public void registerListener(Connection.Listener listener) throws Exception {
        if (this.mIsDisposed) {
            throw new Exception("Connection has been disposed");
        }
        if (listener == null) {
            throw new Exception("Invalid Connection.Listener");
        }
        if (this.mConnectionListener != null) {
            throw new Exception("A listener is already registered");
        }
        this.mConnectionListener = listener;
    }

    @Override // com.adobe.air.wand.connection.Connection
    public void unregisterListener() {
        this.mConnectionListener = null;
    }

    @Override // com.adobe.air.wand.connection.Connection
    public void send(String str) throws Exception {
        if (this.mIsDisposed) {
            throw new Exception("Connection has been disposed");
        }
        WebSocket webSocket = this.mConnection;
        if (webSocket != null) {
            webSocket.send(str);
        }
    }

    private InetAddress getWiFiIpAddress() throws UnknownHostException {
        WifiInfo connectionInfo;
        int ipAddress;
        WifiManager wifiManager = (WifiManager) this.mActivity.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null || (ipAddress = connectionInfo.getIpAddress()) == 0) {
            return null;
        }
        return InetAddress.getByName(String.format("%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255)));
    }

    private InetAddress getWiFiHotspotIpAddress() throws UnknownHostException, SocketException {
        WifiManager wifiManager;
        Method[] declaredMethods;
        WifiInfo connectionInfo;
        boolean z;
        if (((ConnectivityManager) this.mActivity.getSystemService("connectivity")) == null || (wifiManager = (WifiManager) this.mActivity.getApplicationContext().getSystemService("wifi")) == null) {
            return null;
        }
        boolean z2 = false;
        for (Method method : wifiManager.getClass().getDeclaredMethods()) {
            if (method.getName().equals("isWifiApEnabled")) {
                try {
                    if (((Boolean) method.invoke(wifiManager, new Object[0])).booleanValue()) {
                        z2 = true;
                    }
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                }
            }
        }
        if (z2 && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
            String lowerCase = connectionInfo.getMacAddress().toLowerCase();
            byte[] bArr = new byte[6];
            if (lowerCase.indexOf(":") == -1 && lowerCase.length() == 12) {
                for (int i = 0; i < 6; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) Integer.parseInt(lowerCase.substring(i2, i2 + 2), 16);
                }
            } else {
                String[] split = lowerCase.split(":");
                for (int i3 = 0; i3 < 6 && i3 < split.length; i3++) {
                    bArr[i3] = (byte) Integer.parseInt(split[i3], 16);
                }
            }
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (!nextElement2.isLoopbackAddress() && InetAddressUtils.isIPv4Address(nextElement2.getHostAddress())) {
                        try {
                            byte[] hardwareAddress = nextElement.getHardwareAddress();
                            if (hardwareAddress != null && hardwareAddress.length == 6) {
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= hardwareAddress.length) {
                                        z = true;
                                        break;
                                    } else if (hardwareAddress[i4] != bArr[i4]) {
                                        z = false;
                                        break;
                                    } else {
                                        i4++;
                                    }
                                }
                                if (z) {
                                    return nextElement2;
                                }
                            }
                        } catch (SocketException unused2) {
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    private InetAddress getLocalIpAddress() {
        try {
            InetAddress wiFiIpAddress = getWiFiIpAddress();
            return wiFiIpAddress == null ? getWiFiHotspotIpAddress() : wiFiIpAddress;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void validateHandshake(Handshake handshake) throws Exception {
        if (handshake == null) {
            throw new Exception("Handshake is null");
        }
        String version = handshake.getVersion();
        if (!Pattern.matches("\\d+\\.\\d+\\.\\d+", version)) {
            throw new Exception("Invalid version format");
        }
        if (Version.isGreaterThan(version, "1.1.0") || !Version.isGreaterThanEqualTo(version, Version.V1_0_0)) {
            throw new Exception("Unsupported version");
        }
        if (!WEBSOCKET_PROTOCOL.equals(handshake.getProtocol())) {
            throw new Exception("Invalid protocol");
        }
        if (!this.mLocalID.equals(handshake.getDestinationID())) {
            throw new Exception("Invalid destinationID");
        }
        if (Version.isGreaterThanEqualTo(version, "1.1.0")) {
            if (handshake.getPublisher() == null) {
                throw new Exception("Invalid publisher");
            }
            String applicationURL = handshake.getApplicationURL();
            if (applicationURL == null) {
                throw new Exception("Invalid applicationURL");
            }
            try {
                new URL(applicationURL);
            } catch (Exception unused) {
                throw new Exception("Invalid applicationURL");
            }
        }
    }

    @Override // com.adobe.air.wand.connection.Connection
    public void onConnectionChanged() {
        if (!this.mIsDisposed && this.mAllowIncomingConnection) {
            try {
                String constructLocalID = constructLocalID();
                String str = this.mLocalID;
                if (str == null && constructLocalID == null) {
                    return;
                }
                if (str == null || constructLocalID == null || !str.equals(constructLocalID)) {
                    disconnect();
                    connect();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class ConnectPingTask extends AsyncTask<String, Integer, Long> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Long l) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onProgressUpdate(Integer... numArr) {
        }

        private ConnectPingTask() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Long doInBackground(String... strArr) {
            if (strArr == null || strArr.length < 1) {
                return 0L;
            }
            try {
                new DefaultHttpClient().execute(new HttpGet(strArr[0]));
                return 0L;
            } catch (Exception unused) {
                return -1L;
            }
        }
    }

    private void pingServerOnConnect(String str, String str2) throws Exception {
        if (str == null || str2 == null) {
            new ConnectPingTask().execute(CONNECT_PING_URL);
            return;
        }
        ConnectPingTask connectPingTask = new ConnectPingTask();
        connectPingTask.execute("http://dh8vjmvwgc27o.cloudfront.net/AIRGamepad/connect_ping.txt?publisher=" + URLEncoder.encode(str, "UTF-8") + "&applicationURL=" + URLEncoder.encode(str2, "UTF-8"));
    }

    @Override // com.adobe.air.wand.connection.Connection
    public void onReadyForConnection() throws Exception {
        String str;
        Handshake handshake = this.mHandshake;
        if (handshake == null || (str = this.mLocalID) == null) {
            throw new Exception("Invalid state at onReadyForConnection callback.");
        }
        this.mConnection.send(handshake.getSuccessResponse(str));
        pingServerOnConnect(this.mHandshake.mPublisher, this.mHandshake.mApplicationURL);
    }

    public void dispose() throws Exception {
        if (this.mIsDisposed) {
            return;
        }
        this.mIsDisposed = true;
        if (this.mAllowIncomingConnection) {
            disconnect();
        }
        unregisterListener();
        WebSocket webSocket = this.mConnection;
        if (webSocket != null) {
            webSocket.close((int) PointerIconCompat.TYPE_CONTEXT_MENU, "AIR Gamepad has closed");
        }
        this.mConnection = null;
        this.mHandshake = null;
        Timer timer = this.mHandshakeTimer;
        if (timer != null) {
            timer.cancel();
            this.mHandshakeTimer.purge();
        }
        this.mHandshakeTimer = null;
        this.mWandSocketServer = null;
        this.mActivity = null;
    }
}
