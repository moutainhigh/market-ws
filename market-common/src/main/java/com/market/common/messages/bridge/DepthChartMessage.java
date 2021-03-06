package com.market.common.messages.bridge;


import com.market.common.def.MessageType;

/**
 * @author yjt
 * @since 2020/10/11 12:56
 */
public class DepthChartMessage {
    public static Message<MarketDepthChartSeries> of(MarketDepthChartSeries series) {
        final Message<MarketDepthChartSeries> msg = new Message<>();
        msg.setType(MessageType.DEPTH_CHART);
        msg.setData(series);
        return msg;
    }
}
