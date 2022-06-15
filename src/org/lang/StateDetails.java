package org.lang;

public class StateDetails {
private void southIndia() {
	System.out.println("South India");

}
private void northIndia() {
	System.out.println("North India");

}
public static void main(String args[])
{
	LanguageInfo lan = new LanguageInfo();
	lan.tamilLanguage();
	lan.englishLanguage();
	lan.hindiLanguage();
	StateDetails sd = new StateDetails();
	sd.southIndia();
	sd.northIndia();
	
}
}
