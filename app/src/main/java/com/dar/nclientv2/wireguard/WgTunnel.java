package com.dar.nclientv2.wireguard;

import com.wireguard.android.backend.Tunnel;

public class WgTunnel implements Tunnel {
    @Override
    public String getName() {
        return "wgpreconf1";
    }

    @Override
    public void onStateChange(State newState) {
    }
}
