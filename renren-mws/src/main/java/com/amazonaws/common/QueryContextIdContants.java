package com.amazonaws.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * queryContextId常量
 * 
 * @author Administrator
 *
 */
public class QueryContextIdContants {

	public static Map<String, List<String>> QUERY_CONTEXT_MAP = new HashMap<>();
	public static List<String> CANADA = new ArrayList<>();
	public static List<String> US = new ArrayList<>();
	static {
		CANADA.add("Books");
		CANADA.add("Classical");
		CANADA.add("DVD");
		CANADA.add("Electronics");
		CANADA.add("ForeignBooks");
		CANADA.add("Kitchen");
		CANADA.add("Music");
		CANADA.add("Software");
		CANADA.add("VHS");
		CANADA.add("Video");
		CANADA.add("VideoGames");
		QUERY_CONTEXT_MAP.put(Contants.MARKETPLACE_ID_CA, CANADA);

		US.add("Apparel");
		US.add("Appliances");
		US.add("ArtsAndCrafts");
		US.add("Automotive");
		US.add("Baby");
		US.add("Beauty");
		US.add("Books");
		US.add("Classical");
		US.add("DigitalMusic");
		US.add("DVD");
		US.add("HomeGarden");
		US.add("Industrial");
		US.add("Electronics");
		US.add("Grocery");
		US.add("HealthPersonalCare");
		US.add("Home");
		US.add("Jewelry");
		US.add("KindleStore");
		US.add("Kitchen");
		US.add("Magazines");
		US.add("Miscellaneous");
		US.add("MobileApps");
		US.add("MP3Downloads");
		US.add("MusicalInstruments");
		US.add("OfficeProducts");
		US.add("PCHardware");
		US.add("PetSupplies");
		US.add("Misc");
		US.add("Music");
		US.add("OfficeProducts");
		US.add("Photo");
		US.add("Shoes");
		US.add("Software");
		US.add("SportingGoods");
		US.add("Toys");
		US.add("Tools");
		US.add("UnboxVideo");
		US.add("VHS");
		US.add("Video");
		US.add("VideoGames");
		US.add("Watches");
		US.add("Wireless");
		QUERY_CONTEXT_MAP.put(Contants.MARKETPLACE_ID_US, US);
	}

	public static List<String> getQueryContextByMarket(String marketpalce) {
		return QUERY_CONTEXT_MAP.get(marketpalce);
	}

}
