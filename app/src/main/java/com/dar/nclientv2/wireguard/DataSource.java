package com.dar.nclientv2.wireguard;

public class DataSource {

    // actual data was removed from JSON for security reasons
    // insert your own data to check connectivity
    private static final String JSON_STRING = "{\"user_info\":{\"username\":\"redacted\",\"password\":\"redacted\",\"vpn-name\":\"redacted\",\"PrivateKey\":\"base64=\",\"Address\":\"10.0.0.2/24\",\"DNS\":\"8.8.8.8\",\"PublicKey\":\"redacted=\",\"AllowedIPs\":\"0.0.0.0/1, 128.0.0.0/1, ::/1, 8000::/1\",\"Endpoint\":\"redacted:51820\",\"status\":\"Active\",\"vpnConnection\":true},\"server_info\":{\"url\":\"10.0.0.1\"}}";

    public static TunnelModel getTunnelModel() {
        return TunnelDecoder.decode(JSON_STRING);
    }

}
