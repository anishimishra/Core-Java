package locale;

import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale l = Locale.getDefault();
		System.out.println(l.getCountry() + " " + l.getLanguage());
		System.out.println(l.getDisplayCountry() + " " + l.getDisplayLanguage());
		Locale.setDefault(Locale.UK);
		System.out.println(Locale.getDefault().getDisplayCountry());
		String[] isoCountries = Locale.getISOCountries();
		for (String country : isoCountries) {
			System.out.print(country + " ");
		}
		System.out.println();
		String[] languages = Locale.getISOLanguages();
		for (String lang : languages) {
			System.out.print(lang + " ");
		}
		System.out.println();
	}

}
