package com.codewars.kata_6kyu;

public class CreditCardIssuer {

	private static final String CARD_TYPE_UNKNOWN = "Unknown";
	private static String[] PREFIX_AMEX = { "34", "37" };
	private static String[] PREFIX_MC = { "51", "52", "53", "54", "55" };
	private static String[] PREFIX_DISCOVER = { "6011" };

	
	private static boolean beginsWith(String[] initialNumbersList, String cardNumber) {

		for (String s : initialNumbersList) {
			if (cardNumber.startsWith(s))
				return true;
		}

		return false;
	}

	public static String getIssuer(String cardNumber) {

		// prendre le premier charact�re
		// switch sur le premier
		// v�rif des autres requis
		String typeCarte = CARD_TYPE_UNKNOWN;
		char premierChiffre = cardNumber.charAt(0);
		int longueurNumero = cardNumber.length();

		System.out.println(premierChiffre);

		switch (premierChiffre) {

		case '3':
			if (beginsWith(PREFIX_AMEX, cardNumber) && longueurNumero == 15)
				typeCarte = "AMEX";
		case '4':
			if (longueurNumero == 13 || longueurNumero == 16)
				typeCarte = "VISA";
		case '5':
			if (beginsWith(PREFIX_MC, cardNumber) && longueurNumero == 16)
				typeCarte = "Mastercard";
		case '6':
			if (beginsWith(PREFIX_DISCOVER, cardNumber))
				typeCarte = "Discover";
		}

		return typeCarte;
	}

}
