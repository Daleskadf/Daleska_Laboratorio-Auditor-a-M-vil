package c6;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class E1 {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f8444d = Logger.getLogger(E1.class.getName());

    /* renamed from: e  reason: collision with root package name */
    public static final q2 f8445e = new q2(14);
    public static final C0665f0 f = new C0665f0(1);

    /* renamed from: a  reason: collision with root package name */
    public final C0665f0 f8446a;

    /* renamed from: b  reason: collision with root package name */
    public final q2 f8447b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f8448c;

    public E1() {
        int i7;
        String str = System.getenv("GRPC_PROXY_EXP");
        C0665f0 c0665f0 = f;
        c0665f0.getClass();
        this.f8446a = c0665f0;
        q2 q2Var = f8445e;
        q2Var.getClass();
        this.f8447b = q2Var;
        if (str != null) {
            String[] split = str.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, 2);
            if (split.length > 1) {
                i7 = Integer.parseInt(split[1]);
            } else {
                i7 = 80;
            }
            f8444d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
            this.f8448c = new InetSocketAddress(split[0], i7);
            return;
        }
        this.f8448c = null;
    }

    public final a6.B a(InetSocketAddress inetSocketAddress) {
        URL url;
        a6.B b5;
        String str = null;
        if (!(inetSocketAddress instanceof InetSocketAddress)) {
            return null;
        }
        InetSocketAddress inetSocketAddress2 = this.f8448c;
        if (inetSocketAddress2 != null) {
            int i7 = a6.B.f7064e;
            G.i.j(inetSocketAddress, "targetAddress");
            return new a6.B(inetSocketAddress2, inetSocketAddress, null, null);
        }
        Logger logger = f8444d;
        try {
            try {
                URI uri = new URI("https", null, AbstractC0671h0.d(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                this.f8446a.getClass();
                ProxySelector proxySelector = ProxySelector.getDefault();
                if (proxySelector == null) {
                    logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    logger.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                String d7 = AbstractC0671h0.d(inetSocketAddress3);
                InetAddress address = inetSocketAddress3.getAddress();
                int port = inetSocketAddress3.getPort();
                this.f8447b.getClass();
                try {
                    url = new URL("https", d7, port, StringUtils.EMPTY);
                } catch (MalformedURLException unused) {
                    logger.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", d7});
                    url = null;
                }
                PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(d7, address, port, "https", StringUtils.EMPTY, null, url, Authenticator.RequestorType.PROXY);
                if (inetSocketAddress3.isUnresolved()) {
                    inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                }
                int i8 = a6.B.f7064e;
                if (requestPasswordAuthentication == null) {
                    b5 = new a6.B(inetSocketAddress3, inetSocketAddress, null, null);
                } else {
                    String userName = requestPasswordAuthentication.getUserName();
                    if (requestPasswordAuthentication.getPassword() != null) {
                        str = new String(requestPasswordAuthentication.getPassword());
                    }
                    b5 = new a6.B(inetSocketAddress3, inetSocketAddress, userName, str);
                }
                return b5;
            } catch (URISyntaxException e7) {
                logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e7);
                return null;
            }
        } catch (Throwable th) {
            logger.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }
}
