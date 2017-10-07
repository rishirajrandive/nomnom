package com.rishi.nomnom;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rishi.nomnom.network.ApiResponse;

/**
 * Created by rishi on 10/6/17.
 */

public class MockResponseStore {

    public static ApiResponse getMockRestaurants() {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(MockResponseStore.getRestaurantList(), ApiResponse.class);
    }

    public static ApiResponse getMockRestaurantDetails() {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(MockResponseStore.getRestaurantDetail(), ApiResponse.class);
    }

    public static ApiResponse getMockNoResults() {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(MockResponseStore.getNoResultsResponse(), ApiResponse.class);
    }

    public static String getRestaurantList() {
        return "{\n" +
                "    \"html_attributions\": [],\n" +
                "    \"next_page_token\": \"CqQCGwEAAI87gNq3wZ43d_70SVL6S2KwyomUi7ZwRCTTWofU1x-Ys6PcaICqSO2FYGoT1NGtZ3Dn0-De0t8z8FN74oyHX9gA_YNfMmiDoyC6SnHKTe6-eMQJrL_E8H7YdcSyZH3Mco_AtWcAJ1USuhWYwI10rh0vlTYUOE5wu9LDBFTSi639MvZIEp6OCixH_WWx0OWqKtq2st1Z8EB451XE0tluUfmo5yBty2CApztzfWSSUi68bLiboTCVFyqhwHYCV7zg5xCY_Yi_AwG2G9YV6EROcsb4zUKcOw7mEeW8ZQaCf337e3FV_8iWx9S1y7t1zejle8mTLSAiw449Fv2I6rMq3oFcT_aAh36q0SDDipV_9DTFfY9YwVnHoxb73xBswoXG5RIQa0FesftDm3DWCLA7UGojzBoUnqZdtm-0RxSxCmqkGvaii8qWmVU\",\n" +
                "    \"results\": [\n" +
                "        {\n" +
                "            \"geometry\": {\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 37.7736262,\n" +
                "                    \"lng\": -122.421645\n" +
                "                },\n" +
                "                \"viewport\": {\n" +
                "                    \"northeast\": {\n" +
                "                        \"lat\": 37.7749218302915,\n" +
                "                        \"lng\": -122.4202280697085\n" +
                "                    },\n" +
                "                    \"southwest\": {\n" +
                "                        \"lat\": 37.7722238697085,\n" +
                "                        \"lng\": -122.4229260302915\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"icon\": \"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png\",\n" +
                "            \"id\": \"112226e5b074c6d767041d2761863c550d8a5f26\",\n" +
                "            \"name\": \"Zuni Café.\",\n" +
                "            \"opening_hours\": {\n" +
                "                \"open_now\": true,\n" +
                "                \"weekday_text\": []\n" +
                "            },\n" +
                "            \"photos\": [\n" +
                "                {\n" +
                "                    \"height\": 3120,\n" +
                "                    \"html_attributions\": [\n" +
                "                        \"<a href=\\\"https://maps.google.com/maps/contrib/108535967119249136387/photos\\\">Ayres D&#39;Souza</a>\"\n" +
                "                    ],\n" +
                "                    \"photo_reference\": \"CmRaAAAAi8thfGP1CT0-RTWLN-BdOQi91lvoL7cnbwk2PftcnbJLkgHnuayXCs9ddQ-GO69tpWfKlefA8icPJkaoyO1VcIEFddWthBMwHrB_18zp3xVgCe3Qn_bnHK2YoYELSnzkEhBahVYWzXrMSHfyorx1lVJqGhQAHSbKHN_rPotmh0qXeaRsTWd8mA\",\n" +
                "                    \"width\": 4160\n" +
                "                }\n" +
                "            ],\n" +
                "            \"place_id\": \"ChIJO7u9q5-AhYARiSSXyWv9eJ8\",\n" +
                "            \"price_level\": 3,\n" +
                "            \"rating\": 4.1,\n" +
                "            \"reference\": \"CmRSAAAAwD2VHIy2_-CjX5q91oWhiYc2LWPkmVWXY1z1JAMhGOXebiTtzinnAom564e7zlttCMnoeztxR1cYQPJtX0odHcHmTNZBqSj0UAPh2pq7ESrtYIHuvxbHmRKJeiEAkkA-EhAsQeYq0BXlVOtrcuwBQGglGhRr9XGwqj3gJ62rYNeVzePAP9Ge3A\",\n" +
                "            \"scope\": \"GOOGLE\",\n" +
                "            \"types\": [\n" +
                "                \"bar\",\n" +
                "                \"restaurant\",\n" +
                "                \"food\",\n" +
                "                \"point_of_interest\",\n" +
                "                \"establishment\"\n" +
                "            ],\n" +
                "            \"vicinity\": \"1658 Market Street, San Francisco\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"geometry\": {\n" +
                "                \"location\": {\n" +
                "                    \"lat\": 37.7749041,\n" +
                "                    \"lng\": -122.4227357\n" +
                "                },\n" +
                "                \"viewport\": {\n" +
                "                    \"northeast\": {\n" +
                "                        \"lat\": 37.7762618302915,\n" +
                "                        \"lng\": -122.4213196197085\n" +
                "                    },\n" +
                "                    \"southwest\": {\n" +
                "                        \"lat\": 37.7735638697085,\n" +
                "                        \"lng\": -122.4240175802915\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"icon\": \"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png\",\n" +
                "            \"id\": \"2f06454d3f2021df376d7a49c82bbd4298e0694d\",\n" +
                "            \"name\": \"Rich Table\",\n" +
                "            \"opening_hours\": {\n" +
                "                \"open_now\": false,\n" +
                "                \"weekday_text\": []\n" +
                "            },\n" +
                "            \"photos\": [\n" +
                "                {\n" +
                "                    \"height\": 4000,\n" +
                "                    \"html_attributions\": [\n" +
                "                        \"<a href=\\\"https://maps.google.com/maps/contrib/104096781519454808462/photos\\\">Marc Becker</a>\"\n" +
                "                    ],\n" +
                "                    \"photo_reference\": \"CmRaAAAATQzRV8lCYaAfDjRtxvSfELCwdVJO13p-3W6msTK5YVoJ8Wdea1KL_17h2t0zOkx2Wnm73gbxPv5t8TKQSmAxXcBE_XQkfaoQBW898o7C0VAu8gHVRyo1zcvaYjmaLPQqEhDsM1tnqo62iVL-M2Hq_NeRGhRM2HSoRNrN0DkqKlrCvZXMLtIrvA\",\n" +
                "                    \"width\": 5904\n" +
                "                }\n" +
                "            ],\n" +
                "            \"place_id\": \"ChIJh_24QJ-AhYAR_xbUNVN2Xns\",\n" +
                "            \"price_level\": 3,\n" +
                "            \"rating\": 4.7,\n" +
                "            \"reference\": \"CmRRAAAA0XMPCbVrKpVwnkom3EIbqmcTu5OKpQGtiuA8YkdeINoP-BDNaNUdH6kqrZSwr4GXfGjC5EnT1EgwIbczikzhO4v2Mjkg00-L9UyqgY6pTwVGON_9VFb4AxCPIWo3CCEsEhD3u5tv3EDKHcCgOh3FpxROGhRgchN5ZhWumasBr8XO-6ZrXCilPA\",\n" +
                "            \"scope\": \"GOOGLE\",\n" +
                "            \"types\": [\n" +
                "                \"bar\",\n" +
                "                \"restaurant\",\n" +
                "                \"food\",\n" +
                "                \"point_of_interest\",\n" +
                "                \"establishment\"\n" +
                "            ],\n" +
                "            \"vicinity\": \"199 Gough Street, San Francisco\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"status\": \"OK\"\n" +
                "}";
    }

