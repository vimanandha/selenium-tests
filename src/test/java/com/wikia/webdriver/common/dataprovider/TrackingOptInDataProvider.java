package com.wikia.webdriver.common.dataprovider;

import org.testng.annotations.DataProvider;

import java.util.Arrays;

public class TrackingOptInDataProvider {

  public static final String ADS_KIKIMORA_PATTERN = "https?://.*beacon\\.wikia-services\\.com/__track/special/adeng.*";
  public static final String ADS_KRUX_PATTERN = "https?://.*cdn\\.krxd\\.net.*";

  public static final String[] ADS_INSTANT_GLOBALS = {
          "wgAdDriverKikimoraTrackingCountries",
          "wgAdDriverKikimoraViewabilityTrackingCountries",
          "wgAdDriverKikimoraPlayerTrackingCountries",
          "wgAdDriverKruxCountries"
  };

  @DataProvider
  public static Object[][] GDPRcountries() {
    return new Object[][]{
        {"NA", "ai", true}, // Anguilla
        {"NA", "aw", true}, // Aruba
        {"EU", "ax", true}, // Åland Islands
        {"EU", "at", true}, // Austria
        {"EU", "be", true}, // Belgium
        {"EU", "bg", true}, // Bulgaria
        {"NA", "bm", true}, // Bermuda
        {"NA", "vg", true}, // British Virgin Islands
        {"NA", "bq", true}, // Bonaire
        {"NA", "ky", true}, // Cayman Islands
        {"EU", "hr", true}, // Croatia
        {"NA", "cw", true}, // Curaçao
        {"AS", "cy", true}, // Cyprus
        {"EU", "cz", true}, // Czech Republic
        {"EU", "dk", true}, // Denmark
        {"EU", "ee", true}, // Estonia
        {"SA", "fk", true}, // Falkland Islands
        {"EU", "fo", true}, // Faroe Islands
        {"EU", "fi", true}, // Finland
        {"EU", "fr", true}, // France
        {"SA", "gf", true}, // French Guiana
        {"OC", "pf", true}, // French Polynesia
        {"AN", "tf", true}, // French Southern and Antarctic Lands
        {"EU", "de", true}, // Germany
        {"EU", "gi", true}, // Gibraltar
        {"EU", "gr", true}, // Greece
        {"NA", "gl", true}, // Greenland
        {"NA", "gp", true}, // Guadeloupe
        {"EU", "hu", true}, // Hungary
        {"EU", "is", true}, // Iceland
        {"EU", "ie", true}, // Ireland
        {"EU", "im", true}, // Isle of Man
        {"EU", "it", true}, // Italy
        {"AF", "re", true}, // La Réunion
        {"EU", "lv", true}, // Latvia
        {"EU", "li", true}, // Liechtenstein
        {"EU", "lt", true}, // Lithuania
        {"EU", "lu", true}, // Luxembourg
        {"NA", "mq", true}, // Martinique
        {"EU", "mt", true}, // Malta
        {"AF", "yt", true}, // Mayotte
        {"NA", "ms", true}, // Montserrat
        {"EU", "nl", true}, // Netherlands
        {"OC", "nc", true}, // New Caledonia
        {"EU", "no", true}, // Norway
        {"OC", "pn", true}, // Pitcairn Islands
        {"EU", "pl", true}, // Poland
        {"EU", "pt", true}, // Portugal
        {"EU", "ro", true}, // Romania
        {"NA", "bl", true}, // Saint Barthélemy
        {"AF", "sh", true}, // Saint Helena
        {"NA", "mf", true}, // Saint Martin
        {"NA", "pm", true}, // Saint-Pierre-et-Miquelon
        {"NA", "bq", true}, // Sint Eustatius
        {"NA", "sx", true}, // Sint Maarten
        {"EU", "sk", true}, // Slovakia
        {"EU", "si", true}, // Slovenia
        {"EU", "es", true}, // Spain
        {"EU", "se", true}, // Sweden
        {"EU", "ch", true}, // Switzerland
        {"NA", "tc", true}, // Turks and Caicos Islands
        {"EU", "gb", true}, // United Kingdom of Great Britain and Northern Ireland
        {"EU", "uk", true}, // United Kingdom of Great Britain and Northern Ireland
        {"OC", "wf", true}, // Wallis-et-Futuna

        {"NA", "US", false}, // USA
        {"AS", "JP", false}, // Japan
        {"OC", "AU", false}, // Australia
        {"AS", "CN", false}, // China
    };
  }


  @DataProvider
  public static Object[][] adsDataProvider() {
    return new Object[][]{
            {
                    ADS_INSTANT_GLOBALS,
                    Arrays.asList(
                            ADS_KIKIMORA_PATTERN,
                            ADS_KRUX_PATTERN
                    )
            }
    };
  }
}
