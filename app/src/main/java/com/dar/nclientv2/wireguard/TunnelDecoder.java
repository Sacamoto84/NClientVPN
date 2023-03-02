package com.dar.nclientv2.wireguard;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.wireguard.config.InetNetwork;
import com.wireguard.config.ParseException;

public class TunnelDecoder {

    public static TunnelModel decode(String jsonString) {
        Gson gson = new Gson();
        JsonObject json = gson.fromJson(jsonString, JsonObject.class);

        TunnelModel model = new TunnelModel();
        model.privateKey = json.get("user_info").getAsJsonObject().get("PrivateKey").getAsString();
        model.IP = json.get("user_info").getAsJsonObject().get("Address").getAsString();
        model.dns = json.get("user_info").getAsJsonObject().get("DNS").getAsString();
        model.endpoint = json.get("user_info").getAsJsonObject().get("Endpoint").getAsString();
        String allowedIPs[] = json.get("user_info").getAsJsonObject().get("AllowedIPs").getAsString().split(",\\s*");
        for (String ip: allowedIPs) {
            try {
                model.allowedIPs.add(InetNetwork.parse(ip));
            }
            catch (ParseException e) {
                e.printStackTrace();
            }
        }
        model.publicKey = json.get("user_info").getAsJsonObject().get("PublicKey").getAsString();
        model.url = json.get("server_info").getAsJsonObject().get("url").getAsString();

        return model;
    }

}
