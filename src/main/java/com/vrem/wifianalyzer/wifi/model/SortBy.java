/*
 * WiFiAnalyzer
 * Copyright (C) 2019  VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.vrem.wifianalyzer.wifi.model;

import org.apache.commons.lang3.builder.CompareToBuilder;

import java.util.Comparator;
import java.util.Locale;



public enum SortBy {
    STRENGTH(new StrengthComparator()),
    SSID(new SSIDComparator()),
    CHANNEL(new ChannelComparator());

    private final Comparator<WiFiDetail> comparator;

    SortBy( Comparator<WiFiDetail> comparator) {
        this.comparator = comparator;
    }


    Comparator<WiFiDetail> comparator() {
        return comparator;
    }

    static class StrengthComparator implements Comparator<WiFiDetail> {
        @Override
        public int compare(WiFiDetail lhs, WiFiDetail rhs) {
            Locale locale = Locale.getDefault();
            return new CompareToBuilder()
                .append(rhs.getWiFiSignal().getLevel(), lhs.getWiFiSignal().getLevel())
                .append(lhs.getSSID().toUpperCase(locale), rhs.getSSID().toUpperCase(locale))
                .append(lhs.getBSSID().toUpperCase(locale), rhs.getBSSID().toUpperCase(locale))
                .toComparison();
        }
    }


    static class SSIDComparator implements Comparator<WiFiDetail> {
        @Override
        public int compare(WiFiDetail lhs, WiFiDetail rhs) {
            Locale locale = Locale.getDefault();
            return new CompareToBuilder()
                .append(lhs.getSSID().toUpperCase(locale), rhs.getSSID().toUpperCase(locale))
                .append(rhs.getWiFiSignal().getLevel(), lhs.getWiFiSignal().getLevel())
                .append(lhs.getBSSID().toUpperCase(locale), rhs.getBSSID().toUpperCase(locale))
                .toComparison();
        }
    }

    static class ChannelComparator implements Comparator<WiFiDetail> {
        @Override
        public int compare(WiFiDetail lhs, WiFiDetail rhs) {
            Locale locale = Locale.getDefault();
            return new CompareToBuilder()
                .append(lhs.getWiFiSignal().getPrimaryWiFiChannel().getChannel(), rhs.getWiFiSignal().getPrimaryWiFiChannel().getChannel())
                .append(rhs.getWiFiSignal().getLevel(), lhs.getWiFiSignal().getLevel())
                .append(lhs.getSSID().toUpperCase(locale), rhs.getSSID().toUpperCase(locale))
                .append(lhs.getBSSID().toUpperCase(locale), rhs.getBSSID().toUpperCase(locale))
                .toComparison();
        }
    }

}
