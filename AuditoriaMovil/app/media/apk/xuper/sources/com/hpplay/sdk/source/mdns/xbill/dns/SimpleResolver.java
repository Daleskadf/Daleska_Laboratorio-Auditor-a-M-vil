package com.hpplay.sdk.source.mdns.xbill.dns;

import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.List;
/* loaded from: classes3.dex */
public class SimpleResolver implements Resolver {
    private static String defaultResolver = "localhost";
    private static int uniqueID;
    private InetSocketAddress address;
    private boolean ignoreTruncation;
    private InetSocketAddress localAddress;
    private OPTRecord queryOPT;
    private long timeoutValue;
    private TSIG tsig;
    private boolean useTCP;

    public SimpleResolver(String str) {
        InetAddress byName;
        this.timeoutValue = NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS;
        if (str == null && (str = ResolverConfig.getCurrentConfig().server()) == null) {
            str = defaultResolver;
        }
        if (str.equals("0")) {
            byName = InetAddress.getLocalHost();
        } else {
            byName = InetAddress.getByName(str);
        }
        this.address = new InetSocketAddress(byName, 53);
    }

    private void applyEDNS(Message message) {
        if (this.queryOPT != null && message.getOPT() == null) {
            message.addRecord(this.queryOPT, 3);
        }
    }

    private int maxUDPSize(Message message) {
        OPTRecord opt = message.getOPT();
        if (opt == null) {
            return 512;
        }
        return opt.getPayloadSize();
    }

    private Message parseMessage(byte[] bArr) {
        try {
            return new Message(bArr);
        } catch (IOException e10) {
            if (Options.check("verbose")) {
                e10.printStackTrace();
            }
            throw new Exception("Error parsing message");
        }
    }

    private Message sendAXFR(Message message) {
        ZoneTransferIn newAXFR = ZoneTransferIn.newAXFR(message.getQuestion().getName(), this.address, this.tsig);
        newAXFR.setTimeout((int) (getTimeout() / 1000));
        newAXFR.setLocalAddress(this.localAddress);
        try {
            newAXFR.run();
            List<Record> axfr = newAXFR.getAXFR();
            Message message2 = new Message(message.getHeader().getID());
            message2.getHeader().setFlag(5);
            message2.getHeader().setFlag(0);
            message2.addRecord(message.getQuestion(), 0);
            for (Record record : axfr) {
                message2.addRecord(record, 1);
            }
            return message2;
        } catch (Exception e10) {
            throw new Exception(e10.getMessage());
        }
    }

    private void verifyTSIG(Message message, Message message2, byte[] bArr, TSIG tsig) {
        if (tsig != null) {
            int verify = tsig.verify(message2, bArr, message.getTSIG());
            if (Options.check("verbose")) {
                PrintStream printStream = System.err;
                printStream.println("TSIG verify: " + Rcode.TSIGstring(verify));
            }
        }
    }

    public InetSocketAddress getAddress() {
        return this.address;
    }

    public long getTimeout() {
        return this.timeoutValue;
    }

    @Override // com.hpplay.sdk.source.mdns.xbill.dns.Resolver
    public Message send(Message message) {
        boolean z10;
        byte[] sendrecv;
        Record question;
        if (message.getHeader().getOpcode() == 0 && (question = message.getQuestion()) != null && question.getType() == 252) {
            return sendAXFR(message);
        }
        Message message2 = (Message) message.clone();
        applyEDNS(message2);
        TSIG tsig = this.tsig;
        if (tsig != null) {
            tsig.apply(message2, null);
        }
        byte[] wire = message2.toWire(Message.MAXLENGTH);
        int maxUDPSize = maxUDPSize(message2);
        long currentTimeMillis = System.currentTimeMillis() + this.timeoutValue;
        boolean z11 = false;
        while (true) {
            if (!this.useTCP && wire.length <= maxUDPSize) {
                z10 = z11;
            } else {
                z10 = true;
            }
            if (z10) {
                sendrecv = TCPClient.sendrecv(this.localAddress, this.address, wire, currentTimeMillis);
            } else {
                sendrecv = UDPClient.sendrecv(this.localAddress, this.address, wire, maxUDPSize, currentTimeMillis);
            }
            if (sendrecv.length >= 12) {
                int i10 = ((sendrecv[0] & UnsignedBytes.MAX_VALUE) << 8) + (sendrecv[1] & UnsignedBytes.MAX_VALUE);
                int id = message2.getHeader().getID();
                if (i10 == id) {
                    Message parseMessage = parseMessage(sendrecv);
                    verifyTSIG(message2, parseMessage, sendrecv, this.tsig);
                    if (z10 || this.ignoreTruncation || !parseMessage.getHeader().getFlag(6)) {
                        break;
                    }
                    z11 = true;
                } else {
                    String str = "invalid message id: expected " + id + "; got id " + i10;
                    if (!z10) {
                        if (Options.check("verbose")) {
                            System.err.println(str);
                        }
                        z11 = z10;
                    } else {
                        throw new Exception(str);
                    }
                }
            } else {
                throw new Exception("invalid DNS header - too short");
            }
        }
    }

    @Override // com.hpplay.sdk.source.mdns.xbill.dns.Resolver
    public Object sendAsync(Message message, ResolverListener resolverListener) {
        Integer num;
        synchronized (this) {
            int i10 = uniqueID;
            uniqueID = i10 + 1;
            num = new Integer(i10);
        }
        Record question = message.getQuestion();
        if (question != null) {
            question.getName().toString();
        }
        return num;
    }

    public void setAddress(InetSocketAddress inetSocketAddress) {
        this.address = inetSocketAddress;
    }

    @Override // com.hpplay.sdk.source.mdns.xbill.dns.Resolver
    public void setEDNS(int i10, int i11, int i12, List list) {
        if (i10 != 0 && i10 != -1) {
            throw new IllegalArgumentException("invalid EDNS level - must be 0 or -1");
        }
        this.queryOPT = new OPTRecord(i11 == 0 ? 1280 : i11, 0, i10, i12, list);
    }

    @Override // com.hpplay.sdk.source.mdns.xbill.dns.Resolver
    public void setIgnoreTruncation(boolean z10) {
        this.ignoreTruncation = z10;
    }

    @Override // com.hpplay.sdk.source.mdns.xbill.dns.Resolver
    public void setPort(int i10) {
        this.address = new InetSocketAddress(this.address.getAddress(), i10);
    }

    @Override // com.hpplay.sdk.source.mdns.xbill.dns.Resolver
    public void setTCP(boolean z10) {
        this.useTCP = z10;
    }

    @Override // com.hpplay.sdk.source.mdns.xbill.dns.Resolver
    public void setTSIGKey(TSIG tsig) {
        this.tsig = tsig;
    }

    @Override // com.hpplay.sdk.source.mdns.xbill.dns.Resolver
    public void setTimeout(int i10, int i11) {
        this.timeoutValue = (i10 * 1000) + i11;
    }

    public void setAddress(InetAddress inetAddress) {
        this.address = new InetSocketAddress(inetAddress, this.address.getPort());
    }

    @Override // com.hpplay.sdk.source.mdns.xbill.dns.Resolver
    public void setTimeout(int i10) {
        setTimeout(i10, 0);
    }

    @Override // com.hpplay.sdk.source.mdns.xbill.dns.Resolver
    public void setEDNS(int i10) {
        setEDNS(i10, 0, 0, null);
    }

    public SimpleResolver() {
        this(null);
    }
}
