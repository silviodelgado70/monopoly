package com.jsdm.spark.monopolycurrency;

/**
 * Created by Silvio on 6/5/2016.
 */
public interface OnServerMessageListener {
    void onMessage(ServerMonopolyMessage msg);
}
