package Modelutilisateur;

public class Utilisateur {
	
	
	private int id;
	private String lastName;
	private String firstName;
	private String adress;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

public String toJSON()
{    
    StringBuffer sb = new StringBuffer();

    sb.append("{");
    sb.append("id:").append(id).append(",\n");
    sb.append("\"firstName\":\"").append(firstName).append("\",\n");
    sb.append("\"lastName:\"").append(lastName).append("\",\n");
    sb.append("\"adress:\"").append(adress).append("\"\n");
    sb.append("}");
    
    return sb.toString();        
}
 //sinon 
public String toXML()
{
    StringBuffer sb = new StringBuffer();
    
    sb.append("<user>\n");
    
    sb.append("\t<id>");
    sb.append("\t\t" + id + "\n");
    sb.append("\t</id>\n");
    
    sb.append("\t<firstName>\n");
    sb.append("\t\t" + firstName + "\n");
    sb.append("\t</firstName>\n");
    
    sb.append("\t<lastName>\n");
    sb.append("\t\t" + lastName + "\n");
    sb.append("\t</lastName>\n");
    
    sb.append("\t<address>\n");
    sb.append("\t\t" + adress + "\n");
    sb.append("\t</adress>\n");
    
    sb.append("</user>");
    
    return sb.toString();
    
}

}
