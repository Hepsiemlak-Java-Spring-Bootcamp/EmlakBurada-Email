package emlakburada.service;

public class EmailContentBuilder {
	
	private static String template = "<p>Hoş geldin ${user},</p>\n" ;
	
	private EmailContentBuilder() {
		
	}
	
	public static String build(String userName) {
		return template.replaceAll("\\$\\{*user\\}", userName.split("@")[0]);
	}

}
