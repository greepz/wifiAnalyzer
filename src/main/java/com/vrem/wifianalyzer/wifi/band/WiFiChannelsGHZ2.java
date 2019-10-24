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

package com.vrem.wifianalyzer.wifi.band;

import org.springframework.data.util.Pair;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;




class WiFiChannelsGHZ2 extends WiFiChannels {
    private static final Pair<Integer, Integer> RANGE = Pair.of(2400, 2499);
    private static final List<Pair<WiFiChannel, WiFiChannel>> SETS = Arrays.asList(
        Pair.of(new WiFiChannel(1, 2412), new WiFiChannel(13, 2472)),
        Pair.of(new WiFiChannel(14, 2484), new WiFiChannel(14, 2484)));
    private static final Pair<WiFiChannel, WiFiChannel> SET = Pair.of(SETS.get(0).getFirst(), SETS.get(SETS.size() - 1).getSecond());

    WiFiChannelsGHZ2() {
        super(RANGE, SETS);
    }

    @Override

    public List<Pair<WiFiChannel, WiFiChannel>> getWiFiChannelPairs() {
        return Collections.singletonList(SET);
    }

    @Override

    public Pair<WiFiChannel, WiFiChannel> getWiFiChannelPairFirst(String countryCode) {
        return SET;
    }

    @Override

    public List<WiFiChannel> getAvailableChannels(String countryCode) {
        return getAvailableChannels(WiFiChannelCountry.get(countryCode).getChannelsGHZ2());
    }

    @Override
    public boolean isChannelAvailable(String countryCode, int channel) {
        return WiFiChannelCountry.get(countryCode).isChannelAvailableGHZ2(channel);
    }

    @Override

    public WiFiChannel getWiFiChannelByFrequency(int frequency,  Pair<WiFiChannel, WiFiChannel> wiFiChannelPair) {
        return isInRange(frequency) ? getWiFiChannel(frequency, SET) : WiFiChannel.UNKNOWN;
    }

}

