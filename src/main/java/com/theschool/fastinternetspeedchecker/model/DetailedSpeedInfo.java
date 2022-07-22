package com.theschool.fastinternetspeedchecker.model;

/**
 * The {@code DetailedSpeedInfo} record encapsulates detailed internet speed information as it appears on the
 * <a>fast.com</a> website.
 * <p>
 *  The encapsulated information includes the latency, upload speed, etc.
 *
 * @author Thomas Munguya
 */
public record DetailedSpeedInfo (Latency latency, String client, String server, String uploadSpeed) {
}