    public static String getRestaurantDetail() {
        return "{\n" +
                "    \"html_attributions\": [],\n" +
                "    \"result\": {\n" +
                "        \"address_components\": [\n" +
                "            {\n" +
                "                \"long_name\": \"1658\",\n" +
                "                \"short_name\": \"1658\",\n" +
                "                \"types\": [\n" +
                "                    \"street_number\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"long_name\": \"Market Street\",\n" +
                "                \"short_name\": \"Market St\",\n" +
                "                \"types\": [\n" +
                "                    \"route\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"long_name\": \"Civic Center\",\n" +
                "                \"short_name\": \"Civic Center\",\n" +
                "                \"types\": [\n" +
                "                    \"neighborhood\",\n" +
                "                    \"political\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"long_name\": \"San Francisco\",\n" +
                "                \"short_name\": \"SF\",\n" +
                "                \"types\": [\n" +
                "                    \"locality\",\n" +
                "                    \"political\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"long_name\": \"San Francisco County\",\n" +
                "                \"short_name\": \"San Francisco County\",\n" +
                "                \"types\": [\n" +
                "                    \"administrative_area_level_2\",\n" +
                "                    \"political\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"long_name\": \"California\",\n" +
                "                \"short_name\": \"CA\",\n" +
                "                \"types\": [\n" +
                "                    \"administrative_area_level_1\",\n" +
                "                    \"political\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"long_name\": \"United States\",\n" +
                "                \"short_name\": \"US\",\n" +
                "                \"types\": [\n" +
                "                    \"country\",\n" +
                "                    \"political\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"long_name\": \"94102\",\n" +
                "                \"short_name\": \"94102\",\n" +
                "                \"types\": [\n" +
                "                    \"postal_code\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"long_name\": \"5949\",\n" +
                "                \"short_name\": \"5949\",\n" +
                "                \"types\": [\n" +
                "                    \"postal_code_suffix\"\n" +
                "                ]\n" +
                "            }\n" +
                "        ],\n" +
                "        \"adr_address\": \"<span class=\\\"street-address\\\">1658 Market St</span>, <span class=\\\"locality\\\">San Francisco</span>, <span class=\\\"region\\\">CA</span> <span class=\\\"postal-code\\\">94102-5949</span>, <span class=\\\"country-name\\\">USA</span>\",\n" +
                "        \"formatted_address\": \"1658 Market St, San Francisco, CA 94102, USA\",\n" +
                "        \"formatted_phone_number\": \"(415) 552-2522\",\n" +
                "        \"geometry\": {\n" +
                "            \"location\": {\n" +
                "                \"lat\": 37.7736262,\n" +
                "                \"lng\": -122.421645\n" +
                "            },\n" +
                "            \"viewport\": {\n" +
                "                \"northeast\": {\n" +
                "                    \"lat\": 37.7749218302915,\n" +
                "                    \"lng\": -122.4202280697085\n" +
                "                },\n" +
                "                \"southwest\": {\n" +
                "                    \"lat\": 37.7722238697085,\n" +
                "                    \"lng\": -122.4229260302915\n" +
                "                }\n" +
                "            }\n" +
                "        },\n" +
                "        \"icon\": \"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png\",\n" +
                "        \"id\": \"112226e5b074c6d767041d2761863c550d8a5f26\",\n" +
                "        \"international_phone_number\": \"+1 415-552-2522\",\n" +
                "        \"name\": \"Zuni Café.\",\n" +
                "        \"opening_hours\": {\n" +
                "            \"open_now\": true,\n" +
                "            \"periods\": [\n" +
                "                {\n" +
                "                    \"close\": {\n" +
                "                        \"day\": 0,\n" +
                "                        \"time\": \"2300\"\n" +
                "                    },\n" +
                "                    \"open\": {\n" +
                "                        \"day\": 0,\n" +
                "                        \"time\": \"1100\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"close\": {\n" +
                "                        \"day\": 2,\n" +
                "                        \"time\": \"2300\"\n" +
                "                    },\n" +
                "                    \"open\": {\n" +
                "                        \"day\": 2,\n" +
                "                        \"time\": \"1130\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"close\": {\n" +
                "                        \"day\": 3,\n" +
                "                        \"time\": \"2300\"\n" +
                "                    },\n" +
                "                    \"open\": {\n" +
                "                        \"day\": 3,\n" +
                "                        \"time\": \"1130\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"close\": {\n" +
                "                        \"day\": 4,\n" +
                "                        \"time\": \"2300\"\n" +
                "                    },\n" +
                "                    \"open\": {\n" +
                "                        \"day\": 4,\n" +
                "                        \"time\": \"1130\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"close\": {\n" +
                "                        \"day\": 6,\n" +
                "                        \"time\": \"0000\"\n" +
                "                    },\n" +
                "                    \"open\": {\n" +
                "                        \"day\": 5,\n" +
                "                        \"time\": \"1130\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"close\": {\n" +
                "                        \"day\": 0,\n" +
                "                        \"time\": \"0000\"\n" +
                "                    },\n" +
                "                    \"open\": {\n" +
                "                        \"day\": 6,\n" +
                "                        \"time\": \"1130\"\n" +
                "                    }\n" +
                "                }\n" +
                "            ],\n" +
                "            \"weekday_text\": [\n" +
                "                \"Monday: Closed\",\n" +
                "                \"Tuesday: 11:30 AM – 11:00 PM\",\n" +
                "                \"Wednesday: 11:30 AM – 11:00 PM\",\n" +
                "                \"Thursday: 11:30 AM – 11:00 PM\",\n" +
                "                \"Friday: 11:30 AM – 12:00 AM\",\n" +
                "                \"Saturday: 11:30 AM – 12:00 AM\",\n" +
                "                \"Sunday: 11:00 AM – 11:00 PM\"\n" +
                "            ]\n" +
                "        },\n" +
                "        \"photos\": [\n" +
                "            {\n" +
                "                \"height\": 3120,\n" +
                "                \"html_attributions\": [\n" +
                "                    \"<a href=\\\"https://maps.google.com/maps/contrib/108535967119249136387/photos\\\">Ayres D&#39;Souza</a>\"\n" +
                "                ],\n" +
                "                \"photo_reference\": \"CmRaAAAA8P-zbd9FKaq7ARa1FgtHzGTlROjCgCRJRC2qI2uJJO9S2UJ6uLommmdw9OJ5RBecOSOVUt_6CJ-bDinDJXjVks2CIqdtUbSd_GgNOfhJPHrPtxwWtRJVpceIjDLk4UgJEhBrv9GZwwJS7S1hzWykozdYGhQOgI8Choqdy9mNOEvR4BhPc3RIPg\",\n" +
                "                \"width\": 4160\n" +
                "            },\n" +
                "            {\n" +
                "                \"height\": 4048,\n" +
                "                \"html_attributions\": [\n" +
                "                    \"<a href=\\\"https://maps.google.com/maps/contrib/113929798602570450550/photos\\\">Ilya Bakulin</a>\"\n" +
                "                ],\n" +
                "                \"photo_reference\": \"CmRaAAAAQGEmXBJ8vBC4P9tJlpl-zwd7TzALRS7iUlGKWXQ-EKti2aWVC_XNd3kZ7fyqlKcb7qIcsMnJXZ85pXfTljjqVSCBLLZILvkDdEPr1voNcYK1w-C1OX1gHYsUZm_q5CL4EhCBn61UyTQN3-n3FuUZXEJRGhS7a9QQseZz9TVPfKaeURz9CgQsug\",\n" +
                "                \"width\": 3036\n" +
                "            },\n" +
                "            {\n" +
                "                \"height\": 2988,\n" +
                "                \"html_attributions\": [\n" +
                "                    \"<a href=\\\"https://maps.google.com/maps/contrib/106507141827531594729/photos\\\">Tammi Kwan</a>\"\n" +
                "                ],\n" +
                "                \"photo_reference\": \"CmRaAAAAU7qWrNr5KoIbADLQF-FFPhFMKza76hCKmgDdWQT0vzkBDGLk2OukSISIX4YJOLAp5oDthM_vxfXbmzz5_2en9Uk-4_Fg69HwPLNbxcPqhV5PlKTjr3llYG4p0EhBhyCPEhDGkXxw9fJQdhBCO_g6tK-gGhSKvTFGQ1nllaZjFAzylnfPtEmECA\",\n" +
                "                \"width\": 5312\n" +
                "            },\n" +
                "            {\n" +
                "                \"height\": 5312,\n" +
                "                \"html_attributions\": [\n" +
                "                    \"<a href=\\\"https://maps.google.com/maps/contrib/109840983040922467781/photos\\\">Jayme Taylor</a>\"\n" +
                "                ],\n" +
                "                \"photo_reference\": \"CmRaAAAAiiWttVbRnVudAtE-DW5LkMu7sbxE5LHyv8LWIMtDFsKxKjGIZ5RPW50MR0KXesnzEMNrjwOSzQZ7npyokJAZsxz7iTWpdPzWwX6pA2vGPE9blI3TCX29kT3y8EvTz4wlEhCBcX3l8BY9LHOgGV-bFY5NGhTgMRLtkGb5YDtbDDrZaLZjF581kw\",\n" +
                "                \"width\": 2988\n" +
                "            },\n" +
                "            {\n" +
                "                \"height\": 3096,\n" +
                "                \"html_attributions\": [\n" +
                "                    \"<a href=\\\"https://maps.google.com/maps/contrib/107721404123505875377/photos\\\">Albert L.</a>\"\n" +
                "                ],\n" +
                "                \"photo_reference\": \"CmRaAAAA7sSAkIXC8KXE3SWkKjeiBUywqzkw2GeSIUVogkH8AhaekCm9dig79JoNNz17TiZxCeveaupIuSaYGrEGJ1BqRZdg0DDLBqE416jqpAoxvQNuSJPNO4_DZCBC4JLLvKOXEhBFP9fKzev0o-U_6Q7e47sMGhSJfUJY3Vl9M7rpOgCmx4TimU2s1w\",\n" +
                "                \"width\": 4128\n" +
                "            },\n" +
                "            {\n" +
                "                \"height\": 1184,\n" +
                "                \"html_attributions\": [\n" +
                "                    \"<a href=\\\"https://maps.google.com/maps/contrib/110585852016475339665/photos\\\">Maryam Mossavar</a>\"\n" +
                "                ],\n" +
                "                \"photo_reference\": \"CmRaAAAAjiCZrdDy2p8Y4CCI1IHlTJrtnAXIhCKYfp8oVUbBsc710F4y3YsDQWnfM3VUhBc0GkcfyDPIfZoi9E7L1YpTk-QHyDM4yS8BmnXl5_Wbw18KO6pWWhpshR4eznzkEqfnEhB_ZUG1-XQfMdKSkyzmZFgDGhSTrc-JStzYwwOqcVfpAR3DFLYcow\",\n" +
                "                \"width\": 1776\n" +
                "            },\n" +
                "            {\n" +
                "                \"height\": 1080,\n" +
                "                \"html_attributions\": [\n" +
                "                    \"<a href=\\\"https://maps.google.com/maps/contrib/109866022054893931945/photos\\\">Gregory Whitescarver</a>\"\n" +
                "                ],\n" +
                "                \"photo_reference\": \"CmRaAAAAlt_0aNCCrXv5sCPT6-jwW9Ey4L4D6gWUWVUr-oukamX5hn5W2oKMSb_vRB9jCxx_hzNbTUouLMBYRXkyhsHZXefyZfQA5G7t3FeD__8aWP7DK2n4_aqZBgNWHwkPI8kNEhBW3zgJiTdRAxc77lHgEalzGhQk4hkgTJP0a0eHZvjmgKwkBxAKqg\",\n" +
                "                \"width\": 1794\n" +
                "            },\n" +
                "            {\n" +
                "                \"height\": 1802,\n" +
                "                \"html_attributions\": [\n" +
                "                    \"<a href=\\\"https://maps.google.com/maps/contrib/117951099792078560322/photos\\\">Nancy Littlefield</a>\"\n" +
                "                ],\n" +
                "                \"photo_reference\": \"CmRaAAAAUS6Ot303FdKYKYhEv3vwVw2aCz_LmEt72ECxdqiYNdsVC67D5YmDekjnxz1GFj-vG7adfTIMdR9EBejItwH39p3-SsTaFP9Fhqa79lVcpeItWTvkNuuAqlP5baUjflf9EhBLDVYzvs6ArEsz_3ku9VreGhQAhyGewyYcRvd9JS01k0Ve3Djb1w\",\n" +
                "                \"width\": 1802\n" +
                "            },\n" +
                "            {\n" +
                "                \"height\": 4032,\n" +
                "                \"html_attributions\": [\n" +
                "                    \"<a href=\\\"https://maps.google.com/maps/contrib/106591771507477944320/photos\\\">Frans van Eersel</a>\"\n" +
                "                ],\n" +
                "                \"photo_reference\": \"CmRaAAAAhLiHbqOWTG5O0qiC13O_DUn8kH9B9jFtw9OPKbj0KLgvlOrVHigB3Wgnn6ltSLcIIaoNwycCazBkcqoKdWGo4GpqGhgqJboYb5Zjz0vILyA7VqQp3REY0eAzThcfcuZxEhANIOEv4Fp4lZch7GORQ7EgGhRZG8fCpU1JRh69IOvrDr2WAR8QuA\",\n" +
                "                \"width\": 3024\n" +
                "            },\n" +
                "            {\n" +
                "                \"height\": 2988,\n" +
                "                \"html_attributions\": [\n" +
                "                    \"<a href=\\\"https://maps.google.com/maps/contrib/106274568630433836070/photos\\\">Gary Ogawa</a>\"\n" +
                "                ],\n" +
                "                \"photo_reference\": \"CmRaAAAA-tPX1UmjLUXce7E1s-NOUWv5QeCGKeGY33u_Qvo22hijXIey3aKxy0hOoIfcOZuW-elLcZhZqCTuBXCQXfYTSKmP3aTnbjc8V3uNkE4hdetjkGULM4zJcDDPkWmPBAnAEhA75b_RTmy5EIudiQpvLfGqGhTk_O244Rd01msqXjj89N4vOK-O9Q\",\n" +
                "                \"width\": 5312\n" +
                "            }\n" +
                "        ],\n" +
                "        \"place_id\": \"ChIJO7u9q5-AhYARiSSXyWv9eJ8\",\n" +
                "        \"price_level\": 3,\n" +
                "        \"rating\": 4.1,\n" +
                "        \"reference\": \"CmRSAAAAw-0mfrzYa__ixVCBodtf38WrfrE6N9C8yuKFq1uiXE2wE5vlbGyj_0PmIHSNLP4YXMqGNGB9Mhq2R6jPEP-ayIN17vNpvQDLGRFVN9H4WO-pJMxSj-nkFR4cC4UldvknEhBa8q9GMmdUtG1MEOja6R_vGhTgHxUhGtCGgXlOT5Jkmag92HypRw\",\n" +
                "        \"reviews\": [\n" +
                "            {\n" +
                "                \"author_name\": \"Michelle Vu\",\n" +
                "                \"author_url\": \"https://www.google.com/maps/contrib/109659877433698396678/reviews\",\n" +
                "                \"language\": \"en\",\n" +
                "                \"profile_photo_url\": \"https://lh3.googleusercontent.com/-XbHClCJDyGI/AAAAAAAAAAI/AAAAAAAAJUc/g5mlEzGJkJY/s128-c0x00000000-cc-rp-mo-ba3/photo.jpg\",\n" +
                "                \"rating\": 4,\n" +
                "                \"relative_time_description\": \"2 weeks ago\",\n" +
                "                \"text\": \"We had dinner here with another couple and without a doubt went in for the infamous chicken. We started the meal with some appetizers for the table, but were disappointed on the servings. The chicken was good, but it wasn't the best chicken I have had in the city... In general it was a good dinner, but nothing noteworthy to mention.\",\n" +
                "                \"time\": 1505853918\n" +
                "            },\n" +
                "            {\n" +
                "                \"author_name\": \"Kathryn Amenta\",\n" +
                "                \"author_url\": \"https://www.google.com/maps/contrib/100474073368820426377/reviews\",\n" +
                "                \"language\": \"en\",\n" +
                "                \"profile_photo_url\": \"https://lh4.googleusercontent.com/-ZWxYWq_msVw/AAAAAAAAAAI/AAAAAAAAAAA/ACnBePborNNsbkWTVa5egFL9ialGRVlA8Q/s128-c0x00000000-cc-rp-mo/photo.jpg\",\n" +
                "                \"rating\": 1,\n" +
                "                \"relative_time_description\": \"4 weeks ago\",\n" +
                "                \"text\": \"Zuni Cafe used to be one of my FAVORITE go-to restaurants in San Francisco.  No more!!  The hostess and waiter were rude and snooty.  My friend and I asked to be seated outside - and were - at a 4-top. Moments later, the manager came out and looked down his nose at us and wanted to know if we had just walked off the street and seated ourselves at this table.  He walked away when we told him the hostess had seated us there.  My friend ordered a dirty martini.  There was NOTHING dirty about it and my friend said it was horrible.  I told our server that we wanted to have a quick drink and a quick app bc we were on our way to a meeting.  He sneered at me and said that would not be possible as Zuni is not that kind of restaurant.  When we were leaving, my friend (who is a chef) asked for the manager's business card and was told there were no cards available.  GET OVER YOURSELVES ALREADY!!  You've lost a long-time guest and there are soooo many other, better restaurants in SF that I highly recommend people look elsewhere for a more original menu and staff that WANT to serve their guests.\",\n" +
                "                \"time\": 1504818423\n" +
                "            },\n" +
                "            {\n" +
                "                \"author_name\": \"Chris McMahon\",\n" +
                "                \"author_url\": \"https://www.google.com/maps/contrib/111775135072954154903/reviews\",\n" +
                "                \"language\": \"en\",\n" +
                "                \"profile_photo_url\": \"https://lh5.googleusercontent.com/-StQi40b9iM8/AAAAAAAAAAI/AAAAAAAAAIY/MJBSkZr6tns/s128-c0x00000000-cc-rp-mo-ba4/photo.jpg\",\n" +
                "                \"rating\": 4,\n" +
                "                \"relative_time_description\": \"6 months ago\",\n" +
                "                \"text\": \"The food and service is excellent. Full bar and simply a wonderful place to eat, watch the world go by and hang with friends and colleagues. The fried chicken is outstanding but you have to order it ahead of time due to the preparation. The staff is young and professional and engage you nicely. By SF standards it is on the expensive side but well worth it for the quality you get, especially for a special occasion. I would have given them 5 stars but for one horrendous issue. They stopped serving Coke or Pepsi and now schlep some gross \\\"locally sourced\\\" boutique cola (per the waiter). But label says NY!!! But they do get to charge $5 for it. :(\\nI now always try to go buy a Coke across the street at the little market and bring it with me....and make a point of asking for a glass of ice for it in Zuni. Please bring Coke back and stop trying to be foodie PC.\",\n" +
                "                \"time\": 1491626744\n" +
                "            },\n" +
                "            {\n" +
                "                \"author_name\": \"Ali Hussain\",\n" +
                "                \"author_url\": \"https://www.google.com/maps/contrib/106876341356531238542/reviews\",\n" +
                "                \"language\": \"en\",\n" +
                "                \"profile_photo_url\": \"https://lh4.googleusercontent.com/-VuFYlqEv_9A/AAAAAAAAAAI/AAAAAAAAAAA/ACnBePa2rdnV4CyAFTlamGmrR4QDjlxn7w/s128-c0x00000000-cc-rp-mo/photo.jpg\",\n" +
                "                \"rating\": 3,\n" +
                "                \"relative_time_description\": \"2 weeks ago\",\n" +
                "                \"text\": \"My experience for this place was OK. We had to make reservations a few weeks in advance and came because of the reviews for the roast chicken.  Firstly, I think you should know that that's a dish for 3- 4 people, not 2, which actually makes it a pretty decent value. Other thing is that this place is packed. Service is fairly slow and the roast chicken (as disclosed) takes a full 60 minutes to make. I felt at the end that the experience was not bad, just not the worth the cost and time spent.\",\n" +
                "                \"time\": 1506031971\n" +
                "            },\n" +
                "            {\n" +
                "                \"author_name\": \"Fabien Curto Millet\",\n" +
                "                \"author_url\": \"https://www.google.com/maps/contrib/113731609127846485889/reviews\",\n" +
                "                \"language\": \"en\",\n" +
                "                \"profile_photo_url\": \"https://lh5.googleusercontent.com/-OozN6X4x1qc/AAAAAAAAAAI/AAAAAAAAKtw/Dp131dXjF8k/s128-c0x00000000-cc-rp-mo-ba5/photo.jpg\",\n" +
                "                \"rating\": 5,\n" +
                "                \"relative_time_description\": \"5 months ago\",\n" +
                "                \"text\": \"A San Francisco institution, and my favorite restaurant in the city by some margin. The place is unpretentious, but you can tell the the staff are proud of what they do and united in a mission to deliver an excellent culinary experience every time. The food is superb - excellent ingredients prepared just right, and without unnecessary complications. The drinks menu is extensive and the cocktails are great. The staff are friendly and professional. The place is always vibrant. First class.\",\n" +
                "                \"time\": 1494196468\n" +
                "            }\n" +
                "        ],\n" +
                "        \"scope\": \"GOOGLE\",\n" +
                "        \"types\": [\n" +
                "            \"bar\",\n" +
                "            \"restaurant\",\n" +
                "            \"food\",\n" +
                "            \"point_of_interest\",\n" +
                "            \"establishment\"\n" +
                "        ],\n" +
                "        \"url\": \"https://maps.google.com/?cid=11491213088621274249\",\n" +
                "        \"utc_offset\": -420,\n" +
                "        \"vicinity\": \"1658 Market Street, San Francisco\",\n" +
                "        \"website\": \"http://www.zunicafe.com/\"\n" +
                "    },\n" +
                "    \"status\": \"OK\"\n" +
                "}";
    }

    public static String getNoResultsResponse() {
        return "{\n" +
                "    \"html_attributions\": [],\n" +
                "    \"results\": [],\n" +
                "    \"status\": \"ZERO_RESULTS\"\n" +
                "}";
    }
}
