package com.dar.nclientv2.wireguard;

import com.wireguard.config.InetNetwork;

import java.util.ArrayList;
import java.util.Collection;

public class TunnelModel {
    public String privateKey;
    public String IP;
    public String dns;
    public String endpoint;
    public Collection<InetNetwork> allowedIPs = new ArrayList<InetNetwork>();
    public String url;
    public String publicKey;
}
