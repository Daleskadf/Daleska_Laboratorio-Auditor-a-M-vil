package com.hpplay.component.protocol;

import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.hpplay.component.common.ParamsMap;
import com.hpplay.component.common.dlna.IDLNAController;
import com.hpplay.component.common.protocol.ProtocolListener;
import com.hpplay.component.common.utils.CLog;
import com.hpplay.component.common.utils.ModuleIds;
import com.hpplay.component.modulelinker.api.ModuleLinker;
import com.hpplay.component.protocol.encrypt.LelinkEncrypt;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ProtocolSender extends ProtocolCore {
    private static final String CMD_CONNECT = "connect";
    private static final int MAX_RETRY_COUNT = 1;
    private static final String TAG = "ProtocolSender";
    private final ProtocolQueue mProtocolQueues = new ProtocolQueue();
    private int mRetryCount;
    private SocketThread mSocketThread;

    /* loaded from: classes2.dex */
    public class SocketThread extends Thread {
        private LelinkEncrypt lelinkEncrypt;
        private IDLNAController mDlnaController;
        private ModuleLinker mModuleLinker;
        private boolean mStartListen = true;
        private ProtocolListener socketConnectListener;
        private int type;

        public SocketThread(ProtocolListener protocolListener, int i10) {
            this.socketConnectListener = protocolListener;
            this.type = i10;
            setName(ProtocolSender.TAG);
        }

        private void DLNAHandle() {
            try {
                CLog.i(ProtocolSender.TAG, " start DLNA Handle ... ");
                while (this.mStartListen) {
                    try {
                        ProtocolInfo next = ProtocolSender.this.mProtocolQueues.next();
                        if (TextUtils.equals(new String(next.getProtocolData()[0]), "connect")) {
                            this.mStartListen = connectDLNA(next);
                            CLog.i(ProtocolSender.TAG, " connect result " + this.mStartListen);
                        } else {
                            String[] sendAction = this.mDlnaController.sendAction(new String(next.getProtocolData()[0]));
                            if (next.getProtocolListener() != null) {
                                next.getProtocolListener().onResult(next.getProtocolListener().cmdType, sendAction);
                            }
                        }
                    } catch (Exception e10) {
                        CLog.w(ProtocolSender.TAG, e10);
                    }
                }
            } catch (Exception e11) {
                CLog.w(ProtocolSender.TAG, e11);
            }
            CLog.i(ProtocolSender.TAG, "   DLNA Handle exit... ");
            this.mStartListen = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void closeSender() {
            FileOutputStream fileOutputStream = ProtocolSender.this.mLocalFileOutputStream;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e10) {
                    CLog.w(ProtocolSender.TAG, e10);
                }
            }
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = ProtocolSender.this.mLocalAutoCloseInputStream;
            if (autoCloseInputStream != null) {
                try {
                    autoCloseInputStream.close();
                } catch (IOException e11) {
                    CLog.w(ProtocolSender.TAG, e11);
                }
            }
            Socket socket = ProtocolSender.this.mSocket;
            if (socket != null) {
                try {
                    socket.close();
                    CLog.d(ProtocolSender.TAG, ProtocolSender.this.mSocket.isClosed() + "");
                } catch (IOException e12) {
                    CLog.w(ProtocolSender.TAG, e12);
                }
            }
            ProtocolSender protocolSender = ProtocolSender.this;
            protocolSender.mSocket = null;
            protocolSender.mLocalFileOutputStream = null;
            protocolSender.mLocalAutoCloseInputStream = null;
            IDLNAController iDLNAController = this.mDlnaController;
            if (iDLNAController != null) {
                iDLNAController.close();
                this.mDlnaController = null;
            }
            ModuleLinker moduleLinker = this.mModuleLinker;
            if (moduleLinker != null) {
                moduleLinker.removeObjOfMemory(ModuleIds.CLAZZ_ID1184_DLNACONTROLLERIMP);
                this.mModuleLinker = null;
            }
        }

        private boolean connectDLNA(ProtocolInfo protocolInfo) {
            try {
                closeSender();
                ModuleLinker newInstance = ModuleLinker.getNewInstance();
                this.mModuleLinker = newInstance;
                this.mDlnaController = (IDLNAController) newInstance.loadModule(ModuleIds.CLAZZ_ID1184_DLNACONTROLLERIMP);
                String str = new String(protocolInfo.getProtocolData()[1]);
                String str2 = new String(protocolInfo.getProtocolData()[2]);
                IDLNAController iDLNAController = (IDLNAController) this.mModuleLinker.loadModule(ModuleIds.CLAZZ_ID1184_DLNACONTROLLERIMP);
                this.mDlnaController = iDLNAController;
                boolean connect = iDLNAController.connect(str, str2, this.socketConnectListener);
                if (!connect) {
                    ProtocolSender protocolSender = ProtocolSender.this;
                    protocolSender.mErrorCode = ParamsMap.PushParams.PUSH_ERROR_DLNA_GETSERVICE;
                    protocolSender.mErrorMsg = "the DLNA locatio is invalid " + str;
                    protocolInfo.setProtocolListener(this.socketConnectListener);
                    resultCallback(protocolInfo, "failed");
                } else if (connect) {
                    ProtocolListener protocolListener = this.socketConnectListener;
                    protocolListener.onResult(protocolListener.cmdType, "successful");
                }
                return connect;
            } catch (Exception e10) {
                CLog.w(ProtocolSender.TAG, e10);
                return false;
            }
        }

        private boolean connectLelink(ProtocolInfo protocolInfo) {
            Exception exc;
            boolean z10;
            int i10;
            closeSender();
            long currentTimeMillis = System.currentTimeMillis();
            try {
                z10 = ProtocolSender.this.connectServer();
                exc = null;
            } catch (Exception e10) {
                exc = e10;
                CLog.w(ProtocolSender.TAG, exc);
                z10 = false;
            }
            CLog.i(ProtocolSender.TAG, "create local socket " + z10 + "  connected time " + (System.currentTimeMillis() - currentTimeMillis) + "   hashCode " + hashCode());
            if (z10) {
                if (protocolInfo.getProtocolData().length > 1) {
                    String str = new String(protocolInfo.getProtocolData()[1]);
                    String str2 = new String(protocolInfo.getProtocolData()[2]);
                    LelinkEncrypt lelinkEncrypt = new LelinkEncrypt(str);
                    this.lelinkEncrypt = lelinkEncrypt;
                    lelinkEncrypt.setSrpPassword(str2);
                }
                if (this.lelinkEncrypt != null) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    this.mStartListen = ProtocolSender.this.checkEncrypt(this.lelinkEncrypt, ProtocolSender.TAG);
                    CLog.d(ProtocolSender.TAG, (System.currentTimeMillis() - currentTimeMillis2) + "   " + this.mStartListen + " thread name " + Thread.currentThread().getName());
                }
                ProtocolListener protocolListener = this.socketConnectListener;
                if (protocolListener != null) {
                    lelinkConnectStateCallback(this.lelinkEncrypt, protocolListener);
                }
                return true;
            }
            if (exc != null) {
                ProtocolSender protocolSender = ProtocolSender.this;
                if (this.lelinkEncrypt == null) {
                    i10 = ParamsMap.PushParams.PUSH_ERROR_LELINK_V1_CODE;
                } else {
                    i10 = ParamsMap.PushParams.PUSH_ERROR_LELINK_V2_CODE;
                }
                protocolSender.mErrorCode = i10;
                protocolSender.mErrorMsg = CLog.getExceptionStr(exc);
                protocolInfo.setProtocolListener(this.socketConnectListener);
                try {
                    resultCallback(protocolInfo, "failed");
                    return false;
                } catch (Exception e11) {
                    CLog.w(ProtocolSender.TAG, e11);
                }
            }
            ProtocolListener protocolListener2 = this.socketConnectListener;
            if (protocolListener2 != null) {
                protocolListener2.onResult(protocolListener2.cmdType, "failed");
            }
            return false;
        }

        private void lelinkConnectStateCallback(LelinkEncrypt lelinkEncrypt, ProtocolListener protocolListener) {
            if (!this.mStartListen) {
                if (lelinkEncrypt.getEncryptState().equals("failed")) {
                    protocolListener.onResult(protocolListener.cmdType, "encrypt_failed");
                    return;
                } else if (lelinkEncrypt.getEncryptState().equals(ProtocolBuilder.LELINK_AUTH_ERROR)) {
                    protocolListener.onResult(protocolListener.cmdType, ProtocolBuilder.LELINK_AUTH_ERROR);
                    return;
                } else if (lelinkEncrypt.getEncryptState().equals(ProtocolBuilder.LELINK_UNSUPPORT_PREEMPT)) {
                    protocolListener.onResult(protocolListener.cmdType, ProtocolBuilder.LELINK_UNSUPPORT_PREEMPT);
                    return;
                } else {
                    return;
                }
            }
            protocolListener.onResult(protocolListener.cmdType, "successful");
        }

        private void lelinkHandle() {
            String lelinkV1SendData;
            while (this.mStartListen) {
                try {
                    ProtocolInfo next = ProtocolSender.this.mProtocolQueues.next();
                    if (TextUtils.equals(new String(next.getProtocolData()[0]), "connect")) {
                        this.mStartListen = connectLelink(next);
                    } else {
                        LelinkEncrypt lelinkEncrypt = this.lelinkEncrypt;
                        if (lelinkEncrypt != null) {
                            try {
                                lelinkV1SendData = lelinkV2SendData(lelinkEncrypt, next);
                                if (!lelinkV1SendData.equals("failed") || ProtocolSender.this.mRetryCount >= 1) {
                                    ProtocolSender.this.mRetryCount = 0;
                                    resultCallback(next, lelinkV1SendData);
                                } else {
                                    ProtocolSender.access$108(ProtocolSender.this);
                                    ProtocolSender.this.mProtocolQueues.enqueue(next);
                                    CLog.i("IPushHandler", "========RESULT_FAILED========");
                                }
                            } catch (Exception e10) {
                                ProtocolSender protocolSender = ProtocolSender.this;
                                protocolSender.mErrorCode = ParamsMap.PushParams.PUSH_ERROR_LELINK_V2_CODE;
                                protocolSender.mErrorMsg = CLog.getExceptionStr(e10);
                                resultCallback(next, "failed");
                            }
                        } else if (next.getProtocolListener() != null && (next.getProtocolListener() instanceof DataReceiveListener)) {
                            ((DataReceiveListener) next.getProtocolListener()).onDataResult(1, ProtocolSender.this.interactiveDataNoHeader(next.getProtocolData()));
                        } else {
                            try {
                                lelinkV1SendData = lelinkV1SendData(next);
                                resultCallback(next, lelinkV1SendData);
                            } catch (Exception e11) {
                                ProtocolSender.this.mErrorCode = ParamsMap.PushParams.PUSH_ERROR_LELINK_V1_CODE;
                                ProtocolSender.this.mErrorMsg = CLog.getExceptionStr(e11);
                                resultCallback(next, "failed");
                            }
                        }
                    }
                } catch (Exception unused) {
                    CLog.w(ProtocolSender.TAG, "InterruptedException thread exit ...");
                }
            }
            this.mStartListen = false;
        }

        private String lelinkV1SendData(ProtocolInfo protocolInfo) {
            byte[] interactiveData = ProtocolSender.this.interactiveData(protocolInfo.getProtocolData());
            if (interactiveData != null && interactiveData.length != 0) {
                return new String(interactiveData);
            }
            ProtocolSender protocolSender = ProtocolSender.this;
            protocolSender.mErrorCode = ParamsMap.PushParams.PUSH_ERROR_LELINK_V1_CODE;
            protocolSender.mErrorMsg = ProtocolCore.ERR_MSG_DETAIL;
            return "failed";
        }

        private String lelinkV2SendData(LelinkEncrypt lelinkEncrypt, ProtocolInfo protocolInfo) {
            byte[] bArr;
            long currentTimeMillis = System.currentTimeMillis();
            byte[] buildEncryptData = lelinkEncrypt.buildEncryptData(protocolInfo.getProtocolData());
            String str = new String(protocolInfo.getProtocolData()[0]).split("\r\n")[0];
            byte[] bArr2 = null;
            if (buildEncryptData != null) {
                bArr = ProtocolSender.this.interactiveEncryptData(buildEncryptData);
            } else {
                bArr = null;
            }
            if (System.currentTimeMillis() - currentTimeMillis > 1000) {
                CLog.i(ProtocolSender.TAG, "============= timeout===> " + (System.currentTimeMillis() - currentTimeMillis) + " " + str + "  " + hashCode());
            }
            if (bArr != null && bArr.length != 0) {
                try {
                    bArr2 = lelinkEncrypt.decryptData(bArr);
                } catch (Exception e10) {
                    ProtocolSender.this.mErrorCode = ParamsMap.PushParams.PUSH_ERROR_LELINK_V2_CODE;
                    ProtocolSender.this.mErrorMsg = CLog.getExceptionStr(e10);
                    CLog.w(ProtocolSender.TAG, e10);
                }
                if (bArr2 == null) {
                    return "failed";
                }
                return new String(bArr2);
            }
            CLog.i(ProtocolSender.TAG, " request failed  " + (System.currentTimeMillis() - currentTimeMillis) + "====hashCode==== " + hashCode() + "  " + str + "    hashCode  " + hashCode());
            ProtocolSender protocolSender = ProtocolSender.this;
            protocolSender.mErrorCode = ParamsMap.PushParams.PUSH_ERROR_LELINK_V2_CODE;
            protocolSender.mErrorMsg = ProtocolCore.ERR_MSG_DETAIL;
            return "failed";
        }

        private void resultCallback(ProtocolInfo protocolInfo, String str) {
            String jSONObject;
            if (protocolInfo.getProtocolListener() != null) {
                if (protocolInfo.getProtocolListener().cmdType != 1 && (protocolInfo.getProtocolListener().cmdType != 11 || !str.equals("failed"))) {
                    jSONObject = null;
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("errMsg", ProtocolSender.this.mErrorMsg);
                    jSONObject2.put("errCode", ProtocolSender.this.mErrorCode);
                    jSONObject = jSONObject2.toString();
                }
                protocolInfo.getProtocolListener().onResult(protocolInfo.getProtocolListener().cmdType, str, jSONObject);
            }
        }

        public void clearCallbackListener() {
            this.socketConnectListener = null;
            this.mStartListen = false;
            LelinkEncrypt lelinkEncrypt = this.lelinkEncrypt;
            if (lelinkEncrypt != null) {
                lelinkEncrypt.release();
                this.lelinkEncrypt = null;
            }
        }

        public int getType() {
            return this.type;
        }

        public boolean isStartListen() {
            return this.mStartListen;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            CLog.i(ProtocolSender.TAG, "protocol run  ");
            this.mStartListen = true;
            if (3 == this.type) {
                DLNAHandle();
            } else {
                lelinkHandle();
            }
            ProtocolSender.this.release();
        }
    }

    public static /* synthetic */ int access$108(ProtocolSender protocolSender) {
        int i10 = protocolSender.mRetryCount;
        protocolSender.mRetryCount = i10 + 1;
        return i10;
    }

    public boolean isConnect() {
        SocketThread socketThread = this.mSocketThread;
        if (socketThread != null) {
            return socketThread.isStartListen();
        }
        return false;
    }

    public void protocolEnqueue(ProtocolListener protocolListener, byte[]... bArr) {
        ProtocolInfo protocolInfo = new ProtocolInfo();
        protocolInfo.setProtocolData(bArr);
        protocolInfo.setProtocolListener(protocolListener);
        try {
            this.mProtocolQueues.enqueue(protocolInfo);
        } catch (InterruptedException e10) {
            CLog.w(TAG, e10);
        }
    }

    public synchronized void release() {
        long currentTimeMillis = System.currentTimeMillis();
        SocketThread socketThread = this.mSocketThread;
        if (socketThread != null) {
            socketThread.clearCallbackListener();
            this.mSocketThread.interrupt();
            this.mSocketThread.closeSender();
            this.mSocketThread = null;
        }
        this.mProtocolQueues.release();
        CLog.i(TAG, "closeSender  ==== >hashCode " + hashCode() + "   close time " + (System.currentTimeMillis() - currentTimeMillis));
    }

    public void setConnectInfo(String str, int i10) {
        this.mIP = str;
        this.mPort = i10;
    }

    public void startConnect(String str, String str2, int i10, ProtocolListener protocolListener) {
        byte[][] bArr;
        byte[] bytes;
        SocketThread socketThread;
        try {
            if (!isConnect() || ((socketThread = this.mSocketThread) != null && socketThread.getType() != i10)) {
                CLog.i("pushlink", "reconnect    " + this.mProtocolQueues.queueSize());
                release();
                SocketThread socketThread2 = new SocketThread(protocolListener, i10);
                this.mSocketThread = socketThread2;
                socketThread2.start();
            }
            CLog.i("pushlink", "startConnect  type: " + i10 + "   " + this.mProtocolQueues.queueSize());
            ProtocolInfo protocolInfo = new ProtocolInfo();
            if (TextUtils.isEmpty(str)) {
                bArr = new byte[][]{"connect".getBytes()};
            } else {
                bArr = new byte[3];
                bArr[0] = "connect".getBytes();
                bArr[1] = str.getBytes();
                if (str2 == null) {
                    bytes = "".getBytes();
                } else {
                    bytes = str2.getBytes();
                }
                bArr[2] = bytes;
            }
            protocolInfo.setProtocolData(bArr);
            this.mProtocolQueues.enqueue(protocolInfo);
        } catch (Exception e10) {
            CLog.w(TAG, e10);
        }
    }
}
