package com.theschool.fastinternetspeedchecker.model;

/**
 * The {@code AutomatedInternetSpeedChecker} is the base interface for all automated internet speed checkers.
 * <p>
 * The interface provides two methods {@code getSpeed} and {@code getDetailedSpeedInfo} that return a string representing
 * the internet speed, with an appropriate unit, and detailed speed information, respectively.
 *
 * @author Thomas Munguya.
 */
public interface AutomatedInternetSpeedChecker {
    /**
     * Returns the internet speed as a string with an appropriate unit.
     * @return the speed.
     */
    public String getSpeed();

    /**
     * Returns detailed speed information, including latency, upload speed, etc.
     * @return detailed speed information.
     */
    public DetailedSpeedInfo getDetailedSpeedInfo();
}
